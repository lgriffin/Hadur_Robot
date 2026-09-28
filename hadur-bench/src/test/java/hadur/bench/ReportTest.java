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
}
