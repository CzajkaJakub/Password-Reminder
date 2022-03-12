package com.company.LoggingFrame.LogRegisterSystem;

import java.io.File;

public class SearchUserSystem {

    protected static boolean searchUser(String login, String password){
        String pth = "resources/register/" + login + "/" + password;
        File user = new File(pth);
        return user.exists();
    }
}
