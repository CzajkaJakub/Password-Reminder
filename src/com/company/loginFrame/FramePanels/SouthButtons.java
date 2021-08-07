package com.company.loginFrame.FramePanels;

import com.company.Components.StylizedJButton;

import javax.swing.*;

public interface SouthButtons {
    ImageIcon logInImage = new ImageIcon("src/images/logIn.png");
    ImageIcon registerImage = new ImageIcon("src/images/register.png");
    StylizedJButton logInButton = new StylizedJButton(logInImage, 140, 64);
    StylizedJButton registerButton = new StylizedJButton(registerImage, 199, 67);
}
