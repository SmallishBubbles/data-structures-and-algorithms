package linkedList;

public class Node<T> {
    T val;
    Node next = null;

    public Node(T val, Node next){
        this.val = val;
        this.next = next;
    }
}
