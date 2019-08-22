package stacksandqueues.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidation_singleBrackets() {
        assertTrue("Should work on one set of brackets",
                MultiBracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void multiBracketValidation_bracketsInOrder() {
        assertTrue("Should work on many brackets",
                MultiBracketValidation.multiBracketValidation("{}(){}()[]"));
    }

    @Test
    public void multiBracketValidation_bracketsNotInOrder() {
        assertTrue("Should work on brackets out of order",
                MultiBracketValidation.multiBracketValidation("[{}[(){}]({})]"));
    }

    @Test
    public void multiBracketValidation_badBrackets() {
        assertFalse("Should fail on bad brackets",
                MultiBracketValidation.multiBracketValidation("{(})"));
    }

    @Test
    public void multiBracketValidation_empty() {
        assertTrue("Should work on no brackets",
                MultiBracketValidation.multiBracketValidation(""));
    }

    @Test
    public void multiBracketValidation_unevenBrackets() {
        assertFalse("Should fail on uneven numbers of brackets",
                MultiBracketValidation.multiBracketValidation("{{[]}"));
    }

    @Test
    public void multiBracketValidation_extraText() {
        assertTrue("Should work regardless of other characters",
                MultiBracketValidation.multiBracketValidation("[(this is irrelevent)[{so's this!} yep]]"));
    }

    @Test
    public void multiBracketValidation_singleBracket() {
        assertFalse("Should fail on single bracket",
                MultiBracketValidation.multiBracketValidation("("));
    }
}