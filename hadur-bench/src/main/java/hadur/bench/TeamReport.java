package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * A5's team report: per opponent team, the score share and rounds won (as the TeamRumble
 * scores them), how often a member of ours lived to the round's end, and the team gate's
 * counts: faults and skipped turns, link reports rejected (LINK-3), shots that left with a
 * living teammate truly in the lane (WEAVE-4), each member's count of enemies alive below
 * the truth (WORLD-8), the members' own team records ({@code T}), and the data files the
 * battle left behind (SHELF-2: no duel or melee shelf, and only the leader writes).
 */
public final class TeamReport {

    private TeamReport() {}

    /** One battle: its result and what its members printed. */
    public static final class Battle {
        public boolean ok;
        public double ourScore, totalScore;
        public int firsts, rounds, roundsWon, roundsSurvived;
        public int shots, shotsInLane, countBelowTruth, countReports;
        public int faults, skipped, linkRejects;
        /** Sums over the members' {@code T} records: teammate hits, teammate bullet hits, collisions, blocked shots, reports merged, drives fenced (T1). */
        public final long[] team = new long[6];
        /** The engine's count of our bullets that hit one of our own members (T1); -1 in older rounds.csv. */
        public int bulletsOnMates;
        /**
         * Ticks the members ran in duress, summed over their {@code R} records (field 33), and
         * how many R records carried the field; none when the members' logs are from before it.
         */
        public int duressTicks, duressRecords;
        /** Each member's own T sums, in the order of {@link #team}, by log name ({@code member-1}). */
        public final Map<String, long[]> members = new TreeMap<>();
        public List<String> dataFiles = List.of();

        double share() {
            return totalScore > 0 ? ourScore / totalScore : 0;
        }

        /** Files of a duel or melee shelf: a team battle writes neither (SHELF-2). */
        long strayShelves() {
            return dataFiles.stream().filter(f -> f.endsWith(".hp") || f.endsWith(".hm") || f.endsWith("battles.hc")).count();
        }

        String summary() {
            return String.format(Locale.ROOT, "score share %.1f%%, rounds won %d/%d, faults %d, skipped turns %d, "
                + "in-lane shots %d/%d, count below truth %d", share() * 100, roundsWon, rounds, faults, skipped,
                shotsInLane, shots, countBelowTruth);
        }
    }

    /**
     * Reads one battle's directory: {@code team.csv} for the scores, {@code rounds.csv} and
     * the {@code member-N.log} files for the rest. Our team is the row whose name starts
     * with our team's or our member's class name.
     */
    static Battle read(Path dir, String team, String member, List<String> dataFiles) throws IOException {
        Battle b = new Battle();
        b.dataFiles = dataFiles;
        Path scores = dir.resolve("team.csv");
        if (!Files.exists(scores)) return b;
        List<String> lines = Files.readAllLines(scores);
        if (lines.size() < 3) return b;
        String teamClass = team.split(" ")[0];
        boolean found = false;
        for (String line : lines.subList(1, lines.size())) {
            String[] f = line.split(",");
            double score = Double.parseDouble(f[2]);
            b.totalScore += score;
            if (f[1].startsWith(teamClass) || f[1].startsWith(member + " ") || f[1].equals(member)) {
                b.ourScore = score;
                b.firsts = Integer.parseInt(f[3]);
                found = true;
            }
        }
        Path rounds = dir.resolve("rounds.csv");
        if (!found || !Files.exists(rounds)) return b;
        for (String line : Files.readAllLines(rounds)) {
            if (line.startsWith("round")) continue;
            String[] f = line.split(",");
            b.rounds++;
            if (Integer.parseInt(f[1]) > 0) b.roundsSurvived++;
            b.roundsWon += Integer.parseInt(f[3]);
            b.shots += Integer.parseInt(f[4]);
            b.shotsInLane += Integer.parseInt(f[5]);
            b.countBelowTruth += Integer.parseInt(f[6]);
            b.countReports += Integer.parseInt(f[7]);
            if (f.length > 8) b.bulletsOnMates += Integer.parseInt(f[8]);
        }
        try (Stream<Path> logs = Files.list(dir)) {
            for (Path log : (Iterable<Path>) logs::iterator) {
                if (!log.getFileName().toString().startsWith("member-")) continue;
                for (String line : Files.readAllLines(log)) {
                    // round,turn,line
                    int second = line.indexOf(',', line.indexOf(',') + 1);
                    String text = second < 0 ? line : line.substring(second + 1);
                    if (text.startsWith("FAULT,")) b.faults++;
                    else if (text.startsWith("LINK,")) b.linkRejects++;
                    else if (text.startsWith("SYSTEM:") && text.contains("skipped turn")) b.skipped++;
                    else if (text.startsWith("T,")) {
                        String[] f = text.split(",");
                        long[] mine = b.members.computeIfAbsent(member(log), k -> new long[6]);
                        for (int i = 0; i < 5 && 3 + i < f.length; i++) {
                            long v = Long.parseLong(f[3 + i]);
                            b.team[i] += v;
                            mine[i] += v;
                        }
                        // T1: the count of drives the teammate fence replaced is the record's last field.
                        if (f.length > 10) {
                            long v = Long.parseLong(f[10]);
                            b.team[5] += v;
                            mine[5] += v;
                        }
                    } else if (text.startsWith("R,")) {
                        // RES-9: field 33 is the round's duress ticks; older logs stop short of it.
                        String[] f = text.split(",");
                        if (f.length >= 34) {
                            try {
                                b.duressTicks += Integer.parseInt(f[33]);
                                b.duressRecords++;
                            } catch (NumberFormatException ignored) {
                                // A malformed record is left out.
                            }
                        }
                    }
                }
            }
        }
        b.ok = b.rounds > 0;
        return b;
    }

