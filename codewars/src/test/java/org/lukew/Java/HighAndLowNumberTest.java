package org.lukew.Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighAndLowNumberTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighAndLowNumber.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void test2() {
        assertEquals("3 1", HighAndLowNumber.highAndLow("1 2 3"));
    }

}