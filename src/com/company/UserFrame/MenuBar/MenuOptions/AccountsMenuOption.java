package com.company.UserFrame.MenuBar.MenuOptions;

import com.company.UserFrame.UserData;
import com.company.systemActions.ColorSystem.SystemColors;

import javax.swing.*;
import java.awt.*;

public class AccountsMenuOption extends JMenu implements BarElementsSettings {

    private JMenuItem addAccount;
    private JMenuItem deleteAccount;
    private JMenuItem changePasswordAccount;
    private JMenuItem showAccount;

    public AccountsMenuOption() {
        createBarElements();
        barSettings();
    }

    @Override
    public void createBarElements() {
        addAccount = new JMenuItem("Add Account");
        deleteAccount = new JMenuItem("Delete Account");
        changePasswordAccount = new JMenuItem("Change Password of your accounts");
        showAccount = new JMenuItem("Show all of your accounts");
    }

    @Override
    public void barSettings() {
        this.setText("Accounts");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(SystemColors.textColor);
        this.add(addAccount);
        this.add(deleteAccount);
        this.add(changePasswordAccount);
        this.add(showAccount);
    }

    @Override
    public void addListeners() {

    }

    public void addListeners(UserData data) {
        addAccount.addActionListener(e->data.addAccount());

        ////////////////// zayebiscie
        System.out.println("dodano");
        System.out.println(data.getDecryptedPassword());
        System.out.println(data.getDecryptedLogin());
        System.out.println(data.getUserPath());
        System.out.println(data.getAmountOfAccounts());
    }
}