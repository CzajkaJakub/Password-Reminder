package com.company.UserFrame.DatePanel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePanel {

    public static String getDataOfLogin(){
        String dataPattern = "E, dd MMM yyyy HH:mm:ss z";
        SimpleDateFormat simpleDate = new SimpleDateFormat(dataPattern);
        return simpleDate.format(new Date());
    }

    public static String getData(){
        String dataPattern = "HH:mm:ss";
        SimpleDateFormat simpleDate = new SimpleDateFormat(dataPattern);
        return simpleDate.format(new Date());
    }
}
