package org.lukew.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


}
