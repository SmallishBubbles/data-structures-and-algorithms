package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void toString_oneNode() {
        Node<Integer> testNode = new Node<>(2);

        assertEquals("The node should return a value with a next of null",
                "2 -> null", testNode.toString());
    }

    @Test
    public void toString_manyNodes(){
        Node<Integer> testNodes = new Node<>(1, new Node<>(2, new Node<>(3, new Node<>(4, new Node<>(5)))));

        assertEquals("The node should return the entire list of pointers",
                "1 -> 2 -> 3 -> 4 -> 5 -> null", testNodes.toString());

    }
}