package com.gallopdevs.interviewtests.questionsbytype.stacks;

import java.util.HashMap;
import java.util.Stack;

public class IsValid {
    // Time: O(n)
    // Space: O(n)
    public static boolean isValid(String s) {
        // Hash table that takes care of the mappings.
        HashMap<Character, Character> mappings = new HashMap<>();
        // Initialize hash map with mappings. This simply makes the code easier to read.
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {
                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();
                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }
}
