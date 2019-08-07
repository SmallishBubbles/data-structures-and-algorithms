package code401challenges;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testArrayShift() {
        assertArrayEquals("Should work on even length arr", new int[]{1,2,3,4,5}, ArrayShift.arrayShift(new int[]{1,2,4,5}, 3));
        assertArrayEquals("Should insert after middle item on odd length arr", new int[]{4,8,15,16,23,42}, ArrayShift.arrayShift(new int[]{4,8,15,23,42}, 16));
    }

    @Test
    public void testArrayShift_edge(){
        assertArrayEquals("Should still insert if arr is empty", new int[]{1}, ArrayShift.arrayShift(new int[]{}, 1));
        assertArrayEquals("Should still insert if arr has only 1 item", new int[]{1,2}, ArrayShift.arrayShift(new int[]{1}, 2));
    }

    @Test
    public void testArrayShift_fail(){
        assertFalse("Should not insert at start", Arrays.equals( new int[]{6,1,2,3,4,5}, ArrayShift.arrayShift(new int[]{1,2,3,4,5}, 6)));
        assertFalse("Should not insert at end", Arrays.equals( new int[]{1,2,3,4,5,6}, ArrayShift.arrayShift(new int[]{1,2,3,4,5}, 6)));
        assertFalse("Should not insert at midpoint rounded down", Arrays.equals( new int[]{1,2,6,3,4,5}, ArrayShift.arrayShift(new int[]{1,2,3,4,5}, 6)));
    }

}