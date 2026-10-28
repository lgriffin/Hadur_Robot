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

/** The gate on the jar the rumble takes (EVEIMEAR-1, EVEIMEAR-9). */
class EveimearJarIT {

    static File jar() {
        File f = new File(System.getProperty("eveimear.jar", "missing"));
        assertTrue(f.isFile(), "jar not built: " + f);
        return f;
    }

    @Test
    @Tag("EVEIMEAR-1")
    @DisplayName("the jar is within MicroRumble's 749 bytes by Robocode's codesize tool, with 3 bytes spare")
    void codesize() {
        int limit = Integer.parseInt(System.getProperty("eveimear.codesize.limit", "749"));
        Codesize.Item item = Codesize.processZipFile(jar());
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("Eveimear codesize: " + item.getCodeSize() + " bytes (limit " + limit + ", MicroRumble)");
        assertTrue(item.getCodeSize() <= limit - 3, "codesize " + item.getCodeSize() + " leaves under 3 bytes of " + limit);
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
}
