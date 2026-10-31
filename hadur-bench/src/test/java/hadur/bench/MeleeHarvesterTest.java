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
        return robot(index, name, x, y, alive, 1.0);
    }

    private static IRobotSnapshot robot(int index, String name, double x, double y, boolean alive, double heat) {
        return robot(index, name, x, y, alive, heat, 50.0);
    }

    private static IRobotSnapshot robot(int index, String name, double x, double y, boolean alive, double heat,
                                        double energy) {
        return (IRobotSnapshot) Proxy.newProxyInstance(IRobotSnapshot.class.getClassLoader(),
            new Class<?>[] {IRobotSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getName" -> name;
                case "getRobotIndex" -> index;
                case "getX" -> x;
                case "getY" -> y;
                case "getState" -> alive ? RobotState.ACTIVE : RobotState.DEAD;
                case "isSentryRobot" -> false;
                case "getOutputStreamSnapshot" -> "";
                case "getGunHeat" -> heat;
                case "getEnergy" -> energy;
                default -> throw new UnsupportedOperationException(m.getName());
            });
    }

    private static IBulletSnapshot hit(int id, int owner, int victim) {
        return bullet(id, owner, victim, 1.0, BulletState.HIT_VICTIM);
    }

    private static IBulletSnapshot bullet(int id, int owner, int victim, double power, BulletState state) {
        return bullet(id, owner, victim, power, state, 0.0);
    }

    private static IBulletSnapshot bullet(int id, int owner, int victim, double power, BulletState state,
                                          double heading) {
        return (IBulletSnapshot) Proxy.newProxyInstance(IBulletSnapshot.class.getClassLoader(),
            new Class<?>[] {IBulletSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getState" -> state;
                case "getBulletId" -> id;
                case "getOwnerIndex" -> owner;
                case "getVictimIndex" -> victim;
                case "getPower" -> power;
                case "getHeading" -> heading;
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
    @Tag("BENCH-90")
    @DisplayName("bullets.csv counts each robot's shots, power and hits once, and the crowd's apart")
    void bulletTally() throws IOException {
        IRobotSnapshot me = robot(0, US, 100, 100, true, 0.0);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 500, 500, true);
        java.util.List<IRobotSnapshot> crowd = new java.util.ArrayList<>(List.of(me, a));
        for (int i = 2; i < 5; i++) crowd.add(robot(i, "c.C" + i + " 1.0", 300, 300 + i, true));
        IRobotSnapshot deadC2 = robot(2, "c.C2 1.0", 300, 302, false);
        IRobotSnapshot deadC3 = robot(3, "c.C3 1.0", 300, 303, false);
        IRobotSnapshot deadC4 = robot(4, "c.C4 1.0", 300, 304, false);
        harvest(List.of(List.of(
            // five alive: Hadur fires 1.5 (moving), Alpha fires 3.0
            turn(1, crowd, List.of(bullet(1, 0, -1, 1.5, BulletState.MOVING), bullet(2, 1, -1, 3.0, BulletState.FIRED))),
            // Hadur's bullet hits Alpha, seen on two turns but counted once; Alpha's meets a bullet
            turn(2, crowd, List.of(bullet(1, 0, 1, 1.5, BulletState.HIT_VICTIM),
                bullet(2, 1, -1, 3.0, BulletState.HIT_BULLET))),
            // three die at the end of turn 3; the shot Hadur fired in it left while they lived
            turn(3, List.of(me, a, deadC2, deadC3, deadC4),
                List.of(bullet(1, 0, 1, 1.5, BulletState.HIT_VICTIM), bullet(3, 0, -1, 2.0, BulletState.FIRED))),
            turn(4, List.of(me, a, deadC2, deadC3, deadC4), List.of(bullet(3, 0, 1, 2.0, BulletState.HIT_VICTIM))),
            // with two left, a new shot is no crowd shot
            turn(5, List.of(me, a, deadC2, deadC3, deadC4), List.of(bullet(4, 0, -1, 1.0, BulletState.FIRED))))));
        List<String> lines = Files.readAllLines(dir.resolve("bullets.csv"));
        assertEquals(MeleeHarvester.BULLET_HEADER, lines.get(0));
        assertEquals("0,hadur2.Hadur 3.8,3,4.50,2,17.00,0,2,3.50,2,17.00,5,5", lines.get(1));
        assertEquals("0,a.Alpha 1.0,1,3.00,0,0.00,1,1,3.00,0,0.00,5,0", lines.get(2));
        assertEquals("0,c.C2 1.0,0,0.00,0,0.00,0,0,0.00,0,0.00,2,0", lines.get(3));
    }

    @Test
    @Tag("BENCH-90")
    @DisplayName("a killing blow scores no more damage than the victim had left, and a sentry hit none")
    void killingBlowCapped() throws IOException {
        IRobotSnapshot me = robot(0, US, 100, 100, true, 1.0, 80.0);
        IRobotSnapshot weak = robot(1, "a.Alpha 1.0", 500, 500, true, 1.0, 3.0);
        IRobotSnapshot dead = robot(1, "a.Alpha 1.0", 500, 500, false, 1.0, 0.0);
        IRobotSnapshot sentry = robot(2, "s.Sentry 1.0", 900, 900, true, 1.0, 100.0);
        MeleeHarvester h = new MeleeHarvester(dir, US, Set.of("s.Sentry 1.0"));
        h.onRoundStarted(new RoundStartedEvent(null, 0, null));
        h.onTurnEnded(turn(1, List.of(me, weak, sentry), List.of(bullet(1, 0, -1, 3.0, BulletState.FIRED),
            bullet(2, 0, -1, 1.0, BulletState.FIRED))));
        h.onTurnEnded(turn(2, List.of(me, dead, sentry), List.of(bullet(1, 0, 1, 3.0, BulletState.HIT_VICTIM),
            bullet(2, 0, 2, 1.0, BulletState.HIT_VICTIM))));
        h.onRoundEnded(new RoundEndedEvent(0, 0, 0));
        h.close();
        List<String> lines = Files.readAllLines(dir.resolve("bullets.csv"));
        assertEquals("0,hadur2.Hadur 3.8,2,4.00,1,3.00,0,0,0.00,0,0.00,2,0", lines.get(1));
    }

    @Test
    @Tag("BENCH-116")
    @DisplayName("exposure.csv counts who stands nearest whom in the crowd, and splits crowd damage by the shooter's nearest")
    void exposure() throws IOException {
        // Hadur at (100,100); Alpha 100 px away is nearest Hadur; Beta far off; Gamma near Beta.
        IRobotSnapshot me = robot(0, US, 100, 100, true);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 200, 100, true);
        IRobotSnapshot b = robot(2, "b.Beta 1.0", 800, 800, true);
        IRobotSnapshot c = robot(3, "c.Gamma 1.0", 850, 800, true);
        IRobotSnapshot deadC = robot(3, "c.Gamma 1.0", 850, 800, false);
        IRobotSnapshot deadB = robot(2, "b.Beta 1.0", 800, 800, false);
        MeleeHarvester h = new MeleeHarvester(dir, US, Set.of());
        h.onRoundStarted(new RoundStartedEvent(null, 0, null));
        // Alpha fires at its nearest (Hadur), Beta fires across the field (Hadur is its third)
        h.onTurnEnded(turn(1, List.of(me, a, b, c), List.of(bullet(1, 1, -1, 3.0, BulletState.FIRED),
            bullet(2, 2, -1, 1.0, BulletState.FIRED))));
        h.onTurnEnded(turn(2, List.of(me, a, b, c), List.of(bullet(1, 1, 0, 3.0, BulletState.HIT_VICTIM),
            bullet(2, 2, 0, 1.0, BulletState.HIT_VICTIM))));
        // the same hit seen again is not counted twice
        h.onTurnEnded(turn(3, List.of(me, a, b, c), List.of(bullet(1, 1, 0, 3.0, BulletState.HIT_VICTIM))));
        // two left: neither ticks nor hits count
        h.onTurnEnded(turn(4, List.of(me, a, deadB, deadC), List.of()));
        h.onTurnEnded(turn(5, List.of(me, a, deadB, deadC), List.of(bullet(3, 1, -1, 3.0, BulletState.FIRED))));
        h.onTurnEnded(turn(6, List.of(me, a, deadB, deadC), List.of(bullet(3, 1, 0, 3.0, BulletState.HIT_VICTIM))));
        h.onRoundEnded(new RoundEndedEvent(0, 0, 0));
        h.close();
        List<String> lines = Files.readAllLines(dir.resolve("exposure.csv"));
        assertEquals(MeleeHarvester.EXPOSURE_HEADER, lines.get(0));
        // Hadur: 3 crowd ticks, nearest of Alpha each tick (3); took 16 from Alpha as its nearest and 4 from Beta
        assertEquals("0,hadur2.Hadur 3.8,3,3,20.00,16.00,0.00", lines.get(1));
        assertEquals("0,a.Alpha 1.0,3,3,0.00,0.00,0.00", lines.get(2));
        assertEquals("0,b.Beta 1.0,3,3,0.00,0.00,0.00", lines.get(3));
    }

    @Test
    @DisplayName("a comma in a robot's name cannot break the row")
    void commaInName() throws IOException {
        IRobotSnapshot meAlive = robot(0, US, 100, 100, true), meDead = robot(0, US, 100, 100, false);
        IRobotSnapshot a = robot(1, "a.Alpha 1,0", 500, 500, true);
        List<String[]> rows = harvest(List.of(List.of(
            turn(3, List.of(meAlive, a), List.of()),
            turn(4, List.of(meDead, a), List.of(hit(1, 1, 0))))));
        assertEquals(16, rows.get(0).length);
        assertEquals("a.Alpha 1;0", rows.get(0)[9]);
    }

    @Test
    @Tag("BENCH-103")
    @DisplayName("the endgame's first tick and both energies are kept, and damage taken splits at three alive")
    void endgameAndDamageTaken() throws IOException {
        IRobotSnapshot me80 = robot(0, US, 100, 100, true, 1.0, 80.0);
        IRobotSnapshot me76 = robot(0, US, 100, 100, true, 1.0, 76.0);
        IRobotSnapshot meDead = robot(0, US, 100, 100, false, 1.0, 0.0);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 500, 500, true, 1.0, 60.0);
        IRobotSnapshot b = robot(2, "b.Beta 1.0", 900, 900, true, 1.0, 20.0);
        IRobotSnapshot bDead = robot(2, "b.Beta 1.0", 900, 900, false, 1.0, 0.0);
        List<String[]> rows = harvest(List.of(
            List.of(
                // three alive: a 1.0 bullet (4 damage) from Alpha is crowd damage
                turn(1, List.of(me80, a, b), List.of()),
                turn(2, List.of(me76, a, b), List.of(bullet(1, 1, 0, 1.0, BulletState.HIT_VICTIM))),
                // Beta dies at the end of turn 3: the endgame starts there with 76 against 60
                turn(3, List.of(me76, a, bDead), List.of()),
                // a 3.0 bullet (16 damage) in the duel, capped at the 76 Hadur had: none capped here
                turn(4, List.of(meDead, a, bDead), List.of(bullet(2, 1, 0, 3.0, BulletState.HIT_VICTIM)))),
            List.of(turn(1, List.of(me80, a, b), List.of()))));
        String[] r = rows.get(0);
        assertEquals(List.of("3", "76.00", "60.00", "4.00", "16.00"), List.of(r[11], r[12], r[13], r[14], r[15]));
        assertEquals("a.Alpha 1.0", r[3]);
        assertEquals("0", r[4]);
        String[] none = rows.get(1);
        assertEquals(List.of("-", "-", "-", "0.00", "0.00"), List.of(none[11], none[12], none[13], none[14], none[15]));
    }

    @Test
    @Tag("BENCH-155")
    @DisplayName("shots.csv logs each Hadur shot once, aimed at the robot nearest the bullet's heading, from the state it decided on")
    void shotsLogDecisions() throws IOException {
        // Hadur at (100, 100) with 77 energy after a 3.0 shot; Alpha due north at 400 px, Beta due east at 300 px.
        IRobotSnapshot me = robot(0, US, 100, 100, true, 1.0, 77.0);
        // By the end of turn 8 Beta has moved and lost energy; the decision was made on turn 7's state.
        IRobotSnapshot bLater = robot(2, "b.Beta 1.0", 450, 100, true, 1.0, 8.5);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 100, 500, true, 1.0, 60.0);
        IRobotSnapshot b = robot(2, "b.Beta 1.0", 400, 100, true, 1.0, 12.5);
        IRobotSnapshot deadC = robot(3, "c.Gamma 1.0", 100, 400, false, 1.0, 0.0);
        MeleeHarvester h = new MeleeHarvester(dir, US, Set.of());
        h.onRoundStarted(new RoundStartedEvent(null, 0, null));
        // Heading 0.1 rad is nearer Alpha (0) than Beta (pi/2); Gamma is dead and never a target.
        h.onTurnEnded(turn(7, List.of(me, a, b, deadC), List.of(bullet(1, 0, -1, 3.0, BulletState.FIRED, 0.1),
            bullet(2, 1, -1, 1.0, BulletState.FIRED, 3.0))));
        // The same bullet moving on the next turn is not logged again; a new one aimed east is.
        h.onTurnEnded(turn(8, List.of(me, a, bLater, deadC), List.of(bullet(1, 0, -1, 3.0, BulletState.MOVING, 0.1),
            bullet(3, 0, -1, 1.5, BulletState.FIRED, 1.5))));
        h.onRoundEnded(new RoundEndedEvent(0, 0, 0));
        h.close();
        List<String> lines = Files.readAllLines(dir.resolve("shots.csv"));
        assertEquals(MeleeHarvester.SHOT_HEADER, lines.get(0));
        // Turn 7 is the round's first turn seen: the current snapshot stands in, energy after plus power.
        // Turn 8 reads turn 7's snapshot: Hadur's 77, Beta's 12.5 at 300 px, not 8.5 at 350.
        assertEquals(List.of("0,7,3,80.0000,a.Alpha 1.0,60.0000,400.0000,3.0000",
            "0,8,3,77.0000,b.Beta 1.0,12.5000,300.0000,1.5000"), lines.subList(1, lines.size()));
    }

    @Test
    @Tag("BENCH-155")
    @DisplayName("a shot first seen hitting names its victim, and one first seen after the last robot died reads the turn before")
    void shotsFirstSeenEnding() throws IOException {
        IRobotSnapshot me = robot(0, US, 100, 100, true, 1.0, 77.0);
        IRobotSnapshot a = robot(1, "a.Alpha 1.0", 100, 500, true, 1.0, 60.0);
        IRobotSnapshot b = robot(2, "b.Beta 1.0", 400, 100, true, 1.0, 12.5);
        IRobotSnapshot bDead = robot(2, "b.Beta 1.0", 400, 100, false, 1.0, 0.0);
        IRobotSnapshot aDead = robot(1, "a.Alpha 1.0", 100, 500, false, 1.0, 0.0);
        MeleeHarvester h = new MeleeHarvester(dir, US, Set.of());
        h.onRoundStarted(new RoundStartedEvent(null, 0, null));
        // Point blank: first seen already hitting Beta, though its heading points at Alpha.
        h.onTurnEnded(turn(3, List.of(me, a, b), List.of(bullet(1, 0, 2, 2.0, BulletState.HIT_VICTIM, 0.0))));
        // Everyone else died this turn; the shot first seen now was aimed at Alpha.
        h.onTurnEnded(turn(4, List.of(me, aDead, bDead), List.of(bullet(2, 0, -1, 1.0, BulletState.FIRED, 0.0))));
        h.onRoundEnded(new RoundEndedEvent(0, 0, 0));
        h.close();
        List<String> lines = Files.readAllLines(dir.resolve("shots.csv"));
        assertEquals(List.of("0,3,3,79.0000,b.Beta 1.0,12.5000,300.0000,2.0000",
            "0,4,3,77.0000,a.Alpha 1.0,60.0000,400.0000,1.0000"), lines.subList(1, lines.size()));
    }
}
