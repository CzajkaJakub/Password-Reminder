package com.company.UserFrame.MenuBar;

import com.company.UserFrame.MenuBar.MenuOptions.*;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar implements BarSettings {

    public UserMenuOption user;
    public AccountsMenuOption accounts;
    public SettingsMenuOption settings;
    public InformationMenuOption information;

    public MenuBar(){
        createBarElements();
        barSettings();
    }

    @Override
    public void barSettings() {
        this.setLayout(new FlowLayout(displayBarType, horizontalBarGap, displayBarType));
        this.setBorder(BorderFactory.createMatteBorder(topBorder, leftBorder, bottomBorder, rightBorder, borderColor));
        this.setPreferredSize(new Dimension(barWidth, barHeight));
        this.setBackground(SystemColors.getBackgroundColor());
        this.add(user);
        this.add(accounts);
        this.add(settings);
        this.add(information);
    }

    @Override
    public void createBarElements() {
        user = new UserMenuOption();
        accounts = new AccountsMenuOption();
        settings = new SettingsMenuOption();
        information = new InformationMenuOption();
    }


}
