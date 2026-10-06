package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.ToDoubleFunction;

/**
 * The melee bench's report, built from each battle's {@code melee.csv} (the engine's final
 * scores), {@code rounds.csv} ({@link MeleeHarvester}) and {@code hadur.log}.
 *
 * <p>The headline numbers follow the MeleeRumble's pairwise scoring, so the plan's gates
 * read straight off them:</p>
 * <ul>
 * <li><b>APS</b>: for each battle and each other non-sentry robot, Hadur's share of the
 *     pair's scores, {@code 100 H / (H + X)}, averaged.</li>
 * <li><b>Survival</b>: for each round, the share of the other robots Hadur outlived,
 *     {@code (N - place) / (N - 1)}, averaged, as a percentage.</li>
 * </ul>
 */
public final class MeleeReport {

    /** One battle's outcome. */
    public static final class Battle {
        final int number;
        /** Robot name to its final score, place and firsts, in finishing order. */
        final Map<String, double[]> robots = new LinkedHashMap<>();
        /** Per round: place, fielded, duel opponent (or null), duel won, sentry hits taken, given, skipped turns. */
        final List<String[]> rounds = new ArrayList<>();
        /** Hadur's M records, one per round. */
        final List<String[]> records = new ArrayList<>();
        /**
         * Ticks Hadur ran in duress, summed over its {@code R} records (field 33), and how many
         * R records carried the field. An R record is written every round whatever the mode,
         * so a melee battle has them; a log from before the field existed has none.
         */
        int duressTicks, duressRecords;
        final boolean ok;

        Battle(int number, boolean ok) {
            this.number = number;
            this.ok = ok;
        }
    }

    private MeleeReport() {}

    /** Reads a battle directory; a battle with no final scores is {@code ok == false}. */
    public static Battle read(int number, Path dir) throws IOException {
        Path csv = dir.resolve("melee.csv");
        List<String> rows = Files.exists(csv) ? Files.readAllLines(csv) : List.of();
        Battle b = new Battle(number, rows.size() >= 2);
        for (String row : rows.subList(Math.min(1, rows.size()), rows.size())) {
            String[] f = row.split(",");
            b.robots.put(f[1], new double[] {Double.parseDouble(f[2]), Integer.parseInt(f[0]),
                Integer.parseInt(f[3]), Double.parseDouble(f[5])});
        }
        Path rounds = dir.resolve("rounds.csv");
        if (Files.exists(rounds)) {
            List<String> lines = Files.readAllLines(rounds);
            for (String line : lines.subList(Math.min(1, lines.size()), lines.size())) {
                b.rounds.add(line.split(",", -1));
            }
        }
        Path log = dir.resolve("hadur.log");
        if (Files.exists(log)) {
            for (String line : Files.readAllLines(log)) {
                // round,turn,M,...
                int c = line.indexOf(',', line.indexOf(',') + 1);
                if (c > 0 && line.startsWith("M,", c + 1)) b.records.add(line.substring(c + 1).split(","));
                else if (c > 0 && line.startsWith("R,", c + 1)) addDuress(b, line.substring(c + 1).split(","));
            }
        }
        return b;
    }

    /** R,round,tick,result,...: field 33 is the round's duress ticks (RES-9); older logs stop short of it. */
    private static void addDuress(Battle b, String[] r) {
        if (r.length < 34) return;
        try {
            b.duressTicks += Integer.parseInt(r[33]);
            b.duressRecords++;
        } catch (NumberFormatException ignored) {
            // A malformed record is left out.
        }
    }

    /** Skipped turns over a battle's rounds, as the harvester counted them. */
    static int skipped(Battle b) {
        int n = 0;
        for (String[] round : b.rounds) n += Integer.parseInt(round[7]);
        return n;
    }

    /** Hadur's pairwise score percentage in one battle, leaving out {@code sentries}. */
    static double aps(Battle b, String robot, Set<String> sentries) {
        double[] us = find(b, robot);
        if (us == null) return Double.NaN;
        double sum = 0;
        int n = 0;
        for (Map.Entry<String, double[]> e : b.robots.entrySet()) {
            if (sameRobot(e.getKey(), robot) || isSentry(e.getKey(), sentries)) continue;
            double total = us[0] + e.getValue()[0];
            sum += total == 0 ? 50 : 100 * us[0] / total;
            n++;
        }
        return n == 0 ? Double.NaN : sum / n;
    }

