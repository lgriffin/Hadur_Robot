package hadur.bench;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * BENCH-53: the data and arithmetic of {@code --repeat K}, which fights the same (jar,
 * opponent, seed) K times to measure how much a battle's score share moves when nothing but
 * the host changes. {@code repeat.tsv} is the data file; the analysis lives in data/tools.
 */
final class RepeatStudy {

    private RepeatStudy() {}

    static final String HEADER = "build\topponent\tseed\trep\tok\tscoreShare\tsurvivalShare\tbulletDamageShare\t"
        + "skippedTurns\thostCpuMean\totherJvms";

    /** One repeated battle. */
    record Row(String build, String opponent, int seed, int rep, boolean ok, double scoreShare,
               double survivalShare, double bulletDamageShare, int skippedTurns, double hostCpuMean,
               int otherJvms) {

        static Row of(String build, String opponent, int seed, int rep, BattleResult r) {
            return new Row(build, opponent, seed, rep, r.ok, r.scoreShare(), r.survivalShare(),
                r.bulletDamageShare(), r.skippedTurns, r.hostCpuMean, r.otherJvms);
        }

        String tsv() {
            return String.join("\t", build, opponent, String.valueOf(seed), String.valueOf(rep),
                String.valueOf(ok), num(scoreShare), num(survivalShare), num(bulletDamageShare),
                String.valueOf(skippedTurns), num(hostCpuMean), String.valueOf(otherJvms));
        }
    }

    private static String num(double d) {
        return Double.isNaN(d) ? "NaN" : String.format(Locale.ROOT, "%.6f", d);
    }

    static String tsv(List<Row> rows) {
        StringBuilder b = new StringBuilder(HEADER).append('\n');
        for (Row r : rows) b.append(r.tsv()).append('\n');
        return b.toString();
    }

    /** Sample standard deviation (n-1); NaN below two values. */
    static double sd(List<Double> xs) {
        if (xs.size() < 2) return Double.NaN;
        double mean = xs.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
        double ss = 0;
        for (double x : xs) ss += (x - mean) * (x - mean);
        return Math.sqrt(ss / (xs.size() - 1));
    }

    /**
     * The within-group standard deviation pooled over groups of repeats (each group one seed
     * of one opponent): the square root of the summed squares about each group's mean over the
     * summed degrees of freedom. NaN when no group has two battles.
     */
    static double pooledSd(Collection<List<Double>> groups) {
        double ss = 0;
        int df = 0;
        for (List<Double> g : groups) {
            if (g.size() < 2) continue;
            double mean = g.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            for (double x : g) ss += (x - mean) * (x - mean);
            df += g.size() - 1;
        }
        return df == 0 ? Double.NaN : Math.sqrt(ss / df);
    }

    /** Groups the ok rows' score shares by build, then opponent, then seed. */
    static Map<String, Map<String, Map<Integer, List<Double>>>> group(List<Row> rows) {
        Map<String, Map<String, Map<Integer, List<Double>>>> out = new LinkedHashMap<>();
        for (Row r : rows) {
            if (!r.ok()) continue;
            out.computeIfAbsent(r.build(), k -> new LinkedHashMap<>())
                .computeIfAbsent(r.opponent(), k -> new LinkedHashMap<>())
                .computeIfAbsent(r.seed(), k -> new ArrayList<>()).add(r.scoreShare());
        }
        return out;
    }

    /** The markdown the run prints: score-share SD in percentage points per opponent and pooled, per build. */
    static String render(List<Row> rows, int repeats) {
        StringBuilder b = new StringBuilder("# Repeatability: same jar, opponent and seed, ")
            .append(repeats).append(" times\n\n");
        long failed = rows.stream().filter(r -> !r.ok()).count();
        b.append(rows.size()).append(" battles, ").append(failed).append(" failed (left out of the SDs).\n\n");
        for (Map.Entry<String, Map<String, Map<Integer, List<Double>>>> build : group(rows).entrySet()) {
            b.append("## ").append(build.getKey()).append("\n\n");
            b.append("| Opponent | Seeds | Battles | Score share SD (pp) |\n|---|---:|---:|---:|\n");
            List<List<Double>> all = new ArrayList<>();
            for (Map.Entry<String, Map<Integer, List<Double>>> opp : build.getValue().entrySet()) {
                Collection<List<Double>> groups = opp.getValue().values();
                all.addAll(groups);
                int battles = groups.stream().mapToInt(List::size).sum();
                b.append(String.format(Locale.ROOT, "| %s | %d | %d | %s |%n", opp.getKey(), groups.size(),
                    battles, pp(pooledSd(groups))));
            }
            b.append(String.format(Locale.ROOT, "%nPooled over all opponents: **%s pp**.%n%n", pp(pooledSd(all))));
        }
        return b.toString();
    }

    private static String pp(double sd) {
        return Double.isNaN(sd) ? "n/a" : String.format(Locale.ROOT, "%.2f", sd * 100);
    }
}
