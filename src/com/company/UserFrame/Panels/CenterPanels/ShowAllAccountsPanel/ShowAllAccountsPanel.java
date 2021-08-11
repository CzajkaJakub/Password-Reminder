package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel;

import com.company.UserFrame.Panels.CenterPanels.SliderAccounts.SliderTemplatePanel;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Elements.ShowDataButton;
import com.company.UserFrame.UserDataSystem.UserData;
import javax.swing.*;


public class ShowAllAccountsPanel extends SliderTemplatePanel {

    private ShowDataButton showAccountDataButton;

    String showDataButtonName = "Show Data";

    public ShowAllAccountsPanel(UserData data){
        super(data);
        createPanel();
        addListeners();
    }

    private void createPanel() {
        showAccountDataButton = new ShowDataButton(showDataButtonName);
        this.add(showAccountDataButton);
    }

    private void addListeners() {
        showAccountDataButton.addActionListener(e-> showServiceData());
    }

    public void showServiceData() {
        if(super.getCurrentSliderPosition() != -1){
            if(confirmShowData() == 0){
                super.loginField.setText(super.getCurrentDecryptedLogin());
                super.passwordField.setText(super.getCurrentDecryptedPassword());
            }
        }
    }

    public static int confirmShowData() {
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
