package com.company.UserFrame;

import com.company.UserFrame.Panels.CenterPanel;
import com.company.UserFrame.Panels.CenterPanels.*;
import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;
import com.company.systemActions.messages.SystemMessages;

import java.awt.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

import static com.company.Main.userFrame;

public class UserData implements Serializable {

    private String decryptedLogin;
    private String decryptedPassword;
    private String encryptedLogin;
    private String encryptedPassword;
    private String userPath;
    private int amountOfAccounts;
    private HashMap<String, LinkedList<String>> accounts;
    private LinkedList<String> keys;

    public UserData(String login, String password, UserFrame frame) {
        readData(login, password);
    }

    private void readData(String login, String password) {
        decryptedLogin = Cypher.decryptData(login, EncryptTypes.USER_LOGIN);
        decryptedPassword = Cypher.decryptData(password, EncryptTypes.USER_PASSWORD);
        encryptedLogin = login;
        encryptedPassword = password;
        userPath = "src/register/" + encryptedLogin + "/" + encryptedPassword;
        accounts = new HashMap<>();
        keys = new LinkedList<>();
    }

    public String getEncryptedLogin(){
        return encryptedLogin;
    }

    public String getDecryptedLogin(){
        return decryptedLogin;
    }

    public String getDecryptedPassword(){ return decryptedPassword; }

    public String getEncryptedPassword(){ return encryptedPassword; }

    public int getAmountOfAccounts(){ return amountOfAccounts; }

    public HashMap<String, LinkedList<String>> getAccounts(){ return accounts; }

    public LinkedList<String> getKeys(){ return keys; };

    public String getUserPath() {
        return userPath;
    }

    public void addDataToAccount(String serviceName, String login, String password){
        LinkedList<String> dataOfServiceAccount = new LinkedList<>();
        dataOfServiceAccount.add(login);
        dataOfServiceAccount.add(password);
        keys.add(serviceName);
        accounts.put(serviceName, dataOfServiceAccount);
        amountOfAccounts += 1;
    }

    public void deleteServiceAccount(String uniqueName){
        amountOfAccounts -= 1;
        keys.remove(uniqueName);
        accounts.remove(uniqueName);
    }

    public void setNewPassword(String uniqueName, String newPassword) {
        accounts.get(uniqueName).set(1, Cypher.encryptData(newPassword, EncryptTypes.USER_SERVICE_PASSWORD));
    }
}
