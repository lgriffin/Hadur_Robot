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
import java.time.Instant;
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
 * <li>{@code --robot-jar FILE} the robot jar (../hadur-robot/target/hadur2.Hadur_&lt;release&gt;.jar,
 *     the release being {@code robot.release} in hadur-robot/pom.xml, see {@link RobotJar}),
 *     or {@code --robot-classes DIR} to jar a compiled class tree instead;
 *     {@code --robot NAME} as Robocode lists it ("hadur2.Hadur &lt;release&gt;").</li>
 * <li>{@code --record DIR} capture replay fixtures instead: runs the recorder robot
 *     (../hadur-robot/target/hadur-robot-2.0-SNAPSHOT-recorder.jar) with Robocode's
 *     security off and writes one gzipped transcript per opponent to DIR (CORE-2).</li>
 * <li>{@code --melee true} run every opponent in the set against Hadur at once, one battle
 *     per seed, and report finishing places instead (MeleeRumble: 10 robots, 1000x1000).</li>
 * <li>{@code --team true} (A5) fight each team of the set with our team jar
 *     ({@code --robot-jar}, hadur2.HadurTeam_&lt;release&gt;.jar; {@code --robot} "hadur2.HadurTeam
 *     &lt;release&gt;"; {@code --member} hadur2.Hadur), TeamRumble style: 1200x1200, 10 rounds.</li>
 * <li>{@code --baseline JAR} (BENCH-2) also fight every opponent with this second jar, one
 *     battle per seed at the same {@code RANDOMSEED} as the candidate's, and report the
 *     paired score-share difference instead of two separate means. Requires
 *     {@code --baseline-robot NAME}, naming it as Robocode lists it and distinct from
 *     {@code --robot}: two jars sharing a robot name+version would install to the same
 *     file, so the candidate and baseline must be different name/version strings (e.g. a
 *     released version against a locally bumped one).</li>
 * <li>{@code --shield-probe FILE} (BENCH-11) run each opponent of FILE (the usual set
 *     format, with the weight column) with Hadur's shield mode on and off over the same
 *     seeds, and report the paired difference per opponent and the weighted mean. The
 *     candidate jar is repacked twice, with a shield list naming every opponent ("on") and
 *     an empty one ("off"), under robot versions {@code <version>-on} and {@code
 *     <version>-off}, and the pair runs through the {@code --baseline} machinery; so the
 *     option takes {@code --robot-jar}, {@code --robot}, {@code --rounds}, {@code --seeds}
 *     and {@code --only}, and no {@code --baseline}. See {@link ShieldProbe}.</li>
 * <li>{@code --sentry-border N} in melee mode, the set's {@code sentry} entries fight as
 *     Robocode sentries guarding a border N px deep.</li>
 * <li>{@code --client FILE} (BENCH-4) run the set through each rumble-client condition the
 *     file lists ({@code label | key=value ...} per line: {@code data}, {@code cpu},
 *     {@code load}, {@code engine}, {@code java}; see {@link ClientConditions}), one bench
 *     pass per condition, and report survival and skipped turns per opponent per condition.</li>
 * <li>{@code --suite FILE} run every bench the file lists ({@code label | options} per
 *     line) and write one report, e.g. {@code melee-gates.txt}.</li>
 * <li>{@code --parallel N} (issue #102) run N duel battles at once, each on its own Robocode
 *     home ({@code home-1..home-N}); {@code --cpu-constant NANOS} pins the engine's CPU
 *     constant in every home (else several workers share one idle calibration);
 *     {@code --child-cpus N} sizes each battle JVM for N processors (2 when parallel, else
 *     off) and {@code --child-heap SIZE} caps its heap; {@code --per-opponent DIR} writes
 *     one report per opponent beside the main one. All of these apply to the melee and team
 *     modes too: {@code --parallel} runs a field's seeds (melee) or an opponent's seeds
 *     (team) concurrently, {@code --baseline}/{@code --baseline-robot} add a paired table,
 *     and {@code --per-opponent} writes a markdown per opponent (per field, in melee);
 *     {@code --keep-data} in melee needs {@code --parallel 1}.</li>
 * <li>{@code --retries N} (BENCH-55, default 1) run a failed battle again up to N times; a
 *     battle still failed is listed at the end of the run and in the report's footer.</li>
 * <li>{@code --repeat K} (BENCH-53) fight each (jar, opponent, seed) K times and write
 *     {@code repeat.tsv} with every battle's score share, printing the SD.</li>
 * <li>{@code --cold-warm true} (BENCH-54) fight each seed cold and then warm on the shelf the
 *     cold battle left, and write {@code cold-warm.tsv} with the pairing and the shelf.</li>
 * <li>{@code --dry-run true} print what would run (opponents, battles, options) and exit.</li>
 * <li>{@code @FILE} as the only argument (BENCH-59) reads the arguments from FILE, one per
 *     line, so a robot name with a space needs no quoting through Maven or a shell.</li>
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
    /** The robot release the defaults name (issue #102): from the robot pom, or the newest built jar. */
    private final String release;
    /**
     * Battles run at once in the duel modes (cold, warm, paired), each in its own Robocode
     * home so their data directories never meet; 1 runs them one after another, as before.
     */
    private final int parallel;
    private final boolean warm;
    /** Where replay fixtures go, or null when not recording. */
    private final Path record;
    private final int rounds, runs, width, height;
    /** BENCH-2: the paired baseline jar and robot name, or null when not running paired. */
    private final Path baselineJar;
    private final String baselineRobot;
    /** BENCH-4: the client-conditions file, or null when running a plain single pass. */
    private final Path client;
    /** BENCH-55: how many times a failed battle is run again before it stays failed. */
    private final int retries;
    /** BENCH-53: how many times each (jar, opponent, seed) is fought in {@code --repeat} mode, or 0. */
    private final int repeat;
    /** BENCH-54: fight each seed cold, then warm on the shelf the cold battle left. */
    private final boolean coldWarm;
    private final boolean dryRun;
    /** Battles that stayed failed after their retries, and those that needed one (BENCH-55). */
    private final List<Failure> failures = Collections.synchronizedList(new ArrayList<>());
    private final List<String> retried = Collections.synchronizedList(new ArrayList<>());
    private final Exclusions.Counter outcomes = new Exclusions.Counter();
    private final List<ColdWarm.Row> coldWarmRows = Collections.synchronizedList(new ArrayList<>());
    /** BENCH-50, BENCH-51: the host sampler, the run's start and the shelf it began on; set once a run starts. */
    private Host.Sampler sampler;
    private Instant startedAt;
    private Conditions.Shelf startShelf;
    private volatile int workers = 1;

    /** A battle that failed on every attempt. */
    record Failure(String what, int attempts, String why) {}

    Bench(Map<String, String> opts) {
        this.opts = opts;
        this.benchDir = Path.of("").toAbsolutePath();
        this.release = RobotJar.release(benchDir);
        try {
            // BENCH-11: --shield-probe becomes a paired run of the same jar with shield mode on and off.
            ShieldProbe.prepare(opts, benchDir, release);
        } catch (IOException e) {
            throw new java.io.UncheckedIOException(e);
        }
        if (opts.containsKey("team")) {
            // A5: the TeamRumble's settings and the team jar, unless given.
            opts.putIfAbsent("field", "1200x1200");
            opts.putIfAbsent("rounds", "10");
            opts.putIfAbsent("seeds", "3");
            if (opts.containsKey("record")) {
                // STRAND-5: five recorders, a team jar made from the recorder jar (runTeam).
                opts.putIfAbsent("robot", "hadur2.HadurRecorderTeam " + release);
                opts.putIfAbsent("member", "hadur2.HadurRecorder");
                opts.putIfAbsent("robot-jar", RobotJar.recorderJar());
            }
            opts.putIfAbsent("robot", "hadur2.HadurTeam " + release);
            opts.putIfAbsent("robot-jar", RobotJar.teamJar(release));
        }
        this.warm = opts.getOrDefault("mode", "cold").equals("warm");
        this.rounds = Integer.parseInt(opts.getOrDefault("rounds", "35"));
        this.runs = Integer.parseInt(warm ? opts.getOrDefault("battles", "5")
                                          : opts.getOrDefault("seeds", "5"));
        this.parallel = Integer.parseInt(opts.getOrDefault("parallel", "1"));
        if (parallel < 1) throw new IllegalArgumentException("--parallel must be at least 1, not " + parallel);
        int[] field = parseField(opts.getOrDefault("field", "800x600"));
        this.width = field[0];
        this.height = field[1];
        this.record = opts.containsKey("record") ? Path.of(opts.get("record")).toAbsolutePath() : null;
        if (record != null) {
            opts.putIfAbsent("robot", "hadur2.HadurRecorder " + release);
            opts.putIfAbsent("robot-jar", RobotJar.recorderJar());
        }
        this.robot = opts.getOrDefault("robot", defaultRobot(opts, benchDir, release));
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
        this.retries = Integer.parseInt(opts.getOrDefault("retries", "1"));
        if (retries < 0) throw new IllegalArgumentException("--retries must be at least 0, not " + retries);
        this.repeat = Integer.parseInt(opts.getOrDefault("repeat", "0"));
        if (repeat < 0 || repeat == 1) {
            throw new IllegalArgumentException("--repeat needs at least 2 runs of each battle, not " + repeat);
        }
        this.coldWarm = Boolean.parseBoolean(opts.getOrDefault("cold-warm", "false"));
        if (coldWarm && (warm || repeat > 0 || client != null || opts.containsKey("melee")
                || opts.containsKey("team") || opts.containsKey("session") || record != null)) {
            throw new IllegalArgumentException(
                "--cold-warm is a cold-mode duel option: it does not combine with --mode warm, --repeat, "
                + "--client, --melee, --team, --session or --record");
        }
        if (repeat > 0 && (warm || client != null || opts.containsKey("melee") || opts.containsKey("team")
                || opts.containsKey("session") || record != null)) {
            throw new IllegalArgumentException(
                "--repeat is a cold-mode duel option: it does not combine with --mode warm, "
                + "--client, --melee, --team, --session or --record");
        }
        this.dryRun = Boolean.parseBoolean(opts.getOrDefault("dry-run", "false"));
        String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        this.out = Path.of(opts.getOrDefault("out",
            "work/" + (warm ? "warm" : "cold") + "-" + stamp)).toAbsolutePath();
        this.home = out.resolve("home");
    }

    /**
     * The {@code --robot} default: what the given {@code --robot-jar} says it holds, else
     * the solo robot of the project's release (issue #102: no default lags the version).
     */
    static String defaultRobot(Map<String, String> opts, Path benchDir, String release) {
        if (opts.containsKey("robot-jar")) {
            String named = RobotJar.nameOf(benchDir.resolve(opts.get("robot-jar")));
            if (named != null) return named;
        }
        return "hadur2.Hadur " + release;
    }

    /** {@code WxH} as {width, height}; anything else is refused with the form it wants. */
    static int[] parseField(String field) {
        String[] f = field.split("x");
        try {
            if (f.length != 2) throw new NumberFormatException(field);
            int w = Integer.parseInt(f[0].trim()), h = Integer.parseInt(f[1].trim());
            if (w < 1 || h < 1) throw new NumberFormatException(field);
            return new int[] {w, h};
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("--field must be WIDTHxHEIGHT, e.g. 800x600, not " + field);
        }
    }

    /**
     * BENCH-59: a single argument {@code @FILE} stands for the arguments in FILE, one per
     * line (blank lines and lines starting with {@code #} skipped). A robot name with a space
     * is then one line, with no quoting for Maven's {@code -Dexec.args}, cmd.exe or PowerShell
     * 5.1 to mangle.
     */
    static String[] expandArgFile(String[] args) throws IOException {
        if (args.length != 1 || !args[0].startsWith("@") || args[0].length() < 2) return args;
        List<String> out = new ArrayList<>();
        for (String line : Files.readAllLines(Path.of(args[0].substring(1)), StandardCharsets.UTF_8)) {
            String t = !line.isEmpty() && line.charAt(0) == 0xFEFF ? line.substring(1) : line;
            if (t.isBlank() || t.startsWith("#")) continue;
            out.add(t);
        }
        return out.toArray(new String[0]);
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> opts = parse(expandArgFile(args));
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

    int run() throws Exception {
        if (opts.containsKey("session")) {
            if (dryRun) {
                System.out.println("dry run: --session " + opts.get("session") + ", no battle started");
                return 0;
            }
            return runSession();
        }
        List<Opponent> opponents = Opponent.load(benchDir.resolve(opts.getOrDefault("set", "reference-set.txt")));
        String only = opts.get("only");
        if (only != null) opponents.removeIf(o -> !o.name.contains(only));
        if (dryRun) return dryRun(opponents);
        installRobots(opponents);
        startedAt = Instant.now();
        startShelf = Conditions.shelf(home.resolve("robots/.data"));
        sampler = Host.Sampler.system();
        sampler.start();
        writeConditions(opponents, false);
        try {
            if (opts.containsKey("melee")) return runMelee(opponents);
            if (opts.containsKey("team")) return runTeam(opponents);
            if (client != null) return runClientConditions(opponents);
            if (repeat > 0) return runRepeat(opponents);
            return runDuel(opponents);
        } finally {
            sampler.close();
            writeConditions(opponents, true);
            printFailures();
        }
    }

    /**
     * BENCH-56, {@code --dry-run true}: says what the options and the set add up to, without installing a
     * robot or starting a battle, so a script's command line can be checked cheaply.
     */
    private int dryRun(List<Opponent> opponents) {
        String mode = opts.containsKey("melee") ? "melee" : opts.containsKey("team") ? "team"
            : client != null ? "client conditions"
            : repeat > 0 ? "repeat x" + repeat : coldWarm ? "cold-warm" : warm ? "warm" : "cold";
        boolean field = opts.containsKey("melee");
        int perOpponent = repeat > 0 ? runs * repeat : runs * (coldWarm ? 2 : 1);
        int builds = baselineJar != null ? 2 : 1;
        int battles = field ? runs * builds : opponents.size() * perOpponent * builds;
        System.out.println("dry run: no robot installed, no battle started");
        System.out.println("  mode " + mode + ", robot " + robot + (baselineJar == null ? "" : ", baseline " + baselineRobot
            + " (" + baselineJar + ")"));
        System.out.println("  set " + opts.getOrDefault("set", "reference-set.txt") + ": " + opponents.size() + " opponents; "
            + battles + " battles of " + rounds + " rounds on " + width + "x" + height
            + ", parallel " + parallel + ", retries " + retries);
        System.out.println("  child flags " + childFlags() + ", cpu constant "
            + (opts.containsKey("cpu-constant") ? opts.get("cpu-constant") : "engine's own") + ", out " + out);
        System.out.println("  options " + new TreeMap<>(opts));
        return 0;
    }

    private int runDuel(List<Opponent> opponents) throws Exception {
        // Issue #102: the duel modes run their battles on a pool of worker homes, --parallel
        // at a time. Cold mode schedules every (opponent, seed) battle on its own; warm mode
        // keeps an opponent's consecutive battles on one worker, so the data directory they
        // share is theirs alone. With --parallel 1 there is one home and the order is the old one.
        int n = opponents.size();
        BattleResult[][] cand = new BattleResult[n][runs];
        BattleResult[][] base = baselineJar != null ? new BattleResult[n][runs] : null;
        OpponentProfile[] stored = new OpponentProfile[n];
        List<Job> jobs = new ArrayList<>();
        for (int oi = 0; oi < n; oi++) {
            Opponent o = opponents.get(oi);
            if (warm) {
                int index = oi;
                jobs.add(h -> {
                    wipeData(h);
                    for (int i = 1; i <= runs; i++) duel(h, o, i, cand[index], base == null ? null : base[index], stored, index);
                });
            } else {
                for (int i = 1; i <= runs; i++) {
                    int index = oi, seed = i;
                    jobs.add(h -> {
                        wipeData(h);
                        duel(h, o, seed, cand[index], base == null ? null : base[index], stored, index);
                    });
                }
            }
        }
        List<Path> homes = workerHomes(Math.min(parallel, Math.max(1, jobs.size())));
        workers = homes.size();
        pinCpuConstant(homes);
        runJobs(jobs, homes);

        Map<Opponent, List<BattleResult>> results = new LinkedHashMap<>();
        Map<Opponent, List<BattleResult>> baselineResults = base != null ? new LinkedHashMap<>() : null;
        Map<Opponent, OpponentProfile> profiles = new LinkedHashMap<>();
        for (int oi = 0; oi < n; oi++) {
            Opponent o = opponents.get(oi);
            results.put(o, new ArrayList<>(Arrays.asList(cand[oi])));
            if (baselineResults != null) baselineResults.put(o, new ArrayList<>(Arrays.asList(base[oi])));
            if (stored[oi] != null) profiles.put(o, stored[oi]);
        }

        String host = duelHostLine(homes.size());
        String report = Report.render(results, profiles, robot, warm, rounds, runs, width, height, host);
        if (baselineResults != null) {
            // BENCH-2's diff table, then BENCH-3's full per-opponent diagnostics for the
            // baseline too (hit rate, skips, faults, pace), not just its score share.
            report += Report.renderPaired(results, baselineResults, robot, baselineRobot);
            // BENCH-11: what shield mode did, and the verdict per opponent.
            if (opts.containsKey("shield-probe")) {
                report += ShieldProbe.render(results, baselineResults, out.resolve("battles"), robot,
                    baselineRobot);
            }
            report += "\n" + Report.render(baselineResults, robot + " baseline (" + baselineRobot + ")",
                warm, rounds, runs, width, height, host);
        }
        if (coldWarm) {
            ArrayList<ColdWarm.Row> rows = new ArrayList<>(coldWarmRows);
            rows.sort(Comparator.comparing(ColdWarm.Row::opponent).thenComparingInt(ColdWarm.Row::seed)
                .thenComparing(ColdWarm.Row::build));
            Files.writeString(out.resolve("cold-warm.tsv"), ColdWarm.tsv(rows));
            report += ColdWarm.render(rows);
        }
        List<RoundSeries.Row> roundRows = RoundSeries.readAll(out);
        if (!roundRows.isEmpty()) {
            Files.writeString(out.resolve("rounds.tsv"), RoundSeries.merge(roundRows));
            report += Report.renderRoundSplit(roundRows, robot, baselineResults != null ? baselineRobot : null);
        }
        report += failureFooter(failures, retried);
        report = Exclusions.insertAfterTitle(report, Exclusions.block(outcomes.tallies()));
        Files.writeString(out.resolve("report.md"), report);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, report);
        }
        if (opts.containsKey("per-opponent")) {
            // Issue #102: one report per opponent, for the per-robot bench strategy.
            Path dir = Path.of(opts.get("per-opponent")).toAbsolutePath();
            Files.createDirectories(dir);
            for (Opponent o : opponents) {
                String one = Report.renderOpponent(o, results.get(o),
                    baselineResults == null ? null : baselineResults.get(o), profiles.get(o),
                    robot, baselineRobot, warm, rounds, runs, width, height, host);
                Files.writeString(dir.resolve(o.slug() + ".md"), one);
            }
            System.out.println("per-opponent reports in " + dir);
        }
        System.out.println();
        System.out.println(report);
        boolean failed = results.values().stream().flatMap(List::stream).anyMatch(r -> !r.ok);
        if (baselineResults != null) {
            failed |= baselineResults.values().stream().flatMap(List::stream).anyMatch(r -> !r.ok);
        }
        return failed ? 1 : 0;
    }

    /**
     * BENCH-53, {@code --repeat K}: every (jar, opponent, seed) is fought K times in a row on one
     * worker home, cold each time, and {@code repeat.tsv} keeps every battle. The spread of one
     * seed's repeats is what the host alone does to a battle, so the report prints it as the
     * score-share SD per opponent and pooled.
     */
    private int runRepeat(List<Opponent> opponents) throws Exception {
        List<List<RepeatStudy.Row>> perJob = new ArrayList<>();
        List<Job> jobs = new ArrayList<>();
        List<String[]> builds = new ArrayList<>();
        builds.add(new String[] {robot, ""});
        if (baselineJar != null) builds.add(new String[] {baselineRobot, "-baseline"});
        for (Opponent o : opponents) {
            for (int s = 1; s <= runs; s++) {
                int seed = s;
                List<RepeatStudy.Row> mine = new ArrayList<>();
                perJob.add(mine);
                jobs.add(h -> {
                    for (int rep = 1; rep <= repeat; rep++) {
                        for (int b = 0; b < builds.size(); b++) {
                            String[] build = builds.get(candidateFirst(rep) ? b : builds.size() - 1 - b);
                            Path dir = out.resolve("battles").resolve(o.slug() + "-" + seed + "-r" + rep + build[1]);
                            BattleResult r = fight(h, o, seed, dir, build[0], true);
                            mine.add(RepeatStudy.Row.of(build[0], o.name, seed, rep, r));
                            say(String.format(Locale.ROOT, "%s seed %d repeat %d/%d %s: score share %.1f%%%s",
                                o.name, seed, rep, repeat, build[0], r.scoreShare() * 100,
                                r.ok ? "" : " FAILED: " + r.errors));
                        }
                    }
                });
            }
        }
        List<Path> homes = workerHomes(Math.min(parallel, Math.max(1, jobs.size())));
        workers = homes.size();
        pinCpuConstant(homes);
        runJobs(jobs, homes);

        List<RepeatStudy.Row> rows = perJob.stream().flatMap(List::stream).toList();
        Files.writeString(out.resolve("repeat.tsv"), RepeatStudy.tsv(rows));
        String report = RepeatStudy.render(rows, repeat) + "\nConditions: " + duelHostLine(homes.size())
            + ". Rounds " + rounds + ", field " + width + "x" + height + ".\n" + failureFooter(failures, retried);
        Files.writeString(out.resolve("report.md"), report);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, report);
        }
        System.out.println();
        System.out.println(report);
        return rows.stream().anyMatch(r -> !r.ok()) ? 1 : 0;
    }

    /**
     * BENCH-51: {@code conditions.json}, written when the run starts and again when it ends:
     * the commit, the jars' checksums, the parallelism and child settings, the CPU constant, the
     * engine, the shelf the run began on and what the host sampler saw.
     */
    private void writeConditions(List<Opponent> opponents, boolean finished) {
        try {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("started", startedAt.toString());
            m.put("finished", finished ? Instant.now().toString() : null);
            m.put("mode", opts.containsKey("melee") ? "melee" : opts.containsKey("team") ? "team"
                : client != null ? "client" : repeat > 0 ? "repeat" : coldWarm ? "cold-warm" : warm ? "warm" : "cold");
            m.put("git", Conditions.git(benchDir));
            Map<String, Object> jars = new LinkedHashMap<>();
            jars.put("candidate", installedJar(robot));
            if (baselineJar != null) jars.put("baseline", installedJar(baselineRobot));
            m.put("jars", jars);
            m.put("robot", robot);
            m.put("baselineRobot", baselineRobot);
            m.put("engine", Report.ENGINE);
            m.put("parallel", parallel);
            m.put("workers", workers);
            m.put("childCpus", opts.getOrDefault("child-cpus", parallel > 1 ? "2" : "0"));
            m.put("childFlags", childFlags());
            m.put("jvmFlags", JVM_FLAGS);
            m.put("cpuConstant", reportedCpuConstant());
            m.put("rounds", rounds);
            m.put("seeds", runs);
            m.put("field", width + "x" + height);
            m.put("retries", retries);
            m.put("repeat", repeat);
            m.put("set", opts.getOrDefault("set", "reference-set.txt"));
            m.put("opponents", opponents.size());
            m.put("options", new TreeMap<>(opts));
            m.put("host", Host.describe());
            Host.Window w = sampler.overall();
            Map<String, Object> sample = new LinkedHashMap<>();
            sample.put("samples", w.samples());
            sample.put("cpuMin", w.cpuMin());
            sample.put("cpuMean", w.cpuMean());
            sample.put("cpuMax", w.cpuMax());
            sample.put("otherJvmsMax", w.otherJvms());
            m.put("hostSample", sample);
            m.put("shelfAtStart", startShelf.toMap());
            m.put("failedBattles", failures.size());
            m.put("excluded", Exclusions.toMaps(outcomes.tallies()));
            m.put("retriedBattles", retried.size());
            Files.createDirectories(out);
            Files.writeString(out.resolve("conditions.json"), Conditions.json(m));
        } catch (IOException | RuntimeException e) {
            System.err.println("could not write conditions.json: " + e);
        }
    }

    private Map<String, Object> installedJar(String robotName) {
        String[] parts = robotName.split(" ");
        return Conditions.jar(home.resolve("robots").resolve(parts[0] + "_" + parts[1] + ".jar"));
    }

    /** A unit of work on one worker home: one battle (cold), or an opponent's run of battles (warm). */
    private interface Job {
        void run(Path home) throws Exception;
    }

    /**
     * One seed of one opponent on a worker home: the candidate's battle and the baseline's at
     * the same seed when paired (BENCH-2). The two are fought in an order that alternates with
     * the seed's parity (BENCH-52), so a trend in the host's load over a job cannot favour the
     * same build on every seed. After the opponent's last seed the profile Hadur left is read
     * from this home, before anything wipes it (MEM-3). A battle that throws is recorded as
     * failed with the exception's message, so the report still shows it.
     */
    private void duel(Path h, Opponent o, int seed, BattleResult[] cand, BattleResult[] base,
                      OpponentProfile[] stored, int index) throws Exception {
        if (parallel == 1) System.out.printf("%s battle %d/%d ...%n", o.name, seed, runs);
        if (base == null || candidateFirst(seed)) {
            fightCandidate(h, o, seed, cand, stored, index);
            if (base != null) {
                if (!warm) wipeData(h);
                fightBaseline(h, o, seed, base);
            }
        } else {
            fightBaseline(h, o, seed, base);
            if (!warm) wipeData(h);
            fightCandidate(h, o, seed, cand, stored, index);
        }
    }

    /** BENCH-52: the candidate goes first on odd seeds, the baseline on even ones. */
    static boolean candidateFirst(int seed) {
        return seed % 2 != 0;
    }

    private void fightCandidate(Path h, Opponent o, int seed, BattleResult[] cand, OpponentProfile[] stored,
                                int index) throws Exception {
        BattleResult r = legs(h, o, seed, robot, o.slug() + "-" + seed);
        cand[seed - 1] = r;
        say(String.format(Locale.ROOT, "%s%s battle %d/%d: score share %.1f%%, wins %d/%d, skipped turns %d%s",
            parallel == 1 ? "  " : "", o.name, seed, runs, r.scoreShare() * 100, r.firsts, r.rounds,
            r.skippedTurns, r.ok ? "" : " FAILED: " + r.errors));
        if (seed == runs) {
            OpponentProfile p = storedProfile(h, o.name);
            if (p != null) stored[index] = p;
        }
    }

    private void fightBaseline(Path h, Opponent o, int seed, BattleResult[] base) throws Exception {
        BattleResult b = legs(h, o, seed, baselineRobot, o.slug() + "-" + seed + "-baseline");
        base[seed - 1] = b;
        say(String.format(Locale.ROOT, "%s%s battle %d/%d: baseline score share %.1f%%%s",
            parallel == 1 ? "  " : "", o.name, seed, runs, b.scoreShare() * 100,
            b.ok ? "" : " FAILED: " + b.errors));
    }

    /**
     * One build's battle at one seed. With {@code --cold-warm} it is the cold battle (the data
     * directory is empty) followed by a warm one on the shelf the cold one left, and the pair is
     * recorded for {@code cold-warm.tsv} (BENCH-54); the cold battle stands as the result.
     */
    private BattleResult legs(Path h, Opponent o, int seed, String robotName, String dirName) throws Exception {
        Path battles = out.resolve("battles");
        BattleResult cold = fight(h, o, seed, battles.resolve(dirName), robotName, !warm);
        if (!coldWarm) return cold;
        Conditions.Shelf shelf = Conditions.shelf(h.resolve("robots/.data"));
        BattleResult second = fight(h, o, seed, battles.resolve(dirName + "-warm"), robotName, false);
        coldWarmRows.add(new ColdWarm.Row(robotName, o.name, seed, cold, second, shelf, dirName, dirName + "-warm"));
        say(String.format(Locale.ROOT, "%s%s battle %d/%d: %s warm score share %.1f%% (cold %.1f%%)",
            parallel == 1 ? "  " : "", o.name, seed, runs, robotName, second.scoreShare() * 100,
            cold.scoreShare() * 100));
        return cold;
    }

    /**
     * One battle with its retries (BENCH-55). {@code wipe} clears the data directory before
     * every attempt, so a retried cold battle is as cold as the first. A battle that stays
     * failed is remembered for the end of the run.
     */
    private BattleResult fight(Path h, Opponent o, int seed, Path dir, String robotName, boolean wipe)
            throws Exception {
        Tried<BattleResult> t = attempts(retries, () -> {
            if (wipe) wipeData(h);
            try {
                return runBattle(o, seed, dir, robotName, h);
            } catch (IOException | RuntimeException e) {
                return BattleResult.parse(BattleResult.failed("bench error: " + e));
            }
        }, r -> r.ok);
        note(o.name + (robotName.equals(baselineRobot) ? " (baseline)" : ""), o.name + " seed " + seed + " " + dir.getFileName(), t.attempts(), t.value().ok, t.value().errors);
        return t.value();
    }

    /** What {@link #attempts} ended with: the last value and how many tries it took. */
    record Tried<T>(T value, int attempts) {}

    interface Attempt<T> {
        T run() throws Exception;
    }

    /** Runs {@code attempt} until {@code ok} accepts its value, at most {@code retries} more times (BENCH-55). */
    static <T> Tried<T> attempts(int retries, Attempt<T> attempt, java.util.function.Predicate<T> ok)
            throws Exception {
        int n = 0;
        T value;
        do {
            n++;
            value = attempt.run();
        } while (!ok.test(value) && n <= retries);
        return new Tried<>(value, n);
    }

    /** Remembers a battle that needed a retry, or stayed failed after them. */
    private void note(String unit, String what, int attempts, boolean ok, String why) {
        outcomes.add(unit, ok, why);
        if (!ok) failures.add(new Failure(what, attempts, why));
        else if (attempts > 1) retried.add(what + " (" + attempts + " attempts)");
    }

    /** BENCH-55: the report footer for battles that stayed failed or needed a retry; empty when neither happened. */
    static String failureFooter(List<Failure> failed, List<String> retried) {
        if (failed.isEmpty() && retried.isEmpty()) return "";
        StringBuilder b = new StringBuilder("\n## Failed battles\n\n");
        if (failed.isEmpty()) b.append("None; every battle finished.\n");
        for (Failure f : failed) {
            b.append("- ").append(f.what()).append(": failed after ").append(f.attempts())
                .append(f.attempts() == 1 ? " attempt" : " attempts").append(" (").append(f.why()).append(")\n");
        }
        if (!retried.isEmpty()) {
            b.append("\nRetried and then finished: ").append(String.join("; ", retried)).append(".\n");
        }
        return b.toString();
    }

    private void printFailures() {
        if (failures.isEmpty()) return;
        System.out.println();
        String excluded = Exclusions.summary(outcomes.tallies());
        if (!excluded.isEmpty()) System.out.println(excluded);
        System.out.println(failures.size() + " battle" + (failures.size() == 1 ? "" : "s")
            + " failed after " + retries + " retr" + (retries == 1 ? "y" : "ies") + ":");
        for (Failure f : failures) System.out.println("  " + f.what() + " (" + f.attempts() + " attempts): " + f.why());
    }

    /** The duel report's conditions: the melee and team reports' line, less its closing full stop (the report adds it). */
    String duelHostLine(int workers) {
        String line = hostLine(reportedCpuConstant(), Host.describe(), workers, childFlags());
        return line.substring(0, line.length() - 1);
    }

    private static synchronized void say(String line) {
        System.out.println(line);
    }

    /**
     * Runs the jobs on a pool of {@code homes.size()} threads; each job takes a free home,
     * fights on it and hands it back. A job's own failure is caught inside it; anything that
     * escapes (a missing classpath, say) stops the bench with that exception.
     */
    private void runJobs(List<Job> jobs, List<Path> homes) throws Exception {
        java.util.concurrent.BlockingQueue<Path> free = new java.util.concurrent.LinkedBlockingQueue<>(homes);
        java.util.concurrent.ExecutorService pool = java.util.concurrent.Executors.newFixedThreadPool(homes.size());
        List<java.util.concurrent.Future<?>> futures = new ArrayList<>();
        try {
            for (Job job : jobs) {
                futures.add(pool.submit(() -> {
                    Path h = free.take();
                    try {
                        job.run(h);
                    } finally {
                        free.put(h);
                    }
                    return null;
                }));
            }
            for (java.util.concurrent.Future<?> f : futures) {
                try {
                    f.get();
                } catch (java.util.concurrent.ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Exception) throw (Exception) cause;
                    throw e;
                }
            }
        } finally {
            pool.shutdownNow();
        }
    }

    /**
     * The homes the duel battles run on: the main home alone for one worker, else
     * {@code home-1..home-N} beside it, each with its own copy of the installed robots. The
     * main home keeps the samples and jars (and the CPU constant) the workers are copied from.
     */
    private List<Path> workerHomes(int workers) throws IOException {
        if (workers == 1) return List.of(home);
        List<Path> homes = new ArrayList<>();
        for (int w = 1; w <= workers; w++) {
            Path h = out.resolve("home-" + w);
            copyTree(home.resolve("robots"), h.resolve("robots"));
            homes.add(h);
        }
        return homes;
    }

    /**
     * Issue #102: the CPU constant every worker runs under. {@code --cpu-constant NANOS} pins
     * it (the rumble client's own value on this host, say). Otherwise a single worker lets the
     * engine calibrate in its first battle as it always did, and several workers calibrate
     * once, idle, in the main home (a one-round sample battle) and share the result, so no
     * worker measures its allowance while the others load the machine.
     */
    private void pinCpuConstant(List<Path> homes) throws IOException, InterruptedException {
        String pinned = opts.get("cpu-constant");
        if (pinned != null) {
            for (Path h : homes) writeCpuConstant(h, Long.parseLong(pinned.trim()));
            return;
        }
        if (homes.size() == 1) return;
        Path config = home.resolve("config/robocode.properties");
        if (!Files.exists(config)) {
            System.out.println("calibrating the CPU constant in the main home ...");
            runBattle(new Opponent("sample.SittingDuck", "calibration", null, 0), 1,
                out.resolve("calibration"), "sample.Walls", home, 1, defaultJavaBin(), classpath());
        }
        if (!Files.exists(config)) {
            System.out.println("  the engine wrote no CPU constant; each worker will calibrate itself");
            return;
        }
        for (Path h : homes) {
            Files.createDirectories(h.resolve("config"));
            Files.copy(config, h.resolve("config/robocode.properties"), StandardCopyOption.REPLACE_EXISTING);
        }
        System.out.println("  " + cpuConstant() + " shared by " + homes.size() + " workers");
    }

    private static void copyTree(Path src, Path dest) throws IOException {
        Files.createDirectories(dest);
        try (Stream<Path> files = Files.walk(src)) {
            for (Path f : (Iterable<Path>) files::iterator) {
                Path target = dest.resolve(src.relativize(f).toString());
                if (Files.isDirectory(f)) Files.createDirectories(target);
                else Files.copy(f, target, StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }

    private BattleResult runBattle(Opponent o, int seed, Path dir, String robotName)
            throws IOException, InterruptedException {
        return runBattle(o, seed, dir, robotName, home);
    }

    /** As above, on a given Robocode home (a worker's). */
    private BattleResult runBattle(Opponent o, int seed, Path dir, String robotName, Path h)
            throws IOException, InterruptedException {
        return runBattle(o, seed, dir, robotName, h, rounds, defaultJavaBin(), classpath());
    }

    /** BENCH-4: as above, but on a given JVM and classpath (an {@code engine=}/{@code java=} condition). */
    private BattleResult runBattle(Opponent o, int seed, Path dir, String robotName,
                                    String javaBin, String cp) throws IOException, InterruptedException {
        return runBattle(o, seed, dir, robotName, home, rounds, javaBin, cp);
    }

    /**
     * Issue #102: the JVM flags a battle child gets beyond {@link #JVM_FLAGS}. With several
     * workers each child is told to size itself for {@code --child-cpus} processors (2 by
     * default) so that twenty JVMs do not each start a 48-core machine's worth of JIT and GC
     * threads; {@code --child-cpus 0} leaves the JVM to itself. {@code --child-heap} (e.g.
     * {@code 512M}, the rumble client's) caps the heap.
     */
    private List<String> childFlags() {
        return childFlags(opts, parallel);
    }

    /** The flags for {@code opts} and a {@code parallel} width, shared by the duel, melee and team runs. */
    static List<String> childFlags(Map<String, String> opts, int parallel) {
        List<String> flags = new ArrayList<>();
        int cpus = Integer.parseInt(opts.getOrDefault("child-cpus", parallel > 1 ? "2" : "0"));
        if (cpus > 0) flags.add("-XX:ActiveProcessorCount=" + cpus);
        String heap = opts.get("child-heap");
        if (heap != null) flags.add("-Xmx" + heap);
        return flags;
    }

    private BattleResult runBattle(Opponent o, int seed, Path dir, String robotName, Path h, int rounds,
                                    String javaBin, String cp) throws IOException, InterruptedException {
        Files.createDirectories(dir);
        // A result left by an earlier run in this directory must not stand in for this one.
        Path result = dir.resolve("result.csv");
        Files.deleteIfExists(result);
        List<String> cmd = new ArrayList<>();
        cmd.add(javaBin);
        cmd.addAll(JVM_FLAGS);
        cmd.addAll(childFlags());
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
        cmd.addAll(List.of(h.toString(), dir.toString(), String.valueOf(rounds),
            String.valueOf(width), String.valueOf(height), robotName, o.name));
        long from = System.currentTimeMillis();
        Process p = new ProcessBuilder(cmd)
            .redirectErrorStream(true)
            .redirectOutput(dir.resolve("engine.log").toFile())
            .start();
        if (!p.waitFor(30, TimeUnit.MINUTES)) {
            p.destroyForcibly();
            return BattleResult.parse(BattleResult.failed("timed out"));
        }
        if (record != null && Files.exists(transcript)) saveFixture(o, seed, transcript);
        BattleResult r = readResult(result, p.exitValue());
        if (sampler != null) annotate(r, result, sampler.window(from, System.currentTimeMillis()));
        return r;
    }

    /**
     * BENCH-50: gives {@code r} the host load its battle ran under and writes the result row
     * again with the four host columns filled in (the battle's own JVM cannot know them), so
     * the battle's {@code result.csv} carries them for the exporter. A missing or unreadable
     * file is left alone.
     */
    static void annotate(BattleResult r, Path result, Host.Window w) throws IOException {
        r.hostCpuMin = w.cpuMin();
        r.hostCpuMean = w.cpuMean();
        r.hostCpuMax = w.cpuMax();
        r.otherJvms = w.otherJvms();
        if (!Files.exists(result) || Files.readAllLines(result).size() < 2) return;
        Files.writeString(result, BattleResult.HEADER + System.lineSeparator() + r.toCsv() + System.lineSeparator());
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
     * Issue #102: the seeds run on a pool of worker homes, {@code --parallel} at a time, and
     * with {@code --baseline} the baseline fights the same field at the same seed.
     */
    private int runMelee(List<Opponent> opponents) throws Exception {
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
        // A0: --keep-data true fights on whatever the robot's data directory already
        // holds (a warm duel's profiles, say), for a hand-off fixture on a store.
        boolean keepData = Boolean.parseBoolean(opts.getOrDefault("keep-data", "false"));
        requireSerialKeepData(keepData, parallel);
        MeleeReport.Battle[] cand = new MeleeReport.Battle[runs];
        MeleeReport.Battle[] base = baselineJar != null ? new MeleeReport.Battle[runs] : null;
        List<String> baseNames = base == null ? null : withFirst(names, baselineRobot);
        List<Job> jobs = new ArrayList<>();
        for (int i = 1; i <= runs; i++) {
            int seed = i;
            jobs.add(h -> {
                Tried<MeleeReport.Battle> c = attempts(retries, () -> {
                    if (!keepData) wipeData(h);
                    return meleeBattle(h, seed, "melee-" + seed, robot, names, sentries, sentryBorder, true);
                }, b -> b.ok);
                cand[seed - 1] = c.value();
                note("melee field", "melee seed " + seed, c.attempts(), c.value().ok, "no result");
                if (base != null) {
                    Tried<MeleeReport.Battle> t = attempts(retries, () -> {
                        if (!keepData) wipeData(h);
                        return meleeBattle(h, seed, "melee-" + seed + "-baseline", baselineRobot,
                            baseNames, sentries, sentryBorder, false);
                    }, b -> b.ok);
                    base[seed - 1] = t.value();
                    note("melee field (baseline)", "melee seed " + seed + " baseline", t.attempts(), t.value().ok, "no result");
                }
            });
        }
        List<Path> homes = workerHomes(Math.min(parallel, Math.max(1, jobs.size())));
        workers = homes.size();
        pinCpuConstant(homes);
        runJobs(jobs, homes);

        List<MeleeReport.Battle> battles = Arrays.asList(cand);
        List<MeleeReport.Battle> baseBattles = base == null ? null : Arrays.asList(base);
        String host = hostLine(reportedCpuConstant(), Host.describe(), homes.size(), childFlags());
        String label = opts.get("label");
        String r = MeleeReport.render(label, robot, others, sentries, battles, rounds,
            width, height, sentryBorder, host);
        if (baseBattles != null) {
            r += MeleeReport.renderPaired(robot, baselineRobot, others, sentries, battles, baseBattles);
            r += "\n" + MeleeReport.render(label, baselineRobot, others, sentries, baseBattles, rounds,
                width, height, sentryBorder, null).replaceFirst("^# ", "## ");
        }
        r += failureFooter(failures, retried);
        r = Exclusions.insertAfterTitle(r, Exclusions.block(outcomes.tallies()));
        Files.writeString(out.resolve("report.md"), r);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, r);
        }
        if (opts.containsKey("per-opponent")) {
            // Issue #102: one report per opponent in this field, for the per-robot bench strategy.
            // A field's label is a subdirectory, so the fields of a suite (an opponent stands in
            // several) do not overwrite one another.
            Path dir = Path.of(opts.get("per-opponent")).toAbsolutePath();
            if (label != null) dir = dir.resolve(label.replaceAll("[^A-Za-z0-9.]+", "_"));
            Files.createDirectories(dir);
            for (Opponent o : opponents) {
                if (sentries.contains(o.name)) continue;
                Files.writeString(dir.resolve(o.slug() + ".md"), MeleeReport.renderOpponent(o.name, label,
                    robot, baselineRobot, battles, baseBattles, rounds, width, height, host));
            }
            System.out.println("per-opponent reports in " + dir);
        }
        System.out.println();
        System.out.println(r);
        boolean failed = battles.stream().anyMatch(b -> !b.ok);
        if (baseBattles != null) failed |= baseBattles.stream().anyMatch(b -> !b.ok);
        return failed ? 1 : 0;
    }

    /** {@code names} with its first entry (Hadur's) replaced by {@code first}: the baseline's field. */
    static List<String> withFirst(List<String> names, String first) {
        List<String> copy = new ArrayList<>(names);
        copy.set(0, first);
        return copy;
    }

    /**
     * {@code --keep-data} makes each melee battle depend on what the one before it left in
     * the data directory, which several worker homes cannot share: refused with {@code --parallel}.
     */
    static void requireSerialKeepData(boolean keepData, int parallel) {
        if (keepData && parallel > 1) {
            throw new IllegalArgumentException(
                "--keep-data needs --parallel 1: each battle builds on the data the one before left in the home");
        }
    }

    /**
     * One melee battle on a worker home: the child JVM, then its directory read back. A battle
     * that throws is recorded as failed so the report still shows it.
     */
    private MeleeReport.Battle meleeBattle(Path h, int seed, String dirName, String robotName,
                                           List<String> names, Set<String> sentries, int sentryBorder,
                                           boolean candidate) throws InterruptedException {
        Path dir = out.resolve("battles").resolve(dirName);
        try {
            Files.createDirectories(dir);
            Files.deleteIfExists(dir.resolve("melee.csv"));
            if (parallel == 1) System.out.printf("melee battle %d/%d%s ...%n", seed, runs, candidate ? "" : " (baseline)");
            List<String> cmd = new ArrayList<>();
            cmd.add(defaultJavaBin());
            cmd.addAll(JVM_FLAGS);
            cmd.addAll(childFlags());
            cmd.add("-DRANDOMSEED=" + seed);
            cmd.add("-Dhadur.sentries=" + String.join(",", sentries));
            Path transcript = dir.resolve("transcript.txt");
            if (record != null && candidate) {
                // A0: the recorder on the melee path too (STRAND-4).
                cmd.add("-DNOSECURITY=true");
                cmd.add("-Dhadur.record=" + transcript);
            }
            cmd.add("-cp");
            cmd.add(classpath());
            cmd.add(MeleeRunner.class.getName());
            cmd.addAll(List.of(h.toString(), dir.toString(), String.valueOf(rounds),
                String.valueOf(width), String.valueOf(height), String.valueOf(sentryBorder)));
            cmd.addAll(names);
            Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
                .redirectOutput(dir.resolve("engine.log").toFile()).start();
            if (!p.waitFor(90, TimeUnit.MINUTES)) p.destroyForcibly();
            if (record != null && candidate && Files.exists(transcript)) {
                saveFixture(melee(opts.getOrDefault("set", "melee")), seed, transcript);
            }
            MeleeReport.Battle b = MeleeReport.read(seed, dir);
            double[] us = b.ok ? MeleeReport.find(b, robotName) : null;
            if (us == null) {
                say("  melee battle " + seed + "/" + runs + (candidate ? "" : " baseline")
                    + " FAILED; see " + dir.resolve("engine.log"));
            } else {
                say(String.format(Locale.ROOT, "  melee battle %d/%d%s: Hadur placed %.0f, APS %.1f, survival %.1f",
                    seed, runs, candidate ? "" : " baseline", us[1],
                    MeleeReport.aps(b, robotName, sentries), MeleeReport.survival(b)));
            }
            return b;
        } catch (IOException | RuntimeException e) {
            say("  melee battle " + seed + "/" + runs + " FAILED: bench error: " + e);
            return new MeleeReport.Battle(seed, false);
        }
    }

    /**
     * A5: our team against each team of the set in turn, {@code runs} battles each (one
     * RANDOMSEED each), on a wiped data directory; reports by {@link TeamReport}. Issue #102:
     * the (opponent, seed) battles run on worker homes, {@code --parallel} at a time, and
     * with {@code --baseline} the baseline team fights the same opponent at the same seed.
     */
    private int runTeam(List<Opponent> opponents) throws Exception {
        String member = opts.getOrDefault("member", "hadur2.Hadur");
        if (record != null) recorderTeam(member);
        int n = opponents.size();
        TeamReport.Battle[][] cand = new TeamReport.Battle[n][runs];
        TeamReport.Battle[][] base = baselineJar != null ? new TeamReport.Battle[n][runs] : null;
        List<Job> jobs = new ArrayList<>();
        for (int oi = 0; oi < n; oi++) {
            Opponent o = opponents.get(oi);
            for (int i = 1; i <= runs; i++) {
                int index = oi, seed = i;
                jobs.add(h -> {
                    Tried<TeamReport.Battle> c = attempts(retries, () -> {
                        wipeData(h);
                        return teamBattle(h, o, seed, o.slug() + "-" + seed, robot, member, true);
                    }, b -> b.ok);
                    cand[index][seed - 1] = c.value();
                    note(o.name, o.name + " team seed " + seed, c.attempts(), c.value().ok, "no result");
                    if (base != null) {
                        Tried<TeamReport.Battle> t = attempts(retries, () -> {
                            wipeData(h);
                            return teamBattle(h, o, seed, o.slug() + "-" + seed + "-baseline",
                                baselineRobot, member, false);
                        }, b -> b.ok);
                        base[index][seed - 1] = t.value();
                        note(o.name + " (baseline)", o.name + " team seed " + seed + " baseline", t.attempts(), t.value().ok, "no result");
                    }
                });
            }
        }
        // The recorder team (if any) is installed in the main home above, before the workers copy it.
        List<Path> homes = workerHomes(Math.min(parallel, Math.max(1, jobs.size())));
        workers = homes.size();
        pinCpuConstant(homes);
        runJobs(jobs, homes);

        Map<Opponent, List<TeamReport.Battle>> results = new LinkedHashMap<>();
        Map<Opponent, List<TeamReport.Battle>> baseResults = base != null ? new LinkedHashMap<>() : null;
        for (int oi = 0; oi < n; oi++) {
            results.put(opponents.get(oi), new ArrayList<>(Arrays.asList(cand[oi])));
            if (baseResults != null) baseResults.put(opponents.get(oi), new ArrayList<>(Arrays.asList(base[oi])));
        }
        String host = hostLine(reportedCpuConstant(), Host.describe(), homes.size(), childFlags());
        String label = opts.get("label");
        String r = TeamReport.render(label, robot, results, rounds, width, height, host);
        if (baseResults != null) {
            r += TeamReport.renderPaired(results, baseResults, robot, baselineRobot);
            r += "\n" + TeamReport.render(label, baselineRobot, baseResults, rounds, width, height)
                .replaceFirst("^# ", "## ");
        }
        r += failureFooter(failures, retried);
        r = Exclusions.insertAfterTitle(r, Exclusions.block(outcomes.tallies()));
        Files.writeString(out.resolve("report.md"), r);
        if (opts.containsKey("report")) {
            Path copy = Path.of(opts.get("report")).toAbsolutePath();
            Files.createDirectories(copy.getParent());
            Files.writeString(copy, r);
        }
        if (opts.containsKey("per-opponent")) {
            // Issue #102: one report per opposing team, for the per-opponent bench strategy.
            Path dir = Path.of(opts.get("per-opponent")).toAbsolutePath();
            Files.createDirectories(dir);
            for (Opponent o : opponents) {
                Files.writeString(dir.resolve(o.slug() + ".md"), TeamReport.renderOpponent(o, label,
                    results.get(o), baseResults == null ? null : baseResults.get(o), robot, baselineRobot,
                    rounds, width, height, host));
            }
            System.out.println("per-opponent reports in " + dir);
        }
        System.out.println();
        System.out.println(r);
        boolean failed = results.values().stream().flatMap(List::stream).anyMatch(b -> !b.ok);
        if (baseResults != null) failed |= baseResults.values().stream().flatMap(List::stream).anyMatch(b -> !b.ok);
        return failed ? 1 : 0;
    }

    /**
     * One team battle on a worker home: {@code teamRobot} (ours or the baseline) against
     * {@code o}, read back by {@link TeamReport}. A battle that throws is recorded as failed.
     */
    private TeamReport.Battle teamBattle(Path h, Opponent o, int seed, String dirName, String teamRobot,
                                         String member, boolean candidate) throws InterruptedException {
        Path dir = out.resolve("battles").resolve(dirName);
        try {
            Files.createDirectories(dir);
            Files.deleteIfExists(dir.resolve("team.csv"));
            if (parallel == 1) System.out.printf("%s team battle %d/%d%s ...%n", o.name, seed, runs,
                candidate ? "" : " (baseline)");
            List<String> cmd = new ArrayList<>();
            cmd.add(defaultJavaBin());
            cmd.addAll(JVM_FLAGS);
            cmd.addAll(childFlags());
            cmd.add("-DRANDOMSEED=" + seed);
            Path transcript = dir.resolve("transcript.txt");
            boolean recording = record != null && candidate;
            if (recording) {
                // STRAND-5: each member writes transcript-member-N.txt beside it.
                cmd.add("-DNOSECURITY=true");
                cmd.add("-Dhadur.record=" + transcript);
            }
            cmd.add("-cp");
            cmd.add(classpath());
            cmd.add(TeamRunner.class.getName());
            cmd.addAll(List.of(h.toString(), dir.toString(), String.valueOf(rounds),
                String.valueOf(width), String.valueOf(height), member, teamRobot, o.name));
            Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
                .redirectOutput(dir.resolve("engine.log").toFile()).start();
            if (!p.waitFor(60, TimeUnit.MINUTES)) p.destroyForcibly();
            if (recording) {
                try (Stream<Path> members = Files.list(dir)) {
                    for (Path t : (Iterable<Path>) members.sorted()::iterator) {
                        String n = t.getFileName().toString();
                        if (!n.startsWith("transcript-member-")) continue;
                        String m = n.substring("transcript-member-".length(), n.length() - ".txt".length());
                        saveFixture("team-" + o.slug() + "-m" + m, seed, t);
                    }
                }
            }
            TeamReport.Battle b = TeamReport.read(dir, teamRobot, member, dataFiles(h));
            say("  " + o.name + " team battle " + seed + "/" + runs + (candidate ? "" : " baseline") + ": "
                + (b.ok ? b.summary() : "FAILED; see " + dir.resolve("engine.log")));
            return b;
        } catch (IOException | RuntimeException e) {
            say("  " + o.name + " team battle " + seed + "/" + runs + " FAILED: bench error: " + e);
            return new TeamReport.Battle();
        }
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
    private static List<String> dataFiles(Path h) throws IOException {
        Path data = h.resolve("robots/.data");
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
        writeCpuConstant(home, nanos);
    }

    private static void writeCpuConstant(Path h, long nanos) throws IOException {
        Path props = h.resolve("config/robocode.properties");
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
            Path jar = Path.of(opts.getOrDefault("robot-jar", RobotJar.soloJar(release))).toAbsolutePath();
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
        return storedProfile(home, opponent);
    }

    private static OpponentProfile storedProfile(Path h, String opponent) throws IOException {
        Path data = h.resolve("robots/.data");
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
        wipeData(home);
    }

    private static void wipeData(Path h) throws IOException {
        Path data = h.resolve("robots/.data");
        if (!Files.exists(data)) return;
        try (Stream<Path> files = Files.walk(data)) {
            for (Path f : (Iterable<Path>) files.sorted(Comparator.reverseOrder())::iterator) {
                Files.delete(f);
            }
        }
    }

    /**
     * The CPU constant line the report names: the pinned value when {@code --cpu-constant}
     * gave one (with several workers the main home never holds it, so reading the home would
     * say "unknown"), else what the main home's properties file holds.
     */
    private String reportedCpuConstant() {
        return cpuConstantLine(opts.get("cpu-constant"), cpuConstant());
    }

    static String cpuConstantLine(String pinned, String fromHome) {
        if (pinned == null || pinned.isBlank()) return fromHome;
        return "robocode.cpu.constant=" + pinned.trim() + " (pinned with --cpu-constant)";
    }

    /**
     * The conditions paragraph of a melee or team report: the CPU constant, the host
     * ({@link Host#describe()}), the number of worker homes and the child JVM flags, if any
     * (issue #102: a report that does not say so cannot be compared with another host's).
     */
    static String hostLine(String cpuConstant, String host, int workers, List<String> childFlags) {
        String line = cpuConstant + ". Host: " + host + ", parallel " + workers;
        if (!childFlags.isEmpty()) line += ". Battle JVM flags: " + String.join(" ", childFlags);
        return line + ".";
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
