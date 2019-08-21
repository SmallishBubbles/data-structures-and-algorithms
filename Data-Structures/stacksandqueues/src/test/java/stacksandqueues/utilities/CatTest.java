package stacksandqueues.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat testCat;

    @Before
    public void setTestCat() {
        testCat = new Cat("Sadie", "Bengal", "spotted");
    }

    @Test
    public void testMakeNoise() {
        assertEquals("A cat should say meow",
                "meow", testCat.makeNoise());
    }

    @Test
    public void testToString() {
        assertEquals("A cat instance should print to string nicely",
                "Sadie, a spotted Bengal cat", testCat.toString());
    }
}