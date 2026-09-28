package hadur2.core.policy;

/**
 * RAM-1: recognising a robot that is simply driving at us, and the response to it, no
 * profile or gun tier needed.
 *
 * <p>While the enemy's distance has closed at {@link #CLOSING_RATE} px/tick or more for
 * {@link #TICKS} scans running, within {@link #RANGE} px, the response is active: fire full
 * power ({@link #POWER}) whatever the gun or the other power rules would choose, and reverse
 * the orbit's side rather than the one the wall-smoothed heading would otherwise pick
 * ({@code SurfMover}). Once active, it stays active while the enemy is still within
 * {@link #RANGE} (a rammer does not stop being dangerous the one tick its closing rate dips),
 * and clears once it backs out past that range.</p>
 *
 * <p>Where it sits in the tick: {@code HadurCore} calls {@link #tick} with each scan's
 * distance; while it returns true, the bullet power is set to {@link #POWER} directly and
 * {@code SurfMover.setRammerActive(true)} flips the no-wave orbit's chosen side. A rammer
 * rarely gives the gun a real firing wave to surf, so the flip applies to the plain orbit,
 * not to wave surfing itself. {@link #newRound()} forgets the run.</p>
 */
public final class RammerPolicy {

    /** The closing rate, in px/tick, that counts as a charge. */
    public static final double CLOSING_RATE = 6.0;
    /** How many scans running the closing rate must hold before the response activates. */
    public static final int TICKS = 10;
    /** The range, in px, within which a charge counts, and outside which the response clears. */
    public static final double RANGE = 250;
    /** The power fired while the response is active. */
    public static final double POWER = 3.0;

    private double lastDistance = Double.NaN;
    private int closingTicks;
    private boolean active;

    /** A new round: the closing run, the distance baseline and the active state are forgotten. */
    public void newRound() {
        lastDistance = Double.NaN;
        closingTicks = 0;
        active = false;
    }

    /**
     * One scan's distance reading.
     *
     * @param distance the enemy's distance this scan, in px
     * @return whether the response is active after this scan
     */
    public boolean tick(double distance) {
        if (!Double.isNaN(lastDistance)) {
            double closingRate = lastDistance - distance;
            boolean closing = closingRate >= CLOSING_RATE && distance <= RANGE;
            closingTicks = closing ? closingTicks + 1 : 0;
        }
        lastDistance = distance;
        if (closingTicks >= TICKS) active = true;
        else if (distance > RANGE) active = false;
        return active;
    }

    /** Whether the response is active, as of the last {@link #tick}. */
    public boolean active() {
        return active;
    }
}
