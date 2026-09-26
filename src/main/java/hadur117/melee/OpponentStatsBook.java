package hadur117.melee;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Battle-long store of {@link OpponentStats}. Robocode keeps static fields alive
 * between rounds, so these statistics survive every round of a battle.
 */
public final class OpponentStatsBook {

    private static final Map<String, OpponentStats> STATS = new LinkedHashMap<>();

    private OpponentStatsBook() {}

    public static OpponentStats get(String name) {
        return STATS.computeIfAbsent(name, OpponentStats::new);
    }

    public static Collection<OpponentStats> all() {
        return STATS.values();
    }

    /** Forgets everything; only for starting a fresh battle in tests. */
    public static void clear() {
        STATS.clear();
    }
}
