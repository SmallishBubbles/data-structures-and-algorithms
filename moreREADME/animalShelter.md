# Challenge Summary
<!-- Short summary or background information -->
First-in, First out Animal Shelter.

---------
## Challenge Description
* Create a class called `AnimalShelter` which holds only dogs and cats. The shelter operates using a __first-in, first-out__ approach.
* Implement the following methods:
`enqueue(animal)`: adds animal to the shelter. animal can be either a dog or a cat object.
`dequeue(pref)`: returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

--------
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I decided to make an `AnimalShelter` class which contained two queues, one for cats only, and one for dogs only. I also made a `Cat` class and a `Dog` class, both of which implemented the `Animal` interface, which allowed them to be stored as animals. 

Internally, on enqueue, I check which type of animal I was given (cat or dog) using `instanceof` which I found at this super helpful article on [polymorphism and interfaces](https://www.artima.com/objectsandjava/webuscript/PolymorphismInterfaces1.html). 

On dequeue, I check the preferred animal, and return a dequeued `Cat`, `Dog`, or `null` depending on animal availability.

#### Big O:
enqueue time: `O(1)`
dequeue time: `O(1)`

----------
## Solution
<!-- Embedded whiteboard image -->
#### [Code](/Data-Structures/stacksandqueues/src/main/java/stacksandqueues/utilities/) | [Tests](/Data-Structures/stacksandqueues/src/test/java/stacksandqueues/utilities/)

#### Whiteboard:
![animal shelter whiteboard](/assets/AnimalShelter.jpg)