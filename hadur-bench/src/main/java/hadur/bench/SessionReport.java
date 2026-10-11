package hadur.bench;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * BENCH-6 / BENCH-7: reads a session's battles in blocks of 25 and says whether the slide a
 * rumble client shows has reproduced. A control robot's session is put beside the robot's.
 */
final class SessionReport {

    /** Opponents under this APS are the ones whose survival is the health check. */
    static final double WEAK_APS = 50;
    static final int BLOCK = 25;
    /** Fewer weak battles than this cannot tell a slide from noise. */
    static final int MIN_WEAK = 120;

    /** One battle of a session. {@code result} is null when the battle failed to load. */
    record Row(int index, String opponent, double aps, BattleResult result, double heapMb,
               double longestPauseMs, int loadedClasses, int unloadedClasses, int engineDisables,
               int duressTicks, boolean missing) {

        boolean ran() {
            return result != null && result.ok;
        }

        boolean weak() {
            return !Double.isNaN(aps) && aps < WEAK_APS;
        }
    }

    private SessionReport() {}

    /** Mean survival share (0..1) over the weak battles that ran in rows [from, to), or NaN. */
    static double weakSurvival(List<Row> rows, int from, int to) {
        double sum = 0;
        int n = 0;
        for (int i = from; i < Math.min(to, rows.size()); i++) {
            Row r = rows.get(i);
            if (r.ran() && r.weak()) {
                sum += r.result().survivalShare();
                n++;
            }
        }
        return n == 0 ? Double.NaN : sum / n;
    }

    /** The weak battles that ran, in order. */
    static List<Row> weakRan(List<Row> rows) {
        return rows.stream().filter(r -> r.ran() && r.weak()).toList();
    }

    /** Mean survival over a window of weak battles, or NaN when it has none. */
    private static double mean(List<Row> weak) {
        return weak.isEmpty() ? Double.NaN
            : weak.stream().mapToDouble(r -> r.result().survivalShare()).average().getAsDouble();
    }

    /** Survival over the first {@code n} weak battles that ran. */
    static double firstWeakSurvival(List<Row> rows, int n) {
        List<Row> w = weakRan(rows);
        return mean(w.subList(0, Math.min(n, w.size())));
    }

    /** Survival over the last {@code n} weak battles that ran. */
    static double lastWeakSurvival(List<Row> rows, int n) {
        List<Row> w = weakRan(rows);
        return mean(w.subList(Math.max(0, w.size() - n), w.size()));
    }

    static int disables(List<Row> rows) {
        return rows.stream().mapToInt(Row::engineDisables).sum();
    }

    /**
     * The BENCH-6 reproduction gate: survival over the last 100 weak-opponent battles under
     * 85% while the first 50 are over 95% (at least 120 weak battles must have run), or the
     * engine disabled the robot at least once.
     */
    static boolean reproduced(List<Row> rows) {
        if (disables(rows) > 0) return true;
        if (weakRan(rows).size() < MIN_WEAK) return false;
        double first = firstWeakSurvival(rows, 50);
        double last = lastWeakSurvival(rows, 100);
        return first > 0.95 && last < 0.85;
    }

    static String render(Map<String, List<Row>> sessions, String heap, boolean fresh, boolean wipe, int rounds) {
        return render(sessions, heap, fresh, wipe, rounds, null);
    }

    /** As above, with a conditions line (engine, CPU constant, order) under the title when given. */
    static String render(Map<String, List<Row>> sessions, String heap, boolean fresh, boolean wipe, int rounds,
                         String conditions) {
        StringBuilder sb = new StringBuilder("# Session bench (BENCH-6)\n\n");
        if (conditions != null) sb.append(conditions).append("\n\n");
        sb.append(String.format(Locale.ROOT, "Heap cap %s, %s, data directory %s, %d rounds a battle, blocks of %d "
            + "battles. Weak means an opponent under %.0f APS.%n%n", heap,
            fresh ? "a fresh JVM per battle" : "one JVM for the whole session",
            wipe ? "wiped before every battle" : "kept throughout", rounds, BLOCK, WEAK_APS));
        for (Map.Entry<String, List<Row>> e : sessions.entrySet()) {
            List<Row> rows = e.getValue();
            sb.append("## ").append(e.getKey()).append("\n\n");
            sb.append("| battles | weak ran | weak survival | all survival | score share | skipped turns/battle "
                + "| disables | duress ticks | failed | heap MB after GC | longest pause ms | live classes |\n");
            sb.append("|---|---|---|---|---|---|---|---|---|---|---|---|\n");
            for (int from = 0; from < rows.size(); from += BLOCK) {
                int to = Math.min(from + BLOCK, rows.size());
                sb.append(block(rows.subList(from, to), from));
            }
            sb.append("\n");
            sb.append(String.format(Locale.ROOT, "First 50 weak survival %s, last 100 weak survival %s, engine "
                + "disables %d. **%s**%n%n", pct(firstWeakSurvival(rows, 50)),
                pct(lastWeakSurvival(rows, 100)), disables(rows),
                reproduced(rows) ? "Slide reproduced." : "No slide."));
        }
        if (sessions.size() == 2) {
            sb.append(sideBySide(sessions));
            sb.append(perOpponent(sessions));
        }
        return sb.toString();
    }

