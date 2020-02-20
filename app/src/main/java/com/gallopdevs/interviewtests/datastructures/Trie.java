package com.gallopdevs.interviewtests.datastructures;

import java.util.HashMap;

public class Trie {

    private static class TrieNode {
        public char character;
        boolean isWholeWord;
        HashMap<Character, TrieNode> children = new HashMap<>();

        TrieNode() {
        }

        TrieNode(char character) {
            this.character = character;
        }
    }

    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;
        TrieNode node = null;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (children.containsKey(character)) {
                node = children.get(character);
            } else {
                node = new TrieNode(character);
                children.put(character, node);
            }
            children = node.children;
            if (i == word.length() - 1) {
                node.isWholeWord = true;
            }
        }
    }

    public boolean startsWith(String prefix) {
        return containsNode(prefix) != null;
    }

    public boolean contains(String word) {
        TrieNode node = containsNode(word);
        return node != null && node.isWholeWord;
    }

    private TrieNode containsNode(String prefix) {
        HashMap<Character, TrieNode> children = root.children;
        TrieNode node = null;
        for (int i = 0; i < prefix.length(); i++) {
            char character = prefix.charAt(i);
            if (children.containsKey(character)) {
                node = children.get(character);
                children = node.children;
            } else {
                return null;
            }
        }
        return node;
    }
}
