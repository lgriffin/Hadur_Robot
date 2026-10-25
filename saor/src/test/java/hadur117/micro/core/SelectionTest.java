package hadur117.micro.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import robocode.util.Utils;

class SelectionTest {

    @Property
    @Tag("SAOR-3")
    void aNearerRobotIsAdoptedAndTheTargetIsKept(@ForAll @DoubleRange(min = 36, max = 1415) double distance,
            @ForAll @DoubleRange(min = 36, max = 1415) double targetDistance) {
        assertEquals(distance < targetDistance, Selection.adopt(distance, targetDistance, false));
        assertTrue(Selection.adopt(distance, targetDistance, true), "the target is kept however far");
    }

    @Property
    @Tag("SAOR-4")
    void afterADeathAnyRobotIsAdopted(@ForAll @DoubleRange(min = 36, max = 1415) double distance) {
        assertTrue(Selection.adopt(distance, Selection.afterDeath(), false));
        assertEquals(Double.POSITIVE_INFINITY, Selection.afterDeath(), "the radar is released to spin");
    }

    @Property
    @Tag("SAOR-5")
    void theRadarIsHeldOnlyWhileTheGunIsAboutToFire(@ForAll @DoubleRange(min = 0, max = 3) double heat) {
        assertEquals(heat < 1, Selection.holdRadar(heat));
    }

    @Property
    @Tag("SAOR-5")
    void theRadarTurnsTowardTheTarget(@ForAll @DoubleRange(min = -20, max = 20) double bearing,
            @ForAll @DoubleRange(min = -20, max = 20) double radar) {
        double off = Utils.normalRelativeAngle(bearing - radar);
        if (Math.abs(Math.sin(bearing - radar)) < 1e-12) return;   // dead ahead or behind: either way is right
        double turn = Selection.radarTurn(bearing, radar);
        assertTrue(Double.isInfinite(turn));
        assertEquals(Math.signum(off), Math.signum(turn), "off by " + off);
    }
}
