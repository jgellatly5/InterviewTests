package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

import org.junit.Test;

import java.util.Arrays;

public class Codebat {
    @Test
    public void Sum2() {
        System.out.println("=========Sum2=========");
        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 1};
        int[] test3 = {1, 1, 1, 1};
        System.out.println(Sum2.sum2(test1));
        System.out.println(Sum2.sum2(test2));
        System.out.println(Sum2.sum2(test3));
    }

    @Test
    public void MidThree() {
        System.out.println("=========MidThree=========");
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {8, 6, 7, 5, 3, 0, 9};
        int[] test3 = {1, 2, 3};
        System.out.println(Arrays.toString(MidThree.midThree(test1)));
        System.out.println(Arrays.toString(MidThree.midThree(test2)));
        System.out.println(Arrays.toString(MidThree.midThree(test3)));
    }

    @Test
    public void Sum13() {
        System.out.println("=========Sum13=========");
        int[] test1 = {1, 2, 2, 1};
        int[] test2 = {1, 1};
        int[] test3 = {1, 2, 2, 1, 13};
        int[] test4 = {1, 2, 2, 1, 13, 6};
        System.out.println(Sum13.sum13(test1));
        System.out.println(Sum13.sum13(test2));
        System.out.println(Sum13.sum13(test3));
        System.out.println(Sum13.sum13(test4));
    }

    @Test
    public void Sum67() {
        System.out.println("=========Sum67=========");
        int[] test1 = {1, 2, 2};
        int[] test2 = {1, 2, 2, 6, 99, 99, 7};
        int[] test3 = {1, 1, 6, 7, 2};
        System.out.println(Sum67.sum67(test1));
        System.out.println(Sum67.sum67(test2));
        System.out.println(Sum67.sum67(test3));
    }

    @Test
    public void Has22() {
        System.out.println("=========Has22=========");
        int[] test1 = {1, 2, 2};
        int[] test2 = {1, 2, 1, 2};
        int[] test3 = {2, 1, 2};
        System.out.println(Has22.has22(test1));
        System.out.println(Has22.has22(test2));
        System.out.println(Has22.has22(test3));
    }

    @Test
    public void FizzArray2() {
        System.out.println("=========FizzArray2=========");
        System.out.println(Arrays.toString(FizzArray2.fizzArray2(4)));
        System.out.println(Arrays.toString(FizzArray2.fizzArray2(10)));
        System.out.println(Arrays.toString(FizzArray2.fizzArray2(2)));
    }

    @Test
    public void IsEverywhere() {
        System.out.println("=========IsEverywhere=========");
        int[] test1 = {1, 2, 2};
        int[] test2 = {1, 2, 1, 2};
        int[] test3 = {2, 1, 2};
        System.out.println(IsEverywhere.isEverywhere(test1, 1));
        System.out.println(IsEverywhere.isEverywhere(test2, 1));
        System.out.println(IsEverywhere.isEverywhere(test3, 2));
    }


    @Test
    public void Unlucky1() {
        System.out.println("=========Unlucky1=========");
        int[] test1 = {1, 3, 4, 5};
        int[] test2 = {2, 1, 3, 4, 5};
        int[] test3 = {1, 1, 1};
        System.out.println(Unlucky1.unlucky1(test1));
        System.out.println(Unlucky1.unlucky1(test2));
        System.out.println(Unlucky1.unlucky1(test3));
    }

    @Test
    public void Front11() {
        System.out.println("=========Front11=========");
        System.out.println(Arrays.toString(Front11.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(Front11.front11(new int[]{1}, new int[]{2})));
        System.out.println(Arrays.toString(Front11.front11(new int[]{}, new int[]{1, 2})));
    }

    @Test
    public void Either24() {
        System.out.println("=========Either24=========");
        int[] test1 = {1, 2, 2};
        int[] test2 = {4, 4, 1};
        int[] test3 = {4, 4, 1, 2, 2};
        System.out.println(Either24.either24(test1));
        System.out.println(Either24.either24(test2));
        System.out.println(Either24.either24(test3));
    }

    @Test
    public void MatchUp() {
        System.out.println("=========MatchUp=========");
        System.out.println(MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }

    @Test
    public void Has77() {
        System.out.println("=========Has77=========");
        int[] test1 = {1, 7, 7};
        int[] test2 = {1, 7, 1, 7};
        int[] test3 = {1, 7, 1, 1, 7};
        System.out.println(Has77.has77(test1));
        System.out.println(Has77.has77(test2));
        System.out.println(Has77.has77(test3));
    }

    @Test
    public void Has12() {
        System.out.println("=========Has12=========");
        int[] test1 = {1, 3, 2};
        int[] test2 = {3, 1, 2};
        int[] test3 = {3, 1, 4, 5, 2};
        int[] test4 = {2, 1, 3};
        int[] test5 = {1, 3, 5};
        System.out.println(Has12.has12(test1));
        System.out.println(Has12.has12(test2));
        System.out.println(Has12.has12(test3));
        System.out.println(Has12.has12(test4));
        System.out.println(Has12.has12(test5));
    }

    @Test
    public void ModThree() {
        System.out.println("=========ModThree=========");
        int[] test1 = {2, 1, 3, 5};
        int[] test2 = {2, 1, 2, 5};
        int[] test3 = {2, 4, 2, 5};
        System.out.println(ModThree.modThree(test1));
        System.out.println(ModThree.modThree(test2));
        System.out.println(ModThree.modThree(test3));
    }

    @Test
    public void HaveThree() {
        System.out.println("=========HaveThree=========");
        int[] test1 = {3, 1, 3, 1, 3};
        int[] test2 = {3, 1, 3, 3};
        int[] test3 = {3, 4, 3, 3, 4};
        System.out.println(HaveThree.hasThree(test1));
        System.out.println(HaveThree.hasThree(test2));
        System.out.println(HaveThree.hasThree(test3));
    }

    @Test
    public void TwoTwo() {
        System.out.println("=========TwoTwo=========");
        int[] test1 = {4, 2, 2, 3};
        int[] test2 = {2, 2, 4};
        int[] test3 = {2, 2, 4, 2};
        System.out.println(TwoTwo.twoTwo(test1));
        System.out.println(TwoTwo.twoTwo(test2));
        System.out.println(TwoTwo.twoTwo(test3));
    }

    @Test
    public void SameEnds() {
        System.out.println("=========SameEnds=========");
        int[] numbers = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(SameEnds.sameEnds(numbers, 1));
        System.out.println(SameEnds.sameEnds(numbers, 2));
        System.out.println(SameEnds.sameEnds(numbers, 3));
        int[] numbers2 = {5, 6, 7, 99, 13, 5, 6, 7};
        System.out.println(SameEnds.sameEnds(numbers2, 2));
        System.out.println(SameEnds.sameEnds(numbers2, 3));
    }

    @Test
    public void TripleUp() {
        System.out.println("=========TripleUp=========");
        int[] test1 = {1, 4, 5, 6, 2};
        int[] test2 = {1, 2, 3};
        int[] test3 = {1, 2, 4};
        System.out.println(TripleUp.tripleUp(test1));
        System.out.println(TripleUp.tripleUp(test2));
        System.out.println(TripleUp.tripleUp(test3));
    }

    @Test
    public void FizzArray3() {
        System.out.println("=========FizzArray3=========");
        System.out.println(Arrays.toString(FizzArray3.fizzArray3(5, 10)));
        System.out.println(Arrays.toString(FizzArray3.fizzArray3(11, 18)));
        System.out.println(Arrays.toString(FizzArray3.fizzArray3(1, 3)));
        System.out.println(Arrays.toString(FizzArray3.fizzArray3(1, 1)));
        System.out.println(Arrays.toString(FizzArray3.fizzArray3(0, 0)));
    }

    @Test
    public void ShiftLeft() {
        System.out.println("=========ShiftLeft=========");
        int[] test1 = {6, 2, 5, 3};
        int[] test2 = {1, 2};
        int[] test3 = {1};
        System.out.println(Arrays.toString(ShiftLeft.shiftLeft(test1)));
        System.out.println(Arrays.toString(ShiftLeft.shiftLeft(test2)));
        System.out.println(Arrays.toString(ShiftLeft.shiftLeft(test3)));
    }

    @Test
    public void TenRun() {
        System.out.println("=========TenRun=========");
        int[] test1 = {2, 10, 3, 4, 20, 5};
        int[] test2 = {10, 1, 20, 2};
        int[] test3 = {10, 1, 9, 20};
        int[] test4 = {0, 2};
        System.out.println(Arrays.toString(TenRun.tenRun(test1)));
        System.out.println(Arrays.toString(TenRun.tenRun(test2)));
        System.out.println(Arrays.toString(TenRun.tenRun(test3)));
        System.out.println(Arrays.toString(TenRun.tenRun(test4)));
    }

    @Test
    public void Pre4() {
        System.out.println("=========Pre4=========");
        int[] test1 = {1, 2, 4, 1};
        int[] test2 = {3, 1, 4};
        int[] test3 = {1, 4, 4};
        System.out.println(Arrays.toString(Pre4.pre4(test1)));
        System.out.println(Arrays.toString(Pre4.pre4(test2)));
        System.out.println(Arrays.toString(Pre4.pre4(test3)));
    }

    @Test
    public void Post4() {
        System.out.println("=========Post4=========");
        int[] test1 = {2, 4, 1, 2};
        int[] test2 = {4, 1, 4, 2};
        int[] test3 = {4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(Post4.post4(test1)));
        System.out.println(Arrays.toString(Post4.post4(test2)));
        System.out.println(Arrays.toString(Post4.post4(test3)));
    }

    @Test
    public void NotAlone() {
        System.out.println("=========NotAlone=========");
        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 2, 3, 2, 5, 2};
        int[] test3 = {3, 4};
        System.out.println(Arrays.toString(NotAlone.notAlone(test1, 2)));
        System.out.println(Arrays.toString(NotAlone.notAlone(test2, 2)));
        System.out.println(Arrays.toString(NotAlone.notAlone(test3, 3)));
    }

    @Test
    public void ZeroFront() {
        System.out.println("=========ZeroFront=========");
        int[] test1 = {1, 0, 0, 1};
        int[] test2 = {0, 1, 1, 0, 1};
        int[] test3 = {1, 0};
        System.out.println(Arrays.toString(ZeroFront.zeroFront(test1)));
        System.out.println(Arrays.toString(ZeroFront.zeroFront(test2)));
        System.out.println(Arrays.toString(ZeroFront.zeroFront(test3)));
    }

    @Test
    public void Without10() {
        System.out.println("=========Without10=========");
        int[] test1 = {1, 10, 10, 2};
        int[] test2 = {10, 2, 10};
        int[] test3 = {1, 99, 10};
        System.out.println(Arrays.toString(Without10.without10(test1)));
        System.out.println(Arrays.toString(Without10.without10(test2)));
        System.out.println(Arrays.toString(Without10.without10(test3)));
    }

    @Test
    public void MaxEnd() {
        int[] test1 = {4, 2, 1};
        int[] test2 = {5, 3, 1};
        System.out.println(Arrays.toString(MaxEnd3.maxEndThree(test1)));
        System.out.println(Arrays.toString(MaxEnd3.maxEndThree(test2)));
    }
}
