package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-242: the second class card (plans/pc-class-2.queue): the WALL class with wall-hug lines, two locks. */
class PcClassTwoPlanTest {

    private static List<String> names(String file) throws IOException {
        return Files.readAllLines(Path.of(file)).stream()
            .filter(l -> !l.isBlank() && !l.startsWith("#")).map(l -> l.split("\\|")[0].trim()).toList();
    }

    @Test
    @Tag("BENCH-242")
    @DisplayName("236 WALL robots with c/aa/wh on 8 seeds, Gouldingi and SOS locked on 12 fresh seeds, picks and stop rules")
    void cardIsComplete() throws IOException {
        String queue = Files.readString(Path.of("plans/pc-class-2.queue"));
        String version = Files.readString(Path.of("../hadur-robot/pom.xml"))
            .replaceAll("(?s).*<robot.release>(.*?)</robot.release>.*", "$1");
        assertTrue(queue.contains("set V = " + version + "\n"), "the card builds the current release");
        java.util.Set<String> broken = Broken.names(Path.of(Broken.FILE));
        List<String> wall = names("panel-class-wall.txt");
        assertEquals(236, wall.size());
        assertEquals(wall.size(), new HashSet<>(wall).size(), "no robot twice");
        assertEquals(wall, names("plans/class-wall-add.txt"), "one wall-hug line per panel robot");
        for (String n : wall) assertTrue(!broken.contains(n), n + " loads on 1.11.2");
        String table = Files.readString(Path.of("../hadur-robot/src/main/java/hadur117/ShieldTableData.java"));
        String hugs = table.substring(table.indexOf("static String[] wallHugs()"));
        hugs = hugs.substring(0, hugs.indexOf("}"));
        assertTrue(!hugs.contains("\""), "master ships no wall-hug line before the card");
        assertEquals(List.of("pez.mini.Gouldingi 1.5", "sos.SOS 1.0"), names("panel-class-lock2.txt"));
        assertEquals(List.of("pez.mini.Gouldingi 1.5"), names("plans/class-lock2-shield.txt"));
        assertEquals(List.of("sos.SOS 1.0"), names("plans/class-lock2-x5.txt"));
        String wallArms = Files.readString(Path.of("plans/pc-class-wall.arms"));
        String lockArms = Files.readString(Path.of("plans/pc-class-lock2.arms"));
        for (String arms : new String[] {wallArms, lockArms}) {
            assertTrue(arms.contains("\nc | hadur117.Hadur " + version + " |") && arms.contains("\naa | hadur117.Hadur " + version + "aa |"));
        }
        assertTrue(wallArms.contains("\nwh | hadur117.Hadur " + version + "wh |"));
        assertTrue(lockArms.contains("\nmtzl | hadur117.Hadur " + version + "mtzl |") && lockArms.contains("\nx5 | hadur117.Hadur " + version + "x5 |"));
        assertTrue(queue.contains("WALL_HUG=plans/class-wall-add.txt bash ./build-ablation.sh whlist &&")
            && queue.contains("SHIELD_ADD=plans/class-lock2-shield.txt SHIELD_STILL=plans/class-lock2-shield.txt bash ./build-ablation.sh slistadd,szlist &&")
            && queue.contains("X5_POWER=plans/class-lock2-x5.txt bash ./build-ablation.sh x5list &&"));
        assertTrue(queue.contains("--set panel-class-wall.txt --seeds 8 --seed-base 18800 --arms plans/pc-class-wall.arms --out ${W}-wall "));
        assertTrue(queue.contains("--set panel-class-lock2.txt --seeds 12 --seed-base 18900 --arms plans/pc-class-lock2.arms --out ${W}-lock "));
        assertTrue(queue.contains("mode_table.py ${W}-wall/arms.tsv --margin 3 "));
        for (String step : new String[] {"wall", "lock"}) {
            int at = queue.indexOf("\n" + step + " | ");
            String body = queue.substring(at, queue.indexOf("\n\n", at + 1));
            for (String rule : new String[] {"fails 30", "dead 8", "skips 60 over 200", "stall 30m", "aa after 20%"}) {
                assertTrue(body.contains("stop: " + rule), step + " " + rule);
            }
        }
        assertTrue(queue.contains("open_results_pr.sh claude/pc-class-2-results") && queue.contains("set P = --parallel 16 --no-truth-log"));
    }
}
