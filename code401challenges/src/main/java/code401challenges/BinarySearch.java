package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int min = 0;
        int max = arr.length - 1;
        while ((max - min) > 0){
            int middle = (min + max) / 2;
            if ( arr[middle] == key ){
                return middle;
            }
            if ( key < arr[middle] ){
                // go left
                max = middle - 1;
            }
            if ( key > arr[middle] ){
                // go right
                min = middle + 1;
            }
        }
        // verify that the start array has a length and check the remaining item one last time
        if ( arr.length > 0 && arr[min] == key ) {
            return min;
        } else {
            return -1;
        }
    }
}
