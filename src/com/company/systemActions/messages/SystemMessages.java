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

    public static int confirmAccountAdded() {
        return JOptionPane.showOptionDialog(null,
                "Are you sure to add this account?",
                "Account informer",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                null,
                0);
    }

    public static void keyBusy() {
        JOptionPane.showMessageDialog(null,
                "This key is bused, try the other one",
                "Account Informer!",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void accountAdded() {
        JOptionPane.showMessageDialog(null,
                "Account was successful added!",
                "Account Informer!",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void aboutProgram(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "About program!",
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int confirmShowData() {
        return JOptionPane.showOptionDialog(null,
                "Are you sure?",
                "Account informer",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                null,
                0);
    }
}
