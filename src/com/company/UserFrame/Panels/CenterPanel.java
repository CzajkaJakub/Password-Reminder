package com.company.UserFrame.Panels;

import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;


public class CenterPanel extends JLayeredPane {

    public CenterPanel(){
        panelSettings();
    }

    private void panelSettings() {
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        this.setOpaque(true);
    }


    public void switchPanels(JPanel currentPanel){
        this.removeAll();
        this.add(currentPanel);
        this.repaint();
        this.revalidate();
    }
}
