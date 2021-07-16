package com.company.systemActions;

import com.company.Main;
import com.company.encryption.Cypher;
import com.company.encryption.EncryptTypes;
import com.company.loginFrame.LoggingFrame;
import com.company.userPanel.UserPanel;
import com.company.messages.Messages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SystemActions {

    private static UserPanel userPanel;

    public static void logInSystem(String login, String password){
        if(searchUserLogin(login)){
            if(searchUserPassword(password, login)) {
                Main.loggingFrame.dispose();
                userPanel = new UserPanel(login, password);
            }else{
                Messages.wrongPassword();
            }
        }else{
            Messages.wrongUser();
        }
    }

    public static void registerNewUser(String login, String password){

        String encryptedLogin = Cypher.encrypt(login, EncryptTypes.USER_LOGIN);
        String encryptedPassword = Cypher.encrypt(password, EncryptTypes.USER_PASSWORD);

        if(searchUserLogin(encryptedLogin)){
            Messages.userUnavailable();
        }else{
            createNewUser(encryptedLogin, encryptedPassword);
            Messages.accountCreatedMessage();
        }
    }

    private static boolean searchUserLogin(String login){
        String pth = "src/register/" + login;
        File user = new File(pth);
        return user.exists();
    }

    private static boolean searchUserPassword(String password, String login){
        String pth = "src/register/" + login + "/" + password;
        File user = new File(pth);
        return user.exists();
    }

    private static void createNewUser(String login, String password){
        String pth = "src/register/" + login + "/" + password;
        File user = new File(pth);
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

    public static void logout(){
        if(Messages.confirmationOfLogout() == 0){
            userPanel.dispose();
            Main.loggingFrame = new LoggingFrame();
        }
    }
}
