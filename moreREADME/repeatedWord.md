# Challenge Summary - Repeated Word
Find the first repeated word in a book.



## Challenge Description
#### Feature Tasks
* Write a function that accepts a lengthy string parameter.
* Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.
* Write at least three test assertions for each method that you define.


## Approach & Efficiency
This approach uses my [Hash Table implementation](./hashTable.md).
1. Create a new `hash table` to store words seen so far.
2. Split the input string into a normalized array containing words in lowercase without punctuation.
3. Loop through the string array
    1. if the word is already contained in the hash table, return the word
    2. if the word is not already in the hash table, add it to the hash table
4. If we made it through the string array without finding a duplicate, return `"There were no duplicates"`.

This solution takes `O(n)` time in the worst case, and `O(n)` space.

## Solution
#### [Code](/Data-Structures/hashtable/src/main/java/hashtable/RepeatedWord/RepeatedWord.java)  |  [Tests](/Data-Structures/hashtable/src/test/java/hashtable/RepeatedWord/RepeatedWordTest.java)