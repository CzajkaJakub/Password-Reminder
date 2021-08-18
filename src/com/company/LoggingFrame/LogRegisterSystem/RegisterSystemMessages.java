package com.company.LoggingFrame.LogRegisterSystem;

import javax.swing.*;

public class RegisterSystemMessages {

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

    public static void emptyField(){
        JOptionPane.showMessageDialog(null,
                "Empty Field!",
                "Wrong data!",
                JOptionPane.WARNING_MESSAGE);
    }
}
