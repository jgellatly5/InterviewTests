package com.gallopdevs.interviewtests.questionsbytype;

import android.net.http.SslCertificate;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.questionsbytype.integers.ClockAngle;
import com.gallopdevs.interviewtests.questionsbytype.integers.GrayCode;
import com.gallopdevs.interviewtests.questionsbytype.integers.IntegerToRoman;
import com.gallopdevs.interviewtests.questionsbytype.integers.IsPalindrome;
import com.gallopdevs.interviewtests.questionsbytype.integers.LineIntersection;
import com.gallopdevs.interviewtests.questionsbytype.integers.ReverseInt;
import com.gallopdevs.interviewtests.questionsbytype.integers.RotateBits;
import com.gallopdevs.interviewtests.questionsbytype.integers.SwapWithoutTemp;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.LinkedList;

import static com.gallopdevs.interviewtests.algorithms.SieveOfEratosthenes.print;

public class IntegersTest {

    @Test
    public void IntegerToRoman() {
        System.out.println(IntegerToRoman.integerToRoman(1));
        System.out.println(IntegerToRoman.integerToRoman(4));
        System.out.println(IntegerToRoman.integerToRoman(49));
    }

    @Test
    public void SwapWithoutTemp() {
        SwapWithoutTemp.swapDecimal(5, 15);
        SwapWithoutTemp.swapBinary(7, 9);
    }

    @Test
    public void ClockAngle() {
        System.out.println(ClockAngle.clockAngle(11, 10));
        System.out.println(ClockAngle.clockAngle(3, 0));
        System.out.println(ClockAngle.clockAngle(3, 40));
    }

    @Test
    public void LineIntersection() {
        LineIntersection.Line a = new LineIntersection.Line(0, 1);
        LineIntersection.Line b = new LineIntersection.Line(0, 2);
        LineIntersection.Line c = new LineIntersection.Line(1, 0);
        LineIntersection.Line d = new LineIntersection.Line(1, 1);
        System.out.println(a.intersect(b));
        System.out.println(c.intersect(d));
        System.out.println(a.intersect(c));
    }

    @Test
    public void GrayCode() {
        System.out.println(GrayCode.isGraySimple(0, 1));
        System.out.println(GrayCode.isGrayAdvanced(0, 1));
        System.out.println(GrayCode.isGraySimple(1, 2));
        System.out.println(GrayCode.isGrayAdvanced(1, 2));
    }

    @Test
    public void RotateBits() {
        int i = RotateBits.rotateClockwise(0xFFFF0000, 8);
        System.out.println(Integer.toHexString(i));
        int j = RotateBits.rotateCounterClockwise(0xFFFF0000, 8);
        System.out.println(Integer.toHexString(j));
    }

    @Test
    public void ReverseInt() {
        System.out.println(ReverseInt.reverseInt(-123));
    }

    @Test
    public void IsPalindrome() {
        System.out.println(IsPalindrome.isPalindrome(123));
        System.out.println(IsPalindrome.isPalindrome(121));
        System.out.println(IsPalindrome.isPalindrome(-121));
    }

    @Test
    public void MathOperations() {
        // Absolute Value
        System.out.println("Absolute Value: " + Math.abs(-3));
        // Return max of two numbers
        System.out.println("Max: " + Math.max(5, 10));
        // Return min of two numbers
        System.out.println("Min: " + Math.min(5, 10));
        // Rounding numbers (float or double)
        System.out.println("Rounding (float): " + Math.round(5.4f));
        System.out.println("Rounding (double): " + Math.round(7.6d));
        // Square root
        System.out.println("Square root: " + Math.sqrt(9));
        System.out.println("Square root: " + Math.sqrt(10));
        // Cube root
        System.out.println("Cube root: " + Math.cbrt(8));
        System.out.println("Cube root: " + Math.cbrt(27));
        // Power of n
        System.out.println("Power of n: " + Math.pow(2, 3));
        System.out.println("Power of n: " + Math.pow(3, 4));
        // Sign of number
        System.out.println("Sign of number: " + Math.signum(-2));
        System.out.println("Sign of number: " + Math.signum(2));
        // Ceiling
        System.out.println("Ceiling: " + Math.ceil(3.1));
        System.out.println("Ceiling: " + Math.ceil(3.9));
        // Floor
        System.out.println("Floor: " + Math.floor(3.1));
        System.out.println("Floor: " + Math.floor(3.9));
        // Isolating Digits
        System.out.println("Isolating digits:");
        printDigits(1234);
        // Integer to String conversion
        String number1 = Integer.toString(123);
        System.out.println(number1);
        String number2 = String.valueOf(456);
        System.out.println(number2);
        int number3 = 789;
        DecimalFormat df = new DecimalFormat("#");
        System.out.println(df.format(number3));
        int number4 = 455;
        System.out.println(Integer.toBinaryString(number4));
        int number5 = 765;
        System.out.println(Integer.toHexString(number5));
    }

    private void printDigits(int number) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (number > 0) {
            stack.push( number % 10 );
            number = number / 10;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
