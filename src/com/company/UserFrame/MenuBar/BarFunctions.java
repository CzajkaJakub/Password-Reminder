package com.company.UserFrame.MenuBar;

import ImageResize.ImageResize;
import com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.ChangePasswordPanel;
import com.company.UserFrame.Panels.CenterPanels.AddAccountPanel.AddAccountPanel;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.ShowAllAccountsPanel;
import com.company.UserFrame.Panels.CenterPanels.DeleteAccountPanel.DeleteAccountPanel;
import com.company.UserFrame.Panels.CenterPanels.ProfilePanel.CenterUserPanel;
import com.company.UserFrame.UserDataSystem.UserData;
import com.company.UserFrame.UserFrame.UserFrame;

import javax.swing.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class BarFunctions {

    public static void addAccount(UserData data){
        UserFrame.centerPanel.switchPanels(new AddAccountPanel(data));
    }

    public static void deleteAccount(UserData data) {
        UserFrame.centerPanel.switchPanels(new DeleteAccountPanel(data));
    }

    public static void changePasswordOfYourAccounts(UserData data) {
        UserFrame.centerPanel.switchPanels(new ChangePasswordPanel(data));
    }

    public static void showAllAccounts(UserData data) {
        UserFrame.centerPanel.switchPanels(new ShowAllAccountsPanel(data));
    }

    public static void showProfilePanel(UserData data) {
        UserFrame.centerPanel.switchPanels(new CenterUserPanel(data));
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
            Path target = Paths.get("src/Images/ResizedImages/" + fileNameWithoutExtension + ".png");
            data.setImageIconPath(target.toString());
            try (InputStream is = new FileInputStream(source.toFile())) {
                ImageResize.resize(is, target, 200, 200);
                UserFrame.centerPanel.switchPanels(new CenterUserPanel(data));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
