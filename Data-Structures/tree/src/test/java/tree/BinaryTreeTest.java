package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    BinaryTree<Integer> testTree;
    ArrayList<Integer> preOrderExpected;
    ArrayList<Integer> inOrderExpected;
    ArrayList<Integer> postOrderExpected;


    @Before
    public void setTestTree() {
        testTree = new BinaryTree<>(new Node<Integer>(7, new Node<Integer>(4, new Node<Integer>(2), new Node<Integer>(6)), new Node<Integer>(9)));

        preOrderExpected = new ArrayList<>();
        preOrderExpected.add(7);
        preOrderExpected.add(4);
        preOrderExpected.add(2);
        preOrderExpected.add(6);
        preOrderExpected.add(9);

        inOrderExpected = new ArrayList<>();
        inOrderExpected.add(2);
        inOrderExpected.add(4);
        inOrderExpected.add(6);
        inOrderExpected.add(7);
        inOrderExpected.add(9);

        postOrderExpected = new ArrayList<>();
        postOrderExpected.add(2);
        postOrderExpected.add(6);
        postOrderExpected.add(4);
        postOrderExpected.add(9);
        postOrderExpected.add(7);
    }

    @Test
    public void preOrder() {
        assertEquals("should return in preOrder (self, left, right)", preOrderExpected, testTree.preOrder());
    }

    @Test
    public void inOrder() {
        assertEquals("should return inOrder (left, self, right)", inOrderExpected, testTree.inOrder());
    }

    @Test
    public void postOrder() {
        assertEquals("should return in postOrder (left, right, self)", postOrderExpected, testTree.postOrder());
    }
}