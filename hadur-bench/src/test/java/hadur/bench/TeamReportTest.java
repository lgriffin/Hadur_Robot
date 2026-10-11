package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Issue #102 for the team bench: the host line and the tallies in the report, the T-record
 * sums per member, the paired A/B table and the per-opponent report. Fixture directories and
 * rendering only: no battle runs.
 */
@Tag("BENCH-12")
class TeamReportTest {

    private static final String TEAM = "hadur2.HadurTeam 3.8";
    private static final String MEMBER = "hadur2.Hadur";

    @TempDir
    Path dir;
    private int n;

    private static String rRecord(int duress) {
        List<String> f = new ArrayList<>(Collections.nCopies(34, "0"));
        f.set(0, "R");
        f.set(33, String.valueOf(duress));
        return String.join(",", f);
    }

    /**
     * A team battle directory: our team scores {@code ours} to the opponent's {@code theirs},
     * two rounds, one skipped turn and a T record in each of two member logs, and a
     * {@code duress}-tick R record in member 1 when {@code duress >= 0}.
     */
    private TeamReport.Battle battle(double ours, double theirs, int duress) throws IOException {
        Path d = dir.resolve("t" + (n++));
        Files.createDirectories(d);
        Files.writeString(d.resolve("team.csv"), String.join("\n", TeamRunner.HEADER,
            "1," + TEAM + "," + ours + ",1,100,50",
            "2,kc.OppTeam 1.0," + theirs + ",1,50,30", ""));
        Files.writeString(d.resolve("rounds.csv"), String.join("\n",
            "round,survivors,x,won,shots,inLane,belowTruth,reports,onMates",
            "0,2,0,1,10,8,0,50,1",
            "1,0,0,0,10,9,1,50,2", ""));
        // T,round,turn,teammateHits,bulletHits,collisions,blocked,merged,_,_,fenced
        Files.writeString(d.resolve("member-1.log"), String.join("\n",
            "0,5,T,0,5,1,2,3,4,5,0,0,6",
            "0,6,SYSTEM: hadur2.Hadur skipped turn 5",
            duress < 0 ? "0,7,R,0,5,win" : "0,7," + rRecord(duress), ""));
        Files.writeString(d.resolve("member-2.log"), "0,5,T,0,5,10,20,30,40,50,0,0,60\n");
        return TeamReport.read(d, TEAM, MEMBER, List.of());
    }

    private static final Opponent OPP = new Opponent("kc.OppTeam 1.0", "team", null, 0);

    private static Opponent opp() {
        return OPP;
    }

    @Test
    @DisplayName("T records are summed over the team and per member, drives fenced included")
    void readSumsTRecordsPerMember() throws IOException {
        TeamReport.Battle b = battle(300, 100, 12);
        assertTrue(b.ok);
        assertEquals(11, b.team[0]);
        assertEquals(22, b.team[1]);
        assertEquals(66, b.team[5]);
        assertEquals(6, b.members.get("member-1")[5]);
        assertEquals(60, b.members.get("member-2")[5]);
        assertEquals(1, b.skipped);
        assertEquals(12, b.duressTicks);
        assertEquals(1, b.duressRecords);
        assertEquals(3, b.bulletsOnMates);
    }

    @Test
    @DisplayName("the report carries the host line, the skipped-turns tally and, when carried, the duress tally")
    void hostLineAndTallies() throws IOException {
        Map<Opponent, List<TeamReport.Battle>> results = new LinkedHashMap<>();
        results.put(opp(), List.of(battle(300, 100, 10), battle(300, 100, 30)));
        String r = TeamReport.render("field", TEAM, results, 2, 1200, 1200, "pinned. Host: test, parallel 4.");
        assertTrue(r.contains("pinned. Host: test, parallel 4."), r);
        assertTrue(r.contains("Skipped turns: 2 over 2 battles (1.0 per battle, most in one battle 1). "
            + Report.TRUST_NOTE), r);
        assertTrue(r.contains("Duress ticks: 40 over 2 battles (20.0 per battle, most in one battle 30)."), r);
    }

