package com.company.userPanel;

import com.company.ImageLabel;

import javax.swing.*;
import java.awt.*;

public class NorthUserPanel extends JPanel implements UserPanelElements{
    NorthUserPanel(){
        this.setPreferredSize(new Dimension(100, 100));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setBackground(Color.BLACK);
        this.setOpaque(true);
        this.add(new ImageLabel(passwordReminderImage));
    }
}
