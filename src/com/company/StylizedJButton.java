package com.company;

import javax.swing.*;
import java.awt.*;


public class StylizedJButton extends JButton {
    public StylizedJButton(ImageIcon icon) {
        this.setPreferredSize(new Dimension(150, 80));
        this.setFocusable(false);
        this.setBackground(null);
        this.setBorder(null);
        this.setIcon(icon);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
    }
}
