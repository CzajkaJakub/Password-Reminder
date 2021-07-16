package com.company.encryption;

import java.util.HashMap;

public class Cypher {
    public static String encrypt(String textToEncrypt, EncryptTypes type) {
        HashMap<EncryptTypes, Integer> keys = new HashMap<>();{
            keys.put(EncryptTypes.USER_LOGIN, 3);
            keys.put(EncryptTypes.USER_PASSWORD, 5);
            keys.put(EncryptTypes.USER_SERVICE_NAME, 7);
            keys.put(EncryptTypes.USER_SERVICE_LOGIN, 9);
            keys.put(EncryptTypes.USER_SERVICE_PASSWORD, 11);
        }
        return encryptData(textToEncrypt, keys.get(type));
    }

    private static String encryptData(String textToEncrypt, int key){
        StringBuilder encryptedText = new StringBuilder();
        for(int i=0; i<textToEncrypt.length();i++){
            char characterToEncrypt = textToEncrypt.charAt(i);
            int valOfCharacterAfterEncryption = (int)characterToEncrypt + key;
            encryptedText.append(valOfCharacterAfterEncryption);
            encryptedText.append(".");
        }
        return encryptedText.toString();
    }

    public static String decrypt(String textToDecrypt, EncryptTypes type) {
        HashMap<EncryptTypes, Integer> keys = new HashMap<>();{
            keys.put(EncryptTypes.USER_LOGIN, -3);
            keys.put(EncryptTypes.USER_PASSWORD, -5);
            keys.put(EncryptTypes.USER_SERVICE_NAME, -7);
            keys.put(EncryptTypes.USER_SERVICE_LOGIN, -9);
            keys.put(EncryptTypes.USER_SERVICE_PASSWORD, -11);
        }
        return decryptData(textToDecrypt, keys.get(type));
    }

    private static String decryptData(String textToDecrypt, int key){
        String[] encryptedValues = textToDecrypt.split("\\.");
        StringBuilder encryptedText = new StringBuilder();
        for (String x : encryptedValues) {
            int valueOfChar = Integer.parseInt(x) + key;
            char decryptedChar = (char) valueOfChar;
            encryptedText.append(decryptedChar);
        }
        return encryptedText.toString();
    }



}
