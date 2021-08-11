package com.company.UserFrame.UserDataSystem;

import javax.swing.*;

public class DataSystemMessage extends JOptionPane {

    public static void userError(){

        String message = "Your account was corrupted, new account was created";
        String messageTitle = "Account error!";

        JOptionPane.showMessageDialog(null,
                message, messageTitle,
                JOptionPane.PLAIN_MESSAGE);
    }
}

