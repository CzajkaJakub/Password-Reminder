package com.company.LoggingFrame.LogginFramePanels;

import com.company.CommonElements.SubmitButtonIcon;
import com.company.LoggingFrame.LogRegisterSystem.LoggingSystem;
import com.company.LoggingFrame.LogRegisterSystem.RegisterSystem;
import com.company.LoggingFrame.LoggingFrameSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;


public class SouthPanel extends JPanel implements LoggingFrameSettings {

    public SubmitButtonIcon logInButton;
    public SubmitButtonIcon registerButton;

    int panelWidth = 100;
    int panelHeight = 180;
    int layoutElementsPosition = FlowLayout.CENTER;
    int layoutHorizontalGap = 50;
    int layoutVerticalGap = 60;

    public SouthPanel(){
        createElements();
        setButtonsActions();
        panelSettings();
    }


    public void panelSettings() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(SystemColors.getBackgroundColor());
        this.setLayout(new FlowLayout(layoutElementsPosition, layoutHorizontalGap, layoutVerticalGap));
        this.setOpaque(true);
        this.add(logInButton);
        this.add(registerButton);
    }

    private void createElements() {
        logInButton = new SubmitButtonIcon(logInImage, 140, 64);
        registerButton = new SubmitButtonIcon(registerImage, 199, 67);
    }


    public void setButtonsActions(){
        logInButton.addActionListener(e-> LoggingSystem.tryToLogin());
        registerButton.addActionListener(e-> RegisterSystem.registerNewUser());
        registerButton.setVisible(false);
    }

}
