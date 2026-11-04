package hadur117.core.melee;

import static org.junit.jupiter.api.Assertions.*;

import hadur117.core.model.RobotState;
import hadur117.core.model.RobotStateLog;
import hadur117.core.physics.BattleField;
import java.awt.geom.Point2D;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CrowdSurferTest {

    private static final BattleField FIELD = new BattleField(1000, 1000);

    /** Hadur standing still at (500, 500) from tick 0 to {@code until}. */
    private static RobotStateLog still(long until) {
        RobotStateLog log = new RobotStateLog();
        for (long t = 0; t <= until; t++) {
            log.addState(state(500, 500, t));
        }
        return log;
    }

    private static RobotState state(double x, double y, long t) {
        return RobotState.newBuilder().setLocation(new Point2D.Double(x, y)).setHeading(0)
            .setVelocity(0).setTime(t).build();
    }

    @Test
    @Tag("MSURF-2")
    @DisplayName("MSURF-2: a seen shot is a firing duel wave at Hadur, weighed by the robots nearer its shooter")
    void shotsAreWeighedWaves() {
        CrowdSurfer s = new CrowdSurfer(FIELD);
        s.newRound();
        RobotStateLog path = still(20);
        Point2D.Double source = new Point2D.Double(500, 100);
        s.onShot("a", source, 10, 2.0, path, 80, 100);
        assertEquals(1, s.wavesAdded());
        RobotState now = state(500, 500, 12);
        List<CrowdSurfer.Threat> alone = s.threats(now, Map.of("a", source));
        assertEquals(1, alone.size());
        assertEquals(1.0, alone.get(0).weight, 1e-9);
        // One robot nearer the shooter than Hadur was: 1/4; two: 1/9; three: under 0.1, dropped.
        Point2D.Double near = new Point2D.Double(500, 200);
        assertEquals(0.25, s.threats(now, Map.of("a", source, "b", near)).get(0).weight, 1e-9);
        assertEquals(1.0 / 9, s.threats(now, Map.of("a", source, "b", near, "c", near)).get(0).weight, 1e-9);
        assertTrue(s.threats(now, Map.of("a", source, "b", near, "c", near, "d", near)).isEmpty());
    }

    @Test
    @Tag("MSURF-3")
    @DisplayName("MSURF-3: standing in a head-on shot's path is rated more dangerous than moving off it")
    void dangerFavoursLeavingTheLine() {
        CrowdSurfer s = new CrowdSurfer(FIELD);
        s.newRound();
        RobotStateLog path = still(20);
        Point2D.Double source = new Point2D.Double(500, 100);
        s.onShot("a", source, 10, 2.0, path, 80, 100);
        RobotState now = state(500, 500, 12);
        List<CrowdSurfer.Threat> threats = s.threats(now, Map.of("a", source));
        double stay = s.danger(now, new Point2D.Double(500, 500), threats);
        double side = s.danger(now, new Point2D.Double(700, 500), threats);
        assertTrue(stay > 0);
        assertTrue(side < stay, "stay " + stay + ", side " + side);
        assertEquals(0.0, s.danger(now, new Point2D.Double(700, 500), List.of()), 1e-12);
    }

    @Test
    @Tag("MSURF-3")
    @DisplayName("MSURF-3: a hit teaches its shooter's views; a shooter never seen is ignored")
    void hitsTeach() {
        CrowdSurfer s = new CrowdSurfer(FIELD);
        s.newRound();
        RobotStateLog path = still(40);
        Point2D.Double source = new Point2D.Double(500, 100);
        s.onShot("a", source, 10, 2.0, path, 80, 100);
        // Power 2 flies 14 px a tick: 400 px is about 29 ticks.
        s.onHitByBullet("a", 2.0, Math.PI, new Point2D.Double(500, 500), 39);
        assertEquals(1, s.hitsLogged());
        s.onHitByBullet("nobody", 2.0, 0, new Point2D.Double(500, 500), 39);
        assertEquals(1, s.hitsLogged());
        assertEquals(1, s.shooters());
    }

    @Test
    @Tag("MSURF-1")
    @DisplayName("MSURF-1: ships off; the melee brain builds the surfer only with the switch on")
    void switchOff() {
        assertFalse(MinimumRiskMovement.MELEE_DUELIST);
        MeleeController m = new MeleeController(FIELD);
        assertNull(m.duelist());
        assertFalse(m.mover().duelling());
        m.duelist(true);
        assertNotNull(m.duelist());
        assertTrue(m.mover().duelling());
    }
}
