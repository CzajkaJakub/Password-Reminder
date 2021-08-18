package com.company.UserFrame.MenuBar.MenuOptions;

import javax.swing.*;
import java.awt.*;

public interface BarElementsSettings {

    String fontType = "MV Boli";
    int fontSize = 25;
    int fontStyle = Font.BOLD;


    // First bar element
    ImageIcon userIcon = new ImageIcon("resources/Images/BarIcons/userIcon.png");
    String firstBarElement = "Accounts";

    String showProfile = "Profile";
    ImageIcon showProfileIcon = new ImageIcon("resources/Images/BarElementsIcons/showProfileIcon.png");
    String setProfileImage = "Set your profile image";
    ImageIcon setYourProfilePhoto = new ImageIcon("resources/Images/BarElementsIcons/setYourProfilePhoto.png");


    // Sec bar element
    ImageIcon accountsIcon = new ImageIcon("resources/Images/BarIcons/accountsIcon.png");
    String secondBarElement = "User";

    String addAccountOption = "Add account";
    ImageIcon addAccountIcon = new ImageIcon("resources/Images/BarElementsIcons/addAccountIcon.png");
    String deleteAccountOption = "Delete Account";
    ImageIcon deleteAccountIcon = new ImageIcon("resources/Images/BarElementsIcons/deleteAccountIcon.png");
    String changePassword = "Change Password of your accounts";
    ImageIcon changePasswordIcon = new ImageIcon("resources/Images/BarElementsIcons/changePasswordIcon.png");
    String showAllAccounts = "Show all of your accounts";
    ImageIcon showAllAccountsIcon = new ImageIcon("resources/Images/BarElementsIcons/showAllAccountsIcon.png");

    // Third bar element
    ImageIcon settingsIcon = new ImageIcon("resources/Images/BarIcons/settingsIcon.png");
    String thirdBarElement = "Settings";

    String backgroundChanger = "Change background color";
    ImageIcon backgroundColorIcon = new ImageIcon("resources/Images/BarElementsIcons/backgroundColorIcon.png");
    String textChanger = "Change text color";
    ImageIcon textColorIcon = new ImageIcon("resources/Images/BarElementsIcons/textColorIcon.png");

    // Fourth bar element
    ImageIcon informationIcon = new ImageIcon("resources/Images/BarIcons/informationIcon.png");
    String fourthBarElement = "Information";

    String information = "About program";
    ImageIcon informationBarElementIcon = new ImageIcon("resources/Images/BarElementsIcons/informationBarElementIcon.png");


}
