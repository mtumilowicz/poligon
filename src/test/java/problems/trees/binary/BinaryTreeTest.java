package problems.trees.binary;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-05-22.
 */
public class BinaryTreeTest {

    /**
     *              A
     *             /   \
     *            B     C
     *          /      /
     *         D      E
     *          \    /\
     *           F  G H   
     *          /
     *         I
     */
    @Test
    public void toList() {
        BinaryTree I = new BinaryTree("I", null, null);
        BinaryTree H = new BinaryTree("H", null, null);
        BinaryTree G = new BinaryTree("G", null, null);
        BinaryTree F = new BinaryTree("F", I, null);
        BinaryTree E = new BinaryTree("E", G, H);
        BinaryTree D = new BinaryTree("D", null, F);
        BinaryTree C = new BinaryTree("C", E, null);
        BinaryTree B = new BinaryTree("B", D, null);
        BinaryTree A = new BinaryTree("A", B, C);

        assertEquals(new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I")), A.toList());
    }
}