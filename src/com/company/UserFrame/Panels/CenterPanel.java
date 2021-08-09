package com.company.UserFrame.Panels;




import com.company.UserFrame.Panels.CenterPanels.*;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

import static com.company.Main.userFrame;

public class CenterPanel extends JLayeredPane {

    public CenterPanel(){
        panelSettings();
    }

    private void panelSettings() {
        this.setBackground(SystemColors.backgroundColor);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
        this.setOpaque(true);
    }

    public void switchPanels(JPanel a){
        this.removeAll();
        this.add(a);
        this.repaint();
        this.revalidate();
    }
}
