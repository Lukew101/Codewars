package org.lukew.Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectPangramTest {
    DetectPangram detectPangram = new DetectPangram();

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertTrue(detectPangram.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        assertFalse(detectPangram.check(pangram2));
    }
}