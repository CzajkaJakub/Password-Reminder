package com.company.UserFrame.Panels.CenterPanels.PanelComponents.AddAccountPanel.Components;

import com.company.Components.SubmitButton;

import javax.swing.*;

public class SaveAccountButton extends SubmitButton {

    ImageIcon submitIcon;

    public SaveAccountButton(String text) {
        super(text);
        submitIcon = new ImageIcon("src/images/saveAccount.png");
        this.setIcon(submitIcon);
    }
}
