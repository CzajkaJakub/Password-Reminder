package com.company.messages;

import com.company.encryption.Cypher;
import com.company.encryption.EncryptTypes;

import javax.swing.*;


public class Messages extends JOptionPane {
    public static String registerInputLogin(){
        String inputLogin = JOptionPane.showInputDialog(null,
                "Type your login.",
                "Register",
                JOptionPane.QUESTION_MESSAGE);
        return  Cypher.encrypt(inputLogin, EncryptTypes.USER_LOGIN);
    }


    public static String registerInputPassword(){
        String inputPassword = JOptionPane.showInputDialog(null,
                "Type your password.",
                "Register",
                JOptionPane.QUESTION_MESSAGE);
        return  Cypher.encrypt(inputPassword, EncryptTypes.USER_PASSWORD);
    }


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


}
