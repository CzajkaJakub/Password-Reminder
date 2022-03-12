package com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.PanelElements;

import com.company.GlobalSettings.FontSettings;
import com.company.GlobalSettings.TextFieldSettings;
import com.company.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PasswordField extends JPasswordField implements FontSettings, TextFieldSettings, MouseListener {

    private int cleared = 0;

    public PasswordField(String text){
        this.setFont(new Font(fontType, fontStyle, fontSize));
        this.setPreferredSize(new Dimension(textFieldWidth, textFieldHeight));
        this.setHorizontalAlignment(textPosition);
        this.setBorder(BorderFactory.createMatteBorder(topBorder, leftBorder, bottomBorder, rightBorder, borderColor));
        this.setText(text);
        this.setBackground(SystemColors.getBackgroundColor());
        this.setForeground(SystemColors.getTextColor());
        this.setCaretColor(SystemColors.getTextColor());
        this.addMouseListener(this);
        this.setEchoChar('*');
        this.setFocusable(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(cleared == 0){
            cleared = 1;
            this.setText("");
            this.setFocusable(true);
            this.grabFocus();
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
        this.setForeground(SystemColors.getTextColor());
        this.setCaretColor(SystemColors.getTextColor());
    }
}
