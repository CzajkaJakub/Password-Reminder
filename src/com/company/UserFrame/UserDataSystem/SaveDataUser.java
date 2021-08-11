package com.company.UserFrame.UserDataSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveDataUser {

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
}
