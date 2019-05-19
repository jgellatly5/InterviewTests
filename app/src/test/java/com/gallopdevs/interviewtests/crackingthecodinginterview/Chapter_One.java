package com.gallopdevs.interviewtests.crackingthecodinginterview;

import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Eight_A;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Four;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Nine;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_One;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Five;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Seven;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Six;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Three;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one.One_Two;

import org.junit.Assert;
import org.junit.Test;

public class Chapter_One {

    @Test
    public void IsUnique() {
        Assert.assertTrue(One_One.isUnique("abcdefghijkl"));
        Assert.assertFalse(One_One.isUnique("abbcdefgh"));
    }

    @Test
    public void CheckPermutation() {
        Assert.assertTrue(One_Two.isPermutationCounting("abc", "cba"));
        Assert.assertTrue(One_Two.isPermutationCounting("babdeg", "dgabbe"));
        Assert.assertFalse(One_Two.isPermutationCounting("abcd", "cba"));
    }

    @Test
    public void Urlify() {
        One_Three.urlify("My Big Fat Greek Wedding", 32);
    }

    @Test
    public void PalindromePermutation() {
        Assert.assertTrue(One_Four.isPermuationOfPalindrome("abc cab"));
        Assert.assertTrue(One_Four.isPermuationOfPalindrome("abcd cba"));
    }

    @Test
    public void OneAway() {
        Assert.assertTrue(One_Five.oneEditAway("bale", "pale"));
        Assert.assertTrue(One_Five.oneEditAway("pale", "pal"));
        Assert.assertTrue(One_Five.oneEditAway("bales", "bale"));
        Assert.assertFalse(One_Five.oneEditAway("bake", "pale"));
    }

    @Test
    public void StringCompression() {
        Assert.assertEquals(One_Six.compress("aaabbccdd"), "a3b2c2d2");
    }

    @Test
    public void RotateMatrix() {
        int[][] matrix = {
                {2, 3, 4},
                {1, 1, 2},
                {2, 0, 5}
        };
        One_Seven.rotate(matrix);
    }

    @Test
    public void ZeroMatrix() {
        int[][] matrix = {
                {2, 3, 4},
                {1, 1, 2},
                {2, 0, 5},
                {1, 1, 1}
        };
        One_Eight_A.zeroMatrix(matrix);
    }

    @Test
    public void StringRotation() {
        Assert.assertTrue(One_Nine.isRotation("waterbottle", "erbottlewat"));
    }
}
