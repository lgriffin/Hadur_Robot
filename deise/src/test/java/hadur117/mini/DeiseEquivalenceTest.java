package hadur117.mini;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.mini.harness.MiniWorld;
import hadur117.mini.harness.Scenarios;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The shipped class is the core flattened by hand, so it is held to the core here: the shipped
 * {@link Deise} and the bench adapter {@link DeiseLab}, which calls the core, are run through
 * the same melees and must give the same orders, to the bit, tick by tick (DEISE-16).
 * {@code DeiseJarIT} runs the same comparison on the shipped and lab jars. The playouts here are
 * deterministic (each row the enemies fill holds one successor), so every playout of an aim votes
 * alike and the thin-row weight (DEISE-8) cannot change the argmax: {@code GunTest} covers it on
 * the core.
 */
class DeiseEquivalenceTest {

    static URL classes() throws Exception {
        return Path.of("target/classes").toUri().toURL();
    }

    /**
     * Runs both builds through every scenario and compares their orders.
     *
     * @param deise where the shipped class is loaded from
     * @param lab where the bench adapter is loaded from
     * @throws Exception if a robot cannot be made
     */
    static void assertSameOrders(URL deise, URL lab) throws Exception {
        for (String scenario : List.of("lowLeft", "highRight", "crowd")) {
            MiniWorld shipped = world(scenario, "hadur117.mini.Deise", deise);
            MiniWorld bench = world(scenario, "hadur117.mini.DeiseLab", lab);
            List<String> a = shipped.run(Scenarios.TICKS);
            List<String> b = bench.run(Scenarios.TICKS);
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                assertEquals(b.get(i), a.get(i), scenario + ": order " + i + " differs, after " + lastTick(a, i));
            }
            assertEquals(b.size(), a.size(), scenario + ": order counts differ");
            assertTrue(maxCount(shipped.robotClass) >= 8, scenario + ": no Markov row warmed, so DEISE-8 was not compared");
            assertTrue(shipped.shots > 10, scenario + ": the gun should fire, fired " + shipped.shots);
            assertTrue(waves(shipped.robotClass) > 3, scenario + ": no seen-shot waves, so DEISE-5 was not compared");
        }
    }

    static MiniWorld world(String scenario, String robot, URL from) throws Exception {
        switch (scenario) {
            case "lowLeft": return Scenarios.lowLeft(robot, from);
            case "highRight": return Scenarios.highRight(robot, from);
            default: return Scenarios.crowd(robot, from);
        }
    }

    static String lastTick(List<String> orders, int i) {
        for (int j = i; j >= 0; j--) {
            if (orders.get(j).startsWith("tick ")) return orders.get(j);
        }
        return "run()";
    }

    static int waves(Class<?> robot) throws Exception {
        java.lang.reflect.Field f = robot.getDeclaredField("wave");
        f.setAccessible(true);
        return f.getInt(null);
    }

    static int maxCount(Class<?> robot) throws Exception {
        java.lang.reflect.Field f = robot.getDeclaredField("markov");
        f.setAccessible(true);
        char[][][] markov = (char[][][]) f.get(null);
        int max = 0;
        for (char[][] table : markov) {
            for (char[] row : table) max = Math.max(max, row[row.length - 1]);
        }
        return max;
    }

    @Test
    @Tag("DEISE-16")
    @DisplayName("the shipped class gives the core-driven adapter's orders, to the bit")
    void shippedClassMatchesTheCore() throws Exception {
        assertSameOrders(classes(), classes());
    }
}
