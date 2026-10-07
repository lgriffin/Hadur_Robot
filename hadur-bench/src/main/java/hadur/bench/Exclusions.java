package hadur.bench;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * BENCH-63: the opponents that failed all, or at least half, of their battles, so a set that
 * quietly shrank says so at the top of its report. Pure: no battle is started here.
 */
final class Exclusions {

    private Exclusions() {}

    /** One unit of the run (an opponent, a build against an opponent, or a melee field) and how its battles went. */
    record Tally(String unit, int battles, int failed, String firstReason) {
        boolean excluded() {
            return failed > 0 && failed * 2 >= battles;
        }

        boolean all() {
            return failed == battles;
        }
    }

    /** Collects one outcome per battle, in the order the units first appear. */
    static final class Counter {
        private final Map<String, int[]> counts = new LinkedHashMap<>();
        private final Map<String, String> reasons = new LinkedHashMap<>();

        synchronized void add(String unit, boolean ok, String why) {
            int[] c = counts.computeIfAbsent(unit, k -> new int[2]);
            c[0]++;
            if (!ok) {
                c[1]++;
                reasons.putIfAbsent(unit, reason(why));
            }
        }

        synchronized List<Tally> tallies() {
            List<Tally> out = new ArrayList<>();
            counts.forEach((u, c) -> out.add(new Tally(u, c[0], c[1], reasons.getOrDefault(u, ""))));
            return out;
        }
    }

    /** The first line of a failure's reason, cut to 160 characters; "no result" when it says nothing. */
    static String reason(String why) {
        if (why == null || why.isBlank()) return "no result";
        String first = why.strip().lines().findFirst().orElse("").strip();
        if (first.isEmpty()) return "no result";
        return first.length() > 160 ? first.substring(0, 157) + "..." : first;
    }

    static List<Tally> excluded(List<Tally> all) {
        return all.stream().filter(Tally::excluded).toList();
    }

    /** The report block: empty when no unit failed half its battles or more. */
    static String block(List<Tally> all) {
        List<Tally> ex = excluded(all);
        if (ex.isEmpty()) return "";
        StringBuilder b = new StringBuilder("## Excluded or failing opponents\n\n");
        b.append("These failed at least half of their battles, so their rows are missing or thin and the set is smaller than it was asked to be.\n\n");
        b.append("| Opponent | Battles failed | First failure |\n|---|---|---|\n");
        for (Tally t : ex) {
            b.append("| ").append(cell(t.unit())).append(" | ").append(t.failed()).append(" of ").append(t.battles())
                .append(t.all() ? " (all)" : "").append(" | ").append(cell(t.firstReason())).append(" |\n");
        }
        return b.append("\n").toString();
    }

    private static String cell(String s) {
        return s.replace("|", "\\|");
    }

    /** {@code block} placed after the report's title line and the blank line that follows it. */
    static String insertAfterTitle(String report, String block) {
        if (block.isEmpty()) return report;
        int nl = report.indexOf('\n');
        if (!report.startsWith("# ") || nl < 0) return block + report;
        int at = nl + 1;
        while (at < report.length() && report.charAt(at) == '\n') at++;
        return report.substring(0, at) + block + report.substring(at);
    }

    /** One line for the end of the run's console output; empty when nothing was excluded. */
    static String summary(List<Tally> all) {
        List<Tally> ex = excluded(all);
        if (ex.isEmpty()) return "";
        List<String> names = new ArrayList<>();
        for (Tally t : ex) names.add(t.unit() + " (" + t.failed() + "/" + t.battles() + ")");
        return ex.size() + " opponent" + (ex.size() == 1 ? "" : "s") + " failed at least half of their battles: "
            + String.join(", ", names);
    }

    /** The tallies as plain maps for {@code conditions.json}. */
    static List<Map<String, Object>> toMaps(List<Tally> all) {
        List<Map<String, Object>> out = new ArrayList<>();
        for (Tally t : excluded(all)) {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("opponent", t.unit());
            m.put("battles", t.battles());
            m.put("failed", t.failed());
            m.put("firstFailure", t.firstReason());
            out.add(m);
        }
        return out;
    }
}
