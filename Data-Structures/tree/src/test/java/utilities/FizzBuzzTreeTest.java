package utilities;

import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void testFizzBuzz_noFizzBuzz() {
        /* test on tree containing no fizz, buzz, or fizzbuzz
                7
               / \
              8   16
             / \
            2   22
        */

        BinaryTree<Object> noFizzBuzz = new BinaryTree<>(
                new Node<Object>(7,
                        new Node<Object>(8,
                                new Node<Object>(2),
                                new Node<Object>(22)),
                        new Node<Object>(16)));

        ArrayList<Object> noFizzBuzzExpected = new ArrayList<>();
        noFizzBuzzExpected.add(2);
        noFizzBuzzExpected.add(8);
        noFizzBuzzExpected.add(22);
        noFizzBuzzExpected.add(7);
        noFizzBuzzExpected.add(16);


        assertEquals("The tree should be unchanged if it does not contain any fizzbuzz",
                noFizzBuzzExpected, FizzBuzzTree.fizzBuzz(noFizzBuzz).inOrder());
    }

    @Test
    public void testFizzBuzz_allFizzBuzz() {
        /* test on tree containing only fizz, buzz, and fizzbuzz
                3
               / \
              15   9
             / \
           18   10
        */

        BinaryTree<Object> allFizzBuzz = new BinaryTree<>(
                new Node<Object>(3,
                        new Node<Object>(15,
                                new Node<Object>(18),
                                new Node<Object>(10)),
                        new Node<Object>(9)));

        ArrayList<Object> allFizzBuzzExpected = new ArrayList<>();
        allFizzBuzzExpected.add("Fizz");
        allFizzBuzzExpected.add("FizzBuzz");
        allFizzBuzzExpected.add("Buzz");
        allFizzBuzzExpected.add("Fizz");
        allFizzBuzzExpected.add("Fizz");

        assertEquals("All values should be changed according to fizz buzz",
                allFizzBuzzExpected, FizzBuzzTree.fizzBuzz(allFizzBuzz).inOrder());

    }

    @Test
    public void testFizzBuzz_someFizzBuzz() {
        /* test on tree with some matches and some not
                7
               / \
              5   12
             / \
            2   30
        */

        BinaryTree<Object> someFizzBuzz = new BinaryTree<>(
                new Node<Object>(7,
                        new Node<Object>(5,
                                new Node<Object>(2),
                                new Node<Object>(30)),
                        new Node<Object>(12)));

        ArrayList<Object> someFizzBuzzExpected = new ArrayList<>();
        someFizzBuzzExpected.add(2);
        someFizzBuzzExpected.add("Buzz");
        someFizzBuzzExpected.add("FizzBuzz");
        someFizzBuzzExpected.add(7);
        someFizzBuzzExpected.add("Fizz");

        assertEquals("All values should be changed according to fizz buzz, " +
                        "non fizz buzz values should be unchanged",
                someFizzBuzzExpected, FizzBuzzTree.fizzBuzz(someFizzBuzz).inOrder());
    }

    @Test
    public void testFizzBuzz_emptyTree() {
         /* test on empty tree
                null
        */

        BinaryTree<Object> emptyTree = new BinaryTree<>();
        ArrayList<Object> emptyTreeExpected = new ArrayList<>();

        assertEquals("an empty tree should not throw an error",
                emptyTreeExpected, FizzBuzzTree.fizzBuzz(emptyTree).inOrder());
    }

    @Test ( expected = ClassCastException.class )
    public void testFizzBuzz_stringyTree() {
         /* test on tree with strings or other type
                "twelve"
               /     \
              8      "five"
            /   \
         "cat"   25
        */

        BinaryTree<Object> stringTree = new BinaryTree<>(
                new Node<Object>("twelve",
                        new Node<Object>(8,
                                new Node<Object>("cat"),
                                new Node<Object>(25)),
                        new Node<Object>("five")));

        // non numbers should throw a class cast exception
        FizzBuzzTree.fizzBuzz(stringTree).inOrder();
    }


    @Test
    public void testFizzBuzz_treeWithZeros() {
         /*
                7
               / \
              0   3
             / \
            5   0
        */

        BinaryTree<Object> zeros = new BinaryTree<>(
                new Node<Object>(7,
                        new Node<Object>(0,
                                new Node<Object>(5),
                                new Node<Object>(0)),
                        new Node<Object>(3)));

        ArrayList<Object> zerosExpected = new ArrayList<>();
        zerosExpected.add("Buzz");
        zerosExpected.add("FizzBuzz");
        zerosExpected.add("FizzBuzz");
        zerosExpected.add(7);
        zerosExpected.add("Fizz");

        assertEquals("Zeros should count as a FizzBuzz",
                zerosExpected, FizzBuzzTree.fizzBuzz(zeros).inOrder());
    }

    @Test
    public void testFizzBuzz_treeWithNegNums() {
         /* test on tree with neg numbers
                -5
               /  \
             -30   -16
             / \
            2   3
        */

        BinaryTree<Object> negNums = new BinaryTree<>(
                new Node<Object>(-5,
                        new Node<Object>(-30,
                                new Node<Object>(2),
                                new Node<Object>(3)),
                        new Node<Object>(-16)));

        ArrayList<Object> negNumsExpected = new ArrayList<>();
        negNumsExpected.add(2);
        negNumsExpected.add("FizzBuzz");
        negNumsExpected.add("Fizz");
        negNumsExpected.add("Buzz");
        negNumsExpected.add(-16);

        assertEquals("Negative numbers should count as a FizzBuzz if applicable",
                negNumsExpected, FizzBuzzTree.fizzBuzz(negNums).inOrder());
    }
}