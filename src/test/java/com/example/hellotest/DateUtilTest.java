package com.example.hellotest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateUtilTest {

    @Test
    void testDefaultDateTimeFormat() {
        String dateTime = DateUtil.getCurrentDateTime();
        // yyyy-MM-dd HH:mm:ss 형식 확인
        assertTrue(dateTime.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
    }

    @Test
    void testCustomDateTimeFormat() {
        String pattern = "yyyy/MM/dd";
        String dateTime = DateUtil.getCurrentDateTime(pattern);
        assertTrue(dateTime.matches("\\d{4}/\\d{2}/\\d{2}"));
    }
}