package com.company.loginFrame.FramePanels;

import com.company.loginFrame.LoginPasswordTextFields.LoggingPanel;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;


public class CenterPanel extends JPanel {
    private static LoggingPanel loggingPanel;

    public CenterPanel(){
        createPanels();
        frameSettings();
    }

    private void frameSettings() {
        this.setPreferredSize(new Dimension(100, 250));
        this.add(loggingPanel);
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
        this.setOpaque(true);
    }

    private void createPanels() {
        loggingPanel = new LoggingPanel();
    }
}
