package org.lukew.Java;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

class YourOrderPleaseTest {
    @Test
    public void test1() {
        assertThat(YourOrderPlease.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat("Empty input should return empty string", YourOrderPlease.order(""), equalTo(""));
    }

    @Test
    public void basicTests() {
        assertEquals(true, YourOrderPlease.smallEnough(new int[] { 66, 101 }, 200));
        assertEquals(false, YourOrderPlease.smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertEquals(true, YourOrderPlease.smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertEquals(true, YourOrderPlease.smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }
}