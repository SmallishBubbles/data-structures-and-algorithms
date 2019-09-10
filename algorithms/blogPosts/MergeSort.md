# Blog Notes: Merge Sort
Merge sort is an algorithm which will sort an array in ascending order. This sort method is fairly quick, but has no gains for data that might be partially sorted before starting, and can be memory intensive. 

Merge sort has a runtime of O(nlog(n)) and a space complexity (when using recursion) of O(nlog(n)). 

## Learning Objectives
* What is merge sort?
* How does merge sort work?
* When should you use it?

## Information Flow
* Main Point
  * Supporting Points
* Another main point
  * More details
  * Go here

## Diagram
![merge sort gif](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)

## Algorithm
1. Split the array in half, over and over, until you have single items
2. Start merging things back together. This works kind of like a zipper.
    1. check the start of the two half arrays
    2. add whichever is smaller to the start of the new array, move that pointer
    3. continue until all items from the smaller arrays have been added to the larger 


## Pseudocode
```
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
```

## Readings and References
#### Read
* [A simplified explanation of merge sort](https://medium.com/karuna-sehgal/a-simplified-explanation-of-merge-sort-77089fe03bb2#targetText=Merge%20Sort%20is%20a%20divide,solution%20to%20the%20original%20problem.)
* [Overview of merge sort](https://www.khanacademy.org/computing/computer-science/algorithms/merge-sort/a/overview-of-merge-sort)