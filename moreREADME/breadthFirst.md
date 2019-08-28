# Challenge Summary
<!-- Short summary or background information -->
Breadth-first Traversal.

#### [Code](/Data-Structures/tree/src/main/java/tree/BinaryTree.java) | [Tests](/Data-Structures/tree/src/test/java/tree/BinaryTreeTest.java)

## Challenge Description
<!-- Description of the challenge -->
#### Feature Tasks
* Write a breadth first traversal method which takes a `Binary Tree` as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a `Breadth-first` approach; print every visited node’s value.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used a while loop rather than recursion for this method because I knew I needed a queue of nodes rather than a stack. Starting on the root node, add its left and right children to the queue (if they exist). Then, move to the next node in the queue and repeat the process until the queue is empty. As you go, print the current node's value and/or add it to an arraylist to return.

#### Big O:
Time: O(n) - each node must be visited once
Space: O(n) - I am creating a new queue and a new arraylist for this solution, each of which takes n space.

## Solution
<!-- Embedded whiteboard image -->
![Whiteboard image](/assets/breadthFirst.jpg)