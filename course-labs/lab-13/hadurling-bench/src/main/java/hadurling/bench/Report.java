package hadurling.bench;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/** Turns the numbers a bench run collected into Markdown. Pure text in, text out, so it is tested. */
public final class Report {

    private Report() {}

    /**
     * One version's score share per opponent and overall.
     *
     * @param title the heading
     * @param perOpponent the score share of each battle, by opponent, one entry per seed in
     *     seed order
     * @return a Markdown table; the last row averages the opponents seed by seed
     */
    public static String single(String title, Map<String, List<Double>> perOpponent) {
        StringBuilder b = new StringBuilder("## ").append(title).append("\n\n");
        b.append("| Opponent | Score share, mean +/- 95% |\n|---|---|\n");
        for (Map.Entry<String, List<Double>> e : perOpponent.entrySet()) {
            b.append("| ").append(e.getKey()).append(" | ").append(Stats.of(e.getValue()).percent()).append(" |\n");
        }
        b.append("| **all, averaged per seed** | **").append(Stats.of(overall(perOpponent)).percent()).append("** |\n");
        return b.toString();
    }

    /**
     * The score share averaged over the opponents, seed by seed, so there is one value per seed
     * and two versions can be paired on it.
     *
     * @param perOpponent each opponent's score share per seed
     * @return one value per seed, in seed order (the shortest opponent's length)
     */
    public static List<Double> overall(Map<String, List<Double>> perOpponent) {
        int seeds = perOpponent.values().stream().mapToInt(List::size).min().orElse(0);
        java.util.ArrayList<Double> out = new java.util.ArrayList<>();
        for (int i = 0; i < seeds; i++) {
            double sum = 0;
            for (List<Double> shares : perOpponent.values()) sum += shares.get(i);
            out.add(sum / perOpponent.size());
        }
        return out;
    }

    /**
     * A paired A/B: the same seeds for both versions.
     *
     * @param baselineLabel what the old version is called, for example "baseline"
     * @param baseline the old version's score share per seed
     * @param candidateLabel what the new version is called
     * @param candidate the new version's score share per seed, same seeds, same order
     * @return a Markdown section with both means, the paired difference with its interval, and
     *     the verdict in words
     */
    public static String compare(String baselineLabel, List<Double> baseline, String candidateLabel,
            List<Double> candidate) {
        Stats diff = Stats.pairedDiff(candidate, baseline);
        StringBuilder b = new StringBuilder("## A/B on paired seeds\n\n");
        b.append("| Version | Score share, mean +/- 95% |\n|---|---|\n");
        b.append("| ").append(baselineLabel).append(" | ").append(Stats.of(baseline).percent()).append(" |\n");
        b.append("| ").append(candidateLabel).append(" | ").append(Stats.of(candidate).percent()).append(" |\n\n");
        String d = Double.isNaN(diff.halfWidth()) ? "unknown"
            : String.format(Locale.ROOT, "%+.1f +/- %.1f points", diff.mean() * 100, diff.halfWidth() * 100);
        b.append("Paired difference (candidate minus baseline): ").append(d).append(" over ").append(diff.n()).append(" seeds.\n\n");
        switch (diff.verdict()) {
            case BETTER:
                b.append("**Better, outside the noise:** the whole interval is above zero.\n");
                break;
            case WORSE:
                b.append("**Worse, outside the noise:** the whole interval is below zero.\n");
                break;
            default:
                b.append("**Inside the noise:** the interval includes zero (or there are too few seeds to say). "
                    + "Run more seeds before believing either way.\n");
        }
        return b.toString();
    }
}
