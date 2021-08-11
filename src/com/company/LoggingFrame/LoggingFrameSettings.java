package com.company.LoggingFrame;

import javax.swing.*;

public interface LoggingFrameSettings {

    int minimumWindowWidth = 900;
    int minimumWindowHeight = 800;
    String frameTitle = "Password Reminder";

    ImageIcon logInImage = new ImageIcon("src/Images/Description/logIn.png");
    ImageIcon registerImage = new ImageIcon("src/Images/Description/register.png");
    ImageIcon registerYesIcon = new ImageIcon("src/Images/RegisterCheckBoxIcons/registerYes.png");
    ImageIcon registerNoIcon = new ImageIcon("src/Images/RegisterCheckBoxIcons/registerNo.png");
}