    /** {@code member-1.log} as {@code member-1}. */
    private static String member(Path log) {
        return log.getFileName().toString().replaceFirst("\\.[^.]*$", "");
    }

    static String render(String label, String robot, Map<Opponent, List<Battle>> results,
                         int rounds, int width, int height) {
        return render(label, robot, results, rounds, width, height, null);
    }

    /**
     * As above; {@code host} (the CPU constant, the host description and the parallel width,
     * as the duel report prints them) is a paragraph of its own under the title, followed by
     * the skipped-turns tally and, when the members' R records carried it, the duress tally
     * (issue #102, BENCH-12).
     */
    static String render(String label, String robot, Map<Opponent, List<Battle>> results,
                         int rounds, int width, int height, String host) {
        StringBuilder r = new StringBuilder("# Team bench").append(label != null ? ": " + label : "")
            .append("\n\n").append(robot).append(String.format(Locale.ROOT,
                " against each team in turn, %d rounds a battle, %dx%d.%n%n", rounds, width, height));
        if (host != null) r.append(host).append("\n\n");
        List<Battle> every = new ArrayList<>();
        for (List<Battle> list : results.values()) every.addAll(list);
        r.append(tallies(every));
        r.append("| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | "
            + "LINK rejects | In-lane shots | Count < truth | Stray shelf files |\n");
        r.append("|---|---|---|---|---|---|---|---|---|---|---|\n");
        Battle all = new Battle();
        double shareSum = 0;
        int battles = 0, failed = 0;
        for (Map.Entry<Opponent, List<Battle>> e : results.entrySet()) {
            Battle sum = new Battle();
            double share = 0;
            int n = 0;
            for (Battle b : e.getValue()) {
                if (!b.ok) {
                    failed++;
                    continue;
                }
                n++;
                share += b.share();
                add(sum, b);
            }
            add(all, sum);
            shareSum += share;
            battles += n;
            r.append(String.format(Locale.ROOT, "| %s | %d | %s | %d/%d | %s | %d | %d | %d | %d/%d | %d/%d | %d |%n",
                e.getKey().name, n, n > 0 ? pct(share / n) : "-", sum.roundsWon, sum.rounds,
                pct(sum.rounds > 0 ? (double) sum.roundsSurvived / sum.rounds : 0), sum.faults, sum.skipped,
                sum.linkRejects, sum.shotsInLane, sum.shots, sum.countBelowTruth, sum.countReports,
                strays(e.getValue())));
        }
        r.append(String.format(Locale.ROOT, "| **All** | %d | %s | %d/%d | %s | %d | %d | %d | %d/%d | %d/%d | %d |%n%n",
            battles, battles > 0 ? pct(shareSum / battles) : "-", all.roundsWon, all.rounds,
            pct(all.rounds > 0 ? (double) all.roundsSurvived / all.rounds : 0), all.faults, all.skipped,
            all.linkRejects, all.shotsInLane, all.shots, all.countBelowTruth, all.countReports,
            results.values().stream().mapToLong(TeamReport::strays).sum()));
        r.append(String.format(Locale.ROOT, "Members' team records (sums): teammate hits %d, teammate bullet hits %d, "
            + "teammate collisions %d, shots held for the fire lane %d, reports merged %d, drives fenced %d.%n"
            + "Engine's count of our bullets that hit one of our own members: %d.%n",
            all.team[0], all.team[1], all.team[2], all.team[3], all.team[4], all.team[5], all.bulletsOnMates));
        if (failed > 0) r.append(String.format(Locale.ROOT, "%n**%d battle(s) failed**; see their engine.log.%n", failed));
        List<String> files = new ArrayList<>();
        for (List<Battle> list : results.values()) for (Battle b : list) for (String f : b.dataFiles) if (!files.contains(f)) files.add(f);
        r.append("\nData files written (any battle): ").append(files.isEmpty() ? "none" : String.join(", ", files)).append("\n");
        return r.toString();
    }

