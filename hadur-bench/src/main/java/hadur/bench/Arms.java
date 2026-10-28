package hadur.bench;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/**
 * BENCH-92: the arms of a multi-arm run ({@code --arms FILE}). Each line of the file is
 * {@code label | robot name | jar}, the robot name as Robocode lists it ({@code hadur2.Hadur 3.14aa}).
 * Every (opponent, seed) job fights every arm, cold, on one worker home, in an order shuffled
 * from the job (docs/plan-top5.md section 6.1), so a load or drift effect over a job falls on
 * every arm alike instead of on whichever arm a fixed order puts first.
 */
final class Arms {

    /** One arm: the label rows and directories carry, the robot's Robocode name, its jar. */
    record Arm(String label, String robot, Path jar) {}

    /** The columns of {@code arms.tsv}, one row per battle. */
    static final String HEADER = String.join("\t", "arm", "robot", "opponent", "role", "seed", "worker",
        "position", "ok", "rounds", "score", "theirScore", "score_share", "survival_share", "bullet_share", "firsts",
        "survival", "theirSurvival", "bulletDamage", "theirBulletDamage", "skippedTurns", "turnMaxMs",
        "engineDisables", "duressTicks", "hostCpuMean", "errors");

    private Arms() {}

    /**
     * The arms in {@code file}, relative jar paths resolved against {@code base}. Labels and robot
     * names must be distinct (two jars under one name would install to one file, BENCH-2), labels
     * must be safe in a directory name, and there must be at least two arms.
     */
    static List<Arm> parse(Path file, Path base) throws IOException {
        List<Arm> arms = new ArrayList<>();
        Set<String> labels = new HashSet<>(), robots = new HashSet<>();
        for (String raw : Files.readAllLines(file, StandardCharsets.UTF_8)) {
            String line = !raw.isEmpty() && raw.charAt(0) == 0xFEFF ? raw.substring(1) : raw;
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] f = line.split("\\|");
            if (f.length != 3) throw new IllegalArgumentException("arms line needs label | robot | jar: " + line);
            String label = f[0].trim(), robot = f[1].trim();
            if (!label.matches("[A-Za-z0-9._]+")) {
                throw new IllegalArgumentException("arm label must be letters, digits, '.' or '_': " + label);
            }
            if (robot.split(" ").length != 2) {
                throw new IllegalArgumentException("arm robot must be 'class version', as Robocode lists it: " + robot);
            }
            if (!labels.add(label)) throw new IllegalArgumentException("arm label used twice: " + label);
            if (!robots.add(robot)) throw new IllegalArgumentException("arm robot used twice: " + robot);
            arms.add(new Arm(label, robot, base.resolve(f[2].trim()).normalize()));
        }
        if (arms.size() < 2) throw new IllegalArgumentException("a multi-arm run needs at least two arms, not " + arms.size());
        return arms;
    }

    /**
     * The order a job fights its arms in: a shuffle seeded from the run's seed base, the seed and
     * the opponent, so a rerun of the same job fights them in the same order and two jobs rarely
     * share one.
     */
    static List<Arm> order(List<Arm> arms, int seedBase, int seed, String opponent) {
        List<Arm> out = new ArrayList<>(arms);
        long key = ((long) seedBase * 1_000_003L + seed) * 31L + opponent.hashCode();
        Collections.shuffle(out, new Random(key));
        return out;
    }

    /** One battle's row of {@code arms.tsv}; the errors column has tabs and line breaks blanked. */
    static String row(Arm arm, Opponent o, int seed, int worker, int position, BattleResult r) {
        String errors = r.errors == null ? "" : r.errors.replaceAll("[\\t\\r\\n]+", " ");
        return String.join("\t", arm.label(), arm.robot(), o.name, o.role, String.valueOf(seed),
            String.valueOf(worker), String.valueOf(position), String.valueOf(r.ok), String.valueOf(r.rounds),
            num(r.score), num(r.theirScore), num(r.scoreShare()), num(r.survivalShare()), num(r.bulletDamageShare()),
            String.valueOf(r.firsts), num(r.survival), num(r.theirSurvival), num(r.bulletDamage),
            num(r.theirBulletDamage), String.valueOf(r.skippedTurns), num(r.turnMaxMs),
            String.valueOf(r.engineDisables), String.valueOf(r.duressTicks), num(r.hostCpuMean), errors);
    }

    /** BENCH-95: the file in each battle's directory that keeps that battle's row, for a resumed run. */
    static final String ROW_FILE = "arm-row.tsv";

    /**
     * BENCH-95: the row a finished battle left in {@code dir}, when it was this arm's (same label and
     * robot), this opponent's and this seed's, and it finished ok; otherwise null, and the battle is
     * fought again. A failed or half-written battle never stands in for a fought one.
     */
    static String resumed(Path dir, Arm arm, Opponent o, int seed) {
        Path f = dir.resolve(ROW_FILE);
        try {
            if (!Files.isRegularFile(f)) return null;
            // Only the line break goes: strip() also took the tab before an empty errors column, the usual
            // case for a battle that went well, so no clean battle was ever read back (BENCH-128).
            String row = Files.readString(f, StandardCharsets.UTF_8).replaceAll("[\\r\\n]+$", "");
            String[] c = row.split("\t", -1);
            if (c.length != HEADER.split("\t").length) return null;
            boolean same = c[0].equals(arm.label()) && c[1].equals(arm.robot()) && c[2].equals(o.name)
                && c[4].equals(String.valueOf(seed));
            return same && c[7].equals("true") ? row : null;
        } catch (IOException e) {
            return null;
        }
    }

    private static String num(double x) {
        return Double.isNaN(x) ? "NaN" : String.format(Locale.ROOT, "%.4f", x);
    }
}
