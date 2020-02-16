package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.stacks.ReverseStackUsingRecursion;
import com.gallopdevs.interviewtests.questionsbytype.stacks.SortStackUsingRecursion;
import com.gallopdevs.interviewtests.questionsbytype.stacks.SortStackUsingTempStack;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    // 4. Reverse a stack without using extra space in O(n)
    // 5. Delete middle element of a stack
    // 6. Sorting array using stacks
    // 7. Implement queue using stacks
    // 8. Implement two stacks in an array
    // 9. Implement stack using priority queue / heap

    // https://www.geeksforgeeks.org/stack-data-structure/
    // https://medium.com/@codingfreak/stack-data-structure-practice-problems-and-interview-questions-9f08a35a7f19

    private Stack<Character> stack;
    private Stack<Integer> stack2;

    @Before
    public void SetUp() {
        stack = new Stack<>();
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');

        stack2 = new Stack<>();
        stack2.push(77);
        stack2.push(4774);
        stack2.push(22);
        stack2.push(10);
        stack2.push(987);
    }

    @Test
    public void ReverseStackUsingRecursion() {
        System.out.println("Original Stack");
        System.out.println(stack);
        ReverseStackUsingRecursion.reverse(stack);
        System.out.println("Reversed Stack");
        System.out.println(stack);
    }

    @Test
    public void SortStackUsingRecursion() {
        System.out.println("Original Stack");
        System.out.println(stack2);
        SortStackUsingRecursion.sortStack(stack2);
        System.out.println("Sorted Stack");
        System.out.println(stack2);
    }

    // TODO
    @Test
    public void SortStackUsingTempStack() {
        System.out.println("Original Stack");
        System.out.println(stack2);
        SortStackUsingTempStack.sortStack(stack2);
        System.out.println("Sorted Stack");
        System.out.println(stack2);
    }
}
