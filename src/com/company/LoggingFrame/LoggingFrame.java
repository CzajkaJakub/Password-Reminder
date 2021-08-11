package com.company.LoggingFrame;

import com.company.LoggingFrame.LogginFramePanels.CenterPanel;
import com.company.LoggingFrame.LogginFramePanels.NorthPanel;
import com.company.LoggingFrame.LogginFramePanels.SouthPanel;
import com.company.StaticSettings.FrameSettings;
import com.company.StaticSettings.StaticImages;

import javax.swing.*;
import java.awt.*;

public class LoggingFrame extends JFrame implements StaticImages, FrameSettings, LoggingFrameSettings {

    private NorthPanel northPanel;
    private CenterPanel centerPanel;
    private SouthPanel southPanel ;


    public LoggingFrame(){
        createPanels();
        frameSettings();
    }


    private void createPanels() {
        northPanel = new NorthPanel();
        centerPanel = new CenterPanel();
        southPanel = new SouthPanel();
    }


    private void frameSettings(){
        this.setDefaultCloseOperation(defaultOperationOnClose);
        this.setMinimumSize(new Dimension(minimumWindowWidth, minimumWindowHeight));
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setIconImage(programIcon);
        this.setTitle(frameTitle);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
