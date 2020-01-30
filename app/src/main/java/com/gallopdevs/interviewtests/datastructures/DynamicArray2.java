package com.gallopdevs.interviewtests.datastructures;

public class DynamicArray2<String> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray2(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    // get
    public String get(int index) {
        return (String) data[index];
    }

    // set
    public void set(int index, String value) {
        data[index] = value;
        size++;
    }

    // insert
    public void insert(int index, String value) {
        if (size == initialCapacity) resize();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    // delete
    public void delete(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // add
    public void add(String value) {
        if (size == initialCapacity) resize();
        data[size] = value;
        size++;
    }

    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // size

    public int size() {
        return size;
    }

    // contains
    public boolean contains(String value) {
        for (int i = 0; i < size - 1; i++) {
            String current = (String) data[i];
            if (current.equals(value)) {
                return true;
            }
        }
        return false;
    }

    // resize
    private void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }
}
