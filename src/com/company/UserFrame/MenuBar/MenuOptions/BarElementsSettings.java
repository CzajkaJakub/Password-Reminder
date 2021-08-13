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
    String setProfileImage = "Set your profile image";

    // Sec bar element
    ImageIcon accountsIcon = new ImageIcon("resources/Images/BarIcons/accountsIcon.png");
    String secondBarElement = "User";

    String addAccountOption = "Add account";
    String deleteAccountOption = "Delete Account";
    String changePassword = "Change Password of your accounts";
    String showAllAccounts = "Show all of your accounts";

    // Third bar element
    ImageIcon settingsIcon = new ImageIcon("resources/Images/BarIcons/settingsIcon.png");
    String thirdBarElement = "Settings";

    String backgroundChanger = "Change background color";
    String textChanger = "Change text color";

    // Fourth bar element
    ImageIcon informationIcon = new ImageIcon("resources/Images/BarIcons/informationIcon.png");
    String fourthBarElement = "Information";

    String information = "About program";

}
