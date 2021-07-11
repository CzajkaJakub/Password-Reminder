package com.company.userPanel;

import com.company.StylizedJButton;

import javax.swing.*;

public interface UserPanelElements {
    ImageIcon programIcon = new ImageIcon("src/images/programIcon.png");

    ImageIcon passwordReminderImage = new ImageIcon("src/images/passwordReminder.png");
    ImageIcon logOutImage = new ImageIcon("src/images/logOut.png");
    ImageIcon addNewAccount = new ImageIcon("src/images/addAccount.png");
    ImageIcon showMyAccounts = new ImageIcon("src/images/showAccounts.png");
    ImageIcon deleteAnAccount = new ImageIcon("src/images/deleteAnAccount.png");
    ImageIcon changePassword = new ImageIcon("src/images/changePassword.png");

    StylizedJButton logOutButton = new StylizedJButton(logOutImage, 283, 77);
    StylizedJButton addAccountButton = new StylizedJButton(addNewAccount, 500, 77);
    StylizedJButton showAccountsButton = new StylizedJButton(showMyAccounts, 542, 77);
    StylizedJButton deleteAnAccountButton = new StylizedJButton(deleteAnAccount, 552, 77);
    StylizedJButton changePasswordButton = new StylizedJButton(changePassword, 502, 77);

    NorthUserPanel northUserPanel = new NorthUserPanel();
    SouthUserPanel southUserPanel = new SouthUserPanel();
    CenterUserPanel centerUserPanel = new CenterUserPanel();
    WestUserPanel westUserPanel = new WestUserPanel();


}
