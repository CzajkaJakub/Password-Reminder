package com.company;

import javax.swing.*;

public interface LoginFrameElements {
    LoggingField loginField = new LoggingField("Login");
    PasswordField passwordField = new PasswordField("Password");

    LoggingPanel northLogPane = new LoggingPanel();
    LoggingPanel centerLogPane = new LoggingPanel();
    LoggingPanel southLogPane = new LoggingPanel();

    ImageIcon passwordReminderImage = new ImageIcon("src/images/passwordReminder.png");
    ImageIcon logInImage = new ImageIcon("src/images/logIn.png");
    ImageIcon registerImage = new ImageIcon("src/images/register.png");

    StylizedJButton logInButton = new StylizedJButton(logInImage);
    StylizedJButton registerButton = new StylizedJButton(registerImage);
}
