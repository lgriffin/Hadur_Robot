package hadur.bench;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

/**
 * BENCH-11: the shield probe. {@code --shield-probe FILE} names a set of opponents (the usual
 * set format, {@code name | role | jar | weight}) to run with Hadur's shield mode on and off
 * over the same seeds, and report the paired difference for each.
 *
 * <p>Shield mode is switched by the list in the robot jar, the class {@code hadur2.ShieldListData}
 * (SHIELD-5; a class because Robocode's sandbox denies a robot the read of a resource in its own
 * jar). The probe repacks the candidate jar twice: once with that class naming every
 * opponent of the set ("on") and once with a list of comments only ("off"); it writes the
 * class's source and compiles it with the JDK's compiler. The two get
 * distinct robot versions ({@code <version>-on}, {@code <version>-off}) in their
 * {@code Hadur.properties}, so Robocode installs them side by side, and then the existing
 * paired machinery runs them: the "on" jar as the candidate, the "off" jar as the baseline
 * ({@code --baseline}, BENCH-2), one battle each per seed at the same {@code RANDOMSEED}.
 * The two jars are otherwise the same bytes, so the difference is shield mode and nothing else.</p>
 *
 * <p>{@link #prepare} rewrites the options and makes the jars; {@link #render} writes the
 * report section: per opponent the paired difference with its interval, a verdict, what shield
 * mode did in the "on" battles (read from the {@code SH} and {@code SR} records in their
 * {@code hadur.log}), the panel's weighted mean difference, and the opponents that beat the
 * list's bar, ready to paste into the shield list.</p>
 */
final class ShieldProbe {

    /** The class in the robot jar that holds the shield list. */
    static final String LIST_ENTRY = "hadur2/ShieldListData.class";
    /** The robot's Robocode properties, where its version string lives. */
    static final String PROPERTIES_ENTRY = "hadur2/Hadur.properties";

    private ShieldProbe() {
    }

    /**
     * Turns {@code --shield-probe FILE} into a paired run: the set is the probe's file, the
     * candidate is the "on" jar and the baseline is the "off" jar. Does nothing when the option
     * is absent. Must run before the options are read.
     *
     * @param opts the options; {@code robot}, {@code robot-jar}, {@code set}, {@code baseline},
     *     {@code baseline-robot} and {@code out} are filled in
     * @param benchDir the bench's working directory, where relative paths start
     * @throws IOException if the jar cannot be read or the new ones written
     */
    static void prepare(Map<String, String> opts, Path benchDir) throws IOException {
        String probe = opts.get("shield-probe");
        if (probe == null) return;
        if (opts.containsKey("baseline") || opts.containsKey("baseline-robot")) {
            throw new IllegalArgumentException("--shield-probe makes its own baseline; drop --baseline");
        }
        if (opts.containsKey("robot-classes") || opts.containsKey("melee") || opts.containsKey("team")
                || opts.containsKey("session") || opts.containsKey("client") || opts.containsKey("record")) {
            throw new IllegalArgumentException(
                "--shield-probe runs the duel set with a robot jar; it takes no --robot-classes, --melee,"
                + " --team, --session, --client or --record");
        }
        String robot = opts.getOrDefault("robot", "hadur2.Hadur 3.8");
        String[] parts = robot.split(" ");
        if (parts.length != 2) throw new IllegalArgumentException("--robot must be 'name version': " + robot);
        Path source = benchDir.resolve(opts.getOrDefault("robot-jar",
            "../hadur-robot/target/hadur2.Hadur_" + parts[1] + ".jar")).toAbsolutePath();
        if (!Files.isRegularFile(source)) {
            throw new IllegalStateException("No robot jar at " + source + "; run mvn package first");
        }
        Path set = benchDir.resolve(probe);
        List<Opponent> opponents = Opponent.load(set);
        if (opponents.isEmpty()) throw new IllegalArgumentException("No opponents in " + set);
        String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        Path out = benchDir.resolve(opts.getOrDefault("out", "work/shield-probe-" + stamp)).toAbsolutePath();
        Path dir = out.resolve("shield-probe");
        Files.createDirectories(dir);
        String onVersion = parts[1] + "-on";
        String offVersion = parts[1] + "-off";
        Path on = dir.resolve(parts[0] + "_" + onVersion + ".jar");
        Path off = dir.resolve(parts[0] + "_" + offVersion + ".jar");
        repack(source, on, onVersion, listFor(opponents));
        repack(source, off, offVersion, emptyList());
        opts.put("set", probe);
        opts.put("out", out.toString());
        opts.put("robot", parts[0] + " " + onVersion);
        opts.put("robot-jar", on.toString());
        opts.put("baseline", off.toString());
        opts.put("baseline-robot", parts[0] + " " + offVersion);
    }

