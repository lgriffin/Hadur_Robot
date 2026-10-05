package hadur2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.shieldmode.ShieldList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * SHIELD-5: Hadur's own shield list ships as a class of the robot jar, {@link ShieldListData},
 * because Robocode's sandbox denies a robot the read of a resource in its own jar (found by
 * the bench's smoke run). Whatever names are on it, every entry must be a robot name the core
 * can match; it ships empty until the bench says which robots shield mode wins against.
 */
@Tag("SHIELD-5")
class ShieldListResourceTest {

    @Test
    @DisplayName("every entry is a comment, a blank or a robot name the core can match")
    void everyEntryParses() {
        List<String> lines = Arrays.asList(ShieldListData.lines());
        int robots = 0;
        for (String line : lines) {
            String t = line.trim();
            if (t.isEmpty() || t.startsWith("#")) continue;
            robots++;
            // "package.Class" or "package.Class version": a dotted class name, then at most a version.
            assertTrue(t.matches("[\\w$]+(\\.[\\w$]+)+( \\S+)?"), "not a robot name: " + t);
        }
        ShieldList list = ShieldList.parse(lines);
        assertEquals(robots, list.size(), "one list entry per robot entry");
        for (String line : lines) {
            String t = line.trim();
            if (!t.isEmpty() && !t.startsWith("#")) assertTrue(list.matches(t), t);
        }
    }

    @Test
    @DisplayName("the robot never reads a resource of its own jar: Robocode's sandbox kills it for that")
    void noResourceReads() throws java.io.IOException {
        java.nio.file.Path src = java.nio.file.Path.of("src/main/java/hadur2/Hadur.java");
        String text = java.nio.file.Files.readString(src);
        assertTrue(!text.contains("getResourceAsStream") && !text.contains("getResource("),
            "Robocode denies the robot a read of its own jar");
    }
}
