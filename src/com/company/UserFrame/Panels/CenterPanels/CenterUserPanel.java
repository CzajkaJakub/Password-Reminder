package com.company.UserFrame.Panels.CenterPanels;

import com.company.Components.ImageLabel;
import com.company.UserFrame.Panels.CenterPanel;
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
        this.setBackground(Color.black);
        this.setOpaque(true);
        this.setVisible(false);
        this.add(new ImageLabel(profileImage));
    }

}
