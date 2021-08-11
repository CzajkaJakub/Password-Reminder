package com.company.UserFrame.UserFrame;

import javax.swing.*;

public class UserFrameWelcomeMessage extends JOptionPane {

    public static void welcomeMessage(String login){
        String message = "Welcome again " + login + "!";
        JOptionPane.showMessageDialog(null,
                message,
                "Welcome user!",
                JOptionPane.PLAIN_MESSAGE);
    }
}
