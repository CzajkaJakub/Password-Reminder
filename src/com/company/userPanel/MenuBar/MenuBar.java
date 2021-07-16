package com.company.userPanel.MenuBar;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar implements MenuPositions {
    public MenuBar(){
        this.setBackground(Color.BLACK);
        this.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.DARK_GRAY));
        this.setPreferredSize(new Dimension(100, 30));

        this.add(user);
        this.add(accounts);
        this.add(settings);
        this.add(information);
    }
}
