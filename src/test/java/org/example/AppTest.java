package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void additionWorks() {
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Test
    void failingTest() {
        int result = 2 + 2;
        assertEquals(4, result); // this will fail on purpose
    }
}