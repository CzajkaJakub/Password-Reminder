package com.company.userPanel;

import com.company.encryption.Cypher;
import com.company.encryption.EncryptTypes;
import com.company.messages.Messages;

import javax.swing.*;
import java.awt.*;

public class UserPanel extends JFrame implements UserPanelElements {
    private final String decryptedLogin;
    private final String decryptedPassword;

    private final String encryptedLogin;
    private final String encryptedPassword;

    public UserPanel(String login, String password) {
        decryptedLogin = Cypher.decrypt(login, EncryptTypes.USER_LOGIN);
        decryptedPassword = Cypher.decrypt(password, EncryptTypes.USER_PASSWORD);
        encryptedLogin = login;
        encryptedPassword = password;
        Messages.welcomeMessage(decryptedLogin);
        frameSettings();
    }

    private void frameSettings(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1000, 800));
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setIconImage(programIcon.getImage());
        this.setTitle("User panel");
        this.add(northUserPanel, BorderLayout.NORTH);
        this.add(southUserPanel, BorderLayout.SOUTH);
        this.add(centerUserPanel, BorderLayout.CENTER);
        this.add(westUserPanel, BorderLayout.WEST);
        this.setVisible(true);
    }


    public String getPassword() {
        return decryptedPassword;
    }

    public String getLogin() {
        return decryptedLogin;
    }
}
