package com.company.UserFrame.Panels.CenterPanels.deleteAccountPanel;

import com.company.UserFrame.Panels.CenterPanels.AbstractPanel;
import com.company.UserFrame.Panels.CenterPanels.PanelMethods;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components.ShowDataButton;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.ShowAllAccountsPanel;
import com.company.UserFrame.Panels.CenterPanels.deleteAccountPanel.Components.DeleteAccountButton;
import com.company.UserFrame.UserData;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class DeleteAccountPanel extends AbstractPanel implements PanelMethods, ChangeListener {

    private DeleteAccountButton deleteAccountDataButton;

    public DeleteAccountPanel(UserData data){
        super(data);
        deleteAccountDataButton = new DeleteAccountButton("Delete account");
        this.add(deleteAccountDataButton);
        deleteAccountDataButton.addActionListener(e-> super.deleteServiceData());
    }
}
