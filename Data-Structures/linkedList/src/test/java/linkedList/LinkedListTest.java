package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert_strings() {
        // tests if insert works properly on a LinkedList of strings
        LinkedList<String> testStrings = new LinkedList<>();
        testStrings.insert("FirstItemIn");
        testStrings.insert("SecondItemIn");
        testStrings.insert("ThirdItemIn");
        testStrings.insert("FourthItemIn");
        testStrings.insert("LastItemIn");

        assertTrue("Insert should work on Strings", testStrings.toString().contains("LastItemIn"));
    }

    @Test
    public void testInsert_integers() {
        // tests if insert works properly on a LinkedList of integers
        LinkedList<Integer> testIntegers = new LinkedList<>();
        testIntegers.insert(5);
        testIntegers.insert(4);
        testIntegers.insert(3);
        testIntegers.insert(2);
        testIntegers.insert(1);
        
        assertTrue("Insert should work on Integers", testIntegers.toString().contains("1"));
    }

    @Test
    public void testIncludes_middle() {
        // tests if includes returns true for an item that is included in the middle of the list

        LinkedList<String> doesInclude = new LinkedList<>();
        doesInclude.insert("Fish");
        doesInclude.insert("Cat");
        doesInclude.insert("Emu");
        doesInclude.insert("Beaver");

        assertTrue("Includes should return true if the value is present",
                doesInclude.includes("Emu"));
    }

    @Test
    public void testIncludes_start() {
        // tests if includes returns true for an item that is included in the start of the list

        LinkedList<String> doesInclude = new LinkedList<>();
        doesInclude.insert("Fish");
        doesInclude.insert("Cat");
        doesInclude.insert("Emu");
        doesInclude.insert("Beaver");

        assertTrue("Includes should return true if the value is present at the head of the list",
                doesInclude.includes("Beaver"));
    }

    @Test
    public void testIncludes_end() {
        // tests if includes returns true for an item that is included in the end of the list

        LinkedList<String> doesInclude = new LinkedList<>();
        doesInclude.insert("Fish");
        doesInclude.insert("Cat");
        doesInclude.insert("Emu");
        doesInclude.insert("Beaver");

        assertTrue("Includes should return true if the value is present at the tail/end of the list",
                doesInclude.includes("Fish"));
    }


    @Test
    public void testIncludes_false() {
        // tests if includes returns false for an item not included in the list

        LinkedList<String> doesNotInclude = new LinkedList<>();
        doesNotInclude.insert("Fish");
        doesNotInclude.insert("Cat");
        doesNotInclude.insert("Emu");
        doesNotInclude.insert("Beaver");

        assertFalse("Includes should return false if the value is not present",
                doesNotInclude.includes("Bumblebee"));
    }

    @Test
    public void testToString_empty() {
        // tests whether an empty linked list can be created and that the toString method works regardless

        LinkedList<String> emptyLinkedList = new LinkedList<>();
        assertNotNull("Should return a message", emptyLinkedList.toString());
    }

    @Test
    public void testToString_severalItems() {
        // tests whether the entire list is printed when toString is called

        LinkedList<String> printMe = new LinkedList<>();
        printMe.insert("Fish");
        printMe.insert("Cat");
        printMe.insert("Emu");
        printMe.insert("Beaver");

        assertTrue("The toString method should include all items in order",
                printMe.toString().equals("List: Beaver, Emu, Cat, Fish"));
    }

}