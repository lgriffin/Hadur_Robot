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
        b.append("\n## Bullet shielding\n\n")
         .append("How many of Hadur's bullets an enemy bullet destroyed. A share well above a few "
            + "percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots "
            + "went out with the anti-shield aim offset (SHIELD-2).\n\n")
         .append("| Opponent | Our shots | Shot down | Jittered shots |\n")
         .append("|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            int fired = 0, down = 0, jittered = 0;
            for (BattleResult r : e.getValue()) {
                if (!r.ok) continue;
                fired += r.shotsFired;
                down += r.bulletsIntercepted;
                jittered += r.jitteredShots;
            }
            b.append(String.format(Locale.ROOT, "| %s | %d | %s | %d |%n",
                e.getKey().name, fired, pct(down, fired), jittered));
        }
        aggression(b, results);
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

    /** S5: how close Hadur fought, how hard it shot, and how quickly rounds ended. */
    private static void aggression(StringBuilder b, Map<Opponent, List<BattleResult>> results) {
        b.append("\n## Aggression\n\n")
         .append("The opening distance is where the distance controller started in each battle "
            + "(set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting "
            + "distance is the mean scan distance over rounds, and the final target is the "
            + "controller's target when the last round ended (DIST-1). Damage per round is bullet "
            + "damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish "
            + "and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one "
            + "(END-2).\n\n")
         .append("| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | "
            + "Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |\n")
         .append("|---|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            List<Double> dist = new ArrayList<>(), target = new ArrayList<>(), ticks = new ArrayList<>();
            StringBuilder openings = new StringBuilder();
            double dealt = 0, taken = 0;
            int rounds = 0, fullPower = 0, finish = 0, ram = 0;
            for (BattleResult r : e.getValue()) {
                if (!r.ok) continue;
                if (openings.indexOf(r.openingDistance) < 0) {
                    openings.append(openings.length() == 0 ? "" : ", ").append(r.openingDistance);
                }
                if (!Double.isNaN(r.meanDistance)) dist.add(r.meanDistance);
                if (!Double.isNaN(r.targetDistance)) target.add(r.targetDistance);
                if (!Double.isNaN(r.roundTicks)) ticks.add(r.roundTicks);
                dealt += r.bulletDamage;
                taken += r.theirBulletDamage;
                rounds += r.rounds;
                fullPower += r.fullPowerShots;
                finish += r.finishTicks;
                ram += r.ramTicks;
            }
            b.append(String.format(Locale.ROOT, "| %s | %s | %s | %s | %s | %s | %d | %d | %d |%n",
                e.getKey().name, openings.length() == 0 ? "-" : openings,
                mean(dist, "%.0f"), mean(target, "%.0f"), mean(ticks, "%.0f"),
                rounds == 0 ? "-" : String.format(Locale.ROOT, "%.1f / %.1f", dealt / rounds, taken / rounds),
                fullPower, finish, ram));
        }
    }

    private static String mean(List<Double> xs, String format) {
        if (xs.isEmpty()) return "-";
        double sum = 0;
        for (double x : xs) sum += x;
        return String.format(Locale.ROOT, format, sum / xs.size());
    }

    /** S3: whether each battle started from a stored profile, memory failures, and what was stored. */
    private static void memory(StringBuilder b, Map<Opponent, List<BattleResult>> results,
                               Map<Opponent, OpponentProfile> profiles) {
        b.append("\n## Opponent memory\n\n")
         .append("\"Started warm\" counts battles whose first scan loaded a stored profile (MEM-1). "
            + "Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed "
            + "evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the "
            + "profile said at each battle's first scan, and the opening is the gun the opening book "
            + "chose from them (ADAPT-1; \"live\" leaves it to the virtual guns, as 1.20 did). Seeds "
            + "are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed "
            + "decays count the waves on which the live data disagreed with the profile and a seed "
            + "lost weight (RES-4), over all battles.\n\n")
         .append("| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | "
            + "Opening by battle | Seeds (last battle) | Seed decays |\n|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            int warmStarts = 0, battles = 0, failures = 0, evictions = 0, decays = 0;
            StringBuilder tiers = new StringBuilder();
            StringBuilder openings = new StringBuilder();
            String seeds = "-";
            for (BattleResult r : e.getValue()) {
                if (!r.ok) continue;
                battles++;
                warmStarts += r.profileFound;
                failures += r.memoryFailures;
                evictions = Math.max(evictions, r.seedsEvicted);
                decays += r.seedDecays;
                tiers.append(tiers.length() == 0 ? "" : ", ").append(r.tiers);
                openings.append(openings.length() == 0 ? "" : ", ").append(r.openingGun);
                seeds = r.gunSeed + " / " + r.surfSeed;
            }
            b.append(String.format(Locale.ROOT, "| %s | %d / %d | %d | %d | %s | %s | %s | %d |%n",
                e.getKey().name, warmStarts, battles, failures, evictions, tiers, openings, seeds,
                decays));
        }
        if (profiles.isEmpty()) return;
        b.append("\n### Stored profiles\n\n")
         .append("Decoded from Hadur's data directory after the opponent's last battle. Hit rates "
            + "are over all remembered shots; ratings are the virtual guns' weighted hits per "
            + "wave; the normalised rate weights each of their hits by how small Hadur looked from "
            + "where they fired, which is what the gun tier reads. Seeds are gun / surf samples. "
            + "The last column is the estimated score share the profile recorded for each battle, "
            + "oldest first.\n\n")
         .append("| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | "
            + "Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |\n")
         .append("|---|---|---|---|---|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            OpponentProfile p = profiles.get(e.getKey());
            if (p == null) {
                b.append("| ").append(e.getKey().name).append(" | none |||||||||||\n");
                continue;
            }
            StringBuilder curve = new StringBuilder();
            for (OpponentProfile.BattleOutcome o : p.outcomes()) {
                if (curve.length() > 0) curve.append(", ");
                curve.append(String.format(Locale.ROOT, "%.0f%%", 100 * o.estimatedScoreShare()));
            }
            b.append(String.format(Locale.ROOT,
                "| %s | %s | %d | %d | %d | %s | %s | %s | %s / %s | %s | %d / %d | %s | %s |%n",
                e.getKey().name, p.key(), p.battles(), p.rounds(),
                hadur2.core.memory.ProfileCodec.encode(p).length,
                rate(p.theirHitRate()), estimate(Tiers.theirHitRate(p)), rate(p.ourHitRate()),
                rate(p.mainGunRating()), rate(p.antiSurferRating()), rate(p.stoppedFraction()),
                p.gunSeedSize(), p.surfSeedSize(), Tiers.label(p), curve));
        }
    }

    private static String estimate(hadur2.core.memory.Estimate e) {
        return Double.isNaN(e.value()) ? "-"
            : String.format(Locale.ROOT, "%.1f%% ± %.1f", 100 * e.value(), 100 * e.margin());
    }

    private static String rate(double r) {
        return Double.isNaN(r) ? "-" : String.format(Locale.ROOT, "%.1f%%", 100 * r);
    }

    private static String pct(int part, int whole) {
        return whole == 0 ? "-" : String.format(Locale.ROOT, "%d (%.1f%%)", part, 100.0 * part / whole);
    }
}
