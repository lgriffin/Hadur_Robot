package hadur117.mini;

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

/** The gate on the jar the rumble takes (DEISE-12, DEISE-15). */
class DeiseJarIT {

    static File jar() {
        File f = new File(System.getProperty("deise.jar", "missing"));
        assertTrue(f.isFile(), "jar not built: " + f);
        return f;
    }

    @Test
    @Tag("DEISE-12")
    @DisplayName("the jar is within its codesize budget, by Robocode's codesize tool")
    void codesize() {
        int limit = Integer.parseInt(System.getProperty("deise.codesize.limit", "1499"));
        Codesize.Item item = Codesize.processZipFile(jar());
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("Deise codesize: " + item.getCodeSize() + " bytes (budget " + limit
            + ", MiniMelee 1499)");
        assertTrue(item.getCodeSize() <= limit, "codesize " + item.getCodeSize() + " is over " + limit);
    }

    @Test
    @Tag("DEISE-15")
    @DisplayName("the jar carries the robot's properties, at the release, and its source")
    void packaged() throws Exception {
        try (JarFile j = new JarFile(jar())) {
            Properties robot = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/mini/Deise.properties"))) {
                robot.load(in);
            }
            assertEquals("hadur117.mini.Deise", robot.getProperty("robot.classname"));
            assertEquals(System.getProperty("deise.release"), robot.getProperty("robot.version"));
            assertNotNull(j.getEntry("hadur117/mini/Deise.java"), "source not included");
            assertNotNull(j.getEntry("hadur117/mini/core/Gun.class"), "core not included");
        }
    }
}
