package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
 * The team bench's paired measures against the baseline (BENCH-41), the focus-fire ratio the
 * harvester writes and the report shows (BENCH-42) and the battles-used table (BENCH-43), from
 * fixtures and hand-built snapshots. No battle runs.
 */
class TeamPairedTest {

    private static final String TEAM = "hadur2.HadurTeam 3.8";
    private static final String BASE = "hadur2.HadurTeam 3.7";
    private static final String MEMBER = "hadur2.Hadur";
    private static final Opponent OPP = new Opponent("kc.OppTeam 1.0", "team", null, 0);

    @TempDir
    Path dir;
    private int n;

    /** A battle of two rounds: {@code won} of them won, and {@code focus} in the rounds.csv's last column. */
    private TeamReport.Battle battle(int won, String focus, double ours) throws IOException {
        Path d = dir.resolve("t" + (n++));
        Files.createDirectories(d);
        Files.writeString(d.resolve("team.csv"), String.join("\n", TeamRunner.HEADER,
            "1," + TEAM + "," + ours + ",1,100,50",
            "2,kc.OppTeam 1.0,100,1,50,30", ""));
        Files.writeString(d.resolve("rounds.csv"), String.join("\n", TeamHarvester.HEADER,
            "0,2,0," + (won > 0 ? 1 : 0) + ",10,8,0,5,1," + focus,
            "1,0,1," + (won > 1 ? 1 : 0) + ",10,8,0,5,1," + focus, ""));
        return TeamReport.read(d, TEAM, MEMBER, List.of());
    }

    @Test
    @Tag("BENCH-42")
    @DisplayName("the reader sums the focus-fire column over the rounds that carry one, and skips a dash")
    void readsFocusFire() throws IOException {
        TeamReport.Battle b = battle(2, "0.5000", 300);
        assertEquals(2, b.focusRounds);
        assertEquals(0.5, b.focusFire(), 1e-9);
        assertTrue(Double.isNaN(battle(2, "-", 300).focusFire()));
    }

    @Test
    @Tag("BENCH-42")
    @DisplayName("the team report shows focus fire per opponent and overall")
    void reportShowsFocusFire() throws IOException {
        Map<Opponent, List<TeamReport.Battle>> results = new LinkedHashMap<>();
        results.put(OPP, List.of(battle(2, "0.5000", 300), battle(2, "0.7000", 300)));
        String r = TeamReport.render(null, TEAM, results, 2, 1200, 1200);
        assertTrue(r.contains("| kc.OppTeam 1.0 | 4 | 60.0% |"), r);
        assertTrue(r.contains("| **All** | 4 | 60.0% |"), r);
    }

    @Test
    @Tag("BENCH-41")
    @DisplayName("the paired table adds pooled paired differences for rounds won, survival, in-lane shots and focus fire")
    void pairedMeasures() throws IOException {
        Map<Opponent, List<TeamReport.Battle>> cand = new LinkedHashMap<>(), base = new LinkedHashMap<>();
        cand.put(OPP, List.of(battle(2, "0.8000", 300), battle(2, "0.8000", 300)));
        base.put(OPP, List.of(battle(1, "0.6000", 100), battle(1, "0.6000", 100)));
        String r = TeamReport.renderPaired(cand, base, TEAM, BASE);
        assertTrue(r.contains("| Rounds won | 100.0% ± 0.0 | 50.0% ± 0.0 | +50.0 ± 0.0 |"), r);
        assertTrue(r.contains("| Focus fire | 80.0% ± 0.0 | 60.0% ± 0.0 | +20.0 ± 0.0 |"), r);
        assertTrue(r.contains("| In-lane shots | 80.0% ± 0.0 | 80.0% ± 0.0 | +0.0 ± 0.0 |"), r);
        assertTrue(r.contains("| Bullets on own members | 2.00 ± 0.00 | 2.00 ± 0.00 | +0.0 ± 0.0 |"), r);
    }

