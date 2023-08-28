package org.lukew.Java;

import java.util.Arrays;

public class YourOrderPlease {
//    Your task is to sort a given string. Each word in the string will contain a single number.
//    This number is the position the word should have in the result.

    public static String order(String words) {
        StringBuilder result = new StringBuilder();
        String[] arr = words.split(" ");

        for (int i = 0; i < 10; i++) {
            for (String c: arr) {
                if (c.contains(String.valueOf(i))) {
                    result.append(c).append(" ");
                }
            }
        }
        return result.toString().trim();
    }

    // You will be given an array and a limit value. You must check that all values in the array
    // are below or equal to the limit value. If they are, return true. Else, return false.
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).allMatch(num -> num <= limit);
    }
}
