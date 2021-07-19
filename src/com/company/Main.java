package com.company;

import com.company.loginFrame.LoggingFrame;
import com.company.userPanel.MenuBar.MenuActions.ColorSystem.SystemColors;

import java.io.FileNotFoundException;

public class Main {

    public static LoggingFrame loggingFrame;

    public static void main(String[] args) throws FileNotFoundException {
        SystemColors.readColors();
        loggingFrame = new LoggingFrame();
    }


}
