package com.gallopdevs.interviewtests.datastructures;

import java.util.Arrays;

public class MaxHeap {
    private int initialCapacity = 10;
    private int size;
    private int[] items = new int[initialCapacity];

    private int leftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }
    private int rightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }
    private int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }
    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }
    private boolean hasParent(int index) {
        return parentIndex(index) >= 0;
    }

    private int leftChildValue(int index) {
        return items[leftChildIndex(index)];
    }
    private int rightChildValue(int index) {
        return items[rightChildIndex(index)];
    }
    private int parentValue(int index) {
        return items[parentIndex(index)];
    }

    public void insert(int item) {
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void ensureCapacity() {
        if (size == initialCapacity) {
            items = Arrays.copyOf(items, initialCapacity * 2);
            initialCapacity *= 2;
        }
    }

    private void heapifyUp() {
        int currentIndex = size - 1;
        while (hasParent(currentIndex) && parentValue(currentIndex) < items[currentIndex]) {
            swap(parentIndex(currentIndex), currentIndex);
            currentIndex = parentIndex(currentIndex);
        }
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    public int extractMax() {
        if (size == 0) throw new IllegalStateException();
        int max = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return max;
    }

    private void heapifyDown() {
        int currentIndex = 0;
        while (hasLeftChild(currentIndex)) {
            int indexChildLargestValue = leftChildIndex(currentIndex);
            if (hasRightChild(currentIndex) && rightChildValue(currentIndex) > leftChildValue(currentIndex)) {
                indexChildLargestValue = rightChildIndex(currentIndex);
            }
            if (items[currentIndex] > items[indexChildLargestValue]) {
                break;
            } else {
                swap(currentIndex, indexChildLargestValue);
            }
            currentIndex = indexChildLargestValue;
        }
    }
}
