package org.lukew.Java;

import java.math.BigInteger;

public class StringIncrementer {
    // Your job is to write a function which increments a string, to create a new string.
    // If the string already ends with a number, the number should be incremented by 1.
    // If the string does not end with a number. the number 1 should be appended to the new string.
    public static String incrementString(String str) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int index = str.length()-1;

        while (index >= 0 && Character.isDigit(str.charAt(index))) {
            numbers.insert(0, str.charAt(index));
            index--;
        }

        result.append(str, 0, index + 1);

        if (numbers.toString().isEmpty()) {
            result.append("1");
        } else {
            int numLength = numbers.length();

            BigInteger numValue = new BigInteger(numbers.toString());
            numValue = numValue.add(BigInteger.ONE);

            String formattedNumber = String.format("%0" + numLength + "d", numValue);

            result.append(formattedNumber);
        }

        return result.toString();
    }
}
