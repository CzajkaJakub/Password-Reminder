package com.company.LoggingFrame.LogginFramePanels.CenterPanelElements;

import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.PanelElements.LoggingField;
import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.PanelElements.PasswordField;
import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.PanelElements.RegisterCheckBox;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class LoggingPanel extends JPanel implements LoggingPanelSettings {

    public static LoggingField loginTextField;
    public static PasswordField passwordTextField;
    public static RegisterCheckBox registerCheckBox;


    public LoggingPanel(){
        createElements();
        frameSettings();
    }


    private void frameSettings() {
        this.setPreferredSize(new Dimension(loggingPanelWidth, loggingPanelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(SystemColors.backgroundColor);
        this.add(loginTextField);
        this.add(passwordTextField);
        this.add(registerCheckBox);
    }


    private void createElements() {
        loginTextField = new LoggingField(loginFieldText);
        passwordTextField = new PasswordField(passwordFieldText);
        registerCheckBox = new RegisterCheckBox(registerBoxText);
    }


}
