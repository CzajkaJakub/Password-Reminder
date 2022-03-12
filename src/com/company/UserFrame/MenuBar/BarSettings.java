package com.company.UserFrame.MenuBar;


import java.awt.*;

public interface BarSettings {

    int displayBarType = FlowLayout.CENTER;
    int horizontalBarGap = 10;

    int topBorder = 0;
    int bottomBorder =2;
    int rightBorder = 0;
    int leftBorder = 0;

    int barWidth = 100;
    int barHeight = 53;

    Color borderColor = Color.gray;

    void barSettings();
    void createBarElements();
}
