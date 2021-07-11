package com.company.userPanel;

import javax.swing.*;
import java.awt.*;

public class CenterUserPanel extends JPanel {
    CenterUserPanel(){
        this.setPreferredSize(new Dimension(100, 250));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 60));
        this.setBackground(Color.GREEN);
        this.setOpaque(true);
    }
}
