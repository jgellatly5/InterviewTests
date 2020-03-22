package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.integers.ClockAngle;
import com.gallopdevs.interviewtests.questionsbytype.integers.IntegerToRoman;
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
}
