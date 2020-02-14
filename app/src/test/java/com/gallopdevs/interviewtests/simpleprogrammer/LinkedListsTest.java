package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.DeleteMiddle;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindIntersection;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindIntersection2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindLength;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindLength2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.FindMiddle;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsCyclic;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsCyclic2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsPalindromeCloneAndReverse;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsPalindromeCloneAndReverse2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.IsPalindromeStack;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.Partition;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.Partition2;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicatesSorted;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicatesUnsorted;
import com.gallopdevs.interviewtests.simpleprogrammer.linkedlists.RemoveDuplicatesUnsorted2;
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
    public void FindLength() {
        System.out.println("=========Test1 FindLength=========");
        int length = FindLength.findLength(node);
        prettyPrint(node);
        System.out.println("findLength: " + length);
        System.out.println("\n=========Test2 FindLength=========");
        prettyPrint(node);
        int length2 = FindLength2.findLength(node);
        System.out.println("findLength: " + length2);
        System.out.println("\n=========Test3 FindLength Recursively=========");
        prettyPrint(node);
        int length3 = FindLength.findLengthRecursive(node);
        System.out.println("findLength: " + length3);
        System.out.println("\n=========Test4 FindLength Recursively=========");
        prettyPrint(node);
        int length4 = FindLength2.findLengthRecursive(node);
        System.out.println("findLength: " + length4);
        System.out.println("\n=========FindLength Middle=========");
        prettyPrint(l2);
        int middle = FindMiddle.findMiddle(l2);
        System.out.println("findMiddle: " + middle);
    }

    @Test
    public void IsCyclic() {
        System.out.println("=========Test1 IsCyclic=========");
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(node));
        System.out.println("List is cyclic: " + IsCyclic.isCyclic(cyclicList));
        System.out.println("\n=========Test2 IsCyclic=========");
        System.out.println("List is cyclic: " + IsCyclic2.isCyclic(node));
        System.out.println("List is cyclic: " + IsCyclic2.isCyclic(cyclicList));
        System.out.println("\n=========Test3 IsCyclicHash=========");
        System.out.println("List is cyclic: " + IsCyclic.isCylicHash(node));
        System.out.println("List is cyclic: " + IsCyclic.isCylicHash(cyclicList));
    }

    @Test
    public void RemoveDuplicatesUnsorted() {
        System.out.println("=========Test1 RemoveDuplicates=========");
        prettyPrint(node);
        RemoveDuplicatesUnsorted.removeDuplicates(node);
        prettyPrint(node);
        System.out.println("\n=========Test2 RemoveDuplicates=========");
        prettyPrint(node2);
        RemoveDuplicatesUnsorted2.removeDuplicates(node2);
        prettyPrint(node2);
        System.out.println("\n=========Test3 RemoveDuplicatesLoops=========");
        prettyPrint(node3);
        RemoveDuplicatesUnsorted.removeDuplicatesLoops(node3);
        prettyPrint(node3);
    }

    @Test
    public void RemoveDuplicatesSortedIterative() {
        System.out.println("=========Test1 RemoveDuplicatesSorted=========");
        prettyPrint(nodeSorted);
        RemoveDuplicatesSorted.removeDuplicatesSorted(nodeSorted);
        prettyPrint(nodeSorted);
    }

    @Test
    public void RemoveDuplicatesSortedRecursive() {
        System.out.println("=========Test1 RemoveDuplicatesSorted=========");
        prettyPrint(nodeSorted);
        RemoveDuplicatesSorted.removeDuplicatesRecursive(nodeSorted);
        prettyPrint(nodeSorted);
    }

    @Test
    public void DeleteMiddle() {
        System.out.println("=========Test1 DeleteMiddle=========");
        System.out.println("findLength before: " + FindLength.findLength(node));
        prettyPrint(node);
        DeleteMiddle.deleteMiddle(node);
        System.out.println("findLength after: " + FindLength.findLength(node));
        prettyPrint(node);
        System.out.println("\n=========Test2 DeleteMiddle=========");
        System.out.println("findLength before: " + FindLength.findLength(node2));
        prettyPrint(node2);
//        DeleteMiddleNode2.deleteMiddleNode(node2.next);
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
        System.out.println("\n=========Test3 ReverseList Recursively=========");
        prettyPrint(node3);
        prettyPrint(ReverseList2.reverseListRecursive(node3));
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
        System.out.println(IsPalindromeCloneAndReverse.isPalindrome(node));
        prettyPrint(nodePalindrome);
        System.out.println(IsPalindromeCloneAndReverse.isPalindrome(nodePalindrome));
        System.out.println("\n=========Test2 IsPalindrome=========");
        prettyPrint(node2);
        System.out.println(IsPalindromeCloneAndReverse2.isPalindrome(node2));
        prettyPrint(nodePalindrome2);
        System.out.println(IsPalindromeCloneAndReverse2.isPalindrome(nodePalindrome2));
        System.out.println("\n=========Test3 IsPalindromeStack=========");
        prettyPrint(node2);
        System.out.println(IsPalindromeStack.isPalindromeStack(node2));
        prettyPrint(nodePalindrome2);
        System.out.println(IsPalindromeStack.isPalindromeStack(nodePalindrome2));
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

    // 1. Find middle element of a singly linked list in one pass
    // 2. Reverse linked list w/ recursion
    // 3. Merge two sorted linked lists so they keep the order
    public static LinkedListNode mergeLists(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode head = l1;
        while (l1.next != null) {
            l1 = l1.next;
        }
        l1.next = l2;
        return head;
    }

    @Test
    public void MergeLists() {
        LinkedListNode l1 = new LinkedListNode(2);
        l1.next = new LinkedListNode(3);
        l1.next.next = new LinkedListNode(4);
        LinkedListNode l2 = new LinkedListNode(5);
        l2.next = new LinkedListNode(6);
        l2.next.next = new LinkedListNode(7);
        prettyPrint(mergeLists(l1, l2));
    }

    // 4. Find duplicates in a linked list
    // 5. Add two linked lists using Stack

    // Detect and remove loop from linked list
    // https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/

    // Reverse LinkedList in pairs
    // https://java2blog.com/java-program-to-reverse-linked-list-in/

    // Remove duplicates from a sorted list
    // https://java2blog.com/java-program-to-reverse-linked-list-in/

    // Print Kth Node (variations)
    // https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
}
