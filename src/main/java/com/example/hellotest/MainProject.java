// program run
// compile: javac MainProject.java
// run: java MainProject

package com.example.hellotest; // package 

import com.example.util.UtilClass; // add util class

public class MainProject {

    // test print
    public static String getMessage() {
        return "Hello, Maven World!";
    }

    // main function
    public static void main(String[] args) {

        System.out.println(getMessage()); // test print
        System.out.println("Current Time: " + DateUtil.getCurrentDateTime()); // get current time

        UtilClass.UtilPrint("=== This is from UtilClass ===");
    }
}