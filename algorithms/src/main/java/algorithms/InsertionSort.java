package algorithms;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        // loop through the array, starting at the second number
        // (the first thing in the array is already "sorted")
        for ( int i = 0; i < arr.length; i++ ) {

            // set j to compare with i, j should start as the last "sorted" number
            int j = i - 1;
            // save the number we're wanting to sort as a temp variable
            int temp = arr[i];

            // while our comparison position is greater than or equal to zero (stop when we get to the start of the arr)
            // AND our temp value is less than the comparison number (stop when the temp variable finds its "sorted" spot)
            while ( j >= 0 && temp < arr[j] ) {
                // move the number up one, our number will need a home below it
                arr[j + 1] = arr[j];
                // move our comparison tracker down one
                j = j - 1;
            }

            // yay, our loop stopped, this must be where our temp number belongs
            // set our temp number to the "sorted" location
            arr[j + 1] = temp;
        }

        // return the arr
        return arr;
    }

}
