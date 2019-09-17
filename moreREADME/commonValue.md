# Challenge Summary - Common Value
Find common values in 2 binary trees.

## Challenge Description
Write a function called tree_intersection that takes two binary tree parameters.
Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

## Approach & Efficiency
My approach uses my binary tree implementation as well as my hash table implementation. I take the binary trees and flatten them using their inOrder traversal. For the first tree, I add all values to the hash table. For the second tree, if the value is already in the hash table, I add it to an answer arraylist. Then, I return the resulting arraylist.
Time: lots of O(n) (tree traversals and loops)
Space: O(n) (hash table)

## Solution
#### [Code](/Data-Structures/hashtable/src/main/java/hashtable/RepeatedWord/RepeatedWord.java)  |  [Tests](/Data-Structures/hashtable/src/test/java/hashtable/RepeatedWord/RepeatedWordTest.java)