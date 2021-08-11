package com.company.LoggingFrame.LogginFramePanels;

import com.company.Elements.ImageLabel;
import com.company.StaticSettings.StaticImages;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel implements StaticImages {

    int panelWidth = 100;
    int panelHeight = 250;
    int layoutElementsPosition = FlowLayout.CENTER;
    int layoutHorizontalGap = 50;
    int layoutVerticalGap = 60;

    public NorthPanel(){
        panelSettings();
    }

    public void panelSettings() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.add(new ImageLabel(passwordReminderImage));
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(layoutElementsPosition, layoutHorizontalGap, layoutVerticalGap));
        this.setOpaque(true);
    }
}
