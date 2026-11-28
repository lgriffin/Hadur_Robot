package hadur117.core.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** TIME-12: {@link TickMap} holds and iterates exactly as {@code HashMap<Long, RobotState>}. */
class TickMapTest {

    private static RobotState at(long t) {
        return RobotState.newBuilder().setTime(t).build();
    }

    private static List<Long> order(TickMap m) {
        List<Long> out = new ArrayList<>();
        m.forEach((k, v) -> out.add(k));
        return out;
    }

    private static void same(Map<Long, RobotState> ref, TickMap m) {
        assertEquals(new ArrayList<>(ref.keySet()), order(m));
        assertEquals(ref.size(), m.size());
        List<RobotState> vals = new ArrayList<>();
        m.forEach((k, v) -> vals.add(v));
        assertEquals(new ArrayList<>(ref.values()), vals);
    }

    @Test
    @Tag("TIME-12")
    void randomOperationsMatchHashMap() {
        for (int seed = 0; seed < 200; seed++) {
            Random r = new Random(seed);
            Map<Long, RobotState> ref = new HashMap<>();
            TickMap m = new TickMap();
            // Mostly runs of ticks, as the logs see, with jumps, repeats, removals and clears.
            long t = r.nextInt(3) == 0 ? r.nextInt(70_000) : 0;
            int ops = 50 + r.nextInt(12_000);
            for (int i = 0; i < ops; i++) {
                int op = r.nextInt(100);
                if (op < 80) {
                    t += r.nextInt(10) == 0 ? r.nextInt(400) - 100 : 1;
                    if (t < 0) t = 0;
                    RobotState s = at(t);
                    ref.put(t, s);
                    m.put(t, s);
                } else if (op < 92 && !ref.isEmpty()) {
                    long k = r.nextBoolean() ? m.minKey() : t - r.nextInt(50);
                    if (r.nextBoolean()) assertEquals(java.util.Collections.min(ref.keySet()), m.minKey());
                    ref.remove(k);
                    m.remove(k);
                } else if (op < 99) {
                    long k = t - r.nextInt(60);
                    assertEquals(ref.get(k), m.get(k));
                } else {
                    ref.clear();
                    m.clear();
                    t = 0;
                }
            }
            same(ref, m);
        }
    }

    @Test
    @Tag("TIME-12")
    void collidingChainsResizeAsHashMapDoes() {
        // Keys 16 apart share a bucket in a small table: a chain of 8 resizes a table under 64.
        Map<Long, RobotState> ref = new HashMap<>();
        TickMap m = new TickMap();
        for (long k = 0; k < 20; k++) {
            RobotState s = at(k * 16);
            ref.put(k * 16, s);
            m.put(k * 16, s);
            same(ref, m);
        }
    }

    @Test
    @Tag("TIME-12")
    void largeKeysSpreadAsHashMapDoes() {
        Map<Long, RobotState> ref = new HashMap<>();
        TickMap m = new TickMap();
        for (long k = 60_000; k < 70_000; k += 3) {
            RobotState s = at(k);
            ref.put(k, s);
            m.put(k, s);
        }
        same(ref, m);
    }
}
