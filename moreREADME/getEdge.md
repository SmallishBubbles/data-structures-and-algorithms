# Challenge Summary
<!-- Short summary or background information -->
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

## Challenge Description
<!-- Description of the challenge -->
Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My implementation uses two helper functions to run.
- `findVertex` takes in a graph and a value, and returns the vertex containint that value, or `null`
- `findEdge` takes in a list of edges and a value, and returns the edge containing a vertex with that value

##### Algorithm:
1. current <- findVertex(first location)
2. cost <- 0
3. for second location ... end of locations
   1. nextLocationDirect <- findEdge(first location neighbours, second location)
   2. if nextLocationDirect != null
      1. cost += nextLocationDirect weight
      2. current <- second location
   3. else
      1. return ["false", "$0"]
4. return ["true", "$" + cost]


##### Big O Analysis:
Because of these helper functions, the time complexity is `O(n^2)` and the space complexity is `O(1)`

## Solution
<!-- Embedded whiteboard image -->
![get edge whiteboard](/assets/getEdge.jpg)