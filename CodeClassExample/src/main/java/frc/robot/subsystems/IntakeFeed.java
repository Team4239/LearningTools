package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeFeed extends SubsystemBase {

  private final TalonFX mFeedMotor = new TalonFX(Constants.INTAKE_MOTOR_FEED);
  
  public IntakeFeed() {
    mFeedMotor.setInverted(false);
    mFeedMotor.setNeutralMode(NeutralModeValue.Coast);
  }

  @Override
  public void periodic() {}

  public void setFeedMotorSpeed(double speed) {
    mFeedMotor.set(speed);
  }

  public void stopMotor() {
    mFeedMotor.set(0);
  }
}