package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {
    Stack<String> exampleStack;
    Stack<Integer> emptyStack = new Stack<>();

    @Before
    public void setUpExampleStack(){
        exampleStack = new Stack<>();
        exampleStack.push("un");
        exampleStack.push("deux");
        exampleStack.push("trois");
    }

    @Test
    public void push_one() {
        Stack<String> newStack = new Stack<>();
        newStack.push("new1");

        assertEquals("The new stack should contain a node with the value pushed",
                "new1", newStack.top.value);
    }

    @Test
    public void push_many() {
        exampleStack.push("this");
        exampleStack.push("will");
        exampleStack.push("test");
        exampleStack.push("adding");
        exampleStack.push("multiple");
        exampleStack.push("values");

        assertEquals("The stack should contain all of the values added",
                "Top -> values -> multiple -> adding -> test -> will -> this -> trois -> deux -> un -> null",
                exampleStack.toString());
    }

    @Test
    public void pop_fromListOfSeveralValues() {
        assertEquals("The value of the top node should be returned",
                "trois", exampleStack.pop());
        assertEquals("The top value should be removed during a pop",
                "deux", exampleStack.top.value);
    }

    @Test
    public void pop_untilStackIsEmpty() {
        exampleStack.pop();
        exampleStack.pop();
        exampleStack.pop();
        assertEquals("The stack should contain null once empty",
                null, exampleStack.top);
    }

    @Test (expected = NoSuchElementException.class)
    public void pop_onEmptyStack() {
        // An error should be thrown if pop is called on an empty stack
        emptyStack.pop();
    }


    @Test
    public void peek_stackWithValues() {
        assertEquals("The value of the top node should be returned",
                "trois", exampleStack.peek());
        assertEquals("The top node should not be removed from the stack",
                "trois", exampleStack.top.value);
    }

    @Test (expected = NoSuchElementException.class)
    public void peek_emptyStack() {
        // An error should be thrown if peek is called on an empty stack
        emptyStack.peek();

    }

    @Test
    public void toString_withNodes() {
        assertEquals("toString should work on a stack with nodes",
                "Top -> trois -> deux -> un -> null", exampleStack.toString());
    }

    @Test
    public void toString_emptyStack() {
        assertEquals("toString should work on and empty stack",
                "Top -> null", emptyStack.toString());
    }
}