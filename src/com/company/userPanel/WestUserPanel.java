package com.company.userPanel;

import com.company.systemActions.SystemActions;

import javax.swing.*;
import java.awt.*;

public class WestUserPanel extends JPanel implements UserPanelElements{
    WestUserPanel(){
        buttonListeners();
        this.setPreferredSize(new Dimension(542, 100));
        this.setLayout(new GridLayout(4, 1, 0, 0));
        this.add(addAccountButton);
        this.add(showAccountsButton);
        this.add(deleteAnAccountButton);
        this.add(changePasswordButton);
        this.setBackground(Color.ORANGE);
        this.setOpaque(true);
    }

    private void buttonListeners(){
        addAccountButton.addActionListener(e -> SystemActions.addNewAccount());
        showAccountsButton.addActionListener(e -> SystemActions.showAccounts());
        deleteAnAccountButton.addActionListener(e -> SystemActions.deleteAnAccount());
        changePasswordButton.addActionListener(e -> SystemActions.changePassword());
    }
}