    /** Hadur's pairwise survival percentage over the battle's rounds. */
    static double survival(Battle b) {
        double sum = 0;
        int n = 0;
        for (String[] r : b.rounds) {
            int place = Integer.parseInt(r[1]);
            int fielded = Integer.parseInt(r[2]);
            if (fielded < 2) continue;
            sum += 100.0 * (fielded - place) / (fielded - 1);
            n++;
        }
        return n == 0 ? Double.NaN : sum / n;
    }

    static double[] find(Battle b, String robot) {
        for (Map.Entry<String, double[]> e : b.robots.entrySet()) {
            if (sameRobot(e.getKey(), robot)) return e.getValue();
        }
        return null;
    }

    static boolean isSentry(String name, Set<String> sentries) {
        for (String s : sentries) {
            if (sameRobot(name, s)) return true;
        }
        return false;
    }

    /**
     * Whether the engine's {@code name} for a robot is the robot configured as {@code configured}:
     * the same name, or that name with a version after it. A different robot whose name merely
     * starts the same way is not.
     */
    static boolean sameRobot(String name, String configured) {
        return name.equals(configured) || name.startsWith(configured + " ");
    }

    /** The report for {@code battles} of {@code robot} against {@code opponents}, with no host line. */
    public static String render(String label, String robot, List<String> opponents,
                                Set<String> sentries, List<Battle> battles, int rounds,
                                int width, int height, int sentryBorder) {
        return render(label, robot, opponents, sentries, battles, rounds, width, height, sentryBorder, null);
    }

    /**
     * As above; {@code host} (the CPU constant, the host description and the parallel width,
     * as the duel report prints them) is a paragraph of its own under the title, and the
     * skipped-turns and duress tallies follow it (issue #102, BENCH-12).
     */
    public static String render(String label, String robot, List<String> opponents,
                                Set<String> sentries, List<Battle> battles, int rounds,
                                int width, int height, int sentryBorder, String host) {
        StringBuilder r = new StringBuilder("# Melee bench");
        if (label != null) r.append(": ").append(label);
        r.append("\n\n");
        r.append(String.format(Locale.ROOT,
            "%s against %d opponents at once, %d rounds per battle, %d battles, %dx%d",
            robot, opponents.size(), rounds, battles.size(), width, height));
        if (sentryBorder > 0) r.append(", sentry border ").append(sentryBorder);
        r.append(".\n\n");
        if (host != null) r.append(host).append("\n\n");
        r.append(tallies(battles));

        double aps = 0, surv = 0, share = 0, damage = 0;
        int apsN = 0, survN = 0, shareN = 0, firsts = 0, roundCount = 0, failed = 0;
        double placeSum = 0;
        for (Battle b : battles) {
            if (!b.ok) {
                failed++;
                continue;
            }
            double a = aps(b, robot, sentries);
            if (!Double.isNaN(a)) {
                aps += a;
                apsN++;
            }
            double s = survival(b);
            if (!Double.isNaN(s)) {
                surv += s;
                survN++;
            }
            double[] us = find(b, robot);
            double total = 0;
            for (Map.Entry<String, double[]> e : b.robots.entrySet()) {
                if (!isSentry(e.getKey(), sentries)) total += e.getValue()[0];
            }
            if (us != null && total > 0) {
                share += us[0] / total;
                shareN++;
                damage += us[3];
            }
            for (String[] round : b.rounds) {
                roundCount++;
                placeSum += Integer.parseInt(round[1]);
                if (round[1].equals("1")) firsts++;
            }
        }
        r.append("| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |\n");
        r.append("|---|---|---|---|---|---|\n");
        r.append(String.format(Locale.ROOT, "| %.1f | %.1f | %d / %d | %.2f | %.1f%% | %.0f |%n%n",
            apsN == 0 ? Double.NaN : aps / apsN, survN == 0 ? Double.NaN : surv / survN,
            firsts, roundCount, roundCount == 0 ? Double.NaN : placeSum / roundCount,
            shareN == 0 ? Double.NaN : 100 * share / shareN, damage));
        if (failed > 0) r.append("**").append(failed).append(" battle(s) failed.**\n\n");

        r.append("| Robot | Mean place | Mean score share | Firsts |\n|---|---|---|---|\n");
        Map<String, double[]> totals = new LinkedHashMap<>();
        for (Battle b : battles) {
            double total = 0;
            for (Map.Entry<String, double[]> e : b.robots.entrySet()) total += e.getValue()[0];
            for (Map.Entry<String, double[]> e : b.robots.entrySet()) {
                double[] t = totals.computeIfAbsent(e.getKey(), k -> new double[4]);
                t[0] += e.getValue()[1];
                t[1] += total == 0 ? 0 : e.getValue()[0] / total;
                t[2] += e.getValue()[2];
                t[3]++;
            }
        }
        totals.entrySet().stream()
            .sorted(Comparator.comparingDouble(e -> e.getValue()[0] / e.getValue()[3]))
            .forEach(e -> r.append(String.format(Locale.ROOT, "| %s | %.1f | %.1f%% | %.0f |%n",
                e.getKey(), e.getValue()[0] / e.getValue()[3], 100 * e.getValue()[1] / e.getValue()[3],
                e.getValue()[2])));

        r.append("\nHadur per battle:\n\n| Battle | Place | APS | Survival | Rounds won | Bullet damage |\n")
            .append("|---|---|---|---|---|---|\n");
        for (Battle b : battles) {
            double[] us = b.ok ? find(b, robot) : null;
            if (us == null) {
                r.append("| ").append(b.number).append(" | failed | | | | |\n");
                continue;
            }
            long won = b.rounds.stream().filter(x -> x[1].equals("1")).count();
            r.append(String.format(Locale.ROOT, "| %d | %.0f | %.1f | %.1f | %d / %d | %.0f |%n",
                b.number, us[1], aps(b, robot, sentries), survival(b), won, b.rounds.size(), us[3]));
        }

        appendHandoff(r, battles);
        appendDeaths(r, battles);
        appendSentries(r, battles, sentries);
        appendRecords(r, battles);
        return r.toString();
    }

