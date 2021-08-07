package com.company.loginFrame.FramePanels;

import com.company.Components.ImageLabel;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {

    private static final ImageIcon passwordReminderImage = new ImageIcon("src/images/passwordReminder.png");

    public NorthPanel(){
        this.setPreferredSize(new Dimension(100, 250));
        this.add(new ImageLabel(passwordReminderImage));
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 60));
        this.setOpaque(true);
    }
}
