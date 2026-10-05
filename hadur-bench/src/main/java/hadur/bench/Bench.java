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
 * <li>{@code --robot-jar FILE} the robot jar (../hadur-robot/target/hadur2.Hadur_3.3.jar),
 *     or {@code --robot-classes DIR} to jar a compiled class tree instead;
 *     {@code --robot NAME} as Robocode lists it ("hadur2.Hadur 3.8").</li>
 * <li>{@code --record DIR} capture replay fixtures instead: runs the recorder robot
 *     (../hadur-robot/target/hadur-robot-2.0-SNAPSHOT-recorder.jar) with Robocode's
 *     security off and writes one gzipped transcript per opponent to DIR (CORE-2).</li>
 * <li>{@code --melee true} run every opponent in the set against Hadur at once, one battle
 *     per seed, and report finishing places instead (MeleeRumble: 10 robots, 1000x1000).</li>
 * <li>{@code --team true} (A5) fight each team of the set with our team jar
 *     ({@code --robot-jar}, hadur2.HadurTeam_3.8.jar; {@code --robot} "hadur2.HadurTeam
 *     3.8"; {@code --member} hadur2.Hadur), TeamRumble style: 1200x1200, 10 rounds.</li>
 * <li>{@code --baseline JAR} (BENCH-2) also fight every opponent with this second jar, one
 *     battle per seed at the same {@code RANDOMSEED} as the candidate's, and report the
 *     paired score-share difference instead of two separate means. Requires
 *     {@code --baseline-robot NAME}, naming it as Robocode lists it and distinct from
 *     {@code --robot}: two jars sharing a robot name+version would install to the same
 *     file, so the candidate and baseline must be different name/version strings (e.g. a
 *     released version against a locally bumped one).</li>
 * <li>{@code --sentry-border N} in melee mode, the set's {@code sentry} entries fight as
 *     Robocode sentries guarding a border N px deep.</li>
 * <li>{@code --client FILE} (BENCH-4) run the set through each rumble-client condition the
 *     file lists ({@code label | key=value ...} per line: {@code data}, {@code cpu},
 *     {@code load}, {@code engine}, {@code java}; see {@link ClientConditions}), one bench
 *     pass per condition, and report survival and skipped turns per opponent per condition.</li>
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
    /** BENCH-2: the paired baseline jar and robot name, or null when not running paired. */
    private final Path baselineJar;
    private final String baselineRobot;
    /** BENCH-4: the client-conditions file, or null when running a plain single pass. */
    private final Path client;

    Bench(Map<String, String> opts) {
        this.opts = opts;
        this.benchDir = Path.of("").toAbsolutePath();
        if (opts.containsKey("team")) {
            // A5: the TeamRumble's settings and the team jar, unless given.
            opts.putIfAbsent("field", "1200x1200");
            opts.putIfAbsent("rounds", "10");
            opts.putIfAbsent("seeds", "3");
            if (opts.containsKey("record")) {
                // STRAND-5: five recorders, a team jar made from the recorder jar (runTeam).
                opts.putIfAbsent("robot", "hadur2.HadurRecorderTeam 3.8");
                opts.putIfAbsent("member", "hadur2.HadurRecorder");
                opts.putIfAbsent("robot-jar", "../hadur-robot/target/hadur-robot-2.0-SNAPSHOT-recorder.jar");
            }
            opts.putIfAbsent("robot", "hadur2.HadurTeam 3.8");
            opts.putIfAbsent("robot-jar", "../hadur-robot/target/hadur2.HadurTeam_3.8.jar");
        }
        this.warm = opts.getOrDefault("mode", "cold").equals("warm");
        this.rounds = Integer.parseInt(opts.getOrDefault("rounds", "35"));
        this.runs = Integer.parseInt(warm ? opts.getOrDefault("battles", "5")
                                          : opts.getOrDefault("seeds", "5"));
        String[] field = opts.getOrDefault("field", "800x600").split("x");
        this.width = Integer.parseInt(field[0]);
        this.height = Integer.parseInt(field[1]);
        this.record = opts.containsKey("record") ? Path.of(opts.get("record")).toAbsolutePath() : null;
        if (record != null) {
            opts.putIfAbsent("robot", "hadur2.HadurRecorder 3.8");
            opts.putIfAbsent("robot-jar", "../hadur-robot/target/hadur-robot-2.0-SNAPSHOT-recorder.jar");
        }
        this.robot = opts.getOrDefault("robot", "hadur2.Hadur 3.8");
        this.baselineJar = opts.containsKey("baseline") ? Path.of(opts.get("baseline")).toAbsolutePath() : null;
        this.baselineRobot = opts.get("baseline-robot");
        if (baselineJar != null) {
            // Robocode identifies a robot by name+version, so two jars sharing it install to
            // the same file: the second copy would silently replace the first (BENCH-2).
            if (baselineRobot == null) {
                throw new IllegalArgumentException(
                    "--baseline needs --baseline-robot NAME (as Robocode lists it), distinct from --robot");
            }
            if (baselineRobot.equals(robot)) {
                throw new IllegalArgumentException(
                    "--baseline-robot must differ from --robot (" + robot + "); "
                    + "installing two jars under the same robot name would overwrite one with the other");
            }
        }
        this.client = opts.containsKey("client") ? Path.of(opts.get("client")).toAbsolutePath() : null;
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
        if (opts.containsKey("session")) return runSession();
        List<Opponent> opponents = Opponent.load(benchDir.resolve(opts.getOrDefault("set", "reference-set.txt")));
        String only = opts.get("only");
        if (only != null) opponents.removeIf(o -> !o.name.contains(only));
        installRobots(opponents);
        if (opts.containsKey("melee")) return runMelee(opponents);
        if (opts.containsKey("team")) return runTeam(opponents);
        if (client != null) return runClientConditions(opponents);

        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        Map<Opponent, List<BattleResult>> baselineResults = baselineJar != null ? new LinkedHashMap<>() : null;
        Map<Opponent, OpponentProfile> profiles = new LinkedHashMap<>();
        for (Opponent o : opponents) {
            List<BattleResult> list = new ArrayList<>();
            results.put(o, list);
            List<BattleResult> baselineList = baselineResults != null ? new ArrayList<>() : null;
            if (baselineResults != null) baselineResults.put(o, baselineList);
            if (warm) wipeData();
            for (int i = 1; i <= runs; i++) {
                if (!warm) wipeData();
                Path dir = out.resolve("battles").resolve(o.slug() + "-" + i);
                System.out.printf("%s battle %d/%d ...%n", o.name, i, runs);
                BattleResult r = runBattle(o, i, dir, robot);
                list.add(r);
                System.out.printf("  score share %.1f%%, wins %d/%d, skipped turns %d%s%n",
                    r.scoreShare() * 100, r.firsts, r.rounds, r.skippedTurns,
                    r.ok ? "" : " FAILED: " + r.errors);
                if (baselineList != null) {
                    // Same seed as the candidate's battle just above: BENCH-2 pairs on it.
                    if (!warm) wipeData();
                    BattleResult base = runBattle(o, i, out.resolve("battles").resolve(o.slug() + "-" + i + "-baseline"),
                        baselineRobot);
                    baselineList.add(base);
                    System.out.printf("  baseline score share %.1f%%%s%n",
                        base.scoreShare() * 100, base.ok ? "" : " FAILED: " + base.errors);
                }
            }
            // Read before the next opponent's wipe: what Hadur remembered (MEM-3).
            OpponentProfile stored = storedProfile(o.name);
            if (stored != null) profiles.put(o, stored);
        }

        String report = Report.render(results, profiles, robot, warm, rounds, runs, width, height,
            cpuConstant());
        if (baselineResults != null) {
            // BENCH-2's diff table, then BENCH-3's full per-opponent diagnostics for the
            // baseline too (hit rate, skips, faults, pace), not just its score share.
            report += Report.renderPaired(results, baselineResults, robot, baselineRobot);
            report += "\n" + Report.render(baselineResults, robot + " baseline (" + baselineRobot + ")",
                warm, rounds, runs, width, height, cpuConstant());
        }
        Files.writeString(out.resolve("report.md"), report);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, report);
        }
        System.out.println();
        System.out.println(report);
        boolean failed = results.values().stream().flatMap(List::stream).anyMatch(r -> !r.ok);
        if (baselineResults != null) {
            failed |= baselineResults.values().stream().flatMap(List::stream).anyMatch(r -> !r.ok);
        }
        return failed ? 1 : 0;
    }

    private BattleResult runBattle(Opponent o, int seed, Path dir, String robotName)
            throws IOException, InterruptedException {
        return runBattle(o, seed, dir, robotName, defaultJavaBin(), classpath());
    }

    /** BENCH-4: as above, but on a given JVM and classpath (an {@code engine=}/{@code java=} condition). */
    private BattleResult runBattle(Opponent o, int seed, Path dir, String robotName,
                                    String javaBin, String cp) throws IOException, InterruptedException {
        Files.createDirectories(dir);
        // A result left by an earlier run in this directory must not stand in for this one.
        Path result = dir.resolve("result.csv");
        Files.deleteIfExists(result);
        List<String> cmd = new ArrayList<>();
        cmd.add(javaBin);
        cmd.addAll(JVM_FLAGS);
        cmd.add("-DRANDOMSEED=" + seed);
        Path transcript = dir.resolve("transcript.txt");
        if (record != null) {
            // The recorder writes its transcript straight to disk.
            cmd.add("-DNOSECURITY=true");
            cmd.add("-Dhadur.record=" + transcript);
        }
        cmd.add("-cp");
        cmd.add(cp);
        cmd.add(BattleRunner.class.getName());
        cmd.addAll(List.of(home.toString(), dir.toString(), String.valueOf(rounds),
            String.valueOf(width), String.valueOf(height), robotName, o.name));
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
        boolean keepData = Boolean.parseBoolean(opts.getOrDefault("keep-data", "false"));
        for (int i = 1; i <= runs; i++) {
            // A0: --keep-data true fights on whatever the robot's data directory already
            // holds (a warm duel's profiles, say), for a hand-off fixture on a store.
            if (!keepData) wipeData();
            Path dir = out.resolve("battles").resolve("melee-" + i);
            Files.createDirectories(dir);
            Files.deleteIfExists(dir.resolve("melee.csv"));
            System.out.printf("melee battle %d/%d ...%n", i, runs);
            List<String> cmd = new ArrayList<>();
            cmd.add(Path.of(System.getProperty("java.home"), "bin", "java").toString());
            cmd.addAll(JVM_FLAGS);
            cmd.add("-DRANDOMSEED=" + i);
            cmd.add("-Dhadur.sentries=" + String.join(",", sentries));
            Path transcript = dir.resolve("transcript.txt");
            if (record != null) {
                // A0: the recorder on the melee path too (STRAND-4).
                cmd.add("-DNOSECURITY=true");
                cmd.add("-Dhadur.record=" + transcript);
            }
            cmd.add("-cp");
            cmd.add(classpath());
            cmd.add(MeleeRunner.class.getName());
            cmd.addAll(List.of(home.toString(), dir.toString(), String.valueOf(rounds),
                String.valueOf(width), String.valueOf(height), String.valueOf(sentryBorder)));
            cmd.addAll(names);
            Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
                .redirectOutput(dir.resolve("engine.log").toFile()).start();
            if (!p.waitFor(90, TimeUnit.MINUTES)) p.destroyForcibly();
            if (record != null && Files.exists(transcript)) {
                saveFixture(melee(opts.getOrDefault("set", "melee")), i, transcript);
            }
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

    /**
     * A5: our team against each team of the set in turn, {@code runs} battles each (one
     * RANDOMSEED each), on a wiped data directory; reports by {@link TeamReport}.
     */
    private int runTeam(List<Opponent> opponents) throws IOException, InterruptedException {
        String member = opts.getOrDefault("member", "hadur2.Hadur");
        if (record != null) recorderTeam(member);
        Map<Opponent, List<TeamReport.Battle>> results = new LinkedHashMap<>();
        for (Opponent o : opponents) {
            List<TeamReport.Battle> list = new ArrayList<>();
            results.put(o, list);
            for (int i = 1; i <= runs; i++) {
                wipeData();
                Path dir = out.resolve("battles").resolve(o.slug() + "-" + i);
                Files.createDirectories(dir);
                Files.deleteIfExists(dir.resolve("team.csv"));
                System.out.printf("%s team battle %d/%d ...%n", o.name, i, runs);
                List<String> cmd = new ArrayList<>();
                cmd.add(defaultJavaBin());
                cmd.addAll(JVM_FLAGS);
                cmd.add("-DRANDOMSEED=" + i);
                Path transcript = dir.resolve("transcript.txt");
                if (record != null) {
                    // STRAND-5: each member writes transcript-member-N.txt beside it.
                    cmd.add("-DNOSECURITY=true");
                    cmd.add("-Dhadur.record=" + transcript);
                }
                cmd.add("-cp");
                cmd.add(classpath());
                cmd.add(TeamRunner.class.getName());
                cmd.addAll(List.of(home.toString(), dir.toString(), String.valueOf(rounds),
                    String.valueOf(width), String.valueOf(height), member, robot, o.name));
                Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
                    .redirectOutput(dir.resolve("engine.log").toFile()).start();
                if (!p.waitFor(60, TimeUnit.MINUTES)) p.destroyForcibly();
                if (record != null) {
                    try (Stream<Path> members = Files.list(dir)) {
                        for (Path t : (Iterable<Path>) members.sorted()::iterator) {
                            String n = t.getFileName().toString();
                            if (!n.startsWith("transcript-member-")) continue;
                            String m = n.substring("transcript-member-".length(), n.length() - ".txt".length());
                            saveFixture("team-" + o.slug() + "-m" + m, i, t);
                        }
                    }
                }
                TeamReport.Battle b = TeamReport.read(dir, robot, member, dataFiles());
                list.add(b);
                System.out.println(b.ok ? "  " + b.summary() : "  FAILED; see " + dir.resolve("engine.log"));
            }
        }
        String r = TeamReport.render(opts.get("label"), robot, results, rounds, width, height);
        Files.writeString(out.resolve("report.md"), r);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, r);
        }
        System.out.println();
        System.out.println(r);
        return results.values().stream().flatMap(List::stream).anyMatch(b -> !b.ok) ? 1 : 0;
    }

    /**
     * STRAND-5: replaces the installed jar with a team of five {@code member}s made from it:
     * the recorder jar's entries and a team file naming the members, at our robot's version.
     */
    private void recorderTeam(String member) throws IOException {
        String[] parts = robot.split(" ");
        Path target = home.resolve("robots").resolve(parts[0] + "_" + parts[1] + ".jar");
        Path source = Path.of(opts.get("robot-jar")).toAbsolutePath();
        String m = member + " " + parts[1];
        String team = "team.members=" + String.join(",", Collections.nCopies(5, m)) + "\n"
            + "team.version=" + parts[1] + "\nteam.author.name=lgriffin\nrobocode.version=1.9.3.0\n";
        try (JarOutputStream jar = new JarOutputStream(Files.newOutputStream(target));
             java.util.jar.JarFile in = new java.util.jar.JarFile(source.toFile())) {
            for (JarEntry e : Collections.list(in.entries())) {
                if (e.isDirectory()) continue;
                jar.putNextEntry(new JarEntry(e.getName()));
                try (InputStream s = in.getInputStream(e)) {
                    s.transferTo(jar);
                }
                jar.closeEntry();
            }
            jar.putNextEntry(new JarEntry(parts[0].replace('.', '/') + ".team"));
            jar.write(team.getBytes(StandardCharsets.ISO_8859_1));
            jar.closeEntry();
        }
    }

    /** Every file in the robots' data directory, by path relative to it (SHELF-2's check). */
    private List<String> dataFiles() throws IOException {
        Path data = home.resolve("robots/.data");
        List<String> files = new ArrayList<>();
        if (!Files.exists(data)) return files;
        try (Stream<Path> all = Files.walk(data)) {
            for (Path f : (Iterable<Path>) all::iterator) {
                if (Files.isRegularFile(f)) files.add(data.relativize(f).toString());
            }
        }
        Collections.sort(files);
        return files;
    }

    private String defaultJavaBin() {
        return Path.of(System.getProperty("java.home"), "bin", "java").toString();
    }

    /**
     * BENCH-4: runs {@code opponents} once per condition in {@link #client}, each its own
     * pass (its own data-directory handling, CPU constant, background load, engine and JVM),
     * and writes one combined report of survival share and skipped turns per opponent per
     * condition. A condition naming an {@code engine} or {@code java} not present locally is
     * skipped (reported as such), not failed.
     */
    private int runClientConditions(List<Opponent> opponents) throws IOException, InterruptedException {
        List<ClientConditions.Condition> conditions = ClientConditions.parse(client);
        Map<String, Map<Opponent, List<BattleResult>>> byCondition = new LinkedHashMap<>();
        Map<String, String> cpuByCondition = new LinkedHashMap<>();
        boolean anyBattleFailed = false;
        for (ClientConditions.Condition c : conditions) {
            System.out.println("== condition: " + c.label());
            String cp = resolveEngineClasspath(c);
            String javaBin = resolveJavaBin(c);
            if (cp == null) {
                System.out.println("  engine " + c.engine() + " not available locally (no "
                    + "hadur-bench/engines/" + c.engine() + "/); skipping this condition");
                byCondition.put(c.label(), Map.of());
                continue;
            }
            if (javaBin == null) {
                System.out.println("  java " + c.javaHome() + " not available locally; skipping this condition");
                byCondition.put(c.label(), Map.of());
                continue;
            }
            prepareCondition(c);
            List<Thread> load = startLoad(c.load());
            try {
                Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
                for (Opponent o : opponents) {
                    List<BattleResult> list = new ArrayList<>();
                    results.put(o, list);
                    for (int i = 1; i <= runs; i++) {
                        if (!c.neverWipe()) wipeData();
                        Path dir = out.resolve("conditions").resolve(slug(c.label())).resolve(o.slug() + "-" + i);
                        BattleResult r = runBattle(o, i, dir, robot, javaBin, cp);
                        list.add(r);
                        System.out.printf(Locale.ROOT, "  %s vs %s %d/%d: survival %.1f%%, skipped %d%s%n",
                            c.label(), o.name, i, runs, r.survivalShare() * 100, r.skippedTurns,
                            r.ok ? "" : " FAILED: " + r.errors);
                        if (!r.ok) anyBattleFailed = true;
                    }
                }
                byCondition.put(c.label(), results);
                // Read after the pass: a forced constant reads back as itself, and one left
                // to the engine's own default reads back as whatever it calibrated to.
                cpuByCondition.put(c.label(), cpuConstant());
            } finally {
                stopLoad(load);
            }
        }
        String report = Report.renderConditions(byCondition, cpuByCondition);
        Files.createDirectories(out);
        Files.writeString(out.resolve("report.md"), report);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, report);
        }
        System.out.println();
        System.out.println(report);
        return anyBattleFailed ? 1 : 0;
    }

    /**
     * Sets up the data directory and CPU constant a condition asks for, before its pass runs.
     * A condition naming no {@code cpu} resets it, so an earlier condition's forced constant
     * never leaks into a later one that means to run at the engine's own default.
     */
    private void prepareCondition(ClientConditions.Condition c) throws IOException {
        if (c.cpuNanos() != null) writeCpuConstant(c.cpuNanos());
        else resetCpuConstant();
        String prefill = c.prefillDir();
        if (prefill != null) {
            wipeData();
            Path src = Path.of(prefill);
            if (!Files.isDirectory(src)) throw new IllegalStateException("No prefill directory at " + src);
            Path dest = home.resolve("robots/.data/hadur2/Hadur.data");
            Files.createDirectories(dest);
            try (Stream<Path> files = Files.walk(src)) {
                for (Path f : (Iterable<Path>) files::iterator) {
                    Path target = dest.resolve(src.relativize(f).toString());
                    if (Files.isDirectory(f)) Files.createDirectories(target);
                    else Files.copy(f, target, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } else if (!c.neverWipe()) {
            wipeData();
        }
        // A plain "data=shared" with no prefill: leave the directory as the previous
        // condition (or an empty start) left it, and never wipe it during this pass.
    }

    private void writeCpuConstant(long nanos) throws IOException {
        Path props = home.resolve("config/robocode.properties");
        Files.createDirectories(props.getParent());
        Files.writeString(props, "#Robocode Properties\nrobocode.cpu.constant=" + nanos + "\n");
    }

    /** Removes a forced CPU constant so the engine recalibrates or uses its own default. */
    private void resetCpuConstant() throws IOException {
        Files.deleteIfExists(home.resolve("config/robocode.properties"));
    }

    /** N daemon CPU-bound threads, to mimic a rumble client under load; stop with {@link #stopLoad}. */
    private List<Thread> startLoad(int n) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(() -> {
                double x = 1.0;
                while (!Thread.currentThread().isInterrupted()) x = Math.sin(x) + Math.cos(x);
            }, "bench-load-" + i);
            t.setDaemon(true);
            t.start();
            threads.add(t);
        }
        return threads;
    }

    private void stopLoad(List<Thread> threads) throws InterruptedException {
        for (Thread t : threads) t.interrupt();
        for (Thread t : threads) t.join(1000);
    }

    /**
     * The classpath for a condition's engine: the default when it names none, jars from
     * {@code engines/<version>/} put ahead of the default when it does, or null when that
     * directory does not exist (the condition is skipped, not failed).
     */
    private String resolveEngineClasspath(ClientConditions.Condition c) throws IOException {
        if (c.engine() == null) return classpath();
        Path dir = benchDir.resolve("engines").resolve(c.engine());
        if (!Files.isDirectory(dir)) return null;
        StringBuilder cp = new StringBuilder();
        try (Stream<Path> jars = Files.list(dir)) {
            for (Path j : (Iterable<Path>) jars.filter(p -> p.toString().endsWith(".jar"))::iterator) {
                cp.append(j).append(File.pathSeparator);
            }
        }
        return cp.append(classpath()).toString();
    }

    /** The battle child's {@code java} binary: the default, a condition's JDK home, or null if missing. */
    private String resolveJavaBin(ClientConditions.Condition c) {
        if (c.javaHome() == null) return defaultJavaBin();
        Path bin = Path.of(c.javaHome(), "bin", "java");
        return Files.isExecutable(bin) ? bin.toString() : null;
    }

    private static String slug(String label) {
        return label.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "-");
    }

    /** A melee fixture's name: {@code melee-} and the set file's name, e.g. {@code melee-samples}. */
    private static String melee(String set) {
        String name = Path.of(set).getFileName().toString().replaceFirst("\\.txt$", "");
        return name.startsWith("melee-") ? name : "melee-" + name;
    }

    private void saveFixture(Opponent o, int seed, Path transcript) throws IOException {
        saveFixture(o.slug(), seed, transcript);
    }

    private void saveFixture(String slug, int seed, Path transcript) throws IOException {
        Files.createDirectories(record);
        Path fixture = record.resolve(opts.getOrDefault("fixture", slug)
            + (runs > 1 ? "-" + seed : "") + ".txt.gz");
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
        installRobots(opponents, false);
    }

    /** As above; {@code lenient} drops opponents whose jar is missing instead of failing (a session's sample). */
    private void installRobots(List<Opponent> opponents, boolean lenient) throws IOException {
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
                "../hadur-robot/target/hadur2.Hadur_3.3.jar")).toAbsolutePath();
            if (!Files.isRegularFile(jar)) {
                throw new IllegalStateException("No robot jar at " + jar + "; run mvn package first");
            }
            Files.copy(jar, target, StandardCopyOption.REPLACE_EXISTING);
        }
        if (baselineJar != null) {
            if (!Files.isRegularFile(baselineJar)) {
                throw new IllegalStateException("No baseline jar at " + baselineJar);
            }
            String[] baseParts = baselineRobot.split(" ");
            Path baseTarget = robots.resolve(baseParts[0] + "_" + baseParts[1] + ".jar");
            Files.copy(baselineJar, baseTarget, StandardCopyOption.REPLACE_EXISTING);
        }

        try (Stream<Path> samples = Files.list(benchDir.resolve("target/samples"))) {
            for (Path s : (Iterable<Path>) samples::iterator) {
                Files.copy(s, robots.resolve(s.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        for (Iterator<Opponent> it = opponents.iterator(); it.hasNext();) {
            Opponent o = it.next();
            if (o.jar == null) continue;
            Path jar = benchDir.resolve("opponents").resolve(o.jar);
            if (!Files.exists(jar)) {
                if (!lenient) throw new IllegalStateException("Missing opponent jar " + jar);
                System.out.println("  no jar for " + o.name + "; dropped from the session");
                it.remove();
                continue;
            }
            Files.copy(jar, robots.resolve(o.jar), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    /**
     * BENCH-6/7: runs the session file's opponents in order through one engine process under
     * the file's heap cap, then (with a control robot) again with the control, and reports
     * both by blocks of 25 battles.
     */
    private int runSession() throws Exception {
        SessionFile sf = SessionFile.parse(benchDir.resolve(opts.get("session")));
        List<Opponent> opponents = Opponent.load(benchDir.resolve(sf.opponents()));
        String only = opts.get("only");
        if (only != null) opponents.removeIf(o -> !o.name.contains(only));
        if (opts.containsKey("limit")) {
            opponents = new ArrayList<>(opponents.subList(0, Math.min(opponents.size(), Integer.parseInt(opts.get("limit")))));
        }
        installRobots(opponents, true);
        if (sf.controlJar() != null) {
            Path jar = Path.of(sf.controlJar()).toAbsolutePath();
            Files.copy(jar, home.resolve("robots").resolve(jar.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        }
        int rounds = opts.containsKey("rounds") ? this.rounds : sf.rounds();
        Map<String, List<SessionReport.Row>> sessions = new LinkedHashMap<>();
        int status = 0;
        List<String> robots = new ArrayList<>(List.of(robot));
        if (sf.control() != null) robots.add(sf.control());
        for (String r : robots) {
            wipeData();
            Path dir = out.resolve("session-" + slug(r));
            Files.createDirectories(dir);
            Path list = dir.resolve("opponents.tsv");
            List<String> lines = new ArrayList<>();
            for (int i = 0; i < opponents.size(); i++) lines.add(opponents.get(i).name + "\t" + (i + 1));
            Files.write(list, lines);
            System.out.println("== session: " + r + " (" + opponents.size() + " battles, heap " + sf.heap() + ")");
            if (sf.fresh()) {
                for (int i = 0; i < lines.size(); i++) {
                    Path one = dir.resolve("one.tsv");
                    Files.writeString(one, lines.get(i) + "\n");
                    if (!runSessionChild(sf, r, dir, one, rounds, i == 0)) status = 1;
                }
            } else {
                if (!runSessionChild(sf, r, dir, list, rounds, true)) status = 1;
            }
            List<SessionReport.Row> rows = readSession(dir, opponents);
            if (rows.stream().anyMatch(SessionReport.Row::missing)) {
                System.err.println("session " + r + ": some battles produced no result row");
                status = 1;
            }
            sessions.put(r, rows);
        }
        String report = SessionReport.render(sessions, sf.heap(), sf.fresh(), sf.wipe(), rounds);
        Files.createDirectories(out);
        Files.writeString(out.resolve("report.md"), report);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, report);
        }
        System.out.println();
        System.out.println(report);
        return status;
    }

    /** Runs one session child; false when it timed out or exited nonzero. The partial output is kept. */
    private boolean runSessionChild(SessionFile sf, String robotName, Path dir, Path list, int rounds, boolean first)
            throws IOException, InterruptedException {
        List<String> cmd = new ArrayList<>();
        cmd.add(defaultJavaBin());
        cmd.addAll(JVM_FLAGS);
        if (sf.heapFlag() != null) cmd.add(sf.heapFlag());
        cmd.add("-Xlog:gc*:file=" + dir.resolve("gc.log") + ":time");
        cmd.add("-cp");
        cmd.add(classpath());
        cmd.add(SessionRunner.class.getName());
        cmd.addAll(List.of(home.toString(), dir.toString(), String.valueOf(rounds), String.valueOf(width),
            String.valueOf(height), robotName, list.toString(), String.valueOf(sf.wipe())));
        Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
            .redirectOutput(first ? ProcessBuilder.Redirect.to(dir.resolve("session.log").toFile())
                                  : ProcessBuilder.Redirect.appendTo(dir.resolve("session.log").toFile()))
            .start();
        if (!p.waitFor(12, TimeUnit.HOURS)) {
            p.destroyForcibly();
            System.err.println("session child timed out");
            return false;
        }
        if (p.exitValue() != 0) {
            System.err.println("session child exited " + p.exitValue());
            return false;
        }
        return true;
    }

    /**
     * The session's rows, one per expected opponent in order: a battle with no row (the JVM
     * died before writing it) is a placeholder, so later battles keep their own positions.
     */
    private static List<SessionReport.Row> readSession(Path dir, List<Opponent> opponents) throws IOException {
        SessionReport.Row[] rows = new SessionReport.Row[opponents.size()];
        Path csv = dir.resolve("session.csv");
        if (Files.exists(csv)) {
            List<String> lines = Files.readAllLines(csv);
            for (String line : lines.subList(1, lines.size())) {
                Map<String, String> c = SessionReport.columns(SessionRunner.HEADER, line);
                int index = Integer.parseInt(c.get("index"));
                Opponent o = opponents.get(index - 1);
                Path result = dir.resolve(String.format("%04d-%s", index, SessionRunner.slug(o.name))).resolve("result.csv");
                BattleResult b = Files.exists(result) ? readResult(result, 0) : null;
                rows[index - 1] = new SessionReport.Row(index, o.name, apsOf(o), b,
                    Double.parseDouble(c.get("heapAfterGcMb")), Double.parseDouble(c.get("longestPauseMs")),
                    Integer.parseInt(c.get("loadedClasses")), Integer.parseInt(c.get("unloadedClasses")),
                    Integer.parseInt(c.get("engineDisables")), Integer.parseInt(c.get("duressTicks")), false);
            }
        }
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == null) {
                rows[i] = new SessionReport.Row(i + 1, opponents.get(i).name, apsOf(opponents.get(i)), null,
                    0, 0, 0, 0, 0, 0, true);
            }
        }
        return new ArrayList<>(List.of(rows));
    }

    private static double apsOf(Opponent o) {
        try {
            return Double.parseDouble(o.role);
        } catch (NumberFormatException e) {
            return Double.NaN;
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
