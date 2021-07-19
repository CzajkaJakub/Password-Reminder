package com.company.userPanel.MenuBar.MenuOptions;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.userPanel.MenuBar.MenuPositions;

import javax.swing.*;
import java.awt.*;

public class UserMenuOption extends JMenu implements MenuPositions {
    public UserMenuOption(){
        this.setText("User");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(SystemColors.textColor);
        this.add(profileUser);
        this.add(imageUser);
        this.add(deleteUser);
        this.add(changePasswordUser);
    }
}
