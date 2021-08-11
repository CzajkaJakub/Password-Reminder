package com.company.StaticSettings;

import javax.swing.*;

import java.awt.*;

import static com.company.StaticSettings.StaticImages.imageIcon;

public interface FrameSettings {

    int defaultOperationOnClose = JFrame.EXIT_ON_CLOSE;
    Image programIcon = imageIcon.getImage();
}
