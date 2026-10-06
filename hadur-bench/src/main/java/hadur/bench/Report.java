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
        b.append(conditionsParagraph(rounds, runs, warm, width, height, cpuConstant));
        b.append("Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.\n\n");
        b.append(skippedTurnsLine(results));
        String aps = weightedApsLine(robot, results);
        if (!aps.isEmpty()) b.append(aps).append("\n");
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
        unhittable(b, results);
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

    /** The rounds/runs/engine/CPU paragraph shared by {@link #render} and {@link #renderOpponent}. */
    private static String conditionsParagraph(int rounds, int runs, boolean warm, int width, int height,
                                               String cpuConstant) {
        return String.format(Locale.ROOT,
            "%d rounds x %d %s per opponent on %dx%d. Engine Robocode 1.9.5.6, security manager on. "
            + "Java %s, %d cores. %s.%n%n",
            rounds, runs, warm ? "consecutive battles (data kept)" : "seeds (data wiped)",
            width, height, System.getProperty("java.version"),
            Runtime.getRuntime().availableProcessors(), cpuConstant);
    }

    /**
     * BENCH-12: skipped turns totalled over every ok battle in {@code results}, with the
     * mean per battle and the worst single battle, so a reader can tell a high mean from one
     * bad battle apart. Issue #102 is the harness's own note that a parallel run is only
     * trusted when this mean stays close to the sequential run's.
     */
    private static String skippedTurnsLine(Map<Opponent, List<BattleResult>> results) {
        List<Integer> perBattle = new ArrayList<>();
        for (List<BattleResult> rs : results.values()) {
            for (BattleResult r : rs) {
                if (r.ok) perBattle.add(r.skippedTurns);
            }
        }
        return tallyLine("Skipped turns", perBattle, TRUST_NOTE);
    }

    /** The sentence the skipped-turns line ends with in every report that carries it. */
    static final String TRUST_NOTE =
        "Issue #102 trusts a parallel run when the mean stays near the sequential run's.";

    /**
     * A per-battle count (skipped turns, duress ticks) as the report's one-line tally: the
     * total over the battles, the mean per battle and the worst single battle. Shared by the
     * duel, melee and team reports so the three read alike (issue #102, BENCH-12).
     */
    static String tallyLine(String label, List<Integer> perBattle, String trailer) {
        if (perBattle.isEmpty()) return label + ": none recorded (no battle completed).\n\n";
        long total = 0;
        int worst = 0;
        for (int n : perBattle) {
            total += n;
            worst = Math.max(worst, n);
        }
        return String.format(Locale.ROOT, "%s: %d over %d battles (%.1f per battle, most in one battle %d).",
            label, total, perBattle.size(), (double) total / perBattle.size(), worst)
            + (trailer.isEmpty() ? "" : " " + trailer) + "\n\n";
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

    /** S6: bullet shadows, the tick budget and the movement flavour, per opponent. */
    private static void unhittable(StringBuilder b, Map<Opponent, List<BattleResult>> results) {
        b.append("\n## Unhittable\n\n")
         .append("Shadowed waves are enemy firing waves one of our bullets crossed, so part of them "
            + "could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed "
            + "that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow "
            + "ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next "
            + "tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a "
            + "level for the rest of the round, TIME-2). Flavour changes count the times their hit "
            + "rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, "
            + "1 flattener, 2 go-to, 3 far.\n\n")
         .append("| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | "
            + "Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |\n")
         .append("|---|---|---|---|---|---|---|---|---|\n");
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            List<Double> theirs = new ArrayList<>();
            int rounds = 0, skipped = 0, slow = 0, level = 0, shadowed = 0, intercepted = 0,
                inShadow = 0, changes = 0, step = 0;
            for (BattleResult r : e.getValue()) {
                if (!r.ok) continue;
                if (!Double.isNaN(r.theirHitRate)) theirs.add(r.theirHitRate);
                rounds += r.rounds;
                skipped += r.skippedTurns;
                slow += r.slowTicks;
                level = Math.max(level, r.maxLevel);
                shadowed += r.shadowedWaves;
                intercepted += r.bulletsIntercepted;
                inShadow += r.interceptsShadowed;
                changes += r.flavourChanges;
                step = r.flavourStep;
            }
            b.append(String.format(Locale.ROOT, "| %s | %s | %d | %d | %d | %s | %s | %d | %d |%n",
                e.getKey().name, theirs.isEmpty() ? "-" : String.format(Locale.ROOT, "%.1f%%", 100 * sum(theirs) / theirs.size()),
                skipped, slow, level,
                rounds == 0 ? "-" : String.format(Locale.ROOT, "%.1f", (double) shadowed / rounds),
                intercepted == 0 ? "-" : String.format(Locale.ROOT, "%d / %d (%.0f%%)", inShadow, intercepted,
                    100.0 * inShadow / intercepted),
                changes, step));
        }
    }

    /**
     * BENCH-2: the paired score-share difference (candidate minus baseline) over one
     * opponent's seeds. The lists are paired by seed index (both are seed 1..runs, in order)
     * and only the seeds where both jars produced a battle are kept, so a lone failure on one
     * side cannot shift every later seed's pairing out of alignment.
     */
    static Stats pairedDiff(List<BattleResult> candidate, List<BattleResult> baseline) {
        List<Double> candPaired = new ArrayList<>(), basePaired = new ArrayList<>();
        int n = Math.min(candidate.size(), baseline.size());
        for (int i = 0; i < n; i++) {
            BattleResult cr = candidate.get(i), br = baseline.get(i);
            if (cr.ok && br.ok) {
                candPaired.add(cr.scoreShare());
                basePaired.add(br.scoreShare());
            }
        }
        return Stats.pairedDiff(candPaired, basePaired);
    }

    /** {@code pairedDiff(candidate, baseline)} formatted as "+1.2 ± 3.4" or "n/a" with no pairs. */
    private static String pairedDiffStr(List<BattleResult> candidate, List<BattleResult> baseline) {
        return signedDiff(pairedDiff(candidate, baseline), 100);
    }

    /**
     * A paired difference as "+1.2 ± 3.4" (the BENCH-2 convention: mean, then the 95%
     * half-width when two or more pairs exist), or "n/a" with no pairs. {@code scale} turns a
     * fraction into points (100) or leaves points alone (1).
     */
    static String signedDiff(Stats diff, double scale) {
        return diff.n == 0 ? "n/a" : String.format(Locale.ROOT, "%+.1f%s", diff.mean * scale,
            Double.isNaN(diff.halfWidth) ? "" : String.format(Locale.ROOT, " ± %.1f", diff.halfWidth * scale));
    }

    /**
     * BENCH-2: the paired score-share difference per opponent between the candidate and
     * baseline jars, seed for seed, plus a BENCH-1 stratified APS estimate for each jar
     * from the set's opponent weights (0 when the set carries none).
     */
    static String renderPaired(Map<Opponent, List<BattleResult>> candidate,
                               Map<Opponent, List<BattleResult>> baseline,
                               String candidateRobot, String baselineRobot) {
        StringBuilder b = new StringBuilder();
        b.append("\n## Paired A/B: ").append(candidateRobot).append(" vs ").append(baselineRobot)
         .append("\n\n")
         .append("Each row pairs the candidate's and baseline's battles at the same seed against "
            + "the same opponent, so noise common to both (the seed's opening, the field) cancels "
            + "out of the difference (BENCH-2). Positive is better for the candidate.\n\n")
         .append("| Opponent | Candidate share | Baseline share | Paired diff (pp) |\n")
         .append("|---|---|---|---|\n");
        List<Stats> candidateStats = new ArrayList<>(), baselineStats = new ArrayList<>();
        List<Double> weights = new ArrayList<>();
        for (Opponent o : candidate.keySet()) {
            List<BattleResult> candResults = candidate.get(o);
            List<BattleResult> baseResults = baseline.getOrDefault(o, List.of());
            Stats cs = Stats.of(shares(candResults)), bs = Stats.of(shares(baseResults));
            candidateStats.add(cs);
            baselineStats.add(bs);
            weights.add(o.weight);
            b.append(String.format(Locale.ROOT, "| %s | %s | %s | %s |%n",
                o.name, cs.percent(), bs.percent(), pairedDiffStr(candResults, baseResults)));
        }
        boolean anyWeighted = weights.stream().anyMatch(w -> w != null && w > 0);
        if (anyWeighted) {
            Stats candAps = Stats.weighted(candidateStats, weights);
            Stats baseAps = Stats.weighted(baselineStats, weights);
            b.append(String.format(Locale.ROOT,
                "%n**Stratified APS estimate (BENCH-1):** candidate %s, baseline %s.%n",
                candAps.percent(), baseAps.percent()));
        }
        return b.toString();
    }

    /** One opponent's own report: a per-battle table (seed by seed, with the baseline and the paired difference when a baseline ran), then every section of the full report for that opponent alone. */
    static String renderOpponent(Opponent o, List<BattleResult> candidate, List<BattleResult> baseline,
                                 OpponentProfile profile, String robot, String baselineRobot, boolean warm,
                                 int rounds, int runs, int width, int height, String cpuConstant) {
        StringBuilder b = new StringBuilder();
        b.append("# ").append(o.name).append(" (").append(o.role).append(") vs ").append(robot).append("\n\n");
        b.append(conditionsParagraph(rounds, runs, warm, width, height, cpuConstant));
        b.append("## Battles\n\n");
        boolean paired = baseline != null;
        List<String> headers = new ArrayList<>(List.of("Seed", "Score share", "Survival share",
            "Bullet-damage share", "Rounds won", "Our hit rate", "Their hit rate", "Skipped turns",
            "Faults", "Turn p95 / max (ms)"));
        if (paired) headers.addAll(List.of("Baseline share", "Paired diff (pp)"));
        b.append('|');
        for (String h : headers) b.append(' ').append(h).append(" |");
        b.append('\n').append('|');
        for (int i = 0; i < headers.size(); i++) b.append("---|");
        b.append('\n');
        for (int i = 0; i < candidate.size(); i++) {
            BattleResult r = candidate.get(i);
            List<String> cells = new ArrayList<>();
            cells.add(String.valueOf(i + 1));
            if (!r.ok) {
                cells.add("failed: " + r.errors);
                for (int k = 0; k < 8; k++) cells.add("-");
            } else {
                cells.add(String.format(Locale.ROOT, "%.1f%%", r.scoreShare() * 100));
                cells.add(String.format(Locale.ROOT, "%.1f%%", r.survivalShare() * 100));
                cells.add(String.format(Locale.ROOT, "%.1f%%", r.bulletDamageShare() * 100));
                cells.add(r.firsts + " / " + r.rounds);
                cells.add(Double.isNaN(r.ourHitRate) ? "-" : String.format(Locale.ROOT, "%.1f%%", r.ourHitRate * 100));
                cells.add(Double.isNaN(r.theirHitRate) ? "-" : String.format(Locale.ROOT, "%.1f%%", r.theirHitRate * 100));
                cells.add(String.valueOf(r.skippedTurns));
                cells.add(r.faultRecords == 0 ? "0" : r.faults + " in " + r.faultRecords + " round(s)");
                cells.add(String.format(Locale.ROOT, "%.2f / %.1f", r.turnP95Ms, r.turnMaxMs));
            }
            if (paired) {
                BattleResult br = i < baseline.size() ? baseline.get(i) : null;
                boolean baseOk = br != null && br.ok;
                cells.add(baseOk ? String.format(Locale.ROOT, "%.1f%%", br.scoreShare() * 100) : "-");
                cells.add(r.ok && baseOk
                    ? String.format(Locale.ROOT, "%+.1f", (r.scoreShare() - br.scoreShare()) * 100)
                    : "-");
            }
            b.append('|');
            for (String c : cells) b.append(' ').append(c).append(" |");
            b.append('\n');
        }
        b.append('\n');
        List<Double> candShares = shares(candidate);
        b.append("Mean score share ").append(Stats.of(candShares).percent());
        if (paired) {
            List<Double> baseShares = shares(baseline);
            b.append(", baseline ").append(Stats.of(baseShares).percent())
             .append(", paired diff ").append(pairedDiffStr(candidate, baseline));
        }
        b.append(".\n\n");
        Map<Opponent, List<BattleResult>> oneResult = Map.of(o, candidate);
        Map<Opponent, OpponentProfile> oneProfile = profile != null ? Map.of(o, profile) : Map.of();
        String full = render(oneResult, oneProfile, robot, warm, rounds, runs, width, height, cpuConstant);
        full = full.replaceFirst("^[^\\n]*\\n", "## Full report\n");
        b.append(full);
        return b.toString();
    }

    /**
     * BENCH-1: the stratified APS estimate for one jar's results, or "" when the opponent
     * set carries no weights. Shown in every report, not only a paired A/B one, so a plain
     * single-jar run against a weighted set (rumble-sample.txt) still reports it.
     */
    private static String weightedApsLine(String robot, Map<Opponent, List<BattleResult>> results) {
        List<Stats> stats = new ArrayList<>();
        List<Double> weights = new ArrayList<>();
        for (Map.Entry<Opponent, List<BattleResult>> e : results.entrySet()) {
            stats.add(Stats.of(shares(e.getValue())));
            weights.add(e.getKey().weight);
        }
        if (weights.stream().noneMatch(w -> w != null && w > 0)) return "";
        return String.format(Locale.ROOT, "**Stratified APS estimate (BENCH-1) for %s:** %s.%n",
            robot, Stats.weighted(stats, weights).percent());
    }

    /**
     * BENCH-4: survival share and skipped turns per opponent, one section per client
     * condition. A condition with no results (an {@code engine}/{@code java} not available
     * locally) is reported as not run rather than omitted.
     */
    static String renderConditions(Map<String, Map<Opponent, List<BattleResult>>> byCondition,
                                   Map<String, String> cpuByCondition) {
        StringBuilder b = new StringBuilder();
        b.append("# BENCH-4: client conditions\n\n")
         .append("One bench pass per condition, each isolating one difference from the rumble "
            + "client's default (a shared or prefilled data directory, CPU constant, background "
            + "load, engine or JVM). Survival share is Hadur's fraction of rounds survived.\n\n");
        for (Map.Entry<String, Map<Opponent, List<BattleResult>>> ce : byCondition.entrySet()) {
            b.append("## ").append(ce.getKey()).append("\n\n");
            Map<Opponent, List<BattleResult>> results = ce.getValue();
            if (results.isEmpty()) {
                b.append("Not run: the condition's engine or JVM is not available locally.\n\n");
                continue;
            }
            String cpu = cpuByCondition.get(ce.getKey());
            if (cpu != null) b.append(cpu).append(".\n\n");
            b.append("| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |\n")
             .append("|---|---|---|---|---|\n");
            for (Map.Entry<Opponent, List<BattleResult>> oe : results.entrySet()) {
                List<Double> surv = new ArrayList<>();
                int skipped = 0, won = 0, rounds = 0, ok = 0, total = 0;
                for (BattleResult r : oe.getValue()) {
                    total++;
                    if (!r.ok) continue;
                    ok++;
                    surv.add(r.survivalShare());
                    skipped += r.skippedTurns;
                    won += r.firsts;
                    rounds += r.rounds;
                }
                b.append(String.format(Locale.ROOT, "| %s | %s | %d | %d / %d | %d / %d |%n",
                    oe.getKey().name, surv.isEmpty() ? "-" : Stats.of(surv).percent(), skipped,
                    won, rounds, ok, total));
            }
            b.append('\n');
        }
        return b.toString();
    }

    static List<Double> shares(List<BattleResult> rs) {
        List<Double> out = new ArrayList<>();
        for (BattleResult r : rs) if (r.ok) out.add(r.scoreShare());
        return out;
    }

    private static double sum(List<Double> xs) {
        double s = 0;
        for (double x : xs) s += x;
        return s;
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
