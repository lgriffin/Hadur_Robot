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
            }
        }
        return b;
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

    /** The report for {@code battles} of {@code robot} against {@code opponents}. */
    public static String render(String label, String robot, List<String> opponents,
                                Set<String> sentries, List<Battle> battles, int rounds,
                                int width, int height, int sentryBorder) {
        StringBuilder r = new StringBuilder("# Melee bench");
        if (label != null) r.append(": ").append(label);
        r.append("\n\n");
        r.append(String.format(Locale.ROOT,
            "%s against %d opponents at once, %d rounds per battle, %d battles, %dx%d",
            robot, opponents.size(), rounds, battles.size(), width, height));
        if (sentryBorder > 0) r.append(", sentry border ").append(sentryBorder);
        r.append(".\n\n");

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
        appendSentries(r, battles, sentries);
        appendRecords(r, battles);
        return r.toString();
    }

    /** Rounds that thinned to Hadur and one other: whom, how often, and how often Hadur won. */
    private static void appendHandoff(StringBuilder r, List<Battle> battles) {
        Map<String, int[]> duels = new LinkedHashMap<>();
        int skipped = 0;
        for (Battle b : battles) {
            for (String[] round : b.rounds) {
                skipped += Integer.parseInt(round[7]);
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
        r.append("\nSkipped turns: ").append(skipped).append(".\n");
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
    }

    /** M2's exit: no opponent goes unscanned for more than a full sweep. */
    static final int SWEEP_GATE = 8;
}
