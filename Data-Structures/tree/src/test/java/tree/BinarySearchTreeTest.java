package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree exampleTree;
    ArrayList<Integer> inOrderExpected;

    @Before
    public void setExpected() {
        exampleTree = new BinarySearchTree();
        exampleTree.add(6);
        exampleTree.add(2);
        exampleTree.add(4);
        exampleTree.add(9);
        exampleTree.add(7);

        inOrderExpected = new ArrayList<>();
        inOrderExpected.add(2);
        inOrderExpected.add(4);
        inOrderExpected.add(6);
        inOrderExpected.add(7);
        inOrderExpected.add(9);
    }

    @Test
    public void add_leftAndRight() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(7);
        testTree.add(4);
        testTree.add(12);

        assertNotNull("The root node should have a left and right child",
               testTree.root.left );
        assertNotNull("The root node should have a left and right child",
                testTree.root.right );
    }

    @Test
    public void add_withStartNode() {
        BinarySearchTree testTree = new BinarySearchTree(new Node<Integer>(12));

        assertNotNull("The binary search tree should already contain a root node",
                testTree.root );

    }

    @Test
    public void contains_searchRoot_searchLeaf_searchMiddle() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(25);
        testTree.add(12);
        testTree.add(30);
        testTree.add(2);
        testTree.add(7);
        testTree.add(24);
        testTree.add(400);
        testTree.add(402);
        testTree.add(17);

        assertTrue(testTree.contains(402));
        assertTrue(testTree.contains(25));
        assertTrue(testTree.contains(2));
        assertTrue(testTree.contains(17));
        assertTrue(testTree.contains(7));
    }

    @Test
    public void contains_false() {
        assertFalse("contains should return false on values not included in the tree", exampleTree.contains(28));
    }

    @Test
    public void inOrder_BST() {
        assertEquals("The binary search tree should return a sorted arraylist of integers when traversed in order",
                inOrderExpected, exampleTree.inOrder());
    }
}