# Challenge Summary
<!-- Short summary or background information -->
Binary Search through an array for a specific item

Pair whiteboarded with: 
 * Chris
 * Matt

## Challenge Description
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

Assumptions:
* Array is sorted
* Array is of ints

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
We decided to use a while loop and if statements. We chose to use a while loop instead of recursion in order to keep the code understandable for newer programmers, and because we needed to keep track of the index of the item inside the original array.
* Time: O(log n)
* Space: O(1) ??

## Solution
<!-- Embedded whiteboard image -->
[Code](/code401challenges/src/main/java/code401challenges/BinarySearch.java)

[Tests](/code401challenges/src/test/java/code401challenges/BinarySearchTest.java)

![binary search whiteboard](/assets/binarySearch.png)