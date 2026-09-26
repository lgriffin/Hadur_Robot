package hadur117.melee;

import static hadur117.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class MeleeRadarTest {

    @Test
    void sweepsUntilEveryOpponentHasBeenSeen() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "a", 100, 100, 100, 0);
        double turn = new MeleeRadar().radarTurn(pt(400, 300), 0, tracker, 3);
        assertEquals(Double.POSITIVE_INFINITY, turn);
    }

    @Test
    void turnsTowardTheStalestOpponent() {
        EnemyTracker tracker = new EnemyTracker();
        // West of us, scanned longest ago.
        scan(tracker, "west", 100, 300, 100, 0);
        scan(tracker, "east", 700, 300, 100, 5);
        MeleeRadar radar = new MeleeRadar();
        // Radar facing north: west is anticlockwise.
        assertEquals(Double.NEGATIVE_INFINITY, radar.radarTurn(pt(400, 300), 0, tracker, 2));
    }

    @Test
    void everyOpponentIsScannedAtLeastOnceEveryEightTicks() {
        Map<String, java.awt.geom.Point2D.Double> layouts[] = new Map[] {
            Map.of("a", pt(100, 100), "b", pt(700, 100), "c", pt(700, 500), "d", pt(100, 500)),
            Map.of("a", pt(500, 320), "b", pt(520, 280), "c", pt(700, 500), "d", pt(150, 450)),
            Map.of("a", pt(420, 550), "b", pt(380, 560), "c", pt(400, 50), "d", pt(90, 300))
        };
        for (Map<String, java.awt.geom.Point2D.Double> robots : layouts) {
            EnemyTracker tracker = new EnemyTracker();
            RadarSim sim = new RadarSim(tracker, pt(400, 300), new LinkedHashMap<>(robots));
            sim.run(200);
            assertTrue(sim.sawAll());
            assertTrue(sim.worstGap() <= 8, "worst gap " + sim.worstGap() + " for " + robots);
            assertEquals(4, tracker.alive().size());
        }
    }
}
