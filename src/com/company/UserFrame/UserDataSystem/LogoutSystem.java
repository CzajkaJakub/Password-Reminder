package com.company.UserFrame.UserDataSystem;


import com.company.Main;

import javax.swing.*;

public class LogoutSystem {


    public static void logout() {
        if(confirmationOfLogout() == 0){
            Main.destroyUserPanel();
            Main.createLoggingPanel();
        }
    }

    private static int confirmationOfLogout(){
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
