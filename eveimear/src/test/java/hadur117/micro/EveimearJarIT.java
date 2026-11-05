package hadur117.micro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import codesize.Codesize;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import java.util.jar.JarFile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hadur117.micro.replay.Script;

/** The gate on the jar the rumble takes (EVEIMEAR-1, EVEIMEAR-9, EVEIMEAR-17). */
class EveimearJarIT {

    static File jar() {
        File f = new File(System.getProperty("eveimear.jar", "missing"));
        assertTrue(f.isFile(), "jar not built: " + f);
        return f;
    }

    @Test
    @Tag("EVEIMEAR-1")
    @DisplayName("the jar is within MicroRumble's 749 bytes by Robocode's codesize tool")
    void codesize() {
        int limit = Integer.parseInt(System.getProperty("eveimear.codesize.limit", "749"));
        Codesize.Item item = Codesize.processZipFile(jar());
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("Eveimear codesize: " + item.getCodeSize() + " bytes (limit " + limit + ", MicroRumble)");
        assertTrue(item.getCodeSize() <= limit, "codesize " + item.getCodeSize() + " is over " + limit);
    }

    @Test
    @Tag("EVEIMEAR-9")
    @DisplayName("the jar carries the robot's properties, at the release, and its source")
    void packaged() throws Exception {
        try (JarFile j = new JarFile(jar())) {
            Properties robot = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/micro/Eveimear.properties"))) {
                robot.load(in);
            }
            assertEquals("hadur117.micro.Eveimear", robot.getProperty("robot.classname"));
            assertEquals(System.getProperty("eveimear.release"), robot.getProperty("robot.version"));
            assertNotNull(j.getEntry("hadur117/micro/Eveimear.java"), "source not included");
            assertEquals("true", robot.getProperty("robot.java.source.included"));
        }
    }

    @Test
    @Tag("EVEIMEAR-17")
    @DisplayName("the ProGuard-built jar gives javac's orders, bit for bit, on seeded scripts: the field's row, a stop-and-go row and the catcher's row")
    void jarPlaysAsCompiled() throws Exception {
        String classes = new File(System.getProperty("eveimear.classes", "target/classes")).getPath();
        for (String name : new String[] {"e", "rsim.micro.uCatcher 0.1", stopAndGo()}) {
            for (long seed = 1; seed <= 3; seed++) {
                String compiled = Script.run(classes, "hadur117.micro.Eveimear", seed, name);
                assertTrue(compiled.contains(" f") && compiled.contains(" g"), "the script fires and aims");
                assertEquals(compiled, Script.run(jar().getPath(), "hadur117.micro.Eveimear", seed, name), name + " seed " + seed);
            }
        }
    }

    /** A name whose MODES char is mode 9 (stop-and-go held), not the catcher's. */
    static String stopAndGo() {
        for (int i = 0; ; i++) {
            int c = Eveimear.MODES.charAt(("s" + i).hashCode() >>> 18);
            if (c == 9) {
                return "s" + i;
            }
        }
    }
}
