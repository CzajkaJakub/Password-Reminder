package com.company.UserFrame.Panels;

import com.company.Elements.SubmitButtonIcon;
import com.company.ColorSystem.SystemColors;
import com.company.UserFrame.UserDataSystem.LogoutSystem;

import javax.swing.*;
import java.awt.*;


public class SouthUserPanel extends JPanel implements PanelsSettings{

    ImageIcon logOutImage;
    SubmitButtonIcon logOutButton;

    public SouthUserPanel(){
        createElements();
        buttonListeners();
        this.setPreferredSize(new Dimension(southPanelWidth, southPanelHeight));
        this.setLayout(new FlowLayout());
        this.add(logOutButton);
        this.setBackground(SystemColors.backgroundColor);
        this.setOpaque(true);
    }


    private void createElements() {
        logOutImage = new ImageIcon(logoutIconPath);
        logOutButton = new SubmitButtonIcon(logOutImage, 283, 77);
    }


    private void buttonListeners(){
        logOutButton.addActionListener(e -> LogoutSystem.logout());
    }

}
