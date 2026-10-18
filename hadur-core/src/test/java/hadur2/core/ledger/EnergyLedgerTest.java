package hadur2.core.ledger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.physics.Rules;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/** WAVE-1 and WAVE-2: the ledger turns only bullet spending into waves. */
class EnergyLedgerTest {

    private static final double MID_X = 400;
    private static final double MID_Y = 300;
    private static final double DELTA = 1e-9;

    private EnergyLedger ledger;

    private long tick;

    /** Scans on the next tick, as the radar does while it holds the lock. */
    private EnergyLedger.Reading next(EnergyLedger l, double energy, double velocity,
                                      double x, double y) {
        return l.scan(++tick, energy, velocity, x, y);
    }

    @BeforeEach
    void setUp() {
        ledger = new EnergyLedger(800, 600);
        ledger.newRound();
        next(ledger, 100, 8, MID_X, MID_Y);
    }

    @Test
    @Tag("WAVE-1")
    @DisplayName("the first scan of a round only sets the baseline")
    void firstScanIsBaseline() {
        EnergyLedger fresh = new EnergyLedger(800, 600);
        fresh.newRound();
        assertSame(EnergyLedger.Reading.FIRST, next(fresh, 40, 0, MID_X, MID_Y));
        fresh.newRound();
        assertSame(EnergyLedger.Reading.FIRST, next(fresh, 90, 0, MID_X, MID_Y));
    }

    @Test
    @Tag("WAVE-1")
    @DisplayName("a plain drop is a shot of that power")
    void plainShot() {
        EnergyLedger.Reading r = next(ledger, 98.1, 8, MID_X, MID_Y);
        assertTrue(r.shot());
        assertEquals(1.9, r.corrected(), DELTA);
        assertFalse(r.phantom());
        assertFalse(r.hidden());
    }

    @Test
    @Tag("WAVE-3")
    @DisplayName("WAVE-3: a clean shot with no wall hit is not uncertain")
    void plainShotIsNotUncertain() {
        EnergyLedger.Reading r = next(ledger, 98.1, 8, MID_X, MID_Y);
        assertTrue(r.shot());
        assertFalse(r.uncertain());
    }

    /** A ledger whose enemy fired a sure shot of {@code sure} and now moves at 6 px/tick. */
    private EnergyLedger afterSureShot(double sure) {
        EnergyLedger l = new EnergyLedger(800, 600);
        l.newRound();
        next(l, 100, 6, MID_X, MID_Y);
        if (sure > 0) {
            EnergyLedger.Reading r = next(l, 100 - sure, 6, MID_X, MID_Y);
            assertTrue(r.shot() && !r.uncertain());
        }
        return l;
    }

    @Test
    @Tag("SHIELD-14")
    @DisplayName("SHIELD-14: an uncertain shot's guess is the wall split nearest the last sure shot")
    void guessFollowsLastSureShot() {
        EnergyLedger l = afterSureShot(2.2031);
        double energy = 100 - 2.2031 - 3.1947;
        EnergyLedger.Reading r = next(l, energy, 0, 18, MID_Y);
        assertTrue(r.uncertain());
        assertEquals(1.1947, r.corrected(), 1e-4); // wall 2.0 at the scanned speed 6
        assertEquals(2.1947, r.guess(), 1e-4);     // wall 1.0 at impact speed 4
    }

    @Test
    @Tag("SHIELD-14")
    @DisplayName("SHIELD-14: with no sure shot yet the guess is the corrected power")
    void guessWithoutReference() {
        EnergyLedger l = afterSureShot(0);
        EnergyLedger.Reading r = next(l, 100 - 3.1947, 0, 18, MID_Y);
        assertTrue(r.uncertain());
        assertEquals(r.corrected(), r.guess(), 0);
    }

