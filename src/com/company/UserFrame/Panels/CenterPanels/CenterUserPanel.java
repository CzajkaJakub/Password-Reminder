package com.company.UserFrame.Panels.CenterPanels;

import com.company.Components.ImageLabel;
import com.company.UserFrame.UserData;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class CenterUserPanel extends JPanel {

    private ImageIcon profileImage;

    public CenterUserPanel(UserData userData){
        createElements();
        panelSettings(userData);
    }

    private void createElements() {
        profileImage = new ImageIcon("src/images/profileImage.png");
    }

    public void panelSettings(UserData userData){
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 50));
        this.setBackground(SystemColors.backgroundColor);
        this.setOpaque(true);
        this.add(new ImageLabel(profileImage));
        this.setVisible(true);
    }
}
