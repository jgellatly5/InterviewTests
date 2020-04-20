package com.gallopdevs.interviewtests.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class AlgorithmsTest {

    @Test
    public void BubbleSort() {
        BubbleSort.bubbleSort(new int[]{6, 8, 4, 9, 0, 12, 2});
        BubbleSort.bubbleSort(new int[]{12, 9, 8, 6, 4, 2, 0});
    }

    @Test
    public void InsertionSort() {
        InsertionSort.insertionSort(new int[]{6, 8, 4, 9, 0, 12, 2});
    }

    @Test
    public void SelectionSort() {
        SelectionSort.selectionSort(new int[]{6, 8, 4, 9, 0, 12, 2});
    }

    @Test
    public void MergeSort() {
        int[] array = {6, 8, 4, 9, 1, 12, 2};
        MergeSort.mergeSort(array);
    }

    @Test
    public void QuickSort() {
        int[] array = {15, 3, 2, 1, 9, 5, 7, 8, 6};
        QuickSort.quickSort(array);
    }

    @Test
    public void RadixSort() {
        int[] array = {256, 490, 3, 52, 184, 79, 373};
        RadixSort.radixSort(array);
    }

    @Test
    public void BinarySearch() {
        System.out.println("=========BinarySearch=========");
        int[] array = {3, 52, 79, 184, 256, 373, 490};
        System.out.println(BinarySearch.binarySearchIterative(array, 52));
        System.out.println(BinarySearch.binarySearchRecursive(array, 52, 0, array.length - 1));
    }

    @Test
    public void CheckPrimality() {
        Assert.assertTrue(CheckPrimality.checkPrimality(3));
        Assert.assertTrue(CheckPrimality.checkPrimality(17));
        Assert.assertFalse(CheckPrimality.checkPrimality(4));
        Assert.assertFalse(CheckPrimality.checkPrimality(200));
    }

    @Test
    public void SieveOfErathosthenes() {
        SieveOfEratosthenes.print(100);
    }
}
