package org.lukew.Java;

import java.util.Arrays;

public class FormTheMinimum {

    public static int minValue(int[] values){
        return Arrays.stream(values)
                .boxed()
                .sorted()
                .distinct()
                .reduce((a,b) -> a * 10 + b)
                .orElse(0);
    }
}
