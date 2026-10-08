package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** Issue #151: opponents crippled by the bench's own class path (BENCH-83, BENCH-84). */
class JdkWarmupTest {

    @Test
    @Tag("BENCH-83")
    @DisplayName("a robot thread that first needs the time-zone rules is denied without the warm-up and served with it")
    void warmupServesTheRobotThread() throws Exception {
        assertEquals(3, probe("cold"), "the reproduction should fail without the warm-up");
        assertEquals(0, probe("warm"));
    }

    @Test
    @Tag("BENCH-84")
    @DisplayName("a battle where a robot was denied a JDK class-path resource is not trusted")
    void jdkDenialIsUntrusted() {
        String denial = "Preventing pez.frankie.Frankie 0.9.6.1 from access: (\"java.io.FilePermission\" "
            + "\"D:\\code\\Hadur_Robot\\hadur-bench\\target\\classes\\META-INF\\services\\"
            + "java.time.zone.ZoneRulesProvider\" \"read\"). You may only read files in your own root package directory.";
        String ownExcess = "Preventing sample.Bot from access: (\"java.io.FilePermission\" \"C:\\other\\file.txt\" \"write\").";
        assertEquals(1, BattleResult.hostDenials(denial));
        assertEquals(0, BattleResult.hostDenials(ownExcess));
        assertEquals(1, BattleResult.hostDenials(ownExcess + " " + denial));
        assertEquals(0, BattleResult.hostDenials(null));

        BattleResult r = new BattleResult();
        r.ok = true;
        r.rounds = 35;
        r.roundRecords = 35;
        r.duressTicks = 0;
        assertTrue(r.trusted(2.0));
        r.errors = ownExcess;
        assertTrue(r.trusted(2.0));
        r.errors = denial;
        assertFalse(r.trusted(2.0));
        assertTrue(r.untrustedReasons(2.0).contains("JDK resource denied"));
    }

    private static int probe(String mode) throws Exception {
        String java = Path.of(System.getProperty("java.home"), "bin", "java").toString();
        Path log = Files.createTempFile("warmup-probe", ".log");
        Process p = new ProcessBuilder(List.of(java, "-Djava.security.manager=allow", "-cp",
                System.getProperty("java.class.path") + File.pathSeparator + Path.of("target", "classes"),
                WarmupProbe.class.getName(), mode))
            .redirectErrorStream(true).redirectOutput(log.toFile()).start();
        if (!p.waitFor(2, TimeUnit.MINUTES)) {
            p.destroyForcibly();
            return -1;
        }
        System.out.println(mode + ": " + Files.readString(log, StandardCharsets.UTF_8).trim());
        return p.exitValue();
    }
}
