package com.gallopdevs.interviewtests.questionsbytype;

import android.support.annotation.NonNull;

import com.gallopdevs.interviewtests.questionsbytype.queues.ReverseQueue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {
    // https://www.geeksforgeeks.org/queue-data-structure/
    // https://medium.com/@codingfreak/queue-data-structure-practice-problems-and-interview-questions-f459bf0578db

    private Queue<Integer> queue;

    @Before
    public void SetUp() {
        queue = new ArrayDeque<>();
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
    }

    @Test
    public void ReverseQueue() {
        System.out.println(queue);
        System.out.println(ReverseQueue.reverseQueue(queue));
    }
}
