package com.company.LoggingFrame;

import javax.swing.*;

public interface LoggingFrameSettings {

    int minimumWindowWidth = 900;
    int minimumWindowHeight = 800;
    String frameTitle = "Password Reminder";

    ImageIcon logInImage = new ImageIcon("resources/Images/Description/logIn.png");
    ImageIcon registerImage = new ImageIcon("resources/Images/Description/register.png");
    ImageIcon registerYesIcon = new ImageIcon("resources/Images/RegisterCheckBoxIcons/registerYes.png");
    ImageIcon registerNoIcon = new ImageIcon("resources/Images/RegisterCheckBoxIcons/registerNo.png");
}
