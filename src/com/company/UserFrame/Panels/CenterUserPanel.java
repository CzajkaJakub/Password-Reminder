package com.company.UserFrame.Panels;

import com.company.Components.ImageLabel;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class CenterUserPanel extends JPanel {

    private ImageIcon profileImage;


    public CenterUserPanel(){
        createElements();
        panelSettings();
    }

    private void createElements() {
        profileImage = new ImageIcon("src/images/profileImage.png");
    }

    public void panelSettings(){
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10000, 50));
        this.setBackground(SystemColors.backgroundColor);
        this.setOpaque(true);
        this.add(new ImageLabel(profileImage));
    }

}
