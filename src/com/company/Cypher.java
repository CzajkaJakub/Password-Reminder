package com.company;


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
        StringBuilder encryptedText = new StringBuilder(textToEncrypt.length());
        for(int i=0; i<textToEncrypt.length();i++){
            char characterToEncrypt = textToEncrypt.charAt(i);
            int valOfCharacterAfterEncryption = (int)characterToEncrypt + key;
            if(valOfCharacterAfterEncryption>126) valOfCharacterAfterEncryption -= 94;
            encryptedText.append((char)valOfCharacterAfterEncryption);
        }
        System.out.println(encryptedText.toString());
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
        return encryptData(textToDecrypt, keys.get(type));
    }

    private static String decryptData(String textToDecrypt, int key){
        StringBuilder decryptedText = new StringBuilder(textToDecrypt.length());
        for(int i=0; i<textToDecrypt.length();i++){
            char characterToEncrypt = textToDecrypt.charAt(i);
            int valOfCharacterAfterEncryption = (int)characterToEncrypt + key;
            if(valOfCharacterAfterEncryption<33) valOfCharacterAfterEncryption += 94;
            decryptedText.append((char)valOfCharacterAfterEncryption);
            System.out.println((char)valOfCharacterAfterEncryption);
        }
        return decryptedText.toString();
    }



}
