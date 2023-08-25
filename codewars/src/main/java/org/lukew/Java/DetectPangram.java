package org.lukew.Java;

import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
//    Given a string, detect whether or not it is a pangram.
//    Return True if it is, False if not. Ignore numbers and punctuation.
    public boolean check(String sentence){
        Set<Character> set = new HashSet<>();

        for (char c: sentence.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                set.add(Character.toLowerCase(c));
            }
        }
        return set.size() == 26;
    }

//    public boolean check(String sentence) {
//        return sentence.chars()
//                .map(Character::toLowerCase)
//                .filter(Character::isAlphabetic)
//                .distinct()
//                .count() == 26;
//    }
}
