package com.company.UserFrame.UserDataSystem;

import com.company.Encryption.Cypher;
import com.company.Encryption.EncryptTypes;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

public class UserData implements Serializable {

    private String decryptedLogin;

    //future useful methods will be added
    private String decryptedPassword;
    private String encryptedLogin;
    private String encryptedPassword;
    //

    private String userPath;
    private int amountOfAccounts;
    private HashMap<String, LinkedList<String>> accounts;
    private LinkedList<String> keys;
    private String imageIconPath = "resources/Images/BarIcons/profileImage.png";

    public UserData(String login, String password) {
        readData(login, password);
    }

    private void readData(String login, String password) {
        decryptedLogin = Cypher.decryptData(login, EncryptTypes.USER_LOGIN);
        decryptedPassword = Cypher.decryptData(password, EncryptTypes.USER_PASSWORD);
        encryptedLogin = login;
        encryptedPassword = password;
        userPath = "resources/register/" + encryptedLogin + "/" + encryptedPassword;
        accounts = new HashMap<>();
        keys = new LinkedList<>();
    }


    public String getDecryptedLogin(){
        return decryptedLogin;
    }

    public int getAmountOfAccounts(){ return amountOfAccounts; }

    public HashMap<String, LinkedList<String>> getAccounts(){ return accounts; }

    public LinkedList<String> getKeys(){ return keys; }

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


    public void setNewPassword(String uniqueName, String newPassword) {
        accounts.get(uniqueName).set(1, Cypher.encryptData(newPassword, EncryptTypes.USER_SERVICE_PASSWORD));
    }


    public void deleteServiceAccount(String uniqueName){
        keys.remove(uniqueName);
        accounts.remove(uniqueName);
        amountOfAccounts -= 1;
    }

    public String getImageIconPath() {
        return imageIconPath;
    }

    public void setImageIconPath(String path){
        imageIconPath = path;
    }
}
