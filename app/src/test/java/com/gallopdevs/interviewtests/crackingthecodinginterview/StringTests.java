package com.gallopdevs.interviewtests.crackingthecodinginterview;

import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.Anagram;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.CountSingleChar;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.CountVowels;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.DuplicateChars;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.FindPermutations;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.FirstNonRepeatedChar;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.IsPalindrome;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.OnlyDigits;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.RemoveDuplicates;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.ReverseString;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.StringReverse;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.SubStringFinder;
import com.gallopdevs.interviewtests.udemyinterviewclass.classic.strings.Urlify;

import org.junit.Assert;
import org.junit.Test;

public class StringTests {

    @Test
    public void DuplicateChars() {
        DuplicateChars.printDuplicateLetter("banana");
    }

    @Test
    public void Anagram() {
        Assert.assertTrue(Anagram.isAnagramSimple("rat", "tar"));
    }

    @Test
    public void FirstNonRepeatedChar() {
        Assert.assertEquals('o', FirstNonRepeatedChar.getFirstNonRepeatedChar("tortilla"));
    }

    @Test
    public void ReverseString() {
        ReverseString.reverseStringSimple("balloon");
        ReverseString.reverseStringAdvanced("balloon");
    }

    @Test
    public void OnlyDigits() {
        OnlyDigits.checkOnlyDigits("123567567567");
    }

    @Test
    public void CountVowels() {
        CountVowels.countVowels("renegades");
    }

    @Test
    public void CountSingleChar() {
        Assert.assertEquals(1, CountSingleChar.countSingleChar("word", 'w'));
    }

    @Test
    public void Urlify() {
        Urlify.urlify("This is a test", 20);
    }

    @Test
    public void FindPermutations() {
        FindPermutations.findPermutations("xyzw");
    }

    @Test
    public void StringReverse() {
        StringReverse.reverseString("puddy");
    }

    @Test
    public void IsPalindrome() {
        Assert.assertTrue(IsPalindrome.isPalindrome("racecar"));
    }

    @Test
    public void RemoveDuplicates() {
        RemoveDuplicates.removeDuplicates("banana");
    }

    @Test
    public void SubStringFinder() {
        Assert.assertTrue(SubStringFinder.substringFinder("banana", "ban"));
    }
}
