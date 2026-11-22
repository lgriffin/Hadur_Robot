package hadur117.mini;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.mini.harness.FakePeer;
import hadur117.mini.harness.IsolatingLoader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.file.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

/**
 * The shipped class's fire gate (DEISE-11) and target choice (DEISE-17), one scan at a time. Each
 * test loads a fresh copy of {@link Deise}, so its statics start empty, and sets the fields that
 * {@code run()} would set before its first scan.
 */
class DeiseTargetAndFireTest {

    FakePeer peer;
    AdvancedRobot robot;
    Class<?> deise;

    @BeforeEach
    void fresh() throws Exception {
        @SuppressWarnings("resource")
        IsolatingLoader loader = new IsolatingLoader(Path.of("target/classes").toUri().toURL());
        deise = loader.loadClass("hadur117.mini.Deise");
        robot = (AdvancedRobot) deise.getConstructor().newInstance();
        peer = new FakePeer();
        robot.setPeer(FakePeer.peer(peer));
        robot.setOut(new PrintStream(OutputStream.nullOutputStream()));
        set("bots", new double[17][]);
        set("waves", new double[64][]);
        set("targetScore", Double.POSITIVE_INFINITY);
        peer.values.put("getX", 500.0);
        peer.values.put("getY", 500.0);
        peer.values.put("getEnergy", 100.0);
        peer.values.put("getGunHeat", 0.0);
        peer.values.put("getGunTurnRemaining", 0.0);
        peer.values.put("getBattleFieldWidth", 1000.0);
        peer.values.put("getBattleFieldHeight", 1000.0);
        peer.values.put("getOthers", 3);
    }

    void set(String name, Object value) throws Exception {
        Field f = deise.getDeclaredField(name);
        f.setAccessible(true);
        f.set(null, value);
    }

    Object get(String name) throws Exception {
        Field f = deise.getDeclaredField(name);
        f.setAccessible(true);
        return f.get(null);
    }

    /** Scans a robot straight north of us and reports whether the bot fired on that scan. */
    boolean scan(String name, double distance) {
        peer.now.clear();
        peer.values.put("getTime", ((Number) peer.values.getOrDefault("getTime", 0L)).longValue() + 1);
        robot.onScannedRobot(new ScannedRobotEvent(name, 100, 0, distance, 0, 0, false));
        return peer.now.containsKey("setFire");
    }

    @Test
    @Tag("DEISE-11")
    @DisplayName("the bot fires with its gun on the aim and energy above the power")
    void firesWhenReady() {
        assertTrue(scan("a.A 1", 300));
    }

    @Test
    @Tag("DEISE-11")
    @DisplayName("no shot while the gun is still turning")
    void holdsWhileTheGunTurns() {
        peer.values.put("getGunTurnRemaining", 0.05);
        assertFalse(scan("a.A 1", 300));
    }

    @Test
    @Tag("DEISE-11")
    @DisplayName("no shot when the bot's energy is not above the power")
    void holdsWithoutEnergy() {
        // log10(0.1) is negative, so the power is the floor, 0.1: energy 0.1 is not above it.
        peer.values.put("getEnergy", 0.1);
        assertFalse(scan("a.A 1", 300));
        peer.values.put("getEnergy", 0.2);
        assertTrue(scan("a.A 1", 300));
    }

    @Test
    @Tag("DEISE-17")
    @DisplayName("a robot scanned further off than the target's score does not take the target")
    void keepsTheBetterTarget() throws Exception {
        assertTrue(scan("a.A 1", 300));
        assertFalse(scan("b.B 1", 600), "B is twice as far with the same record");
        assertTrue(scan("a.A 1", 300), "the target is kept on its own scans");
        assertTrue(scan("b.B 1", 200), "a nearer B takes the target");
        assertEquals(200.0, (double) get("targetDistance"));
    }

    @Test
    @Tag("DEISE-17")
    @DisplayName("shots fired at a robot count against it, hits on it count for it, kept per robot")
    void shotsAndHitsWeighTheDistance() throws Exception {
        // A: 6 shots fired at it, no hits. Score 300 * sqrt((6 + 10) / 1.5) = 980.
        for (int i = 0; i < 6; i++) {
            assertTrue(scan("a.A 1", 300));
        }
        // B at 400 with no record scores 400 * sqrt(10 / 1.5) = 1,033: still worse than A.
        assertFalse(scan("b.B 1", 400));
        // Hits on B make it cheaper: 400 * sqrt(10 / 4.5) = 596 beats A's 980.
        robot.onBulletHit(new BulletHitEvent("b.B 1", 90, null));
        robot.onBulletHit(new BulletHitEvent("b.B 1", 80, null));
        robot.onBulletHit(new BulletHitEvent("b.B 1", 70, null));
        // The target's score is the one at its last scan; A's last scan counted 5 shots before
        // the sixth was fired: 300 * sqrt(15 / 1.5) = 949.
        assertTrue(scan("b.B 1", 400));
    }

    @Test
    @Tag("DEISE-17")
    @DisplayName("any robot's death opens the choice to the next robot scanned")
    void anyDeathOpensTheChoice() {
        assertTrue(scan("a.A 1", 300));
        assertFalse(scan("b.B 1", 600));
        robot.onRobotDeath(new RobotDeathEvent("c.C 1"));
        assertTrue(scan("b.B 1", 600), "after a death the next robot scanned is taken");
    }
}
