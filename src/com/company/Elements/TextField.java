package com.company.Elements;

import com.company.StaticSettings.FontSettings;
import com.company.StaticSettings.TextFieldSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TextField extends JTextField implements FontSettings, TextFieldSettings, MouseListener {

    private int cleared = 0;

    public TextField(String text){
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setPreferredSize(new Dimension(textFieldWidth, textFieldHeight));
        this.setHorizontalAlignment(textPosition);
        this.setBorder(BorderFactory.createMatteBorder(topBorder, leftBorder, bottomBorder, rightBorder, borderColor));
        this.setText(text);
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
        this.setCaretColor(SystemColors.textColor);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(cleared == 0){
            cleared = 1;
            this.setText("");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setForeground(Color.green);
        this.setCaretColor(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setForeground(SystemColors.textColor);
        this.setCaretColor(SystemColors.textColor);
    }
}
