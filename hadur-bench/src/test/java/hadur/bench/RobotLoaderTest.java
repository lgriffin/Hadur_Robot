package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * RES-10: a robot that leaves a reference to its classes in the process (a static in a JDK
 * class, a shutdown hook, a thread, a logger) keeps its class loader, and so every class it
 * loaded, alive for the rest of a session; a rumble client's session of hundreds of battles
 * in one JVM then grows by a robot's worth of classes a battle. This runs 40 one-round
 * battles through one engine under a 256 MB cap, the way a client does, and requires the
 * live class count to stop growing.
 */
@Tag("RES-10")
class RobotLoaderTest {

    private static final int BATTLES = 40;
    private static final String OPPONENT = "sample.SittingDuck";

    @Test
    @DisplayName("forty battles in one JVM leave the live class count flat")
    void liveClassesStayFlatAcrossBattles(@TempDir Path tmp) throws Exception {
        Path bench = Path.of("").toAbsolutePath();
        Path jar = robotJar(bench.resolve("../hadur-robot/target"));
        String robot = robotName(jar);
        Path home = tmp.resolve("home");
        Path robots = Files.createDirectories(home.resolve("robots"));
        Files.copy(jar, robots.resolve(jar.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        try (Stream<Path> samples = Files.list(bench.resolve("target/samples"))) {
            for (Path s : (Iterable<Path>) samples::iterator) {
                Files.copy(s, robots.resolve(s.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= BATTLES; i++) lines.add(OPPONENT + "\t" + i);
        Path list = tmp.resolve("opponents.tsv");
        Files.write(list, lines);
        Path session = tmp.resolve("session");

        List<String> cmd = new ArrayList<>(List.of(
            Path.of(System.getProperty("java.home"), "bin", "java").toString(),
            "--add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED",
            "--add-opens=java.base/java.lang=ALL-UNNAMED",
            "--add-opens=java.base/java.util=ALL-UNNAMED",
            "--add-opens=java.base/java.net=ALL-UNNAMED",
            "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
            "-Djava.security.manager=allow", "-Djava.awt.headless=true", "-Xmx256M",
            "-cp", bench.resolve("target/classes") + File.pathSeparator
                + Files.readString(bench.resolve("target/classpath.txt")).trim(),
            SessionRunner.class.getName(), home.toString(), session.toString(), "1", "800", "600", robot,
            list.toString(), "false"));
        Process p = new ProcessBuilder(cmd).redirectErrorStream(true)
            .redirectOutput(tmp.resolve("session.log").toFile()).start();
        assertTrue(p.waitFor(10, TimeUnit.MINUTES), "the session did not finish");
        assertEquals(0, p.exitValue(), Files.readString(tmp.resolve("session.log")));

        List<String> rows = Files.readAllLines(session.resolve("session.csv"));
        assertEquals(BATTLES + 1, rows.size(), "one row a battle: " + rows);
        int[] live = new int[BATTLES];
        for (int i = 0; i < BATTLES; i++) {
            live[i] = Integer.parseInt(SessionReport.columns(SessionRunner.HEADER, rows.get(i + 1)).get("loadedClasses"));
        }
        // Allow the first battles to settle (the engine's own lazy loading, which a CI runner's
        // collector timing moves by a couple of hundred classes either way), then no growth of
        // more than a quarter: a leaked robot loader adds hundreds of classes a battle, so
        // thousands over thirty.
        int settled = live[9];
        int last = live[BATTLES - 1];
        assertTrue(last <= settled + Math.max(500, settled / 4),
            "live classes grew from " + settled + " after battle 10 to " + last + " after battle " + BATTLES);
    }

    private static Path robotJar(Path target) throws Exception {
        try (Stream<Path> files = Files.list(target)) {
            return files.filter(f -> f.getFileName().toString().matches("hadur2\\.Hadur_[0-9.]+\\.jar"))
                .findFirst().orElseThrow(() -> new IllegalStateException("no robot jar in " + target + "; run mvn package"));
        }
    }

    /** {@code hadur2.Hadur_3.3.jar} is the robot {@code hadur2.Hadur 3.3}. */
    static String robotName(Path jar) {
        String n = jar.getFileName().toString();
        return n.substring(0, n.length() - 4).replace('_', ' ');
    }
}
