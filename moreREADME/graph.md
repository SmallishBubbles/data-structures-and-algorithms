# Graphs
Graph implementation

## Challenge
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
* `addNode()`
* `addEdge()`
* `getNodes()`
* `getNeighbors()`
* `size()`

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My graph implementation uses an internal `HashMap` as the `adjacency list`. This `HashMap` holds a `Vertex` as the key, and a List of `Edges` as the value.

This graph implementation is also generic, meaning you can store any data type in the graph.


## API
<!-- Description of each method publicly available in your Graph -->
* #### `addVertex(T value)`
  Adds a new vertex with the given value and returns it.

* #### `addEdge(Vertex a, Vertex b, int weight)`
  Adds a new undirected edge between two vertices in the graph with the given weight/importance. Both nodes should already be in the graph.

* #### `getVertices()`
  Returns all of the vertices in the graph as a `List`

* #### `getNeighbors(Vertex vertex)`
  Returns a `List` of `edges` (a data structure containing a linked vertex and weight/importance of the connection) connected to the given node.

* #### `size()`
  Returns the total number of vertices in the graph.
