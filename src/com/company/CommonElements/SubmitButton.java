package com.company.CommonElements;

import com.company.GlobalSettings.FontSettings;
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
        this.setBackground(SystemColors.getBackgroundColor());
        this.setForeground(SystemColors.getTextColor());
        this.setOpaque(true);
        this.setBorder(null);
        this.setFocusable(false);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }
}
