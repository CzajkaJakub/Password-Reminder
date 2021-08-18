package com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.PanelElements;


import com.company.LoggingFrame.LoggingFrameSettings;
import com.company.GlobalSettings.FontSettings;
import com.company.ColorSystem.SystemColors;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.company.Main.loggingFrame;


public class RegisterCheckBox extends JCheckBox implements LoggingFrameSettings, FontSettings, MouseListener {

    private int registerMarked = 0;

    int checkBoxWidth = 275;
    int checkBoxHeight = 100;


    public RegisterCheckBox(String text){
        this.setText(text);
        this.addActionListener(e->checkRegistration());
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setPreferredSize(new Dimension(checkBoxWidth, checkBoxHeight));
        this.setBackground(SystemColors.getBackgroundColor());
        this.setForeground(SystemColors.getTextColor());
        this.setIcon(registerNoIcon);
        this.setFocusable(false);
        this.addMouseListener(this);
    }


    public void checkRegistration(){
        if(registerMarked == 1){
            registerMarked = 0;
            this.setIcon(registerNoIcon);
            loggingFrame.southPanel.logInButton.setVisible(true);
            loggingFrame.southPanel.registerButton.setVisible(false);
        }else{
            registerMarked = 1;
            this.setIcon(registerYesIcon);
            loggingFrame.southPanel.logInButton.setVisible(false);
            loggingFrame.southPanel.registerButton.setVisible(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setForeground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setForeground(SystemColors.getTextColor());
    }
}

