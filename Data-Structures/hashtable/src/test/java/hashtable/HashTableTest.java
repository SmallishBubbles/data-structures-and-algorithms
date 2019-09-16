package hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class HashTableTest {
    /*
    Write tests to prove the following functionality:
        -[x] Adding a key/value to your hashtable results in the value being in the data structure
        -[x] Retrieving based on a key returns the value stored
        -[x] Successfully returns null for a key that does not exist in the hashtable
            I decided to throw an error here instead of returning null. This will clarify between a
            key/value pair with the value of null, and an actual miss
        -[x] Successfully handle a collision within the hashtable
        -[x] Successfully retrieve a value from a bucket within the hashtable that has a collision
            Buckets never have more than one value, this implementation doubles hash table size instead
        -[x] Successfully hash a key to an in-range value
     */
    HashTable<String, String> exampleHashTable;

    @Before
    public void setExampleHashTable(){
        exampleHashTable = new HashTable<>(5);
    }

    @Test
    public void test_add_and_get() {
        exampleHashTable.add("first value", "1");
        exampleHashTable.add("second value", "2");
        assertEquals("the value of a node should be returned on get", "1", exampleHashTable.get("first value"));
        assertEquals("the value of a node should be returned on get", "2", exampleHashTable.get("second value"));
    }

    @Test (expected = NoSuchElementException.class)
    public void test_get_not_contained() {
        exampleHashTable.add("first value", "1");
        exampleHashTable.add("second value", "2");
        // an exception should be thrown if get is called with a key not in the hash table
        exampleHashTable.get("free cake");
    }

    @Test
    public void test_collision() {
        // example hash table starts with a size of 5
        exampleHashTable.add("first value", "1");
        exampleHashTable.add("second value", "2");
        exampleHashTable.add("third value", "3");
        exampleHashTable.add("fourth value", "4");
        exampleHashTable.add("fifth value", "5");
        exampleHashTable.add("sixth value", "6");
        exampleHashTable.add("seventh value", "7");

        assertTrue("The size of the hash table should now be larger than 5", exampleHashTable.map.length > 5);
        assertEquals("The seventh value should be retrievable", "7", exampleHashTable.get("seventh value"));
    }

    @Test
    public void test_contains() {
        exampleHashTable.add("first value", "1");
        exampleHashTable.add("second value", "2");
        exampleHashTable.add("third value", "3");
        exampleHashTable.add("fourth value", "4");
        exampleHashTable.add("fifth value", "5");
        exampleHashTable.add("sixth value", "6");
        exampleHashTable.add("seventh value", "7");

        assertTrue("A key in the table should return true", exampleHashTable.contains("sixth value"));
        assertFalse("A key not in the table should return false", exampleHashTable.contains("free cake"));
    }
}