    @Test
    @Tag("BENCH-43")
    @DisplayName("the paired section names the battles used per opponent and flags a seed lost to a failed battle")
    void battlesUsed() throws IOException {
        Map<Opponent, List<TeamReport.Battle>> cand = new LinkedHashMap<>(), base = new LinkedHashMap<>();
        cand.put(OPP, List.of(battle(2, "0.8", 300), battle(2, "0.8", 300)));
        base.put(OPP, List.of(battle(1, "0.6", 100), new TeamReport.Battle()));
        String r = TeamReport.renderPaired(cand, base, TEAM, BASE);
        assertTrue(r.contains("| kc.OppTeam 1.0 | 2 of 2 | 1 of 2 | 1 |"), r);
        assertTrue(r.contains("**Uneven"), r);
        String even = TeamReport.renderPaired(cand, cand, TEAM, TEAM);
        assertTrue(even.contains("| kc.OppTeam 1.0 | 2 of 2 | 2 of 2 | 2 |"), even);
        assertTrue(!even.contains("Uneven"), even);
        String own = TeamReport.renderOpponent(OPP, null, cand.get(OPP), base.get(OPP), TEAM, BASE, 2, 1200, 1200, null);
        assertTrue(own.contains("Battles used: candidate 2 of 2, baseline 1 of 2, 1 paired seeds. **Uneven"), own);
    }

    private static IRobotSnapshot robot(int index, int team, String name, boolean alive) {
        return (IRobotSnapshot) Proxy.newProxyInstance(IRobotSnapshot.class.getClassLoader(),
            new Class<?>[] {IRobotSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getName" -> name;
                case "getRobotIndex" -> index;
                case "getTeamIndex" -> team;
                case "getX", "getY", "getVelocity" -> 0.0;
                case "getState" -> alive ? RobotState.ACTIVE : RobotState.DEAD;
                case "isSentryRobot" -> false;
                case "getOutputStreamSnapshot" -> "";
                default -> throw new UnsupportedOperationException(m.getName());
            });
    }

    private static IBulletSnapshot hit(int id, int owner, int victim, double power) {
        return (IBulletSnapshot) Proxy.newProxyInstance(IBulletSnapshot.class.getClassLoader(),
            new Class<?>[] {IBulletSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getState" -> BulletState.HIT_VICTIM;
                case "getBulletId" -> id;
                case "getOwnerIndex" -> owner;
                case "getVictimIndex" -> victim;
                case "getPower" -> power;
                case "getX", "getY", "getHeading" -> 0.0;
                default -> throw new UnsupportedOperationException(m.getName());
            });
    }

    private static TurnEndedEvent turn(List<IRobotSnapshot> robots, List<IBulletSnapshot> bullets) {
        ITurnSnapshot snap = (ITurnSnapshot) Proxy.newProxyInstance(ITurnSnapshot.class.getClassLoader(),
            new Class<?>[] {ITurnSnapshot.class}, (p, m, a) -> switch (m.getName()) {
                case "getTurn" -> 1;
                case "getRobots" -> robots.toArray(new IRobotSnapshot[0]);
                case "getBullets" -> bullets.toArray(new IBulletSnapshot[0]);
                default -> throw new UnsupportedOperationException(m.getName());
            });
        return new TurnEndedEvent(snap);
    }

    @Test
    @Tag("BENCH-42")
    @DisplayName("the harvester writes the share of our bullet damage that landed on the most-hit enemy, and a dash with none")
    void harvesterFocusFire() throws IOException {
        IRobotSnapshot m1 = robot(0, 0, MEMBER + " 1", true), m2 = robot(1, 0, MEMBER + " 2", true);
        IRobotSnapshot e1 = robot(2, 1, "kc.Opp 1", true), e2 = robot(3, 1, "kc.Opp 2", true);
        List<IRobotSnapshot> field = List.of(m1, m2, e1, e2);
        TeamHarvester h = new TeamHarvester(dir, MEMBER);
        h.onRoundStarted(new RoundStartedEvent(null, 0, null));
        // Power 1 does 4 damage, power 3 does 16: 4 + 4 on e1, 16 on e2 gives 16/24; a hit on a mate and
        // the enemy's own bullet on us do not count; a repeated bullet id counts once.
        h.onTurnEnded(turn(field, List.of(hit(1, 0, 2, 1), hit(2, 1, 2, 1), hit(3, 0, 3, 3), hit(4, 0, 1, 3),
            hit(5, 2, 0, 3))));
        h.onTurnEnded(turn(field, List.of(hit(3, 0, 3, 3))));
        h.onRoundEnded(new RoundEndedEvent(0, 0, 0));
        h.onRoundStarted(new RoundStartedEvent(null, 1, null));
        h.onTurnEnded(turn(field, List.of(hit(6, 2, 0, 3))));
        h.onRoundEnded(new RoundEndedEvent(1, 0, 0));
        h.close();
        List<String> lines = Files.readAllLines(dir.resolve("rounds.csv"));
        assertEquals(TeamHarvester.HEADER, lines.get(0));
        String[] first = lines.get(1).split(",", -1), second = lines.get(2).split(",", -1);
        assertEquals("0.6667", first[9]);
        assertEquals("-", second[9]);
    }
}
