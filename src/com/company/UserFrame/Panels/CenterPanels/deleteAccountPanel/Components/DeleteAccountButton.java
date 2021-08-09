package com.company.UserFrame.Panels.CenterPanels.deleteAccountPanel.Components;

import com.company.Components.SubmitButton;

import javax.swing.*;

public class DeleteAccountButton extends SubmitButton {

    public DeleteAccountButton(String text) {
        super(text);
        this.setIcon(new ImageIcon("src/images/deleteAccount.png"));

    }
}
