package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components;

import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;

public class AccountsSlider extends JSlider implements ChangeListener {


    public AccountsSlider(int sliderLength){
        createSlider(sliderLength);
    }

    public void createSlider(int sliderLength){
        this.setPreferredSize(new Dimension(600, 50));
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


    @Override
    public void stateChanged(ChangeEvent e) {

    }
}

