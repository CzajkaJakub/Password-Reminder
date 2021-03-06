package com.company.LoggingFrame.LogRegisterSystem;

import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.LoggingPanel;
import com.company.Main;
import com.company.Encryption.Cypher;
import com.company.Encryption.EncryptTypes;


public class LoggingSystem {

    public static void tryToLogin(){

        String login = LoggingPanel.loginTextField.getText();
        String password = LoggingPanel.passwordTextField.getText();

        if(!checkEmptyFields(login, password)){
            String encryptedLogin = Cypher.encryptData(login, EncryptTypes.USER_LOGIN);
            String encryptedPassword = Cypher.encryptData(password, EncryptTypes.USER_PASSWORD);
            logInSystem(encryptedLogin, encryptedPassword);
        }else{
            LoggingSystemMessages.emptyField();
        }
    }

    private static boolean checkEmptyFields(String login, String password) {
        return login.isBlank() || password.isBlank();
    }

    private static void logInSystem(String login, String password){
        if(SearchUserSystem.searchUser(login, password)){
            Main.destroyLoggingPanel();
            Main.createUserPanel(login, password);
        }else{
            LoggingSystemMessages.wrongData();
        }
    }
}
