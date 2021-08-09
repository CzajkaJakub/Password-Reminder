package com.company.loginFrame.FramePanels;

import com.company.Components.StylizedJButton;
import com.company.UserFrame.Panels.CenterPanels.PanelMethods;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

import static com.company.loginFrame.LoggingFrame.registerNewUser;
import static com.company.loginFrame.LoggingFrame.tryToLogin;

public class SouthPanel extends JPanel implements PanelsCreation {

    public SouthPanel(){
        createElements();
        panelSettings();
    }


    @Override
    public void panelSettings() {
        this.setPreferredSize(new Dimension(100, 180));
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 60));
        this.setOpaque(true);
        this.add(logInButton);
        this.add(registerButton);
    }

    @Override
    public void createElements() {
    }


    public static void setButtonsActions(){
        logInButton.addActionListener(e-> tryToLogin());
        registerButton.setVisible(false);
        registerButton.addActionListener(e->registerNewUser());
    }

}
