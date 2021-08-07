package com.company.Components;

import javax.swing.*;
import java.awt.*;


public class StylizedJButton extends JButton {
    public StylizedJButton(ImageIcon icon, int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        this.setFocusable(false);
        this.setBackground(null);
        this.setBorder(null);
        this.setIcon(icon);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
    }
}