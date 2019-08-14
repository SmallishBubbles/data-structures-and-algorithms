# Singly Linked List
<!-- Short summary or background information -->
Implement a Singly Linked List Data Structure

## Code:
#### [LinkedList Class](/Data-Structures/linkedList/src/main/java/linkedList/LinkedList.java) | [Node Class](/Data-Structures/linkedList/src/main/java/linkedList/Node.java) | [Tests](/Data-Structures/linkedList/src/test/java/linkedList/LinkedListTest.java)


## Challenge
<!-- Description of the challenge -->
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
* Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
* Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
* Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
* Define a method called toString which takes in no arguments and returns a string representing all the values in the Linked List.
* At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
* Write the following methods for the Linked List class:
  * .append(value) which adds a new node with the given value to the end of the list
  * .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
  * .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node
* Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
This Linked List implementation has a LinkedList class and a Node class.

Method Time Efficiency:
* insert: O(1)
* includes: O(n)
* toString: O(n)
* append: O(n)
* insertBefore: O(n)
* insertAfter: O(n)
* remove: O(n)
* kthFromEnd: O(n)

Method Space Efficiency:
* All methods: O(1)

### Inserts:
![Linked List Inserts Whiteboard](/assets/linkedListInserts.png)

### KthFromEnd:
#### Approach:
Jane and I decided to use two pointers (one for `current`, and one for `currentKFromEnd`) in our algorithm because this allowed us to loop through the list only once, rather than twice.
The pointer k spaces back from current (`currentKFromEnd`) only gets incremented if we've itterated through more than `k` items so far.
With this method, we also had to check for situations where `k` was out of bounds.
#### Efficiency:
This solution has an efficiency of `O(n)`
![Linked List KthFromEnd Whiteboard](/assets/linkedListKthFromEnd.jpg)


## API
<!-- Description of each method publicly available to your Linked List -->
The LinkedList class can be instantiated with any non-primitive data type. To create a new LinkedList, include the data type in carats. For example:
```
LinkedList<String> listName = new LinkedList<>();
```
Upon creation, the linked list will hold a single `null` value in the head.

### Publically Available Methods:
#### insert(value)
Insert a new value into the __start__ of the list.
insert time is constant `O(1)`
#### append(value)
Append a new value into the __end__ of the list.
append time is linear `O(n)`
#### insertBefore(target, value)
Add a new item to the list directly before the target value.
If the target value is not part of the list, a `NoSuchElementException` will be thrown.
insertBefore time is linear `O(n)`
#### insertAfter(target, value)
Add a new item to the list directly after the target value.
If the target value is not part of the list, a `NoSuchElementException` will be thrown.
insertAfter time is linear `O(n)`
#### includes(value)
Check whether a certain value is present in the list. 
includes time is linear `O(n)`
#### remove(value)
Remove the first occurance of a specified value from the list. The removed value will be returned.
If the specified value is not included in the list, the return value will be `null`
remove time is linear `O(n)`
#### toString()
Print a string representing all the values in the linked list
toString time is linear `O(n)`
#### kthFromEnd(k)
Return the value of the elment `k` places before the end of the list. Must be called with an integer value `O <= k < list length`
kthFromEnd time is linear `O(n)`

