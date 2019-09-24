# Graphs
Graph implementation
### [Code](/Data-Structures/graph/src/main/java/graph/Graph.java) | [Tests](/Data-Structures/graph/src/test/java/graph/GraphTest.java)

_______

#Challenge
##Implementation
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
* `addVertex()`
* `addEdge()`
* `getVertices()`
* `getNeighbors()`
* `size()`

## Breadth First Traversal
<!-- Description of the challenge -->
Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.
* `breadthFirst()`

## Breadth First Traversal
<!-- Description of the challenge -->
Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. Without utilizing any of the built-in methods available to your language, return a collection of nodes in their pre-order depth-first traversal order.
* `depthFirstPreorder()`

______

# Approach & Efficiency
## Implementation
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My graph implementation uses an internal `HashMap` as the `adjacency list`. This `HashMap` holds a `Vertex` as the key, and a List of `Edges` as the value.

This graph implementation is also generic, meaning you can store any data type in the graph.

## Breadth First Traversal
My breadth first traversal uses a `Queue`, a `HashSet`, and a `List`.
* `Queue` is used for the breadth first traversal to keep track of the traversal order.
* `HashSet` is used for visited vertices to ensure the same vertex is not visited twice
* `List` is used as the return type and stores the traversed vertices.

#### Big O Analysis:
* Time: `O(n^2)` - in the worst case, where every vertex is connected
* Space: `O(n)`

#### Whiteboard:
![breadth first whiteboard](/assets/graph-breadth-first.jpg)


## Depth First Preorder Traversal
My breadth first traversal uses a `Stack`, a `HashSet`, and a `List`.
* `Stack` is used for the breadth first traversal to keep track of the traversal order.
* `HashSet` is used for visited vertices to ensure the same vertex is not visited twice
* `List` is used as the return type and stores the traversed vertices.

#### Big O Analysis:
* Time: `O(n^2)` - in the worst case, where every vertex is connected
* Space: `O(n)`

#### Whiteboard:
![depth first whiteboard](/assets/graph-depth-first.jpg)


______

# API
<!-- Description of each method publicly available in your Graph -->
* #### `addVertex(T value)`
  Adds a new vertex with the given value and returns it.

* #### `addEdge(Vertex<T> a, Vertex<T> b, int weight)`
  Adds a new undirected edge between two vertices in the graph with the given weight/importance. Both nodes should already be in the graph.

* #### `getVertices()`
  Returns all of the vertices in the graph as a `List`

* #### `getNeighbors(Vertex<T> vertex)`
  Returns a `List` of `edges` (a data structure containing a linked vertex and weight/importance of the connection) connected to the given node.

* #### `size()`
  Returns the total number of vertices in the graph.

* #### `breadthFirst(Vertex<T> vertex)`
  Returns a `List` of vertices from a breadth first traversal of the graph starting at the given vertex. Any islands in the graph will not be returned with this method.
