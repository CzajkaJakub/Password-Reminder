package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.systemActions.ColorSystem.SystemColors;
import com.company.systemActions.InformationSystem.InformationSystem;

import javax.swing.*;
import java.awt.*;

public class InformationMenuOption extends JMenu implements BarElementsSettings{

    private JMenuItem aboutInformation;

    public InformationMenuOption() {
        barSettings();
        createBarElements();
        addListeners();
    }


    @Override
    public void createBarElements() {
        this.setText("Information");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(SystemColors.textColor);
        this.add(aboutInformation);
    }

    @Override
    public void barSettings() {
        aboutInformation = new JMenuItem("About program");
    }

    @Override
    public void addListeners() {
        aboutInformation.addActionListener(e-> InformationSystem.readInformation());
    }
}