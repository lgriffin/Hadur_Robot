package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * The per-round series of a bench run (issue #117, G3). Each battle's child writes
 * {@code rounds.tsv} into its battle directory; this class reads them back, merges a run's
 * worth into one file, and (as a program) prints the first-rounds against last-rounds report.
 *
 * <p>{@code java -cp <bench classpath> hadur.bench.RoundSeries <work dir> --candidate <robot>
 * [--baseline <robot>] [--tsv <out.tsv>] [--report <out.md>]}</p>
 */
public final class RoundSeries {

    public static final String HEADER =
        "build\topponent\tseed\tround\twon\tsurvived\tticks\tdamageDealt\tdamageTaken\thitRate\tduressTicks\tskips";

    /** One round of one battle. {@code won} and {@code hitRate} are unknown (-1, NaN) when no R record arrived. */
    public static final class Row {
        public final String build, opponent;
        public final int seed, round, won, survived, duressTicks, skips;
        public final long ticks;
        public final double damageDealt, damageTaken, hitRate;

        Row(String build, String opponent, int seed, int round, int won, int survived, long ticks,
            double damageDealt, double damageTaken, double hitRate, int duressTicks, int skips) {
            this.build = build;
            this.opponent = opponent;
            this.seed = seed;
            this.round = round;
            this.won = won;
            this.survived = survived;
            this.ticks = ticks;
            this.damageDealt = damageDealt;
            this.damageTaken = damageTaken;
            this.hitRate = hitRate;
            this.duressTicks = duressTicks;
            this.skips = skips;
        }

        /** Bullet-damage share of the round, or NaN when neither robot hurt the other. */
        double damageShare() {
            double t = damageDealt + damageTaken;
            return t == 0 ? Double.NaN : damageDealt / t;
        }
    }

    private RoundSeries() {}

    /** The battle's rows as TSV lines (no header), one per round. */
    static String toTsv(String build, String opponent, int seed, List<LogHarvester.RoundRow> rounds) {
        StringBuilder b = new StringBuilder();
        for (LogHarvester.RoundRow r : rounds) {
            b.append(String.join("\t", clean(build), clean(opponent), String.valueOf(seed),
                String.valueOf(r.round), r.hasRecord ? (r.won ? "1" : "0") : "", r.alive ? "1" : "0",
                String.valueOf(r.ticks), num(r.damageDealt), num(r.damageTaken),
                Double.isNaN(r.ourHitRate) ? "" : String.format(Locale.ROOT, "%.4f", r.ourHitRate),
                r.hasRecord ? String.valueOf(r.duressTicks) : "", String.valueOf(r.skips))).append('\n');
        }
        return b.toString();
    }

    /** Writes {@code rounds.tsv} (header, then rows) into a battle directory. */
    static void write(Path dir, String build, String opponent, int seed,
                      List<LogHarvester.RoundRow> rounds) throws IOException {
        Files.writeString(dir.resolve("rounds.tsv"), HEADER + "\n" + toTsv(build, opponent, seed, rounds));
    }

    /** Rows from TSV text; the header line and any short or unreadable line are skipped. */
    static List<Row> parse(String text) {
        List<Row> rows = new ArrayList<>();
        for (String line : text.split("\\R")) {
            if (line.isEmpty() || line.startsWith("build\t")) continue;
            String[] f = line.split("\t", -1);
            if (f.length < 12) continue;
            try {
                rows.add(new Row(f[0], f[1], Integer.parseInt(f[2]), Integer.parseInt(f[3]),
                    f[4].isEmpty() ? -1 : Integer.parseInt(f[4]), Integer.parseInt(f[5]),
                    Long.parseLong(f[6]), Double.parseDouble(f[7]), Double.parseDouble(f[8]),
                    f[9].isEmpty() ? Double.NaN : Double.parseDouble(f[9]),
                    f[10].isEmpty() ? 0 : Integer.parseInt(f[10]), Integer.parseInt(f[11])));
            } catch (NumberFormatException ignored) {
                // A line cut short by a killed battle is left out.
            }
        }
        return rows;
    }

    /** Every {@code <work>/battles/*}{@code /rounds.tsv}, in directory-name order. */
    static List<Row> readAll(Path work) throws IOException {
        Path battles = work.resolve("battles");
        List<Row> rows = new ArrayList<>();
        if (!Files.isDirectory(battles)) return rows;
        List<Path> dirs;
        try (Stream<Path> s = Files.list(battles)) {
            dirs = s.filter(Files::isDirectory).sorted(Comparator.comparing(p -> p.getFileName().toString())).toList();
        }
        for (Path d : dirs) {
            Path f = d.resolve("rounds.tsv");
            if (Files.exists(f)) rows.addAll(parse(Files.readString(f)));
        }
        return rows;
    }

    /** The merged run file: header, then every row. */
    static String merge(List<Row> rows) {
        StringBuilder b = new StringBuilder(HEADER).append('\n');
        for (Row r : rows) {
            b.append(String.join("\t", r.build, r.opponent, String.valueOf(r.seed), String.valueOf(r.round),
                r.won < 0 ? "" : String.valueOf(r.won), String.valueOf(r.survived), String.valueOf(r.ticks),
                num(r.damageDealt), num(r.damageTaken),
                Double.isNaN(r.hitRate) ? "" : String.format(Locale.ROOT, "%.4f", r.hitRate),
                String.valueOf(r.duressTicks), String.valueOf(r.skips))).append('\n');
        }
        return b.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("usage: RoundSeries <work dir> --candidate <robot> [--baseline <robot>] "
                + "[--tsv <file>] [--report <file>]");
            System.exit(2);
        }
        Path work = Path.of(args[0]);
        String candidate = null, baseline = null, tsv = null, report = null;
        for (int i = 1; i + 1 < args.length; i += 2) {
            switch (args[i]) {
                case "--candidate" -> candidate = args[i + 1];
                case "--baseline" -> baseline = args[i + 1];
                case "--tsv" -> tsv = args[i + 1];
                case "--report" -> report = args[i + 1];
                default -> throw new IllegalArgumentException("unknown option " + args[i]);
            }
        }
        List<Row> rows = readAll(work);
        if (tsv != null) Files.writeString(Path.of(tsv), merge(rows));
        if (candidate != null) {
            String md = Report.renderRoundSplit(rows, candidate, baseline);
            if (report != null) Files.writeString(Path.of(report), md);
            else System.out.println(md);
        }
        System.out.println(rows.size() + " round rows from " + work);
    }

    private static String clean(String s) {
        return s.replace('\t', ' ').replace('\n', ' ');
    }

    private static String num(double d) {
        return String.format(Locale.ROOT, "%.1f", d);
    }
}
