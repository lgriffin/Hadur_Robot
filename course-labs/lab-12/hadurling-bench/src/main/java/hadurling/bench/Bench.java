package hadurling.bench;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Fights Hadurling against some opponents, headless, several times with different seeds, and
 * says how well it did with an interval. With {@code --baseline-jar} it fights an older jar on
 * the same seeds and says whether the difference is outside the noise.
 *
 * <pre>
 * cd hadurling-bench
 * mvn -q exec:java -Dexec.args="--opponent sample.Crazy,sample.Walls --rounds 10 --seeds 5"
 * </pre>
 *
 * <p>Run it after {@code mvn package} in the lab's root folder, which builds the robot jar.
 * Options:</p>
 * <ul>
 * <li>{@code --robot-jar FILE}: the robot to measure
 *     (default {@code ../hadurling-robot/target/hadurling.Hadurling_0.1.jar});</li>
 * <li>{@code --baseline-jar FILE}: an older jar to compare against, on the same seeds;</li>
 * <li>{@code --baseline-name TEXT}, {@code --candidate-name TEXT}: how the two versions are
 *     called in the A/B table (default {@code baseline} and {@code candidate});</li>
 * <li>{@code --robot NAME}: the robot's name as Robocode lists it
 *     (default {@code hadurling.Hadurling 0.1}); both jars must use it;</li>
 * <li>{@code --opponent A,B}: opponents by name (default {@code sample.Crazy}); the engine's
 *     sample robots are installed;</li>
 * <li>{@code --opponent-jar X.jar,Y.jar}: robot jars of your own (a sparring partner you wrote)
 *     to install as well, so that {@code --opponent} can name them;</li>
 * <li>{@code --rounds N} (default 35), {@code --seeds N} (default 5), {@code --field WxH}
 *     (default 800x600);</li>
 * <li>{@code --warm}: keep the robot's data folder between battles; the default is a cold
 *     start, wiping it before every battle, so each battle stands alone;</li>
 * <li>{@code --out DIR}: working folder (default {@code work/<time>}); {@code --report FILE}:
 *     also write the report there.</li>
 * </ul>
 *
 * <p>Each battle runs in its own JVM ({@link BattleRunner}) with {@code -DRANDOMSEED=<seed>},
 * seeds 1 to N, so the same command gives the same result. The numbers are the robot's score
 * as a share of the two robots' scores together.</p>
 */
public final class Bench {

    private static final List<String> JVM_FLAGS = List.of(
        "--add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED",
        "--add-opens=java.base/java.lang=ALL-UNNAMED",
        "--add-opens=java.base/java.util=ALL-UNNAMED",
        "--add-opens=java.base/java.net=ALL-UNNAMED",
        "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
        // Keep Robocode's security manager on, as in a real Robocode install. (Java 18 and later
        // turn it off by default; Java 24 removed it. Use a JDK between 17 and 21 for the bench.)
        "-Djava.security.manager=allow",
        "-Djava.awt.headless=true");

    private final Map<String, String> opts;

    private Bench(Map<String, String> opts) {
        this.opts = opts;
    }

    /**
     * Runs the bench.
     *
     * @param args the options in the class comment
     * @throws Exception if a child process cannot be started
     */
    public static void main(String[] args) throws Exception {
        System.exit(new Bench(parse(args)).run());
    }

