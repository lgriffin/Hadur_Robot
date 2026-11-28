package hadur117.nano;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import codesize.Codesize;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import java.util.jar.JarFile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The gate on the jar the rumble takes (SANARA-1 to SANARA-3). */
class SanaraJarIT {

    static File jar() {
        File f = new File(System.getProperty("sanara.jar", "missing"));
        assertTrue(f.isFile(), "jar not built: " + f);
        return f;
    }

    @Test
    @Tag("SANARA-1")
    @DisplayName("the jar is within NanoRumble's 249 bytes, by Robocode's codesize tool, in one class")
    void codesize() {
        int limit = Integer.parseInt(System.getProperty("sanara.codesize.limit", "249"));
        Codesize.Item item = Codesize.processZipFile(jar());
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("Sanara codesize: " + item.getCodeSize() + " bytes (budget " + limit + ")");
        assertTrue(item.getCodeSize() <= limit, "codesize " + item.getCodeSize() + " is over " + limit);
        assertEquals(1, item.getNClassFiles(), "the shipped jar should hold one class");
    }

    @Test
    @Tag("SANARA-2")
    @DisplayName("the jar carries the robot's properties, at the release, and its source")
    void packaged() throws Exception {
        try (JarFile j = new JarFile(jar())) {
            Properties robot = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/nano/Sanara.properties"))) {
                robot.load(in);
            }
            assertEquals("hadur117.nano.Sanara", robot.getProperty("robot.classname"));
            assertEquals(System.getProperty("sanara.release"), robot.getProperty("robot.version"));
            assertNotNull(j.getEntry("hadur117/nano/Sanara.java"), "source not included");
            assertEquals("true", robot.getProperty("robot.java.source.included"));
        }
    }

    @Test
    @Tag("SANARA-3")
    @DisplayName("the written class passes the JVM's verifier and initialises")
    void verifies() throws Exception {
        try (URLClassLoader loader = new URLClassLoader(new URL[] {jar().toURI().toURL()},
                SanaraJarIT.class.getClassLoader())) {
            Class<?> c = Class.forName("hadur117.nano.Sanara", true, loader);
            assertEquals("robocode.AdvancedRobot", c.getSuperclass().getName());
            assertNotNull(c.getMethod("onScannedRobot", robocode.ScannedRobotEvent.class));
            assertNotNull(c.getMethod("onHitWall", robocode.HitWallEvent.class));
        }
    }
}
