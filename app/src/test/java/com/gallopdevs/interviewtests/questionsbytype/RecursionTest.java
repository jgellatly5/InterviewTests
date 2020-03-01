package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.recursive.BunnyEars;
import com.gallopdevs.interviewtests.questionsbytype.recursive.BunnyEarsVariation;
import com.gallopdevs.interviewtests.questionsbytype.recursive.ChangeXY;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Count8;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountHi;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountSeven;
import com.gallopdevs.interviewtests.questionsbytype.recursive.CountX;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Factorial;
import com.gallopdevs.interviewtests.questionsbytype.recursive.MakingChange;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Permutations;
import com.gallopdevs.interviewtests.questionsbytype.recursive.PowerN;
import com.gallopdevs.interviewtests.questionsbytype.recursive.SumDigits;
import com.gallopdevs.interviewtests.questionsbytype.recursive.Triangle;
import com.gallopdevs.interviewtests.questionsbytype.recursive.VerifyBST;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
}
