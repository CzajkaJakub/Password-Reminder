package com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel;

import com.company.UserFrame.Panels.CenterPanels.AbstractPanel;
import com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.Components.ChangePasswordButton;
import com.company.UserFrame.Panels.CenterPanels.deleteAccountPanel.Components.DeleteAccountButton;
import com.company.UserFrame.UserData;

import javax.swing.*;
import java.awt.*;

public class ChangePasswordPanel extends AbstractPanel {

    ChangePasswordButton changePasswordButton;

    public ChangePasswordPanel(UserData data) {
        super(data);
        changePasswordButton = new ChangePasswordButton("Change Password");
        this.add(changePasswordButton);
        changePasswordButton.addActionListener(e-> super.changePasswordService());
    }
}