    /** The skipped-turns and (when carried) duress tallies over the battles that completed. */
    static String tallies(List<Battle> battles) {
        List<Integer> skipped = new ArrayList<>(), duress = new ArrayList<>();
        for (Battle b : battles) {
            if (!b.ok) continue;
            skipped.add(b.skipped);
            if (b.duressRecords > 0) duress.add(b.duressTicks);
        }
        String text = Report.tallyLine("Skipped turns", skipped, Report.TRUST_NOTE);
        if (!duress.isEmpty()) text += Report.tallyLine("Duress ticks", duress, "");
        return text;
    }

    /**
     * BENCH-2 for the team bench: the paired score-share difference (candidate minus
     * baseline) over one opponent's seeds, keeping only the seeds where both teams produced
     * a battle so a lone failure cannot shift later seeds' pairing.
     */
    static Stats pairedDiff(List<Battle> candidate, List<Battle> baseline) {
        List<Double> c = new ArrayList<>(), b = new ArrayList<>();
        for (int i = 0; i < Math.min(candidate.size(), baseline.size()); i++) {
            if (!candidate.get(i).ok || !baseline.get(i).ok) continue;
            c.add(candidate.get(i).share());
            b.add(baseline.get(i).share());
        }
        return Stats.pairedDiff(c, b);
    }

    private static Stats shares(List<Battle> battles) {
        List<Double> xs = new ArrayList<>();
        for (Battle b : battles) if (b.ok) xs.add(b.share());
        return Stats.of(xs);
    }

    /**
     * The paired A/B table, per opponent team (issue #102, BENCH-2's convention): the
     * candidate's and the baseline's battle against the same team at the same seed, so
     * noise common to both cancels. The last row pools every opponent's pairs.
     */
    static String renderPaired(Map<Opponent, List<Battle>> candidate, Map<Opponent, List<Battle>> baseline,
                               String robot, String baselineRobot) {
        StringBuilder r = new StringBuilder("\n## Paired A/B: ").append(robot).append(" vs ")
            .append(baselineRobot).append("\n\n")
            .append("Each row pairs the candidate's and the baseline's battle against the same team at the "
                + "same seed (BENCH-2). Score shares are mean \u00b1 95% interval over seeds; "
                + "positive is better for the candidate.\n\n")
            .append("| Opponent team | Candidate share | Baseline share | Paired diff (pp) |\n|---|---|---|---|\n");
        List<Battle> allCand = new ArrayList<>(), allBase = new ArrayList<>();
        for (Map.Entry<Opponent, List<Battle>> e : candidate.entrySet()) {
            List<Battle> base = baseline.getOrDefault(e.getKey(), List.of());
            r.append(String.format(Locale.ROOT, "| %s | %s | %s | %s |%n", e.getKey().name,
                shares(e.getValue()).percent(), shares(base).percent(),
                Report.signedDiff(pairedDiff(e.getValue(), base), 100)));
            for (int i = 0; i < Math.min(e.getValue().size(), base.size()); i++) {
                allCand.add(e.getValue().get(i));
                allBase.add(base.get(i));
            }
        }
        r.append(String.format(Locale.ROOT, "| **All** | %s | %s | %s |%n", shares(allCand).percent(),
            shares(allBase).percent(), Report.signedDiff(pairedDiff(allCand, allBase), 100)));
        return r.toString();
    }

