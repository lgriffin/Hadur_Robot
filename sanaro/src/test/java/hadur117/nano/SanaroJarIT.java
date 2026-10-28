package hadur117.nano;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import codesize.Codesize;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import java.util.jar.JarFile;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** The gate on the jar the rumble takes (SANARO-1, SANARO-2, SANARO-9). */
class SanaroJarIT {

    static File jar() {
        File f = new File(System.getProperty("sanaro.jar", "missing"));
        assertTrue(f.isFile(), "jar not built: " + f);
        return f;
    }

    @Test
    @Tag("SANARO-1")
    @DisplayName("the jar is within NanoMelee's 249 bytes, by Robocode's codesize tool, in one class")
    void codesize() {
        int limit = Integer.parseInt(System.getProperty("sanaro.codesize.limit", "249"));
        Codesize.Item item = Codesize.processZipFile(jar());
        assertNotNull(item, "codesize could not read the jar");
        System.out.println("Sanaro codesize: " + item.getCodeSize() + " bytes (budget " + limit + ", NanoMelee 249)");
        assertTrue(item.getCodeSize() <= limit, "codesize " + item.getCodeSize() + " is over " + limit);
        assertEquals(1, item.getNClassFiles(), "the shipped jar should hold one class");
    }

    @Test
    @Tag("SANARO-2")
    @DisplayName("the class has no static initialiser: every static starts at zero or is a constant")
    void noClinit() throws Exception {
        try (JarFile j = new JarFile(jar());
             InputStream in = j.getInputStream(j.getEntry("hadur117/nano/Sanaro.class"))) {
            JavaClass c = new ClassParser(in, "Sanaro.class").parse();
            for (Method m : c.getMethods()) {
                assertTrue(!m.getName().equals("<clinit>"), "Sanaro has a <clinit>");
            }
        }
    }

    @Test
    @Tag("SANARO-9")
    @DisplayName("the jar carries the robot's properties, at the release, and its source")
    void packaged() throws Exception {
        try (JarFile j = new JarFile(jar())) {
            Properties robot = new Properties();
            try (InputStream in = j.getInputStream(j.getEntry("hadur117/nano/Sanaro.properties"))) {
                robot.load(in);
            }
            assertEquals("hadur117.nano.Sanaro", robot.getProperty("robot.classname"));
            assertEquals(System.getProperty("sanaro.release"), robot.getProperty("robot.version"));
            assertNotNull(j.getEntry("hadur117/nano/Sanaro.java"), "source not included");
            assertEquals("true", robot.getProperty("robot.java.source.included"));
        }
    }
}
