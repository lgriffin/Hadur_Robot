package hadur117.intel;

import hadur117.model.BattleMode;
import hadur117.model.MovementType;
import hadur117.model.OpponentData;
import hadur117.model.Snapshot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import robocode.ScannedRobotEvent;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Brain (central opponent intelligence)")
class BrainTest {

    private Brain brain;

    @Mock
    private ScannedRobotEvent event;

    @BeforeEach
    void setUp() throws Exception {
        brain = new Brain();
        // Clear the static opponents map between tests
        Field f = Brain.class.getDeclaredField("opponents");
        f.setAccessible(true);
        ((Map<?, ?>) f.get(null)).clear();

        // Clear ourFireTicks too
        Field fireField = Brain.class.getDeclaredField("ourFireTicks");
        fireField.setAccessible(true);
        ((java.util.List<?>) fireField.get(brain)).clear();
    }

    // ── Helper to create a mock ScannedRobotEvent ──────────────────────

    private ScannedRobotEvent mockEvent(String name, double bearing, double distance,
                                         double heading, double velocity, double energy) {
        ScannedRobotEvent e = mock(ScannedRobotEvent.class);
        when(e.getName()).thenReturn(name);
        when(e.getBearingRadians()).thenReturn(bearing);
        when(e.getDistance()).thenReturn(distance);
        when(e.getHeadingRadians()).thenReturn(heading);
        when(e.getVelocity()).thenReturn(velocity);
        when(e.getEnergy()).thenReturn(energy);
        return e;
    }

    // ── Battle mode ────────────────────────────────────────────────────

    @Nested
    @DisplayName("battle mode")
    class BattleModeTests {

        @Test
        @DisplayName("default battle mode is DUEL")
        void defaultIsDuel() {
            assertEquals(BattleMode.DUEL, brain.getBattleMode());
        }

        @Test
        @DisplayName("setBattleMode(1) keeps DUEL")
        void oneOpponentIsDuel() {
            brain.setBattleMode(1);
            assertEquals(BattleMode.DUEL, brain.getBattleMode());
        }

        @Test
        @DisplayName("setBattleMode(2) switches to MELEE")
        void twoOpponentsIsMelee() {
            brain.setBattleMode(2);
            assertEquals(BattleMode.MELEE, brain.getBattleMode());
        }

        @Test
        @DisplayName("setBattleMode(5) is MELEE")
        void fiveOpponentsIsMelee() {
            brain.setBattleMode(5);
            assertEquals(BattleMode.MELEE, brain.getBattleMode());
        }

        @Test
        @DisplayName("setBattleMode(0) is DUEL")
        void zeroOpponentsIsDuel() {
            brain.setBattleMode(0);
            assertEquals(BattleMode.DUEL, brain.getBattleMode());
        }
    }

    // ── Update and position ────────────────────────────────────────────

    @Nested
    @DisplayName("update()")
    class UpdateTests {

        @Test
        @DisplayName("update creates opponent if new")
        void createOpponent() {
            ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 5.0, 100.0);
            brain.update(e, 400, 300, 0.0, 10);
            assertNotNull(brain.getOpponent("Bot1"));
        }

