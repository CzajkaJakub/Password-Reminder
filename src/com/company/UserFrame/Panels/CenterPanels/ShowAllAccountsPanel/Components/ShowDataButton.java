package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components;

import com.company.Components.SubmitButton;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class ShowDataButton extends SubmitButton {
    public ShowDataButton(String text) {
        super(text);
        this.setBorder(BorderFactory.createMatteBorder(-10, 0, 0, 0, SystemColors.backgroundColor));
    }
}