    @Test
    @Tag("SHIELD-14")
    @DisplayName("SHIELD-14: a sure reading's guess is its corrected power, and a new round forgets the sure shot")
    void guessOfSureReadingAndReset() {
        EnergyLedger l = afterSureShot(0);
        EnergyLedger.Reading sure = next(l, 100 - 1.9, 6, MID_X, MID_Y);
        assertEquals(sure.corrected(), sure.guess(), 0);
        l.newRound();
        next(l, 100, 6, MID_X, MID_Y);
        EnergyLedger.Reading r = next(l, 100 - 3.1947, 0, 18, MID_Y);
        assertTrue(r.uncertain());
        assertEquals(r.corrected(), r.guess(), 0);
    }

    @Nested
    @Tag("WAVE-1")
    @DisplayName("explained drops")
    class Explained {

        @Test
        @DisplayName("damage from our bullet is not a shot")
        void ourBulletHit() {
            ledger.ourBulletHit(0.5); // 2 damage: 1.20 read this as a 2.0 shot
            EnergyLedger.Reading r = next(ledger, 98, 8, MID_X, MID_Y);
            assertFalse(r.shot());
            assertTrue(r.phantom());
            assertEquals(0, r.corrected(), DELTA);
        }

        @Test
        @DisplayName("our hit and their shot in the same tick leave just the shot")
        void hitAndShot() {
            ledger.ourBulletHit(1.0); // 4 damage
            EnergyLedger.Reading r = next(ledger, 100 - 4 - 1.5, 8, MID_X, MID_Y);
            assertTrue(r.shot());
            assertEquals(1.5, r.corrected(), DELTA);
        }

        @Test
        @DisplayName("their refund for hitting us uncovers a shot the raw drop hid")
        void refundHidesShot() {
            ledger.enemyBulletHitUs(2.0); // +6
            EnergyLedger.Reading r = next(ledger, 100 + 6 - 3.0, 8, MID_X, MID_Y);
            assertTrue(r.shot());
            assertTrue(r.hidden());
            assertEquals(3.0, r.corrected(), DELTA);
        }

        @Test
        @DisplayName("a collision is not a shot")
        void collision() {
            ledger.robotsCollided();
            EnergyLedger.Reading r = next(ledger, 100 - Rules.ROBOT_HIT_DAMAGE, 0, MID_X, MID_Y);
            assertFalse(r.shot());
            assertTrue(r.phantom());
        }

        @Test
        @DisplayName("stopping dead at a wall is wall damage, not a shot")
        void wallHit() {
            double wall = Rules.getWallHitDamage(8); // 3
            EnergyLedger.Reading r = next(ledger, 100 - wall, 0, 18, MID_Y);
            assertEquals(wall, r.wallDamage(), DELTA);
            assertFalse(r.shot());
            assertTrue(r.phantom());
        }

        @ParameterizedTest(name = "last seen at {0}, struck at {1}")
        @org.junit.jupiter.params.provider.CsvSource({"-3, 4", "2, 3", "5, 3", "8, 8", "7.5, 8"})
        @DisplayName("a wall hit is explained at any speed the enemy could reach that tick")
        void wallHitAtImpactSpeed(double lastSeen, double impact) {
            next(ledger, 100, lastSeen, MID_X, MID_Y);
            double wall = Rules.getWallHitDamage(impact);
            EnergyLedger.Reading r = next(ledger, 100 - wall, 0, MID_X, 582);
            assertEquals(wall, r.wallDamage(), DELTA);
            assertFalse(r.shot());
        }

        @Test
        @DisplayName("a shot fired as the enemy hits a wall is still found")
        void shotAtWall() {
            double wall = Rules.getWallHitDamage(8);
            EnergyLedger.Reading r = next(ledger, 100 - wall - 1.7, 0, 18, MID_Y);
            assertTrue(r.shot());
            assertEquals(1.7, r.corrected(), DELTA);
        }

