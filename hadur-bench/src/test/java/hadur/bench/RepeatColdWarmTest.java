package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The data and arithmetic of --repeat (BENCH-53) and --cold-warm (BENCH-54). No battle is started. */
class RepeatColdWarmTest {

    private static RepeatStudy.Row row(String build, String opp, int seed, int rep, boolean ok, double share) {
        return new RepeatStudy.Row(build, opp, seed, rep, ok, share, 0.5, 0.5, 0, 0.4, 2);
    }

    @Test
    @Tag("BENCH-53")
    @DisplayName("the sample SD uses n-1 and is NaN for fewer than two values")
    void sampleSd() {
        assertEquals(1.0, RepeatStudy.sd(List.of(1.0, 2.0, 3.0)), 1e-9);
        assertTrue(Double.isNaN(RepeatStudy.sd(List.of(5.0))));
    }

    @Test
    @Tag("BENCH-53")
    @DisplayName("the pooled SD is about each group's own mean, over the summed degrees of freedom")
    void pooledSd() {
        double pooled = RepeatStudy.pooledSd(List.of(List.of(0.2, 0.4), List.of(0.5, 0.5, 0.8), List.of(0.9)));
        // sums of squares 0.02 + 0.06 over (1 + 2) degrees of freedom
        assertEquals(Math.sqrt(0.08 / 3), pooled, 1e-9);
        assertTrue(Double.isNaN(RepeatStudy.pooledSd(List.of(List.of(0.5)))));
    }

    @Test
    @Tag("BENCH-53")
    @DisplayName("repeat.tsv has one header and one row per battle, every row with the header's columns")
    void tsvShape() {
        List<RepeatStudy.Row> rows = List.of(row("cand", "a.B 1", 1, 1, true, 0.5),
            row("cand", "a.B 1", 1, 2, false, Double.NaN));
        String[] lines = RepeatStudy.tsv(rows).split("\n");
        assertEquals(3, lines.length);
        int cols = RepeatStudy.HEADER.split("\t").length;
        assertEquals(cols, lines[1].split("\t", -1).length);
        assertEquals(cols, lines[2].split("\t", -1).length);
        assertTrue(lines[2].contains("NaN"));
    }

    @Test
    @Tag("BENCH-53")
    @DisplayName("the report leaves failed battles out of the SD and says how many failed")
    void renderLeavesOutFailures() {
        List<RepeatStudy.Row> rows = List.of(
            row("cand", "a.B 1", 1, 1, true, 0.40), row("cand", "a.B 1", 1, 2, true, 0.60),
            row("cand", "a.B 1", 2, 1, true, 0.50), row("cand", "a.B 1", 2, 2, false, Double.NaN));
        String md = RepeatStudy.render(rows, 2);
        assertTrue(md.contains("2 times"), md);
        assertTrue(md.contains("4 battles, 1 failed"), md);
        assertTrue(md.contains("| a.B 1 | 2 | 3 | 14.14 |"), md);
    }

    private static BattleResult result(boolean ok, double share) {
        BattleResult r = BattleResult.parse(BattleResult.failed("x"));
        r.ok = ok;
        r.errors = ok ? "" : "x";
        r.rounds = 10;
        r.score = share * 1000;
        r.theirScore = (1 - share) * 1000;
        return r;
    }

    @Test
    @Tag("BENCH-54")
    @DisplayName("a pair's delta is warm minus cold, and NaN unless both battles finished")
    void coldWarmDelta() {
        Conditions.Shelf shelf = new Conditions.Shelf(3, 120, "abc");
        ColdWarm.Row both = new ColdWarm.Row("cand", "a.B 1", 1, result(true, 0.40), result(true, 0.55), shelf, "c1", "w1");
        ColdWarm.Row broken = new ColdWarm.Row("cand", "a.B 1", 2, result(true, 0.40), result(false, 0.55), shelf, "c2", "w2");
        assertEquals(0.15, both.delta(), 1e-6);
        assertTrue(Double.isNaN(broken.delta()));
    }

    @Test
    @Tag("BENCH-54")
    @DisplayName("cold-warm.tsv records the shelf each warm battle began on, in the header's columns")
    void coldWarmTsvShape() {
        Conditions.Shelf shelf = new Conditions.Shelf(3, 120, "abc");
        ColdWarm.Row r = new ColdWarm.Row("cand", "a.B 1", 1, result(true, 0.40), result(true, 0.55), shelf, "c1", "w1");
        String[] lines = ColdWarm.tsv(List.of(r)).split("\n");
        assertEquals(2, lines.length);
        String[] cells = lines[1].split("\t", -1);
        assertEquals(ColdWarm.HEADER.split("\t").length, cells.length);
        assertEquals("3", cells[8]);
        assertEquals("120", cells[9]);
        assertEquals("abc", cells[10]);
        assertTrue(ColdWarm.render(List.of(r)).contains("| cand | 1 |"));
    }
}
