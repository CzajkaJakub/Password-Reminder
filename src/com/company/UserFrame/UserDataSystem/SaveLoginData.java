package com.company.UserFrame.UserDataSystem;

import com.company.UserFrame.DatePanel.DatePanel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveLoginData {

    public static void saveLoginHistory(String path){
        String date = DatePanel.getDataOfLogin();
        String loggingDataPath = path + "/loginRecords.txt";
        File loginRecords = new File(loggingDataPath);
        saveData(date, loginRecords);
    }

    private static void saveData(String date, File loginRecords){
        try {
            FileWriter writeData = new FileWriter(loginRecords, true);
            if(loginRecords.exists()){
                writeData.append(date).append("\n");
            }else{
                writeData.write(date);
            }
            writeData.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
