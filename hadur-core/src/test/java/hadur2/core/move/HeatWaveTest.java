package hadur2.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import hadur2.core.model.RobotState;
import hadur2.core.model.Wave;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-11: the wave of the shot the enemy has not yet fired is surfed after the real ones. */
class HeatWaveTest {

    static RobotState me(long time) {
        return RobotState.newBuilder().setLocation(new Point2D.Double(400, 200)).setTime(time).build();
    }

    /** A controller with one firing wave (tick 5) and a newer movement wave (tick 6). */
    static MoveController withOneFiring(Wave[] out) {
        MoveController m = FiringWaveTest.controller();
        out[0] = FiringWaveTest.add(m, 5);
        out[1] = FiringWaveTest.add(m, 6);
        // The reading says the shot left on tick 5 (the latest wave before the scan at 6).
        m.updateFiringWave(5, 6, 1.7, false);
        return m;
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("on, gun nearly cool and no real wave: the newest movement wave is surfed")
    void providesWaveWhenNoRealOne() {
        MoveController m = FiringWaveTest.controller();
        Wave w = FiringWaveTest.add(m, 6);
        m.setProvisionalReady(true, 6);
        assertSame(w, m.findSurfableWave(0, me(6)));
        assertFalse(w.firingWave, "it is never marked as fired");
        assertNull(m.findSurfableWave(1, me(6)));
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("while the gun stays ready the first ready tick's wave is held, not each tick's newest")
    void holdsTheFirstReadyWave() {
        MoveController m = FiringWaveTest.controller();
        Wave first = FiringWaveTest.add(m, 6);
        m.setProvisionalReady(true, 6);
        assertSame(first, m.findSurfableWave(0, me(6)));
        for (long t = 7; t <= 10; t++) {
            FiringWaveTest.add(m, t);
            m.setProvisionalReady(true, t);
            assertSame(first, m.findSurfableWave(0, me(t)), "tick " + t);
        }
        // The gun is no longer ready (it fired, or heat rose): the hold is dropped, and the
        // next ready tick holds its own wave.
        m.setProvisionalReady(false, 11);
        assertNull(m.findSurfableWave(0, me(11)));
        Wave later = FiringWaveTest.add(m, 12);
        m.setProvisionalReady(true, 12);
        assertSame(later, m.findSurfableWave(0, me(12)));
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("a held wave that has gone is replaced by the newest one")
    void replacesAGoneWave() {
        MoveController m = FiringWaveTest.controller();
        FiringWaveTest.add(m, 6);
        m.setProvisionalReady(true, 6);
        m.findSurfableWave(0, me(6));
        for (long t = 7; t < 80; t++) m.checkWaves(t, new Point2D.Double(400, 200));
        assertEquals(0, m.getWaveManager().size(), "the held wave has passed and gone");
        Wave fresh = FiringWaveTest.add(m, 80);
        m.setProvisionalReady(true, 80);
        assertSame(fresh, m.findSurfableWave(0, me(80)));
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("off: no provisional wave")
    void offMeansNone() {
        MoveController m = FiringWaveTest.controller();
        FiringWaveTest.add(m, 6);
        m.setProvisionalReady(false, 6);
        assertNull(m.findSurfableWave(0, me(6)));
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("it comes after the real waves, and not when two real waves are in the air")
    void afterRealWavesAndOnlyBelowTwo() {
        Wave[] w = new Wave[2];
        MoveController m = withOneFiring(w);
        Wave third = FiringWaveTest.add(m, 7);
        m.setProvisionalReady(true, 7);
        assertSame(w[0], m.findSurfableWave(0, me(7)));
        assertSame(third, m.findSurfableWave(1, me(7)));
        assertNull(m.findSurfableWave(2, me(7)));

        // Two real waves: the provisional one is not offered.
        MoveController two = FiringWaveTest.controller();
        Wave a = FiringWaveTest.add(two, 5);
        two.updateFiringWave(5, 6, 1.7, false);
        Wave b = FiringWaveTest.add(two, 8);
        two.updateFiringWave(8, 9, 1.7, false);
        FiringWaveTest.add(two, 10);
        two.setProvisionalReady(true, 10);
        assertSame(a, two.findSurfableWave(0, me(10)));
        assertSame(b, two.findSurfableWave(1, me(10)));
        assertNull(two.findSurfableWave(2, me(10)));
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("a stale tick offers nothing, and a wave found to be a real shot is surfed as itself once")
    void staleAndRealDetection() {
        MoveController m = FiringWaveTest.controller();
        Wave w = FiringWaveTest.add(m, 6);
        m.setProvisionalReady(true, 7);
        assertNull(m.findSurfableWave(0, me(7)), "the armed tick is not the wave's tick");
        m.setProvisionalReady(true, 6);
        m.updateFiringWave(6, 7, 1.9, false);
        // Now it is a real firing wave: index 0 is that wave, and nothing is added after it
        // because the newest wave is the firing one.
        assertSame(w, m.findSurfableWave(0, me(7)));
        assertNull(m.findSurfableWave(1, me(7)));
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("a provisional wave that breaks changes no hit-rate or flattener statistic")
    void feedsNoStatistics() {
        MoveController m = FiringWaveTest.controller();
        Wave w = FiringWaveTest.add(m, 6);
        m.setProvisionalReady(true, 6);
        m.findSurfableWave(0, me(6));
        int simple = m.viewSize("simple");
        int flat = m.viewSize("flattener");
        double rate = m.normalizedEnemyHitRate();
        for (long t = 7; t < 80; t++) m.checkWaves(t, new Point2D.Double(400, 200));
        assertEquals(0, m.getWaveManager().size(), "the wave has passed and gone");
        assertEquals(simple, m.viewSize("simple"));
        assertEquals(flat, m.viewSize("flattener"));
        assertEquals(rate, m.normalizedEnemyHitRate(), 0.0);
        assertFalse(w.firingWave);
    }

    @Test
    @Tag("MOVE-11")
    @DisplayName("the wave carries the guessed power: the last shot's, else 1.9")
    void powerIsTheGuess() {
        MoveController m = FiringWaveTest.controller();
        assertEquals(1.9, m.guessBulletPower());
        FiringWaveTest.add(m, 5);
        m.updateFiringWave(5, 6, 1.3, false);
        assertEquals(1.3, m.guessBulletPower(), 1e-9);
    }
}
