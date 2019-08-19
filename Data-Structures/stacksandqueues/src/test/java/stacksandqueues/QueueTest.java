package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {
    Queue<Integer> exampleQueue;
    Queue<String> emptyQueue = new Queue<>();

    @Before
    public void setUpQueue(){
        exampleQueue = new Queue<>();
        exampleQueue.enqueue(1);
        exampleQueue.enqueue(2);
        exampleQueue.enqueue(3);
    }

    @Test
    public void enqueue_one() {
        emptyQueue.enqueue("new");
        assertEquals("The new front should point at the added value",
                "new", emptyQueue.front.value);
        assertEquals("The new back should point at the added value",
                "new", emptyQueue.back.value);
    }

    @Test
    public void enqueue_several() {
        exampleQueue.enqueue(4);
        exampleQueue.enqueue(5);
        exampleQueue.enqueue(6);
        exampleQueue.enqueue(7);
        assertTrue("The front should still point at the first value added",
                1 == exampleQueue.front.value);
        assertTrue("The new back should point at the last added value",
                7 == exampleQueue.back.value);
    }

    @Test
    public void dequeue_one() {
        assertTrue("The returned value should be the first value added",
                1 == exampleQueue.dequeue());
        assertTrue("The first item should be removed from the queue",
                2 == exampleQueue.front.value);
    }

    @Test
    public void dequeue_untilEmpty() {
        exampleQueue.dequeue();
        exampleQueue.dequeue();
        exampleQueue.dequeue();
        assertEquals("The queue should be emptied and the front should point at null",
                null, exampleQueue.front);
        assertEquals("The queue should be emptied and the back should point at null",
                null, exampleQueue.back);
    }

    @Test (expected = NoSuchElementException.class)
    public void dequeue_onEmpty() {
        // calling dequeue on an empty queue should throw a no such element exception
        emptyQueue.dequeue();
    }


    @Test
    public void peek_queueWithValues() {
        assertTrue("Peek should return the value of the first element",
                1 == exampleQueue.peek());
        assertTrue("Peek should not remove the value from the queue",
                1 == exampleQueue.front.value);
    }

    @Test (expected = NoSuchElementException.class)
    public void peek_emptyQueue() {
        // calling peek on an empty queue should throw a no such element exception
        emptyQueue.peek();
    }

    @Test
    public void toString_empty() {
        assertEquals("An emty queue should print to string with null pointers",
                "Front -> null\nBack -> null", emptyQueue.toString());
    }

    @Test
    public void toString_withValues() {
        assertEquals("The queue should print in the correct order",
                "Front -> 1 -> 2 -> 3 -> null\nBack -> 3 -> null", exampleQueue.toString());

    }
}