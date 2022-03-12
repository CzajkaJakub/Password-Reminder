package com.company.UserFrame.UserFrame;

import com.company.ColorSystem.SystemColors;
import com.company.GlobalSettings.FrameSettings;
import com.company.UserFrame.MenuBar.BarFunctions;
import com.company.UserFrame.MenuBar.MenuBar;
import com.company.UserFrame.Panels.CenterPanel;
import com.company.UserFrame.Panels.CenterPanels.ProfilePanel.CenterUserPanel;
import com.company.UserFrame.Panels.SouthUserPanel;
import com.company.UserFrame.UserDataSystem.SaveDataUser;
import com.company.UserFrame.UserDataSystem.SaveLoginData;
import com.company.UserFrame.UserDataSystem.UserData;
import com.company.UserFrame.UserDataSystem.ReadUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.company.Main.userFrame;


public class UserFrame extends JFrame implements FrameSettings {

    public MenuBar userMenuBar;
    public SouthUserPanel southUserPanel;
    public CenterPanel centerPanel;

    UserData userData;

    int userPanelWidth = 1100;
    int loggingPanelHeight = 900;
    String programTitle = "Password reminder - User panel: ";


    public UserFrame(String login, String password) {
        userData = ReadUser.readUserData(login, password);
        UserFrameWelcomeMessage.welcomeMessage(userData.getDecryptedLogin());
        SaveLoginData.saveLoginHistory(userData.getUserPath());
        createPanels();
        frameSettings();
        addBarListeners();
    }


    private void createPanels() {
        userMenuBar = new MenuBar();
        southUserPanel = new SouthUserPanel();
        centerPanel = new CenterPanel();
    }


    private void frameSettings(){
        this.setDefaultCloseOperation(defaultOperationOnClose);
        this.setMinimumSize(new Dimension(userPanelWidth, loggingPanelHeight));
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setIconImage(programIcon);
        this.setTitle(programTitle + userData.getDecryptedLogin());
        this.add(southUserPanel, BorderLayout.SOUTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.setJMenuBar(userMenuBar);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                SaveDataUser.saveUser(userData);
                SystemColors.saveColorsToFile();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                SaveDataUser.saveUser(userData);
                SystemColors.saveColorsToFile();
            }
        });
    }


    private void addBarListeners() {
        userMenuBar.accounts.addListeners(userData);
        userMenuBar.user.addListeners(userData);
        userMenuBar.settings.addListeners();
        userMenuBar.information.addListeners();
    }
}
