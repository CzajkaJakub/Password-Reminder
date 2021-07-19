package com.company.userPanel.MenuBar.MenuActions.ColorSystem;

import com.company.messages.Messages;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SystemColors {
    public static Color backgroundColor;
    public static Color textColor;
    private static int rgbBackgroundColor;
    private static int rgbTextColor;

    private static final File colorFile = new File("src/com/company/userPanel/MenuBar/MenuActions/ColorSystem/colors.txt");

    public static void readColors() throws FileNotFoundException {
        Scanner colorsReader = new Scanner(colorFile);
        rgbBackgroundColor = colorsReader.nextInt();
        backgroundColor = new Color(rgbBackgroundColor);
        rgbTextColor = colorsReader.nextInt();
        textColor = new Color(rgbTextColor);
        colorsReader.close();
    }

    public static void changeBackgroundColor(){
        try {
            Color color = JColorChooser.showDialog(null, "Pick a color of background", Color.black);
            rgbBackgroundColor = color.getRGB();
            saveColors();
        }catch (Exception ignored){}
    }

    public static void changeTextColor(){
        try {
            Color color = JColorChooser.showDialog(null, "Pick a color of text", Color.WHITE);
            rgbTextColor = color.getRGB();
            saveColors();
        }catch (Exception ignored){}
    }

    public static void saveColors(){
        try {
            FileWriter colorSaver = new FileWriter(colorFile);
            String colorsText = rgbBackgroundColor + "\n" + rgbTextColor;
            colorSaver.write(colorsText);
            colorSaver.close();
            Messages.colorChanger();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
