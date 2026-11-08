package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** BENCH-211: a restarted suite keeps only fields that finished cleanly under the same settings and jar. No battle starts. */
class SuiteResumeTest {

    @TempDir
    Path dir;

    private Map<String, String> field(Path jar, String seeds) throws Exception {
        Path out = dir.resolve("F01");
        Files.createDirectories(out);
        Files.writeString(out.resolve("report.md"), "# Melee bench: F01\n");
        Map<String, String> m = new HashMap<>();
        m.put("out", out.toString());
        m.put("label", "F01");
        m.put("seeds", seeds);
        m.put("robot-jar", jar.toString());
        return m;
    }

    @Test
    @Tag("BENCH-211")
    @DisplayName("a report alone, from a failed or interrupted field, is not kept")
    void reportWithoutDoneStampRuns() throws Exception {
        Path jar = Files.writeString(dir.resolve("a.jar"), "jar");
        assertFalse(Bench.suiteFieldDone(field(jar, "6")));
    }

    @Test
    @Tag("BENCH-211")
    @DisplayName("a field marked done is kept, unless the line turns resume off")
    void doneFieldKeptUnlessResumeOff() throws Exception {
        Path jar = Files.writeString(dir.resolve("a.jar"), "jar");
        Map<String, String> f = field(jar, "6");
        Bench.markSuiteFieldDone(f);
        assertTrue(Bench.suiteFieldDone(f));
        f.put("resume", "false");
        assertFalse(Bench.suiteFieldDone(f));
    }

    @Test
    @Tag("BENCH-211")
    @DisplayName("changed seeds or a rebuilt jar under the same output folder run the field again")
    void changedSettingsOrJarRunAgain() throws Exception {
        Path jar = Files.writeString(dir.resolve("a.jar"), "jar");
        Map<String, String> f = field(jar, "6");
        Bench.markSuiteFieldDone(f);
        assertFalse(Bench.suiteFieldDone(field(jar, "4")));
        Files.writeString(jar, "rebuilt jar");
        Files.setLastModifiedTime(jar, FileTime.fromMillis(Files.getLastModifiedTime(jar).toMillis() + 5000));
        assertFalse(Bench.suiteFieldDone(field(jar, "6")));
    }
}
