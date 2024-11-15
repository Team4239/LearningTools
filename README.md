# LearningTools
Tools for the upcoming coding class Nov. 25, 2024.

# FRC Programming Setup Guide

Hey guys! Team 4239, Willmar Area Robotics here. 
Below, we have listed a few required downloads for the upcoming class on Monday as well as a quick explanation of each program.
By the end, you should have installed and setup WPILIB, VS Code, FRC Gametools, and GitHub.

The official FRC software installation guide can be found [here](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/index.html).

---

## 1. Install WPILib / Visual Studio

WPILib provides libraries and tools needed for programming in the FRC environment.

1. Download the WPILib installer by clicking [here](https://frcmaven.wpi.edu/api/download/installer/v2024.3.2/Win64/WPILib_Windows-2024.3.2.iso).
2. For an in depth guide, click [this](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/wpilib-setup.html).
3. After installation, you should have a version of Visual Studio installed on your computer.

---

## 2. Install FRC Game Tools

The FRC Game Tools package includes essential software for communicating with the FRC control system.

1. Download FRC Game Tools from [National Instruments](https://www.ni.com/en-us/support/downloads/drivers/download.frc-game-tools.html).
2. Run the installer and follow the instructions to complete the installation.
3. After installation, you should have the FRC Driver Station and a few other software tools installed on your computer.

---

## 3. Install GitHub and Hook Your Repository

GitHub is used for version control and collaboration in FRC. Setting up a repository allows you to save and share your code with your team.

1. Install GitHub Desktop:
   - Download from [GitHub Desktop](https://desktop.github.com/).
   - Log in to your GitHub account.
2. Clone or initialize a repository:
   - Open GitHub Desktop and click **File > Clone Repository** if you’re cloning an existing one.
   - To create a new repository, select **File > New Repository**.
3. Link your local repository with GitHub:
   - In VS Code, open the integrated terminal.
   - Run the following commands to link your local folder to the remote GitHub repository:

   ```bash
   git init
   git remote add origin https://github.com/your-username/your-repo-name.git
   git add .
   git commit -m "Initial commit"
   git push -u origin main
   ```

5. Your repository is now linked, and any future code changes can be managed with Git.

---

## Conclusion

Well, hopefully everything has gone well. 
If not, we are always open to questions at warpspeed@willmar.org
If that doesn't work, you can also try our emails at oswood44@gmail.com & miguelgarc5605@gmail.com
You should be prepared for the upcoming class; We look forward to seeing you there!

Thanks again for reading through the file, 
   Miguel Garcia
   Vince Hawktoah
   Sam Oswood
