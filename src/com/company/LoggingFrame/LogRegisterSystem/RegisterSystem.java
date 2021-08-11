package com.company.LoggingFrame.LogRegisterSystem;

import com.company.LoggingFrame.LogginFramePanels.CenterPanelElements.LoggingPanel;
import com.company.Encryption.Cypher;
import com.company.Encryption.EncryptTypes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegisterSystem {

    public static void registerNewUser(){
        String login = LoggingPanel.loginTextField.getText();
        String password = LoggingPanel.passwordTextField.getText();
        String encryptedLogin = Cypher.encryptData(login, EncryptTypes.USER_LOGIN);
        String encryptedPassword = Cypher.encryptData(password, EncryptTypes.USER_PASSWORD);

        if(SearchUserSystem.searchUserLogin(encryptedLogin)){
            LoggingSystemMessages.userUnavailable();
        }else{
            createNewUser(encryptedLogin, encryptedPassword);
            LoggingSystemMessages.accountCreatedMessage();
        }
    }

    private static void createNewUser(String login, String password){
        String userPath = "src/register/" + login + "/" + password;
        File user = new File(userPath);
        user.mkdirs();
        hideData(login, password);
    }

    private static void hideData(String login, String password){

        String pthRegister = "src/register";
        String pthLogin = "src/register/" + login;
        String pthPassword = "src/register/" + login + "/" + password;
        Path pathRegister = Paths.get(pthRegister);
        Path pathLogin = Paths.get(pthLogin);
        Path pathPassword = Paths.get(pthPassword);
        try {
            Files.setAttribute(pathRegister, "dos:hidden", Boolean.TRUE, LinkOption.NOFOLLOW_LINKS);
            Files.setAttribute(pathLogin, "dos:hidden", Boolean.TRUE, LinkOption.NOFOLLOW_LINKS);
            Files.setAttribute(pathPassword, "dos:hidden", Boolean.TRUE, LinkOption.NOFOLLOW_LINKS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
