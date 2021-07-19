package com.company.loginFrame.LoginPasswordTextFields;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.loginFrame.LoginFrameElements;

import javax.swing.*;
import java.awt.*;

public class LoggingPanel extends JPanel implements LoginFrameElements {
    public LoggingPanel(){
        this.setPreferredSize(new Dimension(450, 300));
        this.setLayout(new FlowLayout(0, 0, 20));
        this.setBackground(SystemColors.backgroundColor);
        this.add(loginTextField);
        this.add(passwordTextField);
        this.add(registerCheckBox);
    }
}
