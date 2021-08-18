package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Elements;

import com.company.CommonElements.SubmitButton;

import javax.swing.*;

public class ShowDataButton extends SubmitButton {

    String iconPath = "resources/Images/BarIcons/showAccount.png";

    public ShowDataButton(String text) {
        super(text);
        this.setIcon(new ImageIcon(iconPath));

    }
}
