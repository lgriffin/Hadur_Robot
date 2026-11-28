package hadur117.nano.gen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The chance string SanaraGen lays out (SANARA-4). */
class SanaraGenTest {

    @Test
    @Tag("SANARA-4")
    @DisplayName("every listed robot's place in the chance string gives its listed reversal chance")
    void shippedListHoldsItsChances() throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("src/main/gen/sanara-chance.txt"), StandardCharsets.UTF_8);
        String list = SanaraGen.layout(lines);
        assertTrue(list.length() <= 65535, "constant too long");
        int checked = 0;
        for (String s : lines) {
            if (s.startsWith("#") || s.trim().isEmpty()) {
                continue;
            }
            String[] f = s.split("\t");
            int i = list.indexOf(f[1].trim());
            double got = i < 0 ? 1 : Math.max(0, 1 - i / SanaraGen.SCALE);
            assertEquals(Double.parseDouble(f[0]), got, SanaraGen.SLACK, f[1]);
            checked++;
        }
        assertTrue(checked > 0, "no robots listed");
    }

    @Test
    @Tag("SANARA-4")
    @DisplayName("every robot in the bench's NanoRumble field that is not listed is not found, so it reverses on every shot")
    void unlistedFieldRobotsAlwaysReverse() throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("src/main/gen/sanara-chance.txt"), StandardCharsets.UTF_8);
        String list = SanaraGen.layout(lines);
        Set<String> listed = new HashSet<String>();
        for (String s : lines) {
            if (!s.startsWith("#") && !s.trim().isEmpty()) {
                listed.add(s.split("\t")[1].trim());
            }
        }
        int checked = 0;
        for (String s : Files.readAllLines(Paths.get("../hadur-bench/kitlab/nano-all-field.txt"), StandardCharsets.UTF_8)) {
            int bar = s.indexOf(" | ");
            if (bar > 0 && !listed.contains(s.substring(0, bar))) {
                assertEquals(-1, list.indexOf(s.substring(0, bar)), s.substring(0, bar));
                checked++;
            }
        }
        assertTrue(checked > 0 || listed.size() >= 299, "field not read");
    }

    @Test
    @Tag("SANARA-4")
    @DisplayName("a robot that would get the wrong chance fails the build")
    void wrongChanceIsRefused() {
        // "a 1" is found inside "a 1.0", at chance 0.9's place, though it is listed at 0.5.
        assertThrows(IllegalArgumentException.class,
            () -> SanaraGen.layout(Arrays.asList("0.9\ta 1.0", "0.5\ta 1")));
        assertThrows(IllegalArgumentException.class,
            () -> SanaraGen.layout(Arrays.asList("0.5\tx 1", "0.5\tx 1")));
    }
}
