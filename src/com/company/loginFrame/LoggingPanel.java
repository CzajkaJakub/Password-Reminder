package com.company.loginFrame;

import javax.swing.*;
import java.awt.*;

public class LoggingPanel extends JPanel{
    LoggingPanel(){
        this.setPreferredSize(new Dimension(100, 250));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 60));
        this.setBackground(Color.BLACK);
        this.setOpaque(true);
    }
}
