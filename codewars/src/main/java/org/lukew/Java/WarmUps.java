package org.lukew.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUps {
    // You will be given an array and a limit value. You must check that all values in the array
    // are below or equal to the limit value. If they are, return true. Else, return false.
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).allMatch(num -> num <= limit);
    }

    // Take an array and remove every second element from the array.
    // Always keep the first element and start removing with the next element.
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i+=2) {
            list.add(arr[i]);
        }
        return list.toArray();
    }
}
