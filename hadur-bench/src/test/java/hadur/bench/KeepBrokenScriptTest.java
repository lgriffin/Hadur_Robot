package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-169: bench-top20.sh can keep the broken-1.11.2.txt robots, so a 1.12.0 step ({@code --engine 1.12.0}) can
 * bench the robots that only load on Robocode 1.12.0.
 */
class KeepBrokenScriptTest {

    @Test
    @Tag("BENCH-169")
    @DisplayName("bench-top20.sh passes --keep-broken to Bench as --keep-broken true, off by default and only with another --engine")
    void keepBroken() throws IOException {
        String script = Files.readString(Path.of("bench-top20.sh"));
        assertTrue(script.contains("--keep-broken) KEEP_BROKEN=1"), "the option");
        assertTrue(script.contains("\nKEEP_BROKEN=0\n"), "off by default");
        assertTrue(script.contains("if [ \"$KEEP_BROKEN\" -eq 1 ]; then ARGS=\"$ARGS --keep-broken true\"; fi"), "passed to Bench");
        assertTrue(script.contains("if [ \"$KEEP_BROKEN\" -eq 1 ] && { [ -z \"$ENGINE\" ] || [ \"$ENGINE\" = \"1.11.2\" ]; }; then"),
            "refused without another engine");
        assertTrue(Files.readString(Path.of("src/main/java/hadur/bench/Bench.java"))
            .contains("opts.getOrDefault(\"keep-broken\", \"false\")"), "Bench reads it");
    }
}
