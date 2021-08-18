package com.company.GlobalSettings;

import javax.swing.*;

import java.awt.*;

import static com.company.GlobalSettings.GlobalImages.imageIcon;

public interface FrameSettings {

    int defaultOperationOnClose = JFrame.EXIT_ON_CLOSE;
    Image programIcon = imageIcon.getImage();

}
