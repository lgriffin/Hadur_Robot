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
    @DisplayName("MGUN-17: no pick before twenty waves; then the simple aim that beats the field gun takes the opponent")
    void pickFollowsHits() {
        for (int i = 0; i < FieldGun.EXPERT_MIN - 1; i++) gun.scoreExperts("a", hits(false, false, true, false));
        assertNull(gun.pick("a"));
        gun.scoreExperts("a", hits(false, false, true, false));
        double[] pick = gun.pick("a");
        assertNotNull(pick);
        assertEquals(FieldGun.LINEAR, (int) pick[0]);
        assertTrue(pick[1] > FieldGun.EXPERT_EDGE);
    }

    @Test
    @Tag("MGUN-17")
    @DisplayName("MGUN-17: the field gun keeps an opponent unless a simple aim is well ahead of it")
    void fieldKeepsTies() {
        for (int i = 0; i < 40; i++) gun.scoreExperts("a", hits(i % 3 == 0, i % 3 == 0 || i % 13 == 0, false, false));
        assertNull(gun.pick("a"), "head-on only slightly ahead");
        for (int i = 0; i < 40; i++) gun.scoreExperts("b", hits(true, true, true, true));
        assertNull(gun.pick("b"), "level");
    }

    @Test
    @Tag("MGUN-17")
    @DisplayName("MGUN-17: older reads decay, so a robot that changes how it moves hands back to the field gun")
    void pickDecays() {
        for (int i = 0; i < 30; i++) gun.scoreExperts("a", hits(false, true, false, false));
        assertNotNull(gun.pick("a"));
        for (int i = 0; i < 60; i++) gun.scoreExperts("a", hits(true, false, false, false));
        assertNull(gun.pick("a"));
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
