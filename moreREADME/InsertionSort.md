# Challenge Summary
### [Code](/algorithms/src/main/java/algorithms/InsertionSort.java) | [Tests](/algorithms/src/test/java/algorithms/InsertionSortTest.java) | [Blog/Teaching](/algorithms/blogPosts/InsertionSort.md)

* Complete a working, tested implementation of Insertion Sort, based on the pseudo code provided
* Create a blog post on understanding the Insertion Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way. E.g. a short skit, live mini-lecture, interpretive dance.

## Challenge Description
Pseudo Code
```
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```
* Convert the pseudo-code into working code in your language
* Present a complete set of working tests

## Approach & Efficiency
My approach followed the pseudocode. This implementation uses in the __worst case__:
* Time: O(n^2)
* Space: O(1)
