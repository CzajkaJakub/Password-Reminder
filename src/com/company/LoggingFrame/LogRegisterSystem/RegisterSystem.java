package com.company.LoggingFrame.LogRegisterSystem;

import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.LoggingPanel;
import com.company.Encryption.Cypher;
import com.company.Encryption.EncryptTypes;

import java.io.File;



public class RegisterSystem {

    public static void registerNewUser(){
        String login = LoggingPanel.loginTextField.getText();
        String password = LoggingPanel.passwordTextField.getText();

        if(!checkEmptyFields(login, password)){
            String encryptedLogin = Cypher.encryptData(login, EncryptTypes.USER_LOGIN);
            String encryptedPassword = Cypher.encryptData(password, EncryptTypes.USER_PASSWORD);
            searchAvailabilityUsers(encryptedLogin, encryptedPassword);
        }else{
            RegisterSystemMessages.emptyField();
        }
    }

    private static boolean checkEmptyFields(String login, String password) {
        return login.isBlank() || password.isBlank();
    }

    private static void searchAvailabilityUsers(String encryptedLogin, String encryptedPassword){
        if(SearchUserSystem.searchUser(encryptedLogin, encryptedPassword)){
            RegisterSystemMessages.userUnavailable();
        }else{
            createNewUser(encryptedLogin, encryptedPassword);
            RegisterSystemMessages.accountCreatedMessage();
        }
    }

    private static void createNewUser(String login, String password){
        String userPath = "resources/register/" + login + "/" + password;
        File user = new File(userPath);
        user.mkdirs();
    }
}
