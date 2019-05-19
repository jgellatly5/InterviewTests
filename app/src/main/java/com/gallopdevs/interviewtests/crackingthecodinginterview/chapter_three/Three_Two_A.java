package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_three;

import java.util.Stack;

public class Three_Two_A {

    public static class StackWithMin extends Stack<StackWithMin.NodeWithMin> {
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

        public class NodeWithMin {
            public int value;
            public int min;

            public NodeWithMin(int value, int min) {
                this.value = value;
                this.min = min;
            }
        }
    }
}
