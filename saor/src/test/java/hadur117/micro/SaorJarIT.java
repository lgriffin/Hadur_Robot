package hadur117.micro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import codesize.Codesize;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.jar.JarFile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The gate on the jar that ships, run by failsafe after ProGuard has built it: Robocode's own
 * codesize tool must read 749 bytes or fewer (SAOR-11), the jar must hold the one class, its
 * properties and its source, and the shipped bytes must give the bench adapter's orders
 * (SAOR-15).
 */
class SaorJarIT {

    static File jar(String property) {
        File f = new File(System.getProperty(property, "missing"));
        assertTrue(f.isFile(), property + " not built: " + f);
        return f;
    }

    @Test
    @Tag("SAOR-11")
    @DisplayName("the shipped jar is MicroMelee sized, by Robocode's codesize tool")
    void codesizeIsWithinTheLimit() {
        int limit = Integer.parseInt(System.getProperty("saor.codesize.limit", "749"));
        Codesize.Item item = Codesize.processZipFile(jar("saor.jar"));
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("Saor codesize: " + item.getCodeSize() + " bytes (limit " + limit + ")");
        assertTrue(item.getCodeSize() <= limit, "codesize " + item.getCodeSize() + " is over " + limit);
        assertEquals(1, item.getNClassFiles(), "the shipped jar should hold one class");
    }

    @Test
    @Tag("SAOR-11")
    @DisplayName("the shipped jar carries the rumble's properties and the source")
    void jarIsPackagedForTheRumble() throws Exception {
        try (JarFile j = new JarFile(jar("saor.jar"))) {
            List<String> names = new ArrayList<>();
            j.stream().forEach(e -> names.add(e.getName()));
            assertTrue(names.contains("hadur117/micro/Saor.class"), names.toString());
            assertTrue(names.contains("hadur117/micro/Saor.java"), "source not included: " + names);
            Properties p = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/micro/Saor.properties"))) {
                p.load(in);
            }
            assertEquals("hadur117.micro.Saor", p.getProperty("robot.classname"));
            assertEquals(System.getProperty("saor.release"), p.getProperty("robot.version"));
            assertTrue(!p.getProperty("robot.version").contains("_"), "rumble versions take no underscore");
            assertEquals("true", p.getProperty("robot.java.source.included"));
        }
    }

    @Test
    @Tag("SAOR-15")
    @DisplayName("the shipped bytes give the bench adapter's orders")
    void shippedJarMatchesTheCore() throws Exception {
        SaorEquivalenceTest.assertSameOrders(jar("saor.jar").toURI().toURL(), jar("saor.lab.jar").toURI().toURL());
    }
}
