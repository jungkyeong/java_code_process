package com.example.hellotest; 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainProjectTest {

    @Test
    void testMessage() {
        assertEquals("Hello, Maven World!", MainProject.getMessage());
    }
}