package com.company.userPanel;

import com.company.ImageLabel;
import com.company.systemActions.SystemActions;

import javax.swing.*;
import java.awt.*;

public class SouthUserPanel extends JPanel implements UserPanelElements{
    SouthUserPanel(){
        buttonListeners();
        this.setPreferredSize(new Dimension(100, 80));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.add(logOutButton);
        this.setBackground(Color.RED);
        this.setOpaque(true);
    }

    private void buttonListeners(){
        logOutButton.addActionListener(e -> SystemActions.logout());
    }
}
