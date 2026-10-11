package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * The bench's run options of issue #117: counterbalanced order, retries, dry run, the arena
 * field and the argument file. Nothing here starts a battle.
 */
class RunOptionsTest {

    private static Map<String, String> opts(String... kv) {
        Map<String, String> m = new HashMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) m.put(kv[i], kv[i + 1]);
        return m;
    }

    @Test
    @Tag("BENCH-52")
    @DisplayName("the candidate goes first on odd seeds and the baseline on even ones")
    void orderAlternatesBySeedParity() {
        assertTrue(Bench.candidateFirst(1));
        assertFalse(Bench.candidateFirst(2));
        assertTrue(Bench.candidateFirst(3));
        int first = 0;
        for (int seed = 1; seed <= 10; seed++) if (Bench.candidateFirst(seed)) first++;
        assertEquals(5, first);
    }

    @Test
    @Tag("BENCH-52")
    @DisplayName("the duel's conditions line names the child JVM flags like the melee and team lines do")
    void duelHostLineCarriesChildFlags() {
        String line = new Bench(opts("parallel", "4")).duelHostLine(4);
        assertTrue(line.contains("Battle JVM flags: -XX:ActiveProcessorCount=2"), line);
        assertFalse(line.endsWith("."), line);
    }

    @Test
    @Tag("BENCH-53")
    @DisplayName("--repeat needs at least two runs and is a cold duel option")
    void repeatIsValidated() {
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("repeat", "1")));
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("repeat", "-2")));
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("repeat", "3", "mode", "warm")));
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("repeat", "3", "melee", "true")));
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("repeat", "3", "cold-warm", "true")));
        new Bench(opts("repeat", "3"));
    }

    @Test
    @Tag("BENCH-54")
    @DisplayName("--cold-warm is a cold duel option and refuses the modes it cannot pair")
    void coldWarmIsValidated() {
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("cold-warm", "true", "mode", "warm")));
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("cold-warm", "true", "team", "true")));
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("cold-warm", "true", "melee", "true")));
        new Bench(opts("cold-warm", "true"));
    }

    @Test
    @Tag("BENCH-55")
    @DisplayName("a failed attempt is run again up to the retries, and the attempts are counted")
    void attemptsStopAtSuccessOrTheLimit() throws Exception {
        int[] calls = {0};
        Bench.Tried<Integer> t = Bench.attempts(2, () -> ++calls[0], v -> v >= 2);
        assertEquals(2, t.value());
        assertEquals(2, t.attempts());

        calls[0] = 0;
        Bench.Tried<Integer> never = Bench.attempts(2, () -> ++calls[0], v -> false);
        assertEquals(3, never.attempts());
        assertEquals(3, calls[0]);

        calls[0] = 0;
        Bench.Tried<Integer> none = Bench.attempts(0, () -> ++calls[0], v -> false);
        assertEquals(1, none.attempts());
    }

    @Test
    @Tag("BENCH-55")
    @DisplayName("the failure footer lists what stayed failed and what needed a retry, and is empty when neither")
    void failureFooterListsFailures() {
        assertEquals("", Bench.failureFooter(List.of(), List.of()));
        String footer = Bench.failureFooter(List.of(new Bench.Failure("Foo seed 3", 2, "no result")),
            List.of("Bar seed 1 (2 attempts)"));
        assertTrue(footer.contains("## Failed battles"), footer);
        assertTrue(footer.contains("Foo seed 3: failed after 2 attempts (no result)"), footer);
        assertTrue(footer.contains("Bar seed 1 (2 attempts)"), footer);
        String onlyRetried = Bench.failureFooter(List.of(), List.of("Bar seed 1 (2 attempts)"));
        assertTrue(onlyRetried.contains("None; every battle finished."), onlyRetried);
    }

    @Test
    @Tag("BENCH-55")
    @DisplayName("--retries below zero is refused")
    void negativeRetriesRefused() {
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("retries", "-1")));
        new Bench(opts("retries", "0"));
    }

    @Test
    @Tag("BENCH-56")
    @DisplayName("--dry-run true describes the run and creates nothing")
    void dryRunDescribesAndCreatesNothing(@TempDir Path dir) throws Exception {
        Path out = dir.resolve("out");
        PrintStream real = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        int exit;
        try {
            System.setOut(new PrintStream(captured, true, StandardCharsets.UTF_8));
            exit = new Bench(opts("dry-run", "true", "out", out.toString(), "seeds", "2", "repeat", "3",
                "field", "1000x1000")).run();
        } finally {
            System.setOut(real);
        }
        String text = captured.toString(StandardCharsets.UTF_8);
        assertEquals(0, exit);
        assertTrue(text.contains("dry run"), text);
        assertTrue(text.contains("1000x1000"), text);
        assertTrue(text.contains("repeat x3"), text);
        assertFalse(Files.exists(out));
    }

    @Test
    @Tag("BENCH-57")
    @DisplayName("--field takes WIDTHxHEIGHT and refuses anything else")
    void fieldIsParsed() {
        assertArrayEquals(new int[] {1000, 1000}, Bench.parseField("1000x1000"));
        assertArrayEquals(new int[] {800, 600}, Bench.parseField("800x600"));
        for (String bad : new String[] {"800", "0x5", "axb", "800x", "1x2x3", "-5x5"}) {
            assertThrows(IllegalArgumentException.class, () -> Bench.parseField(bad), bad);
        }
        assertThrows(IllegalArgumentException.class, () -> new Bench(opts("field", "0x5")));
    }

    @Test
    @Tag("BENCH-59")
    @DisplayName("an @file argument expands to its lines, one argument each, spaces kept")
    void argFileExpands(@TempDir Path dir) throws IOException {
        Path f = dir.resolve("args.txt");
        Files.writeString(f, (char) 0xFEFF + "--robot\nhadur2.Hadur 3.8.5\n\n# a comment\n--seeds\n5\n",
            StandardCharsets.UTF_8);
        String[] args = Bench.expandArgFile(new String[] {"@" + f});
        assertArrayEquals(new String[] {"--robot", "hadur2.Hadur 3.8.5", "--seeds", "5"}, args);
        Map<String, String> parsed = Bench.parse(args);
        assertEquals("hadur2.Hadur 3.8.5", parsed.get("robot"));
    }

    @Test
    @Tag("BENCH-59")
    @DisplayName("arguments that are not a lone @file are left as they are")
    void otherArgumentsUnchanged() throws IOException {
        String[] plain = {"--robot", "x", "--seeds", "2"};
        assertArrayEquals(plain, Bench.expandArgFile(plain));
        String[] two = {"@a", "b"};
        assertArrayEquals(two, Bench.expandArgFile(two));
        String[] bare = {"@"};
        assertArrayEquals(bare, Bench.expandArgFile(bare));
        assertEquals(0, Bench.expandArgFile(new String[0]).length);
    }
}
