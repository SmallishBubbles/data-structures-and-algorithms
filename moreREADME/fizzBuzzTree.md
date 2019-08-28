# Challenge Summary
<!-- Short summary or background information -->
Conduct “FizzBuzz” on a tree while traversing through it. Change the values of each of the nodes dependent on the current node’s value

#### [Code](/Data-Structures/tree/src/main/java/utilities/FizzBuzzTree.java) | [Tests](/Data-Structures/tree/src/test/java/utilities/FizzBuzzTreeTest.java)

## Challenge Description
<!-- Description of the challenge -->
#### Feature Tasks
* Write a function called `FizzBuzzTree` which takes a `tree` as an argument.
* Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
  * If the value is divisible by 3, replace the value with `“Fizz”`
  * If the value is divisible by 5, replace the value with `“Buzz”`
  * If the value is divisible by 3 and 5, replace the value with `“FizzBuzz”`
* Return the tree with its new values.

* For explicitly-typed languages: __Ensure your node values are of type `Object`__, to hold either strings or integers.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used a recursive preorder traversal to go through the entire tree. For my base case, if the nod I'm on is null, just return. Otherwise, if the value of the node that I'm on is divisible by 3 & 5, modify it to "FizzBuzz", if it's divisible by 3, change it to "Fizz", and if it's divisible by 5, change it to "Buzz". Once these checks are complete, recursively call the method on the left and right nodes of where I am.

#### Big O:
Time: O(n) - each node must be visited once
Space: O(1)?? - no new nodes or data structures are created, but I am changing values

## Solution
<!-- Embedded whiteboard image -->
![Whiteboard image](/assets/FizzBuzzTree.jpg)