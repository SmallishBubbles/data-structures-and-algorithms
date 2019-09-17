package Tree;

public class BinarySearchTree extends BinaryTree<Integer> {

    public BinarySearchTree(Node<Integer> root) {
        super(root);
    }

    public BinarySearchTree() {
        super();
    }

    public void add(Integer value) {
        Node<Integer> newNode = new Node<>(value);

        if ( this.root == null ) {
            this.root = newNode;
        } else {
            addHelper(this.root, newNode);
        }
    }

    private void addHelper(Node<Integer> currentNode, Node<Integer> newNode) {
        // this will not add duplicate values
        if ( currentNode.value > newNode.value ) {
            // go left
            if ( currentNode.left == null ) {
                currentNode.left = newNode;
            } else {
                addHelper(currentNode.left, newNode);
            }
        } else if ( currentNode.value < newNode.value ) {
            // go right
            if ( currentNode.right == null ) {
                currentNode.right = newNode;
            } else {
                addHelper(currentNode.right, newNode);
            }
        }
    }

    // contains
        // in : value
        // out : boolean
    public boolean contains(Integer value) {
       return containsHelper(this.root, value);
    }

    private boolean containsHelper(Node<Integer> currentNode, Integer value) {

        if ( currentNode == null ) {
            return false;
        } else if ( currentNode.value.equals(value) ) {
            return true;
        } else if ( currentNode.value > value ) {
            // go left
            return containsHelper(currentNode.left, value);
        } else if ( currentNode.value < value ) {
            // go right
            return containsHelper(currentNode.right, value);
        }
        return false;
    }
}
