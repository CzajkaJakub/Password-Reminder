package com.company.UserFrame;

import com.company.UserFrame.MenuBar.MenuBar;
import com.company.UserFrame.Panels.CenterUserPanel;
import com.company.UserFrame.Panels.SouthUserPanel;
import com.company.systemActions.SystemActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;


public class UserFrame extends JFrame {

    private static final ImageIcon programIcon = new ImageIcon("src/images/programIcon.png");

    private MenuBar userMenuBar;
    private SouthUserPanel southUserPanel;
    private CenterUserPanel centerUserPanel;
    private UserData userData;


    public UserFrame(String login, String password) {
        readUserData(login, password);
        saveLoginHistory();
        createPanels();
        frameSettings();
        addDataToBarElements();
    }

    private void addDataToBarElements() {
        userMenuBar.accounts.addListeners(userData);
    }

    private void createPanels() {
        userMenuBar = new MenuBar();
        southUserPanel = new SouthUserPanel();
        centerUserPanel = new CenterUserPanel();
    }

    private void frameSettings(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1050, 800));
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setIconImage(programIcon.getImage());
        this.setTitle("Password reminder - User panel: " + userData.getDecryptedLogin());
        this.add(southUserPanel, BorderLayout.SOUTH);
        this.add(centerUserPanel, BorderLayout.CENTER);
        this.setJMenuBar(userMenuBar);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                SystemActions.saveUser(userData);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                SystemActions.saveUser(userData);
            }
        });

    }

    private void readUserData(String login, String password) {
        File userDataPath = new File("src/register/" + login + "/" + password + "/data.ser");
        if(!userDataPath.exists()){
            userData = new UserData(login, password);
        }else{
            try{
                FileInputStream data = new FileInputStream(userDataPath);
                ObjectInputStream readData = new ObjectInputStream(data);
                userData = (UserData) readData.readObject();
                data.close();
                readData.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveLoginHistory(){
        String date = SystemActions.getDataOfLogin();
        String loggingDataPath = userData.getUserPath() + "/loginRecords.txt";
        File loginRecords = new File( loggingDataPath);
        saveData(date, loginRecords);
    }

    private void saveData(String date, File loginRecords){
        try {
            FileWriter writeData = new FileWriter(loginRecords, true);
            if(loginRecords.exists()){
                writeData.append(date).append("\n");
            }else{
                writeData.write(date);
            }
            writeData.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
