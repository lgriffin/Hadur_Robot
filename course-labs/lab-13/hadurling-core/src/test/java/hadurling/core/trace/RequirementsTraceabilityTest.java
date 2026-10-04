package hadurling.core.trace;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
 * Keeps docs/requirements.md and the tests in step. Every requirement in the table must be
 * named by at least one test: a tag on a JUnit or jqwik test, or a {@code @HL-n} tag on a
 * Cucumber scenario. A tag that names no requirement fails too, so IDs cannot drift.
 *
 * <p>It works on text, not on running tests: it reads the table, then scans the test sources
 * of every module with a regular expression. That is crude and fast, and enough, because
 * the IDs are written to be found. It also writes the coverage table to
 * {@code target/requirements-coverage.md}.</p>
 */
class RequirementsTraceabilityTest {

    /** A table row: | HL-3 | pattern | text |. */
    static final Pattern ROW = Pattern.compile("^\\|\\s*(HL-\\d+)\\s*\\|([^|]*)\\|(.*)\\|\\s*$");
    /** A JUnit or jqwik tag in Java source. */
    static final Pattern JAVA_TAG = Pattern.compile("@Tag\\(\"(HL-\\d+)\"\\)");
    /** A Cucumber tag on a feature line. */
    static final Pattern FEATURE_TAG = Pattern.compile("@(HL-\\d+)\\b");
    // Split so this file's own source cannot match them.
    static final String JQWIK_PROPERTY = "import net.jqwik.api." + "Property;";
    static final String JUNIT_TAG = "import org.junit.jupiter.api." + "Tag;";

    static Path root;
    static Map<String, String> requirements;
    /** Requirement ID to the files whose tests name it. */
    static Map<String, Set<String>> coverage;
    /** jqwik test files that use JUnit's Tag, which makes jqwik skip them silently. */
    static List<String> junitTaggedProperties;

    @BeforeAll
    static void scan() throws IOException {
        root = findRoot();
        requirements = readRequirements(root.resolve("docs/requirements.md"));
        coverage = new TreeMap<>();
        junitTaggedProperties = new ArrayList<>();
        for (String module : List.of("hadurling-core", "hadurling-robot", "hadurling-bench")) {
            Path tests = root.resolve(module).resolve("src/test");
            if (!Files.isDirectory(tests)) continue;
            try (Stream<Path> files = Files.walk(tests)) {
                for (Path f : (Iterable<Path>) files::iterator) {
                    String name = f.getFileName().toString();
                    if (name.endsWith(".java") && !name.equals("RequirementsTraceabilityTest.java")) {
                        collect(f, JAVA_TAG);
                        String src = read(f);
                        if (src.contains(JQWIK_PROPERTY) && src.contains(JUNIT_TAG)) {
                            junitTaggedProperties.add(root.relativize(f).toString());
                        }
                    } else if (name.endsWith(".feature")) {
                        collectFeature(f);
                    }
                }
            }
        }
        writeReport();
    }

    @Test
    @DisplayName("every requirement is covered by a test")
    void everyRequirementIsCovered() {
        Set<String> missing = new TreeSet<>(requirements.keySet());
        missing.removeAll(coverage.keySet());
        assertTrue(missing.isEmpty(), "No test names " + missing);
    }

    @Test
    @DisplayName("every tag names a real requirement")
    void everyTagIsARequirement() {
        Set<String> unknown = new TreeSet<>(coverage.keySet());
        unknown.removeAll(requirements.keySet());
        assertTrue(unknown.isEmpty(), "Tags with no requirement: " + unknown + " in "
            + unknown.stream().map(coverage::get).collect(java.util.stream.Collectors.toList()));
    }

    @Test
    @DisplayName("jqwik tests tag with jqwik's Tag, so the tagged tests actually run")
    void jqwikTestsUseJqwikTags() {
        // jqwik skips a property carrying JUnit's Tag instead of failing it, and this test
        // reads tags from source, so such a property would count as covered but never run.
        assertTrue(junitTaggedProperties.isEmpty(), "Use net.jqwik.api.Tag in " + junitTaggedProperties);
    }

    @Test
    @DisplayName("the requirements file parses, with no ID twice")
    void requirementsParse() throws IOException {
        long rows = Files.readAllLines(root.resolve("docs/requirements.md")).stream()
            .filter(l -> ROW.matcher(l).matches()).count();
        assertEquals(rows, requirements.size(), "an ID appears twice");
        assertTrue(requirements.size() >= 8, "found only " + requirements.keySet());
    }

    /** The folder holding docs/requirements.md, found by walking up from where the tests run. */
    static Path findRoot() {
        Path dir = Path.of("").toAbsolutePath();
        while (dir != null && !Files.exists(dir.resolve("docs/requirements.md"))) dir = dir.getParent();
        if (dir == null) throw new IllegalStateException("docs/requirements.md not found above the working directory");
        return dir;
    }

    static Map<String, String> readRequirements(Path file) throws IOException {
        Map<String, String> reqs = new LinkedHashMap<>();
        for (String line : Files.readAllLines(file)) {
            Matcher m = ROW.matcher(line);
            if (m.matches()) reqs.put(m.group(1), m.group(3).trim());
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
        coverage.computeIfAbsent(id, k -> new TreeSet<>()).add(f.getFileName().toString());
    }

    static String read(Path f) {
        try {
            return Files.readString(f);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    static void writeReport() throws IOException {
        StringBuilder b = new StringBuilder("| ID | Covered by |\n|---|---|\n");
        requirements.keySet().forEach(id -> b.append("| ").append(id).append(" | ")
            .append(coverage.getOrDefault(id, Set.of()).isEmpty() ? "**nothing**" : String.join(", ", coverage.get(id)))
            .append(" |\n"));
        Path out = Path.of("target/requirements-coverage.md");
        Files.createDirectories(out.getParent());
        Files.writeString(out, b.toString());
    }
}
