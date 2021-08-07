package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.UserFrame.UserData;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class UserMenuOption extends JMenu implements BarElementsSettings {

    private JMenuItem profileUser;
    private JMenuItem imageUser;
    private JMenuItem deleteUser;
    private JMenuItem changePasswordUser;

    public UserMenuOption(){
        createBarElements();
        barSettings();
    }

    @Override
    public void createBarElements() {
        profileUser = new JMenuItem("Profile");
        imageUser = new JMenuItem("Set your profile image");
        deleteUser = new JMenuItem("Delete Account");
        changePasswordUser = new JMenuItem("Change Password");
    }

    @Override
    public void barSettings() {
        this.setText("User");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(SystemColors.textColor);
        this.add(profileUser);
        this.add(imageUser);
        this.add(deleteUser);
        this.add(changePasswordUser);
    }

    @Override
    public void addListeners() {

    }
}
