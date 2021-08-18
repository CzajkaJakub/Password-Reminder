package com.company.ColorSystem;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SystemColors {

    private static Color backgroundColor;
    private static Color textColor;
    private static int rgbBackgroundColor;
    private static int rgbTextColor;

    static String backgroundChangerMessage = "Pick a color of background";
    static String foregroundChangerMessage = "Pick a color of text";


    private static final File colorFile = new File("resources/ColorSystem/colors.txt");


    public static void readColors() throws FileNotFoundException {
        Scanner colorsReader = new Scanner(colorFile);
        rgbBackgroundColor = colorsReader.nextInt();
        rgbTextColor = colorsReader.nextInt();
        backgroundColor = new Color(rgbBackgroundColor);
        textColor = new Color(rgbTextColor);
        colorsReader.close();
    }


    public static void changeBackgroundColor(){
        try {
            Color colorChoice = JColorChooser.showDialog(null, backgroundChangerMessage, Color.black);
            if(checkCancelButton(colorChoice)){
                backgroundColor = colorChoice;
                rgbBackgroundColor = backgroundColor.getRGB();
                SystemColorsMessages.colorChanger();
            }
        }catch (Exception ignored){}
    }


    public static void changeTextColor(){
        try {
            Color colorChoice = JColorChooser.showDialog(null, foregroundChangerMessage, Color.WHITE);
            if(checkCancelButton(colorChoice)) {
                textColor = colorChoice;
                rgbTextColor = textColor.getRGB();
                SystemColorsMessages.colorChanger();
            }
        }catch (Exception ignored){}
    }

    private static boolean checkCancelButton(Color colorOption) {
        return colorOption != null;
    }


    public static void saveColorsToFile(){
        try {
            FileWriter colorSaver = new FileWriter(colorFile);
            String dataColors = rgbBackgroundColor + "\n" + rgbTextColor;
            colorSaver.write(dataColors);
            colorSaver.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Color getBackgroundColor(){
        return backgroundColor;
    }

    public static Color getTextColor(){
        return textColor;
    }
}
