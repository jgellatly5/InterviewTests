package com.gallopdevs.interviewtests.datastructures;

public class HashTable {

    private int INITIAL_CAPACITY = 16;
    private HashEntry[] data;

    private static class HashEntry {
        private String key;
        private String value;
        private HashEntry next;

        public HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public HashTable() {
        data = new HashEntry[INITIAL_CAPACITY];
    }

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

    public String get(String key) {
        int index = getIndex(key);
        HashEntry entries = data[index];

        if (entries != null) {
            while (!entries.key.equals(key) && entries.next != null) {
                entries = entries.next;
            }
            return entries.value;
        }
        return null;
    }

    private int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = (hashCode & 0x7fffffff) % INITIAL_CAPACITY;
        return index;
    }
}