package hadur.bench;

import java.util.List;
import java.util.Locale;

/**
 * BENCH-54: {@code --cold-warm}. Each seed is fought twice by each build: cold (data directory
 * wiped) and then warm, on the shelf that cold battle left. {@code cold-warm.tsv} records the
 * pairing, with the shelf each warm battle began on, so a later tool can compute the value of
 * learning (warm minus cold) per opponent per build.
 */
final class ColdWarm {

    private ColdWarm() {}

    static final String HEADER = "build\topponent\tseed\tcoldOk\twarmOk\tcoldScoreShare\twarmScoreShare\tdelta\t"
        + "shelfFiles\tshelfBytes\tshelfSha256\tcoldDir\twarmDir";

    /** One seed's cold and warm battles of one build, and the shelf the warm one started on. */
    record Row(String build, String opponent, int seed, BattleResult cold, BattleResult warm,
               Conditions.Shelf shelf, String coldDir, String warmDir) {

        double delta() {
            return cold.ok && warm.ok ? warm.scoreShare() - cold.scoreShare() : Double.NaN;
        }

        String tsv() {
            return String.join("\t", build, opponent, String.valueOf(seed), String.valueOf(cold.ok),
                String.valueOf(warm.ok), num(cold.scoreShare()), num(warm.scoreShare()), num(delta()),
                String.valueOf(shelf.files()), String.valueOf(shelf.bytes()), shelf.sha256(), coldDir, warmDir);
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

    /** A footer for the report: the mean warm-minus-cold score share per build over the complete pairs. */
    static String render(List<Row> rows) {
        StringBuilder b = new StringBuilder("\n## Cold versus warm\n\n");
        b.append("Each seed fought cold, then warm on the shelf the cold battle left (`cold-warm.tsv`).\n\n");
        b.append("| Build | Complete pairs | Cold | Warm | Warm minus cold |\n|---|---:|---:|---:|---:|\n");
        for (String build : rows.stream().map(Row::build).distinct().toList()) {
            List<Row> mine = rows.stream().filter(r -> r.build().equals(build) && !Double.isNaN(r.delta())).toList();
            List<Double> cold = mine.stream().map(r -> r.cold().scoreShare()).toList();
            List<Double> warm = mine.stream().map(r -> r.warm().scoreShare()).toList();
            b.append(String.format(Locale.ROOT, "| %s | %d | %s | %s | %s |%n", build, mine.size(),
                Stats.of(cold).percent(), Stats.of(warm).percent(), Stats.pairedDiff(warm, cold).percent()));
        }
        return b.append('\n').toString();
    }
}
