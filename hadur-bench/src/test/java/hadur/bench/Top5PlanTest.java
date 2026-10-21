package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * BENCH-94: the top-5 plan's PC runs (docs/plan-top5.md) are ready to run: their arms files
 * parse, the factorial design names exactly the factorial arms, each arm's jar is one the
 * queue's prep step builds, and the analysis they end with is the tested multiarm.py.
 */
class Top5PlanTest {

    private static List<String> lines(String path) throws IOException {
        List<String> out = new ArrayList<>();
        for (String l : Files.readAllLines(Path.of(path))) {
            String t = l.trim();
            if (!t.isEmpty() && !t.startsWith("#")) out.add(t);
        }
        return out;
    }

    /** The jar build-ablation.sh writes for a comma-separated ablation list, from its suffixes. */
    private static String ablationJar(String list) {
        StringBuilder v = new StringBuilder("3.14");
        for (String a : list.split(",")) {
            v.append(switch (a) {
                case "aa" -> "aa";
                case "nowarm" -> "xw";
                case "heatjit" -> "hj";
                case "swall" -> "sw";
                case "hitclr" -> "hc";
                case "pkern" -> "pk";
                case "keep2" -> "w2";
                case "thgun" -> "th";
                case "freegun" -> "fg";
                case "nodecay" -> "nk";
                case "ram2" -> "nr";
                case "flat" -> "nf";
                case "fin" -> "ne";
                case "nolearn" -> "nl";
                default -> throw new IllegalArgumentException("ablation not in this test's table: " + a);
            });
        }
        return "bisect/hadur2.Hadur_" + v + ".jar";
    }

    /** Every jar a queue's prep step leaves in bisect/: the plain build and each ablation's. */
    private static Set<Path> builtBy(String queue) throws IOException {
        Set<Path> jars = new HashSet<>();
        String text = Files.readString(Path.of(queue));
        assertTrue(text.contains("cp ../hadur-robot/target/hadur2.Hadur_3.14.jar bisect/"), queue + " builds the control");
        jars.add(Path.of("bisect/hadur2.Hadur_3.14.jar").toAbsolutePath().normalize());
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("build-ablation\\.sh ([a-z0-9,]+)").matcher(text);
        while (m.find()) jars.add(Path.of(ablationJar(m.group(1))).toAbsolutePath().normalize());
        return jars;
    }

    @Test
    @Tag("BENCH-94")
    @DisplayName("Stage F and Stage 0 arms parse, and pc-top5.queue builds every arm's jar")
    void firstQueueBuildsItsArms() throws IOException {
        Set<Path> built = builtBy("plans/pc-top5.queue");
        String queue = Files.readString(Path.of("plans/pc-top5.queue"));
        for (String file : List.of("plans/top5-free.arms", "plans/top5-s0.arms")) {
            assertTrue(queue.contains("--arms " + file), "the queue runs " + file);
            List<Arms.Arm> arms = Arms.parse(Path.of(file), Path.of("").toAbsolutePath());
            assertEquals(List.of("c", "aa"), arms.subList(0, 2).stream().map(Arms.Arm::label).toList(),
                "control first (it stands as the run's robot), then its A/A copy");
            for (Arms.Arm a : arms) assertTrue(built.contains(a.jar()), a.label() + " is built: " + a.jar());
        }
        assertTrue(Files.isRegularFile(Path.of("top5-s0-panel.txt")), "the Stage 0 panel is committed");
        assertEquals(208, Opponent.load(Path.of("top5-s0-panel.txt")).size());
    }

    @Test
    @Tag("BENCH-94")
    @DisplayName("the factorial design is a balanced 2^(8-4) over the factorial arms, each built by pc-top5-s2.queue")
    void factorialIsBalancedAndBuilt() throws IOException {
        List<Arms.Arm> arms = Arms.parse(Path.of("plans/top5-factorial.arms"), Path.of("").toAbsolutePath());
        List<String> design = lines("plans/top5-factorial.design");
        String[] factors = design.get(0).split("\\s+");
        assertEquals(List.of("arm", "hj", "sw", "S", "G", "R", "F", "N", "T"), List.of(factors));
        assertEquals(arms.stream().map(Arms.Arm::label).toList(),
            design.subList(1, design.size()).stream().map(l -> l.split("\\s+")[0]).toList());
        Set<String> points = new HashSet<>();
        int[] highs = new int[factors.length];
        for (String l : design.subList(1, design.size())) {
            String[] f = l.split("\\s+");
            if (!f[0].equals("aa")) assertTrue(points.add(String.join("", List.of(f).subList(1, f.length))), "distinct point " + l);
            else continue;
            for (int i = 1; i < f.length; i++) if (f[i].equals("+")) highs[i]++;
            // Generators: N = hj.sw.S, F = sw.S.G, R = hj.S.G, T = hj.sw.G.
            int hj = sign(f[1]), sw = sign(f[2]), s = sign(f[3]), g = sign(f[4]);
            assertEquals(hj * sw * s, sign(f[7]), "N " + l);
            assertEquals(sw * s * g, sign(f[6]), "F " + l);
            assertEquals(hj * s * g, sign(f[5]), "R " + l);
            assertEquals(hj * sw * g, sign(f[8]), "T " + l);
        }
        assertEquals(16, points.size());
        for (int i = 1; i < factors.length; i++) assertEquals(8, highs[i], factors[i] + " is high in half the points");
        Set<Path> built = builtBy("plans/pc-top5-s2.queue");
        for (Arms.Arm a : arms) assertTrue(built.contains(a.jar()), a.label() + " is built: " + a.jar());
    }

    @Test
    @Tag("BENCH-94")
    @DisplayName("the queues end with multiarm.py, which CI tests")
    void analysisIsTested() throws IOException {
        assertTrue(Files.isRegularFile(Path.of("../data/tools/multiarm.py")));
        assertTrue(Files.readString(Path.of("../.github/workflows/build.yml")).contains("test_multiarm.py"));
        for (String q : List.of("plans/pc-top5.queue", "plans/pc-top5-s2.queue")) {
            assertTrue(Files.readString(Path.of(q)).contains("../data/tools/multiarm.py"), q);
        }
    }

    private static int sign(String s) {
        return s.equals("+") ? 1 : -1;
    }
}
