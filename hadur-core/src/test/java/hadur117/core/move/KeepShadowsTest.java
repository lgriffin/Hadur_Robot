package hadur117.core.move;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.model.Wave;
import hadur117.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-43: a gone bullet keeps the shadows it cast before it died; MOVE-42: the members' long memory. */
class KeepShadowsTest {

    private static double width(List<double[]> intervals) {
        double w = 0;
        for (double[] i : intervals) w += i[1] - i[0];
        return w;
    }

    @Test
    @Tag("MOVE-43")
    @DisplayName("a bullet walked only before its death turn casts a part of its full shadow, none before it meets the wave")
    void deathTurnCutsTheWalk() {
        Point2D.Double s = new Point2D.Double(400, 100);
        Point2D.Double me = new Point2D.Double(400, 500);
        Wave w = BulletShadowsProperties.wave(s, 100, 2.0);
        OurBullet b = new OurBullet(100, me, DiaUtils.absoluteBearing(me, s) + 0.3, 2.0);
        double full = width(BulletShadows.of(w, List.of(b), 800, 600).get(1));
        assertTrue(full > 0, "the bullet crosses the wave");
        assertEquals(full, width(BulletShadows.of(w, List.of(b), x -> Long.MAX_VALUE, 800, 600).get(1)), 1e-12);
        assertEquals(0.0, width(BulletShadows.of(w, List.of(b), x -> 101L, 800, 600).get(1)), 1e-12,
            "dead before both bullets moved");
        // The bullets are 400 px apart and close at up to 28 px a turn; by turn 160 ours is off the field.
        assertEquals(full, width(BulletShadows.of(w, List.of(b), x -> 160L, 800, 600).get(1)), 1e-12);
        double part = width(BulletShadows.of(w, List.of(b), x -> 114L, 800, 600).get(1));
        assertTrue(part <= full + 1e-12);
    }

    @Test
    @Tag("MOVE-41")
    @DisplayName("a view that had the second hit where the first went gains rolling weight; off, scores stay 0")
    void viewRolling() {
        MoveController mc = new MoveController(AimMembersTest.FIELD, new hadur117.core.physics.MovementPredictor(AimMembersTest.FIELD));
        mc.setAimMembers(new AimMembers());
        mc.setViewRolling(true);
        Point2D.Double enemy = new Point2D.Double(400, 100);
        Point2D.Double me = new Point2D.Double(400, 500);
        for (int i = 0; i < 2; i++) {
            Wave w = new Wave("enemy", enemy, me, 0, 10 + 30 * i, 2.0, 0, 0, 1, AimMembersTest.FIELD,
                new hadur117.core.physics.MovementPredictor(AimMembersTest.FIELD));
            double[] still = {me.x, me.y, 0, 0, 0, 0, enemy.x, enemy.y, 0};
            w.aimStates = new double[][] {still, still, still};
            w.targetDistance = 400;
            mc.logBulletHit(w, new Point2D.Double(400, 480), 0, 40 + 30 * i);
        }
        assertTrue(mc.viewRollScore(0) > 0, "the simple view predicted the second hit: " + mc.viewRollScore(0));
        mc.setViewRolling(false);
        assertEquals(0.0, mc.viewRollScore(0), 0);
    }

    @Test
    @Tag("MOVE-42")
    @DisplayName("a long-memory member set moves 2% of the way a bullet, the shipped one 20%")
    void longMemory() {
        AimMembers shipped = new AimMembers(0);
        AimMembers longer = new AimMembers(0, AimMembers.LONG_DECAY);
        assertEquals(AimMembers.decayDefault(), shipped.decay(), 0);
        assertEquals(0.98, longer.decay(), 0);
        double[] say = AimMembersTest.nans(AimMembers.MEMBERS);
        say[1] = 1.0;
        shipped.learn(say, 0.05);
        longer.learn(say, 0.05);
        assertEquals(shipped.score(1) / 10, longer.score(1), 1e-12);
        assertFalse(shipped.score(1) == 0);
    }
}
