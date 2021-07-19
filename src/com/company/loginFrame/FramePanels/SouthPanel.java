package com.company.loginFrame.FramePanels;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.loginFrame.LoggingFrame;
import com.company.loginFrame.LoginFrameElements;

import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel implements LoginFrameElements {
    public SouthPanel(){
        setButtonsActions();
        this.setPreferredSize(new Dimension(100, 180));
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 60));
        this.setOpaque(true);
        this.add(logInButton);
        this.add(registerButton);
    }

    public void setButtonsActions(){
        logInButton.addActionListener(e-> LoggingFrame.tryToLogin());
        registerButton.setVisible(false);
        registerButton.addActionListener(e->LoggingFrame.registerNewUser());
    }
}
