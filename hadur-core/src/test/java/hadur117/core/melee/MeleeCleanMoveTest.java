package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyTracker;
import java.awt.geom.Point2D;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MMOVE-25: Diamond's melee mover in place of Hadur's, off a team. */
class MeleeCleanMoveTest {

    private final MinimumRiskMovement move = new MinimumRiskMovement(field(1000, 1000));
    private final EnemyTracker tracker = new EnemyTracker(field(1000, 1000));

    @Test
    @Tag("MMOVE-25")
    @DisplayName("MMOVE-25 ships off")
    void shipsOff() {
        assertFalse(MinimumRiskMovement.MELEE_CLEAN);
    }

    @Test
    @Tag("MMOVE-25")
    @DisplayName("MMOVE-25: a point near an opponent is riskier than one far from it, and heading at it costs twice heading across it")
    void risk() {
        EnemyInfo a = scan(tracker, "a", 500, 800, 100, 1);
        Point2D.Double me = pt(500, 500);
        List<EnemyInfo> one = List.of(a);
        assertTrue(move.cleanRisk(pt(500, 700), 0, me, 100, one) > move.cleanRisk(pt(500, 300), Math.PI, me, 100, one));
        // The same point: heading at it costs (1 + |cos 0|) = 2, across it 1.
        Point2D.Double toward = pt(500, 550);
        assertEquals(2.0, move.cleanRisk(toward, 0, me, 100, one) / move.cleanRisk(toward, Math.PI / 2, me, 100, one), 1e-9);
    }

    @Test
    @Tag("MMOVE-25")
    @DisplayName("MMOVE-25: off a team the destination runs away from a lone opponent, inside the field, at no more than the nearest robot's distance")
    void movesAway() {
        move.clean(true);
        EnemyInfo a = scan(tracker, "a", 500, 700, 100, 1);
        Point2D.Double me = pt(500, 500);
        Point2D.Double d = move.chooseDestination(me, 100, 3, List.of(a), 7, null);
        assertTrue(d.distance(a.location) > me.distance(a.location), "away from it");
        assertTrue(d.distance(me) <= 200 + 1e-9);
        assertFalse(move.cleanHitsWall(me, d));
    }

    @Test
    @Tag("MMOVE-25")
    @DisplayName("MMOVE-25: a point the robot would drive out of the field through is a wall hit")
    void wall() {
        assertTrue(move.cleanHitsWall(pt(30, 500), pt(-100, 500)));
        assertFalse(move.cleanHitsWall(pt(500, 500), pt(400, 500)));
    }
}
