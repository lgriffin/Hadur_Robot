package hadur.bench;

import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.Tiers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/** Renders bench results as Markdown. */
final class Report {

    private Report() {}

    static String render(Map<Opponent, List<BattleResult>> results, String robot, boolean warm,
                         int rounds, int runs, int width, int height, String cpuConstant) {
        return render(results, Map.of(), robot, warm, rounds, runs, width, height, cpuConstant);
    }

    /**
     * {@code profiles} holds, per opponent, the profile Hadur had stored once its battles
     * against that opponent were over (null or absent when there was none).
     */
    static String render(Map<Opponent, List<BattleResult>> results,
                         Map<Opponent, OpponentProfile> profiles, String robot, boolean warm,
                         int rounds, int runs, int width, int height, String cpuConstant) {
        StringBuilder b = new StringBuilder();
        b.append("# Bench: ").append(robot).append(warm ? " (warm)" : " (cold)").append("\n\n");
        b.append(String.format(Locale.ROOT,
            "%d rounds x %d %s per opponent on %dx%d. Engine Robocode 1.9.5.6, security manager on. "
            + "Java %s, %d cores. %s.%n%n",
            rounds, runs, warm ? "consecutive battles (data kept)" : "seeds (data wiped)",
            width, height, System.getProperty("java.version"),
            Runtime.getRuntime().availableProcessors(), cpuConstant));
        b.append("Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.\n\n");
        b.append("| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |\n");
        b.append("|---|---|---|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            List<Double> score = new ArrayList<>(), surv = new ArrayList<>(), dmg = new ArrayList<>();
            List<Double> ourHr = new ArrayList<>(), theirHr = new ArrayList<>();
            int won = 0, played = 0, skipped = 0, failed = 0, faults = 0, faultRounds = 0;
            double p95 = 0, max = 0;
            for (BattleResult r : e.getValue()) {
                if (!r.ok) {
                    failed++;
                    continue;
                }
                score.add(r.scoreShare());
                surv.add(r.survivalShare());
                dmg.add(r.bulletDamageShare());
                won += r.firsts;
                played += r.rounds;
                skipped += r.skippedTurns;
                faults += r.faults;
                faultRounds += r.faultRecords;
                if (!Double.isNaN(r.ourHitRate)) ourHr.add(r.ourHitRate);
                if (!Double.isNaN(r.theirHitRate)) theirHr.add(r.theirHitRate);
                p95 = Math.max(p95, r.turnP95Ms);
                max = Math.max(max, r.turnMaxMs);
            }
            b.append(String.format(Locale.ROOT,
                "| %s | %s | %s | %s | %s | %d / %d | %s | %s | %d | %s | %.2f / %.1f |%s%n",
                e.getKey().name, e.getKey().role, Stats.of(score).percent(),
                Stats.of(surv).percent(), Stats.of(dmg).percent(), won, played,
                ourHr.isEmpty() ? "-" : Stats.of(ourHr).percent(),
                theirHr.isEmpty() ? "-" : Stats.of(theirHr).percent(), skipped,
                faultRounds == 0 ? "0" : faults + " in " + faultRounds + " round(s)", p95, max,
                failed > 0 ? " " + failed + " battle(s) failed" : ""));
        }
        b.append("\n## Wave fidelity\n\n")
         .append("How well Hadur's inferred enemy waves match the bullets the enemy really fired "
            + "(from the engine's ground truth). A found wave matches a real bullet within "
            + WaveMatcher.TICK_WINDOW + " ticks and " + WaveMatcher.POWER_TOLERANCE
            + " power. Real shots leave out the unseen ones: shots fired while either robot was "
            + "disabled that no wave matched. Hidden shots are ones the ledger found that the raw "
            + "drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a "
            + "lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 "
            + "would have read as shots (WAVE-1).\n\n")
         .append("| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |\n")
         .append("|---|---|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            int shots = 0, unseen = 0, found = 0, matched = 0, phantoms = 0, hidden = 0, radar = 0;
            for (BattleResult r : e.getValue()) {
                if (!r.ok) continue;
                shots += r.enemyShots;
                unseen += r.unseenShots;
                found += r.inferredWaves;
                matched += r.matchedWaves;
                phantoms += r.phantomWaves;
                hidden += r.hiddenShots;
                radar += r.radarReacquired;
            }
            b.append(String.format(Locale.ROOT, "| %s | %d | %d | %d | %s | %s | %s | %d | %d | %d |%n",
                e.getKey().name, shots, unseen, found, pct(matched, shots), pct(shots - matched, shots),
                pct(found - matched, found), phantoms, hidden, radar));
        }
        if (warm) {
            b.append("\n## Learning curve (score share by battle)\n\n| Opponent |");
            for (int i = 1; i <= runs; i++) b.append(" ").append(i).append(" |");
            b.append("\n|---|");
            for (int i = 1; i <= runs; i++) b.append("---|");
            b.append('\n');
            for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
                b.append("| ").append(e.getKey().name).append(" |");
                for (BattleResult r : e.getValue()) {
                    b.append(String.format(Locale.ROOT, " %.1f%% |", r.scoreShare() * 100));
                }
                b.append('\n');
            }
        }
        memory(b, results, profiles);
        b.append("\nTurn times are wall-clock per engine turn (both robots plus the engine), "
            + "measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. "
            + "Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are "
            + "per-round means, and \"-\" means the robot wrote no R records.\n");
        return b.toString();
    }

    /** S3: whether each battle started from a stored profile, memory failures, and what was stored. */
    private static void memory(StringBuilder b, Map<Opponent, List<BattleResult>> results,
                               Map<Opponent, OpponentProfile> profiles) {
        b.append("\n## Opponent memory\n\n")
         .append("\"Started warm\" counts battles whose first scan loaded a stored profile (MEM-1). "
            + "Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed "
            + "evictions are profiles whose seeds were dropped for room (MEM-5).\n\n")
         .append("| Opponent | Started warm | Memory failures | Seed evictions |\n|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            int warmStarts = 0, battles = 0, failures = 0, evictions = 0;
            for (BattleResult r : e.getValue()) {
                if (!r.ok) continue;
                battles++;
                warmStarts += r.profileFound;
                failures += r.memoryFailures;
                evictions = Math.max(evictions, r.seedsEvicted);
            }
            b.append(String.format(Locale.ROOT, "| %s | %d / %d | %d | %d |%n",
                e.getKey().name, warmStarts, battles, failures, evictions));
        }
        if (profiles.isEmpty()) return;
        b.append("\n### Stored profiles\n\n")
         .append("Decoded from Hadur's data directory after the opponent's last battle. Hit rates "
            + "are over all remembered shots; ratings are the virtual guns' weighted hits per "
            + "wave; tiers are provisional until S4 tunes them. The last column is the estimated "
            + "score share the profile recorded for each battle, oldest first.\n\n")
         .append("| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Our hit rate | "
            + "Main / anti-surfer rating | Stopped | Tiers | Recorded score share |\n")
         .append("|---|---|---|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            OpponentProfile p = profiles.get(e.getKey());
            if (p == null) {
                b.append("| ").append(e.getKey().name).append(" | none |||||||||\n");
                continue;
            }
            StringBuilder curve = new StringBuilder();
            for (OpponentProfile.BattleOutcome o : p.outcomes()) {
                if (curve.length() > 0) curve.append(", ");
                curve.append(String.format(Locale.ROOT, "%.0f%%", 100 * o.estimatedScoreShare()));
            }
            b.append(String.format(Locale.ROOT,
                "| %s | %s | %d | %d | %d | %s | %s | %s / %s | %s | %s | %s |%n",
                e.getKey().name, p.key(), p.battles(), p.rounds(),
                hadur2.core.memory.ProfileCodec.encode(p).length,
                rate(p.theirHitRate()), rate(p.ourHitRate()), rate(p.mainGunRating()),
                rate(p.antiSurferRating()), rate(p.stoppedFraction()), Tiers.label(p), curve));
        }
    }

    private static String rate(double r) {
        return Double.isNaN(r) ? "-" : String.format(Locale.ROOT, "%.1f%%", 100 * r);
    }

    private static String pct(int part, int whole) {
        return whole == 0 ? "-" : String.format(Locale.ROOT, "%d (%.1f%%)", part, 100.0 * part / whole);
    }
}
