package com.company.LoggingFrame.LogginFramePanels;

import com.company.CommonElements.ImageLabel;
import com.company.GlobalSettings.GlobalImages;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel implements GlobalImages {

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
        this.setBackground(SystemColors.getBackgroundColor());
        this.setLayout(new FlowLayout(layoutElementsPosition, layoutHorizontalGap, layoutVerticalGap));
        this.setOpaque(true);
    }
}
