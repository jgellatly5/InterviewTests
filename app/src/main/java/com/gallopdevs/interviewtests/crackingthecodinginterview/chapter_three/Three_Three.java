package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_three;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Three_Three {

    public static class SetOfStacks {
        ArrayList<Stack> stacks = new ArrayList<>();
        private int capacity;
        public SetOfStacks(int capacity) {
            this.capacity = capacity;
        }

        public Stack getLastStack() {
            if (stacks.size() == 0) return null;
            return stacks.get(stacks.size() - 1);
        }

        public void push(int v) {
            Stack last = getLastStack();
            if (last != null && !last.isFull()) {
                last.push(v);
            } else {
                Stack stack = new Stack(capacity);
                stack.push(v);
                stacks.add(stack);
            }
        }

        public int pop() {
            Stack last = getLastStack();
            if (last == null) throw new EmptyStackException();
            int v = (int) last.pop();
            if (last.size == 0) stacks.remove(stacks.size() - 1);
            return v;
        }

        public boolean isEmpty() {
            Stack last = getLastStack();
            return last == null || last.isEmpty();
        }

        public int popAt(int index) {
            return leftShift(index, true);
        }

        public int leftShift(int index, boolean removeTop) {
            Stack stack = stacks.get(index);
            int removedItem;
            if (removeTop) removedItem = stack.pop();
            else removedItem = stack.removeBottom();
            if (stack.isEmpty()) {
                stacks.remove(index);
            } else if (stacks.size() > index + 1) {
                int v = leftShift(index + 1, false);
                stack.push(v);
            }
            return removedItem;
        }

        public static class Node {
            private int data;
            private Node below, above;
            public Node(int data) {
                this.data = data;
            }
        }

        public static class Stack {
            private int capacity;
            public Node top, bottom;
            public int size;

            public Stack(int capacity) {
                this.capacity = capacity;
            }

            public boolean isFull() {
                return capacity == size;
            }

            public void join(Node above, Node below) {
                if (below != null) below.above = above;
                if (below != null) above.below = below;
            }

            public boolean push(int v) {
                if (size >= capacity) return false;
                size++;
                Node n = new Node(v);
                if (size == 1) bottom = n;
                join(n, top);
                top = n;
                return true;
            }

            public int pop() {
                Node t = top;
                top = top.below;
                size--;
                return t.data;
            }

            public boolean isEmpty() {
                return size == 0;
            }

            public int removeBottom() {
                Node b = bottom;
                bottom = bottom.above;
                if (bottom != null) bottom.below = null;
                size--;
                return b.data;
            }
        }
    }
}
