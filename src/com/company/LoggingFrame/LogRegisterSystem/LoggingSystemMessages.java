package com.company.LoggingFrame.LogRegisterSystem;

import javax.swing.*;

public class LoggingSystemMessages {
    public static void wrongPassword(){
        JOptionPane.showMessageDialog(null,
                "Typed password is wrong, please try again!",
                "Wrong password!",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void wrongUser(){
        JOptionPane.showMessageDialog(null,
                "Typed user doesn't exist!",
                "Wrong User!",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void userUnavailable(){
        JOptionPane.showMessageDialog(null,
                "Typed user is busy!",
                "Wrong User!",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void accountCreatedMessage(){
        JOptionPane.showMessageDialog(null,
                "Account was created!",
                "Account information!",
                JOptionPane.WARNING_MESSAGE);
    }
}
