package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
    Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public BinaryTree() {
        this(null);
    }


    public Node<T> getRoot() {
        return this.root;
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

    public Integer findMaximumValue(){
        if ( this.root == null ) {
            return null;
        } else {
            return findMaximumValueHelper(this.root, (Integer)this.root.value);
        }
    }

    private Integer findMaximumValueHelper(Node<T> node, Integer maxSoFar) {
        if ( node != null ) {
            if ( (Integer)node.value > maxSoFar ) {
                maxSoFar = (Integer)node.value;
            }
            maxSoFar = findMaximumValueHelper(node.left, maxSoFar);
            maxSoFar = findMaximumValueHelper(node.right, maxSoFar);
        }
        return maxSoFar;
    }



    public static ArrayList breadthFirst(BinaryTree tree) {
        ArrayList arrayList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if ( tree.root != null ) {
            queue.add(tree.root);

            while ( queue.peek() != null ) {
                Node currentNode = queue.remove();
                System.out.println(currentNode.value);
                arrayList.add(currentNode.value);

                if ( currentNode.left != null ) {
                    queue.add(currentNode.left);
                }
                if ( currentNode.right != null ) {
                    queue.add(currentNode.right);
                }
            }
        }

        return arrayList;
    }


    public String toString() {
        return "A binary tree with values in order of: " + this.inOrder();
    }
}
