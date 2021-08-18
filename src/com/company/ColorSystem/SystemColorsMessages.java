package com.company.ColorSystem;

import javax.swing.*;

public class SystemColorsMessages {

    private final static ImageIcon confirmationIcon = new ImageIcon("resources/Images/RegisterCheckBoxIcons/registerYes.png");

    public static void colorChanger() {
        JOptionPane.showMessageDialog(null,
                "Log in again to get a new colors",
                "Color Changer!",
                JOptionPane.PLAIN_MESSAGE,
                confirmationIcon);
    }
}
