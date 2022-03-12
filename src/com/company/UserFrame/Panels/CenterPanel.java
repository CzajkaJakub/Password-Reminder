package com.company.UserFrame.Panels;

import com.company.ColorSystem.SystemColors;
import com.company.CommonElements.ImageLabel;

import javax.swing.*;
import java.awt.*;

import static com.company.GlobalSettings.GlobalImages.*;


public class CenterPanel extends JLayeredPane {

    public CenterPanel(){
        panelSettings();
    }

    private void panelSettings() {
        this.setBackground(SystemColors.getBackgroundColor());
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 2000, 30));
        this.setOpaque(true);
        this.add(new ImageLabel(passwordReminderImage));
        this.add(new ImageLabel(lockImage));
    }



    public void switchPanels(JPanel currentPanel){
        this.removeAll();
        this.add(currentPanel);
        this.repaint();
        this.revalidate();
    }
}
