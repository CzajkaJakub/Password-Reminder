package com.company.loginFrame.LoginPasswordTextFields;

import com.company.loginFrame.LoginPasswordTextFields.PanelElements.LoggingField;
import com.company.loginFrame.LoginPasswordTextFields.PanelElements.PasswordField;
import com.company.loginFrame.LoginPasswordTextFields.PanelElements.RegisterCheckBox;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class LoggingPanel extends JPanel {

    public static LoggingField loginTextField;
    public static PasswordField passwordTextField;
    public static RegisterCheckBox registerCheckBox;

    public LoggingPanel(){
        createFields();
        frameSettings();
    }

    private void frameSettings() {
        this.setPreferredSize(new Dimension(450, 300));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 20));
        this.setBackground(SystemColors.backgroundColor);
        this.add(loginTextField);
        this.add(passwordTextField);
        this.add(registerCheckBox);
    }

    private void createFields() {
        loginTextField = new LoggingField("Login");
        passwordTextField = new PasswordField("Password");
        registerCheckBox = new RegisterCheckBox();
    }


}
