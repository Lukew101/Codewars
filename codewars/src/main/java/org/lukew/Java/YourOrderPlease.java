package org.lukew.Java;

import java.util.Map;
import java.util.TreeMap;

public class YourOrderPlease {
//    Your task is to sort a given string. Each word in the string will contain a single number.
//    This number is the position the word should have in the result.

    public static String order(String words) {
        Map<Integer, String> map = new TreeMap<>();
        StringBuilder result = new StringBuilder();
        String[] arr = words.split(" ");

        for (String a: arr) {
            for (char c: a.toCharArray()) {
                if (Character.isDigit(c)) {
                    map.put((int) c, a);
                    break;
                }
            }
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.append(entry.getValue()).append(" ");
        }

        return result.toString().trim();
    }
}
