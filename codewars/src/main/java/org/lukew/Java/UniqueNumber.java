package org.lukew.Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumber {
//    There is an array with some numbers. All numbers are equal except for one. Try to find it
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
