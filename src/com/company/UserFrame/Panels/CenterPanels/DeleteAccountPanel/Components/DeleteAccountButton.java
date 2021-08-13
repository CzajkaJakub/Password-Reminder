package com.company.UserFrame.Panels.CenterPanels.DeleteAccountPanel.Components;

import com.company.Elements.SubmitButton;

import javax.swing.*;

public class DeleteAccountButton extends SubmitButton {

    String iconPath = "resources/Images/BarIcons/deleteAccount.png";

    public DeleteAccountButton(String text) {
        super(text);
        this.setIcon(new ImageIcon(iconPath));
    }
}
