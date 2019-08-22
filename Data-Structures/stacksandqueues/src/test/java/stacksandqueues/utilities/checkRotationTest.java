package stacksandqueues.utilities;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class checkRotationTest {
    Queue<Integer> firstQ;
    Queue<Integer> match;
    Queue<Integer> misMatch;
    Queue<String> empty1;
    Queue<String> empty2;
    Queue<String> anotherQ;
    Queue<Integer> difLength;

    @Before
    public void setQueues() {
        firstQ = new LinkedList<>();
        match = new LinkedList<>();
        misMatch = new LinkedList<>();
        empty1 = new LinkedList<>();
        empty2 = new LinkedList<>();
        anotherQ = new LinkedList<>();
        difLength = new LinkedList<>();
        firstQ.add(1);
        firstQ.add(4);
        firstQ.add(4);
        firstQ.add(2);
        firstQ.add(3);
        match.add(4);
        match.add(2);
        match.add(3);
        match.add(1);
        match.add(4);
        misMatch.add(4);
        misMatch.add(4);
        misMatch.add(2);
        misMatch.add(4);
        misMatch.add(1);
        anotherQ.add("Something");
        difLength.add(4);
        difLength.add(1);
    }



    @Test
    public void checkRotation_match() {
        assertTrue("Two rotation queues should return true",
                checkRotation.checkRotation(firstQ, match));
    }

    @Test
    public void checkRotation_misMatch() {
        assertFalse("Different queues should return false",
                checkRotation.checkRotation(firstQ, misMatch));
    }

    @Test
    public void checkRotation_empty() {
        assertTrue("two empty queueus should return true",
                checkRotation.checkRotation(empty1, empty2));
    }

    @Test
    public void checkRotation_diffLengths() {
        assertFalse("two different length queues should return false",
                checkRotation.checkRotation(firstQ, difLength));
    }

    @Test
    public void checkRotation_diffLengthsOneEmpty() {
        assertFalse("two different length queues should return false",
                checkRotation.checkRotation(empty1, anotherQ));
    }
}