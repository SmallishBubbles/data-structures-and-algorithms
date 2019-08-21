package stacksandqueues.utilities;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter testShelter;
    Animal dog;
    Animal cat;
    Animal anotherDog;
    Animal anotherCat;

    @Before
    public void setTestShelter_and_animals() {
        testShelter = new AnimalShelter();
        dog = new Dog("Coda", "shepherd mix", "brown/black", "medium");
        cat = new Cat("Saide", "bengal", "spotted");
        anotherDog = new Dog("Wolf", "mix", "grey", "large");
        anotherCat = new Cat("Beef", "shorthair", "black");
    }

    @Test
    public void testEnqueue_and_dequeue() {
        testShelter.enqueue(dog);
        testShelter.enqueue(cat);
        testShelter.enqueue(anotherCat);
        testShelter.enqueue(anotherDog);

        assertEquals("The first cat in should be the first cat out",
                cat, testShelter.dequeue("cat"));
        assertEquals("The first dog in should be the first dog out",
                dog, testShelter.dequeue("dog"));
        assertEquals("null should be returned if pref is not cat or dog",
                null, testShelter.dequeue("rabbit"));
        assertEquals("The second dog in should be the second dog out",
                anotherDog, testShelter.dequeue("dog"));
        assertEquals("null should be returned if the pref animal type is not available",
               null, testShelter.dequeue("dog"));
        testShelter.enqueue(new Cat("Stormy", "sphynx", "pink"));
        assertEquals("The second cat in should be the second cat out",
                anotherCat, testShelter.dequeue("cat"));
        assertEquals("The last cat in should be the last cat out",
                "Stormy", testShelter.dequeue("Cat").getName());
        testShelter.enqueue(new Dog("Tramp", "Terrier", "grey", "smallish"));
    }

    @Test ( expected = IllegalArgumentException.class )
    public void testEnqueue_wrongAnimal(){
        testShelter.enqueue(new Animal() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getBreed() {
                return null;
            }

            @Override
            public String getColor() {
                return null;
            }

            @Override
            public String makeNoise() {
                return null;
            }
        });
    }
}