    /** Rounds that thinned to Hadur and one other: whom, how often, and how often Hadur won. */
    private static void appendHandoff(StringBuilder r, List<Battle> battles) {
        Map<String, int[]> duels = new LinkedHashMap<>();
        for (Battle b : battles) {
            for (String[] round : b.rounds) {
                if (round[3].equals("-")) continue;
                int[] d = duels.computeIfAbsent(round[3], k -> new int[2]);
                d[0]++;
                if (round[4].equals("1")) d[1]++;
            }
        }
        r.append("\nRounds that ended as a duel (Hadur and one other left):\n\n")
            .append("| Last opponent | Rounds | Hadur won |\n|---|---|---|\n");
        duels.entrySet().stream().sorted((a, b) -> b.getValue()[0] - a.getValue()[0])
            .forEach(e -> r.append(String.format(Locale.ROOT, "| %s | %d | %.0f%% |%n", e.getKey(),
                e.getValue()[0], 100.0 * e.getValue()[1] / e.getValue()[0])));
    }

    /** Columns of rounds.csv after skippedTurns: deathTick, killer, lastHit (older files have none). */
    private static boolean hasDeathColumns(String[] round) {
        return round.length >= 11;
    }

    /**
     * Who killed Hadur (BENCH-40): per robot, the rounds it was the killer ({@link MeleeHarvester}'s
     * rule) and the rounds it was the last to hit Hadur, and the mean tick Hadur died at.
     */
    private static void appendDeaths(StringBuilder r, List<Battle> battles) {
        Map<String, int[]> by = new LinkedHashMap<>();
        int rounds = 0, deaths = 0, unknown = 0;
        long tickSum = 0;
        for (Battle b : battles) {
            for (String[] round : b.rounds) {
                if (!hasDeathColumns(round)) continue;
                rounds++;
                if (!round[8].equals("-")) {
                    deaths++;
                    tickSum += Long.parseLong(round[8]);
                    if (round[9].equals("-")) unknown++;
                    else by.computeIfAbsent(round[9], k -> new int[2])[0]++;
                }
                if (!round[10].equals("-")) by.computeIfAbsent(round[10], k -> new int[2])[1]++;
            }
        }
        if (rounds == 0) return;
        r.append(String.format(Locale.ROOT, "%nHadur died in %d of %d rounds, at a mean tick of %s. "
            + "Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the "
            + "one before, else the nearest fighter still alive (a rammer).%n", deaths, rounds,
            deaths == 0 ? "n/a" : String.format(Locale.ROOT, "%.0f", (double) tickSum / deaths)));
        if (by.isEmpty()) return;
        r.append("\n| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |\n|---|---|---|---|\n");
        final int total = deaths;
        by.entrySet().stream().sorted((a, c) -> c.getValue()[0] - a.getValue()[0] != 0
                ? c.getValue()[0] - a.getValue()[0] : c.getValue()[1] - a.getValue()[1])
            .forEach(e -> r.append(String.format(Locale.ROOT, "| %s | %d | %.0f%% | %d |%n", e.getKey(),
                e.getValue()[0], total == 0 ? 0.0 : 100.0 * e.getValue()[0] / total, e.getValue()[1])));
        if (unknown > 0) r.append(unknown).append(" death(s) with no robot to name.\n");
    }