        @Test
        @Tag("WAVE-3")
        @DisplayName("WAVE-3: a shot found alongside a wall hit is marked uncertain")
        void shotAtWallIsUncertain() {
            double wall = Rules.getWallHitDamage(8);
            EnergyLedger.Reading r = next(ledger, 100 - wall - 1.7, 0, 18, MID_Y);
            assertTrue(r.shot());
            assertTrue(r.uncertain(), () -> "a wall-hit-coincident shot should be flagged: " + r);
        }

        @Test
        @DisplayName("braking to a stop at a wall over missed scans is not a wall hit")
        void brakingOverScanGap() {
            ledger.scan(tick += 1, 100, 8, 18, MID_Y);
            // Four ticks later: 8 -> 0 is ordinary braking, so the 3.0 drop is a shot.
            EnergyLedger.Reading r = ledger.scan(tick += 4, 97, 0, 18, MID_Y);
            assertEquals(0, r.wallDamage(), DELTA);
            assertTrue(r.shot());
            assertEquals(3.0, r.corrected(), DELTA);
        }

        @Test
        @DisplayName("a stop too sudden to be braking over a scan gap is still a wall hit")
        void wallHitOverScanGap() {
            ledger.scan(tick += 1, 100, 8, 18, MID_Y);
            // Two ticks can shed at most 4 of the 8: the enemy hit the wall.
            EnergyLedger.Reading r = ledger.scan(tick += 2, 100 - Rules.getWallHitDamage(7),
                0, 18, MID_Y);
            assertEquals(Rules.getWallHitDamage(7), r.wallDamage(), DELTA);
            assertFalse(r.shot());
        }

        @ParameterizedTest(name = "last seen at {0}, struck at {1}, fired {2}")
        @org.junit.jupiter.params.provider.CsvSource({"3, 4, 3.0", "7, 8, 3.0", "5, 3, 0.1"})
        @DisplayName("a shot fired while striking a wall at another speed is still a wave")
        void shotWhileStrikingWall(double lastSeen, double impact, double power) {
            next(ledger, 100, lastSeen, MID_X, MID_Y);
            EnergyLedger.Reading r = next(ledger, 100 - Rules.getWallHitDamage(impact) - power,
                0, 18, MID_Y);
            assertTrue(r.shot(), () -> "no wave from " + r);
        }

        @Test
        @DisplayName("stopping dead in open field is not a wall hit")
        void openFieldStop() {
            EnergyLedger.Reading r = next(ledger, 97, 0, MID_X, MID_Y);
            assertEquals(0, r.wallDamage(), DELTA);
            assertTrue(r.shot());
        }

        @Test
        @DisplayName("braking normally next to a wall is not a wall hit")
        void brakingAtWall() {
            next(ledger, 100, 2, 18, MID_Y);
            EnergyLedger.Reading r = next(ledger, 98, 0, 18, MID_Y);
            assertEquals(0, r.wallDamage(), DELTA);
            assertTrue(r.shot());
        }

        @Test
        @DisplayName("the corrections apply to one scan only")
        void correctionsReset() {
            ledger.ourBulletHit(3.0);
            next(ledger, 100 - Rules.getBulletDamage(3.0), 8, MID_X, MID_Y);
            EnergyLedger.Reading r = next(ledger, 100 - Rules.getBulletDamage(3.0) - 2, 8,
                MID_X, MID_Y);
            assertTrue(r.shot());
            assertEquals(2, r.corrected(), DELTA);
        }
    }

    @Nested
    @Tag("WAVE-2")
    @DisplayName("drops outside [0.1, 3.0]")
    class OutOfRange {

        @ParameterizedTest
        @ValueSource(doubles = {0, 0.05, 0.0999, 3.01, 4, 16, -1})
        @DisplayName("are not shots")
        void notShots(double drop) {
            assertFalse(next(ledger, 100 - drop, 8, MID_X, MID_Y).shot());
        }

