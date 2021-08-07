package com.company.UserFrame;

import com.company.UserFrame.Panels.CenterPanel;
import com.company.UserFrame.Panels.CenterPanels.*;
import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;
import com.company.systemActions.messages.SystemMessages;

import java.awt.*;
import java.io.Serializable;
import java.util.HashMap;

import static com.company.Main.userFrame;

public class UserData implements Serializable {

    private String decryptedLogin;
    private String decryptedPassword;
    private String encryptedLogin;
    private String encryptedPassword;
    private String userPath;
    private int amountOfAccounts;
    private HashMap<String, String> accounts;
    private UserFrame frame;

    public UserData(String login, String password, UserFrame frame) {
        readData(login, password, frame);
        SystemMessages.welcomeMessage(decryptedLogin);
    }

    private void readData(String login, String password, UserFrame frame) {
        this.frame = frame;
        decryptedLogin = Cypher.decryptData(login, EncryptTypes.USER_LOGIN);
        decryptedPassword = Cypher.decryptData(password, EncryptTypes.USER_PASSWORD);
        encryptedLogin = login;
        encryptedPassword = password;
        userPath = "src/register/" + encryptedLogin + "/" + encryptedPassword;
        accounts = new HashMap<>();
    }

    public void addAccount(){
        frame.centerPanel.switchPanels(new AddAccountPanel());
    }

    public void deleteAccount() {
        frame.centerPanel.switchPanels(new DeleteAccountPanel());
    }


    public void changePasswordOfYourAccounts() {
        frame.centerPanel.switchPanels(new ChangePasswordPanel());
    }

    public void showAllAccounts() {
        frame.centerPanel.switchPanels(new ShowAllAccountsPanel());
    }

    public void showProfilePanel() {
        frame.centerPanel.switchPanels(new CenterUserPanel());
    }

    public void changeProfileImage() {
        System.out.println("zmieniam zdjecia");
    }

    public void deleteUser() {
        System.out.println("kasuje konto");
    }

    public void changeProfilePassword() {
        System.out.println("zmieniam haslo konta");
    }

    public String getDecryptedLogin(){
        return decryptedLogin;
    }

    public String getUserPath() {
        return userPath;
    }

}
