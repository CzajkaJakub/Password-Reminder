package com.company.Elements;

import javax.swing.*;
import java.awt.*;


public class SubmitButtonIcon extends JButton {

    public SubmitButtonIcon(ImageIcon icon, int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        this.setFocusable(false);
        this.setBackground(null);
        this.setBorder(null);
        this.setIcon(icon);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
    }
}