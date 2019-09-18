package hashtable.LeftJoin;

import hashtable.HashTable;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class LeftJoinTest {

    HashTable<String, String> synonymTable;
    HashTable<String, String> antonymTable;

    @Before
    public void setTables() {
        synonymTable = new HashTable<>(20);
        synonymTable.add("fond", "enamored");
        synonymTable.add("wrath", "anger");
        synonymTable.add("diligent", "employed");
        synonymTable.add("outfit", "garb");
        synonymTable.add("guide", "usher");

        antonymTable = new HashTable<>(20);
        antonymTable.add("fond", "averse");
        antonymTable.add("wrath", "delight");
        antonymTable.add("diligent", "idle");
        antonymTable.add("guide", "follow");
        antonymTable.add("flow", "jam");
    }

    @Test
    public void testLeftJoin_full() {
        assertArrayEquals("The new nested string array should contain an accurate join",
                new String[][]{
                        {"wrath", "anger", "delight"},
                        {"diligent", "employed", "idle"},
                        {"outfit", "garb", null},
                        {"guide", "usher", "follow"},
                        {"fond", "enamored", "averse"}
                },
                LeftJoin.leftJoin(synonymTable, antonymTable));
    }

    @Test
    public void testLeftJoin_empty() {
        assertArrayEquals("The method should not fail on empty hash tables",
                new String[][]{}, LeftJoin.leftJoin(new HashTable<>(5), new HashTable<>(5)));
    }

    @Test
    public void testLeftJoin_noJoins() {
        String[][] result = LeftJoin.leftJoin(synonymTable, new HashTable<>(5));
        for ( int i = 0; i < result.length; i++ ) {
            assertNull("the third item should be null", result[i][2]);
        }
    }

}