    private static void appendSentries(StringBuilder r, List<Battle> battles, Set<String> sentries) {
        if (sentries.isEmpty()) return;
        int taken = 0, given = 0;
        for (Battle b : battles) {
            for (String[] round : b.rounds) {
                taken += Integer.parseInt(round[5]);
                given += Integer.parseInt(round[6]);
            }
        }
        r.append("\nSentry safety: ").append(taken).append(" sentry bullets hit Hadur, ")
            .append(given).append(" of Hadur's bullets hit a sentry.\n");
    }

    /**
     * Hadur's M records ({@code M,round,tick,meleeTicks,duelTicks,focusTicks,veto,faults,
     * maxScanGap,ghostTicks,sentryShots,...}): the gate and sensing counters, battle totals.
     */
    private static void appendRecords(StringBuilder r, List<Battle> battles) {
        long melee = 0, duel = 0, focus = 0, faults = 0, ghosts = 0, sentryShots = 0;
        int vetoes = 0, maxGap = 0, n = 0;
        int sensed = 0, sweepGap = 0, sweepOver = 0, gapOver = 0;
        long dropped = 0;
        int waved = 0;
        long wavesSent = 0, wavesResolved = 0, virtualHits = 0;
        for (Battle b : battles) {
            for (String[] m : b.records) {
                if (m.length < 11) continue;
                n++;
                melee += Long.parseLong(m[3]);
                duel += Long.parseLong(m[4]);
                focus += Long.parseLong(m[5]);
                if (!m[6].equals("-")) vetoes++;
                faults += Long.parseLong(m[7]);
                maxGap = Math.max(maxGap, Integer.parseInt(m[8]));
                ghosts += Long.parseLong(m[9]);
                sentryShots += Long.parseLong(m[10]);
                if (m.length >= 13) {
                    sensed++;
                    int sweep = Integer.parseInt(m[11]);
                    sweepGap = Math.max(sweepGap, sweep);
                    if (sweep > SWEEP_GATE) sweepOver++;
                    if (Integer.parseInt(m[8]) > SWEEP_GATE) gapOver++;
                    dropped += Long.parseLong(m[12]);
                }
                if (m.length >= 16) {
                    waved++;
                    wavesSent += Long.parseLong(m[13]);
                    wavesResolved += Long.parseLong(m[14]);
                    virtualHits += Long.parseLong(m[15]);
                }
            }
        }
        if (n == 0) return;
        r.append(String.format(Locale.ROOT, "%nPosture (Hadur's M records, %d rounds): %d melee ticks, "
            + "%d duel ticks, %d focused-duel ticks; %d rounds vetoed; %d melee faults; "
            + "longest scan gap %d ticks; %d ticks aimed at a dead robot; %d shots at a sentry.%n",
            n, melee, duel, focus, vetoes, faults, maxGap, ghosts, sentryShots));
        if (sensed > 0) {
            r.append(String.format(Locale.ROOT, "%nSensing (%d rounds): longest scan gap while four or more "
                + "were alive %d ticks (%d rounds over %d); rounds whose longest gap at any count was over "
                + "%d: %d; robots dropped as dead without a death event: %d.%n",
                sensed, sweepGap, sweepOver, SWEEP_GATE, SWEEP_GATE, gapOver, dropped));
        }
        if (waved > 0) {
            r.append(String.format(Locale.ROOT, "%nTargeting waves (%d rounds): %d sent, %d reached their "
                + "opponent, %d virtual hits (%.1f%% of those reached).%n",
                waved, wavesSent, wavesResolved, virtualHits,
                wavesResolved == 0 ? 0.0 : 100.0 * virtualHits / wavesResolved));
        }
    }

    /**
     * The skipped-turns tally over the battles that completed (the same line the duel report
     * carries, issue #102) and, when Hadur's R records carried it, the duress-ticks tally.
     * A log with no R record that reaches field 33 gets no duress line rather than a zero.
     */
    static String tallies(List<Battle> battles) {
        List<Integer> skipped = new ArrayList<>(), duress = new ArrayList<>();
        for (Battle b : battles) {
            if (!b.ok) continue;
            skipped.add(skipped(b));
            if (b.duressRecords > 0) duress.add(b.duressTicks);
        }
        String text = Report.tallyLine("Skipped turns", skipped, Report.TRUST_NOTE);
        if (!duress.isEmpty()) text += Report.tallyLine("Duress ticks", duress, "");
        return text;
    }

