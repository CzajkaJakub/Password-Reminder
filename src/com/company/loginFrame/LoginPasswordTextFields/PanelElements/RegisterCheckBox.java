package com.company.loginFrame.LoginPasswordTextFields.PanelElements;

import com.company.loginFrame.FramePanels.SouthPanel;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class RegisterCheckBox extends JCheckBox {

    private static int registerMarked = 0;
    private static final ImageIcon registerYesIcon = new ImageIcon("src/images/registerYes.png");
    private static final ImageIcon registerNoIcon = new ImageIcon("src/images/registerNo.png");

    public RegisterCheckBox(){
        this.setText("Registration");
        this.addActionListener(e->checkRegistration());
        this.setFont(new Font("MV Boli", Font.BOLD, 35));
        this.setPreferredSize(new Dimension(300, 100));
        this.setBackground(SystemColors.backgroundColor);
        this.setForeground(SystemColors.textColor);
        this.setIcon(registerNoIcon);
        this.setFocusable(false);
    }

    public void checkRegistration(){
        if(registerMarked == 1){
            registerMarked = 0;
            this.setIcon(registerNoIcon);
            SouthPanel.logInButton.setVisible(true);
            SouthPanel.registerButton.setVisible(false);
        }else{
            registerMarked = 1;
            this.setIcon(registerYesIcon);
            SouthPanel.logInButton.setVisible(false);
            SouthPanel.registerButton.setVisible(true);
        }
    }
}

