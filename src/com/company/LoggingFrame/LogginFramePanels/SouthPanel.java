package com.company.LoggingFrame.LogginFramePanels;

import com.company.Elements.SubmitButtonIcon;
import com.company.LoggingFrame.LogRegisterSystem.LoggingSystem;
import com.company.LoggingFrame.LogRegisterSystem.RegisterSystem;
import com.company.LoggingFrame.LoggingFrameSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;


public class SouthPanel extends JPanel implements LoggingFrameSettings {

    public static SubmitButtonIcon logInButton = new SubmitButtonIcon(logInImage, 140, 64);
    public static SubmitButtonIcon registerButton = new SubmitButtonIcon(registerImage, 199, 67);

    int panelWidth = 100;
    int panelHeight = 180;
    int layoutElementsPosition = FlowLayout.CENTER;
    int layoutHorizontalGap = 50;
    int layoutVerticalGap = 60;

    public SouthPanel(){
        panelSettings();
    }


    public void panelSettings() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(layoutElementsPosition, layoutHorizontalGap, layoutVerticalGap));
        this.setOpaque(true);
        this.add(logInButton);
        this.add(registerButton);
    }


    public static void setButtonsActions(){
        logInButton.addActionListener(e-> LoggingSystem.tryToLogin());
        registerButton.setVisible(false);
        registerButton.addActionListener(e-> RegisterSystem.registerNewUser());
    }

}
