package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-104: the pc-melee-s0 card (melee Stage 0) is complete before it reaches the PC. */
class MeleeS0PlanTest {

    private static final Path QUEUE = Path.of("plans/pc-melee-s0.queue");

    @Test
    @Tag("BENCH-104")
    @DisplayName("the steps chain from prep to a results PR, on the version the pom names, never a hard-coded one")
    void stepsChain() throws IOException {
        String queue = Files.readString(QUEUE);
        String[] steps = {"s0prep", "s0census", "s0width", "s0read", "s0pr"};
        for (int i = 1; i < steps.length; i++) {
            int at = queue.indexOf("\n" + steps[i] + " ");
            assertTrue(at >= 0, steps[i]);
            int next = queue.indexOf("\n\n", at + 1);
            assertTrue(queue.substring(at, next < 0 ? queue.length() : next).contains("after: " + steps[i - 1]),
                steps[i] + " after " + steps[i - 1]);
        }
        assertTrue(queue.contains("<robot.release>"), "the version comes from the pom");
        assertFalse(queue.matches("(?s).*Hadur_3\\.\\d.*"), "no robot version is hard-coded");
        assertTrue(queue.contains("open_results_pr.sh claude/pc-melee-s0-results"));
        assertTrue(queue.contains("for f in melee-census-317/f*.txt; do ./fetch-opponents.sh --set \"$f\" || exit 1; done"));
        for (String a : List.of("census", "width")) {
            String args = Files.readString(Path.of("plans/melee-s0-" + a + ".args"));
            assertTrue(args.contains("bisect/hadur2.Hadur_@V@bb.jar"), a);
            assertFalse(args.matches("(?s).*3\\.1\\d.*"), a + " names no version");
        }
        String census = Files.readString(Path.of("plans/melee-s0-census.args"));
        assertTrue(census.contains("--baseline\nbisect/hadur2.Hadur_@V@aa.jar"));
        assertTrue(census.contains("--parallel\n@C@\n") && queue.contains("C=${MELEE_WORKERS}"), "the census runs at the host's melee width (BENCH-105), fixed at prep");
        assertTrue(census.contains("--cpu-constant\nauto\n"), "and with the host's CPU constant");
        String width = Files.readString(Path.of("plans/melee-s0-width.args"));
        assertTrue(width.contains("--parallel\n@W@\n") && width.contains("--cpu-constant\nauto\n"));
        assertTrue(queue.contains("W=$(( C / 2 ))") && queue.contains("if test -f work/melee-s0-width.args"), "the width check runs at half the host's width, and not at all on one worker");
        assertTrue(census.contains("--seeds\n4\n"));
    }

    @Test
    @Tag("BENCH-104")
    @DisplayName("the census meets every robot of the 2026-10-25 field once, nine to a field, Hadur never an opponent")
    void censusField() throws IOException {
        List<String> suite = Files.readAllLines(Path.of("melee-census-317.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).toList();
        assertEquals(46, suite.size());
        java.util.Set<String> seen = new java.util.HashSet<>();
        for (String line : suite) {
            String set = line.replaceAll(".*--set (\\S+).*", "$1");
            List<String> robots = Files.readAllLines(Path.of(set)).stream()
                .filter(l -> !l.startsWith("#") && !l.isBlank()).toList();
            assertEquals(9, robots.size(), set);
            for (String r : robots) {
                String[] p = r.split("\\|");
                assertTrue(p[1].trim().matches("melee-\\d+"), r);
                assertTrue(p[2].trim().endsWith(".jar"), r);
                assertFalse(p[0].startsWith("hadur2."), r);
                seen.add(p[0].trim());
            }
        }
        assertEquals(414, seen.size());
        assertTrue(seen.contains("cz.libors.Ogi v1"));
        List<String> width = Files.readAllLines(Path.of("melee-census-317-width.txt")).stream()
            .filter(l -> !l.startsWith("#") && !l.isBlank()).toList();
        assertEquals(suite.subList(0, 6), width);
    }
}
