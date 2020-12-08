package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class ArrayOperations {

    @Test
    public void DeclareArray() {
        // 1. Declare an array
        String[] stringArray = {"a", "b", "c", "d", "e"};
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] anotherArray = new int[5];
    }

    @Test
    public void PrintArray() {
        // 2. Print array
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void ConvertArrayToList() {
        // 3. Create ArrayList from an array
        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println(arrayList);
    }

    @Test
    public void Contains() {
        // 5. Check if an array contains a certain value
        String[] stringArray = {"a", "b", "c", "d", "e"};
        System.out.println(Arrays.asList(stringArray).contains("a"));
    }

    @Test
    public void ConvertListToArray() {
        // 6. Convert an ArrayList to an array
        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        String[] newArray = new String[arrayList.size()];
        arrayList.toArray(newArray);
        for (String s : newArray) {
            System.out.print(s + ", ");
        }
    }

    @Test
    public void ConvertArrayToSet() {
        // 7. Convert an array to a Set
        String[] duplicateStrings = {"x", "x", "y", "y", "z", "z", "z"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(duplicateStrings));
        System.out.println(hashSet);
    }

    @Test
    public void GetFirstAndLastElement() {
        // 8. Get the first & last element
        int[] example8 = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(example8));
        int firstItem = example8[0];
        int lastItem = example8[example8.length - 1];
        System.out.println("firstItem: " + firstItem + ", lastItem: " + lastItem);
    }

    @Test
    public void GetRandomElement() {
        // 9. Get random element
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers));
        int random = numbers[new Random().nextInt(numbers.length)];
        System.out.println("Random: " + random);
    }

    @Test
    public void AppendElementArray() {
        // 10. Append a new item to an array
        int newItem = 60;
        int[] example10Copy = new int[]{10, 20, 30, 40, 50};
        int[] example10 = Arrays.copyOf(example10Copy, example10Copy.length + 1);
        System.out.println(Arrays.toString(example10));
        example10[example10.length - 1] = newItem;
        System.out.println(Arrays.toString(example10));
    }

    @Test
    public void ArrayEquals() {
        // 11. Are arrays equal?
        int[] case1 = new int[]{10, 20, 30, 40, 50};
        int[] case2 = new int[]{10, 20, 30, 40, 50};
        int[] case3 = new int[]{11, 20, 30, 40, 50};
        System.out.println(Arrays.equals(case1, case2));
        System.out.println(Arrays.equals(case1, case3));
    }

    @Test
    public void IsEmpty() {
        // 12. Check if an array is empty
        int[] emptyArray = {};
        boolean isEmpty = emptyArray.length == 0;
        System.out.println(isEmpty);
    }

    @Test
    public void FilterValues() {
        // 13. Filter values in an array
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] evenArray = Arrays.stream(numbers)
                .filter(value -> value % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(evenArray));
    }

    @Test
    public void Sum() {
        // 14. Find the sum
        int[] example14 = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : example14) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    @Test
    public void Average() {
        // 15. Find the average
        int[] example14 = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : example14) {
            sum += num;
        }
        double average = sum / example14.length;
        System.out.println("Average: " + average);
    }

    @Test
    public void Sort() {
        // 15. Sort an array of strings & numbers
        String[] example15Strings = {"x", "h", "k", "i", "p", "a"};
        int[] example15Integers = {9, 17, 38, 65, 454, 12, 33};
        Arrays.sort(example15Strings);
        Arrays.sort(example15Integers);
        System.out.println(Arrays.toString(example15Strings));
        System.out.println(Arrays.toString(example15Integers));
    }

    @Test
    public void FindIndex() {
        // 16. Find the index of an element
        int[] example16 = new int[]{8, 28, 1, 56, 909};
        int target = 56;
        int index = 0;
        for (int i = 0; i < example16.length; i++) {
            if (example16[i] == target) {
                index = i;
            }
        }
        System.out.println("Target: " + target + ", index: " + index);
    }

    @Test
    public void RemoveElementArray() {
        // 17. Remove a specific element (just using arrays)
        int[] example17 = new int[]{8, 28, 1, 56, 909};
        int index17 = 1;
        int[] smallArray = new int[example17.length - 1];
        for (int i = 0, k = 0; i < example17.length; i++) {
            if (i == index17) continue;
            smallArray[k++] = example17[i];
        }
        System.out.println(Arrays.toString(example17));
        System.out.println(Arrays.toString(smallArray));
    }

    @Test
    public void InsertAtIndex() {
        // 18. Insert at a specific index
        int[] example18 = new int[]{8, 28, 1, 56, 909};
        int[] insertAtIndex = InsertAtIndex.insert(example18, 1, 202);
        System.out.println(Arrays.toString(example18));
        System.out.println(Arrays.toString(insertAtIndex));
    }

    @Test
    public void PrintCommonElements() {
        // 19. Find common elements between two arrays
        System.out.println("19.====================");
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {3, 4, 5, 6, 7};
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                }
            }
        }
        System.out.println();
    }

    @Test
    public void AddTwoMatrices() {
        // 22. Add two matrices of the same size
        System.out.println("22.====================");
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        int[][] sumMatrix = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        PrintMatrix.printMatrix(sumMatrix);
    }
}
