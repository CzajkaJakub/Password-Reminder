package com.company.systemActions.messages;
import javax.swing.*;


public class SystemMessages extends JOptionPane {
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

    public static void welcomeMessage(String login){
        String message = "Welcome again " + login + "!";
        JOptionPane.showMessageDialog(null,
                message,
                "Welcome user!",
                JOptionPane.PLAIN_MESSAGE);

    }

    public static void accountCreatedMessage(){
        JOptionPane.showMessageDialog(null,
                "Account was created!",
                "Account information!",
                JOptionPane.WARNING_MESSAGE);
    }

    public static int confirmationOfLogout(){
        return JOptionPane.showOptionDialog(null,
                "Do you really want to logout?",
                "Logout Window",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                null,
                0);
    }
}
