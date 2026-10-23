package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.snapshot.BulletState;
import robocode.control.snapshot.IBulletSnapshot;
import robocode.control.snapshot.IRobotSnapshot;
import robocode.control.snapshot.IScoreSnapshot;
import robocode.control.snapshot.ITurnSnapshot;
import robocode.control.snapshot.RobotState;

/** BENCH-97: the duel truth log can be turned off without losing the counts the report needs. */
class TruthLogTest {

    private static final String US = "hadur2.Hadur 3.15";

    @TempDir
    Path tmp;

    private static IRobotSnapshot robot(int index, String name) {
        IScoreSnapshot score = (IScoreSnapshot) Proxy.newProxyInstance(IScoreSnapshot.class.getClassLoader(),
            new Class<?>[] {IScoreSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getCurrentBulletDamageScore" -> 0.0;
                default -> throw new UnsupportedOperationException(m.getName());
            });
        return (IRobotSnapshot) Proxy.newProxyInstance(IRobotSnapshot.class.getClassLoader(),
            new Class<?>[] {IRobotSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getName" -> name;
                case "getRobotIndex" -> index;
                case "getState" -> RobotState.ACTIVE;
                case "getScoreSnapshot" -> score;
                case "getOutputStreamSnapshot" -> "";
                case "getX", "getY" -> 100.0 + index;
                case "getBodyHeading", "getVelocity" -> 0.0;
                case "getEnergy" -> 50.0;
                default -> throw new UnsupportedOperationException(m.getName());
            });
    }

    private static IBulletSnapshot bullet(int id, int owner) {
        return (IBulletSnapshot) Proxy.newProxyInstance(IBulletSnapshot.class.getClassLoader(),
            new Class<?>[] {IBulletSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getState" -> BulletState.MOVING;
                case "getBulletId" -> id;
                case "getOwnerIndex" -> owner;
                case "getPower" -> 2.0;
                case "getX", "getY", "getHeading" -> 1.0;
                default -> throw new UnsupportedOperationException(m.getName());
            });
    }

    private static TurnEndedEvent turn(int turn, List<IBulletSnapshot> bullets) {
        IRobotSnapshot[] robots = {robot(0, US), robot(1, "x.Them 1.0")};
        ITurnSnapshot snap = (ITurnSnapshot) Proxy.newProxyInstance(ITurnSnapshot.class.getClassLoader(),
            new Class<?>[] {ITurnSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getTurn" -> turn;
                case "getRobots" -> robots;
                case "getBullets" -> bullets.toArray(new IBulletSnapshot[0]);
                default -> throw new UnsupportedOperationException(m.getName());
            });
        return new TurnEndedEvent(snap);
    }

    /** Two enemy bullets (one seen on two turns) and one of ours. */
    private LogHarvester harvest(Path dir, boolean truth) throws IOException {
        Files.createDirectories(dir);
        LogHarvester h = new LogHarvester(dir, US, truth);
        h.onRoundStarted(new RoundStartedEvent(null, 0, null));
        h.onTurnEnded(turn(1, List.of(bullet(7, 1))));
        h.onTurnEnded(turn(2, List.of(bullet(7, 1), bullet(8, 0))));
        h.onTurnEnded(turn(3, List.of(bullet(9, 1))));
        h.close();
        return h;
    }

    @Test
    @Tag("BENCH-97")
    @DisplayName("with the truth log off no truth.log.gz is written and the enemy shots are still counted")
    void truthLogOffKeepsTheCounts() throws IOException {
        LogHarvester on = harvest(tmp.resolve("on"), true);
        LogHarvester off = harvest(tmp.resolve("off"), false);
        assertTrue(Files.exists(tmp.resolve("on/truth.log.gz")));
        assertFalse(Files.exists(tmp.resolve("off/truth.log.gz")));
        assertTrue(Files.exists(tmp.resolve("off/hadur.log")));
        assertEquals(2, on.enemyShots());
        assertEquals(on.enemyShots(), off.enemyShots());
    }

    @Test
    @Tag("BENCH-97")
    @DisplayName("a truth-off refight in a folder that holds an earlier truth log removes it")
    void truthOffRefightRemovesTheOldLog() throws IOException {
        Path dir = tmp.resolve("again");
        harvest(dir, true);
        assertTrue(Files.exists(dir.resolve("truth.log.gz")));
        harvest(dir, false);
        assertFalse(Files.exists(dir.resolve("truth.log.gz")));
    }

    @Test
    @Tag("BENCH-97")
    @DisplayName("--truth-log false reaches the battle child as -Dhadur.bench.truth=false; on by default")
    void truthLogOptionBecomesAChildFlag() {
        assertEquals(List.of("-Xmx2G", "-Dhadur.bench.truth=false"), Bench.childFlags(Map.of("truth-log", "false"), 1));
        assertEquals(List.of("-Xmx2G"), Bench.childFlags(Map.of("truth-log", "true"), 1));
        String was = System.getProperty("hadur.bench.truth");
        try {
            System.clearProperty("hadur.bench.truth");
            assertTrue(LogHarvester.truthLogOn());
            System.setProperty("hadur.bench.truth", "false");
            assertFalse(LogHarvester.truthLogOn());
        } finally {
            if (was == null) System.clearProperty("hadur.bench.truth");
            else System.setProperty("hadur.bench.truth", was);
        }
    }
}
