package graph;

import java.util.*;

public class Graph<T> {
    HashMap<Vertex<T>, List<Edge<T>>> adjacencyList;


    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public Vertex<T> addVertex(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        this.adjacencyList.put(vertex, new LinkedList<>());
        return vertex;
    }

    public void addEdge(Vertex<T> a, Vertex<T> b, int weight) {
        List<Edge<T>> newEdgesA = this.adjacencyList.get(a);
        newEdgesA.add(new Edge<>(b, weight));
        this.adjacencyList.put(a, newEdgesA);

        List<Edge<T>> newEdgesB = this.adjacencyList.get(b);
        newEdgesB.add(new Edge<>(a, weight));
        this.adjacencyList.put(b, newEdgesB);
    }

    public List<Vertex<T>> getVertices() {

        if ( this.adjacencyList.size() == 0 ) {
            return null;
        } else {
            List<Vertex<T>> allVertices = new LinkedList<>();
            // https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
            for (Vertex<T> vertex : this.adjacencyList.keySet()) {
                allVertices.add(vertex);
            }
            return allVertices;
        }
    }

    public List<Edge<T>> getNeighbors(Vertex<T> vertex) {
        return this.adjacencyList.get(vertex);
    }

    public int size() {
        return this.adjacencyList.size();
    }

    public List<Vertex<T>> breadthFirst(Vertex<T> vertex) {
        HashSet<Vertex<T>> visited = new HashSet<>();
        List<Vertex<T>> breadthFirstVertices = new LinkedList<>();
        Queue<Vertex<T>> queue = new LinkedList<>();

        // add starting vertex to queue and visited
        queue.add(vertex);
        visited.add(vertex);

        // while the queue has something in it
        while ( queue.peek() != null ) {
            // take the first thing out of the queue, set it as current, and add it to breadthFirstVertices
            Vertex<T> current = queue.remove();
            breadthFirstVertices.add(current);

            // loop through the current's edges
            for ( Edge<T> edge : this.adjacencyList.get(current) ) {
                // if the connected vertex has NOT been visited before
                if ( !visited.contains(edge.getVertex()) ) {
                    // add it to visited and the queue
                    queue.add(edge.getVertex());
                    visited.add(edge.getVertex());
                }
            }
        }

        return breadthFirstVertices;
    }

}