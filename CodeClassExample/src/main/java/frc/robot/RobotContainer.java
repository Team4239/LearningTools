package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.IntakePivotSetPosition;
import frc.robot.commands.IntakePivotSetSpeed;
import frc.robot.commands.IntakeSetFeedMotorSpeed;
import frc.robot.commands.ShooterSetSpeed;
import frc.robot.subsystems.IntakeFeed;
import frc.robot.subsystems.IntakePivot;
import frc.robot.subsystems.Shooter;

public class RobotContainer {

  private final CommandXboxController mXboxController = new CommandXboxController(Constants.XBOX_CONTROLLER);

  private final IntakeFeed mIntakeFeed = new IntakeFeed();
  private final IntakePivot mIntakePivot = new IntakePivot();
  private final Shooter mShooter = new Shooter();

  public RobotContainer() {

    mIntakeFeed.setDefaultCommand(new IntakeSetFeedMotorSpeed(mIntakeFeed, 0.0));
    mIntakePivot.setDefaultCommand(new IntakePivotSetSpeed(mIntakePivot, 0.0));
    mShooter.setDefaultCommand(new ShooterSetSpeed(mShooter, 0.0, 0.0));

    configureBindings();
  }

  private void configureBindings() {

    //mXboxController.rightBumper().whileTrue(new IntakePivotSetPosition(mIntakePivot, -38.0, -0.4));
    //mXboxController.leftBumper().whileTrue(new IntakePivotSetPosition(mIntakePivot, -1.0, 0.3));
    //mXboxController.leftTrigger().whileTrue(new IntakeSetFeedMotorSpeed(mIntakeFeed, -1.0));
    //mXboxController.rightTrigger().whileTrue(new IntakeSetFeedMotorSpeed(mIntakeFeed, 1.0));
    mXboxController.a().whileTrue(new IntakePivotSetSpeed(mIntakePivot, -0.03));
    mXboxController.y().whileTrue(new ShooterSetSpeed(mShooter, 0.44, 0.4));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}