package com.company.LoggingFrame.LogRegisterSystem;

import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.LoggingPanel;
import com.company.Main;
import com.company.Encryption.Cypher;
import com.company.Encryption.EncryptTypes;


public class LoggingSystem {
    public static void tryToLogin(){
        String login = LoggingPanel.loginTextField.getText();
        String password = LoggingPanel.passwordTextField.getText();
        String encryptedLogin = Cypher.encryptData(login, EncryptTypes.USER_LOGIN);
        String encryptedPassword = Cypher.encryptData(password, EncryptTypes.USER_PASSWORD);
        logInSystem(encryptedLogin, encryptedPassword);
    }

    private static void logInSystem(String login, String password){
        if(SearchUserSystem.searchUserLogin(login)){
            if(SearchUserSystem.searchUserPassword(password, login)) {
                Main.destroyLoggingPanel();
                Main.createUserPanel(login, password);
            }else{
                LoggingSystemMessages.wrongPassword();
            }
        }else{
            LoggingSystemMessages.wrongUser();
        }
    }
}
