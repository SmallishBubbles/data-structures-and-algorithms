# Trees
<!-- Short summary or background information -->
Binary Tree and Binary Search Tree Implementations

#### [Code](/Data-Structures/tree/src/main/java/tree/) | [Tests](/Data-Structures/tree/src/test/java/tree/)

___________
## Challenge
<!-- Description of the challenge -->
* Create a `Node` class that has properties for the value stored in the node, the left child node, and the right child node.

* Create a `BinaryTree` class
  * Define a method for each of the depth first traversals called `preOrder`, `inOrder`, and `postOrder` which returns an array of the values, ordered appropriately.

* Create a `BinarySearchTree` class
  * Define a method named `add` that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
  * Define a method named `contains` that accepts a value, and returns a `boolean` indicating whether or not the value is in the tree at least once.

_______________
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I implemented recursive methods for my traversals, add, and contains. I also chose to return an ArrayList containing the tree values from my traversals as I do not have a `size` instance variable to know how large I would need to make an array, and because of the limitations on arrays with generic data types.
#### Big O:
traversals: O(n)
add: O(log(n))
contains: O(log(n))

___________
## API
<!-- Description of each method publicly available in each of your trees -->
#### Binary Tree Traversals
* __`preOrder()`__ traverses the binary tree and returns an `ArrayList` of the tree values in preOrder format (the root node is processed first, then its left and right nodes)
* __`inOrder()`__ traverses the binary tree and returns an `ArrayList` of the tree values in inOrder format (the left node is processed first, then the root, followed by the right) 
* __`postOrder()`__ traverses the binary tree and returns an `ArrayList` of the tree values in postOrder format (the left and right nodes are processed first, then the root)

#### Binary Search Tree
All of the above plus:
* __`add(value)`__ adds a value to the binary search tree at the correct location
* __`contains(value)`__ traverses the binary search tree and returns a `boolean` indicating whether the value is contained within the tree.

_______________
## Resources
* Brian Holt's examples from the Frontend Masters Course _4 Semesters of Computer Science in 5 Hours_
* Kevin Couture - algorithm brainstorm