package hadurling.core.knn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.Combinators;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import net.jqwik.api.Tag;

/**
 * The model-based property: a fast structure must agree with a slow one that is obviously
 * right. The slow one here is "measure every point and sort". If the tree ever skips a
 * branch it should not have, jqwik finds a set of points where the two disagree and shrinks
 * it to a small one.
 *
 * <p>Ties make "the same neighbours" ambiguous (two points at the same distance may come
 * back in either order), so the property compares the <em>distances</em> of the k nearest.
 * They are unique even when the points are not.</p>
 */
@Tag("HL-9")
class KdTreeProperties {

    /** A whole-number grid makes ties likely, which is where bugs hide. */
    @Provide
    Arbitrary<double[]> points() {
        return Arbitraries.integers().between(-5, 5).list().ofSize(3)
            .map(l -> new double[] {l.get(0), l.get(1), l.get(2)});
    }

    @Provide
    Arbitrary<List<double[]>> clouds() {
        return points().list().ofMaxSize(150);
    }

    @Provide
    Arbitrary<double[]> looseQueries() {
        return Combinators.combine(Arbitraries.doubles().between(-6, 6),
                Arbitraries.doubles().between(-6, 6), Arbitraries.doubles().between(-6, 6))
            .as((a, b, c) -> new double[] {a, b, c});
    }

    @Property
    void treeAgreesWithBruteForce(@ForAll("clouds") List<double[]> cloud,
            @ForAll("looseQueries") double[] query, @ForAll("kValues") int k) {
        KdTree<Integer> tree = new KdTree<>(3, 1000);
        for (int i = 0; i < cloud.size(); i++) tree.add(cloud.get(i), i);

        List<Double> expected = new ArrayList<>();
        for (double[] p : cloud) expected.add(KdTree.squaredDistance(p, query));
        Collections.sort(expected);
        expected = expected.subList(0, Math.min(k, expected.size()));

        List<Double> actual = new ArrayList<>();
        for (KdTree.Entry<Integer> e : tree.nearest(query, k)) actual.add(e.distance());

        assertEquals(expected, actual);
    }

    @Property
    void everyResultIsAStoredPointWithItsOwnDistance(@ForAll("clouds") List<double[]> cloud,
            @ForAll("looseQueries") double[] query) {
        KdTree<Integer> tree = new KdTree<>(3, 1000);
        for (int i = 0; i < cloud.size(); i++) tree.add(cloud.get(i), i);
        for (KdTree.Entry<Integer> e : tree.nearest(query, 5)) {
            double[] stored = cloud.get(e.value());
            assertEquals(KdTree.squaredDistance(stored, query), e.distance(), 0.0);
            assertEquals(KdTree.squaredDistance(stored, e.point()), 0.0, 0.0);
        }
    }

    @Provide
    Arbitrary<Integer> kValues() {
        return Arbitraries.integers().between(0, 12);
    }
}
