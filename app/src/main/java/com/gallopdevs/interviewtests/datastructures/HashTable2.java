package com.gallopdevs.interviewtests.datastructures;

public class HashTable2 {
    private int INITIAL_CAPACITY = 16;
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

    public HashTable2() {
        data = new HashEntry[INITIAL_CAPACITY];
    }


}
