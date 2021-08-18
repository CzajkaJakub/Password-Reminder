package com.company.InformationSystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class InformationSystem {

    private static final String informationFilePath = "resources/InformationSystem/Information.txt";

    public static void readInformationFromFile(){
        try {
            String information = Files.readString(Paths.get(informationFilePath));
            InformationSystemMessage.aboutProgram(information);
        } catch (IOException ignored) {}
    }
}
