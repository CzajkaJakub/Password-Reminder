package com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.Components;

import com.company.Components.SubmitButton;

import javax.swing.*;

public class ChangePasswordButton extends SubmitButton {
    public ChangePasswordButton(String text) {
        super(text);
        this.setIcon(new ImageIcon("src/images/changePassword.png"));
    }
}
