package com.company.userPanel.MenuBar.MenuOptions;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.userPanel.MenuBar.MenuPositions;

import javax.swing.*;
import java.awt.*;

public class AccountsMenuOption extends JMenu implements MenuPositions {
    public AccountsMenuOption() {
        this.setText("Accounts");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(SystemColors.textColor);
        this.add(addAccount);
        this.add(deleteAccount);
        this.add(changePasswordAccount);
        this.add(showAccount);
    }
}