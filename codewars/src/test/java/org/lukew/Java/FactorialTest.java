package org.lukew.Java;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    Factorial fact = new Factorial();

    @Test
    public void test_factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, fact.factorial(5));
    }

}