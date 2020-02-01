package com.gallopdevs.interviewtests.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class ArrayOperations {

    @Test
    public void ArrayOperationsTest() {

        // 1. Declare an array
        String[] stringArray = {"a", "b", "c", "d", "e"};
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        // 2. Print array
        System.out.println(Arrays.toString(numbers));

        // 3. Create ArrayList from an array
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println(arrayList);

        // 4. Check if an array contains a certain value
        System.out.println(Arrays.asList(stringArray).contains("a"));

        // 5. Concatenate two arrays


        // 6. Convert an ArrayList to an array
        String[] newArray = new String[arrayList.size()];
        arrayList.toArray(newArray);
        for (String s : newArray) {
            System.out.print(s + ", ");
        }

        // 7. Convert an array to a Set
        String[] duplicateStrings = {"x", "x", "y", "y", "z", "z", "z"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(duplicateStrings));
        System.out.println(hashSet);

        // 8. Get the first & last element
        int[] example8 = new int[] {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(example8));
        int firstItem = example8[0];
        int lastItem = example8[example8.length - 1];
        System.out.println("firstItem: " + firstItem + ", lastItem: " + lastItem);

        // 9. Get random element
        int[] example9 = new int[] {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(example9));
        int random = example9[new Random().nextInt(example9.length)];
        System.out.println("Random: " + random);

        // 10. Append a new item to an array
        int newItem = 60;
        int[] example10Copy = new int[] {10, 20, 30, 40, 50};
        int[] example10 = Arrays.copyOf(example10Copy, example10Copy.length + 1);
        System.out.println(Arrays.toString(example10));
        example10[example10.length - 1] = newItem;
        System.out.println(Arrays.toString(example10));

        // 11. Compare two arrays
        System.out.println(Arrays.equals(example9, example10Copy));
        System.out.println(Arrays.equals(example10, example10Copy));

        // 12. Check if an array is empty
        int[] emptyArray = {};
        boolean isEmpty = emptyArray == null || emptyArray.length == 0;
        System.out.println(isEmpty);

        // 13. Filter values in an array
        int[] example13 = new int[] {1, 2, 3, 4, 5};
        int[] evenArray = Arrays.stream(example13)
                                .filter(value -> value % 2 == 0)
                                .toArray();
        System.out.println(Arrays.toString(evenArray));

        // 14. Find the sum & the average
        int[] example14 = new int[] {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : example14) {
            sum += num;
        }
        double average = sum / example14.length;
        System.out.println("Sum: " + sum + ", average: " + average);

        // 15. Sort an array of strings & numbers
        String[] example15Strings = {"x", "h", "k", "i", "p", "a"};
        int[] example15Integers = {9, 17, 38, 65, 454, 12, 33};
        Arrays.sort(example15Strings);
        Arrays.sort(example15Integers);
        System.out.println(Arrays.toString(example15Strings));
        System.out.println(Arrays.toString(example15Integers));

        // 16. Find the index of an element
        int[] example16 = new int[] {8, 28, 1, 56, 909};
        int target = 56;
        int index = 0;
        for (int i = 0; i < example16.length; i++) {
            if (example16[i] == target) {
                index = i;
            }
        }
        System.out.println("Target: " + target + ", index: " + index);

        // 17. Remove a specific element
        int[] example17 = new int[] {8, 28, 1, 56, 909};
        int index17 = 1;
        int[] smallArray = new int[example17.length - 1];
        for (int i = 0, k = 0; i < example17.length; i++) {
            if (i == index17) continue;
            smallArray[k++] = example17[i];
        }
        System.out.println(Arrays.toString(example17));
        System.out.println(Arrays.toString(smallArray));

        // 18. Insert at a specific index
        int[] example18 = new int[] {8, 28, 1, 56, 909};
        int[] insertAtIndex = insert(example18, 1, 202);
        System.out.println(Arrays.toString(example18));
        System.out.println(Arrays.toString(insertAtIndex));

        // 19. Find common elements between two arrays


        // 20. Find 2nd largest element
        // 21. Find 2nd smallest element
        // 22. Add two matrices of the same size
        // 23. Move all 0's to the end of an array
        // 24. Find the number of even & odd integers
    }

    private int[] insert(int[] numbers, int index, int value) {
        int[] result = new int[numbers.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = numbers[i];
        }
        result[index] = value;
        for (int i = index + 1; i < numbers.length; i++) {
            result[i] = numbers[i - 1];
        }
        return result;
    }
}
