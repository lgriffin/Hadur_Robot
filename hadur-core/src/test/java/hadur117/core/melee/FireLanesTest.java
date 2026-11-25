package hadur117.core.melee;

import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import hadur117.core.world.EnemyInfo;
import hadur117.core.world.EnemyTracker;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MMOVE-31: the fire lanes, scored at a candidate point. */
@Tag("MMOVE-31")
class FireLanesTest {

    private final MinimumRiskMovement move = new MinimumRiskMovement(field(1000, 1000));

    private MinimumRiskMovement.View view(EnemyTracker tracker) {
        return new MinimumRiskMovement.View(pt(100, 100), 100, 10, 3, tracker.alive(), List.of(),
            MeleeStrategy.Plan.normal());
    }

    @Test
    @DisplayName("MMOVE-31: a point behind a shooter's nearest target, on its line, pays; one off every lane does not")
    void behindTheTargetPays() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "s", 500, 200, 100, 10);
        scan(tracker, "t", 500, 400, 100, 10);
        scan(tracker, "u", 900, 900, 100, 10);
        MinimumRiskMovement.View v = view(tracker);
        double behind = move.laneRisk(pt(500, 650), v);
        double aside = move.laneRisk(pt(150, 650), v);
        assertTrue(behind > 0, "behind t: " + behind);
        assertTrue(behind > 3 * aside, "behind " + behind + " aside " + aside);
    }

    @Test
    @DisplayName("MMOVE-31: Hadur's own lane is left to the surfer, and an unarmed shooter has no lanes")
    void ownLaneAndUnarmed() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "s", 500, 500, 0, 10);
        scan(tracker, "t", 800, 500, 100, 10);
        MinimumRiskMovement.View v = view(tracker);
        MinimumRiskMovement.lanes(v);
        List<EnemyInfo> alive = tracker.alive();
        assertNull(v.laneBearing[alive.indexOf(tracker.get("s"))], "s has no energy to fire");
        int t = alive.indexOf(tracker.get("t"));
        // t's only other target is s; Hadur's share is left out, so the weight is under one.
        assertEquals(1, v.laneWeight[t].length);
        assertTrue(v.laneWeight[t][0] < 1.0);
    }

    @Test
    @DisplayName("MMOVE-31: the lanes are off by default, so the melee mover plays as before")
    void offByDefault() {
        assertFalse(MinimumRiskMovement.FIRE_LANES);
    }
}
