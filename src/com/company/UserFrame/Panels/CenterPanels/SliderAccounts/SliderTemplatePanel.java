package com.company.UserFrame.Panels.CenterPanels.SliderAccounts;

import com.company.UserFrame.Panels.CenterPanels.SliderAccounts.Components.AccountsSlider;
import com.company.UserFrame.Panels.CenterPanels.SliderAccounts.Components.SliderLabel;
import com.company.UserFrame.UserDataSystem.UserData;
import com.company.ColorSystem.SystemColors;
import com.company.Encryption.Cypher;
import com.company.Encryption.EncryptTypes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class SliderTemplatePanel extends JPanel implements ChangeListener, SliderPanelSettings {

    private int sliderLength;
    private HashMap<String, LinkedList<String>> accountsData;
    private LinkedList<String> uniqueNames;

    private AccountsSlider accountsSlider;
    private SliderLabel accountsLabel;
    public SliderLabel loginField;
    public SliderLabel passwordField;

    private String currentEncryptedServiceName;
    private int currentSliderPosition = -1;

    private String currentDecryptedLogin;
    private String currentDecryptedPassword;


    public SliderTemplatePanel(UserData userData){
        readData(userData);
        createElements();
        addSliderListener();
        panelSettings();
    }

    private void readData(UserData userData) {
        accountsData = userData.getAccounts();
        uniqueNames = userData.getKeys();
        sliderLength = userData.getAmountOfAccounts();
    }

    public void createElements() {
        loginField = new SliderLabel(initialFirstTextField);
        passwordField = new SliderLabel(initialSecondTextField);
        accountsLabel = new SliderLabel(initialThirdTextField);
        accountsSlider = new AccountsSlider(sliderLength);
    }

    private void addSliderListener(){
        accountsSlider.addChangeListener(this);
    }

    public void panelSettings() {
        this.setOpaque(true);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(elementsPosition, horizontalGap, verticalGap));
        this.setBackground(SystemColors.getBackgroundColor());
        this.add(accountsLabel);
        this.add(accountsSlider);
        this.add(loginField);
        this.add(passwordField);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(sliderLength != 0){
            currentSliderPosition = accountsSlider.getValue();
            currentEncryptedServiceName = uniqueNames.get(currentSliderPosition);
            changeLabelName(currentEncryptedServiceName);
            changeLoginPasswordField(currentEncryptedServiceName);
        }
    }

    private void changeLabelName(String uniqueName) {
        String decryptedUniqueName = Cypher.decryptData(uniqueName, EncryptTypes.USER_SERVICE_NAME);
        accountsLabel.setText(decryptedUniqueName);
    }


    private void changeLoginPasswordField(String uniqueName) {
        LinkedList<String> loginPasswordData = accountsData.get(uniqueName);
        String currentEncryptedLogin = loginPasswordData.get(0);
        String currentEncryptedPassword = loginPasswordData.get(1);
        decryptTheData(currentEncryptedLogin, currentEncryptedPassword);
        int loginLength = currentDecryptedLogin.length();
        int passwordLength = currentDecryptedPassword.length();
        loginField.setText("*".repeat(loginLength));
        passwordField.setText("*".repeat(passwordLength));
    }


    private void decryptTheData(String encryptedLoginService, String encryptedPasswordService){
        currentDecryptedLogin = Cypher.decryptData(encryptedLoginService, EncryptTypes.USER_SERVICE_LOGIN);
        currentDecryptedPassword = Cypher.decryptData(encryptedPasswordService, EncryptTypes.USER_SERVICE_PASSWORD);
    }


    protected int getCurrentSliderPosition(){
        return currentSliderPosition;
    }

    protected String getCurrentEncryptedServiceName(){
        return currentEncryptedServiceName;
    }

    protected String getCurrentDecryptedLogin(){
        return currentDecryptedLogin;
    }

    protected String getCurrentDecryptedPassword(){
        return currentDecryptedPassword;
    }

}
