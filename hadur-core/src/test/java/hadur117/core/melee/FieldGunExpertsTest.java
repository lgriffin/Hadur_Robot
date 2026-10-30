package hadur117.core.melee;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyTracker;
import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The Ogi-inspired gun switches (MGUN-17..20): their scoring, and that they ship off. */
class FieldGunExpertsTest {

    private final FieldGun gun = new FieldGun(field(1000, 1000));
    private final Point2D.Double me = pt(500, 500);

    private static boolean[] hits(boolean field, boolean headOn, boolean linear, boolean circular) {
        return new boolean[] {field, headOn, linear, circular};
    }

    @Test
    @Tag("MGUN-17")
    @Tag("MGUN-18")
    @Tag("MGUN-19")
    @Tag("MGUN-20")
    @DisplayName("MGUN-17..20 ship off, so the waves score only the field gun's aim")
    void shipOff() {
        assertFalse(FieldGun.EXPERTS);
        assertFalse(FieldGun.HIT_TARGET);
        assertFalse(FieldGun.FLAT_DISTANCE);
        assertFalse(FieldGun.SOFT_MATCH);
        assertFalse(MeleeWaves.scoring(gun));
    }

    @Test
    @Tag("MGUN-17")
    @DisplayName("MGUN-17: no shares before ten waves; then the aim that hits takes most of the opponent")
    void sharesFollowHits() {
        for (int i = 0; i < FieldGun.EXPERT_MIN - 1; i++) gun.scoreExperts("a", hits(false, false, true, false));
        assertNull(gun.shares("a"));
        gun.scoreExperts("a", hits(false, false, true, false));
        double[] share = gun.shares("a");
        assertNotNull(share);
        double total = 0;
        for (double x : share) total += x;
        assertEquals(1.0, total, 1e-9);
        assertTrue(share[FieldGun.LINEAR] > 0.9, "linear " + share[FieldGun.LINEAR]);
        assertTrue(share[FieldGun.FIELD] < 0.05);
    }

    @Test
    @Tag("MGUN-17")
    @DisplayName("MGUN-17: older reads decay, so a robot that changes how it moves changes the pick")
    void sharesDecay() {
        for (int i = 0; i < 30; i++) gun.scoreExperts("a", hits(false, true, false, false));
        for (int i = 0; i < 30; i++) gun.scoreExperts("a", hits(true, false, false, false));
        double[] share = gun.shares("a");
        assertTrue(share[FieldGun.FIELD] > share[FieldGun.HEAD_ON]);
    }

    @Test
    @Tag("MGUN-17")
    @DisplayName("MGUN-17: head-on aims at the last scan; linear and circular agree on a robot driving straight")
    void expertAims() {
        EnemyTracker tracker = new EnemyTracker();
        EnemyInfo e = scan(tracker, "a", 500, 800, 100, Math.PI / 2, 8, 1);
        assertEquals(e.location, gun.expertAim(me, e, FieldGun.HEAD_ON, 2, 1));
        Point2D.Double lin = gun.expertAim(me, e, FieldGun.LINEAR, 2, 1);
        Point2D.Double circ = gun.expertAim(me, e, FieldGun.CIRCULAR, 2, 1);
        assertEquals(lin.x, circ.x, 1e-9);
        assertEquals(lin.y, circ.y, 1e-9);
    }

    @Test
    @Tag("MGUN-18")
    @DisplayName("MGUN-18: 1 before any wave; above 1 for an opponent the gun hits, below for one it misses")
    void hitFactor() {
        assertEquals(1.0, gun.hitFactor("a"), 1e-12);
        for (int i = 0; i < 20; i++) {
            gun.scoreExperts("a", hits(true, false, false, false));
            gun.scoreExperts("b", hits(false, false, false, false));
        }
        assertTrue(gun.hitFactor("a") > 2);
        assertTrue(gun.hitFactor("b") < 0.5);
    }
}