    /** The "on" list: every opponent of the set, as the set names it (SHIELD-5 matches name and version). */
    static String listFor(List<Opponent> opponents) {
        StringBuilder b = new StringBuilder("# Written by the bench's shield probe (BENCH-11): every opponent of the set.\n");
        for (Opponent o : opponents) b.append(o.name).append('\n');
        return b.toString();
    }

    /** The "off" list: a comment and nobody, so shield mode never starts. */
    static String emptyList() {
        return "# Written by the bench's shield probe (BENCH-11): nobody, shield mode off.\n";
    }

    /**
     * Copies {@code source} to {@code target} with its shield list replaced and its robot
     * version set. Every other entry is copied unchanged.
     *
     * @param source the candidate jar
     * @param target the jar to write
     * @param version the robot version string to put in {@link #PROPERTIES_ENTRY}
     * @param list the list's text, one entry per line, compiled into {@link #LIST_ENTRY}
     * @throws IOException if reading or writing fails
     * @throws IllegalStateException if the source has no shield list class or no properties entry, so
     *     it predates shield mode (a repack would then change nothing)
     */
    static void repack(Path source, Path target, String version, String list) throws IOException {
        boolean sawList = false;
        boolean sawProperties = false;
        try (JarFile in = new JarFile(source.toFile());
             JarOutputStream jar = new JarOutputStream(Files.newOutputStream(target))) {
            for (JarEntry e : Collections.list(in.entries())) {
                if (e.isDirectory()) continue;
                byte[] bytes;
                try (InputStream s = in.getInputStream(e)) {
                    bytes = s.readAllBytes();
                }
                if (e.getName().equals(LIST_ENTRY)) {
                    bytes = listClass(list);
                    sawList = true;
                } else if (e.getName().equals(PROPERTIES_ENTRY)) {
                    bytes = withVersion(new String(bytes, StandardCharsets.ISO_8859_1), version)
                        .getBytes(StandardCharsets.ISO_8859_1);
                    sawProperties = true;
                }
                jar.putNextEntry(new JarEntry(e.getName()));
                jar.write(bytes);
                jar.closeEntry();
            }
        }
        if (!sawList || !sawProperties) {
            Files.deleteIfExists(target);
            throw new IllegalStateException(source + " has no " + (sawList ? PROPERTIES_ENTRY : LIST_ENTRY)
                + ": it predates the shield list (SHIELD-5), so the probe would compare a robot with itself");
        }
    }

    /**
     * The compiled {@code hadur2.ShieldListData}: the source in the shape of the robot's own
     * class, with {@code list} one entry per line, compiled with the JDK's compiler.
     *
     * @param list the list's text
     * @return the class file's bytes
     * @throws IOException if the compiler cannot run
     * @throws IllegalStateException if there is no compiler (a JRE) or the text will not compile
     */
    static byte[] listClass(String list) throws IOException {
        javax.tools.JavaCompiler compiler = javax.tools.ToolProvider.getSystemJavaCompiler();
        if (compiler == null) throw new IllegalStateException("No Java compiler: run the bench on a JDK, not a JRE");
        Path dir = Files.createTempDirectory("shield-list");
        try {
            Path src = dir.resolve("hadur2").resolve("ShieldListData.java");
            Files.createDirectories(src.getParent());
            Files.writeString(src, listSource(list), StandardCharsets.UTF_8);
            Path classes = Files.createDirectories(dir.resolve("classes"));
            int rc = compiler.run(null, null, null, "--release", "11", "-d", classes.toString(), src.toString());
            if (rc != 0) throw new IllegalStateException("The shield list does not compile: " + list);
            return Files.readAllBytes(classes.resolve("hadur2").resolve("ShieldListData.class"));
        } finally {
            try (java.util.stream.Stream<Path> walk = Files.walk(dir)) {
                walk.sorted(Comparator.reverseOrder()).forEach(f -> f.toFile().delete());
            }
        }
    }