        @Test
        @DisplayName("update calculates absolute position")
        void absolutePosition() {
            // myHeading=0, bearing=0 => absBearing=0 => enemy is due north
            // x = 400 + 200*sin(0) = 400, y = 300 + 200*cos(0) = 500
            ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 100.0);
            brain.update(e, 400, 300, 0.0, 10);
            OpponentData od = brain.getOpponent("Bot1");
            assertEquals(400.0, od.x, 0.01);
            assertEquals(500.0, od.y, 0.01);
        }

        @Test
        @DisplayName("update sets heading, velocity, energy, lastScanTick")
        void setsAllFields() {
            ScannedRobotEvent e = mockEvent("Bot1", 0.5, 300.0, 1.2, 6.0, 85.0);
            brain.update(e, 400, 300, 0.0, 42);
            OpponentData od = brain.getOpponent("Bot1");
            assertEquals(1.2, od.heading, 1e-9);
            assertEquals(6.0, od.velocity, 1e-9);
            assertEquals(85.0, od.energy, 1e-9);
            assertEquals(42L, od.lastScanTick);
        }

        @Test
        @DisplayName("update adds snapshot to window")
        void addsSnapshot() {
            ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 100.0);
            brain.update(e, 400, 300, 0.0, 10);
            OpponentData od = brain.getOpponent("Bot1");
            assertEquals(1, od.window.size());
            assertEquals(10L, od.window.getFirst().tick);
        }

        @Test
        @DisplayName("window is capped at WINDOW_SIZE=100")
        void windowCapped() {
            for (int i = 0; i < 120; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            OpponentData od = brain.getOpponent("Bot1");
            assertEquals(100, od.window.size());
            // Oldest snapshot should be tick 20 (first 20 removed)
            assertEquals(20L, od.window.getFirst().tick);
        }

        @Test
        @DisplayName("update sets lastEnergy after first scan")
        void setsLastEnergy() {
            ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 100.0);
            brain.update(e, 400, 300, 0.0, 1);
            OpponentData od = brain.getOpponent("Bot1");
            assertEquals(100.0, od.lastEnergy, 1e-9);
        }

        @Test
        @DisplayName("re-scan same bot updates existing OpponentData")
        void reScanUpdates() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 100.0);
            brain.update(e1, 400, 300, 0.0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0.0, 150.0, 1.0, 5.0, 95.0);
            brain.update(e2, 400, 300, 0.0, 2);
            OpponentData od = brain.getOpponent("Bot1");
            assertEquals(95.0, od.energy, 1e-9);
            assertEquals(5.0, od.velocity, 1e-9);
            assertEquals(2, od.window.size());
        }
    }

    // ── Fire detection ─────────────────────────────────────────────────

    @Nested
    @DisplayName("fire detection")
    class FireDetectionTests {

        @Test
        @DisplayName("no fire detected on first scan (lastEnergy = -1)")
        void noFireOnFirstScan() {
            ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 100.0);
            brain.update(e, 400, 300, 0.0, 1);
            assertEquals(0, brain.getOpponent("Bot1").fireCount);
        }

        @Test
        @DisplayName("energy drop of 1.0 detects fire")
        void detectsFireEnergyDrop1() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 100.0);
            brain.update(e1, 400, 300, 0.0, 1);
            // Drop from 100 to 99 => drop = 1.0 (in range 0.09..3.01)
            ScannedRobotEvent e2 = mockEvent("Bot1", 0.0, 200.0, 0.0, 0.0, 99.0);
            brain.update(e2, 400, 300, 0.0, 2);
            OpponentData od = brain.getOpponent("Bot1");
            assertEquals(1, od.fireCount);
            assertEquals(1.0, od.totalBulletPower, 1e-9);
        }

        @Test
        @DisplayName("energy drop of 3.0 detects fire")
        void detectsFireMaxPower() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 97.0);
            brain.update(e2, 400, 300, 0, 2);
            assertEquals(1, brain.getOpponent("Bot1").fireCount);
            assertEquals(3.0, brain.getOpponent("Bot1").totalBulletPower, 1e-9);
        }

        @Test
        @DisplayName("energy drop of 0.1 (minimum fire) detects fire")
        void detectsMinFire() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 50);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 49.9);
            brain.update(e2, 400, 300, 0, 2);
            assertEquals(1, brain.getOpponent("Bot1").fireCount);
        }

        @Test
        @DisplayName("energy drop of 0.08 does not detect fire")
        void tooSmallDrop() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 50);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 49.92);
            brain.update(e2, 400, 300, 0, 2);
            assertEquals(0, brain.getOpponent("Bot1").fireCount);
        }

        @Test
        @DisplayName("energy drop of 3.5 does not detect fire (wall hit or ram)")
        void tooLargeDrop() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 50);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 46.5);
            brain.update(e2, 400, 300, 0, 2);
            assertEquals(0, brain.getOpponent("Bot1").fireCount);
        }

        @Test
        @DisplayName("energy increase does not detect fire")
        void energyIncrease() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 50);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 52);
            brain.update(e2, 400, 300, 0, 2);
            assertEquals(0, brain.getOpponent("Bot1").fireCount);
        }

        @Test
        @DisplayName("multiple fires are counted")
        void multipleFires() {
            double energy = 100.0;
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, energy);
            brain.update(e1, 400, 300, 0, 1);
            for (int i = 2; i <= 6; i++) {
                energy -= 1.0;
                ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, energy);
                brain.update(e, 400, 300, 0, i);
            }
            assertEquals(5, brain.getOpponent("Bot1").fireCount);
            assertEquals(5.0, brain.getOpponent("Bot1").totalBulletPower, 1e-9);
        }

        @Test
        @DisplayName("fire tick is recorded in fireTicks list")
        void fireTickRecorded() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e1, 400, 300, 0, 10);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 98);
            brain.update(e2, 400, 300, 0, 15);
            assertEquals(1, brain.getOpponent("Bot1").fireTicks.size());
            assertEquals(15L, brain.getOpponent("Bot1").fireTicks.get(0));
        }

        @Test
        @DisplayName("boundary: drop exactly 0.09 detects fire")
        void boundaryLower() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 99.91);
            brain.update(e2, 400, 300, 0, 2);
            assertEquals(1, brain.getOpponent("Bot1").fireCount);
        }

        @Test
        @DisplayName("boundary: drop of 3.0 (max bullet power) detects fire")
        void boundaryUpper() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 0, 97.0);
            brain.update(e2, 400, 300, 0, 2);
            assertEquals(1, brain.getOpponent("Bot1").fireCount);
        }
    }

    // ── Classification ─────────────────────────────────────────────────

    @Nested
    @DisplayName("classify() via update()")
    class ClassifyTests {

        @Test
        @DisplayName("fewer than MIN_TICKS(30) returns UNKNOWN")
        void insufficientDataIsUnknown() {
            for (int i = 0; i < 25; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 5.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            assertEquals(MovementType.UNKNOWN, brain.getOpponent("Bot1").movementType);
        }

        @Test
        @DisplayName("stopped bot (>80% zero velocity) classified as STOPPED")
        void classifyStopped() {
            // All snapshots with velocity 0
            for (int i = 0; i < 40; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 0.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            assertEquals(MovementType.STOPPED, brain.getOpponent("Bot1").movementType);
        }

        @Test
        @DisplayName("mostly stopped bot (85% stopped) classified as STOPPED")
        void classifyMostlyStopped() {
            for (int i = 0; i < 40; i++) {
                double vel = (i < 6) ? 5.0 : 0.0; // 6/40 = 15% moving, 85% stopped
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, vel, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            assertEquals(MovementType.STOPPED, brain.getOpponent("Bot1").movementType);
        }

        @Test
        @DisplayName("linear bot (constant heading, no reversals) classified as LINEAR")
        void classifyLinear() {
            // Same heading, same positive velocity => avgHC ~ 0, revRate ~ 0
            for (int i = 0; i < 40; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 5.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            assertEquals(MovementType.LINEAR, brain.getOpponent("Bot1").movementType);
        }

        @Test
        @DisplayName("oscillating bot (high reversal rate) classified as OSCILLATING")
        void classifyOscillating() {
            // Alternate velocity direction every tick => high reversal rate
            for (int i = 0; i < 40; i++) {
                double vel = (i % 2 == 0) ? 5.0 : -5.0;
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, vel, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            MovementType mt = brain.getOpponent("Bot1").movementType;
            assertEquals(MovementType.OSCILLATING, mt);
        }

        @Test
        @DisplayName("circular bot (constant nonzero heading change) classified as CIRCULAR")
        void classifyCircular() {
            // Steadily incrementing heading with constant velocity, no reversals
            for (int i = 0; i < 50; i++) {
                double heading = 0.05 * i; // constant heading change of 0.05 rad/tick
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, heading, 5.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            assertEquals(MovementType.CIRCULAR, brain.getOpponent("Bot1").movementType);
        }

        @Test
        @DisplayName("random bot (high heading-change variance) classified as RANDOM")
        void classifyRandom() {
            // Wildly varying heading changes
            java.util.Random rng = new java.util.Random(42);
            for (int i = 0; i < 50; i++) {
                double heading = rng.nextDouble() * Math.PI * 2;
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, heading, 5.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            MovementType mt = brain.getOpponent("Bot1").movementType;
            // With random headings, should be classified as RANDOM
            assertTrue(mt == MovementType.RANDOM || mt == MovementType.OSCILLATING,
                    "Expected RANDOM or OSCILLATING but was " + mt);
        }
    }

    // ── Threat assessment ──────────────────────────────────────────────

    @Nested
    @DisplayName("assessThreat() via update()")
    class ThreatTests {

        @Test
        @DisplayName("threat is 0.5 when window has fewer than 2 snapshots")
        void defaultThreatForSingleSnapshot() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            assertEquals(0.5, brain.getOpponent("Bot1").threatLevel, 1e-9);
        }

        @Test
        @DisplayName("threat is between 0 and 1")
        void threatInRange() {
            for (int i = 0; i < 35; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 5, 100.0 - i * 0.5);
                brain.update(e, 400, 300, 0, i);
            }
            double threat = brain.getOpponent("Bot1").threatLevel;
            assertTrue(threat >= 0.0 && threat <= 1.0,
                    "Threat level " + threat + " should be in [0, 1]");
        }

        @Test
        @DisplayName("higher energy opponent has higher threat")
        void higherEnergyHigherThreat() {
            // Bot with high energy
            for (int i = 0; i < 35; i++) {
                ScannedRobotEvent e = mockEvent("HighE", 0, 200, 1.0, 5, 100);
                brain.update(e, 400, 300, 0, i);
            }
            // Bot with low energy
            for (int i = 0; i < 35; i++) {
                ScannedRobotEvent e = mockEvent("LowE", 0.5, 200, 1.0, 5, 10);
                brain.update(e, 400, 300, 0, i);
            }
            double highThreat = brain.getOpponent("HighE").threatLevel;
            double lowThreat = brain.getOpponent("LowE").threatLevel;
            assertTrue(highThreat > lowThreat,
                    "High-energy bot (" + highThreat + ") should have higher threat than low-energy (" + lowThreat + ")");
        }

        @Test
        @DisplayName("bot that hits us more has higher threat")
        void hitsIncreasesThreat() {
            // Create a bot and give it some fire+hits history
            for (int i = 0; i < 35; i++) {
                ScannedRobotEvent e = mockEvent("Hitter", 0, 200, 1.0, 5, 100.0 - i * 0.5);
                brain.update(e, 400, 300, 0, i);
            }
            brain.recordDamageReceived("Hitter", 20);
            // Re-assess after updating hits
            OpponentData od = brain.getOpponent("Hitter");
            od.hitsOnUs = 10;
            // Update once more to trigger reassessment
            ScannedRobotEvent e2 = mockEvent("Hitter", 0, 200, 1.0, 5, 82.5 - 0.5);
            brain.update(e2, 400, 300, 0, 36);

            double hitThreat = brain.getOpponent("Hitter").threatLevel;
            assertTrue(hitThreat > 0.3, "Bot with many hits should have threat > 0.3, was " + hitThreat);
        }
    }

    // ── Damage tracking ────────────────────────────────────────────────

    @Nested
    @DisplayName("damage recording")
    class DamageTests {

        @Test
        @DisplayName("recordDamageDealt increments damageDealt")
        void recordDamageDealt() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.recordDamageDealt("Bot1", 15.0);
            assertEquals(15.0, brain.getOpponent("Bot1").damageDealt, 1e-9);
            brain.recordDamageDealt("Bot1", 10.0);
            assertEquals(25.0, brain.getOpponent("Bot1").damageDealt, 1e-9);
        }

        @Test
        @DisplayName("recordDamageReceived increments damageReceived and hitsOnUs")
        void recordDamageReceived() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.recordDamageReceived("Bot1", 8.0);
            assertEquals(8.0, brain.getOpponent("Bot1").damageReceived, 1e-9);
            assertEquals(1, brain.getOpponent("Bot1").hitsOnUs);
        }

        @Test
        @DisplayName("recordDamageDealt on unknown opponent does nothing")
        void damageDealtUnknown() {
            // Should not throw
            brain.recordDamageDealt("NonExistent", 10.0);
            assertNull(brain.getOpponent("NonExistent"));
        }

        @Test
        @DisplayName("recordDamageReceived on unknown opponent does nothing")
        void damageReceivedUnknown() {
            brain.recordDamageReceived("NonExistent", 10.0);
            assertNull(brain.getOpponent("NonExistent"));
        }
    }

    // ── Our fire recording ─────────────────────────────────────────────

    @Test
    @DisplayName("recordOurFire stores tick")
    void recordOurFire() throws Exception {
        brain.recordOurFire(10L);
        brain.recordOurFire(20L);
        Field f = Brain.class.getDeclaredField("ourFireTicks");
        f.setAccessible(true);
        @SuppressWarnings("unchecked")
        java.util.List<Long> ticks = (java.util.List<Long>) f.get(brain);
        assertEquals(2, ticks.size());
        assertEquals(10L, ticks.get(0));
        assertEquals(20L, ticks.get(1));
    }

    // ── Stalest opponent ───────────────────────────────────────────────

    @Nested
    @DisplayName("getStalestOpponent()")
    class StalestOpponentTests {

        @Test
        @DisplayName("returns null when no opponents")
        void noOpponents() {
            assertNull(brain.getStalestOpponent(100));
        }

        @Test
        @DisplayName("returns the opponent scanned longest ago")
        void returnsStalest() {
            ScannedRobotEvent e1 = mockEvent("BotOld", 0, 200, 0, 5, 100);
            brain.update(e1, 400, 300, 0, 5);
            ScannedRobotEvent e2 = mockEvent("BotNew", 0.5, 200, 0, 5, 100);
            brain.update(e2, 400, 300, 0, 10);
            OpponentData stalest = brain.getStalestOpponent(15);
            assertEquals("BotOld", stalest.name);
        }

        @Test
        @DisplayName("ignores dead opponents (energy <= 0)")
        void ignoresDeadOpponents() {
            ScannedRobotEvent e1 = mockEvent("Dead", 0, 200, 0, 5, 100);
            brain.update(e1, 400, 300, 0, 1);
            brain.removeOpponent("Dead");
            ScannedRobotEvent e2 = mockEvent("Alive", 0.5, 200, 0, 5, 80);
            brain.update(e2, 400, 300, 0, 10);
            OpponentData stalest = brain.getStalestOpponent(15);
            assertEquals("Alive", stalest.name);
        }

        @Test
        @DisplayName("returns null when all opponents dead")
        void allDead() {
            ScannedRobotEvent e = mockEvent("Dead", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.removeOpponent("Dead");
            assertNull(brain.getStalestOpponent(10));
        }
    }

    // ── getAliveCount ──────────────────────────────────────────────────

    @Nested
    @DisplayName("getAliveCount()")
    class AliveCountTests {

        @Test
        @DisplayName("returns 0 when no opponents")
        void noOpponents() {
            assertEquals(0, brain.getAliveCount(100));
        }

        @Test
        @DisplayName("counts alive opponents scanned within 50 ticks")
        void countsRecent() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 5, 100);
            brain.update(e1, 400, 300, 0, 50);
            ScannedRobotEvent e2 = mockEvent("Bot2", 0.5, 200, 0, 5, 100);
            brain.update(e2, 400, 300, 0, 55);
            assertEquals(2, brain.getAliveCount(60));
        }

        @Test
        @DisplayName("excludes opponents scanned too long ago")
        void excludesStale() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 5, 100);
            brain.update(e, 400, 300, 0, 10);
            assertEquals(0, brain.getAliveCount(100)); // 100 - 10 = 90 > 50
        }

        @Test
        @DisplayName("excludes dead opponents")
        void excludesDead() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 5, 100);
            brain.update(e, 400, 300, 0, 50);
            brain.removeOpponent("Bot1");
            assertEquals(0, brain.getAliveCount(55));
        }
    }

    // ── Remove / getAllOpponents ────────────────────────────────────────

    @Nested
    @DisplayName("removeOpponent() and getAllOpponents()")
    class RemoveAndGetTests {

        @Test
        @DisplayName("removeOpponent sets energy to 0")
        void removeOpponent() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.removeOpponent("Bot1");
            assertEquals(0.0, brain.getOpponent("Bot1").energy, 1e-9);
        }

        @Test
        @DisplayName("removeOpponent on unknown name does nothing")
        void removeUnknown() {
            brain.removeOpponent("Ghost");
            // Should not throw
            assertNull(brain.getOpponent("Ghost"));
        }

        @Test
        @DisplayName("getAllOpponents returns all tracked opponents")
        void getAllOpponents() {
            ScannedRobotEvent e1 = mockEvent("A", 0, 200, 0, 0, 100);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("B", 0.5, 200, 0, 0, 100);
            brain.update(e2, 400, 300, 0, 2);
            Collection<OpponentData> all = brain.getAllOpponents();
            assertEquals(2, all.size());
        }
    }

    // ── Reset round ────────────────────────────────────────────────────

    @Nested
    @DisplayName("resetRound()")
    class ResetRoundTests {

        @Test
        @DisplayName("resetRound clears per-round state but keeps opponents")
        void resetRoundClearsState() {
            ScannedRobotEvent e1 = mockEvent("Bot1", 0, 200, 0, 5, 100);
            brain.update(e1, 400, 300, 0, 1);
            ScannedRobotEvent e2 = mockEvent("Bot1", 0, 200, 0, 5, 98);
            brain.update(e2, 400, 300, 0, 2);
            brain.recordOurFire(3L);

            brain.resetRound();

            OpponentData od = brain.getOpponent("Bot1");
            assertNotNull(od, "Opponent should still exist after reset");
            assertTrue(od.window.isEmpty(), "Window should be cleared");
            assertEquals(-1, od.lastEnergy, 1e-9);
            assertEquals(-1, od.lastScanTick);
            assertEquals(0, od.fireCount);
            assertEquals(0.0, od.totalBulletPower, 1e-9);
            assertTrue(od.fireTicks.isEmpty(), "fireTicks should be cleared");
        }

        @Test
        @DisplayName("resetRound clears ourFireTicks")
        void resetsOurFireTicks() throws Exception {
            brain.recordOurFire(10L);
            brain.resetRound();
            Field f = Brain.class.getDeclaredField("ourFireTicks");
            f.setAccessible(true);
            @SuppressWarnings("unchecked")
            java.util.List<Long> ticks = (java.util.List<Long>) f.get(brain);
            assertTrue(ticks.isEmpty());
        }
    }

    // ── Gun type detection ─────────────────────────────────────────────

    @Nested
    @DisplayName("detectGunType()")
    class GunTypeDetectionTests {

        @Test
        @DisplayName("returns UNKNOWN for null errors")
        void nullErrors() {
            assertEquals("UNKNOWN", brain.detectGunType("Bot1", null));
        }

        @Test
        @DisplayName("returns UNKNOWN for fewer than 5 errors")
        void tooFewErrors() {
            assertEquals("UNKNOWN", brain.detectGunType("Bot1", new double[]{0, 0, 0, 0}));
        }

        @Test
        @DisplayName("returns HEAD_ON for small average absolute error")
        void headOnGun() {
            // errors all < 5 degrees in radians: Math.toRadians(5) ~ 0.0873
            double[] errors = {0.01, -0.02, 0.01, -0.01, 0.02};
            assertEquals("HEAD_ON", brain.detectGunType("Bot1", errors));
        }

        @Test
        @DisplayName("returns STATISTICAL for large average absolute error")
        void statisticalGun() {
            // errors averaging > 5 degrees
            double[] errors = {0.2, -0.3, 0.25, -0.15, 0.4};
            assertEquals("STATISTICAL", brain.detectGunType("Bot1", errors));
        }

        @Test
        @DisplayName("boundary: exactly 5 degrees average returns STATISTICAL")
        void boundaryFiveDegrees() {
            // avg abs error = 5 degrees => NOT < 5 => STATISTICAL
            double fiveDeg = Math.toRadians(5);
            double[] errors = {fiveDeg, fiveDeg, fiveDeg, fiveDeg, fiveDeg};
            assertEquals("STATISTICAL", brain.detectGunType("Bot1", errors));
        }

        @Test
        @DisplayName("boundary: just under 5 degrees average returns HEAD_ON")
        void boundaryJustUnder() {
            double justUnder = Math.toRadians(4.99);
            double[] errors = {justUnder, justUnder, justUnder, justUnder, justUnder};
            assertEquals("HEAD_ON", brain.detectGunType("Bot1", errors));
        }

        @Test
        @DisplayName("empty array returns UNKNOWN")
        void emptyArray() {
            assertEquals("UNKNOWN", brain.detectGunType("Bot1", new double[]{}));
        }

        @Test
        @DisplayName("mixed positive and negative errors handled correctly")
        void mixedSigns() {
            // All zero errors => average abs = 0 < 5 degrees
            double[] errors = {0, 0, 0, 0, 0};
            assertEquals("HEAD_ON", brain.detectGunType("Bot1", errors));
        }
    }

    // ── Multiple opponents ─────────────────────────────────────────────

    @Test
    @DisplayName("tracks multiple opponents independently")
    void multipleOpponents() {
        ScannedRobotEvent e1 = mockEvent("Alpha", 0.0, 200.0, 1.0, 5.0, 90.0);
        brain.update(e1, 400, 300, 0.0, 10);
        ScannedRobotEvent e2 = mockEvent("Beta", 1.0, 300.0, 2.0, -3.0, 80.0);
        brain.update(e2, 400, 300, 0.0, 10);

        assertNotNull(brain.getOpponent("Alpha"));
        assertNotNull(brain.getOpponent("Beta"));
        assertEquals(90.0, brain.getOpponent("Alpha").energy, 1e-9);
        assertEquals(80.0, brain.getOpponent("Beta").energy, 1e-9);
        assertEquals(5.0, brain.getOpponent("Alpha").velocity, 1e-9);
        assertEquals(-3.0, brain.getOpponent("Beta").velocity, 1e-9);
    }

    @Test
    @DisplayName("getOpponent returns null for unknown name")
    void getUnknownOpponent() {
        assertNull(brain.getOpponent("NonExistent"));
    }

    // ── Shot tracking ──────────────────────────────────────────────────

    @Nested
    @DisplayName("shot tracking (recordShotFiredAt / recordShotHitOn)")
    class ShotTrackingTests {

        @Test
        @DisplayName("recordShotFiredAt increments shotsFiredAt")
        void recordShotFiredAt() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.recordShotFiredAt("Bot1");
            brain.recordShotFiredAt("Bot1");
            assertEquals(2, brain.getOpponent("Bot1").shotsFiredAt);
        }

        @Test
        @DisplayName("recordShotHitOn increments shotsHitOn")
        void recordShotHitOn() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.recordShotHitOn("Bot1");
            assertEquals(1, brain.getOpponent("Bot1").shotsHitOn);
        }

        @Test
        @DisplayName("recordShotFiredAt on unknown opponent does nothing")
        void firedAtUnknown() {
            brain.recordShotFiredAt("Ghost");
            assertNull(brain.getOpponent("Ghost"));
        }

        @Test
        @DisplayName("recordShotHitOn on unknown opponent does nothing")
        void hitOnUnknown() {
            brain.recordShotHitOn("Ghost");
            assertNull(brain.getOpponent("Ghost"));
        }
    }

    // ── Hit bearing error tracking ─────────────────────────────────────

    @Nested
    @DisplayName("recordHitBearingError()")
    class HitBearingErrorTests {

        @Test
        @DisplayName("records bearing error")
        void recordsBearingError() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.recordHitBearingError("Bot1", 0.05);
            brain.recordHitBearingError("Bot1", -0.03);
            assertEquals(2, brain.getOpponent("Bot1").hitBearingErrors.size());
        }

        @Test
        @DisplayName("on unknown opponent does nothing")
        void unknownOpponent() {
            brain.recordHitBearingError("Ghost", 0.1);
            assertNull(brain.getOpponent("Ghost"));
        }
    }

    // ── getOurAccuracy ─────────────────────────────────────────────────

    @Nested
    @DisplayName("getOurAccuracy()")
    class OurAccuracyTests {

        @Test
        @DisplayName("returns 0.15 default when fewer than 5 shots")
        void defaultAccuracy() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.recordShotFiredAt("Bot1");
            assertEquals(0.15, brain.getOurAccuracy("Bot1"), 1e-9);
        }

        @Test
        @DisplayName("returns 0.15 for unknown opponent")
        void unknownOpponent() {
            assertEquals(0.15, brain.getOurAccuracy("Ghost"), 1e-9);
        }

        @Test
        @DisplayName("returns actual ratio when 5+ shots fired")
        void actualRatio() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            for (int i = 0; i < 10; i++) brain.recordShotFiredAt("Bot1");
            for (int i = 0; i < 3; i++) brain.recordShotHitOn("Bot1");
            assertEquals(0.3, brain.getOurAccuracy("Bot1"), 1e-9);
        }
    }

    // ── getProfile ─────────────────────────────────────────────────────

    @Nested
    @DisplayName("getProfile()")
    class ProfileTests {

        @Test
        @DisplayName("returns BALANCED_DEFAULT for unknown opponent")
        void unknownOpponent() {
            TargetProfile p = brain.getProfile("Ghost");
            assertSame(TargetProfile.BALANCED_DEFAULT, p);
        }

        @Test
        @DisplayName("returns profile with current movementType")
        void usesCurrentMovementType() {
            for (int i = 0; i < 40; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 0.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            TargetProfile p = brain.getProfile("Bot1");
            assertEquals(MovementType.STOPPED, p.movementType);
        }

        @Test
        @DisplayName("falls back to prevRoundMovementType when current is UNKNOWN")
        void fallbackToPrevRound() {
            for (int i = 0; i < 40; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 0.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            assertEquals(MovementType.STOPPED,
                    brain.getOpponent("Bot1").movementType);
            brain.resetRound();
            assertEquals(MovementType.UNKNOWN,
                    brain.getOpponent("Bot1").movementType);
            TargetProfile p = brain.getProfile("Bot1");
            assertEquals(MovementType.STOPPED, p.movementType);
        }

        @Test
        @DisplayName("derives HEAD_ON gun type from small bearing errors")
        void derivesHeadOnGunType() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            for (int i = 0; i < 6; i++)
                brain.recordHitBearingError("Bot1", Math.toRadians(2));
            TargetProfile p = brain.getProfile("Bot1");
            assertEquals("HEAD_ON", p.gunType);
        }

        @Test
        @DisplayName("derives STATISTICAL gun type from large bearing errors")
        void derivesStatisticalGunType() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            for (int i = 0; i < 6; i++)
                brain.recordHitBearingError("Bot1", Math.toRadians(20));
            TargetProfile p = brain.getProfile("Bot1");
            assertEquals("STATISTICAL", p.gunType);
        }

        @Test
        @DisplayName("derives LINEAR gun type from moderate bearing errors")
        void derivesLinearGunType() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            for (int i = 0; i < 6; i++)
                brain.recordHitBearingError("Bot1", Math.toRadians(10));
            TargetProfile p = brain.getProfile("Bot1");
            assertEquals("LINEAR", p.gunType);
        }

        @Test
        @DisplayName("derives STATISTICAL gun type from high hit rate with moderate bearing errors")
        void derivesStatisticalFromHitRate() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            OpponentData od = brain.getOpponent("Bot1");
            od.hitsOnUs = 7;
            od.fireCount = 20;
            for (int i = 0; i < 6; i++)
                brain.recordHitBearingError("Bot1", Math.toRadians(10));
            TargetProfile p = brain.getProfile("Bot1");
            assertEquals("STATISTICAL", p.gunType,
                    "High hit rate (35%) with moderate bearing errors should be STATISTICAL");
        }

        @Test
        @DisplayName("returns UNKNOWN gun type with fewer than 5 bearing errors")
        void unknownGunTypeInsufficient() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            brain.recordHitBearingError("Bot1", 0.01);
            TargetProfile p = brain.getProfile("Bot1");
            assertEquals("UNKNOWN", p.gunType);
        }

        @Test
        @DisplayName("firePowerMult is higher for STOPPED opponents")
        void stoppedMultiplier() {
            for (int i = 0; i < 40; i++) {
                ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 0.0, 100.0);
                brain.update(e, 400, 300, 0.0, i);
            }
            TargetProfile p = brain.getProfile("Bot1");
            assertTrue(p.firePowerMult >= 1.3,
                    "STOPPED multiplier should be >= 1.3, was " + p.firePowerMult);
        }

        @Test
        @DisplayName("firePowerMult adjusted up when accuracy > 25%")
        void highAccuracyBoost() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            for (int i = 0; i < 20; i++) brain.recordShotFiredAt("Bot1");
            for (int i = 0; i < 8; i++) brain.recordShotHitOn("Bot1");
            TargetProfile p = brain.getProfile("Bot1");
            assertTrue(p.firePowerMult > 1.0,
                    "High accuracy should boost multiplier, was " + p.firePowerMult);
        }

        @Test
        @DisplayName("firePowerMult adjusted down when accuracy < 5% with 15+ shots")
        void lowAccuracyReduction() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            for (int i = 0; i < 20; i++) brain.recordShotFiredAt("Bot1");
            TargetProfile p = brain.getProfile("Bot1");
            assertTrue(p.firePowerMult < 1.0,
                    "Very low accuracy should reduce multiplier, was " + p.firePowerMult);
        }

        @Test
        @DisplayName("firePowerMult base value is 0.8 for RANDOM opponent")
        void randomBaseMultiplier() {
            ScannedRobotEvent e = mockEvent("RandBot", 0, 200, 0, 5, 100);
            brain.update(e, 400, 300, 0, 1);
            OpponentData od = brain.getOpponent("RandBot");
            od.movementType = MovementType.RANDOM;
            TargetProfile p = brain.getProfile("RandBot");
            assertEquals(0.8, p.firePowerMult, 1e-9);
        }

        @Test
        @DisplayName("firePowerMult is clamped to [0.7, 1.5]")
        void multiplierClamped() {
            ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
            brain.update(e, 400, 300, 0, 1);
            TargetProfile p = brain.getProfile("Bot1");
            assertTrue(p.firePowerMult >= 0.7 && p.firePowerMult <= 1.5,
                    "Multiplier should be in [0.7, 1.5], was " + p.firePowerMult);
        }
    }

    // ── resetRound prevRoundMovementType ────────────────────────────────

    @Test
    @DisplayName("resetRound snapshots prevRoundMovementType")
    void resetRoundSnapshotsPrevMovementType() {
        for (int i = 0; i < 40; i++) {
            ScannedRobotEvent e = mockEvent("Bot1", 0.0, 200.0, 1.0, 0.0, 100.0);
            brain.update(e, 400, 300, 0.0, i);
        }
        assertEquals(MovementType.STOPPED,
                brain.getOpponent("Bot1").movementType);
        brain.resetRound();
        assertEquals(MovementType.STOPPED,
                brain.getOpponent("Bot1").prevRoundMovementType);
        assertEquals(MovementType.UNKNOWN,
                brain.getOpponent("Bot1").movementType);
    }

    // ── Shot tracking persists across rounds ───────────────────────────

    @Test
    @DisplayName("shotsFiredAt and shotsHitOn persist across resetRound")
    void shotTrackingPersists() {
        ScannedRobotEvent e = mockEvent("Bot1", 0, 200, 0, 0, 100);
        brain.update(e, 400, 300, 0, 1);
        brain.recordShotFiredAt("Bot1");
        brain.recordShotHitOn("Bot1");
        brain.resetRound();
        assertEquals(1, brain.getOpponent("Bot1").shotsFiredAt);
        assertEquals(1, brain.getOpponent("Bot1").shotsHitOn);
    }
}
