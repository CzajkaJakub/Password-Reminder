package com.company.UserFrame.UserDataSystem;

import java.io.*;

public class ReadUser {

    public static UserData readUserData(String login, String password) {
        File userDataPath = new File("src/register/" + login + "/" + password + "/data.ser");
        if (!userDataPath.exists()) {
            return new UserData(login, password);
        } else {
            try {
                FileInputStream data = new FileInputStream(userDataPath);
                ObjectInputStream readData = new ObjectInputStream(data);
                UserData userData = (UserData) readData.readObject();
                data.close();
                readData.close();
                return userData;
            } catch (IOException | ClassNotFoundException e) {
                DataSystemMessage.userError();
                return new UserData(login, password);
            }
        }
    }
}

