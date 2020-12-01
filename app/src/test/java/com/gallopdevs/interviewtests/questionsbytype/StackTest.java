package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.stacks.ReverseStack;
import com.gallopdevs.interviewtests.questionsbytype.stacks.SortStackUsingRecursion;
import com.gallopdevs.interviewtests.questionsbytype.stacks.SortStackUsingTempStack;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

public class StackTest {
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
    public void ReverseStack() {
        System.out.println("Original Stack");
        System.out.println(stack2);
        System.out.println("Reversed Stack");
        System.out.println(ReverseStack.reverseStack(stack2));
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

    @Test
    public void Practice() {

    }

//    private boolean isValid(String s) {
//        HashMap<String, String> mappings = new HashMap<>();
//        mappings.put("{", "}");
//        mappings.put("[", "]");
//        mappings.put("(", ")");
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (stack.isEmpty()) stack.push(s.charAt(i));
//            else
//        }
//    }
}
