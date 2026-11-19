package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** BENCH-265: with --failed-ok, an opponent whose jar is missing (an archive 404) is dropped and logged, not fatal. */
class MissingJarTest {

    @Test
    @Tag("BENCH-265")
    @DisplayName("a missing opponent jar is dropped when lenient and fatal otherwise")
    void missingJarIsDroppedOnlyWhenLenient(@TempDir Path dir) throws IOException {
        Path from = Files.createDirectories(dir.resolve("opponents"));
        Path robots = Files.createDirectories(dir.resolve("robots"));
        Files.writeString(from.resolve("a.Here_1.0.jar"), "x");
        List<Opponent> strict = new ArrayList<>(List.of(
            new Opponent("a.Here 1.0", "", "a.Here_1.0.jar", 1), new Opponent("b.Gone 2.3.3", "", "b.Gone_2.3.3.jar", 1)));
        assertThrows(IllegalStateException.class, () -> Bench.installOpponents(strict, from, robots, false));

        List<Opponent> lenient = new ArrayList<>(strict);
        Bench.installOpponents(lenient, from, robots, true);
        assertEquals(1, lenient.size());
        assertEquals("a.Here 1.0", lenient.get(0).name);
        assertTrue(Files.exists(robots.resolve("a.Here_1.0.jar")));
    }
}
