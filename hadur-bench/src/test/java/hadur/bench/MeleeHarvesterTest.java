package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import robocode.control.events.RoundEndedEvent;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.snapshot.BulletState;
import robocode.control.snapshot.IBulletSnapshot;
import robocode.control.snapshot.IRobotSnapshot;
import robocode.control.snapshot.ITurnSnapshot;
import robocode.control.snapshot.RobotState;

/**
 * BENCH-40 for the melee harvester: the death tick, killer and last hit it writes to
 * {@code rounds.csv}, from small hand-built snapshots. No battle runs.
 */
@Tag("BENCH-40")
class MeleeHarvesterTest {

    private static final String US = "hadur2.Hadur 3.8";

    @TempDir
    Path dir;

    private static IRobotSnapshot robot(int index, String name, double x, double y, boolean alive) {
        return (IRobotSnapshot) Proxy.newProxyInstance(IRobotSnapshot.class.getClassLoader(),
            new Class<?>[] {IRobotSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getName" -> name;
                case "getRobotIndex" -> index;
                case "getX" -> x;
                case "getY" -> y;
                case "getState" -> alive ? RobotState.ACTIVE : RobotState.DEAD;
                case "isSentryRobot" -> false;
                case "getOutputStreamSnapshot" -> "";
                default -> throw new UnsupportedOperationException(m.getName());
            });
    }

    private static IBulletSnapshot hit(int id, int owner, int victim) {
        return (IBulletSnapshot) Proxy.newProxyInstance(IBulletSnapshot.class.getClassLoader(),
            new Class<?>[] {IBulletSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getState" -> BulletState.HIT_VICTIM;
                case "getBulletId" -> id;
                case "getOwnerIndex" -> owner;
                case "getVictimIndex" -> victim;
                default -> throw new UnsupportedOperationException(m.getName());
            });
    }

    private static TurnEndedEvent turn(int turn, List<IRobotSnapshot> robots, List<IBulletSnapshot> bullets) {
        ITurnSnapshot snap = (ITurnSnapshot) Proxy.newProxyInstance(ITurnSnapshot.class.getClassLoader(),
            new Class<?>[] {ITurnSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getTurn" -> turn;
                case "getRobots" -> robots.toArray(new IRobotSnapshot[0]);
                case "getBullets" -> bullets.toArray(new IBulletSnapshot[0]);
                default -> throw new UnsupportedOperationException(m.getName());
            });
        return new TurnEndedEvent(snap);
    }

    /** Runs the rounds (each a list of turn events) and returns rounds.csv's data rows. */
    private List<String[]> harvest(List<List<TurnEndedEvent>> rounds) throws IOException {
        MeleeHarvester h = new MeleeHarvester(dir, US, Set.of());
        for (int i = 0; i < rounds.size(); i++) {
            h.onRoundStarted(new RoundStartedEvent(null, i, null));
            for (TurnEndedEvent t : rounds.get(i)) h.onTurnEnded(t);
            h.onRoundEnded(new RoundEndedEvent(i, 0, 0));
        }
        h.close();
        List<String> lines = Files.readAllLines(dir.resolve("rounds.csv"));
        assertEquals(MeleeHarvester.HEADER, lines.get(0));
        return lines.subList(1, lines.size()).stream().map(l -> l.split(",", -1)).toList();
    }

    @Test
    @DisplayName("a bullet that hits on the death turn is the killer and the last hit")
    void bulletKill() throws IOException {
        IRobotSnapshot meAlive = robot(0, US, 100, 100, true), meDead = robot(0, US, 100, 100, false);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 500, 500, true), b = robot(2, "b.Beta 1.0", 150, 100, true);
        List<String[]> rows = harvest(List.of(List.of(
            turn(10, List.of(meAlive, a, b), List.of()),
            turn(11, List.of(meDead, a, b), List.of(hit(1, 1, 0))))));
        String[] r = rows.get(0);
        assertEquals("11", r[8]);
        assertEquals("a.Alpha 1.0", r[9]);
        assertEquals("a.Alpha 1.0", r[10]);
        assertEquals("3", r[1], "it placed behind the two still alive");
    }

    @Test
    @DisplayName("with no bullet on the death turn the nearest robot still alive is the killer, and the last hit stays")
    void ramKill() throws IOException {
        IRobotSnapshot meAlive = robot(0, US, 100, 100, true), meDead = robot(0, US, 100, 100, false);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 500, 500, true), b = robot(2, "b.Beta 1.0", 130, 100, true);
        List<String[]> rows = harvest(List.of(List.of(
            turn(10, List.of(meAlive, a, b), List.of(hit(1, 1, 0))),
            turn(11, List.of(meAlive, a, b), List.of()),
            turn(40, List.of(meAlive, a, b), List.of()),
            turn(41, List.of(meDead, a, b), List.of()))));
        String[] r = rows.get(0);
        assertEquals("41", r[8]);
        assertEquals("b.Beta 1.0", r[9]);
        assertEquals("a.Alpha 1.0", r[10]);
    }

    @Test
    @DisplayName("a round Hadur lived through has no death tick or killer, but names the last robot to hit it")
    void survivedRound() throws IOException {
        IRobotSnapshot me = robot(0, US, 100, 100, true);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 500, 500, true), deadB = robot(2, "b.Beta 1.0", 150, 100, false);
        List<String[]> rows = harvest(List.of(
            List.of(turn(5, List.of(me, a, deadB), List.of(hit(1, 1, 0)))),
            List.of(turn(5, List.of(me, a, deadB), List.of()))));
        assertEquals(List.of("-", "-", "a.Alpha 1.0"), List.of(rows.get(0)[8], rows.get(0)[9], rows.get(0)[10]));
        assertEquals(List.of("-", "-", "-"), List.of(rows.get(1)[8], rows.get(1)[9], rows.get(1)[10]));
    }

    @Test
    @DisplayName("a comma in a robot's name cannot break the row")
    void commaInName() throws IOException {
        IRobotSnapshot meAlive = robot(0, US, 100, 100, true), meDead = robot(0, US, 100, 100, false);
        IRobotSnapshot a = robot(1, "a.Alpha 1,0", 500, 500, true);
        List<String[]> rows = harvest(List.of(List.of(
            turn(3, List.of(meAlive, a), List.of()),
            turn(4, List.of(meDead, a), List.of(hit(1, 1, 0))))));
        assertEquals(11, rows.get(0).length);
        assertEquals("a.Alpha 1;0", rows.get(0)[9]);
    }
}
