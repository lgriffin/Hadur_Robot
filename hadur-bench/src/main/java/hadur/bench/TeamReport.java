package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
        /** Sums over the members' {@code T} records: teammate hits, teammate bullet hits, collisions, blocked shots, reports merged. */
        public final long[] team = new long[5];
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
                        for (int i = 0; i < 5 && 3 + i < f.length; i++) b.team[i] += Long.parseLong(f[3 + i]);
                    }
                }
            }
        }
        b.ok = b.rounds > 0;
        return b;
    }

    static String render(String label, String robot, Map<Opponent, List<Battle>> results,
                         int rounds, int width, int height) {
        StringBuilder r = new StringBuilder("# Team bench").append(label != null ? ": " + label : "")
            .append("\n\n").append(robot).append(String.format(Locale.ROOT,
                " against each team in turn, %d rounds a battle, %dx%d.%n%n", rounds, width, height));
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
            + "teammate collisions %d, shots held for the fire lane %d, reports merged %d.%n",
            all.team[0], all.team[1], all.team[2], all.team[3], all.team[4]));
        if (failed > 0) r.append(String.format(Locale.ROOT, "%n**%d battle(s) failed**; see their engine.log.%n", failed));
        List<String> files = new ArrayList<>();
        for (List<Battle> list : results.values()) for (Battle b : list) for (String f : b.dataFiles) if (!files.contains(f)) files.add(f);
        r.append("\nData files written (any battle): ").append(files.isEmpty() ? "none" : String.join(", ", files)).append("\n");
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
        for (int i = 0; i < to.team.length; i++) to.team[i] += b.team[i];
    }

    private static String pct(double v) {
        return String.format(Locale.ROOT, "%.1f%%", v * 100);
    }
}
