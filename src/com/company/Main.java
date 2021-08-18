package com.company;

import com.company.UserFrame.UserFrame.UserFrame;
import com.company.LoggingFrame.LoggingFrame;
import com.company.ColorSystem.SystemColors;

import java.io.*;

public class Main {

    public static LoggingFrame loggingFrame;
    public static UserFrame userFrame;


    public static void main(String[] args){
        readSettings();
        loggingFrame = new LoggingFrame();
    }


    private static void readSettings() {
        try {
            SystemColors.readColors();
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
