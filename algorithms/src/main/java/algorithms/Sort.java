package algorithms;

public class Sort {

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


    public static int[] mergeSort(int[] arr){
        /*
        ALGORITHM Mergesort(arr)
            DECLARE n <-- arr.length

            if n > 1
              DECLARE mid <-- n/2
              DECLARE left <-- arr[0...mid]
              DECLARE right <-- arr[mid...n]
              // sort the left side
              Mergesort(left)
              // sort the right side
              Mergesort(right)
              // merge the sorted left and right sides together
              Merge(left, right, arr)

        ALGORITHM Merge(left, right, arr)
            DECLARE i <-- 0
            DECLARE j <-- 0
            DECLARE k <-- 0

            while i < left.length && j < right.length
                if left[i] <= right[j]
                    arr[k] <-- left[i]
                    i <-- i + 1
                else
                    arr[k] <-- right[j]
                    j <-- j + 1

                k <-- k + 1

            if i = left.length
               set remaining entries in arr to remaining values in right
            else
               set remaining entries in arr to remaining values in left

            time: O(log(n))
            space: O(n log(n))
         */

        int n = arr.length;

        if ( n > 1 ) {
            int mid = n / 2;
            int[] left = arrCopier(arr, 0, n/2);
            int[] right = arrCopier(arr, mid, n);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);

        }

        return arr;
    }

    private static int[] arrCopier(int[] arr, int start, int end) {
        int[] newArr = new int[end - start];
        for ( int i = start, newi = 0; i < end; i++, newi++) {
            newArr[newi] = arr[i];
        }
        return newArr;
    }

    private static int[] merge(int[] left, int[] right, int[] arr) {
        int leftPointer = 0;
        int rightPointer = 0;
        int mainPointer = 0;

        while ( leftPointer < left.length && rightPointer < right.length ) {
            if (left[leftPointer] <= right[rightPointer]) {
                arr[mainPointer] = left[leftPointer];
                leftPointer++;
            } else {
                arr[mainPointer] = right[rightPointer];
                rightPointer++;
            }
            mainPointer++;
        }

        if ( leftPointer == left.length ) {
            while ( rightPointer < right.length ) {
                arr[mainPointer] = right[rightPointer];
                mainPointer++;
                rightPointer++;
            }
        } else {
            while ( leftPointer < left.length ) {
                arr[mainPointer] = left[leftPointer];
                mainPointer++;
                leftPointer++;
            }
        }

        return arr;
    }

}
