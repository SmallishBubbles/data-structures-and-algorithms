package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch_included() {
        assertTrue("The search should return the index of the key",
                BinarySearch.binarySearch(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 4) == 4);
    }

    @Test
    public void binarySearch_notIncluded() {
        assertTrue("The search should return -1 if the key is not contained",
                BinarySearch.binarySearch(new int[]{1,2,3,4,5,6}, 12) == -1);
    }

    @Test
    public void binarySearch_lastIndex() {
        assertTrue("The search should work if the key is the last index",
                BinarySearch.binarySearch(new int[]{11,22,33,44,55,66,77,88}, 88) == 7);
    }

    @Test
    public void binarySearch_firstIndex() {
        assertTrue("The search should work if the key is the first index",
                BinarySearch.binarySearch(new int[]{11,22,33,44,55,66,77,88}, 11) == 0);
    }

    @Test
    public void binarySearch_emptyArr() {
        assertTrue( "The search should still work on an empty array",
                BinarySearch.binarySearch(new int[]{}, 5) == -1);
    }
}