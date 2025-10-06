package com.example.hellotest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    // get Current time
    public static String getCurrentDateTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
    public static String getCurrentDateTime(String pattern) {
        return new SimpleDateFormat(pattern).format(new Date());
    }

}