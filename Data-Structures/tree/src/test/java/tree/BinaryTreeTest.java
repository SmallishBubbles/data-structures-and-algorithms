package tree;

import org.checkerframework.checker.units.qual.A;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    BinaryTree<Integer> testTree;
    BinaryTree<String> unbalancedTree;
    ArrayList<Integer> preOrderExpected;
    ArrayList<Integer> inOrderExpected;
    ArrayList<Integer> postOrderExpected;
    ArrayList<Integer> breadthFirstExpected;
    ArrayList<String> unbalancedTreeExpected;


    @Before
    public void setTestTree() {
        /*
                7
               / \
              4   9
             / \
            2   6

         */
        testTree = new BinaryTree<>(
                new Node<Integer>(7,
                        new Node<Integer>(4,
                                new Node<Integer>(2),
                                new Node<Integer>(6)),
                        new Node<Integer>(9)));

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

        breadthFirstExpected = new ArrayList<>();
        breadthFirstExpected.add(7);
        breadthFirstExpected.add(4);
        breadthFirstExpected.add(9);
        breadthFirstExpected.add(2);
        breadthFirstExpected.add(6);



        /*
                cat
               /   \
             dog   fish
                   /   \
               turtle  hamster
                            \
                            rabbit
                            /
                         mouse
                            \
                            pony

         */
        unbalancedTree = new BinaryTree<>(
                new Node<String>("cat",
                        new Node<String>("dog"),
                        new Node<String>("fish",
                                new Node<String>("turtle"),
                                new Node<String>("hamster",
                                        null,
                                        new Node<String>("rabbit",
                                                new Node<String>("mouse",
                                                        null,
                                                        new Node<String>("pony")),
                                                null)))));

        unbalancedTreeExpected = new ArrayList<>();
        unbalancedTreeExpected.add("cat");
        unbalancedTreeExpected.add("dog");
        unbalancedTreeExpected.add("fish");
        unbalancedTreeExpected.add("turtle");
        unbalancedTreeExpected.add("hamster");
        unbalancedTreeExpected.add("rabbit");
        unbalancedTreeExpected.add("mouse");
        unbalancedTreeExpected.add("pony");
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

    @Test
    public void breadthFirst_happy() {
        assertEquals("should return in breadth first order (from top to bottom)",breadthFirstExpected, BinaryTree.breadthFirst(testTree));
    }

    @Test
    public void breadthFirst_unbalancedTree() {
        assertEquals("should return in breadth first order (from top to bottom) including all values",
                unbalancedTreeExpected, BinaryTree.breadthFirst(unbalancedTree));
    }

    @Test
    public void breadthFirst_emptyTree() {
        BinaryTree<Integer> emptyTree = new BinaryTree<>();
        ArrayList<Integer> emptyTreeExpected = new ArrayList<>();

        assertEquals("should return an empty list",
                emptyTreeExpected, BinaryTree.breadthFirst(emptyTree));
    }


    @Test
    public void findMaximumValue_inMiddle() {
        assertEquals("findMaxValue should return the largest value in the tree",
                (Integer)9, testTree.findMaximumValue());
    }

    @Test
    public void findMaximumValue_atBottom() {

        /*
                7
               / \
              4   9
             / \
            2   17

         */
        testTree = new BinaryTree<>(
                new Node<Integer>(7,
                        new Node<Integer>(4,
                                new Node<Integer>(2),
                                new Node<Integer>(17)),
                        new Node<Integer>(9)));


        assertEquals("findMaxValue should return the largest value in the tree",
                (Integer)17, testTree.findMaximumValue());
    }

    @Test
    public void findMaximumValue_atRoot() {

        /*
                21
               / \
              4   9
             / \
            2   17

         */
        testTree = new BinaryTree<>(
                new Node<Integer>(21,
                        new Node<Integer>(4,
                                new Node<Integer>(2),
                                new Node<Integer>(17)),
                        new Node<Integer>(9)));


        assertEquals("findMaxValue should return the largest value in the tree",
                (Integer)21, testTree.findMaximumValue());
    }

    @Test
    public void findMaximumValue_empty() {

        testTree = new BinaryTree<>();

        assertEquals("findMaxValue should return the largest value in the tree",
                (Integer)null, testTree.findMaximumValue());
    }

    @Test ( expected = ClassCastException.class )
    public void findMaximumValue_nonNumber() {

        // calling findMaximumValue on a tree of non numbers should throw an error

        unbalancedTree.findMaximumValue();
    }
}