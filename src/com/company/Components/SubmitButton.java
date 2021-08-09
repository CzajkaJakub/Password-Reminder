package com.company.Components;

import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class SubmitButton extends JButton {

    public SubmitButton(String text){
        buttonSettings(text);
    }

    private void buttonSettings(String text) {
        this.setText(text);
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
        this.setOpaque(true);
        this.setBorder(BorderFactory.createMatteBorder(0,0,0,0, SystemColors.backgroundColor));
        this.setFont(new Font("MV Boli", Font.BOLD, 40));
        this.setFocusable(false);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
}
