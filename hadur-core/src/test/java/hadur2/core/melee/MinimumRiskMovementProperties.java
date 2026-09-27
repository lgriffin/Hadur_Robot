package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

/** MMOVE-1 and RES-6 over random fields: the ring's size and bounds, and determinism. */
class MinimumRiskMovementProperties {

    private static EnemyTracker field(long seed, int n) {
        EnemyTracker t = new EnemyTracker();
        long z = seed;
        for (int i = 0; i < n; i++) {
            z = MinimumRiskMovement.mix(z + i);
            double x = 30 + MinimumRiskMovement.unit(z) * 940;
            z = MinimumRiskMovement.mix(z);
            double y = 30 + MinimumRiskMovement.unit(z) * 940;
            scan(t, "e" + i, x, y, 20 + (i * 17) % 80, 1);
        }
        return t;
    }

    @Property(tries = 300)
    @Tag("MMOVE-1")
    void everyDecisionScoresTheFullRingInsideTheField(
            @ForAll @DoubleRange(min = 20, max = 980) double x,
            @ForAll @DoubleRange(min = 20, max = 980) double y,
            @ForAll @IntRange(min = 1, max = 9) int n,
            @ForAll long seed) {
        MinimumRiskMovement move = new MinimumRiskMovement(Fixtures.field(1000, 1000));
        move.newRound();
        List<EnemyInfo> enemies = field(seed, n).alive();
        Point2D.Double me = pt(x, y);
        Point2D.Double d = move.chooseDestination(me, 100, Math.max(2, n), enemies, 50,
            MeleeStrategy.Plan.normal());
        assertTrue(move.lastCandidates() >= 120);
        assertTrue(d.x >= MinimumRiskMovement.WALL_MARGIN && d.x <= 1000 - MinimumRiskMovement.WALL_MARGIN);
        assertTrue(d.y >= MinimumRiskMovement.WALL_MARGIN && d.y <= 1000 - MinimumRiskMovement.WALL_MARGIN);
        double nearest = enemies.stream().mapToDouble(e -> e.location.distance(me)).min().getAsDouble();
        for (Point2D.Double p : move.candidates(me, Math.max(2, n), enemies)) {
            // Clipping to the walls only ever pulls a point closer to Hadur. Right on top of
            // an opponent the ring still keeps a robot's width, so Hadur can move away.
            double cap = Math.max(MinimumRiskMovement.MIN_RING, 0.8 * nearest);
            assertTrue(p.distance(me) <= cap + 1e-6, "past 80% of the nearest opponent");
        }
    }

    @Property(tries = 100)
    @Tag("RES-6")
    void theSameFieldGivesTheSameDestination(
            @ForAll @DoubleRange(min = 20, max = 980) double x,
            @ForAll @DoubleRange(min = 20, max = 980) double y,
            @ForAll @IntRange(min = 1, max = 9) int n,
            @ForAll long seed) {
        Point2D.Double a = decide(x, y, n, seed);
        Point2D.Double b = decide(x, y, n, seed);
        assertEquals(a, b);
    }

    private static Point2D.Double decide(double x, double y, int n, long seed) {
        MinimumRiskMovement move = new MinimumRiskMovement(Fixtures.field(1000, 1000));
        move.newRound();
        return move.chooseDestination(pt(x, y), 100, Math.max(2, n), field(seed, n).alive(), 50,
            MeleeStrategy.Plan.normal());
    }
}
