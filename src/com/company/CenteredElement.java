package com.company;

import javax.swing.*;
import java.awt.*;

public class CenteredElement extends JLabel{
    CenteredElement(){
        this.setBackground(Color.BLACK);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setOpaque(true);
        this.setLayout(new FlowLayout());
    }
}
