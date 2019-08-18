package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.DeleteMiddleNode;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.DeleteMiddleNode2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindLength;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindLength2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsCyclic;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsPalindrome;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.Partition;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.Partition2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicates;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicates2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReturnKthToLast;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReturnKthToLast2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReverseList;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.SumLists;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.SumLists2;

import org.junit.Before;
import org.junit.Test;

public class LinkedListsTest {

    private LinkedListNode node;
    private LinkedListNode node2;
    private LinkedListNode cyclicList;
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

        node2 = new LinkedListNode(5);
        node2.next = new LinkedListNode(1);
        node2.next.next = new LinkedListNode(3);
        node2.next.next.next = new LinkedListNode(7);
        node2.next.next.next.next = new LinkedListNode(10);
        node2.next.next.next.next.next = new LinkedListNode(10);
        node2.next.next.next.next.next.next = new LinkedListNode(11);
        node2.next.next.next.next.next.next.next = new LinkedListNode(11);

        cyclicList = new LinkedListNode(4);
        cyclicList.next = new LinkedListNode(1);
        cyclicList.next.next = new LinkedListNode(3);
        cyclicList.next.next.next = cyclicList;
        cyclicList.next.next.next.next = new LinkedListNode(7);

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
        System.out.println("=========Test1 FindLength=========");
        int length = FindLength.length(node);
        System.out.println("length: " + length);
        System.out.println("=========Test2 FindLength=========");
        int length2 = FindLength2.findLength(node);
        System.out.println("length: " + length2);
    }

    //TODO create
    @Test
    public void IsCyclic() {
        System.out.println("=========Test1 IsCyclic=========");
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(node));
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(cyclicList));
    }

    @Test
    public void RemoveDuplicates() {
        System.out.println("=========Test1 RemoveDuplicates=========");
        prettyPrint(node);
        RemoveDuplicates.removeDuplicates(node);
        prettyPrint(node);
        System.out.println();
        System.out.println("=========Test2 RemoveDuplicates=========");
        prettyPrint(node2);
        RemoveDuplicates2.removeDuplicates(node2);
        prettyPrint(node2);
    }

    @Test
    public void DeleteMiddleNode() {
        System.out.println("=========Test1 DeleteMiddleNode=========");
        System.out.println("length before: " + FindLength.length(node));
        DeleteMiddleNode.deleteMiddleNode(node.next);
        prettyPrint(node);
        System.out.println("length after: " + FindLength.length(node));
        System.out.println();
        System.out.println("=========Test2 DeleteMiddleNode=========");
        System.out.println("length before: " + FindLength.length(node));
        DeleteMiddleNode2.deleteMiddleNode(node.next);
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
        ReturnKthToLast2.printKthToLast(node, 3);
    }

    //TODO fix
    @Test
    public void Partition() {
        prettyPrint(Partition.partition(node, 5));
        prettyPrint(Partition2.partition(node, 5));
    }

    @Test
    public void SumLists() {
        System.out.println("=========Test1=========");
        prettyPrint(SumLists.sumLists(l1, l2, 0));
        System.out.println();
        System.out.println("=========Test2=========");
        prettyPrint(SumLists2.sumLists(l1, l2, 0));
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
