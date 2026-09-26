package hadur2.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.Telemetry;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * RADAR-1: 1.20 lost the enemy for the rest of a round when a skipped turn broke its radar
 * lock. The core now sweeps toward the last bearing on any tick after a missed scan.
 */
@Tag("RADAR-1")
class RadarReacquireTest {

    private HadurCore core;

    private static BotInput input(long time, double radarHeading, BotEvent... events) {
        return new BotInput(time, 0, 400, 300, 0, 0, 100, 0, 0.1, 0, 0, radarHeading, 1,
            List.of(events));
    }

    private static BotEvent.Scan scan(double bearing) {
        return new BotEvent.Scan("enemy", bearing, 300, 100, 0, 0);
    }

    @BeforeEach
    void setUp() {
        core = new HadurCore(800, 600, 1, Telemetry.NONE);
        core.newRound(0);
    }

    @Test
    @DisplayName("keeps the lock without sweeping while scans arrive every tick")
    void noSweepWhileLocked() {
        for (long t = 1; t <= 20; t++) core.tick(input(t, 1.0, scan(1.0)));
        assertEquals(0, core.stats().radarReacquired);
    }

    @Test
    @DisplayName("tolerates the one tick a scan is still in flight")
    void oneTickGrace() {
        core.tick(input(1, 1.0, scan(1.0)));
        core.tick(input(2, 1.0));
        assertEquals(0, core.stats().radarReacquired);
    }

    @Test
    @DisplayName("sweeps clockwise toward an enemy last seen to the right")
    void sweepsRight() {
        core.tick(input(1, 0.0, scan(1.0)));
        core.tick(input(2, 0.0));
        BotOrders o = core.tick(input(3, 0.0));
        assertEquals(Double.POSITIVE_INFINITY, o.radarTurn());
        assertEquals(1, core.stats().radarReacquired);
    }

    @Test
    @DisplayName("sweeps anticlockwise toward an enemy last seen to the left")
    void sweepsLeft() {
        core.tick(input(1, 0.0, scan(-1.0)));
        core.tick(input(2, 0.0));
        BotOrders o = core.tick(input(3, 0.0));
        assertEquals(Double.NEGATIVE_INFINITY, o.radarTurn());
    }

    @Test
    @DisplayName("keeps sweeping every tick until the enemy is scanned, then stops")
    void sweepsUntilFound() {
        core.tick(input(1, 0.0, scan(1.0)));
        for (long t = 2; t <= 10; t++) core.tick(input(t, 0.0));
        assertEquals(8, core.stats().radarReacquired);
        BotOrders locked = core.tick(input(11, 1.0, scan(1.0)));
        assertTrue(Double.isFinite(locked.radarTurn()));
        core.tick(input(12, 1.0, scan(1.0)));
        assertEquals(8, core.stats().radarReacquired);
    }

    @Test
    @DisplayName("forgets the old bearing in a new round")
    void newRoundResets() {
        core.tick(input(1, 0.0, scan(1.0)));
        core.newRound(1);
        core.tick(input(1, 0.0));
        core.tick(input(2, 0.0));
        assertEquals(0, core.stats().radarReacquired);
    }
}
