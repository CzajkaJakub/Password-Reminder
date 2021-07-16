package com.company.loginFrame.LoginPasswordTextFields;

import com.company.loginFrame.LoginFrameElements;

import javax.swing.*;
import java.awt.*;

public class RegisterCheckBox extends JCheckBox implements LoginFrameElements {

    int registerMarked = 0;

    public RegisterCheckBox(){
        this.setText("Registration");
        this.addActionListener(e->checkRegistration());
        this.setFont(new Font("MV Boli", Font.BOLD, 35));
        this.setPreferredSize(new Dimension(300, 100));
        this.setForeground(Color.WHITE);
        this.setBackground(Color.BLACK);
        this.setIcon(registerNoIcon);
        this.setFocusable(false);

    }

    public void checkRegistration(){
        if(registerMarked == 1){
            registerMarked = 0;
            this.setIcon(registerNoIcon);
            logInButton.setVisible(true);
            registerButton.setVisible(false);
        }else{
            registerMarked = 1;
            this.setIcon(registerYesIcon);
            logInButton.setVisible(false);
            registerButton.setVisible(true);
        }
    }
}

