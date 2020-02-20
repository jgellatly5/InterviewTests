package com.gallopdevs.interviewtests.datastructures;

public class HashTable {

    private int initialCapacity = 16;
    private HashEntry[] data;

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

    public HashTable() {
        data = new HashEntry[initialCapacity];
    }

    private int getIndex(String key) {
        int hashCode = key.hashCode();
        return (hashCode & 0x7fffffff) % initialCapacity;
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

    public void delete(String key) {
        int index = getIndex(key);
        HashEntry entries = data[index];
        if (entries == null) return;
        if (entries.key.equals(key)) {
            data[index] = entries.next;
            return;
        }
        while (entries.next != null) {
            if (entries.next.key.equals(key)) {
                entries.next = entries.next.next;
                return;
            }
            entries = entries.next;
        }
    }
}
