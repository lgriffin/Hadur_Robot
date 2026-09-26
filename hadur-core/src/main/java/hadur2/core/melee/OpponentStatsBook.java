package hadur2.core.melee;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Battle-long store of {@link OpponentStats}. The core lives for the whole battle, so these
 * statistics survive every round. It holds at most {@link #MAX_OPPONENTS} names (RES-2);
 * past that, a new name shares a throwaway entry rather than growing the book.
 */
public final class OpponentStatsBook {

    /** Far more than any rumble battle holds (MeleeRumble runs 10 robots). */
    static final int MAX_OPPONENTS = 64;

    private final Map<String, OpponentStats> stats = new LinkedHashMap<>();

    public OpponentStats get(String name) {
        OpponentStats s = stats.get(name);
        if (s != null) return s;
        s = new OpponentStats(name);
        if (stats.size() < MAX_OPPONENTS) stats.put(name, s);
        return s;
    }

    public Collection<OpponentStats> all() {
        return stats.values();
    }
}
