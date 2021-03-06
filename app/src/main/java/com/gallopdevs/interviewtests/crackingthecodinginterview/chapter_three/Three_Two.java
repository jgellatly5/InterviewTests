package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_three;

import java.util.Stack;

public class Three_Two {

    public static class StackWithMin extends Stack<NodeWithMin> {
        public void push(int value) {
            int newMin = Math.min(value, min());
            super.push(new NodeWithMin(value, newMin));
        }

        public int min() {
            if (this.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return peek().min;
            }
        }
    }

    public static class NodeWithMin {
        public int value;
        public int min;
        public NodeWithMin(int v, int min) {
            value = v;
            this.min = min;
        }
    }
}
