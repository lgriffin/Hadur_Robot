package hadur2.core.policy;

/**
 * RAM-1: recognising a robot that is simply driving at us, and the response to it, no
 * profile or gun tier needed.
 *
 * <p>While the enemy's own speed toward us is at {@link #CLOSING_RATE} px/tick or more for
 * {@link #TICKS} scans running, within {@link #RANGE} px, the response is active: fire full
 * power ({@link #POWER}), capped and gated the same way the other full-power rules are
 * ({@code PowerPolicy}), and reverse the orbit's side rather than the one the wall-smoothed
 * heading would otherwise pick ({@code SurfMover}). Once active, it stays active while the
 * enemy is still within {@link #RANGE} (a rammer does not stop being dangerous the one tick
 * its closing rate dips), and clears once it backs out past that range.</p>
 *
 * <p>The rate is the enemy's own velocity resolved onto the line from them to us, not the
 * raw change in distance between scans: distance also moves with our own approach or retreat,
 * and a raw delta divided by nothing is wrong whenever a scan is missed and the gap between
 * two readings is more than one tick. Velocity is already a per-tick quantity, so no division
 * by elapsed ticks is needed once it is used instead.</p>
 *
 * <p>Where it sits in the tick: {@code HadurCore} calls {@link #tick} with each scan's
 * distance and the enemy's closing speed; while it returns true, the bullet power is raised
 * toward {@link #POWER} (never past what {@code PowerPolicy}'s own energy and quarter-energy
 * caps allow) and {@code SurfMover.setRammerActive(true)} flips the no-wave orbit's chosen
 * side. A rammer rarely gives the gun a real firing wave to surf, so the flip applies to the
 * plain orbit, not to wave surfing itself. {@link #newRound()} forgets the run.</p>
 */
public final class RammerPolicy {

    /** The closing speed, in px/tick, that counts as a charge. */
    public static final double CLOSING_RATE = 6.0;
    /** How many scans running the closing rate must hold before the response activates. */
    public static final int TICKS = 10;
    /** The range, in px, within which a charge counts, and outside which the response clears. */
    public static final double RANGE = 250;
    /** The power fired while the response is active. */
    public static final double POWER = 3.0;

    private int closingTicks;
    private boolean active;

    /** A new round: the closing run and the active state are forgotten. */
    public void newRound() {
        closingTicks = 0;
        active = false;
    }

    /**
     * One scan's reading.
     *
     * @param distance the enemy's distance this scan, in px
     * @param closingSpeed the enemy's own speed toward us this scan, in px/tick (their
     *     velocity resolved onto the line from them to us; negative while they recede)
     * @return whether the response is active after this scan
     */
    public boolean tick(double distance, double closingSpeed) {
        boolean closing = closingSpeed >= CLOSING_RATE && distance <= RANGE;
        closingTicks = closing ? closingTicks + 1 : 0;
        if (closingTicks >= TICKS) active = true;
        else if (distance > RANGE) active = false;
        return active;
    }

    /** Whether the response is active, as of the last {@link #tick}. */
    public boolean active() {
        return active;
    }
}
