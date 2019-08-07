# Challenge Summary
<!-- Short summary or background information -->
Manual Shift Array
Pair whiteboarded with: Sapana

## Challenge Description
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
We decided to create a new array and loop through, adding the elements in order until the middle, then the new item, then the remaining elements. 
* Time: O(n)
* Space: O(n)

## Solution
<!-- Embedded whiteboard image -->
[Code](/code401challenges/src/main/java/code401challenges/ArrayShift.java)
[Tests](/code401challenges/src/test/java/code401challenges/ArrayShiftTest.java)
![shift array whiteboard](/assets/shiftArr.png)