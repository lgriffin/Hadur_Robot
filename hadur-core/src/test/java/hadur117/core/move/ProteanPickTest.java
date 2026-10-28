package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-14: the protean pick and its replaying die. */
class ProteanPickTest {

    static ProteanPick seeded() {
        ProteanPick p = new ProteanPick();
        p.seed("sample.Enemy 1.0", 7);
        return p;
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("the die's draws lie in [0, 1] and replay exactly from the same seed")
    void drawsInRangeAndReplay() {
        ProteanPick a = seeded();
        ProteanPick b = seeded();
        for (int i = 0; i < 5000; i++) {
            double u = a.next();
            assertTrue(u >= 0 && u <= 1, "draw " + i + " = " + u);
            assertEquals(u, b.next(), 0.0, "draw " + i);
        }
        ProteanPick other = new ProteanPick();
        other.seed("sample.Enemy 1.0", 8);
        ProteanPick again = seeded();
        boolean differs = false;
        for (int i = 0; i < 20; i++) differs |= again.next() != other.next();
        assertTrue(differs, "another round draws another sequence");
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("10,000 draws are near-uniform: each decile holds 8% to 12%")
    void nearUniform() {
        ProteanPick p = seeded();
        int[] decile = new int[10];
        int n = 10_000;
        for (int i = 0; i < n; i++) decile[Math.min(9, (int) (p.next() * 10))]++;
        for (int k = 0; k < 10; k++) {
            double share = decile[k] / (double) n;
            assertTrue(share >= 0.08 && share <= 0.12, "decile " + k + " holds " + share);
        }
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("the guard moves a state at 0 or the fixed point 3/4 on")
    void guardEscapes() {
        for (double stuck : new double[] {0.0, 0.75}) {
            ProteanPick p = new ProteanPick();
            p.setState(stuck);
            double u = p.next();
            assertTrue(u >= 0 && u <= 1);
            double x = p.state();
            assertTrue(Math.abs(x) > 1e-9 && Math.abs(x - 0.75) > 1e-9 && Math.abs(x - 1) > 1e-9,
                "state " + x + " escaped from " + stuck);
            // And the orbit keeps moving.
            assertTrue(p.next() != u || p.state() != x);
        }
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("with no spread and a tiny floor the pick is the least danger")
    void argminWithoutSpread() {
        ProteanPick p = seeded();
        double[] dangers = {0.1, 0.5, 0.9};
        double[] spread = {0, 0, 0};
        for (int i = 0; i < 1000; i++) {
            assertEquals(0, p.pick(dangers, spread, 0.3));
        }
        double[] shuffled = {0.9, 0.1, 0.5};
        assertEquals(1, p.pick(shuffled, spread, 0.3));
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("an option beyond the cap is never drawn")
    void neverOutsideCap() {
        ProteanPick p = seeded();
        double[] dangers = {0.20, 0.25, 0.90};
        // A wide spread makes the temperature high, so the cap alone keeps option 2 out.
        double[] spread = {0.3, 0.3, 0.3};
        double best = 0.20;
        int[] counts = new int[3];
        for (int i = 0; i < 1000; i++) {
            int k = p.pick(dangers, spread, 0.3);
            counts[k]++;
            assertTrue(dangers[k] <= 1.5 * best + 0.01, "drew option " + k);
        }
        assertTrue(counts[0] > 0 && counts[1] > 0, "both options in the cap are drawn");
        assertEquals(0, counts[2]);
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("with equal dangers every option is drawn about equally often")
    void equalDangersEqualFrequency() {
        ProteanPick p = seeded();
        double[] dangers = {0.3, 0.3, 0.3};
        double[] spread = {0.1, 0.1, 0.1};
        int[] counts = new int[3];
        int n = 3000;
        for (int i = 0; i < n; i++) counts[p.pick(dangers, spread, 0.3)]++;
        for (int k = 0; k < 3; k++) {
            double share = counts[k] / (double) n;
            assertTrue(share > 0.28 && share < 0.39, "option " + k + " drawn " + share);
        }
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("the expected excess danger is at most T ln 3")
    void expectedExcessBounded() {
        double[] dangers = {0.20, 0.24, 0.29};
        double[] spread = {0.05, 0.08, 0.06};
        double meanView = 0.25;
        double t = ProteanPick.temperature(dangers, spread, meanView);
        double[] prob = ProteanPick.probabilities(dangers, spread, meanView);
        double sum = 0;
        double exact = 0;
        for (int k = 0; k < 3; k++) {
            sum += prob[k];
            exact += prob[k] * (dangers[k] - 0.20);
        }
        assertEquals(1.0, sum, 1e-12);
        assertTrue(exact <= t * Math.log(3) + 1e-12, "exact " + exact + " vs " + t * Math.log(3));

        ProteanPick p = seeded();
        double drawn = 0;
        int n = 20_000;
        for (int i = 0; i < n; i++) drawn += dangers[p.pick(dangers, spread, meanView)] - 0.20;
        assertTrue(drawn / n <= t * Math.log(3) + 0.002, "drawn " + drawn / n + " vs " + t * Math.log(3));
    }

    @Test
    @Tag("MOVE-14")
    @DisplayName("the dwell is geometric around its mean, and 1 for a mean of 1")
    void dwellMean() {
        for (int mean : new int[] {3, 8}) {
            ProteanPick p = seeded();
            long total = 0;
            int n = 20_000;
            for (int i = 0; i < n; i++) {
                int tau = p.dwell(mean);
                assertTrue(tau >= 1);
                total += tau;
            }
            assertEquals(mean, total / (double) n, 0.15 * mean, "mean dwell for " + mean);
        }
        ProteanPick p = seeded();
        for (int i = 0; i < 100; i++) assertEquals(1, p.dwell(1));
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("the hot setting is off by default and the default pick is unchanged by it")
    void hotOffByDefault() {
        ProteanPick p = seeded();
        assertFalse(p.hot());
        p.setHot(true);
        assertTrue(p.hot());
        p.setHot(false);
        assertFalse(p.hot());
        double[] dangers = {0.20, 0.25, 0.90};
        double[] spread = {0.1, 0.1, 0.1};
        ProteanPick a = seeded();
        ProteanPick b = seeded();
        b.setHot(true);
        b.setHot(false);
        for (int i = 0; i < 200; i++) {
            assertEquals(a.pick(dangers, spread, 0.3), b.pick(dangers, spread, 0.3), "pick " + i);
        }
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("the hot setting raises the floor to half the least danger and the cap to twice it")
    void hotTemperatureAndCap() {
        double[] dangers = {0.20, 0.30, 0.40};
        double[] spread = {0, 0, 0};
        assertEquals(0.02 * 0.20, ProteanPick.temperature(dangers, spread, 0.3), 1e-12);
        assertEquals(0.5 * 0.20, ProteanPick.temperature(dangers, spread, 0.3, ProteanPick.HOT_T0_SHARE), 1e-12);

        // Default: the cap 0.5 * 0.20 + 0.01 = 0.11 excludes the excess 0.20, and at T = 0.004 the
        // best takes all but e^-25 of the weight; the hot cap 1.0 * 0.20 + 0.01 = 0.21 admits all three.
        double[] def = ProteanPick.probabilities(dangers, spread, 0.3);
        assertEquals(1.0, def[0], 1e-9);
        assertEquals(0.0, def[2], 0.0);
        double[] hot = ProteanPick.probabilities(dangers, spread, 0.3, ProteanPick.HOT_T0_SHARE, ProteanPick.HOT_DELTA);
        assertTrue(hot[0] > hot[1] && hot[1] > hot[2] && hot[2] > 0, "all three drawable, best first");
        assertEquals(1.0, hot[0] + hot[1] + hot[2], 1e-12);
    }

    @Test
    @Tag("MOVE-15")
    @DisplayName("a hot pick draws the second option the default never does, and none beyond twice the best")
    void hotPickSpreads() {
        double[] dangers = {0.20, 0.30, 0.90};
        double[] spread = {0, 0, 0};
        ProteanPick cold = seeded();
        ProteanPick hot = seeded();
        hot.setHot(true);
        int[] counts = new int[3];
        for (int i = 0; i < 2000; i++) {
            assertEquals(0, cold.pick(dangers, spread, 0.3));
            counts[hot.pick(dangers, spread, 0.3)]++;
        }
        assertTrue(counts[0] > 0 && counts[1] > 0, "both options in the hot cap are drawn");
        assertEquals(0, counts[2]);
    }
}
