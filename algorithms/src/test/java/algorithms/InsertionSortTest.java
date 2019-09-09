package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionSort_happy() {
        // test a normal unsorted array
        int[] arr = {7, 5, 9, 2, 1, 12, 5};
        assertArrayEquals("the output arr should be sorted in order",
                new int[]{1, 2, 5, 5, 7, 9, 12} , InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_sorted() {
        // test an already sorted array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals("the output arr should remain in sorted order",
                new int[]{1, 2, 3, 4, 5, 6, 7} , InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_backwards() {
        // test an array that starts completely backwards
        int[] arr = {12, 8, 5, 4, 3, 1, -5};
        assertArrayEquals("the output arr should be successfully sorted",
                new int[]{-5, 1, 3, 4, 5, 8, 12} , InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_duplicates() {
        // test an array with all the same number
        int[] arr = {3, 3, 3, 3, 3, 3, 3};
        assertArrayEquals("the sort method should complete even if all numbers are equal",
                new int[]{3, 3, 3, 3, 3, 3, 3} , InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_empty() {
        // test an empty array
        int[] arr = {};
        assertArrayEquals("the insertionSort method should not throw an error given an empty arr",
                new int[]{} , InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_negatives() {
        // test an array with negative numbers
        int[] arr = {-15, -3, -9, -1, -21, -11, -7};
        assertArrayEquals("insertionSort should work if given negative numbers",
                new int[]{-21, -15, -11, -9, -7, -3, -1} , InsertionSort.insertionSort(arr));
    }
}