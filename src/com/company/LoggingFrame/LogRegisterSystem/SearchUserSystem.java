package com.company.LoggingFrame.LogRegisterSystem;

import java.io.File;

public class SearchUserSystem {

    protected static boolean searchUserLogin(String login){
        String pth = "resources/register/" + login;
        File user = new File(pth);
        return user.exists();
    }

    protected static boolean searchUserPassword(String password, String login){
        String pth = "resources/register/" + login + "/" + password;
        File user = new File(pth);
        return user.exists();
    }

}
