package hadurling.core.knn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class KdTreeTest {

    private static KdTree<String> street() {
        KdTree<String> tree = new KdTree<>(2, 100);
        tree.add(new double[] {0, 0}, "a");
        tree.add(new double[] {1, 0}, "b");
        tree.add(new double[] {5, 5}, "c");
        tree.add(new double[] {2, 2}, "d");
        return tree;
    }

    @Test
    @Tag("HL-9")
    @DisplayName("the nearest points come back nearest first")
    void nearestFirst() {
        List<KdTree.Entry<String>> found = street().nearest(new double[] {0.9, 0.1}, 2);
        assertEquals(2, found.size());
        assertEquals("b", found.get(0).value());
        assertEquals("a", found.get(1).value());
        assertEquals(0.02, found.get(0).distance(), 1e-12);
    }

    @Test
    @DisplayName("asking for more than the tree holds returns everything")
    void kBiggerThanSize() {
        assertEquals(4, street().nearest(new double[] {0, 0}, 50).size());
    }

    @Test
    @DisplayName("an empty tree, or k of 0, finds nothing")
    void nothingToFind() {
        assertTrue(new KdTree<String>(2, 10).nearest(new double[] {0, 0}, 3).isEmpty());
        assertTrue(street().nearest(new double[] {0, 0}, 0).isEmpty());
    }

    @Test
    @DisplayName("the tree is full at its capacity and add says so")
    void capacity() {
        KdTree<Integer> tree = new KdTree<>(1, 2);
        assertTrue(tree.add(new double[] {1}, 1));
        assertTrue(tree.add(new double[] {2}, 2));
        assertFalse(tree.add(new double[] {3}, 3));
        assertEquals(2, tree.size());
    }

    @Test
    @DisplayName("a point of the wrong size, or with NaN, is rejected")
    void badPoints() {
        KdTree<String> tree = new KdTree<>(2, 10);
        assertThrows(IllegalArgumentException.class, () -> tree.add(new double[] {1}, "x"));
        assertThrows(IllegalArgumentException.class, () -> tree.add(new double[] {1, Double.NaN}, "x"));
        assertThrows(IllegalArgumentException.class, () -> tree.nearest(new double[] {1, 2, 3}, 1));
    }

    @Test
    @DisplayName("the tree keeps its own copy of a point")
    void copiesPoints() {
        KdTree<String> tree = new KdTree<>(1, 10);
        double[] p = {1};
        tree.add(p, "x");
        p[0] = 100;
        assertEquals(0, tree.nearest(new double[] {1}, 1).get(0).distance(), 0);
    }
}
