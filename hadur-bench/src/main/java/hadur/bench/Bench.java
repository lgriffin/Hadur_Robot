package hadur.bench;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.stream.Stream;

/**
 * Runs Hadur against the reference set and writes a score-share report.
 *
 * <pre>
 * mvn -f hadur-bench/pom.xml compile exec:java -Dexec.args="--mode cold --rounds 35 --seeds 5"
 * </pre>
 *
 * <p>Options (all optional):</p>
 * <ul>
 * <li>{@code --mode cold|warm}: cold wipes Hadur's data directory before every battle;
 *     warm keeps it across {@code --battles} consecutive battles per opponent.</li>
 * <li>{@code --rounds N} rounds per battle (35), {@code --seeds N} battles per opponent in
 *     cold mode (5), {@code --battles N} in warm mode (5), {@code --field WxH} (800x600).</li>
 * <li>{@code --robot-jar FILE} the robot jar (../hadur-robot/target/hadur2.Hadur_2.0.jar),
 *     or {@code --robot-classes DIR} to jar a compiled class tree instead;
 *     {@code --robot NAME} as Robocode lists it ("hadur2.Hadur 2.0").</li>
 * <li>{@code --only TEXT} run opponents whose name contains TEXT,
 *     {@code --out DIR} working directory (work/&lt;mode&gt;-&lt;time&gt;),
 *     {@code --report FILE} also copy the report there.</li>
 * </ul>
 */
public final class Bench {

    private static final List<String> JVM_FLAGS = List.of(
        "--add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED",
        "--add-opens=java.base/java.lang=ALL-UNNAMED",
        "--add-opens=java.base/java.util=ALL-UNNAMED",
        "--add-opens=java.base/java.net=ALL-UNNAMED",
        "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
        // Keep Robocode's security manager on, as in a real Robocode install.
        "-Djava.security.manager=allow",
        "-Djava.awt.headless=true");

    private final Map<String, String> opts;
    private final Path benchDir;
    private final Path out;
    private final Path home;
    private final String robot;
    private final boolean warm;
    private final int rounds, runs, width, height;

    private Bench(Map<String, String> opts) {
        this.opts = opts;
        this.benchDir = Path.of("").toAbsolutePath();
        this.warm = opts.getOrDefault("mode", "cold").equals("warm");
        this.rounds = Integer.parseInt(opts.getOrDefault("rounds", "35"));
        this.runs = Integer.parseInt(warm ? opts.getOrDefault("battles", "5")
                                          : opts.getOrDefault("seeds", "5"));
        String[] field = opts.getOrDefault("field", "800x600").split("x");
        this.width = Integer.parseInt(field[0]);
        this.height = Integer.parseInt(field[1]);
        this.robot = opts.getOrDefault("robot", "hadur2.Hadur 2.0");
        String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        this.out = Path.of(opts.getOrDefault("out",
            "work/" + (warm ? "warm" : "cold") + "-" + stamp)).toAbsolutePath();
        this.home = out.resolve("home");
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> opts = new HashMap<>();
        for (int i = 0; i + 1 < args.length; i += 2) {
            opts.put(args[i].replaceFirst("^--", ""), args[i + 1]);
        }
        System.exit(new Bench(opts).run());
    }

