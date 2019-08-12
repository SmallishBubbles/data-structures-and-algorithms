# Singly Linked List
<!-- Short summary or background information -->
Implement a Singly Linked List Data Structure

##Code:
#### [LinkedList Class](/Data-Structures/linkedList/src/main/java/linkedList/LinkedList.java) | [Node Class](/Data-Structures/linkedList/src/main/java/linkedList/Node.java) | [Tests](/Data-Structures/linkedList/src/test/java/linkedList/LinkedListTest.java)


## Challenge
<!-- Description of the challenge -->
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
* Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
* Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
* Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
* Define a method called toString which takes in no arguments and returns a string representing all the values in the Linked List.
* At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
This Linked List implementation has a LinkedList class and a Node class.

Space:
* O(n)

Method Time Efficiency:
* insert: O(1)
* includes: O(n)
* toString: O(n)


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
#### includes(value)
Check whether a certain value is present in the list. 
includes time is linear `O(n)`
#### toString()
Print a string representing all the values in the linked list
toString time is linear `O(n)`
