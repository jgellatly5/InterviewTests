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
import java.util.Arrays;
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
    // equals()
    // equalsIgnoreCase()

    //4. Extracting Substrings
    // substring()

    //5. Formatting Strings
    // toLowerCase()
    // toUpperCase()
    // trim()
    // format()
    // %d - integral types
    // %s - Strings
    // %f - float
    // %e - scientific notation
    // %g - depends on precision value after rounding
    // %b - boolean values

    //6. Regex and Checking for Substrings
    // contains()
    // startsWith()
    // endsWith()
    // matches()

    //7. Replacing Characters and Substrings
    // replace(char)
    // replace(String)
    // replaceAll()
    // replaceFirst()

    //8. Splitting and Joining Strings
    // split()
    // join()

    //9. Creating Character Arrays
    // toCharArray()

    //10. String Concatenation
    // + operator
    // StringBuilder & append method
    // concat()

    //11. String valueOf()
    // String.valueOf(boolean)
    // String.valueOf(char)
    // String.valueOf(double)
    // String.valueOf(float)
    // String.valueOf(int)

    @Test
    public void Practice() {
        String test1 = String.valueOf(0b11000);
        String test2 = "     yellow";
        System.out.println(test1);
    }
}
