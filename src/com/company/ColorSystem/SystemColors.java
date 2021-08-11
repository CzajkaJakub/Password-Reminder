package com.company.ColorSystem;

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

    static String backgroundChangerMessage = "Pick a color of background";
    static String foregroundChangerMessage = "Pick a color of text";


    private static final File colorFile = new File("src/com/company/ColorSystem/colors.txt");


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
            backgroundColor = JColorChooser.showDialog(null, backgroundChangerMessage, Color.black);
            rgbBackgroundColor = backgroundColor.getRGB();
            saveColors();
        }catch (Exception ignored){}
    }


    public static void changeTextColor(){
        try {
            textColor = JColorChooser.showDialog(null, foregroundChangerMessage, Color.WHITE);
            rgbTextColor = textColor.getRGB();
            saveColors();
        }catch (Exception ignored){}
    }


    public static void saveColors(){
        try {
            FileWriter colorSaver = new FileWriter(colorFile);
            String colorsText = rgbBackgroundColor + "\n" + rgbTextColor;
            colorSaver.write(colorsText);
            colorSaver.close();
            SystemColorsMessages.colorChanger();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
