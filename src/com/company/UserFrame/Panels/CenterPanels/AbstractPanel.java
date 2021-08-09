package com.company.UserFrame.Panels.CenterPanels;

import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components.AccountsSlider;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components.ShowDataButton;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components.SliderLabel;
import com.company.UserFrame.UserData;
import com.company.systemActions.ColorSystem.SystemColors;
import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;
import com.company.systemActions.messages.SystemMessages;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class AbstractPanel extends JPanel implements PanelMethods, ChangeListener {

    private int sliderLength;
    private HashMap<String, LinkedList<String>> accountsData;
    private LinkedList<String> uniqueNames;

    private SliderLabel accountsLabel;
    private AccountsSlider accountsSlider;
    private SliderLabel loginField;
    private SliderLabel passwordField;

    private String decryptedLoginService;
    private String decryptedPasswordService;

    private UserData userData;

    public AbstractPanel(UserData userData){
        readData(userData);
        createElements();
        panelSettings();
    }

    private void readData(UserData userData) {
        this.userData = userData;
        accountsData = userData.getAccounts();
        uniqueNames = userData.getKeys();
        sliderLength = userData.getAmountOfAccounts();
    }

    @Override
    public void panelSettings() {
        this.setOpaque(true);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(750, 700));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));
        this.setBackground(SystemColors.backgroundColor);
        this.add(accountsLabel);
        this.add(accountsSlider);
        this.add(loginField);
        this.add(passwordField);
    }

    @Override
    public void createElements() {
        loginField = new SliderLabel("Login");
        passwordField = new SliderLabel("Password");
        accountsLabel = new SliderLabel("Unique Service Name");
        accountsSlider = new AccountsSlider(sliderLength);
        accountsSlider.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int sliderPosition = accountsSlider.getValue();
        if(sliderLength != 0){
            String uniqueName = uniqueNames.get(sliderPosition);
            changeLabelName(uniqueName);
            changeLoginPasswordField(uniqueName);
        }
    }

    private void changeLabelName(String uniqueName) {
        String decryptedUniqueName = Cypher.decryptData(uniqueName, EncryptTypes.USER_SERVICE_NAME);
        accountsLabel.setText(decryptedUniqueName);
    }

    private void changeLoginPasswordField(String uniqueName) {
        LinkedList<String> loginPasswordData = accountsData.get(uniqueName);
        String encryptedLoginService = loginPasswordData.get(0);
        String encryptedPasswordService = loginPasswordData.get(1);
        decryptedLoginService = Cypher.decryptData(encryptedLoginService, EncryptTypes.USER_SERVICE_LOGIN);
        decryptedPasswordService = Cypher.decryptData(encryptedPasswordService, EncryptTypes.USER_SERVICE_PASSWORD);
        int loginLength = decryptedLoginService.length();
        int passwordLength = decryptedPasswordService.length();
        loginField.setText("*".repeat(loginLength));
        passwordField.setText("*".repeat(passwordLength));
    }

    public void showServiceData() {
        if(SystemMessages.confirmShowData() == 0){
            loginField.setText(decryptedLoginService);
            passwordField.setText(decryptedPasswordService);
        }
    }

    public void deleteServiceData(){
        if(sliderLength != 0){
            if(SystemMessages.confirmShowData() == 0){
                int sliderPosition = accountsSlider.getValue();
                String uniqueName = uniqueNames.get(sliderPosition);
                userData.deleteServiceAccount(uniqueName);
            }
        }
    }

    public void changePasswordService(){
        if(sliderLength != 0){
            int sliderPosition = accountsSlider.getValue();
            String uniqueName = uniqueNames.get(sliderPosition);
            String newPassword = JOptionPane.showInputDialog(null, "input your new password");
            userData.setNewPassword(uniqueName, newPassword);

        }
    }
}
