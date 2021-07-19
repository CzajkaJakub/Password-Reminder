package com.company.loginFrame.FramePanels;

import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;
import com.company.loginFrame.LoginFrameElements;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel implements LoginFrameElements {
    public CenterPanel(){
        this.setPreferredSize(new Dimension(100, 250));
        this.add(loggingTextFieldPanel);
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
        this.setOpaque(true);
    }
}
