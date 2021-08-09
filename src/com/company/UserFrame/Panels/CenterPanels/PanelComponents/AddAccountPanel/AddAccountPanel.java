package com.company.UserFrame.Panels.CenterPanels.PanelComponents.AddAccountPanel;

import com.company.UserFrame.Panels.CenterPanels.PanelComponents.AddAccountPanel.Components.SaveAccountButton;
import com.company.Components.TextArea;
import com.company.UserFrame.Panels.CenterPanels.PanelMethods;
import com.company.UserFrame.UserData;
import com.company.systemActions.ColorSystem.SystemColors;
import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;
import com.company.systemActions.messages.SystemMessages;

import javax.swing.*;
import java.awt.*;

public class AddAccountPanel extends JPanel implements PanelMethods {

    private TextArea serviceName;
    private TextArea loginService;
    private TextArea passwordService;
    private SaveAccountButton submitButton;
    UserData userData;


    public AddAccountPanel(UserData userData){
        this.userData = userData;
        createElements();
        panelSettings();
    }

    @Override
    public void panelSettings() {
        this.setOpaque(true);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(450, 700));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));
        this.setBackground(SystemColors.backgroundColor);
        this.add(serviceName);
        this.add(loginService);
        this.add(passwordService);
        this.add(submitButton);
    }

    @Override
    public void createElements() {
        serviceName = new TextArea("Unique name");
        loginService = new TextArea("Login");
        passwordService = new TextArea("Password");
        submitButton = new SaveAccountButton("Save an account");
        submitButton.addActionListener(e->checkDataToSave());
    }

    private void checkDataToSave() {
        if(SystemMessages.confirmAccountAdded() == 0){
            checkFreeKey();
        }
    }

    private void checkFreeKey() {
        String serviceAccountName = serviceName.getText();
        String encryptedServiceAccountName = Cypher.encryptData(serviceAccountName, EncryptTypes.USER_SERVICE_NAME);

        if(!userData.getKeys().contains(encryptedServiceAccountName)){
            String serviceLoginName = loginService.getText();
            String servicePasswordName = passwordService.getText();
            String encryptedServiceLogin = Cypher.encryptData(serviceLoginName, EncryptTypes.USER_SERVICE_LOGIN);
            String encryptedServicePassword = Cypher.encryptData(servicePasswordName, EncryptTypes.USER_SERVICE_PASSWORD);
            userData.addDataToAccount(encryptedServiceAccountName, encryptedServiceLogin, encryptedServicePassword);
            SystemMessages.accountAdded();
        }else{
            SystemMessages.keyBusy();
        }


    }
}
