package org.lukew.Java;

import java.util.Arrays;

public class SortTheOdd {
    // You will be given an array of numbers. You have to sort the odd numbers in ascending
    // order while leaving the even numbers at their original positions.
    public static int[] sortArray(int[] array) {
        int[] result = new int[array.length];
        int[] sortedOddNumbers = Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();

        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[i] = sortedOddNumbers[oddIndex++];
            } else {
                result[i] = array[i];
            }
        }
        return result;
    }
}
