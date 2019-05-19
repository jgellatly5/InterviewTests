package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.simpleprogrammer.strings.Compress;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsPalindrome2;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsPermutationPalindrome;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsUnique;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.OneEditAway;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.Rotation;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.Urlify;
import com.gallopdevs.interviewtests.simpleprogrammer.strings.IsPalindrome;

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
        System.out.println(IsUnique.isUnique(text));
        System.out.println(IsUnique.isUnique(text2));

    }

    @Test
    public void IsPalindrome() {
        System.out.println(IsPalindrome.isPalindrome(text3));
        System.out.println(IsPalindrome2.isPalindrome(text3));
        System.out.println(IsPalindrome2.isPalindrome(text4));
        System.out.println(IsPalindrome.isPalindrome(text4));
    }


    @Test
    public void Urlify() {
        char[] chars = text5.toCharArray();
        System.out.println(Urlify.urlify(chars, 13));
    }

    @Test
    public void Compress() {
        System.out.println(Compress.compress(text6));
    }

    @Test
    public void IsRotation() {
        System.out.println(Rotation.isRotation("waterbottle", "erbottlewat"));
    }

    @Test
    public void IsPermutationPalindrome() {
        System.out.println(IsPermutationPalindrome.isPermutationPalindrome("tact coa"));
    }

    @Test
    public void OneEditAway() {
        System.out.println(OneEditAway.oneEditAway("bear", "pear"));
        System.out.println(OneEditAway.oneEditAway("beary", "pearf"));
    }
}
