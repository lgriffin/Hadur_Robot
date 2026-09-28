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
