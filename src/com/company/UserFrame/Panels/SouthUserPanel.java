package com.company.UserFrame.Panels;

import com.company.Components.StylizedJButton;
import com.company.systemActions.ColorSystem.SystemColors;
import com.company.systemActions.SystemActions;

import javax.swing.*;
import java.awt.*;


public class SouthUserPanel extends JPanel{

    ImageIcon logOutImage;
    StylizedJButton logOutButton;

    public SouthUserPanel(){
        createElements();
        buttonListeners();
        this.setPreferredSize(new Dimension(1050, 120));
        this.setLayout(new FlowLayout());
        this.add(logOutButton);
        this.setBackground(SystemColors.backgroundColor);
        this.setOpaque(true);
    }

    private void createElements() {
        logOutImage = new ImageIcon("src/images/logOut.png");
        logOutButton = new StylizedJButton(logOutImage, 283, 77);
    }

    private void buttonListeners(){
        logOutButton.addActionListener(e -> SystemActions.logout());
    }

}
