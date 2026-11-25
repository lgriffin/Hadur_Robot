package hadur117.sepia;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;
import java.util.Properties;
import java.util.jar.JarFile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SEPIA-3: the shipped jar, as {@code mvn verify} packs it. */
class SepiaJarIT {

    @Test
    @Tag("SEPIA-3")
    @DisplayName("the jar carries Sepia, the kernel classes it reaches and its properties, and not Hadur's brain")
    void shippedJar() throws Exception {
        String path = System.getProperty("sepia.jar");
        assertNotNull(path, "run through failsafe, which passes sepia.jar");
        try (JarFile jar = new JarFile(path)) {
            for (String needed : new String[] {"hadur117/Sepia.class", "hadur117/sepia/SepiaBrain.class",
                "hadur117/sepia/Gait.class", "hadur117/core/move/BulletShadows.class", "hadur117/core/model/Wave.class",
                "hadur117/core/ledger/EnergyLedger.class"}) {
                assertNotNull(jar.getEntry(needed), needed);
            }
            for (String absent : new String[] {"hadur117/Hadur.class", "hadur117/core/HadurCore.class",
                "hadur117/core/duel/DuelController.class", "hadur117/core/melee/MeleeController.class",
                "hadur117/core/shieldmode/ShieldList.class"}) {
                assertTrue(jar.getEntry(absent) == null, absent + " should not ship");
            }
            Properties p = new Properties();
            try (InputStream in = jar.getInputStream(jar.getEntry("hadur117/Sepia.properties"))) {
                p.load(in);
            }
            assertTrue(p.getProperty("robot.version").equals(System.getProperty("sepia.release")));
            assertTrue(p.getProperty("robot.classname").equals("hadur117.Sepia"));
            assertFalse(p.getProperty("robot.description").isEmpty());
        }
    }
}
