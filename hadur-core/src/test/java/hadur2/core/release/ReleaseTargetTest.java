package hadur2.core.release;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * REL-1: RoboRumble clients run whatever Java their owners installed, and a robot a client
 * can't load scores nothing there. Every compiled core class must be Java 11 (major 55) or
 * older; the adapter module is compiled with the same setting.
 */
class ReleaseTargetTest {

    static final int JAVA_11 = 55;

    @Test
    @Tag("REL-1")
    @DisplayName("REL-1: every core class loads on Java 11")
    void everyCoreClassTargetsJava11() throws IOException, URISyntaxException {
        Path classes = Path.of(hadur2.core.HadurCore.class.getProtectionDomain()
            .getCodeSource().getLocation().toURI());
        List<String> tooNew = new ArrayList<>();
        int checked = 0;
        try (Stream<Path> files = Files.walk(classes)) {
            for (Path f : (Iterable<Path>) files.filter(p -> p.toString().endsWith(".class"))::iterator) {
                checked++;
                int major = majorVersion(f);
                if (major > JAVA_11) tooNew.add(classes.relativize(f) + " (" + major + ")");
            }
        }
        assertTrue(checked > 50, "only " + checked + " classes found under " + classes);
        assertTrue(tooNew.isEmpty(), "Built for a Java newer than 11: " + tooNew);
    }

    static int majorVersion(Path classFile) throws IOException {
        try (InputStream in = Files.newInputStream(classFile);
             DataInputStream data = new DataInputStream(in)) {
            data.readInt();           // magic
            data.readUnsignedShort(); // minor
            return data.readUnsignedShort();
        }
    }
}
