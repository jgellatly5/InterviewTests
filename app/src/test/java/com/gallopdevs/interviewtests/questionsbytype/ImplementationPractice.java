package com.gallopdevs.interviewtests.questionsbytype;

public class ImplementationPractice {

    public class HashTable {

        private int initialCapacity = 16;
        private HashEntry[] data;

        private class HashEntry {
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

        // getIndex
        private int getIndex(String key) {
            int index = key.hashCode();
            return (index & 0x7fffffff) % initialCapacity;
        }

        // get
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

        // put
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
    }
}
