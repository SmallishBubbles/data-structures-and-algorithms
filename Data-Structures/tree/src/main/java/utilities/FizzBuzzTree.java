package utilities;

import tree.BinaryTree;
import tree.Node;

public class FizzBuzzTree {
    public static BinaryTree<Object> fizzBuzz(BinaryTree<Object> tree) {
        fizzBuzzHelper(tree.getRoot());
        return tree;
    }

    private static void fizzBuzzHelper(Node<Object> currentNode) {
        if ( currentNode == null ) {
            return;
        } else {
            // check value
            if ( ((int)currentNode.getValue() % 3) == 0 && ((int)currentNode.getValue() % 5) == 0 ) {
                currentNode.setValue("FizzBuzz");
            } else if ( ((int)currentNode.getValue() % 3) == 0 ) {
                currentNode.setValue("Fizz");
            } else if ( ((int)currentNode.getValue() % 5) == 0 ) {
                currentNode.setValue("Buzz");
            }

            fizzBuzzHelper(currentNode.getLeft());
            fizzBuzzHelper(currentNode.getRight());
        }
    }
}