        @ParameterizedTest
        @ValueSource(doubles = {0.1, 0.5, 1.0, 1.95, 3.0})
        @DisplayName("bounds and powers inside are shots")
        void shots(double drop) {
            assertTrue(next(ledger, 100 - drop, 8, MID_X, MID_Y).shot());
        }

        @Test
        @DisplayName("a 0.1 shot that rounds to just under 0.1 still counts")
        void roundedMinimum() {
            EnergyLedger l = new EnergyLedger(800, 600);
            l.newRound();
            next(l, 0.30000000000000004, 8, MID_X, MID_Y);
            assertTrue(next(l, 0.2, 8, MID_X, MID_Y).shot());
            assertTrue(EnergyLedger.isShot(0.09999999999999998));
        }
    }

    /** Offers our energy for the next tick(s) of a duel and scans the enemy on the last one. */
    @Nested
    @Tag("WAVE-5")
    @DisplayName("WAVE-5: the inactivity drain")
    class InactivityDrain {

        private void ours(long time, double energy, boolean explained) {
            ledger.ourTick(time, energy, explained);
        }

        @Test
        @DisplayName("a drain turn takes 0.1 off the enemy's drop: no phantom shot")
        void drainIsNotAShot() {
            ours(1, 100, false);
            ours(2, 99.9, false);
            EnergyLedger.Reading r = ledger.scan(2, 99.9, 8, MID_X, MID_Y);
            assertFalse(r.shot());
            assertEquals(0.1, r.raw(), DELTA);
            assertTrue(r.phantom());
        }

        @Test
        @DisplayName("a 2.0 shot during the drain reads as 2.0, not 2.1")
        void shotDuringDrain() {
            ours(1, 100, false);
            ours(2, 99.9, false);
            EnergyLedger.Reading r = ledger.scan(2, 97.9, 8, MID_X, MID_Y);
            assertTrue(r.shot());
            assertEquals(2.0, r.corrected(), DELTA);
        }

        @Test
        @DisplayName("our own 0.1 shot explains our drop: not a drain")
        void ourShotIsNotDrain() {
            ours(1, 100, false);
            ours(2, 99.9, true);
            EnergyLedger.Reading r = ledger.scan(2, 99.9, 8, MID_X, MID_Y);
            assertTrue(r.shot());
            assertEquals(0.1, r.corrected(), DELTA);
        }

        @Test
        @DisplayName("no drain when our energy did not fall by 0.1")
        void noDrop() {
            ours(1, 100, false);
            ours(2, 100, false);
            assertTrue(ledger.scan(2, 99.9, 8, MID_X, MID_Y).shot());
            ours(3, 99.5, false);
            assertTrue(ledger.scan(3, 99.4, 8, MID_X, MID_Y).shot());
        }

        @Test
        @DisplayName("scans skipping ticks: each drain tick since the last scan counts")
        void gapOfSeveralTicks() {
            ours(1, 100, false);
            ours(2, 99.9, false);
            ours(3, 99.8, false);
            ours(4, 99.7, false);
            // Three drain ticks (0.3) and a 1.5 shot, enemy scanned only on tick 4.
            EnergyLedger.Reading r = ledger.scan(4, 100 - 0.3 - 1.5, 8, MID_X, MID_Y);
            assertTrue(r.shot());
            assertEquals(1.5, r.corrected(), DELTA);
        }

        @Test
        @DisplayName("drain ticks are used by one scan only")
        void clearedByScan() {
            ours(1, 100, false);
            ours(2, 99.9, false);
            ledger.scan(2, 99.9, 8, MID_X, MID_Y);
            ours(3, 99.9, false);
            assertTrue(ledger.scan(3, 99.8, 8, MID_X, MID_Y).shot());
        }

        @Test
        @DisplayName("a tick we were not offered is not compared across the gap")
        void gapInOurTicks() {
            ours(1, 100, false);
            ours(5, 99.9, false);
            assertTrue(ledger.scan(5, 99.9, 8, MID_X, MID_Y).shot());
        }
    }
}
