package org.lukew.Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandedNumberFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", ExpandedNumberForm.expandedForm(12));
        assertEquals("40 + 2", ExpandedNumberForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", ExpandedNumberForm.expandedForm(70304));
    }

}