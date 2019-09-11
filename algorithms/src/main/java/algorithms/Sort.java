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




    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }

        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int low = left - 1;
        for (int i=left; i < right; i++) {
            if (arr[i] <= pivot) {
                low ++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low + 1);
        return low + 1;
    }

    private static void swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
