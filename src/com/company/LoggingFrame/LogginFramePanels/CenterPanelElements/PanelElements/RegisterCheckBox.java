package com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.PanelElements;

import com.company.LoggingFrame.LogginFramePanels.SouthPanel;
import com.company.LoggingFrame.LoggingFrameSettings;
import com.company.StaticSettings.FontSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class RegisterCheckBox extends JCheckBox implements LoggingFrameSettings, FontSettings {

    private static int registerMarked = 0;

    int checkBoxWidth = 275;
    int checkBoxHeight = 100;


    public RegisterCheckBox(String text){
        this.setText(text);
        this.addActionListener(e->checkRegistration());
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setPreferredSize(new Dimension(checkBoxWidth, checkBoxHeight));
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
        this.setIcon(registerNoIcon);
        this.setFocusable(false);
    }


    public void checkRegistration(){
        if(registerMarked == 1){
            registerMarked = 0;
            this.setIcon(registerNoIcon);
            SouthPanel.logInButton.setVisible(true);
            SouthPanel.registerButton.setVisible(false);
        }else{
            registerMarked = 1;
            this.setIcon(registerYesIcon);
            SouthPanel.logInButton.setVisible(false);
            SouthPanel.registerButton.setVisible(true);
        }
    }
}

