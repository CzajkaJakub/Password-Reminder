package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.ColorSystem.SystemColors;
import com.company.InformationSystem.InformationSystem;

import javax.swing.*;
import java.awt.*;

public class InformationMenuOption extends JMenu implements BarElementsSettings{

    private JMenuItem aboutInformation;

    public InformationMenuOption() {
        barSettings();
        createBarElements();
    }


    public void createBarElements() {
        this.setText(fourthBarElement);
        this.setIcon(informationIcon);
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setForeground(SystemColors.textColor);
        this.add(aboutInformation);
    }

    public void barSettings() {
        aboutInformation = new JMenuItem(information);
    }

    public void addListeners() {
        aboutInformation.addActionListener(e-> InformationSystem.readInformation());
    }
}