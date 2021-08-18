package com.company.UserFrame.MenuBar;

import com.company.ImageResize.ImageResize;
import com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.ChangePasswordPanel;
import com.company.UserFrame.Panels.CenterPanels.AddAccountPanel.AddAccountPanel;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.ShowAllAccountsPanel;
import com.company.UserFrame.Panels.CenterPanels.DeleteAccountPanel.DeleteAccountPanel;
import com.company.UserFrame.Panels.CenterPanels.ProfilePanel.CenterUserPanel;
import com.company.UserFrame.UserDataSystem.UserData;


import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.company.Main.userFrame;


public class BarFunctions {

    public static void addAccount(UserData data){
        userFrame.centerPanel.switchPanels(new AddAccountPanel(data));
    }

    public static void deleteAccount(UserData data) {
        userFrame.centerPanel.switchPanels(new DeleteAccountPanel(data));
    }

    public static void changePasswordOfYourAccounts(UserData data) {
        userFrame.centerPanel.switchPanels(new ChangePasswordPanel(data));
    }

    public static void showAllAccounts(UserData data) {
        userFrame.centerPanel.switchPanels(new ShowAllAccountsPanel(data));
    }

    public static void showProfilePanel(UserData data) {
        userFrame.centerPanel.switchPanels(new CenterUserPanel(data));
    }

    public static void changeProfileImage(UserData data) {

        JFileChooser imageChooser = new JFileChooser();
        imageChooser.setCurrentDirectory(new File("C://"));
        int response = imageChooser.showOpenDialog(null);

        if(response == JFileChooser.APPROVE_OPTION){

            String imagePath = String.valueOf(imageChooser.getSelectedFile().getAbsoluteFile());
            Path source = Paths.get(imagePath);

            String fileName = source.getFileName().toString();
            String fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf("."));

            Path target = Paths.get("resources/Images/ResizedImages/" + fileNameWithoutExtension + ".png");
            data.setImageIconPath(target.toString());

            try (InputStream is = new FileInputStream(source.toFile())) {
                Image image = new ImageIcon(imagePath).getImage();

                //scale the photo
                int imageWidth = image.getWidth(null);
                int imageHeight = image.getHeight(null);
                float max = Math.max(imageWidth, imageHeight);
                float scale = max/250;
                float resizedWidth = imageWidth/scale;
                float resizedHeight = imageHeight/scale;

                ImageResize.resize(is, target, (int)resizedWidth, (int)resizedHeight);
                userFrame.centerPanel.switchPanels(new CenterUserPanel(data));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
