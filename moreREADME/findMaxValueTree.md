# Challenge Summary
<!-- Short summary or background information -->
Find the Maximum Value in a Binary Tree

#### [Code](/Data-Structures/tree/src/main/java/tree/BinaryTree.java) | [Tests](/Data-Structures/tree/src/test/java/tree/BinaryTreeTest.java)

## Challenge Description
<!-- Description of the challenge -->
#### Feature Tasks
* Write an instance method called `find-maximum-value`. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. __You can assume that the values stored in the Binary Tree will be numeric__.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used recursion for my solution, passing the maximum value found so far down (and up) as needed. This still takes time to visit each node, but doesn't take any additional space other than the single new variable.

#### Big O:
Time: O(n) - each node must be visited once
Space: O(1)

## Solution
<!-- Embedded whiteboard image -->
![Whiteboard image](/assets/maxFromTree.jpg)