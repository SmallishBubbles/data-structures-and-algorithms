package tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public BinaryTree() {
        this(null);
    }


    // these traversal implementations are based on the JavaScript examples mentioned in the
    // Frontend Masters "4 semesters of Computer Science in 5 hours" course
    // By Brian Holt

    public ArrayList<T> preOrder() {
        return preOrderHelper(this.root, new ArrayList<>());
    }

    private ArrayList<T> preOrderHelper(Node<T> root, ArrayList<T> array) {
        // self, left, right
        if ( root == null ) {
            return array;
        } else {
            // add myself
            array.add(root.value);
            // call on left
            array = preOrderHelper(root.left, array);
            // call on right
            array = preOrderHelper(root.right, array);
        }
        return array;
    }



    public ArrayList<T> inOrder() {
        // left, self, right
        return inOrderHelper(this.root, new ArrayList<>());
    }

    private ArrayList<T> inOrderHelper(Node<T> root, ArrayList<T> array) {
        // left, self, right
        if ( root == null ) {
            return array;
        } else {
            // call on left
            array = inOrderHelper(root.left, array);
            // add myself
            array.add(root.value);
            // call on right
            array = inOrderHelper(root.right, array);
        }
        return array;
    }



    public ArrayList<T> postOrder() {
        // left, right, self
        return postOrderHelper(this.root, new ArrayList<>());
    }

    private ArrayList<T> postOrderHelper(Node<T> root, ArrayList<T> array) {
        // left, right, self
        if ( root == null ) {
            return array;
        } else {
            // call on left
            array = postOrderHelper(root.left, array);
            // call on right
            array = postOrderHelper(root.right, array);
            // add myself
            array.add(root.value);
        }
        return array;
    }


    public String toString() {
        return "A binary tree with values in order of: " + this.inOrder();
    }
}
