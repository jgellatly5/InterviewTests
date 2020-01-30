package com.gallopdevs.interviewtests.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
        // 9. Get random element
        // 10. Append a new item to an array
        // 11. Compare two arrays
        // 12. Check if an array is empty
        // 13. Filter values in an array
        // 14. Find the sum & the average
        // 15. Sort an array of strings & numbers
        // 16. Find the index of an element
        // 17. Remove a specific element
        // 18. Insert at a specific index
        // 19. Find common elements between two arrays
        // 20. Find 2nd largest element
        // 21. Find 2nd smallest element
        // 22. Add two matrices of the same size
        // 23. Move all 0's to the end of an array
        // 24. Find the number of even & odd integers
    }
}
