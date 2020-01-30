package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.datastructures.DynamicArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaPractice {

    @Test
    public void CreateListTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("beer");
        arrayList.add("cheese");
        arrayList.add("crackers");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println();

        arrayList.remove(1);
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    @Test
    public void SortListTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(7);
        arrayList.add(134);
        arrayList.add(22);
        arrayList.add(4);
        Collections.sort(arrayList);
        for (Integer n : arrayList) {
            System.out.println(n);
        }
        System.out.println();
        Collections.sort(arrayList, Collections.reverseOrder());
        for (Integer n : arrayList) {
            System.out.println(n);
        }
    }

    @Test
    public void CreateMapTest() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("beans", 5);
        hashMap.put("rice", 3);
        hashMap.put("bananas", 4);
        hashMap.put("burritos", 2);

        Iterator hashMapIterator = hashMap.entrySet().iterator();
        while (hashMapIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hashMapIterator.next();
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
        }
        System.out.println();
        for (Map.Entry mapElement : hashMap.entrySet()) {
            String key = (String) mapElement.getKey();
            Integer value = (Integer) mapElement.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();
        hashMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    @Test
    public void ArrayTest() {
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i;
        }
        System.out.println(Arrays.toString(arrayInt));

        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (i < 10) {
           arrayList.add(i);
           i++;
        }
        System.out.println(Arrays.toString(arrayList.toArray()));

        arrayList.forEach((n) -> System.out.print(n * n + " "));
        System.out.println();
        arrayList.remove(7);
        arrayList.forEach((n) -> System.out.print(n + " "));

        DynamicArray<Integer> dynamicArray = new DynamicArray<>(5);
        dynamicArray.add(2);
        dynamicArray.add(4);
        dynamicArray.add(6);
        dynamicArray.add(8);
        dynamicArray.add(10);
    }
}
