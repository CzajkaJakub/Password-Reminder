package com.company;

import javax.swing.*;
import java.awt.*;

public class LoggingFrame extends JFrame implements ImagesFiles, Labels, TextFields, Buttons {

    LoggingFrame(){
        setPanels();
        frameSettings();
    }

    private void frameSettings(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(750, 500));
        this.setLayout(new GridLayout(3, 1, 0, 0));
        this.setResizable(true);
        this.setTitle("Password Reminder");
        this.add(northLogPane);
        this.add(centerLogPane);
        this.add(southLogPane);
        this.setVisible(true);
    }

    private void setPanels(){
        setNorthPanel();
        setCenterPanel();
        setSouthPanel();
    }

    private void setNorthPanel(){
        northLogPane.setIcon(passwordReminderImage);
    }

    private void setCenterPanel(){
        centerLogPane.add(loginField);
        centerLogPane.add(passwordField);

    }

    private void setSouthPanel(){
        logInButton.addActionListener(e->tryToLogin());
        southLogPane.add(logInButton);
    }

    private void tryToLogin(){
        String login = loginField.getText();
        String password = passwordField.getText();
        Main.logInSystem(login, password);
    }
}
