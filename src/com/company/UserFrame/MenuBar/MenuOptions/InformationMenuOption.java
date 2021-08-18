package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.ColorSystem.SystemColors;
import com.company.InformationSystem.InformationSystem;

import javax.swing.*;
import java.awt.*;

public class InformationMenuOption extends JMenu implements BarElementsSettings {

    private JMenuItem aboutInformation;

    public InformationMenuOption() {
        barSettings();
        createItemsIcons();
        createBarElements();
    }


    public void createBarElements() {
        this.setText(fourthBarElement);
        this.setIcon(informationIcon);
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setForeground(SystemColors.getTextColor());
        this.add(aboutInformation);
    }

    private void createItemsIcons() {
        aboutInformation.setIcon(informationBarElementIcon);
    }

    public void barSettings() {
        aboutInformation = new JMenuItem(information);
    }

    public void addListeners() {
        aboutInformation.addActionListener(e-> InformationSystem.readInformationFromFile());
    }
}