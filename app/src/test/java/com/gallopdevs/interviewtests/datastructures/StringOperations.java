package com.gallopdevs.interviewtests.datastructures;

import org.junit.Test;

public class StringOperations {
    // https://stackabuse.com/common-string-operations-in-java/

    //1. Determine String Length
    // length()
    // isEmpty()

    //2. Finding Characters and Substrings
    // charAt(int index)
    // indexOf()
    // lastIndexOf()

    //3. Comparing Strings
    // compareTo()
    // compareToIgnoreCase()

    //4. Extracting Substrings
    // substring()

    //5. Changing String Case
    // toLowerCase()
    // toUpperCase()

    //6. Removing Whitespace
    // trim()

    //7. Formatting Strings
    // format()
    // %d - integral types
    // %s - Strings
    // %f - float
    // %e - scientific notation
    // %g - depends on precision value after rounding
    // %b - boolean values

    //8. Regex and Checking for Substrings
    // contains()
    // startsWith()
    // endsWith()
    // matches()

    //9. Replacing Characters and Substrings
    // replace(char)
    // replace(String)
    // replaceAll()
    // replaceFirst()

    //10. Splitting and Joining Strings
    // split()
    // join()

    //11. Creating Character Arrays
    // toCharArray()

    //12. String Equality
    // equals()

    //13. String Concatenation
    // + operator
    // StringBuilder & append method
    // concat()

    String s1 = "       fantastic        ";
    String s2 = "WORLD               ";

    @Test
    public void Practice() {
        System.out.println(s1.trim());
        System.out.println(s2.trim());
    }
}
