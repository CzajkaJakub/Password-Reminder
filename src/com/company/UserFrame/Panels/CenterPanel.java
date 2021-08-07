package com.company.UserFrame.Panels;




import com.company.UserFrame.Panels.CenterPanels.*;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JLayeredPane {

    private CenterUserPanel centerUserPanel;

    public CenterPanel(){
        createElements();
        panelSettings();
    }

    private void createElements() {
        centerUserPanel = new CenterUserPanel();
    }

    private void panelSettings() {
        this.setLayout(new CardLayout(0,0));
        this.setOpaque(true);
        this.setVisible(true);
        this.add(centerUserPanel);
    }

    public void switchPanels(JPanel a){
        this.removeAll();
        this.add(a);
        this.repaint();
        this.revalidate();
    }


}
