package hadur.bench;

import hadur2.core.memory.LineageKey;
import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.ProfileCodec;
import hadur2.core.memory.ProfileFormatException;
import hadur2.core.memory.ProfileLibrary;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;

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
 * <li>{@code --robot-jar FILE} the robot jar (../hadur-robot/target/hadur2.Hadur_2.2.jar),
 *     or {@code --robot-classes DIR} to jar a compiled class tree instead;
 *     {@code --robot NAME} as Robocode lists it ("hadur2.Hadur 2.2").</li>
 * <li>{@code --record DIR} capture replay fixtures instead: runs the recorder robot
 *     (../hadur-robot/target/hadur-robot-2.0-SNAPSHOT-recorder.jar) with Robocode's
 *     security off and writes one gzipped transcript per opponent to DIR (CORE-2).</li>
 * <li>{@code --melee true} run every opponent in the set against Hadur at once, one battle
 *     per seed, and report finishing places instead (MeleeRumble: 10 robots, 1000x1000).</li>
 * <li>{@code --sentry-border N} in melee mode, the set's {@code sentry} entries fight as
 *     Robocode sentries guarding a border N px deep.</li>
 * <li>{@code --suite FILE} run every bench the file lists ({@code label | options} per
 *     line) and write one report, e.g. {@code melee-gates.txt}.</li>
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
    /** Where replay fixtures go, or null when not recording. */
    private final Path record;
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
        this.record = opts.containsKey("record") ? Path.of(opts.get("record")).toAbsolutePath() : null;
        if (record != null) {
            opts.putIfAbsent("robot", "hadur2.HadurRecorder 2.2");
            opts.putIfAbsent("robot-jar", "../hadur-robot/target/hadur-robot-2.0-SNAPSHOT-recorder.jar");
        }
        this.robot = opts.getOrDefault("robot", "hadur2.Hadur 2.2");
        String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        this.out = Path.of(opts.getOrDefault("out",
            "work/" + (warm ? "warm" : "cold") + "-" + stamp)).toAbsolutePath();
        this.home = out.resolve("home");
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> opts = parse(args);
        System.exit(opts.containsKey("suite") ? runSuite(opts) : new Bench(opts).run());
    }

    static Map<String, String> parse(String[] args) {
        Map<String, String> opts = new HashMap<>();
        for (int i = 0; i + 1 < args.length; i += 2) {
            opts.put(args[i].replaceFirst("^--", ""), args[i + 1]);
        }
        return opts;
    }

    /**
     * Runs every bench a suite file lists, one after another, and writes one report with
     * each bench's report in turn. Each line is {@code label | options}; the command line's
     * own options (the robot, rounds, ...) apply to every line unless the line sets them.
     * This is how a melee change and the duel's non-regression run in one command.
     */
    static int runSuite(Map<String, String> global) throws Exception {
        Path benchDir = Path.of("").toAbsolutePath();
        Path suite = benchDir.resolve(global.get("suite"));
        String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        Path out = Path.of(global.getOrDefault("out", "work/suite-" + stamp)).toAbsolutePath();
        StringBuilder report = new StringBuilder("# Bench suite: ")
            .append(suite.getFileName()).append("\n\n");
        int exit = 0;
        for (String line : Files.readAllLines(suite)) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] parts = line.split("\\|", 2);
            String label = parts[0].trim();
            Map<String, String> opts = new HashMap<>(global);
            opts.remove("suite");
            opts.remove("report");
            opts.putAll(parse(parts[1].trim().split("\\s+")));
            opts.put("out", out.resolve(label).toString());
            opts.put("label", label);
            System.out.println("== " + label);
            exit |= new Bench(opts).run();
            report.append(Files.readString(out.resolve(label).resolve("report.md")).replaceFirst("^# ", "## "))
                .append("\n");
        }
        Files.createDirectories(out);
        Files.writeString(out.resolve("report.md"), report);
        if (global.containsKey("report")) {
            Path copy = Path.of(global.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, report);
        }
        System.out.println(report);
        return exit;
    }

    private int run() throws Exception {
        List<Opponent> opponents = Opponent.load(benchDir.resolve(opts.getOrDefault("set", "reference-set.txt")));
        String only = opts.get("only");
        if (only != null) opponents.removeIf(o -> !o.name.contains(only));
        installRobots(opponents);
        if (opts.containsKey("melee")) return runMelee(opponents);

        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        Map<Opponent, OpponentProfile> profiles = new LinkedHashMap<>();
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
            // Read before the next opponent's wipe: what Hadur remembered (MEM-3).
            OpponentProfile stored = storedProfile(o.name);
            if (stored != null) profiles.put(o, stored);
        }

        String report = Report.render(results, profiles, robot, warm, rounds, runs, width, height,
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
        // A result left by an earlier run in this directory must not stand in for this one.
        Path result = dir.resolve("result.csv");
        Files.deleteIfExists(result);
        List<String> cmd = new ArrayList<>();
        cmd.add(Path.of(System.getProperty("java.home"), "bin", "java").toString());
        cmd.addAll(JVM_FLAGS);
        cmd.add("-DRANDOMSEED=" + seed);
        Path transcript = dir.resolve("transcript.txt");
        if (record != null) {
            // The recorder writes its transcript straight to disk.
            cmd.add("-DNOSECURITY=true");
            cmd.add("-Dhadur.record=" + transcript);
        }
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
        if (record != null && Files.exists(transcript)) saveFixture(o, seed, transcript);
        return readResult(result, p.exitValue());
    }

    /**
     * The battle's result as its child wrote it: a failed battle when there is none, it is
     * cut short, or it cannot be read (an old format, say).
     */
    static BattleResult readResult(Path result, int exit) throws IOException {
        if (!Files.exists(result)) {
            return BattleResult.parse(BattleResult.failed("no result; exit " + exit));
        }
        List<String> lines = Files.readAllLines(result);
        if (lines.size() < 2) {
            // Killed while writing its result.
            return BattleResult.parse(BattleResult.failed("incomplete result; exit " + exit));
        }
        try {
            return BattleResult.parse(lines.get(1));
        } catch (RuntimeException e) {
            return BattleResult.parse(BattleResult.failed("unreadable result: " + e));
        }
    }

    /**
     * Hadur against the whole set at once, {@code runs} times (one RANDOMSEED each), with the
     * set's {@code sentry} entries as Robocode sentries when {@code --sentry-border} is set.
     */
    private int runMelee(List<Opponent> opponents) throws IOException, InterruptedException {
        List<String> names = new ArrayList<>();
        names.add(robot);
        List<String> others = new ArrayList<>();
        Set<String> sentries = new HashSet<>();
        for (Opponent o : opponents) {
            names.add(o.name);
            if (o.role.equals("sentry")) sentries.add(o.name);
            else others.add(o.name);
        }
        int sentryBorder = Integer.parseInt(opts.getOrDefault("sentry-border", "0"));
        List<MeleeReport.Battle> battles = new ArrayList<>();
        for (int i = 1; i <= runs; i++) {
            wipeData();
            Path dir = out.resolve("battles").resolve("melee-" + i);
            Files.createDirectories(dir);
            Files.deleteIfExists(dir.resolve("melee.csv"));
            System.out.printf("melee battle %d/%d ...%n", i, runs);
            List<String> cmd = new ArrayList<>();
            cmd.add(Path.of(System.getProperty("java.home"), "bin", "java").toString());
            cmd.addAll(JVM_FLAGS);
            cmd.add("-DRANDOMSEED=" + i);
            cmd.add("-Dhadur.sentries=" + String.join(",", sentries));
            cmd.add("-cp");
            cmd.add(classpath());
            cmd.add(MeleeRunner.class.getName());
            cmd.addAll(List.of(home.toString(), dir.toString(), String.valueOf(rounds),
                String.valueOf(width), String.valueOf(height), String.valueOf(sentryBorder)));
            cmd.addAll(names);
            Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
                .redirectOutput(dir.resolve("engine.log").toFile()).start();
            if (!p.waitFor(90, TimeUnit.MINUTES)) p.destroyForcibly();
            MeleeReport.Battle b = MeleeReport.read(i, dir);
            battles.add(b);
            double[] us = b.ok ? MeleeReport.find(b, robot) : null;
            if (us == null) {
                System.out.println("  FAILED; see " + dir.resolve("engine.log"));
            } else {
                System.out.printf(java.util.Locale.ROOT, "  Hadur placed %.0f, APS %.1f, survival %.1f%n",
                    us[1], MeleeReport.aps(b, robot, sentries), MeleeReport.survival(b));
            }
        }
        String r = MeleeReport.render(opts.get("label"), robot, others, sentries, battles, rounds,
            width, height, sentryBorder);
        Files.writeString(out.resolve("report.md"), r);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, r);
        }
        System.out.println();
        System.out.println(r);
        return battles.stream().anyMatch(b -> !b.ok) ? 1 : 0;
    }

    private void saveFixture(Opponent o, int seed, Path transcript) throws IOException {
        Files.createDirectories(record);
        Path fixture = record.resolve(o.slug() + (runs > 1 ? "-" + seed : "") + ".txt.gz");
        try (OutputStream gz = new GZIPOutputStream(Files.newOutputStream(fixture))) {
            Files.copy(transcript, gz);
        }
        System.out.println("  fixture " + fixture);
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
                "../hadur-robot/target/hadur2.Hadur_2.2.jar")).toAbsolutePath();
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

    /**
     * The profile Hadur stored for {@code opponent}, decoded from its data directory, or
     * null when there is none or it does not decode.
     */
    private OpponentProfile storedProfile(String opponent) throws IOException {
        Path data = home.resolve("robots/.data");
        if (!Files.exists(data)) return null;
        String file = ProfileLibrary.fileName(LineageKey.of(opponent));
        try (Stream<Path> files = Files.walk(data)) {
            for (Path f : (Iterable<Path>) files::iterator) {
                if (!f.getFileName().toString().equals(file)) continue;
                try {
                    return ProfileCodec.decode(Files.readAllBytes(f));
                } catch (ProfileFormatException e) {
                    System.out.println("  stored profile " + f + " does not decode: " + e.getMessage());
                }
            }
        }
        return null;
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
