package com.company;

import javax.swing.*;
import java.awt.*;

public class LoggingField extends JTextField {
    LoggingField(String text){
        this.setFont(new Font("Consolas", Font.BOLD, 25));
        this.setPreferredSize(new Dimension(300, 70));
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.red));
        this.setText(text);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setCaretColor(Color.WHITE);
    }
}
