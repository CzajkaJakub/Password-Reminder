package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.UserFrame.MenuBar.BarFunctions;
import com.company.UserFrame.UserDataSystem.UserData;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;


public class UserMenuOption extends JMenu implements BarElementsSettings {

    private JMenuItem profileUser;
    private JMenuItem imageUser;

    public UserMenuOption(){
        createBarElements();
        barSettings();
    }


    public void createBarElements() {
        profileUser = new JMenuItem(showProfile);
        imageUser = new JMenuItem(setProfileImage);
    }

    public void barSettings() {
        this.setText(secondBarElement);
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setForeground(SystemColors.textColor);
        this.add(profileUser);
        this.add(imageUser);
    }


    public void addListeners(UserData data) {
        profileUser.addActionListener(e-> BarFunctions.showProfilePanel(data));
        imageUser.addActionListener(e-> BarFunctions.changeProfileImage(data));
    }
}
