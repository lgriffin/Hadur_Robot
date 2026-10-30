package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Point2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MMOVE-19: the melee surfer learns a shooter's aim from its hits on other opponents. */
class MeleeCrossTest {

    private static final Point2D.Double ME = new Point2D.Double(100, 100);

    /** a fires power 2 at tick 10 from (500, 900); b, 400 px away, is scanned until it loses {@code loss} at 40. */
    private static MeleeController fight(boolean cross, double loss, Point2D.Double bAt) {
        MeleeController c = new MeleeController(field(1000, 1000));
        c.cross(cross);
        c.onScan("a", pt(500, 900), ME.distance(500, 900), 100, 0, 0, 10);
        c.onScan("b", bAt, ME.distance(bAt), 100, 0, 8, 10);
        c.onScan("a", pt(500, 900), ME.distance(500, 900), 98, 0, 0, 11);
        for (long t : new long[] {20, 30, 38}) c.onScan("b", bAt, ME.distance(bAt), 100, 0, 8, t);
        c.onScan("b", bAt, ME.distance(bAt), 100 - loss, 0, 8, 40);
        return c;
    }

    @Test
    @Tag("MMOVE-19")
    @DisplayName("MMOVE-19 ships off; on, a loss a shot's damage and wave explain teaches its shooter")
    void learnsFromHitsOnOthers() {
        assertFalse(MeleeController.MELEE_CROSS);
        double hit = hadur117.core.physics.Rules.getBulletDamage(2.0);
        assertEquals(1, fight(true, hit, pt(500, 500)).danger().size("a"), "a's hit on b is learnt");
        assertEquals(0, fight(false, hit, pt(500, 500)).danger().size("a"), "off: nothing learnt");
        assertEquals(0, fight(true, hit + 1, pt(500, 500)).danger().size("a"), "a loss no shot's damage explains");
        assertEquals(0, fight(true, hit, pt(500, 100)).danger().size("a"), "a's wave has not reached b");
        assertEquals(0, fight(true, hit, pt(500, 500)).danger().size("b"), "a robot never learns from its own loss");
    }
}
