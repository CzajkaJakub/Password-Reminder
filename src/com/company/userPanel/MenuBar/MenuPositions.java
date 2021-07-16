package com.company.userPanel.MenuBar;

import com.company.userPanel.MenuBar.MenuOptions.AccountsMenuOption;
import com.company.userPanel.MenuBar.MenuOptions.InformationMenuOption;
import com.company.userPanel.MenuBar.MenuOptions.SettingsMenuOption;
import com.company.userPanel.MenuBar.MenuOptions.UserMenuOption;

import javax.swing.*;

public interface MenuPositions {

    JMenuItem profileUser = new JMenuItem("Profile");
    JMenuItem imageUser = new JMenuItem("Set your profile image");
    JMenuItem deleteUser = new JMenuItem("Delete Account");
    JMenuItem changePasswordUser = new JMenuItem("Change Password");

    JMenuItem addAccount = new JMenuItem("Add Account");
    JMenuItem deleteAccount = new JMenuItem("Delete Account");
    JMenuItem changePasswordAccount = new JMenuItem("Change Password of your accounts");
    JMenuItem showAccount = new JMenuItem("Show all of your accounts");

    JMenuItem changeColorSettings = new JMenuItem("Change color");

    JMenuItem aboutInformation = new JMenuItem("About program");

    UserMenuOption user = new UserMenuOption();
    AccountsMenuOption accounts = new AccountsMenuOption();
    SettingsMenuOption settings = new SettingsMenuOption();
    InformationMenuOption information = new InformationMenuOption();

}
