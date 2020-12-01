package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.strings.Compress;
import com.gallopdevs.interviewtests.questionsbytype.strings.FindPermutations;
import com.gallopdevs.interviewtests.questionsbytype.strings.IsPermutationPalindrome;
import com.gallopdevs.interviewtests.questionsbytype.strings.IsUnique;
import com.gallopdevs.interviewtests.questionsbytype.strings.LongestCommonPrefix;
import com.gallopdevs.interviewtests.questionsbytype.strings.LongestPalindromicSubstring;
import com.gallopdevs.interviewtests.questionsbytype.strings.OneEditAway;
import com.gallopdevs.interviewtests.questionsbytype.strings.Rotation;
import com.gallopdevs.interviewtests.questionsbytype.strings.Urlify;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.CatDog;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.CountCode;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.EndOther;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.XyzThere;
import com.gallopdevs.interviewtests.questionsbytype.strings.operations.IsPalindrome;
import com.gallopdevs.interviewtests.questionsbytype.strings.operations.ReverseString;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringsTest {

    private String text = "";
    private String text2 = "";
    private String text3 = "";
    private String text4 = "";
    private String text5 = "";
    private String text6 = "";

    @Before
    public void setUp() throws Exception {
        text = "abcdefgh";
        text2 = "abcdedfghabc";
        text3 = "racecar";
        text4 = "yellow";
        text5 = "Mr John Smith    ";
        text6 = "aaaabbbbddddttttteeee";
    }

    @Test
    public void IsUnique() {
        System.out.println("=========Test1 IsUnique=========");
        System.out.println(text);
        System.out.println(IsUnique.isUnique(text));
        System.out.println(text2);
        System.out.println(IsUnique.isUnique(text2));
    }

    @Test
    public void IsPalindrome() {
        System.out.println("=========Test1 IsPalindrome=========");
        System.out.println(text3);
        System.out.println(IsPalindrome.isPalindrome(text3));
        System.out.println(text4);
        System.out.println(IsPalindrome.isPalindrome(text4));
    }


    @Test
    public void Urlify() {
        System.out.println("=========Test1 Urlify=========");
        System.out.println(text5);
        char[] chars = text5.toCharArray();
        System.out.println(Urlify.urlify(chars, 13));
    }

    @Test
    public void Compress() {
        System.out.println("=========Test1 Compress=========");
        System.out.println(text6);
        System.out.println(Compress.compress(text6));
    }

    @Test
    public void IsRotation() {
        System.out.println("=========Test1 isRotation=========");
        System.out.println("waterbottle , erbottlewat");
        System.out.println(Rotation.isRotation("waterbottle", "erbottlewat"));
    }

    @Test
    public void IsPermutationPalindrome() {
        System.out.println("=========IsPermutationPalindrome=========");
        System.out.println("tactcoa");
        System.out.println(IsPermutationPalindrome.isPermutationPalindrome("tactcoa"));
        System.out.println("carrace");
        System.out.println(IsPermutationPalindrome.isPermutationPalindrome("carrace"));
        System.out.println("photo");
        System.out.println(IsPermutationPalindrome.isPermutationPalindrome("photo"));
        System.out.println("olloyy");
        System.out.println(IsPermutationPalindrome.isPermutationPalindrome("olloyy"));
    }

    @Test
    public void OneEditAway() {
        System.out.println("=========Test1 OneEditAway=========");
        System.out.println("bear , pear");
        System.out.println(OneEditAway.oneEditAway("bear", "pear"));
        System.out.println("beary , pearf");
        System.out.println(OneEditAway.oneEditAway("beary", "pearf"));
    }

    @Test
    public void CatDog() {
        System.out.println("=========CatDog=========");
        System.out.println(CatDog.catDog("catdog"));
        System.out.println(CatDog.catDog("catcat"));
        System.out.println(CatDog.catDog("1cat1cadodog"));
        System.out.println(CatDog.catDog("catcatdogdog"));
    }

    @Test
    public void CountCode() {
        System.out.println("=========CountCode=========");
//        System.out.println(CountCode.countCode("aaacodebbb"));
//        System.out.println(CountCode.countCode("codexxcode"));
        System.out.println(CountCode.countCode("cozexxcope"));
    }

    @Test
    public void EndOther() {
        System.out.println("=========EndOther=========");
        System.out.println(EndOther.endOther("Hiabc", "abc"));
        System.out.println(EndOther.endOther("AbC", "HiaBc"));
        System.out.println(EndOther.endOther("abc", "abXabc"));
    }

    @Test
    public void ReverseString() {
        System.out.println("=========ReverseString=========");
        System.out.println(ReverseString.reverseStringSimple("Hello World"));
        System.out.println(ReverseString.reverseStringSimple("Cool"));
        System.out.println(ReverseString.reverseStringAdvanced("Hello World"));
        System.out.println(ReverseString.reverseStringAdvanced("Cool"));
    }

    @Test
    public void XyzThere() {
        System.out.println("=========XyzThere=========");
        System.out.println(XyzThere.xyzThere("abcxyz"));
        System.out.println(XyzThere.xyzThere("abc.xyz"));
        System.out.println(XyzThere.xyzThere("xyz.abc"));
    }

    @Test
    public void FindPermutations() {
        System.out.println("=========FindPermutations=========");
        System.out.println(FindPermutations.findPermutations("abc"));
    }

    @Test
    public void LongestPalindromicSubstring() {
        System.out.println(LongestPalindromicSubstring.longestPalindrome("babad"));
        System.out.println(LongestPalindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    public void LongestCommonPrefix() {
        String[] strings = {"leet", "leetcode", "leets", "leed"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strings));
    }

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

    @Test
    public void Practice() {
        String test1 = "awaglk";
        System.out.println(subStringsLessKDist(test1, 4));
        String test2 = "democracy";
        System.out.println(subStringsLessKDist(test2, 5));
        String test3 = "wawaglknagagwunagkwkwagl";
        System.out.println(subStringsLessKDist(test3, 4));
        String test4 = "";
        System.out.println(subStringsLessKDist(test4, 4));
        String test5 = "abcd";
        System.out.println(subStringsLessKDist(test5, 2));
        System.out.println(subStringsLessKDist(test5, 5));
        String test6 = "$%#$";
        System.out.println(subStringsLessKDist(test6, 4));
        String test7 = "aaa";
        System.out.println(subStringsLessKDist(test7, 2));
    }

    private String runLengthEncoding(String inputString) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            count++;
            if (i + 1 >= inputString.length() || inputString.charAt(i) != inputString.charAt(i + 1)) {
                result.append(count);
                result.append(inputString.charAt(i));
                count = 0;
            }
        }
        return result.toString();
    }

    private List<String> subStringsLessKDist(String inputString, int num) {
        Set<String> result = new HashSet<>();
        if (num <= 0 || num >= 26 || !inputString.matches("[a-zA-Z]+")) return new ArrayList<>();
        for (int i = 0; i <= inputString.length() - num; i++) {
            String current = inputString.substring(i, num + i);
            if (matchesPattern(current)) {
                result.add(current);
            }
        }
        return new ArrayList<>(result);
    }

    private boolean matchesPattern(String text) {
        char[] characters = text.toCharArray();
        boolean foundRepeating = false;
        Set<Character> values = new HashSet<>();
        for (Character character : characters) {
            if (!values.add(character)) {
                if (foundRepeating) return false;
                foundRepeating = true;
            }
        }
        return foundRepeating;
    }
}
