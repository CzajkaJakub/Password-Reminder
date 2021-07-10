package com.company;

import java.io.File;

public class SystemActions {
    public static void logInSystem(String login, String password){
        if(searchUserLogin(login)){
            if(searchUserPassword(password, login)) {
                Main.loggingFrame.dispose();
                //UserPanel(login, password); zalogowano
            }else{
                Messages.wrongPassword();
            }
        }else{
            Messages.wrongUser();
        }
    }

    public static void registerNewUser(){
        String login = Messages.registerInputLogin();
        String password;
        if(searchUserLogin(login)){
            Messages.userUnavailable();
        }else{
            password = Messages.registerInputPassword();
            createNewUser(login, password);
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
    }
}
