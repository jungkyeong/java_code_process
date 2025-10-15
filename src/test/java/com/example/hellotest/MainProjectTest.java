package com.example.hellotest;

// JUnit5 TEST module import
import org.junit.jupiter.api.Test; // test annotation
import static org.junit.jupiter.api.Assertions.assertEquals; // define use function only one

public class MainProjectTest {

    @Test
    void testMessage() {
        assertEquals("Hello, Maven World!", MainProject.getMessage());
    }
}