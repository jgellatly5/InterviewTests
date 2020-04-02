package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.recursive.AllStar;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Array11;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Array220;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Array6;
import com.gallopdevs.interviewtests.questionsbytype.recursive.BunnyEars;
import com.gallopdevs.interviewtests.questionsbytype.recursive.BunnyEarsVariation;
import com.gallopdevs.interviewtests.questionsbytype.recursive.ChangePi;
import com.gallopdevs.interviewtests.questionsbytype.recursive.ChangeXY;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Count11;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Count8;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountAbc;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountHi;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountHi2;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountPairs;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountSeven;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountX;
import com.gallopdevs.interviewtests.questionsbytype.recursive.EndX;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Factorial;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Fibonacci;
import com.gallopdevs.interviewtests.questionsbytype.recursive.IsStringPalindromeRecursive;
import com.gallopdevs.interviewtests.questionsbytype.recursive.MakingChange;
import com.gallopdevs.interviewtests.questionsbytype.recursive.NestParen;
import com.gallopdevs.interviewtests.questionsbytype.recursive.NoX;
import com.gallopdevs.interviewtests.questionsbytype.recursive.PairStar;
import com.gallopdevs.interviewtests.questionsbytype.recursive.ParenBit;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Permutations;
import com.gallopdevs.interviewtests.questionsbytype.recursive.PowerN;
import com.gallopdevs.interviewtests.questionsbytype.recursive.ReverseStack;
import com.gallopdevs.interviewtests.questionsbytype.recursive.StrCopies;
import com.gallopdevs.interviewtests.questionsbytype.recursive.StrDist;
import com.gallopdevs.interviewtests.questionsbytype.recursive.StringClean;
import com.gallopdevs.interviewtests.questionsbytype.recursive.SumDigits;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Triangle;
import com.gallopdevs.interviewtests.questionsbytype.recursive.VerifyBST;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class RecursionTest {

    private VerifyBST.Node node;
    private VerifyBST.Node node2;

    @Before
    public void Setup() {
        node = new VerifyBST.Node(5);
        node.left = new VerifyBST.Node(2);
        node.right = new VerifyBST.Node(7);
        node.left.left = new VerifyBST.Node(1);
        node.left.right = new VerifyBST.Node(3);
        node.right.left = new VerifyBST.Node(6);
        node.right.right = new VerifyBST.Node(8);

        node2 = new VerifyBST.Node(5);
        node2.left = new VerifyBST.Node(2);
        node2.right = new VerifyBST.Node(7);
        node2.left.left = new VerifyBST.Node(1);
        node2.left.right = new VerifyBST.Node(3);
        node2.right.left = new VerifyBST.Node(6);
        node2.right.right = new VerifyBST.Node(4);
    }

    @Test
    public void MakingChange() {
        System.out.println("=========Making Change Iterative=========");
        System.out.println(MakingChange.changeIterative(101));
        System.out.println("\n=========Making Change Recursive=========");
        System.out.println(MakingChange.changeRecursive(105));
    }

    @Test
    public void VerifyBST() {
        System.out.println("=========Verify BST=========");
        System.out.println(VerifyBST.isBST(node));
        System.out.println();
        System.out.println(VerifyBST.isBST(node2));
    }

    @Test
    public void Factorial() {
        System.out.println("=========Factorial=========");
        System.out.println(Factorial.factorial(5));
        System.out.println(Factorial.factorial(4));
    }

    @Test
    public void BunnyEars() {
        System.out.println("=========Bunny Ears=========");
        System.out.println(BunnyEars.bunnyEars(5));
        System.out.println(BunnyEars.bunnyEars(12));
    }

    @Test
    public void BunnyEarsVariation() {
        System.out.println("=========Bunny Ears Variation=========");
        System.out.println(BunnyEarsVariation.bunnyEarsVariation(5));
        System.out.println(BunnyEarsVariation.bunnyEarsVariation(12));
        System.out.println(BunnyEarsVariation.bunnyEarsVariation(2));
    }

    @Test
    public void Triangle() {
        System.out.println("=========Triangle=========");
        System.out.println(Triangle.triangle(5));
        System.out.println(Triangle.triangle(7));
        System.out.println(Triangle.triangle(3));
    }

    @Test
    public void Permutations() {
        System.out.println("=========Permutations (String)=========");
        System.out.println(Permutations.permutationsString("abc"));
        System.out.println("\n=========Permutations (Int)=========");
        int[] numbers = {1, 2, 3};
        ArrayList<int[]> results = Permutations.permutationsInt(numbers);
        for (int i = 0; i < results.size(); i++) {
            System.out.println(Arrays.toString(results.get(i)));
        }
    }

    @Test
    public void SumDigits() {
        System.out.println("=========SumDigits=========");
        System.out.println(SumDigits.sumDigits(129));
        System.out.println(SumDigits.sumDigits(1291));
        System.out.println(SumDigits.sumDigits(73));
    }

    @Test
    public void CountSeven() {
        System.out.println("=========CountSeven=========");
        System.out.println(CountSeven.countSeven(707));
        System.out.println(CountSeven.countSeven(777));
        System.out.println(CountSeven.countSeven(123));
    }

    @Test
    public void Count8() {
        System.out.println("=========Count 8=========");
        System.out.println(Count8.count8(8));
        System.out.println(Count8.count8(818));
        System.out.println(Count8.count8(8818));
    }

    @Test
    public void PowerN() {
        System.out.println("=========PowerN=========");
        System.out.println(PowerN.powerN(3, 4));
        System.out.println(PowerN.powerN(2, 3));
        System.out.println(PowerN.powerN(4, 2));
        System.out.println(PowerN.powerN(2, 1));
        System.out.println(PowerN.powerN(1, 1));
        System.out.println(PowerN.powerN(10, 0));
        System.out.println(PowerN.powerN(0, 12));
    }

    @Test
    public void CountX() {
        System.out.println("=========CountX=========");
        System.out.println(CountX.countX("xxhixx"));
        System.out.println(CountX.countX("xhixhix"));
        System.out.println(CountX.countX("hi"));
    }

    @Test
    public void CountHi() {
        System.out.println("=========CountHi=========");
        System.out.println(CountHi.countHi("xxhixx"));
        System.out.println(CountHi.countHi("xhixhix"));
        System.out.println(CountHi.countHi("hi"));
    }

    @Test
    public void ChangeXY() {
        System.out.println("=========ChangeXY=========");
        System.out.println(ChangeXY.changeXY("xxhixx"));
        System.out.println(ChangeXY.changeXY("xhixhix"));
        System.out.println(ChangeXY.changeXY("hi"));
    }

    @Test
    public void ChangePi() {
        System.out.println("=========ChangePi=========");
        System.out.println(ChangePi.changePi("xpix"));
        System.out.println(ChangePi.changePi("pipi"));
        System.out.println(ChangePi.changePi("pip"));
    }

    @Test
    public void NoX() {
        System.out.println("=========NoX=========");
        System.out.println(NoX.noX("xaxb"));
        System.out.println(NoX.noX("abc"));
        System.out.println(NoX.noX("xx"));
    }

    @Test
    public void Array6() {
        System.out.println("=========Array6=========");
        int[] test1 = {1, 4, 6};
        int[] test2 = {1, 4};
        int[] test3 = {6};
        System.out.println(Array6.array6(test1, 0));
        System.out.println(Array6.array6(test2, 0));
        System.out.println(Array6.array6(test3, 0));
    }

    @Test
    public void Array11() {
        System.out.println("=========Array11=========");
        int[] test1 = {1, 2, 11};
        int[] test2 = {11, 11};
        int[] test3 = {1, 2, 3, 4};
        System.out.println(Array11.array11(test1, 0));
        System.out.println(Array11.array11(test2, 0));
        System.out.println(Array11.array11(test3, 0));
    }

    @Test
    public void Array220() {
        System.out.println("=========Array220=========");
        int[] test1 = {1, 2, 20};
        int[] test2 = {3, 30};
        int[] test3 = {3};
        System.out.println(Array220.array220(test1, 0));
        System.out.println(Array220.array220(test2, 0));
        System.out.println(Array220.array220(test3, 0));
    }

    @Test
    public void AllStar() {
        System.out.println("=========AllStar=========");
        System.out.println(AllStar.allStar("hello"));
        System.out.println(AllStar.allStar("abc"));
        System.out.println(AllStar.allStar("ab"));
        System.out.println(AllStar.allStar("a"));
    }

    @Test
    public void PairStar() {
        System.out.println("=========PairStar=========");
        System.out.println(PairStar.pairStar("hello"));
        System.out.println(PairStar.pairStar("xxyy"));
        System.out.println(PairStar.pairStar("aaaa"));
    }

    @Test
    public void EndX() {
        System.out.println("=========EndX=========");
        System.out.println(EndX.endX("xxre"));
        System.out.println(EndX.endX("xxhixx"));
        System.out.println(EndX.endX("xhixhix"));
    }

    @Test
    public void CountPairs() {
        System.out.println("=========CountPairs=========");
        System.out.println(CountPairs.countPairs("axa"));
        System.out.println(CountPairs.countPairs("axax"));
        System.out.println(CountPairs.countPairs("axab"));
        System.out.println(CountPairs.countPairs("axaxa"));
    }

    @Test
    public void CountAbc() {
        System.out.println("=========CountAbc=========");
        System.out.println(CountAbc.countAbc("abc"));
        System.out.println(CountAbc.countAbc("abcxxabc"));
        System.out.println(CountAbc.countAbc("abaxxaba"));
        System.out.println(CountAbc.countAbc("abcaba"));
    }

    @Test
    public void Count11() {
        System.out.println("=========Count11=========");
        System.out.println(Count11.count11("11abc11"));
        System.out.println(Count11.count11("abc11x11x11"));
        System.out.println(Count11.count11("111"));
    }

    @Test
    public void StringClean() {
        System.out.println("=========StringClean=========");
        System.out.println(StringClean.stringClean("yyzzza"));
        System.out.println(StringClean.stringClean("abbbcdd"));
        System.out.println(StringClean.stringClean("Hello"));
    }

    @Test
    public void CountHi2() {
        System.out.println("=========CountHi2=========");
        System.out.println(CountHi2.countHi2("ahixhi"));
        System.out.println(CountHi2.countHi2("ahibhi"));
        System.out.println(CountHi2.countHi2("xhixhi"));
    }

    @Test
    public void ParenBit() {
        System.out.println("=========ParenBit=========");
        System.out.println(ParenBit.parenBit("xyz(abc)123"));
        System.out.println(ParenBit.parenBit("x(hello)"));
        System.out.println(ParenBit.parenBit("(xy)1"));
    }

    @Test
    public void NestParen() {
        System.out.println("=========NestParen=========");
        System.out.println(NestParen.nestParen("(())"));
        System.out.println(NestParen.nestParen("((()))"));
        System.out.println(NestParen.nestParen("(((x))"));
        System.out.println(NestParen.nestParen("(yy)"));
    }

    @Test
    public void StrCopies() {
        System.out.println("=========StrCopies=========");
        System.out.println(StrCopies.strCopies("catcowcat", "cat", 2));
        System.out.println(StrCopies.strCopies("catcowcat", "cow", 2));
        System.out.println(StrCopies.strCopies("catcowcat", "cow", 1));
    }

    @Test
    public void StrDist() {
        System.out.println("=========StrDist=========");
        System.out.println(StrDist.strDist("catcowcat", "cat"));
        System.out.println(StrDist.strDist("catcowcat", "cow"));
        System.out.println(StrDist.strDist("cccatcowcatxx", "cat"));
    }

    @Test
    public void IsStringPalindromeRecursive() {
        System.out.println("=========IsStringPalindromeRecursive=========");
        System.out.println(IsStringPalindromeRecursive.isStringPalindromeRecursive("abcba"));
        System.out.println(IsStringPalindromeRecursive.isStringPalindromeRecursive("abcbd"));
        System.out.println(IsStringPalindromeRecursive.isStringPalindromeRecursive("abba"));
        System.out.println(IsStringPalindromeRecursive.isStringPalindromeRecursive("abbg"));
    }

    @Test
    public void Fibonacci() {
        System.out.println(Fibonacci.fibonacciRecursive(1));
        System.out.println(Fibonacci.fibonacciRecursive(2));
        System.out.println(Fibonacci.fibonacciRecursive(3));
        System.out.println(Fibonacci.fibonacciRecursive(4));
        System.out.println(Fibonacci.fibonacciDynamic(10));
        System.out.println(Fibonacci.fibonacciDynamic(20));
        System.out.println(Fibonacci.fibonacciDynamic(30));
    }

    @Test
    public void ReverseStack() {
        java.util.Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Stack<Integer> reversedStack = ReverseStack.reverseStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "->");
        }
        while (!reversedStack.isEmpty()) {
            System.out.print(reversedStack.pop() + "->");
        }
    }
}
