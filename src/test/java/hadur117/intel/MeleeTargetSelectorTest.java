package hadur117.intel;

import hadur117.model.OpponentData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import robocode.AdvancedRobot;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@DisplayName("MeleeTargetSelector")
class MeleeTargetSelectorTest {

    private MeleeTargetSelector selector;

    @Mock
    private AdvancedRobot robot;

    @Mock
    private Brain brain;

    @BeforeEach
    void setUp() {
        selector = new MeleeTargetSelector();
    }

    private OpponentData makeOpponent(String name, double energy, double x, double y, long lastScan) {
        OpponentData od = new OpponentData(name);
        od.energy = energy;
        od.x = x;
        od.y = y;
        od.lastScanTick = lastScan;
        return od;
    }

    private void setupRobot(double x, double y, long time, double gunHeading) {
        lenient().when(robot.getX()).thenReturn(x);
        lenient().when(robot.getY()).thenReturn(y);
        lenient().when(robot.getTime()).thenReturn(time);
        lenient().when(robot.getGunHeadingRadians()).thenReturn(gunHeading);
    }

    // ── Basic selection ────────────────────────────────────────────────

    @Nested
    @DisplayName("basic target selection")
    class BasicSelection {

        @Test
        @DisplayName("returns null when no opponents")
        void noOpponents() {
            setupRobot(400, 300, 10, 0);
            when(brain.getAllOpponents()).thenReturn(Collections.emptyList());
            assertNull(selector.selectTarget(robot, brain));
        }

        @Test
        @DisplayName("selects single alive opponent")
        void singleOpponent() {
            setupRobot(400, 300, 10, 0);
            OpponentData od = makeOpponent("Bot1", 80, 500, 400, 8);
            when(brain.getAllOpponents()).thenReturn(Collections.singleton(od));
            when(brain.getOpponent("Bot1")).thenReturn(od);
            assertEquals("Bot1", selector.selectTarget(robot, brain));
        }

        @Test
        @DisplayName("ignores dead opponents (energy <= 0)")
        void ignoresDead() {
            setupRobot(400, 300, 10, 0);
            OpponentData dead = makeOpponent("Dead", 0, 500, 400, 8);
            OpponentData alive = makeOpponent("Alive", 50, 600, 400, 8);
            when(brain.getAllOpponents()).thenReturn(Arrays.asList(dead, alive));
            when(brain.getOpponent("Alive")).thenReturn(alive);
            assertEquals("Alive", selector.selectTarget(robot, brain));
        }

        @Test
        @DisplayName("ignores stale opponents (scanned >50 ticks ago)")
        void ignoresStale() {
            setupRobot(400, 300, 100, 0);
            OpponentData stale = makeOpponent("Stale", 80, 500, 400, 40); // 100-40=60 > 50
            OpponentData fresh = makeOpponent("Fresh", 80, 600, 400, 60); // 100-60=40 < 50
            when(brain.getAllOpponents()).thenReturn(Arrays.asList(stale, fresh));
            when(brain.getOpponent("Fresh")).thenReturn(fresh);
            assertEquals("Fresh", selector.selectTarget(robot, brain));
        }
    }

    // ── Scoring ────────────────────────────────────────────────────────

    @Nested
    @DisplayName("scoring logic")
    class ScoringTests {

        @Test
        @DisplayName("prefers lower energy opponent (lower score)")
        void prefersLowerEnergy() {
            setupRobot(400, 300, 10, 0);
            // Same distance + gun turn, but different energy
            OpponentData lowE = makeOpponent("LowE", 10, 500, 300, 8);
            OpponentData highE = makeOpponent("HighE", 100, 500, 300, 8);
            // Position both at exact same location so distance and gunTurn are identical
            // But energy differs: score = energy*1.5 + dist*0.15 + gunTurn*0.8
            // lowE: 10*1.5 = 15, highE: 100*1.5 = 150 => lowE wins
            when(brain.getAllOpponents()).thenReturn(Arrays.asList(lowE, highE));
            when(brain.getOpponent("LowE")).thenReturn(lowE);
            String target = selector.selectTarget(robot, brain);
            assertEquals("LowE", target);
        }

        @Test
        @DisplayName("prefers closer opponent when energy is equal")
        void prefersCloser() {
            setupRobot(400, 300, 10, 0);
            // Same energy, same direction => different distance
            OpponentData close = makeOpponent("Close", 80, 450, 300, 8); // dist ~ 50
            OpponentData far = makeOpponent("Far", 80, 700, 300, 8);     // dist ~ 300
            when(brain.getAllOpponents()).thenReturn(Arrays.asList(close, far));
            when(brain.getOpponent("Close")).thenReturn(close);
            String target = selector.selectTarget(robot, brain);
            assertEquals("Close", target);
        }
    }

    // ── Hysteresis ─────────────────────────────────────────────────────

    @Nested
    @DisplayName("hysteresis")
    class HysteresisTests {

