package com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel;



import com.company.UserFrame.Panels.CenterPanels.AbstractPanel;
import com.company.UserFrame.Panels.CenterPanels.PanelMethods;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.Components.ShowDataButton;
import com.company.UserFrame.UserData;
import com.company.systemActions.messages.SystemMessages;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class ShowAllAccountsPanel extends AbstractPanel implements PanelMethods, ChangeListener {

    private ShowDataButton showAccountDataButton;

    public ShowAllAccountsPanel(UserData data){
        super(data);
        showAccountDataButton = new ShowDataButton("Show data");
        this.add(showAccountDataButton);
        showAccountDataButton.addActionListener(e-> super.showServiceData());
    }
}