    private static String block(List<Row> rows, int from) {
        int weakRan = 0, failed = 0, ran = 0, skipped = 0, duressTicks = 0;
        double weakSurv = 0, allSurv = 0, score = 0, heap = 0, pause = 0;
        int classes = 0;
        int measured = 0;
        for (Row r : rows) {
            if (!r.missing()) {
                heap += r.heapMb();
                measured++;
            }
            pause = Math.max(pause, r.longestPauseMs());
            classes = r.loadedClasses();
            duressTicks += r.duressTicks();
            if (!r.ran()) {
                failed++;
                continue;
            }
            ran++;
            BattleResult b = r.result();
            allSurv += b.survivalShare();
            score += b.scoreShare();
            skipped += b.skippedTurns;
            if (r.weak()) {
                weakRan++;
                weakSurv += b.survivalShare();
            }
        }
        return String.format(Locale.ROOT, "| %d-%d | %d | %s | %s | %s | %.1f | %d | %d | %d | %.0f | %.1f | %d |%n",
            from + 1, from + rows.size(), weakRan, pct(weakRan == 0 ? Double.NaN : weakSurv / weakRan),
            pct(ran == 0 ? Double.NaN : allSurv / ran), pct(ran == 0 ? Double.NaN : score / ran),
            ran == 0 ? 0.0 : (double) skipped / ran, rows.stream().mapToInt(Row::engineDisables).sum(),
            duressTicks, failed, measured == 0 ? 0.0 : heap / measured, pause, classes);
    }

    /** BENCH-7: the robot's weak-survival and the control's, block by block. */
    private static String sideBySide(Map<String, List<Row>> sessions) {
        List<String> names = new ArrayList<>(sessions.keySet());
        List<Row> a = sessions.get(names.get(0)), b = sessions.get(names.get(1));
        StringBuilder sb = new StringBuilder("## Side by side (BENCH-7)\n\n");
        sb.append("| battles | ").append(names.get(0)).append(" weak survival | ").append(names.get(1))
            .append(" weak survival |\n|---|---|---|\n");
        for (int from = 0; from < Math.max(a.size(), b.size()); from += BLOCK) {
            sb.append(String.format(Locale.ROOT, "| %d-%d | %s | %s |%n", from + 1, from + BLOCK,
                pct(weakSurvival(a, from, from + BLOCK)), pct(weakSurvival(b, from, from + BLOCK))));
        }
        sb.append("\nA slide the control shares belongs to the engine or the opponents; one only the robot shows is ours.\n");
        return sb.toString();
    }

    /**
     * BENCH-77: each opponent's mean score share for the robot and the control over the
     * battles that ran, their difference in points, and the mean of those differences with each
     * opponent counted once, as LiteRumble's APS counts a pairing (issue #151, A1), so a session
     * over a short set fought several times reads like a live comparison of the two versions.
     */
    static String perOpponent(Map<String, List<Row>> sessions) {
        List<String> names = new ArrayList<>(sessions.keySet());
        Map<String, double[]> a = shares(sessions.get(names.get(0)));
        Map<String, double[]> b = shares(sessions.get(names.get(1)));
        StringBuilder sb = new StringBuilder("\n## Per opponent (BENCH-77)\n\n");
        sb.append("Mean score share over the battles that ran, in points; each opponent counts once in the mean.\n\n");
        sb.append("| opponent | battles | ").append(names.get(0)).append(" | ").append(names.get(1))
            .append(" | difference |\n|---|---|---|---|---|\n");
        double sum = 0;
        int n = 0;
        for (Map.Entry<String, double[]> e : a.entrySet()) {
            double[] other = b.get(e.getKey());
            if (other == null) continue;
            double x = 100 * e.getValue()[0] / e.getValue()[1], y = 100 * other[0] / other[1];
            sb.append(String.format(Locale.ROOT, "| %s | %d / %d | %.2f | %.2f | %+.2f |%n", e.getKey(),
                (int) e.getValue()[1], (int) other[1], x, y, x - y));
            sum += x - y;
            n++;
        }
        sb.append(String.format(Locale.ROOT, "%nMean difference over %d opponents: %s points.%n", n,
            n == 0 ? "n/a" : String.format(Locale.ROOT, "%+.2f", sum / n)));
        return sb.toString();
    }

    /** Opponent to {sum of score shares, battles} over the battles that ran, in first-seen order. */
    private static Map<String, double[]> shares(List<Row> rows) {
        Map<String, double[]> m = new LinkedHashMap<>();
        for (Row r : rows) {
            if (!r.ran()) continue;
            double[] acc = m.computeIfAbsent(r.opponent(), k -> new double[2]);
            acc[0] += r.result().scoreShare();
            acc[1]++;
        }
        return m;
    }

    private static String pct(double v) {
        return Double.isNaN(v) ? "n/a" : String.format(Locale.ROOT, "%.1f%%", v * 100);
    }

    /** Builds a battle's row from the session's own CSV record, for the bench's reader. */
    static Map<String, String> columns(String header, String line) {
        String[] h = header.split(",");
        String[] f = line.split(",");
        Map<String, String> m = new LinkedHashMap<>();
        for (int i = 0; i < h.length && i < f.length; i++) m.put(h[i], f[i]);
        return m;
    }
}
