package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.questionsbytype.integers.ClockAngle;
import com.gallopdevs.interviewtests.questionsbytype.integers.GrayCode;
import com.gallopdevs.interviewtests.questionsbytype.integers.IntegerToRoman;
import com.gallopdevs.interviewtests.questionsbytype.integers.LineIntersection;
import com.gallopdevs.interviewtests.questionsbytype.integers.RotateBits;
import com.gallopdevs.interviewtests.questionsbytype.integers.SwapWithoutTemp;

import org.junit.Test;

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
}
