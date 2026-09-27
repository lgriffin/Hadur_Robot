package hadur2.core.adapt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SeedLoaderTest {

    static List<double[]> samples(int n) {
        List<double[]> out = new ArrayList<>();
        for (int i = 0; i < n; i++) out.add(new double[] {i});
        return out;
    }

    @Test
    @Tag("ADAPT-3")
    @DisplayName("the whole seed goes in, a bounded number per tick, oldest first")
    void loadsInBoundedSteps() {
        List<double[]> gun = new ArrayList<>();
        List<double[]> surf = new ArrayList<>();
        SeedLoader l = new SeedLoader(samples(600), samples(300), gun::add, surf::add);
        int ticks = 0;
        while (!l.done()) {
            int n = l.step();
            assertTrue(n > 0 && n <= SeedLoader.PER_TICK, "step " + n);
            ticks++;
        }
        assertEquals(600, gun.size());
        assertEquals(300, surf.size());
        assertEquals(18, ticks, "900 samples at 50 a tick");
        for (int i = 0; i < 600; i++) assertEquals(i, gun.get(i)[0]);
        assertEquals(0, l.step());
    }
}
