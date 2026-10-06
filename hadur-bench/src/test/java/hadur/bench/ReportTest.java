package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-3: the per-opponent report carries both jars' hit rates, skips, faults and pace. */
@Tag("BENCH-3")
class ReportTest {

    @Test
    @DisplayName("the report names our hit rate, their hit rate, skipped turns, faults, round length and damage per round")
    void reportsPerOpponentStats() {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 1;
        r.score = 100;
        r.theirScore = 40;
        r.survival = 1;
        r.bulletDamage = 60;
        r.theirBulletDamage = 20;
        r.ourHitRate = 0.31;
        r.theirHitRate = 0.09;
        r.skippedTurns = 4;
        r.faults = 2;
        r.faultRecords = 1;
        r.roundTicks = 512;
        r.openingDistance = "500";

        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        Opponent o = new Opponent("kc.mega.BeepBoop 2.0", "top30", "kc.mega.BeepBoop_2.0.jar", 0.25);
        results.put(o, List.of(r));

        String report = Report.render(results, "hadur2.Hadur 3.1", false, 35, 1, 800, 600, "unknown");

        assertTrue(report.contains("Our hit rate"), "missing our hit rate column");
        assertTrue(report.contains("Their hit rate"), "missing their hit rate column");
        assertTrue(report.contains("Skipped turns"), "missing skipped turns column");
        assertTrue(report.contains("Faults"), "missing faults column");
        assertTrue(report.contains("31.0%"), "our hit rate value not rendered");
        assertTrue(report.contains("9.0%"), "their hit rate value not rendered");
        assertTrue(report.contains("2 in 1 round(s)"), "fault count not rendered");
        assertTrue(report.contains("Round length (ticks)"), "missing round length column");
        assertTrue(report.contains("Damage per round (dealt / taken)"), "missing damage-per-round column");
        assertTrue(report.contains("60.0 / 20.0"), "damage per round not rendered");
    }

    @Test
    @Tag("BENCH-4")
    @DisplayName("client-conditions report gives survival and skipped turns per opponent per condition")
    void renderConditionsReportsPerOpponentPerCondition() {
        Opponent o = new Opponent("kc.mega.BeepBoop 2.0", "top30", "kc.mega.BeepBoop_2.0.jar", 0.25);
        BattleResult ok = new BattleResult();
        ok.ok = true;
        ok.rounds = 35;
        ok.firsts = 30;
        ok.survival = 30;
        ok.theirSurvival = 5;
        ok.skippedTurns = 12;
        BattleResult failed = new BattleResult();
        failed.ok = false;

        Map<Opponent, List<BattleResult>> shared = new LinkedHashMap<>();
        shared.put(o, List.of(ok));
        Map<String, Map<Opponent, List<BattleResult>>> byCondition = new LinkedHashMap<>();
        byCondition.put("data=shared", shared);
        byCondition.put("engine=1.9.4.4", Map.of());
        Map<String, String> cpuByCondition = Map.of("data=shared", "robocode.cpu.constant=3100000");

        String report = Report.renderConditions(byCondition, cpuByCondition);

        assertTrue(report.contains("## data=shared"));
        assertTrue(report.contains("kc.mega.BeepBoop 2.0"), "missing the opponent row");
        assertTrue(report.contains("12"), "skipped turns not rendered");
        assertTrue(report.contains("30 / 35"), "rounds won not rendered");
        assertTrue(report.contains("## engine=1.9.4.4"));
        assertTrue(report.contains("Not run"), "unavailable condition not reported as such");
    }

