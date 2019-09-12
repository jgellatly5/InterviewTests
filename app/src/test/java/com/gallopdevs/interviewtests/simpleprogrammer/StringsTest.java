package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.simpleprogrammer.strings.Compress;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.Compress2;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsPalindrome;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsPalindrome2;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsPermutationPalindrome;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsPermutationPalindrome2;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsUnique;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsUnique2;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.OneEditAway;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.OneEditAway2;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.Rotation;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.Rotation2;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.Urlify;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.Urlify2;

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
        System.out.println("\n=========Test2 IsUnique=========");
        System.out.println(text);
        System.out.println(IsUnique2.isUnique(text));
        System.out.println(text2);
        System.out.println(IsUnique2.isUnique(text2));
    }

    @Test
    public void IsPalindrome() {
        System.out.println("=========Test1 IsPalindrome=========");
        System.out.println(text3);
        System.out.println(IsPalindrome.isPalindrome(text3));
        System.out.println(text4);
        System.out.println(IsPalindrome.isPalindrome(text4));
        System.out.println("\n=========Test2 IsPalindrome=========");
        System.out.println(text3);
        System.out.println(IsPalindrome2.isPalindrome(text3));
        System.out.println(text4);
        System.out.println(IsPalindrome2.isPalindrome(text4));
    }


    @Test
    public void Urlify() {
        System.out.println("=========Test1 Urlify=========");
        System.out.println(text5);
        char[] chars = text5.toCharArray();
        System.out.println(Urlify.urlify(chars, 13));
        System.out.println("\n=========Test2 Urlify=========");
        System.out.println(text5);
        char[] chars2 = text5.toCharArray();
        System.out.println(Urlify2.urlify(chars2, 13));
        System.out.println();
    }

    @Test
    public void Compress() {
        System.out.println("=========Test1 Compress=========");
        System.out.println(text6);
        System.out.println(Compress.compress(text6));
        System.out.println("\n=========Test2 Compress=========");
        System.out.println(text6);
        System.out.println(Compress2.compress(text6));
    }

    @Test
    public void IsRotation() {
        System.out.println("=========Test1 isRotation=========");
        System.out.println("waterbottle , erbottlewat");
        System.out.println(Rotation.isRotation("waterbottle", "erbottlewat"));
        System.out.println("\n=========Test2 isRotation=========");
        System.out.println("waterbottle , erbottlewat");
        System.out.println(Rotation2.isRotation("waterbottle", "erbottlewat"));
    }

    @Test
    public void IsPermutationPalindrome() {
        System.out.println("=========Test1 isPermutationPalindrome=========");
        System.out.println("tact coa");
        System.out.println(IsPermutationPalindrome.isPermutationPalindrome("tact coa"));
        System.out.println("\n=========Test2 isPermutationPalindrome=========");
        System.out.println("tact coa");
        System.out.println(IsPermutationPalindrome2.isPermutationPalindrome("tact coa"));
    }

    @Test
    public void OneEditAway() {
        System.out.println("=========Test1 OneEditAway=========");
        System.out.println("bear , pear");
        System.out.println(OneEditAway.oneEditAway("bear", "pear"));
        System.out.println("beary , pearf");
        System.out.println(OneEditAway.oneEditAway("beary", "pearf"));
        System.out.println("\n=========Test2 OneEditAway=========");
        System.out.println("bear , pear");
        System.out.println(OneEditAway2.oneEditAway("bear", "pear"));
        System.out.println("beary , pearf");
        System.out.println(OneEditAway2.oneEditAway("beary", "pearf"));
    }
}
