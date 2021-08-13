package com.company.UserFrame.Panels.CenterPanels.ProfilePanel;


import com.company.ColorSystem.SystemColors;
import com.company.Elements.ImageLabel;
import com.company.UserFrame.DatePanel.DatePanel;
import com.company.UserFrame.Panels.CenterPanels.ProfilePanel.Elements.ProfileLabel;
import com.company.UserFrame.UserDataSystem.UserData;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class CenterUserPanel extends JPanel implements ProfilePanelSettings {

    private ImageIcon profileImage;
    private ProfileLabel clock;
    private ProfileLabel amountOfAccountsLabel;

    public CenterUserPanel(UserData userData){
        createElements(userData);
        panelSettings();
        createClock();
    }

    private void createElements(UserData userData) {
        String imageIconPath = userData.getImageIconPath();
        if(!new File(imageIconPath).exists()){
            imageIconPath = "resources/Images/BarIcons/profileImage.png";
        }
        String amountOfAccountsLabelText = "Accounts in system : " + userData.getAmountOfAccounts();
        profileImage = new ImageIcon(imageIconPath);
        amountOfAccountsLabel = new ProfileLabel(amountOfAccountsLabelText);
        clock = new ProfileLabel(DatePanel.getData());
    }

    public void panelSettings(){
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(elementsPosition, horizontalGap, verticalGap));
        this.setBackground(SystemColors.backgroundColor);
        this.setOpaque(true);
        this.setVisible(true);
        this.add(new ImageLabel(profileImage));
        this.add(amountOfAccountsLabel);
        this.add(clock);
    }

    private void createClock() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                createClockLabel();
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    private void createClockLabel() {
        this.remove(clock);
        clock = new ProfileLabel(DatePanel.getData());
        this.add(clock);
        repaint();
        revalidate();
    }
}
