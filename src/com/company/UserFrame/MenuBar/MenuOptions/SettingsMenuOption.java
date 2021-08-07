package com.company.UserFrame.MenuBar.MenuOptions;


import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;

import java.awt.*;

import static com.company.systemActions.ColorSystem.SystemColors.changeBackgroundColor;
import static com.company.systemActions.ColorSystem.SystemColors.changeTextColor;


public class SettingsMenuOption extends JMenu implements BarElementsSettings{

    private JMenuItem changeBackgroundColorSettings;
    private JMenuItem changeTextColorSettings;


    public SettingsMenuOption() {
        createBarElements();
        barSettings();
    }


    @Override
    public void createBarElements() {
        changeBackgroundColorSettings = new JMenuItem("Change background color");
        changeTextColorSettings = new JMenuItem("Change text color");
    }

    @Override
    public void barSettings() {
        this.setText("Settings");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(SystemColors.textColor);
        this.add(changeBackgroundColorSettings);
        this.add(changeTextColorSettings);
    }

    @Override
    public void addListeners() {
        changeBackgroundColorSettings.addActionListener(e->changeBackgroundColor());
        changeTextColorSettings.addActionListener(e->changeTextColor());
    }
}