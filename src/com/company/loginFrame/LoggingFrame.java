package com.company.loginFrame;

import com.company.loginFrame.FramePanels.CenterPanel;
import com.company.loginFrame.FramePanels.NorthPanel;
import com.company.loginFrame.FramePanels.SouthPanel;
import com.company.loginFrame.LoginPasswordTextFields.LoggingPanel;
import com.company.systemActions.SystemActions;
import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;

import javax.swing.*;
import java.awt.*;

public class LoggingFrame extends JFrame {

    private NorthPanel northPanel;
    private CenterPanel centerPanel;
    private SouthPanel southPanel ;
    private final ImageIcon imageIcon = new ImageIcon("src/images/programIcon.png");

    public LoggingFrame(){
        createPanels();
        frameSettings();
    }

    private void createPanels() {
        northPanel = new NorthPanel();
        centerPanel = new CenterPanel();
        southPanel = new SouthPanel();
    }

    private void frameSettings(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(750, 750));
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setIconImage(imageIcon.getImage());
        this.setTitle("Password Reminder");
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void tryToLogin(){
        String login = LoggingPanel.loginTextField.getText();
        String password = LoggingPanel.passwordTextField.getText();
        String encryptedLogin = Cypher.encryptData(login, EncryptTypes.USER_LOGIN);
        String encryptedPassword = Cypher.encryptData(password, EncryptTypes.USER_PASSWORD);
        SystemActions.logInSystem(encryptedLogin, encryptedPassword);
    }

    public static void registerNewUser(){
        String login = LoggingPanel.loginTextField.getText();
        String password = LoggingPanel.passwordTextField.getText();
        SystemActions.registerNewUser(login, password);
    }

}
