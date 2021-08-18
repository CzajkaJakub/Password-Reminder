package com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.Components;

import com.company.CommonElements.SubmitButton;

import javax.swing.*;

public class ChangePasswordButton extends SubmitButton {

    String iconPath = "resources/Images/BarIcons/changePassword.png";

    public ChangePasswordButton(String text) {
        super(text);
        this.setIcon(new ImageIcon(iconPath));
    }
}
