package hadur117.core.knn;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import hadur117.core.model.Timestamped;
import hadur117.core.model.Wave;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * TIME-9: {@link KnnView#getDecayWeights} gives an array beside the neighbour list instead of
 * a map, and must give every neighbour exactly the weight the map gave it.
 */
public class DecayWeightsTest {

    static final class Stamp extends Timestamped {
        Stamp(int round, long time) {
            super(round, time);
        }
    }

    static KnnView<Stamp> view(double decayRate) {
        DistanceFormula formula = new DistanceFormula() {
            { weights = new double[] {1}; }

            @Override
            public double[] dataPointFromWave(Wave w, boolean aiming) {
                return new double[] {0};
            }
        };
        return new KnnView<Stamp>(formula).setDecayRate(decayRate);
    }

    /** The map the robot used before TIME-9, written out as it was. */
    static Map<Timestamped, Double> mapWeights(List<KdTree.Entry<Stamp>> entries, double decayRate) {
        Map<Timestamped, Double> out = new IdentityHashMap<>();
        int n = entries.size();
        if (decayRate == KnnView.NO_DECAY) {
            for (KdTree.Entry<Stamp> e : entries) out.put(e.value, 1.0);
            return out;
        }
        Timestamped[] sorted = new Timestamped[n];
        for (int i = 0; i < n; i++) sorted[i] = entries.get(i).value;
        Arrays.sort(sorted);
        double w = 1.0;
        for (int i = n - 1; i >= 0; i--) {
            out.put(sorted[i], w);
            w /= decayRate;
        }
        return out;
    }

    @Test
    @Tag("TIME-9")
    @DisplayName("TIME-9: decay weights match the old map bit for bit, ties and repeats included")
    void matchesTheMap() {
        Random r = new Random(9);
        for (double rate : new double[] {KnnView.NO_DECAY, 1.0, 1.003, 1.5}) {
            for (int trial = 0; trial < 200; trial++) {
                List<Stamp> pool = new ArrayList<>();
                for (int i = 0; i < 1 + r.nextInt(30); i++) pool.add(new Stamp(r.nextInt(3), r.nextInt(5)));
                List<KdTree.Entry<Stamp>> entries = new ArrayList<>();
                // Draw with replacement, so the same value can come back as two neighbours.
                for (int i = 0; i < 1 + r.nextInt(40); i++) {
                    entries.add(new KdTree.Entry<>(r.nextDouble(), pool.get(r.nextInt(pool.size()))));
                }
                Map<Timestamped, Double> want = mapWeights(entries, rate);
                double[] got = view(rate).getDecayWeights(entries);
                double[] expected = new double[entries.size()];
                for (int i = 0; i < expected.length; i++) expected[i] = want.get(entries.get(i).value);
                assertArrayEquals(expected, got, 0.0);
            }
        }
    }

    @Test
    @Tag("TIME-9")
    @DisplayName("TIME-9: the same list weighed again reuses its weights; a new rate weighs again")
    void reusesTheLastTwoLists() {
        KnnView<Stamp> view = view(1.5);
        List<KdTree.Entry<Stamp>> a = List.of(new KdTree.Entry<>(0, new Stamp(0, 1)), new KdTree.Entry<>(0, new Stamp(0, 2)));
        List<KdTree.Entry<Stamp>> b = List.of(new KdTree.Entry<>(0, new Stamp(1, 1)));
        double[] wa = view.getDecayWeights(a);
        double[] wb = view.getDecayWeights(b);
        assertSame(wa, view.getDecayWeights(a));
        assertSame(wb, view.getDecayWeights(b));
        view.setDecayRate(2.0);
        assertArrayEquals(new double[] {0.5, 1.0}, view.getDecayWeights(a), 0.0);
    }
}
