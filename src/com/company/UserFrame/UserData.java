package com.company.UserFrame;

import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;
import com.company.systemActions.messages.SystemMessages;

import java.io.Serializable;
import java.util.HashMap;

public class UserData implements Serializable {

    private final String decryptedLogin;
    private final String decryptedPassword;
    private final String encryptedLogin;
    private final String encryptedPassword;
    private final String userPath;
    private int amountOfAccounts;
    private HashMap<String, String> accounts;

    public UserData(String login, String password) {
        decryptedLogin = Cypher.decryptData(login, EncryptTypes.USER_LOGIN);
        decryptedPassword = Cypher.decryptData(password, EncryptTypes.USER_PASSWORD);
        encryptedLogin = login;
        encryptedPassword = password;
        userPath = "src/register/" + encryptedLogin + "/" + encryptedPassword;
        accounts = new HashMap<>();
        SystemMessages.welcomeMessage(decryptedLogin);
    }

    public String getDecryptedLogin(){
        return decryptedLogin;
    }

    public String getDecryptedPassword() {
        return decryptedPassword;
    }

    public String getEncryptedLogin() {
        return encryptedLogin;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public String getUserPath() {
        return userPath;
    }

    public int getAmountOfAccounts(){
        return amountOfAccounts;
    }



    public void addAccount(){
        amountOfAccounts += 1;
    }


}
