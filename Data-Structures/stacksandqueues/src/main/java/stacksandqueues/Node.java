package stacksandqueues;

public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }

    public Node(T value){
        this(value, null);
    }

    @Override
    public String toString(){
        return String.format(value + " -> " + (this.next == null ? "null" : this.next.toString()));
    }
}
