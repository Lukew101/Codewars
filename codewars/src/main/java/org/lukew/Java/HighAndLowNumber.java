package org.lukew.Java;

import java.util.Arrays;

public class HighAndLowNumber {
    // In this little assignment you are given a string of space separated numbers,
    // and have to return the highest and lowest number.
    public static String highAndLow(String numbers) {
        String[] numArray = numbers.split(" ");
        int[] intArray = Arrays.stream(numArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(intArray);

        return String.format("%s %s",intArray[numArray.length - 1], intArray[0]);
    }
}
