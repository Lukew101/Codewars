package org.lukew.Java;

public class Factorial {

//  Write a function to calculate factorial for a given input. If input is below 0 or above
//  12 throw an IllegalArgumentException (Java).
    public int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();

        int result = 1;

        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
