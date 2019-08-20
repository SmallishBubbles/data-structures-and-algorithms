package stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
    private Stack<T> stack_startFirst;
    private Stack<T> stack_endFirst;

    public PseudoQueue() {
        this.stack_startFirst = new Stack<>();
        this.stack_endFirst = new Stack<>();
    }

    public void enqueue(T value) {
        this.stack_endFirst.push(value);
    }

    public T dequeue() {
        try {
            // try to return the first thing from the startFirst stack
            return this.stack_startFirst.pop();

        } catch ( NoSuchElementException e ) {
            // there was nothing in the startFirst stack

            try {
                // until we get an error
                // one at a time, take things out of the endFirst stack and add them to the startFirst stack
                while (this.stack_endFirst.peek() != NoSuchElementException.class) {
                    this.stack_startFirst.push(this.stack_endFirst.pop());
                }

            } catch ( NoSuchElementException err ) {
                // when we're out of things
                // it's okay, just break out of the try/catch
            }

            // return the first thing from the startFirst stack
            // if this throws an error, that's okay, there was nothing in the queue
            return this.stack_startFirst.pop();
        }
    }
}
