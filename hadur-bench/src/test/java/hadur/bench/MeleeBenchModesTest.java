package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Issue #102 for the melee bench: the host line and the skipped-turns and duress tallies in
 * the report, the paired A/B table against a baseline, and the per-opponent report. All
 * rendering and reading of fixture directories: no battle runs.
 */
@Tag("BENCH-12")
class MeleeBenchModesTest {

    private static final String US = "hadur2.Hadur 3.8";
    private static final String BASE = "hadur2.Hadur 3.7";
    private static final Set<String> NO_SENTRIES = Set.of();

    @TempDir
    Path dir;
    private int n;

    /** An R record as Hadur prints it: field 33 is the round's duress ticks. */
    private static String rRecord(int duress) {
        List<String> f = new ArrayList<>(Collections.nCopies(34, "0"));
        f.set(0, "R");
        f.set(33, String.valueOf(duress));
        return String.join(",", f);
    }

    /**
     * A battle directory: Hadur's score against a and b, two rounds (Hadur first then second
     * of three, the first ending as a duel with a), {@code skipped} skipped turns in the
     * first round, and a {@code duress}-tick R record when {@code duress >= 0}.
     */
    private MeleeReport.Battle battle(String robot, double hadur, double a, double b, int skipped, int duress)
            throws IOException {
        Path d = dir.resolve("b" + (n++));
        Files.createDirectories(d);
        Files.writeString(d.resolve("melee.csv"), String.join("\n",
            "rank,robot,score,firsts,survival,bulletDamage",
            "1," + robot + "," + hadur + ",1,100,50",
            "2,a," + a + ",1,50,30",
            "3,b," + b + ",0,0,10", ""));
        Files.writeString(d.resolve("rounds.csv"), String.join("\n", MeleeHarvester.HEADER,
            "0,1,3,a,1,0,0," + skipped,
            "1,2,3,-,-,0,0,0", ""));
        String log = duress < 0 ? "0,5,R,0,5,win\n" : "0,5," + rRecord(duress) + "\n";
        Files.writeString(d.resolve("hadur.log"), log);
        return MeleeReport.read(n, d);
    }

    private static String render(List<MeleeReport.Battle> battles, String host) {
        return MeleeReport.render("field", US, List.of("a", "b"), NO_SENTRIES, battles, 2, 1000, 1000, 0, host);
    }

    @Test
    @DisplayName("the report carries the host line and the skipped-turns tally as the duel report does")
    void hostLineAndSkippedTally() throws IOException {
        String r = render(List.of(battle(US, 300, 100, 100, 1, -1), battle(US, 300, 100, 100, 3, -1)),
            "robocode.cpu.constant=1 (pinned). Host: test, parallel 2.");
        assertTrue(r.contains("robocode.cpu.constant=1 (pinned). Host: test, parallel 2."), r);
        assertTrue(r.contains("Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 3). "
            + Report.TRUST_NOTE), r);
        assertFalse(r.contains("Duress ticks"), "no R record carried duress, so no line: " + r);
    }

    @Test
    @DisplayName("duress ticks are tallied only when the R records carry them")
    void duressTallyFromRRecords() throws IOException {
        String r = render(List.of(battle(US, 300, 100, 100, 0, 10), battle(US, 300, 100, 100, 0, 30)), null);
        assertTrue(r.contains("Duress ticks: 40 over 2 battles (20.0 per battle, most in one battle 30)."), r);
    }

    @Test
    @DisplayName("a failed battle is left out of the tallies")
    void failedBattleIsNotTallied() throws IOException {
        String r = render(List.of(battle(US, 300, 100, 100, 2, -1), new MeleeReport.Battle(2, false)), null);
        assertTrue(r.contains("Skipped turns: 2 over 1 battles"), r);
    }

    @Test
    @DisplayName("pairwise share is H over H plus X, NaN for a failed battle or a robot not in it")
    void pairwiseShare() throws IOException {
        MeleeReport.Battle b = battle(US, 300, 100, 0, 0, -1);
        assertEquals(0.75, MeleeReport.pairwise(b, US, "a"), 1e-9);
        assertEquals(1.0, MeleeReport.pairwise(b, US, "b"), 1e-9);
        assertTrue(Double.isNaN(MeleeReport.pairwise(b, US, "nobody")));
        assertTrue(Double.isNaN(MeleeReport.pairwise(new MeleeReport.Battle(1, false), US, "a")));
    }

