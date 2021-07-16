package com.company.userPanel.MenuBar.MenuOptions;

import com.company.userPanel.MenuBar.MenuPositions;

import javax.swing.*;
import java.awt.*;

public class SettingsMenuOption extends JMenu implements MenuPositions {
    public SettingsMenuOption() {
        this.setText("Settings");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(Color.WHITE);
        this.add(changeColorSettings);
    }
}