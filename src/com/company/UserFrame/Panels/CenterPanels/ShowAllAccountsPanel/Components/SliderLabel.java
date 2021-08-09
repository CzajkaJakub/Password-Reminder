package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components;

import com.company.systemActions.ColorSystem.SystemColors;
import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;

public class SliderLabel extends JLabel {

    public SliderLabel(String text){
        createLabel(text);
    }

    private void createLabel(String text) {
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setText(text);
        this.setPreferredSize(new Dimension(600, 70));
        this.setOpaque(true);
        this.setVisible(true);
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.red));
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
    }




}
