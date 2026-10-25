package hadur117.micro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.micro.harness.MiniWorld;
import hadur117.micro.harness.Scenarios;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The shipped class is the core flattened by hand, so it is held to the core here: the micro
 * adapter ({@link Saor}) and the bench adapter ({@link SaorLab}, which calls the core) are run
 * through the same melees and must give the same orders, to the bit, tick by tick (SAOR-15).
 * {@code SaorJarIT} runs the same comparison on the shipped and lab jars.
 */
class SaorEquivalenceTest {

    static URL classes() throws Exception {
        return Path.of("target/classes").toUri().toURL();
    }

    /**
     * Runs both adapters through both scenarios and compares their orders.
     *
     * @param saor where the micro adapter is loaded from
     * @param lab where the bench adapter is loaded from
     * @throws Exception if a robot cannot be made
     */
    static void assertSameOrders(URL saor, URL lab) throws Exception {
        for (String scenario : List.of("lowLeft", "highRight", "learned7", "learned8")) {
            MiniWorld micro = world(scenario, "hadur117.micro.Saor", saor);
            MiniWorld bench = world(scenario, "hadur117.micro.SaorLab", lab);
            int ticks = scenario.equals("lowLeft") ? Scenarios.LOW_LEFT_TICKS : Scenarios.TICKS;
            List<String> a = micro.run(ticks);
            List<String> b = bench.run(ticks);
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                assertEquals(b.get(i), a.get(i), scenario + ": order " + i + " differs, after " + lastTick(a, i));
            }
            assertEquals(b.size(), a.size(), scenario + ": order counts differ");
            assertTrue(maxCount(micro.robotClass) >= 8, scenario + ": no Markov row warmed, so SAOR-7 was not compared");
            assertTrue(micro.shots > 10, scenario + ": the gun should fire, fired " + micro.shots);
        }
    }

    static MiniWorld world(String scenario, String robot, URL from) throws Exception {
        switch (scenario) {
            case "lowLeft": return Scenarios.lowLeft(robot, from);
            case "highRight": return Scenarios.highRight(robot, from);
            default: return Scenarios.learned(robot, scenario.endsWith("7") ? 7 : 8, from);
        }
    }

    static String lastTick(List<String> orders, int i) {
        for (int j = i; j >= 0; j--) {
            if (orders.get(j).startsWith("tick ")) return orders.get(j);
        }
        return "run()";
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
    @Tag("SAOR-15")
    @DisplayName("the micro adapter gives the bench adapter's orders, to the bit")
    void microAdapterMatchesTheCore() throws Exception {
        assertSameOrders(classes(), classes());
    }

    @Test
    @Tag("SAOR-6")
    @Tag("SAOR-7")
    @DisplayName("8 samples switch the gun from circular to learned, so the two scenarios aim apart")
    void theLearnedRowChangesTheAim() throws Exception {
        List<String> cold = Scenarios.learned("hadur117.micro.Saor", 7, classes()).run(Scenarios.TICKS);
        List<String> warm = Scenarios.learned("hadur117.micro.Saor", 8, classes()).run(Scenarios.TICKS);
        assertTrue(!cold.equals(warm), "7 and 8 samples gave the same orders");
    }
}
