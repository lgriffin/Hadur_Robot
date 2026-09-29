package hadur.bench;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reads a saved LiteRumble {@code BotDetails} page (MIME, HTML table: rank, name, APS, APS
 * CI, NPP, survival, KNNPBI, battles, latest battle, opponent APS, opponent survival) and
 * reports APS and survival by opponent-APS band, by UTC hour of the latest battle, a
 * before/after split at a given time, and, when a bench report is given, live minus bench
 * share for every opponent the two have in common (BENCH-5).
 */
final class LiveDetails {

    private LiveDetails() {}

    /** One row of the BotDetails table: one live pairing against one opponent. */
    record Pairing(String opponent, double aps, double survival, LocalDateTime latestBattleUtc,
                    double opponentAps, double opponentSurvival) {}

    private static final DateTimeFormatter BATTLE_TIME =
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Each pairing row is a <tr> of 11 <td> cells; the header row's cells are <th>, so this
    // pattern (row has a leading rank <td>) never matches it.
    private static final Pattern ROW = Pattern.compile(
        "<tr>\\s*<td>(\\d+)</td>.*?</tr>", Pattern.DOTALL);
    private static final Pattern CELL = Pattern.compile("<td[^>]*>(.*?)</td>", Pattern.DOTALL);
    private static final Pattern TAG = Pattern.compile("<[^>]*>");

    static List<Pairing> parse(Path mhtFile) {
        String html = read(mhtFile);
        List<Pairing> pairings = new ArrayList<>();
        Matcher rows = ROW.matcher(html);
        while (rows.find()) {
            List<String> cells = new ArrayList<>();
            Matcher cell = CELL.matcher(rows.group());
            while (cell.find()) cells.add(strip(cell.group(1)));
            // rank, flag, name, compare, APS, APS CI, NPP, survival, KNNPBI, battles,
            // latest battle, opponent APS, opponent survival
            if (cells.size() < 13) continue;
            pairings.add(new Pairing(cells.get(2), parseNum(cells.get(4)), parseNum(cells.get(7)),
                LocalDateTime.parse(cells.get(10), BATTLE_TIME), parseNum(cells.get(11)),
                parseNum(cells.get(12))));
        }
        return pairings;
    }

    private static String strip(String cell) {
        return TAG.matcher(cell).replaceAll("").trim();
    }

    private static double parseNum(String s) {
        return Double.parseDouble(s.replace("±", "").trim());
    }