    @Test
    @DisplayName("the paired table gives candidate, baseline and the seed-for-seed difference per measure and opponent")
    void pairedTable() throws IOException {
        List<MeleeReport.Battle> cand = List.of(battle(US, 300, 100, 100, 0, -1), battle(US, 300, 100, 100, 0, -1));
        List<MeleeReport.Battle> base = List.of(battle(BASE, 100, 100, 100, 0, -1), battle(BASE, 100, 100, 100, 0, -1));
        String r = MeleeReport.renderPaired(US, BASE, List.of("a", "b"), NO_SENTRIES, cand, base);
        assertTrue(r.contains("## Paired A/B: " + US + " vs " + BASE), r);
        assertTrue(r.contains("| a | 75.0% ± 0.0 | 50.0% ± 0.0 | +25.0 ± 0.0 |"), r);
        assertTrue(r.contains("| b | 75.0% ± 0.0 | 50.0% ± 0.0 | +25.0 ± 0.0 |"), r);
        assertTrue(r.contains("| APS | 75.0% ± 0.0 | 50.0% ± 0.0 | +25.0 ± 0.0 |"), r);
    }

    @Test
    @DisplayName("a seed whose baseline battle failed drops out of the pairing, not the whole table")
    void pairingSkipsFailedSeeds() throws IOException {
        List<MeleeReport.Battle> cand = List.of(battle(US, 300, 100, 100, 0, -1), battle(US, 100, 100, 100, 0, -1));
        List<MeleeReport.Battle> base = List.of(battle(BASE, 100, 100, 100, 0, -1), new MeleeReport.Battle(2, false));
        String r = MeleeReport.renderPaired(US, BASE, List.of("a"), NO_SENTRIES, cand, base);
        // Only seed 1 pairs: 75% against 50% is +25.0, and one pair has no interval.
        assertTrue(r.contains("| a | 62.5% ± ") && r.contains(" | 50.0% | +25.0 |"), r);
    }

    @Test
    @DisplayName("an opponent's own report has a per-seed table, the baseline column and the paired difference")
    void opponentReportWithBaseline() throws IOException {
        List<MeleeReport.Battle> cand = List.of(battle(US, 300, 100, 100, 1, -1), battle(US, 300, 100, 100, 0, -1));
        List<MeleeReport.Battle> base = List.of(battle(BASE, 100, 100, 100, 0, -1), battle(BASE, 100, 100, 100, 0, -1));
        String r = MeleeReport.renderOpponent("a", "field", US, BASE, cand, base, 2, 1000, 1000, "host line.");
        assertTrue(r.startsWith("# a in melee (field): " + US), r);
        assertTrue(r.contains("host line."), r);
        assertTrue(r.contains("Baseline share | Paired diff (pp) |"), r);
        // Seed 1: placed 1, scores 300 and 100, 75.0%, 1 skipped turn, one duel round with a, won.
        assertTrue(r.contains("| 1 | 1 | 300 | 100 | 75.0% | 1 | 1 | 1 | 50.0% | +25.0 |"), r);
        assertTrue(r.contains("Mean pairwise share 75.0% ± 0.0, baseline 50.0% ± 0.0, paired diff +25.0 ± 0.0."), r);
    }

    @Test
    @DisplayName("an opponent's own report without a baseline has no baseline column, and shows a failed seed")
    void opponentReportWithoutBaseline() throws IOException {
        List<MeleeReport.Battle> cand = List.of(battle(US, 300, 100, 100, 0, -1), new MeleeReport.Battle(2, false));
        String r = MeleeReport.renderOpponent("a", null, US, null, cand, null, 2, 1000, 1000, null);
        assertFalse(r.contains("Baseline share"), r);
        assertTrue(r.contains("| 2 | failed |"), r);
        assertTrue(r.startsWith("# a in melee: " + US), r);
    }
}
