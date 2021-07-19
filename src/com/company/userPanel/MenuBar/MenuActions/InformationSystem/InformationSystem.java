package com.company.userPanel.MenuBar.MenuActions.InformationSystem;

import com.company.messages.Messages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class InformationSystem {
    private static final String informationFilePath = "src/com/company/userPanel/MenuBar/MenuActions/InformationSystem/Information.txt";

    public static void readInformation(){
        try {
            String text = Files.readString(Paths.get(informationFilePath));
            Messages.aboutProgram(text);
        } catch (IOException ignored) {}
    }
}
