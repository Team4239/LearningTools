# LearningTools
Tools for the upcoming coding class Nov. 25, 2024.

# FRC Programming Setup Guide

Welcome! This guide will walk you through the steps to set up the essential tools for programming your FRC robot, including WPILib, Visual Studio Code (VS Code), FRC Game Tools, and GitHub. By the end, you’ll have your environment ready and be able to hook your repository with GitHub.

---

## 1. Install WPILib

WPILib provides libraries and tools needed for programming in the FRC environment.

1. Download the WPILib installer from the [official WPILib website]([https://wpilib.org/downloads](https://frcmaven.wpi.edu/api/download/installer/v2024.3.2/Win64/WPILib_Windows-2024.3.2.iso)).
2. Run the installer and follow the prompts. Make sure to select **"Add desktop icons"** if you want easy access.

   ![WPILib Installation](https://link-to-wpilib-image.png)

3. After installation, launch WPILib to confirm it’s working correctly. You’ll see options for creating new projects, opening examples, and configuring your setup.

---

## 2. Install Visual Studio Code (VS Code)

Visual Studio Code is the main code editor used for FRC development.

1. Download the installer for [Visual Studio Code](https://code.visualstudio.com/).
2. Run the installer and complete the installation steps.
3. Install the WPILib extension for VS Code:
   - Open VS Code.
   - Go to **Extensions** (or press `Ctrl+Shift+X`).
   - Search for **WPILib** and install the extension.

   ![Install WPILib in VS Code](https://link-to-vscode-extension-image.png)

4. Restart VS Code after installation.

---

## 3. Install FRC Game Tools

The FRC Game Tools package includes essential software for communicating with the FRC control system.

1. Download FRC Game Tools from [National Instruments](https://www.ni.com/en-us/support/downloads/drivers/download.frc-game-tools.html).
2. Run the installer and follow the instructions to complete the installation.
3. After installation, ensure you have the latest updates by running the **NI Package Manager**.

   ![FRC Game Tools Installation](https://link-to-game-tools-image.png)

---

## 4. Install GitHub and Hook Your Repository

GitHub is used for version control and collaboration in FRC. Setting up a repository allows you to save and share your code with your team.

1. Install Git:
   - Download the installer from [Git for Windows](https://git-scm.com/download/win).
   - Follow the installation steps.
2. Install GitHub Desktop (optional for GUI management):
   - Download from [GitHub Desktop](https://desktop.github.com/).
   - Log in to your GitHub account.
3. Clone or initialize a repository:
   - Open GitHub Desktop and click **File > Clone Repository** if you’re cloning an existing one.
   - To create a new repository, select **File > New Repository**.
4. Link your local repository with GitHub:
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

You’re all set up to start programming! If you encounter any issues, refer to the documentation for each tool, or reach out to your mentors. Happy coding and best of luck with your FRC season!
