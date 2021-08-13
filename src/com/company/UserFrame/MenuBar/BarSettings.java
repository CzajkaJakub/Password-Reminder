package com.company.UserFrame.MenuBar;

import java.awt.*;

public interface BarSettings {

    int displayBarType = FlowLayout.CENTER;
    int horizontalBarGap = 70;

    int topBorder = 0;
    int bottomBorder = 1;
    int rightBorder = 0;
    int leftBorder = 0;

    int barWidth = 100;
    int barHeight = 50;

    Color borderColor = Color.GRAY;

    void barSettings();
    void createBarElements();
}
