package hadur117.core.gun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.RobotState;
import hadur117.core.model.Wave;
import hadur117.core.physics.Angles;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** GUN-28: the per-opponent static guess-factor gun. */
class StaticGfGunTest {

    static final Point2D.Double ME = GunOpeningTest.ME;
    static final Point2D.Double ENEMY = GunOpeningTest.ENEMY;

    /** Where the target stands at guess factor {@code gf} of the wave, at the same distance. */
    private static Point2D.Double atGf(Wave w, double gf) {
        double bearing = w.absBearing + gf * w.orbitDirection * w.maxEscapeAngle();
        return DiaUtils.project(ME, bearing, ME.distance(ENEMY));
    }

    /** The target standing at guess factor {@code gf} over the ticks the wave crosses it. */
    private static List<RobotState> statesAt(Wave w, double gf) {
        Point2D.Double at = atGf(w, gf);
        List<RobotState> states = new ArrayList<>();
        long arrival = w.fireTime + (long) Math.floor(ME.distance(at) / w.bulletSpeed());
        for (long t = arrival - 2; t <= arrival + 2; t++) {
            states.add(RobotState.newBuilder().setLocation(at).setTime(t).build());
        }
        return states;
    }

    private static void breakFiring(GunController g, int n, double gf) {
        for (int i = 0; i < n; i++) {
            Wave w = GunOpeningTest.wave();
            w.firingWave = true;
            g.onWaveBreak(w, statesAt(w, gf));
        }
    }

    private static double gfOf(double aim) {
        Wave w = GunOpeningTest.wave();
        return Angles.normalRelativeAngle(aim - w.absBearing) * w.orbitDirection / w.maxEscapeAngle();
    }

    @Test
    @Tag("GUN-28")
    @DisplayName("after the line's broken firing waves, the gun aims at the all-history guess-factor peak")
    void aimsAtThePeakOnceEnoughWavesBreak() {
        GunController g = new GunController(GunOpeningTest.FIELD, 1);
        GunController twin = new GunController(GunOpeningTest.FIELD, 1);
        g.setStaticGf(10);
        breakFiring(g, 9, -0.5);
        breakFiring(twin, 9, -0.5);
        assertEquals(twin.aim(GunOpeningTest.wave(), ME, 30), g.aim(GunOpeningTest.wave(), ME, 30), 1e-12,
            "nine waves: the usual gun");
        breakFiring(g, 1, -0.5);
        assertEquals(-0.5, gfOf(g.aim(GunOpeningTest.wave(), ME, 30)), 0.1, "ten waves: the peak, within the robot's width");
        breakFiring(g, 30, 0.7);
        assertEquals(0.7, gfOf(g.aim(GunOpeningTest.wave(), ME, 30)), 0.1, "no decay: the larger pile wins");
    }

    @Test
    @Tag("GUN-28")
    @DisplayName("off at 0 (the default), and never on with several opponents")
    void offByDefaultAndDuelOnly() {
        for (int enemies : new int[] {1, 3}) {
            GunController plain = new GunController(GunOpeningTest.FIELD, enemies);
            GunController set = new GunController(GunOpeningTest.FIELD, enemies);
            set.setStaticGf(enemies == 1 ? 0 : 10);
            breakFiring(plain, 20, 0.5);
            breakFiring(set, 20, 0.5);
            assertEquals(plain.aim(GunOpeningTest.wave(), ME, 30), set.aim(GunOpeningTest.wave(), ME, 30), 1e-12);
        }
    }
}
