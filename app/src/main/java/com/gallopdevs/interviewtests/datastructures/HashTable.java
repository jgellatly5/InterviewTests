package com.gallopdevs.interviewtests.datastructures;

public class HashTable {
    private static class HashEntry {
        private String key;
        private String value;
        private HashEntry next;

        HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int INITIAL_CAPACITY = 16;
    private HashEntry[] data;

    public HashTable() {
        data = new HashEntry[INITIAL_CAPACITY];
    }

    private int getIndex(String key) {
        int hashCode = key.hashCode();
        return (hashCode & 0x7fffffff) % INITIAL_CAPACITY;
    }

    // Time: O(n)
    public String get(String key) {
        int index = getIndex(key);
        HashEntry entries = data[index];
        if (entries == null) return null;
        while (!entries.key.equals(key) && entries.next != null) {
            entries = entries.next;
        }
        return entries.value;
    }

    // Time: O(n)
    public void put(String key, String value) {
        int index = getIndex(key);
        HashEntry newEntry = new HashEntry(key, value);
        if (data[index] == null) {
            data[index] = newEntry;
        } else {
            HashEntry entries = data[index];
            while (entries.next != null) {
                entries = entries.next;
            }
            entries.next = newEntry;
        }
    }

    // Time: O(n)
    public void delete(String key) {
        int index = getIndex(key);
        HashEntry entries = data[index];
        if (entries == null) return;
        if (entries.key.equals(key)) {
            data[index] = entries.next;
        } else {
            while (entries.next != null) {
                if (entries.next.key.equals(key)) {
                    entries.next = entries.next.next;
                    return;
                }
                entries = entries.next;
            }
        }
    }
}
