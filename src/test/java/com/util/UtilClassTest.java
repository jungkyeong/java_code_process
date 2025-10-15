package com.util;

// JUnit5 TEST module import
import org.junit.jupiter.api.Test; // test annotation
import static org.junit.jupiter.api.Assertions.*; // define use function

public class UtilClassTest {

    @Test
    public void testUtilPrint() {
        String pattern = "Test Pattern";
        String result = UtilClass.UtilPrint(pattern);
        assertEquals(pattern, result);
    }
}
