package com.example.hellotest;

// JUnit5 TEST module import
import org.junit.jupiter.api.Test; // test annotation
import static org.junit.jupiter.api.Assertions.*; // define use function

public class DateUtilTest {

    @Test
    public void testGetCurrentDateTime() {
        String dateTime = DateUtil.getCurrentDateTime();
        assertNotNull(dateTime);
        assertFalse(dateTime.isEmpty());
    }
    
}
