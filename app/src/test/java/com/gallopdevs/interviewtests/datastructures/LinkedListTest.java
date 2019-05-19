package com.gallopdevs.interviewtests.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedListNode mLinkedListNode;

    @Before
    public void SetUp() throws Exception {
        mLinkedListNode = new LinkedListNode();
    }

    @Test
    public void AddFront() {
        mLinkedListNode.addFront(1);
        mLinkedListNode.addFront(2);
        mLinkedListNode.addFront(3);

        Assert.assertEquals(3, mLinkedListNode.getFirst());
        Assert.assertEquals(1, mLinkedListNode.getLast());
    }

    @Test
    public void GetFirst() {
        mLinkedListNode.addFront(1);
        Assert.assertEquals(1, mLinkedListNode.getFirst());
    }

    @Test
    public void GetLast() {
        mLinkedListNode.addFront(1);
        mLinkedListNode.addFront(2);
        mLinkedListNode.addFront(3);

        Assert.assertEquals(1, mLinkedListNode.getLast());
    }

    @Test
    public void AddBack() {
        mLinkedListNode.addBack(1);
        mLinkedListNode.addBack(2);
        mLinkedListNode.addBack(3);

        Assert.assertEquals(1, mLinkedListNode.getFirst());
        Assert.assertEquals(3, mLinkedListNode.getLast());
    }

    @Test
    public void Size() {
        Assert.assertEquals(0, mLinkedListNode.size());
        mLinkedListNode.addBack(1);
        Assert.assertEquals(1, mLinkedListNode.size());
        mLinkedListNode.addBack(2);
        Assert.assertEquals(2, mLinkedListNode.size());
    }

    @Test
    public void Clear() {
        mLinkedListNode.addBack(1);
        mLinkedListNode.addBack(2);
        mLinkedListNode.addBack(3);

        mLinkedListNode.clear();

        Assert.assertEquals(0, mLinkedListNode.size());
    }

    @Test
    public void DeleteValue() {
        mLinkedListNode.addBack(1);
        mLinkedListNode.addBack(2);
        mLinkedListNode.addBack(3);

        mLinkedListNode.delete(2);

        Assert.assertEquals(2, mLinkedListNode.size());
        Assert.assertEquals(1, mLinkedListNode.getFirst());
        Assert.assertEquals(3, mLinkedListNode.getLast());
    }
}
