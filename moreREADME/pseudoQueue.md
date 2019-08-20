# Challenge Summary
<!-- Short summary or background information -->
#### [Code](/Data-Structures/stacksandqueues/src/main/java/stacksandqueues/PseudoQueue.java) | [Tests](/Data-Structures/stacksandqueues/src/test/java/stacksandqueues/PseudoQueueTest.java)

## Challenge Description
<!-- Description of the challenge -->
Create a brand new PseudoQueue class. This PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

* `enqueue(value)` which inserts value into the PseudoQueue, using a first-in, first-out approach.
* `dequeue()` which extracts a value from the PseudoQueue, using a first-in, first-out approach.
* The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My first approach/idea was to use the second stack only on enqueue. I would take the dequeue stack, reverse it with the second stack, add the new item, and then reverse it back into the first stack. This would cause an O(n) on every enqueue, and O(1) on a dequeue. Then I learned that there was a way to make this be O(n) in the worst case, but on average better.
So I thought about how I could make enqueue/deque only have to do the "juggle" _sometimes_. Then I realized, if I kept one list with the "top" as the "end" of the queue, and one with the "top" as the "start" of the queue, I could do both enqueue and dequeue with O(1). But, how do I keep the stacks in sync?
I started drawing it out and realized that I should indeed juggle the things from an enqueue (end is the top) stack into a dequeue (start is the top) stack, but _only when the dequeue stack is empty_. As long as I remove everything from the dequeue stack before filling it again, I can keep adding more things to the enqueue stack and not worry about the stacks being out of sync, because each value will only exist in one stack at a time.
#### Big O Time Efficiency
Enqueue: `O(1)`
Dequeue: `O(n)` in the worst case, but better on average

## Solution
<!-- Embedded whiteboard image -->
![whiteboard](/assets/pseudoQueue.png)
