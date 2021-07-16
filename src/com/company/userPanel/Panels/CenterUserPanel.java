package com.company.userPanel.Panels;

import com.company.userPanel.UserPanelElements;

import javax.swing.*;
import java.awt.*;

public class CenterUserPanel extends JPanel implements UserPanelElements {
    public CenterUserPanel(){
        this.setLayout(new FlowLayout());
        this.setBackground(Color.BLACK);
        this.setOpaque(true);
    }
}
