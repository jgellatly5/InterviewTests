package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.AppendList;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.DeleteMiddle;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.FindDuplicates;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.FindIntersection;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.FindLength;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.FindMiddle;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.IsCyclic;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.IsPalindromeCloneAndReverse;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.IsPalindromeStack;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.Partition;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.RemoveDuplicatesSorted;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.RemoveDuplicatesUnsorted;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations.PrintKthToLast;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.ReverseList;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.ReversePairs;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.ReversePrintList;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.SortedMerge;
import com.gallopdevs.interviewtests.questionsbytype.linkedlists.SumLists;

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
        System.out.println("\n=========FindLength Middle=========");
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

    @Test
    public void RemoveDuplicatesSortedIterative() {
        System.out.println("=========Test1 RemoveDuplicatesSorted=========");
        LinkedListNode.print(nodeSorted);
        RemoveDuplicatesSorted.removeDuplicatesSorted(nodeSorted);
        LinkedListNode.print(nodeSorted);
    }

    @Test
    public void RemoveDuplicatesSortedRecursive() {
        System.out.println("=========Test1 RemoveDuplicatesSorted=========");
        LinkedListNode.print(nodeSorted);
        RemoveDuplicatesSorted.removeDuplicatesRecursive(nodeSorted);
        LinkedListNode.print(nodeSorted);
    }

    @Test
    public void DeleteMiddle() {
        System.out.println("=========Test1 DeleteMiddle=========");
        System.out.println("findLength before: " + FindLength.findLength(node));
        LinkedListNode.print(node);
        DeleteMiddle.deleteMiddle(node);
        System.out.println("findLength after: " + FindLength.findLength(node));
        LinkedListNode.print(node);
        System.out.println("\n=========Test2 DeleteMiddle=========");
        System.out.println("findLength before: " + FindLength.findLength(node2));
        LinkedListNode.print(node2);
//        DeleteMiddleNode2.deleteMiddleNode(node2.next);
        System.out.println("findLength after: " + FindLength.findLength(node2));
        LinkedListNode.print(node2);
    }

    @Test
    public void ReverseList() {
        System.out.println("=========ReverseList Iteratively=========");
        LinkedListNode.print(node);
        LinkedListNode.print(ReverseList.reverseListIterative(node));
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
    public void Partition() {
        System.out.println("=========Test1 Partition=========");
        LinkedListNode.print(node);
        LinkedListNode.print(Partition.partition(node, 3));
    }

    @Test
    public void SumLists() {
        System.out.println("\n=========SumLists Stack=========");
        LinkedListNode.print(l1);
        LinkedListNode.print(l2);
        LinkedListNode.print(SumLists.sumListsStack(l1, l2));
        System.out.println("=========SumLists Iterative=========");
        LinkedListNode.print(l1);
        LinkedListNode.print(l2);
        LinkedListNode.print(SumLists.sumListsIterative(l1, l2));
        System.out.println("\n=========SumLists Recursive=========");
        LinkedListNode.print(l1);
        LinkedListNode.print(l2);
        LinkedListNode.print(SumLists.sumListsRecursively(l1, l2, 0));
    }

    @Test
    public void IsPalindrome() {
        System.out.println("=========IsPalindromeUsingReverse=========");
        LinkedListNode.print(node);
        System.out.println(IsPalindromeCloneAndReverse.isPalindrome(node));
        LinkedListNode.print(nodePalindrome);
        System.out.println(IsPalindromeCloneAndReverse.isPalindrome(nodePalindrome));
    }

    @Test
    public void IsPalindromeUsingStack() {
        System.out.println("\n=========IsPalindromeUsingStack=========");
        LinkedListNode.print(node2);
        System.out.println(IsPalindromeStack.isPalindromeStack(node2));
        LinkedListNode.print(nodePalindrome2);
        System.out.println(IsPalindromeStack.isPalindromeStack(nodePalindrome2));
    }

    @Test
    public void FindIntersection() {
        System.out.println("=========Test1 FindIntersection=========");
        LinkedListNode.print(nodeIntersection);
        LinkedListNode.print(nodeIntersection2);
        LinkedListNode pointOfIntersection = FindIntersection.findIntersection(nodeIntersection, nodeIntersection2);
        System.out.println(pointOfIntersection.data);
    }

    @Test
    public void MergeLists() {
        System.out.println("=========SortedMerge Iterative=========");
        LinkedListNode l1 = new LinkedListNode(12);
        l1.next = new LinkedListNode(14);
        l1.next.next = new LinkedListNode(16);
        LinkedListNode l2 = new LinkedListNode(13);
        l2.next = new LinkedListNode(15);
        l2.next.next = new LinkedListNode(17);
        LinkedListNode.print(SortedMerge.sortedMergeIterative(l1, l2));
        System.out.println("\n=========SortedMerge Recursive=========");
        LinkedListNode l3 = new LinkedListNode(2);
        l3.next = new LinkedListNode(4);
        l3.next.next = new LinkedListNode(6);
        LinkedListNode l4 = new LinkedListNode(3);
        l4.next = new LinkedListNode(5);
        l4.next.next = new LinkedListNode(7);
        LinkedListNode.print(SortedMerge.sortedMergeRecursive(l3, l4));
    }

    @Test
    public void AppendList() {
        System.out.println("=========AppendList=========");
        LinkedListNode l1 = new LinkedListNode(2);
        l1.next = new LinkedListNode(4);
        l1.next.next = new LinkedListNode(6);
        LinkedListNode l2 = new LinkedListNode(3);
        l2.next = new LinkedListNode(5);
        l2.next.next = new LinkedListNode(7);
        LinkedListNode.print(AppendList.appendList(l1, l2));
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
    public void ReversePairs() {
        System.out.println("=========Reverse Pairs Iteratively=========");
        LinkedListNode.print(node2);
        LinkedListNode.print(ReversePairs.reversePairs(node2));
        System.out.println("\n=========Reverse Pairs Recursively=========");
        LinkedListNode.print(node2);
        LinkedListNode.print(ReversePairs.reversePairsRecursive(node2));
    }

    @Test
    public void ReversePrintList() {
        System.out.println("=========ReversePrintList=========");
        LinkedListNode.print(node);
        ReversePrintList.reversePrintList(node);
    }

    @Test
    public void Practice() {
        System.out.println("\n=========SumLists Recursive=========");
        // 6->7->8
        LinkedListNode.print(l1);
        // 4->3->2
        LinkedListNode.print(l2);
        LinkedListNode.print(sumLists(l1, l2, 0));
    }

    private LinkedListNode sumLists(LinkedListNode l1, LinkedListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return null;
        LinkedListNode result = new LinkedListNode();
        int value = carry;
        if (l1 != null) value += l1.data;
        if (l2 != null) value += l2.data;
        result.data = value % 10;
        result.next = sumLists(
                l1 != null ? l1.next : null,
                l2 != null ? l2.next : null,
                value >= 10 ? 1 : 0
        );
        return result;
    }
}
