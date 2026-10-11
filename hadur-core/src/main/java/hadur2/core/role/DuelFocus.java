package hadur2.core.role;

import java.util.Map;

/**
 * The one opponent the duel fights while several are alive and melee is vetoed (GATE-3,
 * GATE-4): the closest when the duel takes over, kept until it dies, so the duel's model of
 * its enemy is always about one robot.
 */
public final class DuelFocus {

    private String target;

    /** The focused opponent, or null while none is known. */
    public String target() {
        return target;
    }

    /**
     * Keeps the focus while it is among {@code alive} (opponent name to distance, sentries
     * left out); otherwise focuses the closest of them. Returns the focus, or null if none.
     */
    public String update(Map<String, Double> alive) {
        if (target != null && alive.containsKey(target)) return target;
        target = null;
        double best = Double.POSITIVE_INFINITY;
        for (Map.Entry<String, Double> e : alive.entrySet()) {
            if (e.getValue() < best) {
                best = e.getValue();
                target = e.getKey();
            }
        }
        return target;
    }

    /** {@code name} died; if it was the focus, the next update chooses again. */
    public void died(String name) {
        if (name.equals(target)) target = null;
    }

    /** Forgets the focus, when a round starts or melee takes back over. */
    public void clear() {
        target = null;
    }
}
