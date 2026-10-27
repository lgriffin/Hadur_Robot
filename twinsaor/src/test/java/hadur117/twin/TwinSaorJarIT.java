package hadur117.twin;

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

/** The gate on the team jar the rumble takes (TWIN-1, TWIN-2). */
class TwinSaorJarIT {

    static File jar() {
        File f = new File(System.getProperty("twinsaor.jar", "missing"));
        assertTrue(f.isFile(), "team jar not built: " + f);
        return f;
    }

    @Test
    @Tag("TWIN-2")
    @DisplayName("the team jar is under Twin Duel's 2,000 bytes, by Robocode's codesize tool")
    void codesize() {
        int limit = Integer.parseInt(System.getProperty("twinsaor.codesize.limit", "1999"));
        Codesize.Item item = Codesize.processZipFile(jar());
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("TwinSaor codesize: " + item.getCodeSize() + " bytes (limit " + limit + ")");
        assertTrue(item.getCodeSize() <= limit, "codesize " + item.getCodeSize() + " is over " + limit);
    }

    @Test
    @Tag("TWIN-1")
    @DisplayName("the team file lists one class twice, and the jar carries the robot's properties and source")
    void packaged() throws Exception {
        try (JarFile j = new JarFile(jar())) {
            Properties team = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/twin/TwinSaor.team"))) {
                team.load(in);
            }
            assertEquals("hadur117.twin.SaorTwin,hadur117.twin.SaorTwin", team.getProperty("team.members"));
            String release = System.getProperty("twinsaor.release");
            assertEquals(release, team.getProperty("team.version"));
            Properties robot = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/twin/SaorTwin.properties"))) {
                robot.load(in);
            }
            assertEquals(release, robot.getProperty("robot.version"));
            assertNotNull(j.getEntry("hadur117/twin/SaorTwin.java"), "source not included");
        }
    }
}