    /**
     * One opposing team's own report for the per-opponent bench strategy (issue #102): the
     * seed-by-seed table (with the baseline's share and the paired difference when a baseline
     * ran), then the members' team records (T) for the diagnostics: the engine's count of
     * bullets that hit our own members, drives the teammate fence replaced, and each member's
     * own counts.
     */
    static String renderOpponent(Opponent o, String label, List<Battle> candidate, List<Battle> baseline,
                                 String robot, String baselineRobot, int rounds, int width, int height,
                                 String host) {
        boolean paired = baseline != null;
        StringBuilder r = new StringBuilder("# ").append(o.name).append(" (team) vs ").append(robot);
        if (label != null) r.append(" [").append(label).append("]");
        r.append("\n\n").append(String.format(Locale.ROOT, "%d rounds a battle, %d seeds, %dx%d.%n%n",
            rounds, candidate.size(), width, height));
        if (host != null) r.append(host).append("\n\n");
        r.append("## Battles\n\n| Seed | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects "
            + "| In-lane shots | Count < truth |");
        if (paired) r.append(" Baseline share | Paired diff (pp) |");
        r.append("\n|---|---|---|---|---|---|---|---|---|");
        if (paired) r.append("---|---|");
        r.append('\n');
        for (int i = 0; i < candidate.size(); i++) {
            Battle b = candidate.get(i);
            r.append("| ").append(i + 1).append(" |");
            if (!b.ok) {
                r.append(" failed | | | | | | | |");
            } else {
                r.append(String.format(Locale.ROOT, " %s | %d/%d | %s | %d | %d | %d | %d/%d | %d/%d |",
                    pct(b.share()), b.roundsWon, b.rounds,
                    pct(b.rounds > 0 ? (double) b.roundsSurvived / b.rounds : 0), b.faults, b.skipped,
                    b.linkRejects, b.shotsInLane, b.shots, b.countBelowTruth, b.countReports));
            }
            if (paired) {
                Battle base = i < baseline.size() ? baseline.get(i) : null;
                boolean baseOk = base != null && base.ok;
                r.append(baseOk ? " " + pct(base.share()) + " |" : " - |");
                r.append(b.ok && baseOk
                    ? String.format(Locale.ROOT, " %+.1f |", (b.share() - base.share()) * 100) : " - |");
            }
            r.append('\n');
        }
        r.append("\nMean score share ").append(shares(candidate).percent());
        if (paired) {
            r.append(", baseline ").append(shares(baseline).percent()).append(", paired diff ")
             .append(Report.signedDiff(pairedDiff(candidate, baseline), 100));
        }
        r.append(".\n\n").append(tallies(candidate));

        Battle sum = new Battle();
        for (Battle b : candidate) if (b.ok) add(sum, b);
        r.append("## Team records (T), summed over the seeds\n\n")
         .append("- Teammate hits: ").append(sum.team[0]).append("\n")
         .append("- Teammate bullet hits: ").append(sum.team[1]).append("\n")
         .append("- Teammate collisions: ").append(sum.team[2]).append("\n")
         .append("- Shots held for the fire lane: ").append(sum.team[3]).append("\n")
         .append("- Reports merged: ").append(sum.team[4]).append("\n")
         .append("- Engine's count of our bullets that hit one of our own members: ")
         .append(sum.bulletsOnMates).append("\n")
         .append("- Drives fenced: ").append(sum.team[5]).append("\n");
        Map<String, long[]> perMember = new TreeMap<>();
        for (Battle b : candidate) {
            if (!b.ok) continue;
            for (Map.Entry<String, long[]> m : b.members.entrySet()) {
                long[] t = perMember.computeIfAbsent(m.getKey(), k -> new long[6]);
                for (int i = 0; i < t.length; i++) t[i] += m.getValue()[i];
            }
        }
        if (!perMember.isEmpty()) {
            r.append("\nMembers:\n\n| Member | Teammate hits | Teammate bullet hits | Collisions | Shots held "
                + "| Reports merged | Drives fenced |\n|---|---|---|---|---|---|---|\n");
            for (Map.Entry<String, long[]> m : perMember.entrySet()) {
                long[] t = m.getValue();
                r.append(String.format(Locale.ROOT, "| %s | %d | %d | %d | %d | %d | %d |%n", m.getKey(),
                    t[0], t[1], t[2], t[3], t[4], t[5]));
            }
        }
        return r.toString();
    }

    private static long strays(List<Battle> list) {
        return list.stream().mapToLong(Battle::strayShelves).sum();
    }

    private static void add(Battle to, Battle b) {
        to.rounds += b.rounds;
        to.roundsWon += b.roundsWon;
        to.roundsSurvived += b.roundsSurvived;
        to.shots += b.shots;
        to.shotsInLane += b.shotsInLane;
        to.countBelowTruth += b.countBelowTruth;
        to.countReports += b.countReports;
        to.faults += b.faults;
        to.skipped += b.skipped;
        to.linkRejects += b.linkRejects;
        to.bulletsOnMates += b.bulletsOnMates;
        to.duressTicks += b.duressTicks;
        to.duressRecords += b.duressRecords;
        for (int i = 0; i < to.team.length; i++) to.team[i] += b.team[i];
    }

    private static String pct(double v) {
        return String.format(Locale.ROOT, "%.1f%%", v * 100);
    }
}
