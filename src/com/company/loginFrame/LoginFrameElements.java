package com.company.loginFrame;

import com.company.StylizedJButton;
import com.company.loginFrame.FramePanels.CenterPanel;
import com.company.loginFrame.FramePanels.NorthPanel;
import com.company.loginFrame.FramePanels.SouthPanel;
import com.company.loginFrame.LoginPasswordTextFields.LoggingField;
import com.company.loginFrame.LoginPasswordTextFields.LoggingPanel;
import com.company.loginFrame.LoginPasswordTextFields.PasswordField;
import com.company.loginFrame.LoginPasswordTextFields.RegisterCheckBox;

import javax.swing.*;

public interface LoginFrameElements {
    LoggingField loginTextField = new LoggingField("Login");
    PasswordField passwordTextField = new PasswordField("Password");

    ImageIcon passwordReminderImage = new ImageIcon("src/images/passwordReminder.png");
    ImageIcon logInImage = new ImageIcon("src/images/logIn.png");
    ImageIcon registerImage = new ImageIcon("src/images/register.png");
    ImageIcon programIcon = new ImageIcon("src/images/programIcon.png");
    ImageIcon registerYesIcon = new ImageIcon("src/images/registerYes.png");
    ImageIcon registerNoIcon = new ImageIcon("src/images/registerNo.png");

    StylizedJButton logInButton = new StylizedJButton(logInImage, 140, 64);
    StylizedJButton registerButton = new StylizedJButton(registerImage, 199, 67);

    RegisterCheckBox registerCheckBox = new RegisterCheckBox();
    LoggingPanel loggingTextFieldPanel = new LoggingPanel();

    NorthPanel northLogPane = new NorthPanel();
    CenterPanel centerLogPane = new CenterPanel();
    SouthPanel southLogPane = new SouthPanel();

}
