package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ArrayOperations {
    @Test
    public void AddTwoMatrices() {
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

    @Test
    public void AppendElementArray() {
        // 17. Append an element to an array
        int newElement = 60;
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers));
        numbers = Arrays.copyOf(numbers, numbers.length + 1);
        System.out.println(Arrays.toString(numbers));
        numbers[numbers.length - 1] = newElement;
        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void ArrayEquals() {
        // 8. Are arrays equal?
        int[] case1 = new int[]{10, 20, 30, 40, 50};
        int[] case2 = new int[]{10, 20, 30, 40, 50};
        int[] case3 = new int[]{11, 20, 30, 40, 50};
        System.out.println(Arrays.equals(case1, case2));
        System.out.println(Arrays.equals(case1, case3));
    }

    @Test
    public void Average() {
        // 13. Find the average
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }

    @Test
    public void ConcatenateTwoArrays() {
        // 21. Concatenate two arrays
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ConcatenateTwoArrays.concatenateTwoArrays(a, b)));
    }

    @Test
    public void ContainsElement() {
        // 9. Check if an array contains a certain value
        System.out.println(Arrays.asList(new String[] {"a", "b", "c", "d", "e"}).contains("a"));
        System.out.println(Arrays.asList(new String[] {"a", "b", "c", "d", "e"}).contains("z"));
    }

    @Test
    public void ConvertArrayToList() {
        // 3. Convert an array to a list
        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println(arrayList);
    }

    @Test
    public void ConvertArrayToSet() {
        // 5. Convert an array to a set
        String[] duplicateStrings = {"x", "x", "y", "y", "z", "z", "z"};
        Set<String> hashSet = new HashSet<>(Arrays.asList(duplicateStrings));
        System.out.println(hashSet);
    }

    @Test
    public void ConvertListToArray() {
        // 4. Convert a list to an array
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        String[] newArray = new String[list.size()];
        list.toArray(newArray);
        for (String s : newArray) {
            System.out.print(s + " ");
        }
    }

    @Test
    public void DeclareArray() {
        // 1. Declare an array
        String[] stringArray = {"a", "b", "c", "d", "e"};
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] anotherArray = new int[5];
    }

    @Test
    public void EvenAndOddCount() {
        // 27. Count number of even and odd elements
        int[] numbers = {1, 2, 3, 4, 5};
        FindEvenAndOdd.findEvenAndOdd(numbers);
    }

    @Test
    public void FilterValues() {
        // 11. Filter values in an array
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] evenArray = Arrays.stream(numbers).filter(value -> value % 2 == 0).toArray();
        System.out.println(Arrays.toString(evenArray));
    }

    @Test
    public void FindIndex() {
        // 15. Find the index of an element
        int[] numbers = new int[]{8, 28, 1, 56, 909};
        int target = 56;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
            }
        }
        System.out.println("Target: " + target + ", index: " + index);
    }

    @Test
    public void FindLowHighIndex() {
        System.out.println("=========FindLowHighIndex=========");
        int[] test1 = {1, 2, 5, 5, 5, 5, 5, 7};
        int[] test2 = {1, 3, 4, 5, 5, 5, 5, 3};
        FindLowHighIndex.findLowHighIndex(test1, 5);
        FindLowHighIndex.findLowHighIndex(test2, 3);
    }

    @Test
    public void FindMissingNumbers() {
        // 30. Find missing number(s)
        System.out.println("=========Single Number=========");
        // Only one missing number in array
        int[] numbers = new int[]{1, 2, 3, 5, 6};
        int missing = GetMissingNumber.getMissingNumber(numbers, numbers.length + 1);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(numbers), missing);

        System.out.println("=========Multiple Numbers=========");
        // one missing number
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 6}, 6);
        // two missing numbers
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 6, 7, 9, 10}, 10);
        // three missing numbers
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
        // four missing numbers
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 9, 8}, 10);
    }

    @Test
    public void FirstNonRepeating() {
        int[] test1 = {1, 1, 1, 4, 4, 5};
        int[] test2 = {1, 1, 7, 3, 4, 5};
        int[] test3 = {1, 1, 1, 1, 1, 1};
        int[] test4 = {1, 4, 4};
        System.out.println(FirstNonRepeating.firstNonRepeating(test1));
        System.out.println(FirstNonRepeating.firstNonRepeating(test2));
        System.out.println(FirstNonRepeating.firstNonRepeating(test3));
        System.out.println(FirstNonRepeating.firstNonRepeating(test4));
        FirstNonRepeatingLinkedHashMap.firstNonRepeat(test1);
        FirstNonRepeatingLinkedHashMap.firstNonRepeat(test2);
        FirstNonRepeatingLinkedHashMap.firstNonRepeat(test3);
        FirstNonRepeatingLinkedHashMap.firstNonRepeat(test4);
    }

    @Test
    public void GetFirstAndLastElement() {
        // 6. Get the first & last element
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers));
        int firstItem = numbers[0];
        int lastItem = numbers[numbers.length - 1];
        System.out.println("firstItem: " + firstItem + ", lastItem: " + lastItem);
    }

    @Test
    public void GetRandomElement() {
        // 7. Get random element
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers));
        int random = numbers[new Random().nextInt(numbers.length)];
        System.out.println("Random: " + random);
    }

    @Test
    public void InsertAtIndex() {
        // 18. Insert at a specific index
        int[] numbers = new int[]{8, 28, 1, 56, 909};
        int[] result = InsertAtIndex.insert(numbers, 1, 202);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void IsEmpty() {
        // 10. Check if an array is empty
        int[] numbers = {};
        boolean isEmpty = numbers.length == 0;
        System.out.println(isEmpty);
    }

    @Test
    public void MergeSortedArray() {
        int[] a = {1, 3, 5, 0, 0, 0};
        int[] b = {2, 4, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        MergeSortedArray.mergeSortedArray(a, b, 3, 3);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void MinMaxArray() {
        // 24. Find min and max element
        int[] numbers = new int[]{10, 3, 5, 6, 7, 2};
        MinMaxArray.findMinAndMax(numbers);
    }

    @Test
    public void PrintArray() {
        // 2. Print array
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void PrintCommonElements() {
        // 19. Find common elements between two arrays
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
    public void PrintDuplicates() {
        // 28. Print duplicates
        System.out.println("=========PrintDuplicates Loop=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesLoop.findDuplicatesLoop(numbers);

        System.out.println("=========PrintDuplicates Set=========");
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesSet.findDuplicatesSet(numbers);

        System.out.println("=========PrintDuplicates Count=========");
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesCount.findDuplicatesCount(numbers);
    }

    @Test
    public void PrintPairsSum() {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int sum = 7;
        System.out.println("=========PrintPairsSum Loop=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumLoop.printPairs(numbers, sum);

        System.out.println("=========PrintPairsSum Set=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumSet.printPairsSet(numbers, sum);
    }

    @Test
    public void RearrangeNumbers() {
        int[] test1 = {-9, 5, 6, 7, -2, -3, -4, 10, 11, 12};
        int[] test2 = {5, 6, 7, -7, -9, -4, 12};
        System.out.println(Arrays.toString(RearrangeNumbers.rearrangeNumbers(test1)));
        System.out.println(Arrays.toString(RearrangeNumbers.rearrangeNumbers(test2)));
    }

    @Test
    public void RemoveDuplicates() {
        // 29. Remove duplicates
        int[][] tests = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},
                {1, 1, 2, 2, 3, 3, 4}
        };
        for (int[] test : tests) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(test));
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates.removeDuplicates(test)));
        }
    }

    @Test
    public void RemoveElementArray() {
        // 16. Remove a specific element (just using arrays)
        int[] numbers = new int[]{8, 28, 1, 56, 909};
        int index = 1;
        int[] result = new int[numbers.length - 1];
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (i == index) continue;
            result[k++] = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void ReverseArray() {

        int[] reverseArray = new int[]{4, 3, 5, 6, 7, 2};
        int[] reverseArray2 = new int[]{4, 3, 5, 6, 7, 2, 10};
        System.out.println(Arrays.toString(reverseArray));
        ReverseArray.reverseArray(reverseArray);
        System.out.println(Arrays.toString(reverseArray2));
        ReverseArray.reverseArray(reverseArray2);
    }

    @Test
    public void RotateLeft() {
        System.out.println("=========RotateLeft=========");
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {5, 11, 9, 5};
        int[] test3 = {7, 0, 0, 5};
        System.out.println(Arrays.toString(RotateLeft.rotateLeft(test1)));
        System.out.println(Arrays.toString(RotateLeft.rotateLeft(test2)));
        System.out.println(Arrays.toString(RotateLeft.rotateLeft(test3)));
    }

    @Test
    public void SecondLargest() {
        // 22. Find second largest element
        int[] numbers = {10, 20, 30, 40, 50};
        SecondLargest.findSecondLargest(numbers);
    }

    @Test
    public void SecondSmallest() {
        // 23. Find second smallest element
        int[] numbers = {10, 20, 30, 40, 50};
        SecondSmallest.findSecondSmallest(numbers);
    }

    @Test
    public void ShiftZerosRight() {
        // 25. Shift Zeros Right
        int[] numbers = {1, 0, 2, 0, 3, 0, 4, 5, 0};
        ShiftZerosRight.shiftZerosRight(numbers);
    }

    @Test
    public void ShiftZerosLeft() {
        // 26. Shift Zeros Left
        int[] numbers = {1, 0, 2, 0, 3, 0, 4, 5, 0};

    }

    @Test
    public void Sort() {
        // 14. Sort an array of strings & numbers
        String[] strings = {"x", "h", "k", "i", "p", "a"};
        int[] numbers = {9, 17, 38, 65, 454, 12, 33};
        Arrays.sort(strings);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void Sum() {
        // 12. Find the sum
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) { sum += num; }
        System.out.println("Sum: " + sum);
    }
}