        @Test
        @DisplayName("keeps current target when new target is only marginally better")
        void keepsCurrentTarget() {
            setupRobot(400, 300, 10, 0);
            // First selection picks Bot1
            OpponentData bot1 = makeOpponent("Bot1", 50, 500, 300, 8); // dist=100
            when(brain.getAllOpponents()).thenReturn(Collections.singleton(bot1));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            selector.selectTarget(robot, brain);
            assertEquals("Bot1", selector.getCurrentTarget());

            // Second selection: Bot2 is slightly closer but hysteresis keeps Bot1
            // Bot1 at dist=100, Bot2 at dist=95
            // If bestDist(95) > currentDist(100) * 0.90 (=90) => 95 > 90 => keep Bot1
            setupRobot(400, 300, 11, 0);
            OpponentData bot2 = makeOpponent("Bot2", 50, 495, 300, 10); // dist=95
            when(brain.getAllOpponents()).thenReturn(Arrays.asList(bot1, bot2));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            when(brain.getOpponent("Bot2")).thenReturn(bot2);
            selector.selectTarget(robot, brain);
            assertEquals("Bot1", selector.getCurrentTarget());
        }

        @Test
        @DisplayName("switches target when new target is significantly better")
        void switchesWhenSignificantlyBetter() {
            setupRobot(400, 300, 10, 0);
            // First pick Bot1 at dist=300
            OpponentData bot1 = makeOpponent("Bot1", 50, 700, 300, 8);
            when(brain.getAllOpponents()).thenReturn(Collections.singleton(bot1));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            selector.selectTarget(robot, brain);
            assertEquals("Bot1", selector.getCurrentTarget());

            // Bot2 much closer (dist=50), energy much lower
            // Score for Bot2 will be much lower than Bot1
            setupRobot(400, 300, 11, 0);
            OpponentData bot2 = makeOpponent("Bot2", 10, 450, 300, 10); // dist=50
            bot1.lastScanTick = 10; // keep Bot1 fresh too
            when(brain.getAllOpponents()).thenReturn(Arrays.asList(bot1, bot2));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            when(brain.getOpponent("Bot2")).thenReturn(bot2);
            // Bot2 dist=50, Bot1 dist=300 => bestDist(50) < currentDist(300)*0.90(=270)
            // => switch to Bot2
            selector.selectTarget(robot, brain);
            assertEquals("Bot2", selector.getCurrentTarget());
        }

        @Test
        @DisplayName("hysteresis does not apply when current target is dead")
        void noHysteresisWhenCurrentDead() {
            setupRobot(400, 300, 10, 0);
            OpponentData bot1 = makeOpponent("Bot1", 50, 500, 300, 8);
            when(brain.getAllOpponents()).thenReturn(Collections.singleton(bot1));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            selector.selectTarget(robot, brain);

            // Bot1 dies, Bot2 is new
            setupRobot(400, 300, 11, 0);
            bot1.energy = 0;
            OpponentData bot2 = makeOpponent("Bot2", 80, 600, 400, 10);
            when(brain.getAllOpponents()).thenReturn(Arrays.asList(bot1, bot2));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            when(brain.getOpponent("Bot2")).thenReturn(bot2);
            selector.selectTarget(robot, brain);
            assertEquals("Bot2", selector.getCurrentTarget());
        }
    }

    // ── onRobotDeath ───────────────────────────────────────────────────

    @Nested
    @DisplayName("onRobotDeath()")
    class OnRobotDeathTests {

        @Test
        @DisplayName("clears current target when it dies")
        void clearCurrentTarget() {
            setupRobot(400, 300, 10, 0);
            OpponentData bot1 = makeOpponent("Bot1", 80, 500, 300, 8);
            when(brain.getAllOpponents()).thenReturn(Collections.singleton(bot1));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            selector.selectTarget(robot, brain);
            assertEquals("Bot1", selector.getCurrentTarget());

            selector.onRobotDeath("Bot1");
            assertNull(selector.getCurrentTarget());
        }

        @Test
        @DisplayName("does nothing when different robot dies")
        void doesNothingForOther() {
            setupRobot(400, 300, 10, 0);
            OpponentData bot1 = makeOpponent("Bot1", 80, 500, 300, 8);
            when(brain.getAllOpponents()).thenReturn(Collections.singleton(bot1));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            selector.selectTarget(robot, brain);

            selector.onRobotDeath("OtherBot");
            assertEquals("Bot1", selector.getCurrentTarget());
        }

        @Test
        @DisplayName("onRobotDeath when no current target does nothing")
        void noCurrentTarget() {
            assertNull(selector.getCurrentTarget());
            selector.onRobotDeath("Any");
            assertNull(selector.getCurrentTarget());
        }
    }

    // ── Reset round ────────────────────────────────────────────────────

    @Nested
    @DisplayName("resetRound()")
    class ResetTests {

        @Test
        @DisplayName("resetRound clears current target")
        void clearsTarget() {
            setupRobot(400, 300, 10, 0);
            OpponentData bot1 = makeOpponent("Bot1", 80, 500, 300, 8);
            when(brain.getAllOpponents()).thenReturn(Collections.singleton(bot1));
            when(brain.getOpponent("Bot1")).thenReturn(bot1);
            selector.selectTarget(robot, brain);
            assertNotNull(selector.getCurrentTarget());

            selector.resetRound();
            assertNull(selector.getCurrentTarget());
        }
    }

    // ── getCurrentTarget ───────────────────────────────────────────────

    @Test
    @DisplayName("getCurrentTarget returns null initially")
    void initialTargetNull() {
        assertNull(selector.getCurrentTarget());
    }
}
