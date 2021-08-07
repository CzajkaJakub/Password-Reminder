package com.company;

import com.company.UserFrame.UserFrame;
import com.company.loginFrame.FramePanels.SouthPanel;
import com.company.loginFrame.LoggingFrame;
import com.company.systemActions.ColorSystem.SystemColors;

import java.io.*;

public class Main {

    private static LoggingFrame loggingFrame;
    public static UserFrame userFrame;

    public static void main(String[] args){
        elementsSettings();
        loggingFrame = new LoggingFrame();
    }

    private static void elementsSettings() {
        try {
            SystemColors.readColors();
            SouthPanel.setButtonsActions();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createLoggingPanel() {
        destroyUserPanel();
        loggingFrame = new LoggingFrame();
    }

    public static void createUserPanel(String login, String password){
        destroyLoggingPanel();
        userFrame = new UserFrame(login, password);
    }

    public static void destroyLoggingPanel(){
        loggingFrame.dispose();
    }

    public static void destroyUserPanel() { userFrame.dispose(); }
}
