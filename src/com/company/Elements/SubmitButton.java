package com.company.Elements;

import com.company.StaticSettings.FontSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class SubmitButton extends JButton implements FontSettings {


    public SubmitButton(String text){
        buttonSettings(text);
    }


    private void buttonSettings(String text) {
        this.setText(text);
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
        this.setOpaque(true);
        this.setBorder(null);
        this.setFocusable(false);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
}
