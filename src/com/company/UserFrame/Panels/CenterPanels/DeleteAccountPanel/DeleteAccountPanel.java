package com.company.UserFrame.Panels.CenterPanels.DeleteAccountPanel;

import com.company.UserFrame.Panels.CenterPanels.SliderAccounts.SliderTemplatePanel;
import com.company.UserFrame.Panels.CenterPanels.DeleteAccountPanel.Components.DeleteAccountButton;
import com.company.UserFrame.UserDataSystem.UserData;



import javax.swing.*;
import javax.swing.event.ChangeListener;

import static com.company.Main.userFrame;

public class DeleteAccountPanel extends SliderTemplatePanel implements ChangeListener {

    private DeleteAccountButton deleteAccountDataButton;

    String deleteAccountButtonName = "Delete an account";

    public DeleteAccountPanel(UserData data){
        super(data);
        createPanel();
        addListeners(data);
    }

    private void createPanel() {
        deleteAccountDataButton = new DeleteAccountButton(deleteAccountButtonName);
        this.add(deleteAccountDataButton);
    }

    private void addListeners(UserData data) {
        deleteAccountDataButton.addActionListener(e-> deleteServiceData(data));
    }


    public void deleteServiceData(UserData userData) {
        if (super.getCurrentSliderPosition() != -1) {
            if (confirmDeleteAccount() == 0) {
                userData.deleteServiceAccount(super.getCurrentEncryptedServiceName());
                userFrame.centerPanel.switchPanels(new DeleteAccountPanel(userData));
            }
        }
    }


    public static int confirmDeleteAccount() {
        return JOptionPane.showOptionDialog(null,
                "Are you sure?",
                "Account informer",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                null,
                0);
    }
}