    private int run() throws Exception {
        List<Opponent> opponents = Opponent.load(benchDir.resolve("reference-set.txt"));
        String only = opts.get("only");
        if (only != null) opponents.removeIf(o -> !o.name.contains(only));
        installRobots(opponents);

        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        for (Opponent o : opponents) {
            List<BattleResult> list = new ArrayList<>();
            results.put(o, list);
            if (warm) wipeData();
            for (int i = 1; i <= runs; i++) {
                if (!warm) wipeData();
                Path dir = out.resolve("battles").resolve(o.slug() + "-" + i);
                System.out.printf("%s battle %d/%d ...%n", o.name, i, runs);
                BattleResult r = runBattle(o, i, dir);
                list.add(r);
                System.out.printf("  score share %.1f%%, wins %d/%d, skipped turns %d%s%n",
                    r.scoreShare() * 100, r.firsts, r.rounds, r.skippedTurns,
                    r.ok ? "" : " FAILED: " + r.errors);
            }
        }

        String report = Report.render(results, robot, warm, rounds, runs, width, height,
            cpuConstant());
        Files.writeString(out.resolve("report.md"), report);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, report);
        }
        System.out.println();
        System.out.println(report);
        boolean failed = results.values().stream().flatMap(List::stream).anyMatch(r -> !r.ok);
        return failed ? 1 : 0;
    }

    private BattleResult runBattle(Opponent o, int seed, Path dir)
            throws IOException, InterruptedException {
        Files.createDirectories(dir);
        List<String> cmd = new ArrayList<>();
        cmd.add(Path.of(System.getProperty("java.home"), "bin", "java").toString());
        cmd.addAll(JVM_FLAGS);
        cmd.add("-DRANDOMSEED=" + seed);
        cmd.add("-cp");
        cmd.add(classpath());
        cmd.add(BattleRunner.class.getName());
        cmd.addAll(List.of(home.toString(), dir.toString(), String.valueOf(rounds),
            String.valueOf(width), String.valueOf(height), robot, o.name));
        Process p = new ProcessBuilder(cmd)
            .redirectErrorStream(true)
            .redirectOutput(dir.resolve("engine.log").toFile())
            .start();
        if (!p.waitFor(30, TimeUnit.MINUTES)) {
            p.destroyForcibly();
            return BattleResult.parse(BattleResult.failed("timed out"));
        }
        Path result = dir.resolve("result.csv");
        if (!Files.exists(result)) {
            return BattleResult.parse(BattleResult.failed("no result; exit " + p.exitValue()));
        }
        return BattleResult.parse(Files.readAllLines(result).get(1));
    }

    private String classpath() throws IOException {
        Path cpFile = benchDir.resolve("target/classpath.txt");
        String deps = Files.readString(cpFile).trim();
        return benchDir.resolve("target/classes") + File.pathSeparator + deps;
    }

    /** Sets up a Robocode home with Hadur's jar, the sample bots and any opponent jars. */
    private void installRobots(List<Opponent> opponents) throws IOException {
        Path robots = home.resolve("robots");
        Files.createDirectories(robots);
        String[] parts = robot.split(" ");
        Path target = robots.resolve(parts[0] + "_" + parts[1] + ".jar");
        if (opts.containsKey("robot-classes")) {
            Path classes = Path.of(opts.get("robot-classes")).toAbsolutePath();
            if (!Files.isDirectory(classes)) {
                throw new IllegalStateException("No compiled robot at " + classes);
            }
            jar(classes, target);
        } else {
            Path jar = Path.of(opts.getOrDefault("robot-jar",
                "../hadur-robot/target/hadur2.Hadur_2.0.jar")).toAbsolutePath();
            if (!Files.isRegularFile(jar)) {
                throw new IllegalStateException("No robot jar at " + jar + "; run mvn package first");
            }
            Files.copy(jar, target, StandardCopyOption.REPLACE_EXISTING);
        }

        try (Stream<Path> samples = Files.list(benchDir.resolve("target/samples"))) {
            for (Path s : (Iterable<Path>) samples::iterator) {
                Files.copy(s, robots.resolve(s.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        for (Opponent o : opponents) {
            if (o.jar == null) continue;
            Path jar = benchDir.resolve("opponents").resolve(o.jar);
            if (!Files.exists(jar)) throw new IllegalStateException("Missing opponent jar " + jar);
            Files.copy(jar, robots.resolve(o.jar), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private static void jar(Path classes, Path target) throws IOException {
        try (JarOutputStream jar = new JarOutputStream(Files.newOutputStream(target));
             Stream<Path> files = Files.walk(classes)) {
            for (Path f : (Iterable<Path>) files::iterator) {
                if (!Files.isRegularFile(f)) continue;
                String name = classes.relativize(f).toString().replace(File.separatorChar, '/');
                jar.putNextEntry(new JarEntry(name));
                try (InputStream in = Files.newInputStream(f)) {
                    in.transferTo(jar);
                }
                jar.closeEntry();
            }
        }
    }

    /** Robocode keeps robot data files under robots/.data; cold mode deletes it. */
    private void wipeData() throws IOException {
        Path data = home.resolve("robots/.data");
        if (!Files.exists(data)) return;
        try (Stream<Path> files = Files.walk(data)) {
            for (Path f : (Iterable<Path>) files.sorted(Comparator.reverseOrder())::iterator) {
                Files.delete(f);
            }
        }
    }

    private String cpuConstant() {
        Path props = home.resolve("config/robocode.properties");
        try {
            for (String line : Files.readAllLines(props, StandardCharsets.ISO_8859_1)) {
                if (line.startsWith("robocode.cpu.constant")) return line;
            }
        } catch (IOException e) {
            // Not written yet; the report says so.
        }
        return "unknown";
    }
}
