package com.company.InformationSystem;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class InformationSystem {

    private static final String informationFilePath = "src/com/company/InformationSystem/Information.txt";

    public static void readInformation(){
        try {
            String text = Files.readString(Paths.get(informationFilePath));
            aboutProgram(text);
        } catch (IOException ignored) {}
    }

    private static void aboutProgram(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "About program!",
                JOptionPane.PLAIN_MESSAGE);
    }
}
