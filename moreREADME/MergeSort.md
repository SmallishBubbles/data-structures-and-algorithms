# Challenge Summary
### [Code](/algorithms/src/main/java/algorithms/Sort.java) | [Tests](/algorithms/src/test/java/algorithms/SortTest.java) | [Blog/Teaching](/algorithms/blogPosts/MergeSort.md)

* Complete a working, tested implementation of Merge Sort, based on the pseudo code provided
* Create a blog post on understanding the Merge Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way. E.g. a short skit, live mini-lecture, interpretive dance.

## Challenge Description
Pseudo Code
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
* Convert the pseudo-code into working code in your language
* Present a complete set of working tests

## Approach & Efficiency
My approach followed the pseudocode. This implementation uses:
* Time: O(nlog(n))
* Space: O(nlog(n))
