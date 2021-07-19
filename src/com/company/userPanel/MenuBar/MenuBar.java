package com.company.userPanel.MenuBar;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar implements MenuPositions {
    public MenuBar(){
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, FlowLayout.CENTER));
        this.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.DARK_GRAY));
        this.setPreferredSize(new Dimension(100, 50));
        this.add(user);
        this.add(accounts);
        this.add(settings);
        this.add(information);
    }
}
