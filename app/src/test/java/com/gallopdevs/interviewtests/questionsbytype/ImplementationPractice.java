package com.gallopdevs.interviewtests.questionsbytype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.StreamSupport;

public class ImplementationPractice {

    @Test
    public void Leet() {
//        System.out.println(restoreString("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println(2 / 10);
    }

    private static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        char[] characters = s.toCharArray();
        int k = 0;
        for (int i : indices) {
            System.out.println("index: " + i + ", char: " + characters[i]);
            result[i] = characters[k++];
        }
        return new String(result);
    }

    // 4 5 6 7 0 2 1 3
    // c o d e l e e t

    // l _ _ _ c o d e

    @Test
    public void ArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
//        arrayList.add(0, 7);
//        arrayList.remove(new Integer(10));
        arrayList.add(1, 20);
        arrayList.add(1, 30);
//        System.out.println(arrayList.indexOf(10));

        System.out.println("size: " + arrayList.size());
        for (int i : arrayList) {
            System.out.println("for loop: " + i);
        }

        System.out.println("size: " + arrayList.size());
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }
    }

    @Test
    public void LinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("size: " + linkedList.size());
        for (int i : linkedList) {
            System.out.println("for loop: " + i);
        }

        System.out.println("size: " + linkedList.size());
        Iterator<Integer> iterator = linkedList.iterator();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }

        while (listIterator.hasNext()) {
            System.out.println("list iterator forwards: " + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println("list iterator backwards: " + listIterator.previous());
        }
    }
}
