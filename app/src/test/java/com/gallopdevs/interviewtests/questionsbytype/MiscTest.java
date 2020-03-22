package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.recursive.Fibonacci;
import com.gallopdevs.interviewtests.questionsbytype.arrays.FizzBuzz;

import org.junit.Test;

public class MiscTest {

    @Test
    public void FizzBuzz() {
        FizzBuzz.printFizzBuzz();
    }

    @Test
    public void Fibonacci() {
        System.out.println(Fibonacci.fibonacciRecursive(5));
    }
}
