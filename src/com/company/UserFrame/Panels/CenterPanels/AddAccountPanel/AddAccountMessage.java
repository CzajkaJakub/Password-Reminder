package com.company.UserFrame.Panels.CenterPanels.AddAccountPanel;

import javax.swing.*;

public class AddAccountMessage {
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

}
