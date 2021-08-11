package com.company.Elements;

import com.company.StaticSettings.FontSettings;
import com.company.StaticSettings.TextFieldSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField implements FontSettings, TextFieldSettings {

    public TextField(String text){
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setPreferredSize(new Dimension(textFieldWidth, textFieldHeight));
        this.setHorizontalAlignment(textPosition);
        this.setBorder(BorderFactory.createMatteBorder(topBorder, leftBorder, bottomBorder, rightBorder, borderColor));
        this.setText(text);
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
        this.setCaretColor(SystemColors.textColor);
    }
}
