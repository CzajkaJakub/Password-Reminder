package com.company.UserFrame.MenuBar;

import com.company.UserFrame.Panels.CenterPanels.*;
import com.company.UserFrame.Panels.CenterPanels.ChangePasswordAccountPanel.ChangePasswordPanel;
import com.company.UserFrame.Panels.CenterPanels.PanelComponents.AddAccountPanel.AddAccountPanel;
import com.company.UserFrame.Panels.CenterPanels.ShowAllAccountsPanel.ShowAllAccountsPanel;
import com.company.UserFrame.Panels.CenterPanels.deleteAccountPanel.DeleteAccountPanel;
import com.company.UserFrame.UserData;
import com.company.UserFrame.UserFrame;

public class BarFunctions {
    public static void addAccount(UserData data){
        UserFrame.centerPanel.switchPanels(new AddAccountPanel(data));
    }

    public static void deleteAccount(UserData data) {
        UserFrame.centerPanel.switchPanels(new DeleteAccountPanel(data));
    }

    public static void changePasswordOfYourAccounts(UserData data) {
        UserFrame.centerPanel.switchPanels(new ChangePasswordPanel(data));
    }

    public static void showAllAccounts(UserData data) {
        UserFrame.centerPanel.switchPanels(new ShowAllAccountsPanel(data));
    }

    public static void showProfilePanel(UserData data) {
        UserFrame.centerPanel.switchPanels(new CenterUserPanel(data));
    }

    public static void changeProfileImage() {
        System.out.println("zmieniam zdjecia");
    }

    public static void deleteUser() {
        System.out.println("kasuje konto");
    }

    public static void changeProfilePassword() {
        System.out.println("zmieniam haslo konta");
    }



}
