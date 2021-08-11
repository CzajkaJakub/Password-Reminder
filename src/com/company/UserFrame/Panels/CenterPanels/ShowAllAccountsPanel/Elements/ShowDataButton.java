package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Elements;

import com.company.Elements.SubmitButton;

import javax.swing.*;

public class ShowDataButton extends SubmitButton {

    String iconPath = "src/Images/BarIcons/showAccount.png";

    public ShowDataButton(String text) {
        super(text);
        this.setIcon(new ImageIcon(iconPath));

    }
}
