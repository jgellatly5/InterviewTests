package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.integers.IntegerToRoman;
import com.gallopdevs.interviewtests.questionsbytype.strings.ReverseString;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.CatDog;
import com.gallopdevs.interviewtests.questionsbytype.strings.Compress;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.CountCode;
import com.gallopdevs.interviewtests.questionsbytype.strings.IsPalindrome;
import com.gallopdevs.interviewtests.questionsbytype.strings.IsPermutationPalindrome;
import com.gallopdevs.interviewtests.questionsbytype.strings.IsUnique;
import com.gallopdevs.interviewtests.questionsbytype.strings.OneEditAway;
import com.gallopdevs.interviewtests.questionsbytype.strings.Rotation;
import com.gallopdevs.interviewtests.questionsbytype.strings.Urlify;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.EndOther;
import com.gallopdevs.interviewtests.questionsbytype.strings.codebat.XyzThere;

import org.junit.Before;
import org.junit.Test;

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
        System.out.println("=========Test1 isPermutationPalindrome=========");
        System.out.println("tact coa");
        System.out.println(IsPermutationPalindrome.isPermutationPalindrome("tact coa"));
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
        System.out.println(compress("aabbccdd"));
        System.out.println(compress("aaaaaa"));
        System.out.println(compress("abcd"));
    }

    public String compress(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                result.append(s.charAt(i));
                result.append(count);
                count = 0;
            }
        }
        return result.length() < s.length() ? result.toString() : s;
    }
}
