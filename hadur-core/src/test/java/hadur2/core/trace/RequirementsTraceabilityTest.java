package hadur2.core.trace;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Keeps docs/requirements.md and the tests in step. Every requirement whose stage is at
 * or before the build's stage ({@code hadur.stage}, set in the root pom) must be named by
 * at least one test: an {@code @Tag("ID")} on a JUnit or jqwik test, or an {@code @ID} tag
 * on a Cucumber scenario. A tag that names no requirement fails too, so IDs can't drift.
 * The duel plan's stages S0-S7 are compared with {@code hadur.stage}, the melee
 * extension's M0-M6 with {@code hadur.melee.stage}, the RoboRumble climb plan's R0-R5
 * with {@code hadur.climb.stage}, and the architecture evolution's A0-A5 with
 * {@code hadur.arch.stage}, all set in the root pom.
 *
 * <p>Writes the coverage table to {@code target/requirements-coverage.md}.</p>
 */
class RequirementsTraceabilityTest {

    static final Pattern ROW = Pattern.compile(
        "^\\|\\s*([A-Z]+-\\d+)\\s*\\|[^|]*\\|[^|]*\\|\\s*([SMRA]\\d)\\s*\\|\\s*$");
    static final Pattern JAVA_TAG = Pattern.compile("@Tag\\(\"([A-Z]+-\\d+)\"\\)");
    // Split so this file's own source doesn't match them.
    static final String JQWIK_PROPERTY = "import net.jqwik.api." + "Property;";
    static final String JUNIT_TAG = "import org.junit.jupiter.api." + "Tag;";
    static final Pattern FEATURE_TAG = Pattern.compile("@([A-Z]+-\\d+)\\b");

    static Path root;
    static String stage;
    static String meleeStage;
    static String climbStage;
    static String archStage;
    static Map<String, String> requirements;
    static Map<String, Set<String>> coverage;
    /** jqwik test files that tag with JUnit's {@code @Tag}, which makes jqwik skip them. */
    static List<String> junitTaggedProperties;

    @BeforeAll
    static void scan() throws IOException {
        root = findRoot();
        stage = System.getProperty("hadur.stage", "S1");
        meleeStage = System.getProperty("hadur.melee.stage", "M0");
        climbStage = System.getProperty("hadur.climb.stage", "R0");
        archStage = System.getProperty("hadur.arch.stage", "A0");
        requirements = readRequirements(root.resolve("docs/requirements.md"));
        coverage = new TreeMap<>();
        junitTaggedProperties = new ArrayList<>();
        for (Path module : List.of(root.resolve("hadur-core"), root.resolve("hadur-robot"),
                root.resolve("hadur-bench"))) {
            Path tests = module.resolve("src/test");
            if (!Files.isDirectory(tests)) continue;
            try (Stream<Path> files = Files.walk(tests)) {
                for (Path f : (Iterable<Path>) files::iterator) {
                    String name = f.getFileName().toString();
                    if (name.endsWith(".java")) {
                        collect(f, JAVA_TAG);
                        String src = read(f);
                        if (src.contains(JQWIK_PROPERTY) && src.contains(JUNIT_TAG)) {
                            junitTaggedProperties.add(root.relativize(f).toString());
                        }
                    }
                    else if (name.endsWith(".feature")) collectFeature(f);
                }
            }
        }
        writeReport();
    }

    @Test
    @DisplayName("every requirement up to this stage is covered by a test")
    void everyRequirementUpToStageIsCovered() {
        List<String> missing = new ArrayList<>();
        requirements.forEach((id, s) -> {
            if (due(s) && !coverage.containsKey(id)) missing.add(id + " (" + s + ")");
        });
        assertTrue(missing.isEmpty(), "No test names " + missing + "; stages are " + stage
            + ", " + meleeStage + ", " + climbStage + " and " + archStage);
    }

    @Test
    @DisplayName("every tag names a real requirement")
    void everyTagIsARequirement() {
        Set<String> unknown = new TreeSet<>(coverage.keySet());
        unknown.removeAll(requirements.keySet());
        assertTrue(unknown.isEmpty(), "Tags with no requirement: " + unknown + " in "
            + unknown.stream().map(coverage::get).toList());
    }

