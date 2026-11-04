package hadur117.core.trace;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * STRAND-6: a failed card's switch leaves the robot with its requirement (Leigh, 2026-11-04: "we
 * should not have checked this in... extreme bloat"). Every switch a retired requirement names
 * ("Where the `X` switch is on", or "Where `X` is above 0") must no longer be declared in the
 * robot's main sources, unless a live requirement still names it. A switch is a
 * {@code static final boolean} for the first form, any {@code static final} constant for the
 * second.
 */
class RetiredSwitchTest {

    static final Pattern ROW = Pattern.compile("^\\|\\s*([A-Z]+-\\d+)\\s*\\|");
    static final Pattern SWITCH = Pattern.compile("`(?:[A-Za-z]+\\.)?([A-Z][A-Z0-9_]+)` switch");
    static final Pattern ABOVE = Pattern.compile("Where `(?:[A-Za-z]+\\.)?([A-Z][A-Z0-9_]+)` is ");
    static final List<String> MAIN = List.of("hadur-core/src/main/java", "hadur-robot/src/main/java");

    @Test
    @Tag("STRAND-6")
    @DisplayName("STRAND-6: no switch of a retired requirement is still declared in the robot")
    void retiredSwitchesAreGone() {
        Path root = root();
        List<String> lines = read(root.resolve("docs/requirements.md"));
        int start = lines.indexOf("## Retired requirements");
        assertTrue(start >= 0, "docs/requirements.md has no retired table");
        int header = start;
        while (!lines.get(header).startsWith("| ID |")) header++;
        int end = header + 2;
        while (end < lines.size() && lines.get(end).startsWith("|")) end++;

        Set<String> liveBool = new TreeSet<>(), liveAny = new TreeSet<>();
        Set<String> retiredBool = new TreeSet<>(), retiredAny = new TreeSet<>();
        for (int i = 0; i < lines.size(); i++) {
            String l = lines.get(i);
            if (!ROW.matcher(l).find()) continue;
            boolean retired = i > header && i < end;
            collect(SWITCH, l, retired ? retiredBool : liveBool);
            collect(ABOVE, l, retired ? retiredAny : liveAny);
        }
        Set<String> live = new TreeSet<>(liveBool);
        live.addAll(liveAny);
        retiredBool.removeAll(live);
        retiredAny.removeAll(live);

        List<String> left = new ArrayList<>();
        for (String dir : MAIN) {
            Path d = root.resolve(dir);
            if (!Files.isDirectory(d)) continue;
            try (Stream<Path> files = Files.walk(d)) {
                files.filter(p -> p.toString().endsWith(".java")).forEach(p -> {
                    String src = String.join("\n", read(p));
                    for (String n : retiredBool) {
                        if (Pattern.compile("static final boolean " + n + "\\b").matcher(src).find()) {
                            left.add(n + " in " + root.relativize(p));
                        }
                    }
                    for (String n : retiredAny) {
                        if (Pattern.compile("static final \\w+ " + n + "\\b").matcher(src).find()) {
                            left.add(n + " in " + root.relativize(p));
                        }
                    }
                });
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        assertTrue(left.isEmpty(), "Retired requirements' switches still in the robot (remove the switch, its"
            + " code, arm and tests with the requirement): " + left);
    }

    private static void collect(Pattern p, String line, Set<String> into) {
        Matcher m = p.matcher(line);
        while (m.find()) into.add(m.group(1));
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
