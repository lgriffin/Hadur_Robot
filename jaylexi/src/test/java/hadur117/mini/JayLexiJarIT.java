package hadur117.mini;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import codesize.Codesize;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import java.util.jar.JarFile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The gate on the jar the rumble takes (JAYLEXI-1, JAYLEXI-9). */
class JayLexiJarIT {

    static File jar() {
        File f = new File(System.getProperty("jaylexi.jar", "missing"));
        assertTrue(f.isFile(), "jar not built: " + f);
        return f;
    }

    @Test
    @Tag("JAYLEXI-1")
    @DisplayName("the jar is within MiniRumble's 1499 bytes by Robocode's codesize tool, with 3 bytes spare")
    void codesize() {
        int limit = Integer.parseInt(System.getProperty("jaylexi.codesize.limit", "1499"));
        Codesize.Item item = Codesize.processZipFile(jar());
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("JayLexi codesize: " + item.getCodeSize() + " bytes (limit " + limit + ", MiniRumble)");
        assertTrue(item.getCodeSize() <= limit - 3, "codesize " + item.getCodeSize() + " leaves under 3 bytes of " + limit);
    }

    @Test
    @Tag("JAYLEXI-9")
    @DisplayName("the jar carries the robot's properties, at the release, and its source")
    void packaged() throws Exception {
        try (JarFile j = new JarFile(jar())) {
            Properties robot = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/mini/JayLexi.properties"))) {
                robot.load(in);
            }
            assertEquals("hadur117.mini.JayLexi", robot.getProperty("robot.classname"));
            assertEquals(System.getProperty("jaylexi.release"), robot.getProperty("robot.version"));
            assertNotNull(j.getEntry("hadur117/mini/JayLexi.java"), "source not included");
            assertEquals("true", robot.getProperty("robot.java.source.included"));
        }
    }

    /** Loads hadur117.mini classes from the jar first, then the test classes, with fresh statics. */
    static final class JarFirst extends URLClassLoader {
        JarFirst(URL... urls) {
            super(urls, JayLexiJarIT.class.getClassLoader());
        }

        @Override
        protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
            synchronized (getClassLoadingLock(name)) {
                if (!name.startsWith("hadur117.mini.") || name.startsWith("hadur117.mini.ref.")) {
                    return super.loadClass(name, resolve);
                }
                Class<?> c = findLoadedClass(name);
                if (c == null) {
                    c = findClass(name);
                }
                if (resolve) {
                    resolveClass(c);
                }
                return c;
            }
        }
    }

    @Test
    @Tag("JAYLEXI-11")
    @DisplayName("the built jar gives the readable reference's orders, bit for bit, on the field's row and a recorded row")
    void jarPlaysAsReadable() throws Exception {
        URL tests = JayLexiJarIT.class.getProtectionDomain().getCodeSource().getLocation();
        try (JarFirst loader = new JarFirst(jar().toURI().toURL(), tests)) {
            Class<?> shipped = loader.loadClass("hadur117.mini.JayLexi");
            assertEquals(jar().toURI().toURL(), shipped.getProtectionDomain().getCodeSource().getLocation(),
                    "JayLexi comes from the jar");
            Method orders = loader.loadClass("hadur117.mini.Replay").getMethod("shipped", long.class, String.class);
            orders.setAccessible(true);
            for (String name : new String[] {"e", JayLexiReplayTest.recordedName()}) {
                for (long seed = 1; seed <= 3; seed++) {
                    String jarOrders = (String) orders.invoke(null, seed, name);
                    Replay.name = name;
                    try {
                        String readable = JayLexiReplayTest.readable(seed);
                        assertEquals(-1, JayLexiReplayTest.firstDifference(jarOrders, readable),
                                name + " seed " + seed + ": first tick whose orders differ");
                    } finally {
                        Replay.name = "e";
                    }
                }
            }
        }
    }
}
