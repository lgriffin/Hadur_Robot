package hadur2.core.role;

import hadur2.core.model.RoundStats;

/** What a role is told when a round starts (A2): its number and the round's counters. */
public final class RoundFacts {

    private final int round;
    private final RoundStats stats;

    /**
     * @param round the round number, from 0
     * @param stats the round's counters, which every role fills in
     */
    public RoundFacts(int round, RoundStats stats) {
        this.round = round;
        this.stats = stats;
    }

    public int round() {
        return round;
    }

    public RoundStats stats() {
        return stats;
    }
}