    /**
     * Hadur's pairwise score share against one opponent in one battle, as a fraction:
     * {@code H / (H + X)}, a half when neither scored; NaN for a failed battle or when either
     * robot is not in it. The per-opponent view of the pairs {@link #aps} averages.
     */
    static double pairwise(Battle b, String robot, String opponent) {
        if (!b.ok) return Double.NaN;
        double[] us = find(b, robot), them = find(b, opponent);
        if (us == null || them == null) return Double.NaN;
        double total = us[0] + them[0];
        return total == 0 ? 0.5 : us[0] / total;
    }

    /** One value per battle (NaN where the battle failed or has none), so two runs stay aligned by seed. */
    private static List<Double> values(List<Battle> battles, ToDoubleFunction<Battle> f) {
        List<Double> out = new ArrayList<>();
        for (Battle b : battles) out.add(b.ok ? f.applyAsDouble(b) : Double.NaN);
        return out;
    }

    /**
     * BENCH-43: how many battles of each build were used, so a failed battle that left an
     * uneven pair is visible. {@code subject} says what the battles were against.
     */
    static String battlesUsed(String subject, List<Battle> candidate, List<Battle> baseline) {
        int c = 0, b = 0, pairs = 0;
        for (int i = 0; i < Math.max(candidate.size(), baseline.size()); i++) {
            boolean co = i < candidate.size() && candidate.get(i).ok;
            boolean bo = i < baseline.size() && baseline.get(i).ok;
            if (co) c++;
            if (bo) b++;
            if (co && bo) pairs++;
        }
        String line = String.format(Locale.ROOT, "Battles used %s: candidate %d of %d, baseline %d of %d, "
            + "%d paired seeds.", subject, c, candidate.size(), b, baseline.size(), pairs);
        if (c != b || pairs != c) line += " **Uneven: a failed battle dropped its seed from the pairing.**";
        return line + "\n\n";
    }

    private static Stats meanOf(List<Double> xs) {
        return Stats.of(xs.stream().filter(x -> !Double.isNaN(x)).toList());
    }

    /**
     * The BENCH-2 paired difference of two per-seed lists: only the seeds where both runs
     * produced a value are kept, so one failed battle cannot shift later pairings.
     */
    static Stats pairedDiff(List<Double> candidate, List<Double> baseline) {
        List<Double> c = new ArrayList<>(), b = new ArrayList<>();
        for (int i = 0; i < Math.min(candidate.size(), baseline.size()); i++) {
            if (Double.isNaN(candidate.get(i)) || Double.isNaN(baseline.get(i))) continue;
            c.add(candidate.get(i));
            b.add(baseline.get(i));
        }
        return Stats.pairedDiff(c, b);
    }

    private static double roundsWonShare(Battle b) {
        if (b.rounds.isEmpty()) return Double.NaN;
        long won = b.rounds.stream().filter(x -> x[1].equals("1")).count();
        return (double) won / b.rounds.size();
    }

    /**
     * The paired A/B table (BENCH-2's convention, issue #102): the candidate's and the
     * baseline's battles on the same field at the same seed, so noise common to both cancels;
     * first the headline measures, then Hadur's pairwise share against each opponent pooled
     * over the seeds (the per-opponent view {@code data/tools/melee_pairwise.py} gives over
     * many fields; this bench's one field gives the same table for it).
     */
    static String renderPaired(String robot, String baselineRobot, List<String> opponents,
                               Set<String> sentries, List<Battle> candidate, List<Battle> baseline) {
        StringBuilder r = new StringBuilder();
        r.append("\n## Paired A/B: ").append(robot).append(" vs ").append(baselineRobot).append("\n\n")
         .append("Each row pairs the candidate's and the baseline's battle on the same field at the same "
            + "seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean "
            + "± 95% interval over seeds; positive is better for the candidate. Pairwise share is "
            + "Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).\n\n")
         .append(battlesUsed("on this field", candidate, baseline))
         .append("| Measure | Candidate | Baseline | Paired diff (pp) |\n|---|---|---|---|\n");
        measureRow(r, "APS", values(candidate, b -> aps(b, robot, sentries) / 100),
            values(baseline, b -> aps(b, baselineRobot, sentries) / 100));
        measureRow(r, "Survival", values(candidate, b -> survival(b) / 100),
            values(baseline, b -> survival(b) / 100));
        measureRow(r, "Rounds won", values(candidate, MeleeReport::roundsWonShare),
            values(baseline, MeleeReport::roundsWonShare));
        r.append("\nPairwise share against each opponent:\n\n")
         .append("| Opponent | Candidate | Baseline | Paired diff (pp) |\n|---|---|---|---|\n");
        for (String o : opponents) {
            measureRow(r, o, values(candidate, b -> pairwise(b, robot, o)),
                values(baseline, b -> pairwise(b, baselineRobot, o)));
        }
        return r.toString();
    }

