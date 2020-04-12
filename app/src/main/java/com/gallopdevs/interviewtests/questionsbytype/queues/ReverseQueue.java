package com.gallopdevs.interviewtests.questionsbytype.queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    // Time: O(n)
    // Space: O(n)
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }
}
