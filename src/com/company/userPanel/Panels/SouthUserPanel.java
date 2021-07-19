package com.company.userPanel.Panels;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.systemActions.SystemActions;
import com.company.userPanel.UserPanelElements;

import javax.swing.*;
import java.awt.*;

public class SouthUserPanel extends JPanel implements UserPanelElements {
    public SouthUserPanel(){
        buttonListeners();
        this.setPreferredSize(new Dimension(1050, 120));
        this.setLayout(new FlowLayout());
        this.add(logOutButton);
        this.setBackground(SystemColors.backgroundColor);
        this.setOpaque(true);
    }

    private void buttonListeners(){
        logOutButton.addActionListener(e -> SystemActions.logout());
    }
}
