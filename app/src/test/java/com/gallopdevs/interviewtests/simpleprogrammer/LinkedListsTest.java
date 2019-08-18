package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.DeleteMiddleNode;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.DeleteMiddleNode2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindIntersection;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindIntersection2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindLength;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindLength2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsCyclic;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsCyclic2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsPalindrome;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.Partition;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.Partition2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicates;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicates2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReturnKthToLast;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReturnKthToLast2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReverseList;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.ReverseList2;
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
    private LinkedListNode nodePalindrome2;
    private LinkedListNode nodeIntersection;
    private LinkedListNode nodeIntersection2;

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
        cyclicList.next.next.next = new LinkedListNode(7);
        cyclicList.next.next.next.next = cyclicList;

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

        nodePalindrome2 = new LinkedListNode(6);
        nodePalindrome2.next = new LinkedListNode(1);
        nodePalindrome2.next.next = new LinkedListNode(2);
        nodePalindrome2.next.next.next = new LinkedListNode(1);
        nodePalindrome2.next.next.next.next = new LinkedListNode(6);

        nodeIntersection = new LinkedListNode(7);
        nodeIntersection.next = new LinkedListNode(6);
        nodeIntersection.next.next = new LinkedListNode(1);
        nodeIntersection.next.next.next = new LinkedListNode(4);

        nodeIntersection2 = new LinkedListNode(5);
        nodeIntersection2.next = nodeIntersection.next;
    }

    @Test
    public void FindLength() {
        System.out.println("=========Test1 FindLength=========");
        int length = FindLength.findLength(node);
        System.out.println("findLength: " + length);
        System.out.println("\n=========Test2 FindLength=========");
        int length2 = FindLength2.findLength(node);
        System.out.println("findLength: " + length2);
    }

    @Test
    public void IsCyclic() {
        System.out.println("=========Test1 IsCyclic=========");
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(node));
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(cyclicList));
        System.out.println("\n=========Test2 IsCyclic=========");
        System.out.println("List is cyclic: " + IsCyclic2.isCyclic(node));
        System.out.println("List is cyclic: " + IsCyclic2.isCyclic(cyclicList));
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
        System.out.println("findLength before: " + FindLength.findLength(node));
        prettyPrint(node);
        DeleteMiddleNode.deleteMiddleNode(node.next);
        System.out.println("findLength after: " + FindLength.findLength(node));
        prettyPrint(node);
        System.out.println("\n=========Test2 DeleteMiddleNode=========");
        System.out.println("findLength before: " + FindLength.findLength(node2));
        prettyPrint(node2);
        DeleteMiddleNode2.deleteMiddleNode(node2.next);
        System.out.println("findLength after: " + FindLength.findLength(node2));
        prettyPrint(node2);
    }

    @Test
    public void ReverseList() {
        System.out.println("=========Test1 ReverseList=========");
        prettyPrint(node);
        prettyPrint(ReverseList.reverseList(node));
        System.out.println("\n=========Test2 ReverseList=========");
        prettyPrint(node2);
        prettyPrint(ReverseList2.reverseList(node2));
    }

    @Test
    public void PrintKthToLast() {
        System.out.println("=========Test1 PrintKthToLast=========");
        prettyPrint(node);
        ReturnKthToLast.printKthToLast(node, 3);
        System.out.println("\n=========Test2 PrintKthToLast=========");
        prettyPrint(node2);
        ReturnKthToLast2.printKthToLast(node2, 3);
    }

    @Test
    public void Partition() {
        System.out.println("=========Test1 Partition=========");
        prettyPrint(node);
        prettyPrint(Partition.partition(node, 3));
        System.out.println("\n=========Test2 Partition=========");
        prettyPrint(node2);
        prettyPrint(Partition2.partition(node2, 3));
    }

    @Test
    public void SumLists() {
        System.out.println("=========Test1 SumLists=========");
        prettyPrint(l1);
        prettyPrint(l2);
        prettyPrint(SumLists.sumLists(l1, l2, 0));
        System.out.println("\n=========Test2 SumLists=========");
        prettyPrint(l1);
        prettyPrint(l2);
        prettyPrint(SumLists2.sumLists(l1, l2, 0));
    }

    @Test
    public void IsPalindrome() {
        System.out.println("=========Test1 IsPalindrome=========");
        prettyPrint(node);
        System.out.println(IsPalindrome.isPalindrome(node));
        prettyPrint(nodePalindrome);
        System.out.println(IsPalindrome.isPalindrome(nodePalindrome));
        System.out.println("\n=========Test2 IsPalindrome=========");
        prettyPrint(node2);
        System.out.println(IsPalindrome.isPalindrome(node2));
        prettyPrint(nodePalindrome2);
        System.out.println(IsPalindrome.isPalindrome(nodePalindrome2));
    }

    @Test
    public void FindIntersection() {
        System.out.println("=========Test1 FindIntersection=========");
        prettyPrint(nodeIntersection);
        prettyPrint(nodeIntersection2);
        LinkedListNode pointOfIntersection = FindIntersection.findIntersection(nodeIntersection, nodeIntersection2);
        System.out.println(pointOfIntersection.data);
        System.out.println("\n=========Test2 FindIntersection=========");
        prettyPrint(nodeIntersection);
        prettyPrint(nodeIntersection2);
        LinkedListNode pointOfIntersection2 = FindIntersection2.findIntersection(nodeIntersection, nodeIntersection2);
        System.out.println(pointOfIntersection2.data);
    }

    private void prettyPrint(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
