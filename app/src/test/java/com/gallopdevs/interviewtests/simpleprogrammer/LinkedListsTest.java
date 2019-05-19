package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.DeleteMiddleNode;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindLength;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsPalindrome;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.Partition;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicates;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReturnKthToLast;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReverseList;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.SumLists;

import org.junit.Before;
import org.junit.Test;

public class LinkedListsTest {

    private LinkedListNode node;
    private LinkedListNode l1;
    private LinkedListNode l2;
    private LinkedListNode nodePalindrome;

    @Before
    public void setUp() throws Exception {
        node = new LinkedListNode(5);
        node.next = new LinkedListNode(1);
        node.next.next = new LinkedListNode(3);
        node.next.next.next = new LinkedListNode(7);
        node.next.next.next.next = new LinkedListNode(10);
        node.next.next.next.next.next = new LinkedListNode(10);
        node.next.next.next.next.next.next = new LinkedListNode(11);
        node.next.next.next.next.next.next.next = new LinkedListNode(11);

        l1 = new LinkedListNode(6);
        l1.next = new LinkedListNode(7);
        l1.next.next = new LinkedListNode(8);

        l2 = new LinkedListNode(4);
        l2.next = new LinkedListNode(3);
        l2.next.next = new LinkedListNode(2);

        nodePalindrome = new LinkedListNode(6);
        nodePalindrome.next = new LinkedListNode(1);
        nodePalindrome.next.next = new LinkedListNode(2);
        nodePalindrome.next.next.next = new LinkedListNode(1);
        nodePalindrome.next.next.next.next = new LinkedListNode(6);
    }

    @Test
    public void FindLength() {
        int length = FindLength.length(node);
        System.out.println("length: " + length);
    }

    //TODO create
    @Test
    public void IsCyclic() {

    }

    @Test
    public void RemoveDuplicates() {
        RemoveDuplicates.removeDuplicates(node);
        prettyPrint(node);
    }

    @Test
    public void DeleteMiddleNode() {
        System.out.println("length before: " + FindLength.length(node));
        DeleteMiddleNode.deleteNode(node.next);
        prettyPrint(node);
        System.out.println("length after: " + FindLength.length(node));
    }

    @Test
    public void ReverseList() {
        prettyPrint(ReverseList.reverseListOther(node));
    }

    @Test
    public void PrintKthToLast() {
        ReturnKthToLast.printKthToLast(node, 3);
    }

    //TODO fix
    @Test
    public void Partition() {
        prettyPrint(Partition.partition(node, 11));
    }

    @Test
    public void SumLists() {
        prettyPrint(SumLists.sumLists(l1, l2, 0));
    }

    @Test
    public void IsPalindrome() {
        System.out.println(IsPalindrome.isPalindrome(node));
        System.out.println(IsPalindrome.isPalindrome(nodePalindrome));
    }

    //TODO create
    @Test
    public void FindIntersection() {
    }

    private void prettyPrint(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
