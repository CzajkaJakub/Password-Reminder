package com.company.userPanel;

import com.company.StylizedJButton;
import com.company.userPanel.MenuBar.MenuBar;
import com.company.userPanel.Panels.CenterUserPanel;
import com.company.userPanel.Panels.SouthUserPanel;

import javax.swing.*;

public interface UserPanelElements {
    ImageIcon programIcon = new ImageIcon("src/images/programIcon.png");

    ImageIcon passwordReminderImage = new ImageIcon("src/images/passwordReminder.png");
    ImageIcon logOutImage = new ImageIcon("src/images/logOut.png");

    StylizedJButton logOutButton = new StylizedJButton(logOutImage, 283, 77);

    MenuBar userMenuBar = new MenuBar();

    SouthUserPanel southUserPanel = new SouthUserPanel();
    CenterUserPanel centerUserPanel = new CenterUserPanel();


}
