package com.company.Encryption;

import java.util.HashMap;

public class Cypher {


    private static final HashMap<EncryptTypes, Integer> keys = new HashMap<>();

    static {
        keys.put(EncryptTypes.USER_LOGIN, 3);
        keys.put(EncryptTypes.USER_PASSWORD, 5);
        keys.put(EncryptTypes.USER_SERVICE_NAME, 7);
        keys.put(EncryptTypes.USER_SERVICE_LOGIN, 9);
        keys.put(EncryptTypes.USER_SERVICE_PASSWORD, 11);
    }

    public static String encryptData(String textToEncrypt, EncryptTypes type){
        int key = keys.get(type);
        StringBuilder encryptedText = new StringBuilder();
        for(int i=0; i<textToEncrypt.length(); i++){
            char characterToEncrypt = textToEncrypt.charAt(i);
            int valOfCharacterAfterEncryption = (int)characterToEncrypt + key;
            encryptedText.append(valOfCharacterAfterEncryption);
            encryptedText.append(".");
        }
        return encryptedText.toString();
    }

    public static String decryptData(String textToDecrypt, EncryptTypes type){
        int key = keys.get(type);
        String[] encryptedValues = textToDecrypt.split("\\.");
        StringBuilder encryptedText = new StringBuilder();
        for (String x : encryptedValues) {
            int valueOfChar = Integer.parseInt(x) - key;
            char decryptedChar = (char) valueOfChar;
            encryptedText.append(decryptedChar);
        }
        return encryptedText.toString();
    }



}