    /** The Java source of {@code hadur2.ShieldListData} for a list, one string literal per entry (comments and blanks drop out). */
    static String listSource(String list) {
        StringBuilder b = new StringBuilder("package hadur2;\n\nfinal class ShieldListData {\n"
            + "    private ShieldListData() {\n    }\n\n    static String[] lines() {\n        return new String[] {\n");
        for (String line : list.split("\n")) {
            String t = line.trim();
            if (t.isEmpty() || t.startsWith("#")) continue;
            b.append("            \"");
            for (char c : t.toCharArray()) {
                if (c == '"' || c == '\\') b.append('\\').append(c);
                else if (c < 0x20 || c > 0x7e) b.append(String.format("\\u%04x", (int) c));
                else b.append(c);
            }
            b.append("\",\n");
        }
        return b.append("        };\n    }\n}\n").toString();
    }

    /** The properties text with its {@code robot.version} line set to {@code version}. */
    static String withVersion(String properties, String version) {
        StringBuilder b = new StringBuilder();
        boolean replaced = false;
        for (String line : properties.split("\n", -1)) {
            if (line.startsWith("robot.version=")) {
                line = "robot.version=" + version;
                replaced = true;
            }
            b.append(line).append('\n');
        }
        // split(-1) leaves one empty piece after a final newline, so drop the newline it added.
        b.setLength(b.length() - 1);
        if (!replaced) b.append("robot.version=").append(version).append('\n');
        return b.toString();
    }

    /** What shield mode did over an opponent's "on" battles, from their {@code SH} and {@code SR} records. */
    static final class Activity {
        /** Rounds that started in shield mode ({@code SH,...,on}). */
        int roundsOn;
        /** Shield bullets fired, enemy bullets they met, hits taken while it ran, shots at the enemy, damage taken (SR). */
        int shieldShots, intercepts, hitsTaken, attackShots;
        double damageTaken;
        /** Battles in which the budget ended it for the rest of the battle (SHIELD-6). */
        int battlesOff;
        /** Rounds that left shield mode early, by reason. */
        final Map<String, Integer> exits = new TreeMap<>();

        /** Folds in one battle's {@code hadur.log}; a missing log adds nothing. */
        void add(Path hadurLog) throws IOException {
            if (!Files.isRegularFile(hadurLog)) return;
            boolean off = false;
            for (String line : Files.readAllLines(hadurLog, StandardCharsets.UTF_8)) {
                // The harvester prefixes round and turn: "round,turn,record".
                String[] p = line.split(",", 3);
                if (p.length < 3) continue;
                String[] f = p[2].split(",");
                if (f[0].equals("SH") && f.length >= 4) {
                    if (f[3].equals("on")) roundsOn++;
                    else if (f[3].equals("off")) off = true;
                } else if (f[0].equals("SR") && f.length >= 11) {
                    shieldShots += Integer.parseInt(f[3]);
                    intercepts += Integer.parseInt(f[4]);
                    hitsTaken += Integer.parseInt(f[5]);
                    attackShots += Integer.parseInt(f[7]);
                    damageTaken = Double.parseDouble(f[8]);
                    if (!f[10].equals("-") && !f[10].equals("budget")) exits.merge(f[10], 1, Integer::sum);
                }
            }
            if (off) battlesOff++;
        }
    }