    @Test
    @DisplayName("jqwik tests tag with jqwik's @Tag, so the tagged tests actually run")
    void jqwikTestsUseJqwikTags() {
        // jqwik skips a @Property carrying JUnit's @Tag instead of failing it, and this
        // check reads tags from source, so such a test would count as coverage unrun.
        assertTrue(junitTaggedProperties.isEmpty(),
            "Use net.jqwik.api.Tag in " + junitTaggedProperties);
    }

    @Test
    @DisplayName("the requirements file parses")
    void requirementsParse() {
        assertTrue(requirements.size() >= 28, "found only " + requirements.keySet());
    }

    /** Whether a requirement of stage {@code s} is due at this build's stages. */
    static boolean due(String s) {
        char plan = s.charAt(0);
        return atOrBefore(s, plan == 'M' ? meleeStage : plan == 'R' ? climbStage
            : plan == 'A' ? archStage : stage);
    }

    static boolean atOrBefore(String s, String stage) {
        return s.charAt(0) == stage.charAt(0)
            && Integer.parseInt(s.substring(1)) <= Integer.parseInt(stage.substring(1));
    }

    static Map<String, String> readRequirements(Path file) throws IOException {
        Map<String, String> reqs = new LinkedHashMap<>();
        for (String line : Files.readAllLines(file)) {
            Matcher m = ROW.matcher(line);
            if (m.matches()) reqs.put(m.group(1), m.group(2));
        }
        return reqs;
    }

    static void collect(Path f, Pattern p) {
        Matcher m = p.matcher(read(f));
        while (m.find()) add(m.group(1), f);
    }

    static void collectFeature(Path f) {
        for (String line : read(f).split("\\R")) {
            if (!line.trim().startsWith("@")) continue;
            Matcher m = FEATURE_TAG.matcher(line);
            while (m.find()) add(m.group(1), f);
        }
    }

    static void add(String id, Path f) {
        coverage.computeIfAbsent(id, k -> new TreeSet<>())
            .add(root.relativize(f).toString().replace('\\', '/'));
    }

    static String read(Path f) {
        try {
            return Files.readString(f);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    static void writeReport() throws IOException {
        StringBuilder b = new StringBuilder("# Requirement coverage at stages ").append(stage)
            .append(", ").append(meleeStage).append(", ").append(climbStage)
            .append(" and ").append(archStage).append("\n\n| ID | Stage | Covered by |\n|---|---|---|\n");
        int due = 0, covered = 0;
        for (Map.Entry<String, String> e : requirements.entrySet()) {
            Set<String> by = coverage.get(e.getKey());
            boolean isDue = due(e.getValue());
            if (isDue) {
                due++;
                if (by != null) covered++;
            }
            b.append("| ").append(e.getKey()).append(" | ").append(e.getValue()).append(" | ")
                .append(by == null ? (isDue ? "**missing**" : "later stage") : String.join("<br>", by))
                .append(" |\n");
        }
        b.append("\n").append(covered).append(" of ").append(due)
            .append(" requirements due by ").append(stage).append(", ").append(meleeStage)
            .append(", ").append(climbStage).append(" and ").append(archStage).append(" are covered.\n");
        Path out = Path.of("target/requirements-coverage.md");
        Files.createDirectories(out.getParent());
        Files.writeString(out, b);
        System.out.println(covered + " of " + due + " requirements due by " + stage + ", " + meleeStage
            + ", " + climbStage + " and " + archStage + " are covered; see " + out.toAbsolutePath());
    }

    static Path findRoot() {
        String prop = System.getProperty("hadur.root");
        if (prop != null && Files.exists(Path.of(prop, "docs/requirements.md"))) {
            return Path.of(prop).toAbsolutePath();
        }
        for (Path p = Path.of("").toAbsolutePath(); p != null; p = p.getParent()) {
            if (Files.exists(p.resolve("docs/requirements.md"))) return p;
        }
        throw new IllegalStateException("docs/requirements.md not found; set hadur.root");
    }
}
