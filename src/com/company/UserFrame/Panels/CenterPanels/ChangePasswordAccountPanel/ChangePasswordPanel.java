package com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel;

import com.company.UserFrame.Panels.CenterPanels.SliderAccounts.SliderTemplatePanel;
import com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.Components.ChangePasswordButton;
import com.company.UserFrame.UserDataSystem.UserData;
import com.company.UserFrame.UserFrame.UserFrame;

import javax.swing.*;

public class ChangePasswordPanel extends SliderTemplatePanel {

    private ChangePasswordButton changePasswordButton;

    String changePasswordButtonName = "Change Password";

    public ChangePasswordPanel(UserData data) {
        super(data);
        createPanel();
        addListeners(data);
    }

    private void createPanel() {
        changePasswordButton = new ChangePasswordButton(changePasswordButtonName);
        this.add(changePasswordButton);
    }


    private void addListeners(UserData userData) {
        changePasswordButton.addActionListener(e-> changePasswordService(userData));
    }

    public void changePasswordService(UserData userData){
        if(super.getCurrentSliderPosition() != -1){
            String newPassword = JOptionPane.showInputDialog(null, "input your new password");
            userData.setNewPassword(super.getCurrentEncryptedServiceName(), newPassword);
            UserFrame.centerPanel.switchPanels(new ChangePasswordPanel(userData));
        }
    }

}

