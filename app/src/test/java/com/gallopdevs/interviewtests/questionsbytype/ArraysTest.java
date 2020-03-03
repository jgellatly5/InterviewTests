package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.arrays.FindDuplicatesCount;
import com.gallopdevs.interviewtests.questionsbytype.arrays.FindDuplicatesLoop;
import com.gallopdevs.interviewtests.questionsbytype.arrays.FindDuplicatesSet;
import com.gallopdevs.interviewtests.questionsbytype.arrays.MatrixProduct;
import com.gallopdevs.interviewtests.questionsbytype.arrays.MedianTwoSortedArrays;
import com.gallopdevs.interviewtests.questionsbytype.arrays.MidThree;
import com.gallopdevs.interviewtests.questionsbytype.arrays.MinMaxArray;
import com.gallopdevs.interviewtests.questionsbytype.arrays.GetMissingNumber;
import com.gallopdevs.interviewtests.questionsbytype.arrays.PrintMissingNumbers;
import com.gallopdevs.interviewtests.questionsbytype.arrays.PrintPairsSumSet;
import com.gallopdevs.interviewtests.questionsbytype.arrays.RemoveDuplicates;
import com.gallopdevs.interviewtests.questionsbytype.arrays.ReverseArray;
import com.gallopdevs.interviewtests.questionsbytype.arrays.RotateLeft;
import com.gallopdevs.interviewtests.questionsbytype.arrays.RotateMatrixClockwise;
import com.gallopdevs.interviewtests.questionsbytype.arrays.PrintPairsSumLoop;
import com.gallopdevs.interviewtests.questionsbytype.arrays.RotateMatrixCounterClockwise;
import com.gallopdevs.interviewtests.questionsbytype.arrays.Sum2;
import com.gallopdevs.interviewtests.questionsbytype.arrays.ZeroMatrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class ArraysTest {

    // first non-repeating integers in an array
    // merge two sorted arrays
    // rearrange positive and negative values in an array

    @Test
    public void SingleMissingNumber() {
        System.out.println("=========Test1 Single Number=========");
        // Only one missing number in array
        int[] numbers = new int[]{1, 2, 3, 5, 6};
        int missing = GetMissingNumber.getMissingNumber(numbers, numbers.length + 1);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(numbers), missing);
    }

    @Test
    public void MultipleMissingNumbers() {
        System.out.println("=========Test1 Multiple Numbers=========");
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
    public void FindDuplicatesLoop() {
        System.out.println("=========Test1 FindDuplicatesLoop=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesLoop.findDuplicatesLoop(new int[]{1, 2, 4, 1, 5, 6, 4});
    }

    @Test
    public void FindDuplicatesSet() {
        System.out.println("=========Test1 FindDuplicatesSet=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesSet.findDuplicatesSet(new int[]{1, 2, 4, 1, 5, 6, 4});
    }

    @Test
    public void FindDuplicatesCount() {
        System.out.println("=========Test1 FindDuplicatesCount=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesCount.findDuplicatesCount(numbers);
    }

    @Test
    public void RemoveDuplicates() {
        System.out.println("=========Test1=========");
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};
        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates.removeDuplicates(input)));
        }
    }

    @Test
    public void MinMaxArray() {
        int[] test = new int[]{10, 3, 5, 6, 7, 2};
        System.out.println("=========Test1=========");
        MinMaxArray.findMinAndMax(test);
    }

    @Test
    public void PrintPairsSumLoop() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int sum = 7;
        System.out.println("=========Test1 PrintPairsSumLoop=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumLoop.printPairs(numbers, sum);
    }

    @Test
    public void PrintPairsSumSet() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int sum = 7;
        System.out.println("=========Test1 PrintPairsSumSet=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumSet.printPairsSet(numbers, sum);
    }

    @Test
    public void ReverseArray() {
        System.out.println("=========Test1 ReverseArray=========");
        int[] reverseArray = new int[]{4, 3, 5, 6, 7, 2};
        int[] reverseArray2 = new int[]{4, 3, 5, 6, 7, 2, 10};
        System.out.println(Arrays.toString(reverseArray));
        ReverseArray.reverseArray(reverseArray);
        System.out.println(Arrays.toString(reverseArray2));
        ReverseArray.reverseArray(reverseArray2);
    }

    @Test
    public void RotateMatrixClockwise() {
        System.out.println("=========Test1=========");
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        RotateMatrixClockwise.rotateMatrixClockwise(matrix);
        printMatrix(matrix);
    }

    @Test
    public void RotateMatrixCounterClockwise() {
        System.out.println("=========Test1=========");
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        RotateMatrixCounterClockwise.rotateMatrixCounterClockwise(matrix);
        printMatrix(matrix);
    }

    @Test
    public void ZeroMatrix() {
        System.out.println("=========ZeroMatrix=========");
        int[][] matrix = {
                {0, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ZeroMatrix.zeroMatrix(matrix);
        printMatrix(matrix);
    }

    @Test
    public void MedianTwoSortedArrays() {
        System.out.println("=========MedianTwoSortedArrays=========");
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Median: " + MedianTwoSortedArrays.medianTwoSortedArrays(a, b));
    }

    @Test
    public void MatrixProduct() {
        System.out.println("=========MatrixProduct=========");
        int[][] matrix = {
                {-1, 2, 3},
                {4, 5, -6},
                {7, 8, 9}
        };
        System.out.println(MatrixProduct.matrixProduct(matrix));
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
    public void Sum2() {
        System.out.println("=========Sum2=========");
        int[] test1 = {1, 2, 3};
        int[] test2 = {1, 1};
        int[] test3 = {1, 1, 1, 1};
        System.out.println(Sum2.sum2(test1));
        System.out.println(Sum2.sum2(test2));
        System.out.println(Sum2.sum2(test3));
    }

    @Test
    public void MidThree() {
        System.out.println("=========MidThree=========");
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {8, 6, 7, 5, 3, 0, 9};
        int[] test3 = {1, 2, 3};
        System.out.println(Arrays.toString(MidThree.midThree(test1)));
        System.out.println(Arrays.toString(MidThree.midThree(test2)));
        System.out.println(Arrays.toString(MidThree.midThree(test3)));
    }

    private static int[] getRandomArray(int length) {
        int[] randomNums = new int[length];
        for (int i = 0; i < length; i++) {
            randomNums[i] = (int) (Math.random() * 15);
        }
        return randomNums;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void ArrayOperationsTest() {

        // 1. Declare an array
        String[] stringArray = {"a", "b", "c", "d", "e"};
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] anotherArray = new int[5];

        // 2. Print array
        System.out.println(Arrays.toString(numbers));

        // 3. Create ArrayList from an array
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println(arrayList);

        // 4. Check if an array contains a certain value
        System.out.println(Arrays.asList(stringArray).contains("a"));

        // 5. Concatenate two arrays
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(concatenateTwoArrays(a, b)));

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
        boolean isEmpty = emptyArray.length == 0;
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

        // 17. Remove a specific element (just using arrays)
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
        System.out.println("19.====================");
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {3, 4, 5, 6, 7};
        for (int i = 0; i < x.length; i++) {
            for(int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                }
            }
        }
        System.out.println();

        // 20. Find 2nd largest element
        System.out.println("20.====================");
        int[] secondLargest = {10, 20, 30, 40, 50};
        findSecondLargest(secondLargest);

        // 21. Find 2nd smallest element
        System.out.println("21.====================");
        int[] secondSmallest = {10, 20, 30, 40, 50};
        findSecondSmallest(secondSmallest);

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
        printMatrix(sumMatrix);

        // 23. Move all 0's to the end of an array
        System.out.println("23.====================");
        int[] problem23 = {12, 0, 4, 0, 35, 0, 0, 1};
        pushZerosToEnd(problem23);

        // 24. Find the number of even & odd integers
        System.out.println("24.====================");
        int[] problem24 = {1, 2, 3, 4, 5};
        findEvenAndOdd(problem24);
    }

    @Test
    public void Practice() {
        String[] stringArray = {"a", "b", "c"};
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println(arrayList);
        // Contains
        System.out.println(Arrays.asList(stringArray).contains("a"));
        System.out.println(Arrays.asList(stringArray).contains("z"));
    }

    private int[] insert(int[] numbers, int index, int value) {
        int[] result = new int[numbers.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = numbers[i];
        }
        result[index] = value;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = numbers[i - 1];
        }
        return result;
    }

    private int[] concatenateTwoArrays(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] result = new int[length];
        // position 1 = source array
        // position 2 = starting position of source array
        // position 3 = destination array
        // position 4 = starting position of destination array
        // position 5 = number of element to be copied
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    private void findSecondLargest(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Invalid size");
        }
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                secondLargest = max;
                max = num;
            } else if (num > secondLargest && num != max) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }

    private void findSecondSmallest(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Invalid size");
        }
        int min = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                secondSmallest = min;
                min = num;
            } else if (num < secondSmallest && num != min) {
                secondSmallest = num;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }

    private void pushZerosToEnd(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num != 0) {
                numbers[count++] = num;
            }
        }
        while (count < numbers.length) {
            numbers[count++] = 0;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private void findEvenAndOdd(int[] numbers) {
        int odd = 0;
        int even = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else if (number % 2 == 1) {
                odd++;
            }
        }
        System.out.println("Even count: " + even + ", odd count: " + odd);
    }
}
