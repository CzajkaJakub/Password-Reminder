package com.company.loginFrame.FramePanels;

import com.company.loginFrame.LoginPasswordTextFields.LoggingPanel;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;


public class CenterPanel extends JPanel implements PanelsCreation {
    private static LoggingPanel loggingPanel;

    public CenterPanel(){
        createElements();
        panelSettings();
    }

    @Override
    public void panelSettings() {
        this.setPreferredSize(new Dimension(100, 250));
        this.add(loggingPanel);
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
        this.setOpaque(true);
    }

    @Override
    public void createElements() {
        loggingPanel = new LoggingPanel();
    }
}
