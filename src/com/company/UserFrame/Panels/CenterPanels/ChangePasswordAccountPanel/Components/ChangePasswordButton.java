package com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.Components;

import com.company.Elements.SubmitButton;

import javax.swing.*;

public class ChangePasswordButton extends SubmitButton {

    String iconPath = "src/Images/BarIcons/changePassword.png";

    public ChangePasswordButton(String text) {
        super(text);
        this.setIcon(new ImageIcon(iconPath));
    }
}
