package com.company;

import javax.swing.*;
import java.awt.*;

public class LoggingFrame extends JFrame implements ImagesFiles, LoggingPanels, TextFields, Buttons {
    LoggingFrame(){
        setPanels();
        frameSettings();
    }

    private void frameSettings(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(750, 750));
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setTitle("Password Reminder");
        this.add(northLogPane, BorderLayout.NORTH);
        this.add(centerLogPane, BorderLayout.CENTER);
        this.add(southLogPane, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    private void setPanels(){
        setNorthPanel();
        setCenterPanel();
        setSouthPanel();
    }

    private void setNorthPanel(){
        northLogPane.add(new ImageLabel(passwordReminderImage));
    }

    private void setCenterPanel(){
        centerLogPane.add(loginField);
        centerLogPane.add(passwordField);
    }

    private void setSouthPanel(){
        logInButton.addActionListener(e->tryToLogin());
        southLogPane.add(logInButton);
        registerButton.addActionListener(e->registerNewUser());
        southLogPane.add(registerButton);
    }

    private void tryToLogin(){
        String login = loginField.getText();
        String password = passwordField.getText();
        SystemActions.logInSystem(login, password);
    }

    private void registerNewUser(){
        SystemActions.registerNewUser();
    }
}
