package com.company.UserFrame.Panels.CenterPanels.AddAccountPanel;

import com.company.UserFrame.Panels.CenterPanels.AddAccountPanel.Components.SaveAccountButton;
import com.company.Elements.TextField;
import com.company.UserFrame.UserDataSystem.UserData;
import com.company.ColorSystem.SystemColors;
import com.company.Encryption.Cypher;
import com.company.Encryption.EncryptTypes;
import com.company.UserFrame.UserFrame.UserFrame;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class AddAccountPanel extends JPanel implements AddAccountSettings {

    private TextField serviceName;
    private TextField loginService;
    private TextField passwordService;
    private SaveAccountButton submitButton;
    private final UserData userData;


    public AddAccountPanel(UserData userData){
        this.userData = userData;
        createElements();
        panelSettings();
        addButtonListener();
    }


    public void panelSettings() {
        this.setOpaque(true);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(elementsPosition, horizontalGap, verticalGap));
        this.setBackground(SystemColors.backgroundColor);
        this.add(serviceName);
        this.add(loginService);
        this.add(passwordService);
        this.add(submitButton);
    }


    public void createElements() {
        serviceName = new TextField(firstTextField);
        loginService = new TextField(secondTextField);
        passwordService = new TextField(thirdTextField);
        submitButton = new SaveAccountButton(buttonName);
    }


    private void addButtonListener() {
        submitButton.addActionListener(e->checkConfirmationToSave());
    }


    private void checkConfirmationToSave() {
        if(AddAccountMessage.confirmAccountAdded() == 0){
            checkFreeKey();
        }
    }


    private void checkFreeKey() {
        String serviceAccountName = serviceName.getText();
        String encryptedServiceAccountName = Cypher.encryptData(serviceAccountName, EncryptTypes.USER_SERVICE_NAME);
        LinkedList<String> uniqueNames = userData.getKeys();
        if(uniqueNames.contains(encryptedServiceAccountName)){
            AddAccountMessage.keyBusy();
        }else{
            String serviceLoginName = loginService.getText();
            String servicePasswordName = passwordService.getText();
            String encryptedServiceLogin = Cypher.encryptData(serviceLoginName, EncryptTypes.USER_SERVICE_LOGIN);
            String encryptedServicePassword = Cypher.encryptData(servicePasswordName, EncryptTypes.USER_SERVICE_PASSWORD);
            userData.addDataToAccount(encryptedServiceAccountName, encryptedServiceLogin, encryptedServicePassword);
            AddAccountMessage.accountAdded();
            UserFrame.centerPanel.switchPanels(new AddAccountPanel(userData));
        }
    }
}
