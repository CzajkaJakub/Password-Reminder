package com.company.userPanel.MenuBar.MenuOptions;



import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.userPanel.MenuBar.MenuPositions;

import javax.swing.*;
import java.awt.*;

import static com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors.changeBackgroundColor;
import static com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors.changeTextColor;


public class SettingsMenuOption extends JMenu implements MenuPositions {
    public SettingsMenuOption() {
        this.setText("Settings");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(SystemColors.textColor);
        this.add(changeBackgroundColorSettings);
        this.add(changeTextColorSettings);
        addListeners();
    }

    public void addListeners(){
        changeBackgroundColorSettings.addActionListener(e->changeBackgroundColor());
        changeTextColorSettings.addActionListener(e->changeTextColor());
    }

}