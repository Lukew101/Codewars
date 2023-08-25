package org.lukew.Java;

import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
    public boolean check(String sentence){
        Set<Character> set = new HashSet<>();

        for (char c: sentence.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                set.add(Character.toLowerCase(c));
            }
        }
        return set.size() == 26;
    }
}
