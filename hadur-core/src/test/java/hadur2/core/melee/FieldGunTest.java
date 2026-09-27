package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur2.core.physics.Angles;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FieldGunTest {

    private final FieldGun gun = new FieldGun(field(1000, 1000));
    private final EnemyTracker tracker = new EnemyTracker();
    private final Point2D.Double me = pt(500, 500);

    private EnemyInfo scanned(String name, double x, double y, double energy, double heading,
                              double velocity, long time) {
        EnemyInfo e = scan(tracker, name, x, y, energy, heading, velocity, time);
        gun.onScan(e, e.distance(me), time);
        return e;
    }

    @Test
    @Tag("MGUN-1")
    @DisplayName("MGUN-1: only opponents scanned within 8 ticks get solutions")
    void onlyFreshOpponents() {
        scanned("old", 500, 800, 100, 0, 0, 0);
        scanned("new", 800, 500, 100, 0, 0, 5);
        List<FieldGun.Solution> s = gun.solutions(me, 100, 5, tracker.alive(), 9);
        assertEquals(1, s.size());
        assertEquals("new", s.get(0).target);
        assertEquals(2, gun.solutions(me, 100, 5, tracker.alive(), 8).size());
    }

    @Test
    @Tag("MGUN-1")
    @DisplayName("MGUN-1: with history an opponent gets three solutions from its most similar situations")
    void threeLearnedSolutions() {
        for (long t = 0; t <= 200; t++) scanned("a", 500, 800, 100, Math.PI / 2, 8, t);
        assertTrue(gun.history("a").size() >= FieldGun.K);
        List<FieldGun.Solution> s = gun.solutions(me, 100, 5, tracker.alive(), 200);
        assertEquals(FieldGun.K, s.size());
        double total = s.stream().mapToDouble(x -> x.weight).sum();
        assertEquals(gun.weight(tracker.get("a"), me, tracker.alive(), 200), total, 1e-9);
    }

    @Test
    @Tag("MGUN-1")
    @DisplayName("MGUN-1: the learned aim follows what the opponent did, not its velocity")
    void learnedAimBeatsLinear() {
        // It always reports full speed east, but never actually goes anywhere.
        for (long t = 0; t <= 200; t++) scanned("a", 500, 800, 100, Math.PI / 2, 8, t);
        FieldGun.Aim aim = gun.aim(me, 100, 5, tracker.alive(), 200);
        assertTrue(aim.learned);
        assertEquals(0, Angles.normalRelativeAngle(aim.angle), 1e-6);
        // A fresh gun with no history leads it east, as linear prediction would.
        FieldGun fresh = new FieldGun(field(1000, 1000));
        FieldGun.Aim linear = fresh.aim(me, 100, 5, tracker.alive(), 200);
        assertFalse(linear.learned);
        assertTrue(linear.angle > 0.1);
    }

    @Test
    @Tag("MGUN-1")
    @DisplayName("MGUN-1: the gun fires where the most probability lines up")
    void peakDensity() {
        // Two weak opponents close together at the same bearing outweigh a stronger one alone.
        scanned("a", 500, 800, 60, 0, 0, 1);
        scanned("b", 505, 820, 60, 0, 0, 1);
        scanned("c", 800, 500, 100, 0, 0, 1);
        FieldGun.Aim aim = gun.aim(me, 100, 5, tracker.alive(), 2);
        assertTrue(Math.abs(Angles.normalRelativeAngle(aim.angle)) < 0.05, "aimed at " + aim.angle);
    }

    @Test
    @Tag("MGUN-2")
    @DisplayName("MGUN-2: a finisher's weight doubles and it gets the power that kills it")
    void finisherWeight() {
        EnemyInfo weak = scanned("weak", 500, 800, 16, 0, 0, 1);
        EnemyInfo other = scanned("other", 500, 200, 100, 0, 0, 1);
        EnemyInfo far = scanned("far", 900, 900, 100, 0, 0, 1);
        double w = gun.weight(weak, me, tracker.alive(), 1);
        weak.energy = 17;
        double base = gun.weight(weak, me, tracker.alive(), 1);
        assertEquals(2.0 * (1 + 0.5 * 84 / 100.0) / (1 + 0.5 * 83 / 100.0), w / base, 1e-9);
        weak.energy = 10;
        FieldGun.Aim aim = gun.aim(me, 100, 5, Arrays.asList(weak, other, far), 1);
        assertEquals("weak", aim.target);
        assertEquals(MeleeEnergyPolicy.killPower(10), aim.power, 1e-9);
    }

    @Test
    @Tag("MGUN-1")
    @DisplayName("MGUN-1: isolated opponents and repeat shooters weigh more")
    void boosts() {
        EnemyInfo a = scanned("a", 500, 800, 100, 0, 0, 1);
        scanned("b", 500, 1000 - 30, 100, 0, 0, 1);
        double crowded = gun.weight(a, me, tracker.alive(), 1);
        double alone = gun.weight(a, me, Arrays.asList(a), 1);
        assertEquals(FieldGun.ISOLATED_BOOST, alone / crowded, 1e-9);
        a.recordHitOnHadur(10);
        assertEquals(crowded, gun.weight(a, me, tracker.alive(), 20), 1e-9);
        a.recordHitOnHadur(20);
        assertEquals(FieldGun.SHOOTER_BOOST, gun.weight(a, me, tracker.alive(), 30) / crowded, 1e-9);
        assertEquals(crowded, gun.weight(a, me, tracker.alive(), 211), 1e-9);
    }

    @Test
    @Tag("MGUN-1")
    @DisplayName("MGUN-1: a rammer inside 100 px is left alone unless it can be finished")
    void rammers() {
        double toMe = DiaUtils.absoluteBearing(pt(500, 580), me);
        EnemyInfo r = scanned("ram", 500, 580, 100, toMe, 8, 1);
        assertTrue(gun.solutions(me, 100, 5, tracker.alive(), 1).isEmpty());
        r.energy = 10;
        assertEquals(1, gun.solutions(me, 100, 5, tracker.alive(), 1).size());
        r.energy = 100;
        r.velocity = -8;
        assertEquals(1, gun.solutions(me, 100, 5, tracker.alive(), 1).size(), "backing away");
    }

    @Test
    @Tag("MGUN-1")
    @DisplayName("MGUN-1: a round's scans become situations, and trajectories interpolate")
    void historyCommitsAtRoundEnd() {
        EnemyHistory h = gun.history("a");
        for (long t = 0; t < 30; t++) scanned("a", 100 + 8 * t, 500, 100, Math.PI / 2, 8, t);
        assertEquals(0, h.size());
        gun.newRound();
        assertEquals(29, h.size());
        float[] t = {10, 80, 0, 20, 80, -40};
        assertArrayEquals(new double[]{40, 0}, EnemyHistory.offset(t, 5), 1e-9);
        assertArrayEquals(new double[]{80, -20}, EnemyHistory.offset(t, 15), 1e-9);
        assertArrayEquals(new double[]{80, -40}, EnemyHistory.offset(t, 50), 1e-9);
    }
}
