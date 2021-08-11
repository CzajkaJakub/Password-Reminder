package com.company.UserFrame.Panels.CenterPanels.SliderAccounts.Components;

import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class AccountsSlider extends JSlider implements SliderLabelSettings {

    public AccountsSlider(int sliderLength){
        createSlider(sliderLength);
    }

    public void createSlider(int sliderLength){
        this.setPreferredSize(new Dimension(sliderWidth, sliderHeight));
        this.setOpaque(true);
        this.setVisible(true);
        this.setPaintTicks(true);
        this.setMaximum(sliderLength - 1);
        this.setMinimum(0);
        this.setValue(0);
        this.setMajorTickSpacing(1);
        this.setPaintTrack(true);
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);

    }
}

