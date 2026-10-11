package hadur2.core.policy;

/**
 * RAM-1, RAM-2: recognising a robot that is simply driving at us, and the response to it, no
 * profile or gun tier needed.
 *
 * <p>RAM-2 (3.5) adds a second, battle-long verdict on top of RAM-1. A charge (the closing
 * speed held for {@link #CHARGE_TICKS} scans) that gets within {@link #RAM_RANGE} px while
 * both robots have more than {@link #MIN_ENERGY} energy is a ram; rams in
 * {@link #CONFIRM_ROUNDS} different rounds confirm a rammer for the rest of the battle (one
 * is not enough: XanderCat, spawned 190 px away, once drove straight through us at a round's
 * start). From then on, {@link #escape} answers true from the second closing scan within
 * {@link #ESCAPE_RANGE} px until the enemy is more than {@link #ESCAPE_RELEASE} px away, and
 * the movement runs ({@code move.RamEscape}). The confirmation is what keeps it off strong
 * robots: on the 3.4 benches, no top-19 robot came within 120 px on a charge with both robots
 * above 20 energy (strong bots close in only to finish a disabled Hadur), while every rammer
 * and close-range nano did in nearly every round. Detecting from range alone (4 scans within
 * 500 px) also caught them, and cost up to 15 points of share against Raven.</p>
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

    /** RAM-2: closing scans running for a charge to count toward a confirmation. */
    public static final int CHARGE_TICKS = 4;
    /** RAM-2: how close, in px, a charge must get to confirm a rammer. */
    public static final double RAM_RANGE = 120;
    /** RAM-2: the energy, for both robots, above which a close charge counts (not a finish). */
    public static final double MIN_ENERGY = 20;
    /** RAM-2: the rounds with a ram it takes to confirm a rammer. */
    public static final int CONFIRM_ROUNDS = 2;
    /** RAM-2: closing scans running, once confirmed, before the escape starts. */
    public static final int ESCAPE_TICKS = 2;
    /** RAM-2: the range, in px, within which a closing confirmed rammer starts the escape. */
    public static final double ESCAPE_RANGE = 500;
    /** RAM-2: the range, in px, beyond which the escape stops. */
    public static final double ESCAPE_RELEASE = 650;

    private int closingTicks;
    private boolean active;
    /** RAM-2: closing scans running, at any range. */
    private int chargeTicks;
    /** RAM-2: whether this battle's opponent has been confirmed as a rammer. */
    private boolean confirmed;
    /** RAM-2: rounds this battle with a ram, this one included once it has had one. */
    private int ramRounds;
    /** RAM-2: whether this round has had a ram. */
    private boolean rammedThisRound;
    /** RAM-2: whether the escape is on. */
    private boolean escaping;

    /**
     * A new round: the closing runs and the active states are forgotten; a confirmed rammer
     * stays confirmed (RAM-2).
     */
    public void newRound() {
        closingTicks = 0;
        active = false;
        chargeTicks = 0;
        escaping = false;
        rammedThisRound = false;
    }

    /** A different opponent: everything is forgotten, the confirmation included. */
    public void forget() {
        newRound();
        confirmed = false;
        ramRounds = 0;
    }

    /**
     * RAM-2: one scan's reading for the escape. Call once per scan, alongside {@link #tick}.
     *
     * @param distance the enemy's distance this scan, in px
     * @param closingSpeed the enemy's own speed toward us, in px/tick
     * @param ourEnergy our energy
     * @param enemyEnergy the enemy's energy
     * @return whether the escape is on after this scan
     */
    public boolean escape(double distance, double closingSpeed, double ourEnergy,
                          double enemyEnergy) {
        chargeTicks = closingSpeed >= CLOSING_RATE ? chargeTicks + 1 : 0;
        if (!rammedThisRound && chargeTicks >= CHARGE_TICKS && distance < RAM_RANGE
                && ourEnergy > MIN_ENERGY && enemyEnergy > MIN_ENERGY) {
            rammedThisRound = true;
            ramRounds++;
            if (!confirmed && ramRounds >= CONFIRM_ROUNDS) {
                confirmed = true;
                escaping = true;
            }
        }
        if (confirmed && chargeTicks >= ESCAPE_TICKS && distance <= ESCAPE_RANGE) {
            escaping = true;
        } else if (distance > ESCAPE_RELEASE) {
            escaping = false;
        }
        return escaping;
    }

    /** RAM-3: whether this round has had a ram (a charge within {@link #RAM_RANGE} px). */
    public boolean rammedThisRound() {
        return rammedThisRound;
    }

    /** RAM-2: whether this battle's opponent has been confirmed as a rammer. */
    public boolean confirmed() {
        return confirmed;
    }

    /** RAM-2: whether the escape is on, as of the last {@link #escape}. */
    public boolean escaping() {
        return escaping;
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
