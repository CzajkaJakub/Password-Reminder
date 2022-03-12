package com.company.UserFrame.Panels.CenterPanels.AddAccountPanel.Components;

import com.company.ColorSystem.SystemColors;
import com.company.CommonElements.SubmitButton;

import javax.swing.*;
import java.awt.*;

import static com.company.LoggingFrame.LoggingFrameSettings.registerNoIcon;

public class SaveAccountButton extends SubmitButton {

    static final String buttonIconPath = "resources/Images/BarIcons/saveAccount.png";

    public SaveAccountButton(String text) {
        super(text);
        this.setOpaque(true);
        this.setBackground(SystemColors.getBackgroundColor());
        this.setIcon(new ImageIcon(buttonIconPath));
    }
}
