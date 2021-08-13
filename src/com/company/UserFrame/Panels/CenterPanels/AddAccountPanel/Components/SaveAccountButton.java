package com.company.UserFrame.Panels.CenterPanels.AddAccountPanel.Components;

import com.company.Elements.SubmitButton;

import javax.swing.*;

public class SaveAccountButton extends SubmitButton {

    static final String buttonIconPath = "resources/Images/BarIcons/saveAccount.png";

    public SaveAccountButton(String text) {
        super(text);
        this.setIcon(new ImageIcon(buttonIconPath));
    }
}
