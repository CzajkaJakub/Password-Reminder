package com.company.systemActions.InformationSystem;

import javax.swing.*;

public class AboutSystemMessage {
    public static void aboutProgram(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "About program!",
                JOptionPane.PLAIN_MESSAGE);
    }
}
