package stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    public boolean dequeue_catchNoSuchElementException(PseudoQueue queue) {
        try {
            queue.dequeue();
        } catch ( NoSuchElementException e ) {
            return true;
        }
        return false;
    }

    @Test
    public void enqueue_thenDequeue() {
        PseudoQueue<String> testQueue = new PseudoQueue<>();
        testQueue.enqueue("one");
        testQueue.enqueue("two");
        testQueue.enqueue("three");
        assertEquals("the first item out should be the first item in",
                "one", testQueue.dequeue());
        assertEquals("the second item out should be the second item in",
                "two", testQueue.dequeue());
        assertEquals("the last item in should be the last item out",
                "three", testQueue.dequeue());
    }

    @Test
    public void enqueue_mixedWithDequeue() {
        PseudoQueue<String> testMe = new PseudoQueue<>();
        testMe.enqueue("first in");
        assertEquals("first in", testMe.dequeue());
        testMe.enqueue("new first");
        testMe.enqueue("second");
        assertEquals("new first", testMe.dequeue());
        testMe.enqueue("third");
        assertEquals("second", testMe.dequeue());
        assertEquals("third", testMe.dequeue());
        assertTrue("There should be nothing else in the queue",
            dequeue_catchNoSuchElementException(testMe));
        testMe.enqueue("now I'm first");
        assertEquals("now I'm first", testMe.dequeue());
    }

    @Test (expected = NoSuchElementException.class)
    public void dequeue_empty(){
        PseudoQueue<Integer> emptyQueue = new PseudoQueue<>();
        // if the queue has nothing in it, we should expect a NoSuchElement exception on dequeue
        emptyQueue.enqueue(1);
        emptyQueue.dequeue();
        emptyQueue.dequeue();
    }
}