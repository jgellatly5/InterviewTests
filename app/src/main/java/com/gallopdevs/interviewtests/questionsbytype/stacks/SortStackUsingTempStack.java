package com.gallopdevs.interviewtests.questionsbytype.stacks;

import java.util.Stack;

public class SortStackUsingTempStack {
    public static Stack<Integer> sortStack(Stack<Integer> originalStack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!originalStack.isEmpty()) {
            // pop out the first element
            int value = originalStack.pop();
            // while temporary stack is not empty and
            // top of stack is greater than temp
            while (!tempStack.isEmpty() && tempStack.peek() > value) {
                // pop from temporary stack and
                // push it to the input stack
                originalStack.push(tempStack.pop());
            }
            // push temp in temporary of stack
            tempStack.push(value);
        }
        return tempStack;
    }
}
