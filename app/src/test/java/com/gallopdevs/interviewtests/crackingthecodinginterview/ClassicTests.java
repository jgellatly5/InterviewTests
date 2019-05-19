package com.gallopdevs.interviewtests.crackingthecodinginterview;

import com.gallopdevs.interviewtests.udemyinterviewclass.classic.Anagram;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.FizzBuzz2;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.HarmlessRansomeNote;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.Palindrome2;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.ReverseInt;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.ReverseString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassicTests {

    private Palindrome2 palindrome;
    private FizzBuzz2 fizzBuzz;
    private ReverseString reverseString;
    private ReverseInt reverseInt;
    private Anagram anagram;
    private HarmlessRansomeNote ransomNote;

    @Before
    public void SetUp() {
        palindrome = new Palindrome2();
        fizzBuzz = new FizzBuzz2();
        reverseString = new ReverseString();
        reverseInt = new ReverseInt();
        anagram = new Anagram();
        ransomNote = new HarmlessRansomeNote();
    }

    @Test
    public void Palindromes() {
        Assert.assertTrue(palindrome.isPalindrome("abba"));
        Assert.assertTrue(palindrome.isPalindrome("mom"));
        Assert.assertTrue(palindrome.isPalindrome("dad"));
        Assert.assertFalse(palindrome.isPalindrome("rush"));
        Assert.assertFalse(palindrome.isPalindrome("yes"));
    }

    @Test
    public void FizzBuzz() {
        fizzBuzz.print();
    }

    @Test
    public void ReverseString() {
        reverseString.reverse("Today");
    }

    @Test
    public void ReverseInt() {
        reverseInt.reverseInt(3089);
    }

    @Test
    public void Anagram() {
        Assert.assertTrue(anagram.isAnagram("crest2", "tre2sc"));
    }

    @Test
    public void RansomNote() {
        Assert.assertTrue(ransomNote.canWrite("Pay", "yaP"));
        Assert.assertTrue(ransomNote.canWrite("Pay", "yaP a"));
        Assert.assertTrue(ransomNote.canWrite("Pay me $1000", "ayPem0001$"));

        Assert.assertFalse(ransomNote.canWrite("Pay", "Pa"));
    }
}
