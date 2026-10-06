package hadur2.core.policy;

import hadur2.core.memory.Estimate;

/**
 * POW-11: one robot's battle-long hit counts in three bullet power classes and over all its
 * bullets, each with its margin of error. {@code DuelController} keeps two, ours (each of our
 * duel bullets that hit, missed or was shot down) and theirs (each enemy bullet that broke on
 * us or met one of ours), and clears them only when a different robot becomes the duel
 * opponent. Unlike {@link HitWindow} they never forget, which is what lets {@link PowerPolicy}
 * (POW-7) tell a 10% gun from a 12.5% break-even within a few rounds: the 100-outcome window's
 * margin is about 6 points, a battle's is under 2.
 *
 * <p>The classes are light (under {@value #LIGHT_BELOW}), medium ({@value #LIGHT_BELOW} to
 * {@value #HEAVY_ABOVE}) and heavy (above {@value #HEAVY_ABOVE}). The margin is the codebase's
 * own, {@link Estimate}'s Agresti-Coull one.</p>
 *
 * <p>Counts are plain ints and the object is a fixed six numbers, so growth is bounded
 * (RES-2). Every method is pure bookkeeping; nothing here reads a clock (DIAL-2).</p>
 */
public final class BattleHitRates {

    /** The number of power classes. */
    public static final int CLASSES = 3;
    /** The light class holds powers below this. */
    public static final double LIGHT_BELOW = 0.2;
    /** The heavy class holds powers above this. */
    public static final double HEAVY_ABOVE = 1.2;

    private final int[] shots = new int[CLASSES];
    private final int[] hits = new int[CLASSES];

    /**
     * The class of a bullet power.
     *
     * @param power a bullet power
     * @return 0 for light, 1 for medium, 2 for heavy; NaN reads as medium
     */
    public static int classOf(double power) {
        if (power < LIGHT_BELOW) return 0;
        if (power > HEAVY_ABOVE) return 2;
        return 1;
    }

    /**
     * Counts one resolved bullet.
     *
     * @param power the bullet's power
     * @param hit whether it hit (a bullet shot down, or one that left the field, did not)
     */
    public void record(double power, boolean hit) {
        int c = classOf(power);
        shots[c]++;
        if (hit) hits[c]++;
    }

    /** Forgets every count, when the duel opponent changes. */
    public void clear() {
        java.util.Arrays.fill(shots, 0);
        java.util.Arrays.fill(hits, 0);
    }

    /**
     * Bullets counted in one class.
     *
     * @param powerClass 0 to {@link #CLASSES} - 1
     * @return the count
     */
    public int shots(int powerClass) {
        return shots[powerClass];
    }

    /**
     * Hits counted in one class.
     *
     * @param powerClass 0 to {@link #CLASSES} - 1
     * @return the count, never more than {@link #shots(int)}
     */
    public int hits(int powerClass) {
        return hits[powerClass];
    }

    /**
     * Bullets counted over all classes.
     *
     * @return the count
     */
    public int shots() {
        int n = 0;
        for (int s : shots) n += s;
        return n;
    }

    /**
     * Hits counted over all classes.
     *
     * @return the count
     */
    public int hits() {
        int n = 0;
        for (int h : hits) n += h;
        return n;
    }

    /**
     * One class's hit rate and its margin.
     *
     * @param powerClass 0 to {@link #CLASSES} - 1
     * @return the estimate; {@link Estimate#NONE} before any bullet in the class
     */
    public Estimate estimate(int powerClass) {
        return Estimate.of(hits[powerClass], shots[powerClass]);
    }

    /**
     * The hit rate over all bullets and its margin.
     *
     * @return the estimate; {@link Estimate#NONE} before any bullet
     */
    public Estimate estimate() {
        return Estimate.of(hits(), shots());
    }
}
