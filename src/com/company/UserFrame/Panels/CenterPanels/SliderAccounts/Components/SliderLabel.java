package com.company.UserFrame.Panels.CenterPanels.SliderAccounts.Components;

import com.company.ColorSystem.SystemColors;
import com.company.StaticSettings.FontSettings;

import javax.swing.*;
import java.awt.*;

public class SliderLabel extends JLabel implements SliderLabelSettings, FontSettings {

    public SliderLabel(String text){
        createLabel(text);
    }

    private void createLabel(String text) {
        this.setHorizontalAlignment(horizontalTextPosition);
        this.setVerticalAlignment(verticalTextPosition);
        this.setText(text);
        this.setPreferredSize(new Dimension(textFieldWidth, textFieldHeight));
        this.setOpaque(true);
        this.setVisible(true);
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setBorder(BorderFactory.createMatteBorder(topBorder, leftBorder, bottomBorder, rightBorder, borderColor));
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
    }
}