    @Test
    @Tag("BENCH-2")
    @DisplayName("a paired diff skips a seed where either jar's battle failed, not just filters and shifts")
    void pairedDiffAlignsBySeedAcrossFailures() {
        Opponent o = new Opponent("kc.mega.BeepBoop 2.0", "top30", "kc.mega.BeepBoop_2.0.jar", 0.25);
        // Seed 2 fails for the candidate only; if the report filtered each side down before
        // pairing, the candidate's seed-3 result would wrongly pair with the baseline's seed 2.
        List<BattleResult> candidate = List.of(share(0.60), failed(), share(0.10));
        List<BattleResult> baseline = List.of(share(0.50), share(0.90), share(0.20));

        Map<Opponent, List<BattleResult>> cand = new LinkedHashMap<>();
        cand.put(o, candidate);
        Map<Opponent, List<BattleResult>> base = new LinkedHashMap<>();
        base.put(o, baseline);

        String report = Report.renderPaired(cand, base, "hadur2.Hadur 3.1", "hadur2.Hadur 3.0");
        // Only seeds 1 and 3 pair (seed 2's candidate battle failed): diffs are +0.10 and
        // -0.10, mean 0.0 (signed zero either way) — not the -80.0pp a shifted
        // (seed-3-candidate vs seed-2-baseline) pairing would give.
        assertTrue(report.contains("0.0 ±"), "paired diff should average to ~0, got: " + report);
        assertTrue(!report.contains("-80.0") && !report.contains("+80.0"),
            "paired diff should not be the shifted (misaligned) pairing, got: " + report);
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("the report names the total skipped turns over all ok battles")
    void reportsTotalSkippedTurns() {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 1;
        r.score = 100;
        r.theirScore = 40;
        r.skippedTurns = 4;

        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        Opponent o = new Opponent("kc.mega.BeepBoop 2.0", "top30", "kc.mega.BeepBoop_2.0.jar", 0.25);
        results.put(o, List.of(r));

        String report = Report.render(results, "hadur2.Hadur 3.1", false, 35, 1, 800, 600, "unknown");

        assertTrue(report.contains("Skipped turns: 4 over 1 battles"),
            "missing skipped-turns summary line, got: " + report);
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("an opponent's own report has a per-seed table with a paired baseline column")
    void renderOpponentReportsPerSeedTableWithBaseline() {
        Opponent o = new Opponent("kc.mega.BeepBoop 2.0", "top30", "kc.mega.BeepBoop_2.0.jar", 0.25);
        List<BattleResult> candidate = List.of(share(0.60), share(0.55));
        List<BattleResult> baseline = List.of(share(0.50), share(0.45));

        String report = Report.renderOpponent(o, candidate, baseline, null,
            "hadur2.Hadur 3.1", "hadur2.Hadur 3.0", false, 35, 2, 800, 600, "unknown");

        assertTrue(report.contains("## Battles"), "missing battles section, got: " + report);
        assertTrue(report.contains("| 1 |"), "missing seed 1 row, got: " + report);
        assertTrue(report.contains("| 2 |"), "missing seed 2 row, got: " + report);
        assertTrue(report.contains("Paired diff (pp)"), "missing paired diff column, got: " + report);
        assertTrue(report.contains("## Full report"), "missing full report section, got: " + report);
    }

    @Test
    @Tag("BENCH-12")
    @DisplayName("an opponent's own report with no baseline has no baseline column")
    void renderOpponentWithoutBaselineHasNoBaselineColumn() {
        Opponent o = new Opponent("kc.mega.BeepBoop 2.0", "top30", "kc.mega.BeepBoop_2.0.jar", 0.25);
        List<BattleResult> candidate = List.of(share(0.60), share(0.55));

        String report = Report.renderOpponent(o, candidate, null, null,
            "hadur2.Hadur 3.1", null, false, 35, 2, 800, 600, "unknown");

        assertTrue(!report.contains("Baseline share"),
            "should have no baseline column with no baseline run, got: " + report);
    }

    private static BattleResult share(double share) {
        BattleResult r = new BattleResult();
        r.ok = true;
        r.score = share * 100;
        r.theirScore = (1 - share) * 100;
        return r;
    }

    private static BattleResult failed() {
        BattleResult r = new BattleResult();
        r.ok = false;
        r.errors = "timed out";
        return r;
    }
}
