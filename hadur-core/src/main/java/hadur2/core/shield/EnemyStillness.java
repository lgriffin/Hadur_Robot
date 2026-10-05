package hadur2.core.shield;

/**
 * SHIELD-3, SHIELD-4: whether the enemy has moved, read from its scans.
 *
 * <p>A bullet shielder opens a round standing still, so two questions matter: has it moved at
 * all since the round began (SHIELD-3: a bullet of ours destroyed by an enemy that has not
 * moved is a shield, not an accident of two robots that both fired), and has it moved in the
 * last {@link #STILL_TICKS} ticks (SHIELD-4: only a still shielder can be shot at full power
 * and be sure to meet its predictable reply). An enemy has moved on a scan when its velocity
 * is not zero or its position differs from the previous scan's by more than
 * {@link #TOLERANCE} px, and, for the whole-round question, when its position differs from
 * where it was first seen.</p>
 *
 * <p>The history is only known from a round's start. {@link #forget} (a recovery, or the
 * duel taking over in mid-round) marks the enemy as having moved, so neither rule fires on
 * a guess.</p>
 */
public final class EnemyStillness {

    /** SHIELD-4: the enemy must have been still for this many ticks. */
    public static final long STILL_TICKS = 10;
    /** The distance, in px, below which two positions are the same: scan rounding, nothing more. */
    public static final double TOLERANCE = 0.5;

    private boolean seen;
    private boolean moved = true;
    private double startX;
    private double startY;
    private double lastX;
    private double lastY;
    private long lastMoveTime;

    /** A round begins: the enemy has not moved yet and has not been seen. */
    public void newRound() {
        seen = false;
        moved = false;
        lastMoveTime = 0;
    }

    /** The history is unknown from here: the enemy counts as having moved. */
    public void forget() {
        seen = false;
        moved = true;
        lastMoveTime = 0;
    }

    /**
     * One scan of the enemy.
     *
     * @param time the tick
     * @param x the enemy's x
     * @param y the enemy's y
     * @param velocity the enemy's velocity
     */
    public void scanned(long time, double x, double y, double velocity) {
        if (!seen) {
            seen = true;
            startX = x;
            startY = y;
            lastX = x;
            lastY = y;
            // Still from the tick it was first seen, unless this scan already shows it moving.
            lastMoveTime = time;
            if (velocity != 0) markMoved(time);
            return;
        }
        boolean nowMoving = velocity != 0 || Math.hypot(x - lastX, y - lastY) > TOLERANCE;
        lastX = x;
        lastY = y;
        if (nowMoving) markMoved(time);
        if (Math.hypot(x - startX, y - startY) > TOLERANCE) moved = true;
    }

    private void markMoved(long time) {
        moved = true;
        lastMoveTime = time;
    }

    /** SHIELD-3: whether the enemy has moved since the round began (true when that is not known). */
    public boolean movedThisRound() {
        return moved;
    }

    /**
     * SHIELD-4: whether the enemy has not moved in the last {@link #STILL_TICKS} ticks. Before
     * its first scan of the round, and after {@link #forget} until a scan shows it still for
     * that long, it has not.
     *
     * @param time the tick now
     * @return whether it has been still for {@link #STILL_TICKS} ticks
     */
    public boolean stillForTenTicks(long time) {
        return seen && time - lastMoveTime >= STILL_TICKS;
    }
}
