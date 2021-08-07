package com.company.systemActions;

import com.company.Main;
import com.company.UserFrame.UserData;
import com.company.systemActions.encryption.Cypher;
import com.company.systemActions.encryption.EncryptTypes;
import com.company.systemActions.messages.SystemMessages;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemActions {


    public static void logInSystem(String login, String password){
        if(searchUserLogin(login)){
            if(searchUserPassword(password, login)) {
                Main.destroyLoggingPanel();
                Main.createUserPanel(login, password);
            }else{
                SystemMessages.wrongPassword();
            }
        }else{
            SystemMessages.wrongUser();
        }
    }

    public static void registerNewUser(String login, String password){

        String encryptedLogin = Cypher.encryptData(login, EncryptTypes.USER_LOGIN);
        String encryptedPassword = Cypher.encryptData(password, EncryptTypes.USER_PASSWORD);

        if(searchUserLogin(encryptedLogin)){
            SystemMessages.userUnavailable();
        }else{
            createNewUser(encryptedLogin, encryptedPassword);
            SystemMessages.accountCreatedMessage();
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

    public static void logout() {
        if(SystemMessages.confirmationOfLogout() == 0){
            Main.destroyUserPanel();
            Main.createLoggingPanel();
        }
    }

    public static void saveUser(UserData userData) {
        try{
            String dataPath = userData.getUserPath() + "/data.ser";
            FileOutputStream data = new FileOutputStream(dataPath);
            ObjectOutputStream saveData = new ObjectOutputStream(data);
            saveData.writeObject(userData);
            userData.getUserPath();
            data.close();
            saveData.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getDataOfLogin(){
        String dataPattern = "E, dd MMM yyyy HH:mm:ss z";
        SimpleDateFormat simpleDate = new SimpleDateFormat(dataPattern);
        return simpleDate.format(new Date());
    }


}
