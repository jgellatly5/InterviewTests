package com.gallopdevs.interviewtests.crackingthecodinginterview;

import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two.Two_Five;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two.Two_Four;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two.Two_Six;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two.Two_Three;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two.Two_Two;
import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two.Two_One;
import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import org.junit.Assert;
import org.junit.Test;

public class Chapter_Two {

    @Test
    public void RemoveDups() {
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.addBack(1);
        linkedListNode.addBack(1);
        linkedListNode.addBack(3);
        linkedListNode.addBack(3);
        linkedListNode.addBack(2);
        linkedListNode.addBack(1);

        Two_One.removeDuplicates(linkedListNode);
        linkedListNode.print();
    }

    @Test
    public void PrintKthToLast() {
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.addBack(1);
        linkedListNode.addBack(1);
        linkedListNode.addBack(3);
        linkedListNode.addBack(3);
        linkedListNode.addBack(2);
        linkedListNode.addBack(1);

        Two_Two.printKthToLast(linkedListNode.head, 2);
    }

    @Test
    public void DeleteMiddleNode() {
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.addBack(1);
        linkedListNode.addBack(1);
        linkedListNode.addBack(3);
        linkedListNode.addBack(3);
        linkedListNode.addBack(2);
        linkedListNode.addBack(1);

        LinkedListNode node = linkedListNode.findNodeAtIndex(2);

        Two_Three.deleteMiddleNode(node);
        linkedListNode.print();
    }

    /*Not Working*/
    @Test
    public void Partition() {
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.addBack(5);
        linkedListNode.addBack(1);
        linkedListNode.addBack(3);
        linkedListNode.addBack(8);
        linkedListNode.addBack(9);
        linkedListNode.addBack(7);

        Two_Four.partition(linkedListNode, 3);
    }

    /*Not Working*/
    @Test
    public void SumLists() {
        LinkedListNode listOne = new LinkedListNode();
        LinkedListNode listTwo = new LinkedListNode();

        listOne.addBack(7);
        listOne.addBack(1);
        listOne.addBack(6);

        LinkedListNode node = listOne.findNodeAtIndex(2);
        System.out.println(node.data);

        listTwo.addBack(5);
        listTwo.addBack(9);
        listTwo.addBack(2);

        Two_Five.sumLists(listOne, listTwo, 0);
    }

    /*Not Working*/
    @Test
    public void IsPalindrome() {
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.addBack(5);
        linkedListNode.addBack(1);
        linkedListNode.addBack(8);
        linkedListNode.addBack(1);
        linkedListNode.addBack(4);
        Assert.assertFalse(Two_Six.isPalindrome(linkedListNode));
    }
}
