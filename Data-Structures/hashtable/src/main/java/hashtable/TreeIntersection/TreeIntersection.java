package hashtable.TreeIntersection;

import Tree.BinaryTree;
import com.sun.org.apache.xpath.internal.operations.Bool;
import hashtable.HashTable;

import java.util.ArrayList;

public class TreeIntersection {
    /*
    Write a function called tree_intersection that takes two binary tree parameters.
    Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.
     */

    public static ArrayList<String> findIntersections(BinaryTree<String> treeOne, BinaryTree<String> treeTwo) {

        HashTable<String, Boolean> hashTable = new HashTable<>(100);

        // traverse/flatten the trees
        ArrayList<String> treeOneFlattened = treeOne.inOrder();
        ArrayList<String> treeTwoFlattened = treeTwo.inOrder();

        ArrayList<String> allDuplicates = new ArrayList<>();


        for ( String key : treeOneFlattened ) {
            // add values to a hash table
            hashTable.add(key, false);
        }

        // traverse the second tree
        for ( String key : treeTwoFlattened ) {
            // add/update values in the hash table
            if ( hashTable.contains(key) ) {
                hashTable.add(key, true);
                // add them to an arraylist of answers
                allDuplicates.add(key);
            }
        }

        // return that arraylist
        return allDuplicates;
    }
}
