package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    Node<T> front;
    Node<T> back;

    public Queue(){
        this.front = null;
        this.back = null;
    }

    public void enqueue(T value) {
        Node<T> temp = new Node<>(value);

        if ( this.front == null ) {
            this.front = temp;
            this.back = temp;
        } else {
            this.back.next = temp;
            this.back = temp;
        }
    }

    public T dequeue() {
        if ( this.front == null ) {
            throw new NoSuchElementException("The queue is empty");
        } else {
            T temp = front.value;
            this.front = this.front.next;

            if ( this.front == null ) {
                this.back = null;
            }

            return temp;
        }
    }

    public T peek() {
        if ( this.front == null ) {
            throw new NoSuchElementException("The queue is empty");
        } else {
            return this.front.value;
        }
    }

    @Override
    public String toString() {
        return "Front -> " + (front == null ? "null" : front.toString()) + "\n"
                + "Back -> " + (back == null ? "null" : back.toString());
    }
}
