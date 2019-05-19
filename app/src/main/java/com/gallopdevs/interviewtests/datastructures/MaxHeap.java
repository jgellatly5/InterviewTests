package com.gallopdevs.interviewtests.datastructures;

import java.util.Arrays;

public class MaxHeap {
    private int capacity = 10;
    private int size = 0;

    private int[] items = new int[capacity];

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

    public int extractMax() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void insert(int item) {
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parentValue(index) < items[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    private void ensureCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = leftChildIndex(index);
            if (hasRightChild(index) && rightChildValue(index) > leftChildValue(index)) {
                smallerChildIndex = rightChildIndex(index);
            }

            if (items[index] > items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }
}
