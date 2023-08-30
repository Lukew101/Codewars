package org.lukew.Java;

import java.util.Arrays;

public class Meeting {

    // Could you make a program that: 1.makes this string uppercase,
    //2. gives it sorted in alphabetical order by last name.
    //When the last names are the same, sort them by first name.
    // Last name and first name of a guest come in the result between parentheses separated by a comma.
    public static String meeting(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitArray = s.toUpperCase().split(";");

        Arrays.sort(splitArray, (String name1, String name2) -> {
            String[] firstName = name1.split(":");
            String[] secondName = name2.split(":");

            int lastNameComparison =  firstName[1].compareTo(secondName[1]);
            if (lastNameComparison != 0) {
                return lastNameComparison;
            }
            return firstName[0].compareTo(secondName[0]);
        });

        for (String str: splitArray) {
            StringBuilder nameString = new StringBuilder();
            String[] firstLastNameSplit = str.split(":");
            String correctNameForm = nameString.append("(").append(firstLastNameSplit[1]).append(", ").append(firstLastNameSplit[0]).append(")").toString();
            result.append(correctNameForm);
        }
        return result.toString();
    }
}
