# Blog Notes: Quick Sort
QuickSort is a sorting algorithm which will sort an array in ascending order. 

This sort has a fast runtime on average (hence the name), but can turn into one of the slowest sorting methods if given data which is already sorted.

Because of this, QuickSort is particularly ill-suited if you think your data may be mostly or completely sorted already. This is the case even if your data is sorted in reverse order.
If you're looking for an an algorithm that works well for pre-sorted data, check out [Insertion Sort](./InsertionSort.md).

Quick sort has an average and best case runtime of `O(nlog(n))`, and a worst case runtime of `O(n^2)`. Quicksort, when recursively done in place, has a space complexity of `O(log(n))`. 

## Learning Objectives
* What is quick sort?
* How does quick sort work?
* When should you use it?

## Diagram
A similar quick sort implementation. This example uses a "low" and "high" pointer instead of a single "low" tracker as implemented below.
![Quick Sort Gif](https://www.tutorialspoint.com/data_structures_algorithms/images/quick_sort_partition_animation.gif)

## Algorithm
### Quicksort
1. Call the quicksort method by passing in the array you want to sort, a left position (the start of the array), and a right position(the end of the array)
2. If left is less than right
    1. Set a "position" pointer equal to the `partition` of array, left, and right
    2. Call quicksort on the left half of the partition
    3. Call quicksort on the right half of the partition
    
### Partition helper
1. Set a “pivot” number (this implementation always chooses the last available index). 
    1. This will be the item we compare against during this round of recursion.
2. Start a "low" pointer at one less than the left pointer
    1. this will track the index of all numbers lower than the pivot number
3. Step through the array from left to right
    1. if the current position is less than or equal to the pivot number
        1. add one to the "low" tracker
        1. swap the values at the current position and the "low" position
4. Move the "pivot" number to the middle by swapping "right" (our pivot location), with one index higher than "low"
    1. all numbers smaller than the pivot are now on the left, larger on the right)
5. Return "low" plus one (the new location of our pivot number)
    1. this effectively splits the array into two halves, which we can recursively sort on


## Pseudocode
```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```

## Readings and References

#### Read
* [A quick explanation of quick sort](https://medium.com/karuna-sehgal/a-quick-explanation-of-quick-sort-7d8e2563629b)
* [QuickSort](https://www.geeksforgeeks.org/quick-sort/#targetText=Although%20the%20worst%20case%20time,in%20most%20real%2Dworld%20data.)

