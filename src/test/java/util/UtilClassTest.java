package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilClassTest {

    @Test
    public void testUtilPrint() {
        String input = "Hello";
        String result = UtilClass.UtilPrint(input);

        // assertEquals(input, result);
    }
}