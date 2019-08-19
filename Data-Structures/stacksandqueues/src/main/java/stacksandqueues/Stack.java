package stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T value) {
        Node<T> temp = new Node<>(value, this.top);
        this.top = temp;
    }

    public T pop() {
        if ( this.top == null ) {
            throw new NoSuchElementException("The stack is empty");
        } else {
            T temp = top.value;
            top = top.next;
            return temp;
        }
    }

    public T peek() {
        if ( this.top == null ) {
            throw new NoSuchElementException("The stack is empty");
        } else {
            return top.value;
        }
    }

    @Override
    public String toString() {
        return "Top -> " + (top == null ? "null" : top.toString());
    }
}