    @Test
    @DisplayName("with no duress in the R records the report has no duress line, and a failed battle is not tallied")
    void noDuressLineWithoutTheField() throws IOException {
        Map<Opponent, List<TeamReport.Battle>> results = new LinkedHashMap<>();
        results.put(opp(), List.of(battle(300, 100, -1), new TeamReport.Battle()));
        String r = TeamReport.render(null, TEAM, results, 2, 1200, 1200);
        assertFalse(r.contains("Duress ticks"), r);
        assertTrue(r.contains("Skipped turns: 1 over 1 battles"), r);
    }

    @Test
    @DisplayName("the paired table gives each opponent's candidate share, baseline share and paired difference")
    void pairedTable() throws IOException {
        Map<Opponent, List<TeamReport.Battle>> cand = new LinkedHashMap<>(), base = new LinkedHashMap<>();
        cand.put(opp(), List.of(battle(300, 100, -1), battle(300, 100, -1)));
        base.put(opp(), List.of(battle(100, 100, -1), battle(100, 100, -1)));
        String r = TeamReport.renderPaired(cand, base, TEAM, "hadur2.HadurTeam 3.7");
        assertTrue(r.contains("| kc.OppTeam 1.0 | 75.0% ± 0.0 | 50.0% ± 0.0 | +25.0 ± 0.0 |"), r);
        assertTrue(r.contains("| **All** | 75.0% ± 0.0 | 50.0% ± 0.0 | +25.0 ± 0.0 |"), r);
    }

    @Test
    @DisplayName("a seed whose baseline failed drops out of the pairing")
    void pairingSkipsFailedSeeds() throws IOException {
        List<TeamReport.Battle> cand = List.of(battle(300, 100, -1), battle(100, 100, -1));
        List<TeamReport.Battle> base = List.of(battle(100, 100, -1), new TeamReport.Battle());
        Stats d = TeamReport.pairedDiff(cand, base);
        assertEquals(1, d.n);
        assertEquals(0.25, d.mean, 1e-9);
    }

    @Test
    @DisplayName("an opponent's own report has the per-seed table, the baseline column, the T bullets and the members")
    void opponentReport() throws IOException {
        List<TeamReport.Battle> cand = List.of(battle(300, 100, 10), battle(300, 100, 30));
        List<TeamReport.Battle> base = List.of(battle(100, 100, -1), battle(100, 100, -1));
        String r = TeamReport.renderOpponent(opp(), "field", cand, base, TEAM, "hadur2.HadurTeam 3.7",
            2, 1200, 1200, "host line.");
        assertTrue(r.startsWith("# kc.OppTeam 1.0 (team) vs " + TEAM + " [field]"), r);
        assertTrue(r.contains("host line."), r);
        assertTrue(r.contains("Baseline share | Paired diff (pp) |"), r);
        assertTrue(r.contains("| 1 | 75.0% | 1/2 | 50.0% | 0 | 1 | 0 | 17/20 | 1/100 | 50.0% | +25.0 |"), r);
        assertTrue(r.contains("- Engine's count of our bullets that hit one of our own members: 6"), r);
        assertTrue(r.contains("- Drives fenced: 132"), r);
        assertTrue(r.contains("| member-1 | 2 | 4 | 6 | 8 | 10 | 12 |"), r);
        assertTrue(r.contains("| member-2 | 20 | 40 | 60 | 80 | 100 | 120 |"), r);
    }

    @Test
    @DisplayName("an opponent's own report without a baseline has no baseline column, and shows a failed seed")
    void opponentReportWithoutBaseline() throws IOException {
        List<TeamReport.Battle> cand = List.of(battle(300, 100, -1), new TeamReport.Battle());
        String r = TeamReport.renderOpponent(opp(), null, cand, null, TEAM, null, 2, 1200, 1200, null);
        assertFalse(r.contains("Baseline share"), r);
        assertTrue(r.contains("| 2 | failed |"), r);
    }
}
