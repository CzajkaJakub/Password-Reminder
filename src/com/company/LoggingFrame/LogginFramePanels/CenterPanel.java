package com.company.LoggingFrame.LogginFramePanels;

import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.LoggingPanel;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    private static LoggingPanel loggingPanel;

    int layoutElementsPosition = FlowLayout.CENTER;
    int loggingPanelWidth = 100;
    int loggingPanelHeight = 250;
    int layoutHorizontalGap = 50;
    int layoutVerticalGap = 0;

    public CenterPanel(){
        createElements();
        panelSettings();
    }

    public void panelSettings() {
        this.setPreferredSize(new Dimension(loggingPanelWidth, loggingPanelHeight));
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(layoutElementsPosition, layoutHorizontalGap, layoutVerticalGap));
        this.add(loggingPanel);
        this.setOpaque(true);
    }

    public void createElements() {
        loggingPanel = new LoggingPanel();
    }
}
