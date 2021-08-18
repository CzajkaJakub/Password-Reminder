package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.ColorSystem.SystemColors;

import javax.swing.*;

import java.awt.*;

import static com.company.ColorSystem.SystemColors.changeBackgroundColor;
import static com.company.ColorSystem.SystemColors.changeTextColor;


public class SettingsMenuOption extends JMenu implements BarElementsSettings{

    private JMenuItem changeBackgroundColorSettings;
    private JMenuItem changeTextColorSettings;


    public SettingsMenuOption() {
        createBarElements();
        createItemsIcons();
        barSettings();
    }


    public void createBarElements() {
        changeBackgroundColorSettings = new JMenuItem(backgroundChanger);
        changeTextColorSettings = new JMenuItem(textChanger);
    }

    private void createItemsIcons() {
        changeBackgroundColorSettings.setIcon(backgroundColorIcon);
        changeTextColorSettings.setIcon(textColorIcon);
    }

    public void barSettings() {
        this.setText(thirdBarElement);
        this.setIcon(settingsIcon);
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setForeground(SystemColors.getTextColor());
        this.add(changeBackgroundColorSettings);
        this.add(changeTextColorSettings);
    }

    public void addListeners() {
        changeBackgroundColorSettings.addActionListener(e->changeBackgroundColor());
        changeTextColorSettings.addActionListener(e->changeTextColor());
    }
}