    private static String read(Path f) {
        try {
            // A saved page can carry a stray non-UTF-8 byte outside the table we read (an
            // inline script or style); Files.readString is strict about that, so decode
            // leniently instead of failing on bytes this parser never looks at.
            return new String(Files.readAllBytes(f), java.nio.charset.StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** Opponent-APS bands, matching the plan's table (section 1.1). */
    private static final double[] BAND_EDGES = {0, 40, 50, 60, 70, 80, 101};

    private static String band(double opponentAps) {
        for (int i = 0; i < BAND_EDGES.length - 1; i++) {
            if (opponentAps < BAND_EDGES[i + 1] || i == BAND_EDGES.length - 2) {
                return (int) BAND_EDGES[i] + "-" + (int) BAND_EDGES[i + 1];
            }
        }
        return "?";
    }

    /** Parses a bench report's summary table into opponent name -> score share percent. */
    static Map<String, Double> parseBenchShares(Path reportMd) {
        Pattern row = Pattern.compile(
            "^\\|\\s*([^|]+?)\\s*\\|[^|]*\\|\\s*([0-9.]+)%[^|]*\\|", Pattern.MULTILINE);
        Map<String, Double> shares = new LinkedHashMap<>();
        Matcher m = row.matcher(read(reportMd));
        while (m.find()) {
            String name = m.group(1).trim();
            if (name.equals("Opponent") || name.isEmpty()) continue;
            shares.put(name, Double.parseDouble(m.group(2)));
        }
        return shares;
    }

    /**
     * Renders the report: APS/survival by band, by UTC hour, a before/after split at
     * {@code splitAt} (nullable), and live minus bench share for every opponent {@code
     * benchShares} (nullable/empty) also names.
     */
    static String report(String subject, List<Pairing> pairings, LocalDateTime splitAt,
                          Map<String, Double> benchShares) {
        StringBuilder b = new StringBuilder();
        b.append("# Live details: ").append(subject).append("\n\n");
        b.append(pairings.size()).append(" pairings, ")
            .append(pairings.stream().map(Pairing::latestBattleUtc).min(LocalDateTime::compareTo)
                .map(Object::toString).orElse("?"))
            .append(" to ")
            .append(pairings.stream().map(Pairing::latestBattleUtc).max(LocalDateTime::compareTo)
                .map(Object::toString).orElse("?"))
            .append(" UTC.\n\n");

        b.append("## By opponent-APS band\n\n");
        b.append("| Opponent APS | Pairings | APS | Survival |\n|---|---|---|---|\n");
        Map<String, List<Pairing>> byBand = new TreeMap<>();
        for (Pairing p : pairings) byBand.computeIfAbsent(band(p.opponentAps()), k -> new ArrayList<>()).add(p);
        for (Map.Entry<String, List<Pairing>> e : byBand.entrySet()) {
            appendRow(b, e.getKey(), e.getValue());
        }

        b.append("\n## By UTC hour of the latest battle\n\n");
        b.append("| Hour | Pairings | APS | Survival |\n|---|---|---|---|\n");
        Map<Integer, List<Pairing>> byHour = new TreeMap<>();
        for (Pairing p : pairings) byHour.computeIfAbsent(p.latestBattleUtc().getHour(), k -> new ArrayList<>()).add(p);
        for (Map.Entry<Integer, List<Pairing>> e : byHour.entrySet()) {
            appendRow(b, String.format(Locale.ROOT, "%02d:00", e.getKey()), e.getValue());
        }

        if (splitAt != null) {
            b.append("\n## Before/after ").append(splitAt).append(" UTC\n\n");
            b.append("| When | Pairings | APS | Survival |\n|---|---|---|---|\n");
            List<Pairing> before = pairings.stream().filter(p -> p.latestBattleUtc().isBefore(splitAt)).toList();
            List<Pairing> after = pairings.stream().filter(p -> !p.latestBattleUtc().isBefore(splitAt)).toList();
            appendRow(b, "before", before);
            appendRow(b, "after", after);
        }

        if (benchShares != null && !benchShares.isEmpty()) {
            b.append("\n## Live minus bench\n\n");
            b.append("| Opponent | Live APS | Bench share | Live minus bench |\n|---|---|---|---|\n");
            for (Pairing p : pairings) {
                Double bench = benchShares.get(p.opponent());
                if (bench == null) continue;
                b.append("| ").append(p.opponent()).append(" | ")
                    .append(String.format(Locale.ROOT, "%.2f", p.aps())).append(" | ")
                    .append(String.format(Locale.ROOT, "%.2f", bench)).append(" | ")
                    .append(String.format(Locale.ROOT, "%+.2f", p.aps() - bench)).append(" |\n");
            }
        }
        return b.toString();
    }

    private static void appendRow(StringBuilder b, String label, List<Pairing> rows) {
        if (rows.isEmpty()) {
            b.append("| ").append(label).append(" | 0 | - | - |\n");
            return;
        }
        double aps = rows.stream().mapToDouble(Pairing::aps).average().orElse(0);
        double survival = rows.stream().mapToDouble(Pairing::survival).average().orElse(0);
        b.append("| ").append(label).append(" | ").append(rows.size()).append(" | ")
            .append(String.format(Locale.ROOT, "%.1f", aps)).append(" | ")
            .append(String.format(Locale.ROOT, "%.1f", survival)).append(" |\n");
    }

    /**
     * {@code --page FILE} (required), {@code --split "yyyy-MM-dd HH:mm:ss"} (optional),
     * {@code --bench FILE} a bench report to diff against (optional), {@code --report FILE}
     * where to write the markdown (default stdout).
     */
    public static void main(String[] args) throws IOException {
        Map<String, String> opts = new LinkedHashMap<>();
        for (int i = 0; i < args.length - 1; i += 2) opts.put(args[i].replaceFirst("^--", ""), args[i + 1]);
        Path page = Path.of(opts.get("page"));
        List<Pairing> pairings = parse(page);
        LocalDateTime splitAt = opts.containsKey("split") ? LocalDateTime.parse(opts.get("split"), BATTLE_TIME) : null;
        Map<String, Double> benchShares = opts.containsKey("bench")
            ? parseBenchShares(Path.of(opts.get("bench"))) : Map.of();
        String subject = page.getFileName().toString();
        String out = report(subject, pairings, splitAt, benchShares);
        if (opts.containsKey("report")) Files.writeString(Path.of(opts.get("report")), out);
        else System.out.print(out);
    }
}