    private static void measureRow(StringBuilder r, String name, List<Double> cand, List<Double> base) {
        r.append(String.format(Locale.ROOT, "| %s | %s | %s | %s |%n", name, meanOf(cand).percent(),
            meanOf(base).percent(), Report.signedDiff(pairedDiff(cand, base), 100)));
    }

    /**
     * One opponent's own report for the per-robot bench strategy (issue #102): the seed-by-seed
     * table of how Hadur fared against it in the field (places, scores, pairwise share, the
     * baseline's share and the paired difference when a baseline ran, and the rounds that
     * ended as a duel with it). One field's battles only: pooling several fields' tables is
     * {@code data/tools/melee_pairwise.py}'s job.
     */
    static String renderOpponent(String opponent, String label, String robot, String baselineRobot,
                                 List<Battle> candidate, List<Battle> baseline,
                                 int rounds, int width, int height, String host) {
        boolean paired = baseline != null;
        StringBuilder r = new StringBuilder("# ").append(opponent).append(" in melee");
        if (label != null) r.append(" (").append(label).append(")");
        r.append(": ").append(robot).append("\n\n");
        r.append(String.format(Locale.ROOT, "%d rounds per battle, %d battles, %dx%d.%n%n",
            rounds, candidate.size(), width, height));
        if (host != null) r.append(host).append("\n\n");
        r.append("## Battles\n\n| Seed | Hadur place | Hadur score | ").append(opponent)
         .append(" score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those |");
        if (paired) r.append(" Baseline share | Paired diff (pp) |");
        r.append("\n|---|---|---|---|---|---|---|---|");
        if (paired) r.append("---|---|");
        r.append('\n');
        for (int i = 0; i < candidate.size(); i++) {
            Battle b = candidate.get(i);
            double[] us = b.ok ? find(b, robot) : null, them = b.ok ? find(b, opponent) : null;
            r.append("| ").append(i + 1).append(" |");
            if (us == null || them == null) {
                r.append(" failed | | | | | | |");
            } else {
                int duels = 0, won = 0;
                for (String[] round : b.rounds) {
                    if (!sameRobot(round[3], opponent)) continue;
                    duels++;
                    if (round[4].equals("1")) won++;
                }
                r.append(String.format(Locale.ROOT, " %.0f | %.0f | %.0f | %.1f%% | %d | %d | %d |",
                    us[1], us[0], them[0], 100 * pairwise(b, robot, opponent), skipped(b), duels, won));
            }
            if (paired) {
                double bs = i < baseline.size() ? pairwise(baseline.get(i), baselineRobot, opponent) : Double.NaN;
                double cs = pairwise(b, robot, opponent);
                r.append(Double.isNaN(bs) ? " - |" : String.format(Locale.ROOT, " %.1f%% |", 100 * bs));
                r.append(Double.isNaN(bs) || Double.isNaN(cs) ? " - |"
                    : String.format(Locale.ROOT, " %+.1f |", 100 * (cs - bs)));
            }
            r.append('\n');
        }
        List<Double> cand = values(candidate, b -> pairwise(b, robot, opponent));
        r.append("\n");
        if (paired) r.append(battlesUsed("against " + opponent, candidate, baseline));
        r.append("Mean pairwise share ").append(meanOf(cand).percent());
        if (paired) {
            List<Double> base = values(baseline, b -> pairwise(b, baselineRobot, opponent));
            r.append(", baseline ").append(meanOf(base).percent()).append(", paired diff ")
             .append(Report.signedDiff(pairedDiff(cand, base), 100));
        }
        r.append(".\n\n").append(tallies(candidate));
        return r.toString();
    }

    /** M2's exit: no opponent goes unscanned for more than a full sweep. */
    static final int SWEEP_GATE = 8;
}
