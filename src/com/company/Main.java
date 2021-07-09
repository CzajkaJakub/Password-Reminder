package com.company;

public class Main {
    public static LoggingFrame loggingFrame;
    public static void main(String[] args) {
        loggingFrame = new LoggingFrame();
    }

    public static void logInSystem(String login, String password){
        if(true){
            loggingFrame.dispose();
            System.out.println("zalogowano");
        }
    }
}
