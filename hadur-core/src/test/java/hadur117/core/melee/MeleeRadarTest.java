package hadur117.core.melee;

import hadur117.core.world.EnemyTracker;
import static hadur117.core.melee.Fixtures.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeleeRadarTest {

    @Test
    @Tag("MRADAR-1")
    void sweepsUntilEveryOpponentHasBeenSeen() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "a", 100, 100, 100, 0);
        double turn = new MeleeRadar().radarTurn(pt(400, 300), 0, tracker, 3);
        assertEquals(Double.POSITIVE_INFINITY, turn);
    }

    /** Five enemies, all seen: the target "west" last at tick 4, the rest at tick 6. */
    private static EnemyTracker fiveSeen() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "west", 100, 300, 100, 4);
        scan(tracker, "a", 700, 300, 100, 6);
        scan(tracker, "b", 400, 600, 100, 6);
        scan(tracker, "c", 400, 50, 100, 6);
        scan(tracker, "d", 700, 600, 100, 6);
        return tracker;
    }

    @Test
    @Tag("MRADAR-3")
    void lookAtTheTargetBeforeATeamShot() {
        MeleeRadar radar = new MeleeRadar();
        double spin = radar.radarTurn(pt(400, 300), 0, fiveSeen(), 5, null, 6, true, 0.1, "west");
        if (MeleeRadar.TEAM_LOOK) {
            // Radar facing north, the target west and two ticks old, the gun about to fire: turn to it.
            assertEquals(Double.NEGATIVE_INFINITY, spin);
        } else {
            assertEquals(Double.POSITIVE_INFINITY, spin);
        }
    }

    @Test
    @Tag("MRADAR-3")
    void noLookOffATeamWithAHotGunOrAFreshTarget() {
        // Off a team, as solo melee always is: the spin, whatever the switch.
        assertEquals(Double.POSITIVE_INFINITY,
            new MeleeRadar().radarTurn(pt(400, 300), 0, fiveSeen(), 5, null, 6, false, 0.1, "west"));
        // A gun three ticks or more from firing: the spin.
        assertEquals(Double.POSITIVE_INFINITY,
            new MeleeRadar().radarTurn(pt(400, 300), 0, fiveSeen(), 5, null, 6, true, 0.5, "west"));
        // A target scanned a tick ago (a teammate's sighting): the spin.
        assertEquals(Double.POSITIVE_INFINITY,
            new MeleeRadar().radarTurn(pt(400, 300), 0, fiveSeen(), 5, null, 5, true, 0.1, "west"));
    }

    @Test
    @Tag("MRADAR-2")
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
    @Tag("MRADAR-1")
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

    @Test
    @Tag("MRADAR-1")
    void withFourOrMoreItNeverReverses() {
        EnemyTracker tracker = new EnemyTracker();
        // Everyone seen; the stalest is anticlockwise, but with four alive it keeps spinning.
        scan(tracker, "west", 100, 300, 100, 0);
        scan(tracker, "a", 700, 300, 100, 5);
        scan(tracker, "b", 400, 600, 100, 5);
        scan(tracker, "c", 400, 50, 100, 5);
        MeleeRadar radar = new MeleeRadar();
        assertEquals(Double.POSITIVE_INFINITY, radar.radarTurn(pt(400, 300), 0, tracker, 4, null, 6));
    }

    @Test
    @Tag("MRADAR-2")
    void aWeakTargetIsRescannedFirst() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "west", 100, 300, 100, 3);
        // East is weak and three ticks old; west is older but not overdue.
        scan(tracker, "east", 700, 300, 10, 4);
        scan(tracker, "west", 100, 300, 100, 2);
        MeleeRadar radar = new MeleeRadar();
        assertEquals(Double.POSITIVE_INFINITY, radar.radarTurn(pt(400, 300), 0, tracker, 2, "east", 7));
        // Once west is a full sweep old, it comes first.
        assertEquals(Double.NEGATIVE_INFINITY, radar.radarTurn(pt(400, 300), 0, tracker, 2, "east", 10));
    }

    @Test
    @Tag("MRADAR-2")
    void sweepsOnPastWhereTheStalestWasUntilItIsFound() {
        EnemyTracker tracker = new EnemyTracker();
        scan(tracker, "north", 400, 600, 100, 1);
        scan(tracker, "east", 700, 300, 100, 5);
        MeleeRadar radar = new MeleeRadar();
        // Radar pointing west of north: turn right toward north's last bearing.
        assertEquals(Double.POSITIVE_INFINITY, radar.radarTurn(pt(400, 300), -0.3, tracker, 2, null, 6));
        // It swept past north's old bearing without a scan: north moved. Sweep on, don't reverse.
        assertEquals(Double.POSITIVE_INFINITY, radar.radarTurn(pt(400, 300), 0.5, tracker, 2, null, 7));
        // Found again: the stalest is chosen afresh.
        scan(tracker, "north", 380, 600, 100, 7);
        assertEquals(Double.NEGATIVE_INFINITY, radar.radarTurn(pt(400, 300), 2.5, tracker, 2, null, 8));
    }
}
