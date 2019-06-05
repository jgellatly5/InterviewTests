package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.simpleprogrammer.misc.Fibonacci;
import com.gallopdevs.interviewtests.simpleprogrammer.misc.FizzBuzz;

import org.junit.Test;

public class MiscTest {

    @Test
    public void FizzBuzz() {
        FizzBuzz.printFizzBuzz();
    }

    @Test
    public void Fibonacci() {
        System.out.println(Fibonacci.fib(5));
    }
}
