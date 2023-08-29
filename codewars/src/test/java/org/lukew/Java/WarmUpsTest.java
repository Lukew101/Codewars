package org.lukew.Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarmUpsTest {

    @Test
    public void smallEnoughTests() {
        assertEquals(true, WarmUps.smallEnough(new int[] { 66, 101 }, 200));
        assertEquals(false, WarmUps.smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertEquals(true, WarmUps.smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertEquals(true, WarmUps.smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }

    @Test
    void removeEveryOtherTest() {
        assertArrayEquals(new Object[] { "Hello", "Hello Again" },WarmUps.removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" }));
        assertArrayEquals(new Object[] { new Object[] { 1, 2 } },WarmUps.removeEveryOther(new Object[] { new Object[] { 1, 2 } }));
        assertArrayEquals(new Object[] { 1, 3, 5, 7, 9 },WarmUps.removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        assertArrayEquals(new Object[] { "Goodbye" }, WarmUps.removeEveryOther(new Object[] { "Goodbye" }));
        assertArrayEquals(new Object[] {}, WarmUps.removeEveryOther(new Object[] {}));
    }
}