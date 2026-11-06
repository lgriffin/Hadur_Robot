package hadur117.core.trace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * STRAND-6: a failed card's switch leaves the robot with its requirement (failed
 * experiment code is not kept in the robot). Every constant a retired requirement names in
 * backticks (`X`, or `Owner.X` to tie it to one source file) must no longer be declared
 * {@code static final} in the robot's main sources, unless a live requirement still names it.
 */
class RetiredSwitchTest {

    static final Pattern ROW = Pattern.compile("^\\|\\s*([A-Z]+-\\d+)\\s*\\|");
    static final Pattern NAME = Pattern.compile("`(?:([A-Za-z]+)\\.)?([A-Z][A-Z0-9_]{2,})`");
    static final List<String> MAIN = List.of("hadur-core/src/main/java", "hadur-robot/src/main/java");

    @Test
    @Tag("STRAND-6")
    @DisplayName("STRAND-6: no constant of a retired requirement is still declared in the robot")
    void retiredSwitchesAreGone() {
        Path root = root();
        Map<String, Set<String>> retired = retired(read(root.resolve("docs/requirements.md")));
        List<String> left = new ArrayList<>();
        for (String dir : MAIN) {
            Path d = root.resolve(dir);
            if (!Files.isDirectory(d)) continue;
            try (Stream<Path> files = Files.walk(d)) {
                files.filter(p -> p.toString().endsWith(".java")).forEach(p -> {
                    String file = p.getFileName().toString().replace(".java", "");
                    String src = String.join("\n", read(p));
                    retired.forEach((n, owners) -> {
                        if ((owners.contains("") || owners.contains(file)) && declares(src, n)) {
                            left.add(n + " in " + root.relativize(p));
                        }
                    });
                });
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        assertTrue(left.isEmpty(), "Retired requirements' switches still in the robot (remove the switch, its"
            + " code, arm and tests with the requirement): " + left);
    }

    @Test
    @Tag("STRAND-6")
    @DisplayName("STRAND-6: any modifier order or line break still counts as a declaration")
    void declarationForms() {
        assertTrue(declares("static final boolean THREE_RING = false;", "THREE_RING"));
        assertTrue(declares("final static boolean THREE_RING = false;", "THREE_RING"));
        assertTrue(declares("private static final double\n        CLOSEST_FACTOR_SOLO = 2;", "CLOSEST_FACTOR_SOLO"));
        assertTrue(!declares("static final boolean THREE_RINGS = false;", "THREE_RING"));
        assertTrue(!declares("int x = THREE_RING ? 1 : 0;", "THREE_RING"));
    }

    @Test
    @Tag("STRAND-6")
    @DisplayName("STRAND-6: retired names come from any backticked constant; live names and owners win")
    void namesFromRows() {
        List<String> doc = List.of(
            "| MMOVE-1 | Hadur shall use `CLOSEST_FACTOR` and `ShotDodger.EXPERTS`. |",
            "## Retired requirements",
            "",
            "| ID | Requirement | Retired | Reason |",
            "|---|---|---|---|",
            "| MMOVE-24 | multiplied by `CLOSEST_FACTOR_SOLO` beside `CLOSEST_FACTOR` | x | y |",
            "| MGUN-17 | Where the `FieldGun.EXPERTS` switch is on | x | y |",
            "| MGUN-99 | Where the `MELEE_AIMED` switch is on | x | y |");
        Map<String, Set<String>> r = retired(doc);
        assertEquals(Set.of("CLOSEST_FACTOR_SOLO", "MELEE_AIMED"), r.keySet());
    }

    static Map<String, Set<String>> retired(List<String> lines) {
        int start = lines.indexOf("## Retired requirements");
        assertTrue(start >= 0, "docs/requirements.md has no retired table");
        int header = start;
        while (!lines.get(header).startsWith("| ID |")) header++;
        int end = header + 2;
        while (end < lines.size() && lines.get(end).startsWith("|")) end++;
        Set<String> live = new TreeSet<>();
        Map<String, Set<String>> retired = new TreeMap<>();
        for (int i = 0; i < lines.size(); i++) {
            String l = lines.get(i);
            if (!ROW.matcher(l).find()) continue;
            boolean isRetired = i > header && i < end;
            Matcher m = NAME.matcher(l);
            while (m.find()) {
                String owner = m.group(1) == null ? "" : m.group(1);
                if (isRetired) retired.computeIfAbsent(m.group(2), k -> new TreeSet<>()).add(owner);
                else live.add(m.group(2));
            }
        }
        retired.keySet().removeAll(live);
        return retired;
    }

    static boolean declares(String src, String name) {
        return Pattern.compile("\\b(?:static\\s+final|final\\s+static)\\s+[\\w<>\\[\\],.]+\\s+" + name + "\\b")
            .matcher(src).find();
    }

    private static List<String> read(Path p) {
        try {
            return Files.readAllLines(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static Path root() {
        Path p = Path.of("").toAbsolutePath();
        while (p != null && !Files.exists(p.resolve("docs/requirements.md"))) p = p.getParent();
        assertTrue(p != null, "no docs/requirements.md above " + Path.of("").toAbsolutePath());
        return p;
    }
}
