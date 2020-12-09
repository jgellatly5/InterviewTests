package com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.AppendList;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.DeleteMiddle;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.FindDuplicates;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.FindLength;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.FindMiddle;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.IsCyclic;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.PrintKthToLast;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.RemoveDuplicatesSorted;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.RemoveDuplicatesUnsorted;

import org.junit.Before;
import org.junit.Test;

public class LinkedListOperations {

    private LinkedListNode node;
    private LinkedListNode node2;
    private LinkedListNode node3;
    private LinkedListNode cyclicList;
    private LinkedListNode l1;
    private LinkedListNode l2;
    private LinkedListNode nodePalindrome;
    private LinkedListNode nodePalindrome2;
    private LinkedListNode nodeIntersection;
    private LinkedListNode nodeIntersection2;
    private LinkedListNode nodeSorted;

    @Before
    public void SetUp() {
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

        node3 = new LinkedListNode(5);
        node3.next = new LinkedListNode(1);
        node3.next.next = new LinkedListNode(3);
        node3.next.next.next = new LinkedListNode(7);
        node3.next.next.next.next = new LinkedListNode(10);
        node3.next.next.next.next.next = new LinkedListNode(10);
        node3.next.next.next.next.next.next = new LinkedListNode(11);
        node3.next.next.next.next.next.next.next = new LinkedListNode(11);

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

        nodeSorted = new LinkedListNode(1);
        nodeSorted.next = new LinkedListNode(1);
        nodeSorted.next.next = new LinkedListNode(2);
        nodeSorted.next.next.next = new LinkedListNode(2);
        nodeSorted.next.next.next.next = new LinkedListNode(2);
        nodeSorted.next.next.next.next.next = new LinkedListNode(3);
    }

    @Test
    public void AppendList() {
        LinkedListNode l1 = new LinkedListNode(2);
        l1.next = new LinkedListNode(4);
        l1.next.next = new LinkedListNode(6);
        LinkedListNode l2 = new LinkedListNode(3);
        l2.next = new LinkedListNode(5);
        l2.next.next = new LinkedListNode(7);
        LinkedListNode.print(AppendList.appendList(l1, l2));
    }

    @Test
    public void DeleteMiddle() {
        System.out.println("=========DeleteMiddle=========");
        System.out.println("findLength before: " + FindLength.findLength(node));
        LinkedListNode.print(node);
        DeleteMiddle.deleteMiddle(node);
        System.out.println("findLength after: " + FindLength.findLength(node));
        LinkedListNode.print(node);
        System.out.println("\n=========DeleteMiddle=========");
        System.out.println("findLength before: " + FindLength.findLength(node2));
        LinkedListNode.print(node2);
        System.out.println("findLength after: " + FindLength.findLength(node2));
        LinkedListNode.print(node2);
    }

    @Test
    public void FindDuplicates() {
        System.out.println("=========Find Duplicates Loops=========");
        LinkedListNode.print(node2);
        FindDuplicates.findDuplicatesLoops(node2);
        System.out.println("\n=========Find Duplicates Set=========");
        LinkedListNode.print(node2);
        FindDuplicates.findDuplicatesSet(node2);
        System.out.println("\n=========Find Duplicates Set=========");
        LinkedListNode.print(node2);
        FindDuplicates.findDuplicatesCount(node2);
    }

    @Test
    public void FindLength() {
        System.out.println("=========FindLength Iteratively=========");
        int length = FindLength.findLength(node);
        LinkedListNode.print(node);
        System.out.println("findLength: " + length);
        System.out.println("\n=========FindLength Recursively=========");
        LinkedListNode.print(node);
        int length3 = FindLength.findLengthRecursive(node);
        System.out.println("findLength: " + length3);
    }

    @Test
    public void FindMiddle() {
        LinkedListNode.print(l2);
        int middle = FindMiddle.findMiddle(l2);
        System.out.println("findMiddle: " + middle);
    }

    @Test
    public void IsCyclic() {
        System.out.println("=========IsCyclic=========");
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(node));
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(cyclicList));
        System.out.println("=========IsCyclicSet=========");
        System.out.println("List is cyclic: " + IsCyclic.isCyclicSet(node));
        System.out.println("List is cyclic: " + IsCyclic.isCyclicSet(cyclicList));
    }

    @Test
    public void PrintKthToLast() {
        System.out.println("=========PrintKthToLastUsingLength=========");
        LinkedListNode.print(node);
        PrintKthToLast.printKthToLastUsingLength(node, 5);
        System.out.println("\n=========PrintKthToLastPointers=========");
        LinkedListNode.print(node);
        PrintKthToLast.printKthToLastPointers(node, 5);
        System.out.println("\n=========PrintKthToLastRecursively=========");
        LinkedListNode.print(node);
        PrintKthToLast.printKthToLastRecursive(node, 5);
    }

    @Test
    public void RemoveDuplicatesSortedIterative() {
        System.out.println("=========RemoveDuplicatesSorted=========");
        LinkedListNode.print(nodeSorted);
        RemoveDuplicatesSorted.removeDuplicatesSorted(nodeSorted);
        LinkedListNode.print(nodeSorted);
    }

    @Test
    public void RemoveDuplicatesSortedRecursive() {
        System.out.println("=========RemoveDuplicatesSorted=========");
        LinkedListNode.print(nodeSorted);
        RemoveDuplicatesSorted.removeDuplicatesRecursive(nodeSorted);
        LinkedListNode.print(nodeSorted);
    }

    @Test
    public void RemoveDuplicatesUnsorted() {
        System.out.println("=========RemoveDuplicatesSet=========");
        LinkedListNode.print(node);
        RemoveDuplicatesUnsorted.removeDuplicates(node);
        LinkedListNode.print(node);
        System.out.println("\n=========RemoveDuplicatesLoops=========");
        LinkedListNode.print(node3);
        RemoveDuplicatesUnsorted.removeDuplicatesLoops(node3);
        LinkedListNode.print(node3);
    }
}
