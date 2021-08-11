package com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.PanelElements;

import com.company.StaticSettings.FontSettings;
import com.company.StaticSettings.TextFieldSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class LoggingField extends JTextField implements FontSettings, TextFieldSettings {

    public LoggingField(String text){
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
