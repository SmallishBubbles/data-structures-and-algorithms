package hashtable.TreeIntersection;

import Tree.BinaryTree;
import Tree.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    BinaryTree<String> exampleTree1;
    BinaryTree<String> exampleTree2;

    @Before
    public void setExampleTrees() {
        exampleTree1 = new BinaryTree<>(
                new Node<String>("one hundred fifty",
                        new Node<String>("one hundred",
                                new Node<String>("seventy five"),
                                new Node<String>("one hundred sixty",
                                        new Node<String>("one hundred twenty five"),
                                        new Node<String>("one hundred seventy five")
                                )
                        ),
                        new Node<String>("two hundred fifty",
                                new Node<String>("two hundred"),
                                new Node<String>("three hundred fifty",
                                        new Node<String>("three hundred"),
                                        new Node<String>("five hundred")
                                )
                        )
                ));

        exampleTree2 = new BinaryTree<>(
                new Node<String>("fourty two",
                        new Node<String>("one hundred",
                                new Node<String>("fifteen"),
                                new Node<String>("one hundred sixty",
                                        new Node<String>("one hundred twenty five"),
                                        new Node<String>("one hundred seventy five")
                                )
                        ),
                        new Node<String>("six hundred",
                                new Node<String>("two hundred"),
                                new Node<String>("three hundred fifty",
                                        new Node<String>("four"),
                                        new Node<String>("five hundred")
                                )
                        )
                ));

    }

    @Test
    public void findIntersections() {
        assertEquals("All duplicates should be returned",
                "[one hundred, one hundred twenty five, one hundred sixty, one hundred seventy five, two hundred, three hundred fifty, five hundred]",
                TreeIntersection.findIntersections(exampleTree1, exampleTree2).toString());

    }

    @Test
    public void findIntersections_empty() {
        BinaryTree<String> empty1 = new BinaryTree<>();
        BinaryTree<String> empty2 = new BinaryTree<>();

        assertEquals("an empty arraylist should be returned",
                new ArrayList<String>(),
                TreeIntersection.findIntersections(empty1, empty2));

    }

    @Test
    public void findIntersections_noDuplicates() {
        BinaryTree<String> noDupes1 = new BinaryTree<>(
                new Node<String>("cat",
                        new Node<String>("cat",
                                new Node<String>("cat"),
                                new Node<String>("cat",
                                        new Node<String>("cat"),
                                        new Node<String>("cat")
                                )
                        ),
                        new Node<String>("cat",
                                new Node<String>("cat"),
                                new Node<String>("cat",
                                        new Node<String>("cat"),
                                        new Node<String>("cat")
                                )
                        )
                )
        );
        BinaryTree<String> noDupes2 = new BinaryTree<>(
                new Node<String>("dog",
                        new Node<String>("dog",
                                new Node<String>("dog"),
                                new Node<String>("dog",
                                        new Node<String>("dog"),
                                        new Node<String>("dog")
                                )
                        ),
                        new Node<String>("dog",
                                new Node<String>("dog"),
                                new Node<String>("dog",
                                        new Node<String>("dog"),
                                        new Node<String>("dog")
                                )
                        )
                )
        );

        assertEquals("an empty arraylist should be returned if there are no duplicates",
                new ArrayList<String>(),
                TreeIntersection.findIntersections(noDupes1, noDupes2));

    }
}