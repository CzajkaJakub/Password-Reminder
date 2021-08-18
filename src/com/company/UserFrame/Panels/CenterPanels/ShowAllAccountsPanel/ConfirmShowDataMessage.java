package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel;

import javax.swing.*;

public class ConfirmShowDataMessage {

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
