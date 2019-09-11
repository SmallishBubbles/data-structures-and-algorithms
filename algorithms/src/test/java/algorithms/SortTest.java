package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    // __________________________ Insertion Sort Tests __________________________

    @Test
    public void testInsertionSort_happy() {
        // test a normal unsorted array
        int[] arr = {7, 5, 9, 2, 1, 12, 5};
        assertArrayEquals("the output arr should be sorted in order",
                new int[]{1, 2, 5, 5, 7, 9, 12} , Sort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_sorted() {
        // test an already sorted array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals("the output arr should remain in sorted order",
                new int[]{1, 2, 3, 4, 5, 6, 7} , Sort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_backwards() {
        // test an array that starts completely backwards
        int[] arr = {12, 8, 5, 4, 3, 1, -5};
        assertArrayEquals("the output arr should be successfully sorted",
                new int[]{-5, 1, 3, 4, 5, 8, 12} , Sort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_duplicates() {
        // test an array with all the same number
        int[] arr = {3, 3, 3, 3, 3, 3, 3};
        assertArrayEquals("the sort method should complete even if all numbers are equal",
                new int[]{3, 3, 3, 3, 3, 3, 3} , Sort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_empty() {
        // test an empty array
        int[] arr = {};
        assertArrayEquals("the insertionSort method should not throw an error given an empty arr",
                new int[]{} , Sort.insertionSort(arr));
    }

    @Test
    public void testInsertionSort_negatives() {
        // test an array with negative numbers
        int[] arr = {-15, -3, -9, -1, -21, -11, -7};
        assertArrayEquals("insertionSort should work if given negative numbers",
                new int[]{-21, -15, -11, -9, -7, -3, -1} , Sort.insertionSort(arr));
    }


    // __________________________ Merge Sort Tests __________________________

    @Test
    public void testMergeSort_happy() {
        int[] arr = {7, 5, 9, 2, 1, 12, 5};
        assertArrayEquals("the output arr should be sorted in order",
                new int[]{1, 2, 5, 5, 7, 9, 12} , Sort.mergeSort(arr));
    }

    @Test
    public void testMergeSort_sorted() {
        // test an already sorted array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals("the output arr should remain in sorted order",
                new int[]{1, 2, 3, 4, 5, 6, 7} , Sort.mergeSort(arr));
    }

    @Test
    public void testMergeSort_backwards() {
        // test an array that starts completely backwards
        int[] arr = {12, 8, 5, 4, 3, 1, -5};
        assertArrayEquals("the output arr should be successfully sorted",
                new int[]{-5, 1, 3, 4, 5, 8, 12} , Sort.mergeSort(arr));
    }

    @Test
    public void testMergeSort_duplicates() {
        // test an array with all the same number
        int[] arr = {3, 3, 3, 3, 3, 3, 3};
        assertArrayEquals("the sort method should complete even if all numbers are equal",
                new int[]{3, 3, 3, 3, 3, 3, 3} , Sort.mergeSort(arr));
    }

    @Test
    public void testMergeSort_empty() {
        // test an empty array
        int[] arr = {};
        assertArrayEquals("the mergeSort method should not throw an error given an empty arr",
                new int[]{} , Sort.mergeSort(arr));
    }

    @Test
    public void testMergeSort_negatives() {
        // test an array with negative numbers
        int[] arr = {-15, -3, -9, -1, -21, -11, -7};
        assertArrayEquals("mergeSort should work if given negative numbers",
                new int[]{-21, -15, -11, -9, -7, -3, -1} , Sort.mergeSort(arr));
    }

    // __________________________ Quick Sort Tests __________________________

    @Test
    public void testQuickSort_happy() {
        int[] arr = {7, 5, 9, 2, 1, 12, 5};
        assertArrayEquals("the output arr should be sorted in order",
                new int[]{1, 2, 5, 5, 7, 9, 12} , Sort.quickSort(arr, 0, arr.length-1));
    }

    @Test
    public void testQuickSort_sorted() {
        // test an already sorted array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals("the output arr should remain in sorted order",
                new int[]{1, 2, 3, 4, 5, 6, 7} , Sort.quickSort(arr, 0, arr.length-1));
    }

    @Test
    public void testQuickSort_backwards() {
        // test an array that starts completely backwards
        int[] arr = {12, 8, 5, 4, 3, 1, -5};
        assertArrayEquals("the output arr should be successfully sorted",
                new int[]{-5, 1, 3, 4, 5, 8, 12} , Sort.quickSort(arr, 0, arr.length-1));
    }

    @Test
    public void testQuickSort_duplicates() {
        // test an array with all the same number
        int[] arr = {3, 3, 3, 3, 3, 3, 3};
        assertArrayEquals("the sort method should complete even if all numbers are equal",
                new int[]{3, 3, 3, 3, 3, 3, 3} , Sort.quickSort(arr, 0, arr.length-1));
    }

    @Test
    public void testQuickSort_empty() {
        // test an empty array
        int[] arr = {};
        assertArrayEquals("the quickSort method should not throw an error given an empty arr",
                new int[]{} , Sort.quickSort(arr, 0, arr.length-1));
    }

    @Test
    public void testQuickSort_negatives() {
        // test an array with negative numbers
        int[] arr = {-15, -3, -9, -1, -21, -11, -7};
        assertArrayEquals("quickSort should work if given negative numbers",
                new int[]{-21, -15, -11, -9, -7, -3, -1} , Sort.quickSort(arr, 0, arr.length-1));
    }

}