package com.company.LoggingFrame.LogRegisterSystem;

import javax.swing.*;

public class LoggingSystemMessages {


    public static void emptyField(){
        JOptionPane.showMessageDialog(null,
                "Empty Field!",
                "Wrong data!",
                JOptionPane.WARNING_MESSAGE);
    }


    public static void wrongData() {
        JOptionPane.showMessageDialog(null,
                "Wrong data, please try again!",
                "Wrong Data!",
                JOptionPane.WARNING_MESSAGE);
    }
}