    /**
     * The shield probe's report section.
     *
     * @param on the "on" jar's battles per opponent (the candidate)
     * @param off the "off" jar's battles per opponent (the baseline)
     * @param battles the working directory's {@code battles} folder, where the "on" battles'
     *     {@code hadur.log} files are read
     * @param onRobot the candidate robot's name
     * @param offRobot the baseline robot's name
     * @return markdown
     */
    static String render(Map<Opponent, List<BattleResult>> on, Map<Opponent, List<BattleResult>> off,
                         Path battles, String onRobot, String offRobot) {
        StringBuilder b = new StringBuilder();
        b.append("\n## Shield probe (BENCH-11): shield mode on against off\n\n")
         .append("`").append(onRobot).append("` has the shield list name every opponent below; `")
         .append(offRobot).append("` has an empty list. The two jars are the same bytes apart from "
            + "that list and the version string, and each seed is fought by both at the same "
            + "`RANDOMSEED`, so the paired difference is the effect of shield mode. Positive means "
            + "shield mode scores more.\n\n")
         .append("| Opponent | Weight | Shield on | Shield off | Paired diff (pp) | Verdict | Rounds on | Shield shots | Met bullets | Hits taken | Left early | Budget exits |\n")
         .append("|---|---|---|---|---|---|---|---|---|---|---|---|\n");
        List<Stats> diffs = new ArrayList<>();
        List<Double> weights = new ArrayList<>();
        List<Double> equal = new ArrayList<>();
        List<String> wins = new ArrayList<>();
        for (Opponent o : on.keySet()) {
            List<BattleResult> onResults = on.get(o);
            List<BattleResult> offResults = off.getOrDefault(o, List.of());
            Stats diff = Report.pairedDiff(onResults, offResults);
            diffs.add(diff);
            weights.add(o.weight);
            equal.add(1.0);
            Activity a = new Activity();
            for (int i = 1; i <= onResults.size(); i++) {
                try {
                    a.add(battles.resolve(o.slug() + "-" + i).resolve("hadur.log"));
                } catch (IOException | RuntimeException e) {
                    // A log that cannot be read leaves its battle out of the activity columns only.
                }
            }
            String verdict = verdict(diff);
            if (verdict.startsWith("wins")) wins.add(o.name);
            b.append(String.format(Locale.ROOT, "| %s | %s | %s | %s | %s | %s | %d | %d | %d | %d | %s | %d |%n",
                o.name, o.weight > 0 ? String.format(Locale.ROOT, "%.5f", o.weight) : "-",
                Stats.of(Report.shares(onResults)).percent(), Stats.of(Report.shares(offResults)).percent(),
                signed(diff), verdict, a.roundsOn, a.shieldShots, a.intercepts, a.hitsTaken,
                a.exits.isEmpty() ? "-" : a.exits.toString(), a.battlesOff));
        }
        boolean weighted = weights.stream().anyMatch(w -> w != null && w > 0);
        Stats mean = Stats.weighted(diffs, weighted ? weights : equal);
        b.append(String.format(Locale.ROOT, "%n**%s paired difference over the %d opponents (BENCH-1 weights):** %s.%n",
            weighted ? "Weighted mean" : "Mean (the file has no weights, so every opponent counts equally)",
            on.size(), mean.n == 0 ? "n/a" : String.format(Locale.ROOT, "%+.1f%s pp", mean.mean * 100,
                Double.isNaN(mean.halfWidth) ? "" : String.format(Locale.ROOT, " ± %.1f", mean.halfWidth * 100))));
        b.append("\nVerdicts: *wins* when the interval of the paired difference lies above 0, *loses* when it lies "
            + "below, *open* when it spans 0 or there is only one seed. Put an opponent on the list only when "
            + "it wins over enough seeds (twenty resolve a paired difference to about ±2.7 points).\n");
        if (wins.isEmpty()) {
            b.append("\nNo opponent wins on this run.\n");
        } else {
            b.append("\nOpponents shield mode wins against, as entries for `ShieldListData.lines()` (`hadur-robot/src/main/java/hadur2/ShieldListData.java`):\n\n```\n");
            for (String name : wins) b.append(name).append('\n');
            b.append("```\n");
        }
        return b.toString();
    }

    /** *wins*, *loses* or *open*, by whether the paired difference's interval clears 0. */
    static String verdict(Stats diff) {
        if (diff.n == 0) return "n/a";
        if (Double.isNaN(diff.halfWidth)) return "open";
        if (diff.mean - diff.halfWidth > 0) return "wins";
        if (diff.mean + diff.halfWidth < 0) return "loses";
        return "open";
    }

    private static String signed(Stats diff) {
        if (diff.n == 0) return "n/a";
        return String.format(Locale.ROOT, "%+.1f%s", diff.mean * 100,
            Double.isNaN(diff.halfWidth) ? "" : String.format(Locale.ROOT, " ± %.1f", diff.halfWidth * 100));
    }
}
