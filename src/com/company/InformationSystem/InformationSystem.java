package com.company.InformationSystem;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class InformationSystem {

    private static final String informationFilePath = "resources/InformationSystem/Information.txt";

    public static void readInformation(){
        try {
            String text = Files.readString(Paths.get(informationFilePath));
            aboutProgram(text);
        } catch (IOException ignored) {}
    }

    private static void aboutProgram(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "Program Information!",
                JOptionPane.PLAIN_MESSAGE);
    }
}
