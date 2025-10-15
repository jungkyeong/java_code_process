package com.example.hellotest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    // get Current time
    public static String getCurrentDateTime() {
        return new SimpleDateFormat("yyyy.MM.dd HH'시':mm'분':ss'초' ").format(new Date());
    }
}