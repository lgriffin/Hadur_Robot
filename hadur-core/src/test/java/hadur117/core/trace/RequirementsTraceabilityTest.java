package hadur117.core.trace;

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
 * Keeps the requirements (docs/requirements/, one file per area) and the tests in step. Every active requirement must be named
 * by at least one test: an {@code @Tag("ID")} on a JUnit or jqwik test, an {@code @ID} tag
 * on a Cucumber scenario, or a comment {@code @Tag("ID")} in a bench tool's Python test
 * ({@code hadur-bench/tools/test_*.py}, {@code data/tools/test_*.py}), where it names the
 * bench gate that tool's evaluator reads. A tag that names no requirement fails too, so IDs
 * can't drift, and no ID may open two rows or be both active and retired.
 *
 * <p>Every module of the build is scanned, found from the root pom's folder. Stages no
 * longer gate the check: every plan has shipped, so every active row is due.</p>
 *
 * <p>Writes the coverage table to {@code target/requirements-coverage.md}.</p>
 */
class RequirementsTraceabilityTest {

    /** Any table row that opens with a requirement ID; group 2 is its last cell. */
    static final Pattern ROW = Pattern.compile("^\\|\\s*([A-Z]+-\\d+)\\s*\\|.*\\|\\s*([^|]*?)\\s*\\|\\s*$");
    /** The retired table's file in docs/requirements/; every other .md there but README is an area. */
    static final String RETIRED_FILE = "retired.md";
    static final Pattern JAVA_TAG = Pattern.compile("@Tag\\(\"([A-Z]+-\\d+)\"\\)");
    // Split so this file's own source doesn't match them.
    static final String JQWIK_PROPERTY = "import net.jqwik.api." + "Property;";
    static final String JUNIT_TAG = "import org.junit.jupiter.api." + "Tag;";
    static final Pattern FEATURE_TAG = Pattern.compile("@([A-Z]+-\\d+)\\b");

    static Path root;
    static Map<String, String> requirements;
    /** Every ID in the retired table. */
    static Set<String> retired;
    /** Every ID that opens more than one row, active or retired. */
    static Set<String> repeated;
    static Map<String, Set<String>> coverage;
    /** jqwik test files that tag with JUnit's {@code @Tag}, which makes jqwik skip them. */
    static List<String> junitTaggedProperties;

    @BeforeAll
    static void scan() throws IOException {
        root = findRoot();
        requirements = readRequirements(root.resolve("docs/requirements"));
        coverage = new TreeMap<>();
        junitTaggedProperties = new ArrayList<>();
        for (Path module : modules(root)) {
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
        for (Path tools : List.of(root.resolve("hadur-bench/tools"), root.resolve("data/tools"))) {
            if (!Files.isDirectory(tools)) continue;
            try (Stream<Path> files = Files.list(tools)) {
                for (Path f : (Iterable<Path>) files::iterator) {
                    String name = f.getFileName().toString();
                    if (name.startsWith("test_") && name.endsWith(".py")) collect(f, JAVA_TAG);
                }
            }
        }
        writeReport();
    }

    @Test
    @DisplayName("every active requirement is covered by a test")
    void everyRequirementIsCovered() {
        List<String> missing = new ArrayList<>();
        requirements.keySet().forEach(id -> {
            if (!coverage.containsKey(id)) missing.add(id);
        });
        assertTrue(missing.isEmpty(), "No test names " + missing);
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

    @Test
    @DisplayName("no ID opens two rows, active or retired")
    void noIdTwice() {
        assertTrue(repeated.isEmpty(), "IDs on more than one row: " + repeated);
    }

    @Test
    @DisplayName("no ID is both active and retired")
    void noIdActiveAndRetired() {
        Set<String> both = new TreeSet<>(retired);
        both.retainAll(requirements.keySet());
        assertTrue(both.isEmpty(), "IDs both active and retired: " + both);
    }

    @Test
    @DisplayName("every module of the build is scanned for tags")
    void everyModuleScanned() throws IOException {
        List<String> names = modules(root).stream().map(p -> p.getFileName().toString()).toList();
        for (String m : List.of("hadur-core", "hadur-robot", "hadur-bench", "saor", "twinsaor", "deise",
                "sanaro", "jaylexi", "eveimear")) {
            assertTrue(names.contains(m), "module " + m + " not found among " + names);
        }
    }

    /**
     * Reads the active rows (ID to last cell) of every area file in {@code dir} and fills
     * {@link #retired} from the retired table and {@link #repeated} over all of them.
     */
    static Map<String, String> readRequirements(Path dir) throws IOException {
        Map<String, String> reqs = new LinkedHashMap<>();
        retired = new TreeSet<>();
        repeated = new TreeSet<>();
        Set<String> seen = new TreeSet<>();
        List<Path> files;
        try (Stream<Path> s = Files.list(dir)) {
            files = s.filter(f -> f.toString().endsWith(".md") && !f.getFileName().toString().equals("README.md"))
                .sorted().toList();
        }
        for (Path file : files) {
            boolean isRetired = file.getFileName().toString().equals(RETIRED_FILE);
            for (String line : Files.readAllLines(file)) {
                Matcher m = ROW.matcher(line);
                if (!m.matches()) continue;
                String id = m.group(1);
                if (!seen.add(id)) repeated.add(id);
                if (isRetired) retired.add(id);
                else reqs.put(id, m.group(2));
            }
        }
        return reqs;
    }

    /** Every module of the build: a folder beside the root pom holding a pom of its own. */
    static List<Path> modules(Path root) throws IOException {
        try (Stream<Path> dirs = Files.list(root)) {
            return dirs.filter(d -> Files.isRegularFile(d.resolve("pom.xml"))).sorted().toList();
        }
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
        StringBuilder b = new StringBuilder("# Requirement coverage\n\n| ID | Covered by |\n|---|---|\n");
        int covered = 0;
        for (String id : requirements.keySet()) {
            Set<String> by = coverage.get(id);
            if (by != null) covered++;
            b.append("| ").append(id).append(" | ")
                .append(by == null ? "**missing**" : String.join("<br>", by)).append(" |\n");
        }
        b.append("\n").append(covered).append(" of ").append(requirements.size())
            .append(" active requirements are covered.\n");
        Path out = Path.of("target/requirements-coverage.md");
        Files.createDirectories(out.getParent());
        Files.writeString(out, b);
        System.out.println(covered + " of " + requirements.size()
            + " active requirements are covered; see " + out.toAbsolutePath());
    }

    static Path findRoot() {
        String prop = System.getProperty("hadur.root");
        if (prop != null && Files.isDirectory(Path.of(prop, "docs/requirements"))) {
            return Path.of(prop).toAbsolutePath();
        }
        for (Path p = Path.of("").toAbsolutePath(); p != null; p = p.getParent()) {
            if (Files.isDirectory(p.resolve("docs/requirements"))) return p;
        }
        throw new IllegalStateException("docs/requirements/ not found; set hadur.root");
    }
}
