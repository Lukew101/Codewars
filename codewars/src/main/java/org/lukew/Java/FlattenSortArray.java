package org.lukew.Java;

import java.util.ArrayList;
import java.util.List;

public class FlattenSortArray {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> result = new ArrayList<>();
        for (int[] arr : array) {
            for (int j : arr) {
                result.add(j);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }
}
