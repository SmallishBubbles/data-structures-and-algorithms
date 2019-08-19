# Stacks and Queues
An implementation of `Stack` and `Queue` data structures.
#### Node: [Class](/Data-Structures/stacksandqueues/src/main/java/stacksandqueues/Node.java) | [Tests](/Data-Structures/stacksandqueues/src/test/java/stacksandqueues/NodeTest.java)
#### Stack: [Class](/Data-Structures/stacksandqueues/src/main/java/stacksandqueues/Stack.java) | [Tests](/Data-Structures/stacksandqueues/src/test/java/stacksandqueues/StackTest.java)
#### Queue: [Class](/Data-Structures/stacksandqueues/src/main/java/stacksandqueues/Queue.java) | [Tests](/Data-Structures/stacksandqueues/src/test/java/stacksandqueues/QueueTest.java)

----------
## Challenge
### 1. Stack & Queue Implementation
#### Node
* Create a `Node` class that has a `value`, and a `next`
#### Stacks
* Create a `Stack` class that has a `top` property. It creates an empty Stack when instantiated.
* Define a method called `push` that adds a new node with that value.
* Define a method called `pop` that removes the node from the top of the stack.
* Define a method called `peek` that returns the value of the node located on top.
#### Queues
* Create a `Queue` class that has a `front` property. It creates an empty Queue when instantiated.
* Define a method called `enqueue` that adds a new node with that value.
* Define a method called `dequeue` that removes the node from the front.
* Define a method called `peek` that returns the value of the node located in the front.

----------
## Approach & Efficiency
### 1. Stack & Queue Implementation
I chose to have a top pointer for my stack, and both front and back pointers for my queue. This allowed me to make all starting methods with a time complexity of O(1) as I never needed to itterate through the stack or queue. These data structures use nodes, but the user does not need to interact with nodes directly and can pass in and recieve values from the structure instead.
#### Stack:
![Stack Illustration](/assets/stackIllustration.png)
#### Queue:
![Queue Illustration](/assets/queueIllustration.png)


----------
## API
### Node
##### To manually instantiate a new node:
Use either:
```
Node<T> foo = new Node(T value, Node<T> next);
```
```
Node<T> foo = new Node(T value);
```
##### Publicly available methods:
* `toString()`
  Returns a string containing the node's value and the values of all connected nodes
  Example:
  ```
  "value1 -> value2 -> value3 -> null"
  ```

### Stack
##### To instantiate a new Stack:
```
Stack<type> foo = new Stack<>();
```
##### Publicly available methods:
* `push(value)`
  Adds a new node with that value to the top of the stack. Time: `O(1)`
* `pop()`
  Removes the node from the top of the stack, and returns the node’s value. Time: `O(1)`
* `peek()`
  Returns the value of the node located on top of the stack without removing it. Time: `O(1)`

### Queue
##### To instantiate a new Queue:
```
Queue<type> bar = new Queue<>();
```
##### Publicly available methods:
* `enqueue(value)`
  Adds a new node with that value to the back of the queue. Time: `O(1)` performance.
* `dequeue()`
  Removes the node from the front of the queue, and returns the node’s value. Time: `O(1)`
* `peek()`
  Returns the value of the node located in the front of the queu, without removing it. Time: `O(1)`