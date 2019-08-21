package stacksandqueues.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog testDog_medium;
    Dog testDog_small;
    Dog testDog_large;
    Dog testDog_notStandardSize;

    @Before
    public void setTestDogs() {
        testDog_small = new Dog("Lady", "teacup poodle", "brown", "small");
        testDog_medium = new Dog("Coda", "shepherd mix", "brown/black", "medium");
        testDog_large = new Dog("Louis", "great dane", "grey", "large");
        testDog_notStandardSize = new Dog("Lucy", "unknown", "gold", "small/medium");
    }

    @Test
    public void makeNoise() {
        assertEquals("A small dog should yip",
                "yip", testDog_small.makeNoise());
        assertEquals("A medium dog should arf",
                "arf", testDog_medium.makeNoise());
        assertEquals("A large dog should woof",
                "woof", testDog_large.makeNoise());
        assertEquals("Any other dog should bark",
                "bark", testDog_notStandardSize.makeNoise());
    }

    @Test
    public void toString1() {
        assertEquals("A medium dog should print to string nicely",
                "Coda, a medium brown/black shepherd mix dog", testDog_medium.toString());
        assertEquals("A dog of another size should print to string nicely",
                "Lucy, a small/medium gold unknown dog", testDog_notStandardSize.toString());
    }
}