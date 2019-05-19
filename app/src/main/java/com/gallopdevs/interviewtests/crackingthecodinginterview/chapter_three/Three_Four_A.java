package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_three;

import java.util.Stack;

public class Three_Four_A {

    public static class MyQueue<T> {
        Stack<T> stackNewest, stackOldest;

        public MyQueue() {
            stackNewest = new Stack<>();
            stackOldest = new Stack<>();
        }

        public int size() {
            return stackNewest.size() + stackOldest.size();
        }

        public void add(T value) {
            stackNewest.push(value);
        }

        private void shiftStacks() {
            if (stackOldest.isEmpty()) {
                while (!stackNewest.isEmpty()) {
                    stackOldest.push(stackNewest.pop());
                }
            }
        }

        public T peek() {
            shiftStacks();
            return stackOldest.peek();
        }

        public T remove() {
            shiftStacks();
            return stackOldest.pop();
        }
    }
}
