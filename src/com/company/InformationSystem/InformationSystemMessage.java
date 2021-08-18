package com.company.InformationSystem;

import javax.swing.*;

public class InformationSystemMessage {

    private static final ImageIcon informationIcon = new ImageIcon("resources/Images/BarElementsIcons/informationBarElementIcon.png");

    protected static void aboutProgram(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "Program Information!",
                JOptionPane.PLAIN_MESSAGE,
                informationIcon);
    }
}
