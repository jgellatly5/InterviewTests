package com.gallopdevs.interviewtests.datastructures;

public class DynamicArray<String> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    // Time: O(1)
    public String get(int index) {
        return (String) data[index];
    }

    // Time: O(1)
    public void set(int index, String value) {
        data[index] = value;
    }

    // Time: O(n)
    public void insert(int index, String value) {
        if (size == initialCapacity) resize();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    // Time: O(n)
    public void delete(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // Time: O(1)
    public void add(String value) {
        if (size == initialCapacity) resize();
        data[size] = value;
        size++;
    }

    // Time: O(1)
    public boolean isEmpty() {
        return size == 0;
    }

    // Time: O(1)
    public int size() {
        return size;
    }

    // Time: O(n)
    public boolean contains(String value) {
        for (int i = 0; i < size - 1; i++) {
            String current = (String) data[i];
            if (current.equals(value)) {
                return true;
            }
        }
        return false;
    }

    // Time: O(n)
    // Space: O(n)
    private void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }
}