    static Map<String, String> parse(String[] args) {
        Map<String, String> out = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            if (!args[i].startsWith("--")) throw new IllegalArgumentException("unexpected " + args[i]);
            String key = args[i].substring(2);
            boolean flag = key.equals("warm");
            out.put(key, flag ? "true" : args[++i]);
        }
        return out;
    }

    private int run() throws Exception {
        List<String> opponents = List.of(opts.getOrDefault("opponent", "sample.Crazy").split(","));
        int seeds = Integer.parseInt(opts.getOrDefault("seeds", "5"));
        Path out = Path.of(opts.getOrDefault("out", "work/" + System.currentTimeMillis()));
        Path jar = Path.of(opts.getOrDefault("robot-jar", "../hadurling-robot/target/hadurling.Hadurling_0.1.jar"));

        Map<String, List<Double>> candidate = fight("candidate", jar, opponents, seeds, out);
        StringBuilder report = new StringBuilder("# Hadurling bench\n\n");
        report.append(opponents).append(", ").append(opts.getOrDefault("rounds", "35")).append(" rounds, seeds 1 to ")
            .append(seeds).append(opts.containsKey("warm") ? ", warm" : ", cold").append("\n\n");
        report.append(Report.single("Candidate", candidate)).append('\n');
        if (opts.containsKey("baseline-jar")) {
            Map<String, List<Double>> baseline = fight("baseline", Path.of(opts.get("baseline-jar")), opponents, seeds, out);
            report.append(Report.single("Baseline", baseline)).append('\n');
            report.append(Report.compare(opts.getOrDefault("baseline-name", "baseline"), Report.overall(baseline),
                opts.getOrDefault("candidate-name", "candidate"), Report.overall(candidate)));
        }
        System.out.println(report);
        if (opts.containsKey("report")) Files.writeString(Path.of(opts.get("report")), report.toString());
        return 0;
    }

    /** Every opponent, every seed, for one jar. Returns the score share of each battle. */
    private Map<String, List<Double>> fight(String label, Path jar, List<String> opponents, int seeds, Path out)
            throws IOException, InterruptedException {
        Path home = out.resolve(label);
        installRobots(home, jar);
        int rounds = Integer.parseInt(opts.getOrDefault("rounds", "35"));
        String[] field = opts.getOrDefault("field", "800x600").split("x");
        String robot = opts.getOrDefault("robot", "hadurling.Hadurling 0.1");
        Map<String, List<Double>> shares = new LinkedHashMap<>();
        for (String opponent : opponents) {
            List<Double> list = new ArrayList<>();
            for (int seed = 1; seed <= seeds; seed++) {
                // Cold: forget what the robot saved, so a battle does not start from the last one.
                if (!opts.containsKey("warm")) deleteTree(home.resolve("robots/.data"));
                Path result = home.resolve("result-" + opponent + "-" + seed + ".txt");
                Files.deleteIfExists(result);
                List<String> cmd = new ArrayList<>();
                cmd.add(Path.of(System.getProperty("java.home"), "bin", "java").toString());
                cmd.addAll(JVM_FLAGS);
                cmd.add("-DRANDOMSEED=" + seed);
                cmd.add("-cp");
                cmd.add(classpath());
                cmd.add(BattleRunner.class.getName());
                cmd.addAll(List.of(home.toString(), result.toString(), String.valueOf(rounds), field[0], field[1],
                    robot, opponent));
                Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
                    .redirectOutput(home.resolve("engine-" + opponent + "-" + seed + ".log").toFile()).start();
                if (!p.waitFor(30, TimeUnit.MINUTES)) {
                    p.destroyForcibly();
                    throw new IllegalStateException(label + " vs " + opponent + " seed " + seed + " timed out");
                }
                double share = readShare(result);
                System.out.printf(java.util.Locale.ROOT, "  %s vs %s seed %d: %.1f%%%n", label, opponent, seed, share * 100);
                list.add(share);
            }
            shares.put(opponent, list);
        }
        return shares;
    }

    /**
     * The score share in a result file.
     *
     * @param result the file {@link BattleRunner} wrote
     * @return our score divided by both scores, 0.5 if both are 0
     * @throws IOException if there is no result or it says ERROR
     */
    static double readShare(Path result) throws IOException {
        if (!Files.exists(result)) throw new IOException("no result file " + result);
        String line = Files.readString(result).trim();
        if (line.startsWith("ERROR")) throw new IOException(line);
        String[] f = line.split(",");
        double ours = Double.parseDouble(f[0]);
        double theirs = Double.parseDouble(f[1]);
        return ours + theirs == 0 ? 0.5 : ours / (ours + theirs);
    }

    /** A Robocode home with the robot's jar and the engine's sample robots in robots/. */
    private void installRobots(Path home, Path jar) throws IOException {
        if (!Files.isRegularFile(jar)) throw new IllegalStateException("No robot jar at " + jar + "; run mvn package first");
        Path robots = home.resolve("robots");
        Files.createDirectories(robots);
        String[] name = opts.getOrDefault("robot", "hadurling.Hadurling 0.1").split(" ");
        Files.copy(jar, robots.resolve(name[0] + "_" + name[1] + ".jar"), StandardCopyOption.REPLACE_EXISTING);
        if (opts.containsKey("opponent-jar")) {
            for (String extra : opts.get("opponent-jar").split(",")) {
                Path source = Path.of(extra);
                if (!Files.isRegularFile(source)) throw new IllegalStateException("No opponent jar at " + source);
                Files.copy(source, robots.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        try (Stream<Path> samples = Files.list(Path.of("target/samples"))) {
            for (Path s : (Iterable<Path>) samples::iterator) {
                Files.copy(s, robots.resolve(s.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }

    /** The classes of this module plus every dependency: what a child JVM needs. */
    private static String classpath() throws IOException {
        String deps = Files.readString(Path.of("target/classpath.txt")).trim();
        return Path.of("target/classes") + File.pathSeparator + deps;
    }

    private static void deleteTree(Path dir) throws IOException {
        if (!Files.exists(dir)) return;
        try (Stream<Path> walk = Files.walk(dir)) {
            for (Path p : (Iterable<Path>) walk.sorted(Comparator.reverseOrder())::iterator) Files.delete(p);
        }
    }
}
