package org.lukew.Java;

public class ExesAndOhs {
    // Check to see if a string has the same amount of 'x's and 'o's.
    // The method must return a boolean and be case insensitive. The string can contain any char.
    public static boolean getXO (String str) {
        int xCount = 0;
        int oCount = 0;

        for (char c: str.toLowerCase().toCharArray()) {
            if (c == 'x') xCount++;
            if (c == 'o') oCount++;
        }
        return xCount == oCount;
    }
}
