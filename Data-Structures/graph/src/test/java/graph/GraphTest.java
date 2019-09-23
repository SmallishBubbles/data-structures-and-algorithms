package graph;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {
    /*
        -[x] Node can be successfully added to the graph
        -[x] An edge can be successfully added to the graph
        -[x] A collection of all nodes can be properly retrieved from the graph
        -[x] All appropriate neighbors can be retrieved from the graph
        -[x] Neighbors are returned with the weight between nodes included
        -[x] The proper size is returned, representing the number of nodes in the graph
        -[x] A graph with only one node and edge can be properly returned
        -[x] An empty graph properly returns null
    */

    Graph<String> testGraph;

    @Before
    public void setTestGraph() {
        testGraph = new Graph<>();
    }

    @Test
    public void testAddVertex_and_size() {
        testGraph.addVertex("First");
        testGraph.addVertex("Second");
        assertEquals("The size of the graph should reflect the new vertices", 2, testGraph.size());
    }

    @Test
    public void testAddEdge() {
        Vertex vertexA = testGraph.addVertex("first");
        Vertex vertexB = testGraph.addVertex("second");
        testGraph.addEdge(vertexA, vertexB, 3);

        List<Edge<String>> edges = new LinkedList<>();
        edges.add(new Edge<>(vertexB, 3));

        assertEquals("The list of edges on vertexA should be updated",
                1, testGraph.getNeighbors(vertexA).size());
        assertEquals("The list of edges on vertexB should be updated",
                1, testGraph.getNeighbors(vertexB).size());
    }

    @Test
    public void testGetVertices_several() {
        Vertex vertexA = testGraph.addVertex("first");
        Vertex vertexB = testGraph.addVertex("second");
        Vertex vertexC = testGraph.addVertex("third");
        testGraph.addEdge(vertexA, vertexB, 3);
        testGraph.addEdge(vertexA, vertexC, 1);
        testGraph.addEdge(vertexC, vertexB, 5);

        List<Vertex<String>> allVertices = testGraph.getVertices();

        assertTrue("All vertices should be contained in the response",
                allVertices.contains(vertexA) &&
                allVertices.contains(vertexB) &&
                allVertices.contains(vertexC));
    }

    @Test
    public void testGetVertices_one() {
        Vertex vertexA = testGraph.addVertex("only me");

        List<Vertex<String>> allVertices = testGraph.getVertices();

        assertTrue("All vertices should be contained in the response",
                allVertices.contains(vertexA) &&
                        allVertices.size() == 1);
    }

    @Test
    public void testGetVertices_empty() {
        assertEquals("All vertices should be contained in the response",
                        null, testGraph.getVertices());
    }

    @Test
    public void testSize_empty() {
        assertEquals("the size of an empty graph should be zero",
                0, testGraph.size() );
    }

    @Test
    public void testGetNeighbors() {
        Vertex vertexA = testGraph.addVertex("first");
        Vertex vertexB = testGraph.addVertex("second");
        Vertex vertexC = testGraph.addVertex("third");
        Vertex vertexD = testGraph.addVertex("fourth");
        testGraph.addEdge(vertexA, vertexB, 3);
        testGraph.addEdge(vertexA, vertexC, 1);
        testGraph.addEdge(vertexB, vertexC, 5);
        testGraph.addEdge(vertexA, vertexD, 2);

        List<Edge<String>> vertexBsNeighbors = testGraph.getNeighbors(vertexB);

        assertTrue("All of vertex B's neighbors should be contained in the response (A and C)",
                vertexBsNeighbors.size() == 2);

        assertEquals("vertex a should be contained in b's neighbors",
                vertexA, vertexBsNeighbors.get(0).getVertex());

        assertEquals("vertex C should be contained in B's neighbors",
                vertexC, vertexBsNeighbors.get(1).getVertex());

        assertEquals("The weight associated with an edge should be contained in the response",
                3, vertexBsNeighbors.get(0).getWeight());

    }

}