package org.lukew.Java;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    // Write a function that takes an array of numbers (integers for the tests) and a
    // target number. It should find two different items in the array that, when added together,
    // give the target value.
    public static int[] twoSum(int[] numbers, int target) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    resultList.add(i);
                    resultList.add(j);
                    return resultList.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return null;
    }

}
