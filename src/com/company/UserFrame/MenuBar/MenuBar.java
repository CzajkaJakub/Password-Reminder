package com.company.UserFrame.MenuBar;

import com.company.UserFrame.MenuBar.MenuOptions.*;
import com.company.systemActions.ColorSystem.SystemColors;

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
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, FlowLayout.CENTER));
        this.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.DARK_GRAY));
        this.setPreferredSize(new Dimension(100, 50));
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
