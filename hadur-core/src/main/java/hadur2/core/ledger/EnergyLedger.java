package hadur2.core.ledger;

import hadur2.core.physics.Rules;
import java.util.Arrays;

/**
 * Explains the enemy's energy changes between two scans, so that only a drop the enemy
 * spent on a bullet becomes a wave (WAVE-1, WAVE-2).
 *
 * <p>Between scans the enemy's energy moves for four reasons besides firing: our bullets
 * hit it, its bullets hit us (it gains 3 × power), it hits a wall, or the robots collide.
 * The events for the first two and the last arrive in the same tick as the scan that
 * shows their effect, and are processed before it, so they are held here until the scan.
 * Wall hits have no event; they show as the enemy's velocity dropping to zero faster
 * than it can brake, next to a wall.</p>
 *
 * <p>1.20 read every raw drop in [0.1, 3.0] as a shot. Drops the ledger explains away
 * are counted as phantom waves; drops it recovers from outside that range as hidden
 * shots.</p>
 *
 * <p>Where it sits in the tick: {@code HadurCore} feeds it {@link #ourBulletHit},
 * {@link #enemyBulletHitUs} and {@link #robotsCollided} from the tick's events, then calls
 * {@link #scan} with the duel opponent's scan. A {@link Reading} whose {@link Reading#shot()}
 * is true becomes the enemy's firing wave at power {@link Reading#corrected()}, and also
 * heats the enemy's gun in the END-1 estimate. {@link #newRound()} clears it at each round's
 * start and when a melee ends and the duel's tracking starts again.</p>
 *
 * <p>The sign convention is the drop's: a positive {@code raw} or {@code corrected} value
 * is energy the enemy lost. All energies are in the engine's energy points. The ledger may
 * depend only on the engine's rules ({@link Rules}), so nothing the gun or the movement
 * thinks can change which drops become waves ({@code ArchitectureTest.ledgerIsLeaf}). It
 * holds a fixed handful of fields, so nothing in it grows over a battle.</p>
 */
public final class EnergyLedger {

    /** WAVE-2's lower bound: the weakest bullet, 0.1 energy. */
    public static final double MIN_SHOT = Rules.MIN_BULLET_POWER;
    /** WAVE-2's upper bound: the strongest bullet, 3.0 energy. */
    public static final double MAX_SHOT = Rules.MAX_BULLET_POWER;
    /** A robot touching a wall has its centre half a robot (18 px) from it; allow for scan rounding. */
    static final double WALL_MARGIN = 18 + 1.0;

    /**
     * One scan's reading. {@code corrected} is the part of the drop spent on a bullet.
     *
     * <p>{@code phantom} and {@code hidden} compare the ledger with 1.20's rule (every raw
     * drop in [0.1, 3.0] is a shot): a phantom is a drop 1.20 would have surfed that the
     * ledger explained away; a hidden shot is one the ledger found that 1.20 would have
     * missed. The core counts both in the round statistics.</p>
     */
    public static final class Reading {
        private final double raw;
        private final double corrected;
        private final double wallDamage;
        private final boolean shot;
        private final boolean phantom;
        private final boolean hidden;

        /**
         * A reading as {@link EnergyLedger#scan} makes it.
         *
         * @param raw the energy lost since the last scan, as read
         * @param corrected the loss left once hits, refunds, collisions and wall damage are taken out
         * @param wallDamage the wall damage inferred for this interval, or 0
         * @param shot whether {@code corrected} is a bullet's power (WAVE-2)
         * @param phantom whether {@code raw} looked like a shot but {@code corrected} is not
         * @param hidden whether {@code corrected} is a shot but {@code raw} did not look like one
         */
        public Reading(double raw, double corrected, double wallDamage, boolean shot, boolean phantom, boolean hidden) {
            this.raw = raw;
            this.corrected = corrected;
            this.wallDamage = wallDamage;
            this.shot = shot;
            this.phantom = phantom;
            this.hidden = hidden;
        }

        /** The energy the enemy lost since the last scan, as read (negative if it gained), in energy. */
        public double raw() {
            return raw;
        }

        /** The loss the ledger could not explain, in energy: the bullet power when {@link #shot()} is true. */
        public double corrected() {
            return corrected;
        }

        /** The wall damage the ledger inferred for this interval, in energy, or 0 if none. */
        public double wallDamage() {
            return wallDamage;
        }

        /** Whether the corrected drop is a bullet's power, in [0.1, 3.0] (WAVE-2), so a firing wave is due. */
        public boolean shot() {
            return shot;
        }

        /** Whether the raw drop would have been a shot to 1.20 but the ledger explained it away. */
        public boolean phantom() {
            return phantom;
        }

        /** Whether the ledger found a shot that the raw drop, outside [0.1, 3.0], hid. */
        public boolean hidden() {
            return hidden;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Reading)) return false;
            Reading that = (Reading) o;
            return Double.compare(raw, that.raw) == 0
                && Double.compare(corrected, that.corrected) == 0
                && Double.compare(wallDamage, that.wallDamage) == 0
                && shot == that.shot
                && phantom == that.phantom
                && hidden == that.hidden;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(raw, corrected, wallDamage, shot, phantom, hidden);
        }

        @Override
        public String toString() {
            return "Reading[raw=" + raw + ", corrected=" + corrected + ", wallDamage=" + wallDamage + ", shot=" + shot + ", phantom=" + phantom + ", hidden=" + hidden + "]";
        }

        /** The reading for a round's first scan: nothing to compare with, so no shot. */
        static final Reading FIRST = new Reading(0, 0, 0, false, false, false);
    }

    /** The field's size, in px, for telling whether the enemy is next to a wall. */
    private final double fieldWidth;
    private final double fieldHeight;
    /** Whether a scan has set the baseline since the last {@link #newRound()}. */
    private boolean seen;
    /** The last scan's energy, velocity (px/tick, signed) and tick. */
    private double lastEnergy;
    private double lastVelocity;
    private long lastTime;
    /**
     * Corrections held since the last scan, in energy: damage our bullets did, the refund
     * the enemy got for hitting us, and collision damage. Each is cleared by the next scan.
     */
    private double ourDamage;
    private double theirRefund;
    private double collisionDamage;

    /**
     * A ledger for a field of the given size.
     *
     * @param fieldWidth the field's width, in px
     * @param fieldHeight the field's height, in px
     */
    public EnergyLedger(double fieldWidth, double fieldHeight) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
    }

    /** Forgets the last scan; the next scan only sets the baseline. */
    public void newRound() {
        seen = false;
        ourDamage = 0;
        theirRefund = 0;
        collisionDamage = 0;
    }

    /**
     * One of our bullets of {@code power} hit the enemy (WAVE-1): its damage,
     * {@link Rules#getBulletDamage(double)}, is part of the next drop.
     *
     * @param power the bullet's power, in energy
     */
    public void ourBulletHit(double power) {
        ourDamage += Rules.getBulletDamage(power);
    }

    /**
     * An enemy bullet of {@code power} hit us; the enemy gains 3 × power (WAVE-1). The
     * refund can cancel a shot on the same tick out of the raw drop, so it is added back.
     *
     * @param power the enemy bullet's power, in energy
     */
    public void enemyBulletHitUs(double power) {
        theirRefund += Rules.getBulletHitBonus(power);
    }

    /** The robots collided; each loses {@link Rules#ROBOT_HIT_DAMAGE}. */
    public void robotsCollided() {
        collisionDamage += Rules.ROBOT_HIT_DAMAGE;
    }

    /**
     * Reads the enemy's energy from a scan at {@code time}. The enemy is at ({@code x},
     * {@code y}) moving at {@code velocity}.
     *
     * <p>The drop since the last scan is corrected in this order (WAVE-1): our bullets'
     * damage and collision damage are taken off it, the enemy's refund for hitting us is
     * added back to it, and then any wall damage is taken off. What is left is a shot only
     * if it lies in [0.1, 3.0] (WAVE-2). The held corrections are cleared either way, so each
     * applies to one scan only.</p>
     *
     * @param time the scan's tick
     * @param energy the enemy's energy
     * @param velocity the enemy's velocity, in px/tick (signed)
     * @param x the enemy's x, in px
     * @param y the enemy's y, in px
     * @return the reading; {@code Reading.FIRST} (no shot) for a round's first scan
     */
    public Reading scan(long time, double energy, double velocity, double x, double y) {
        if (!seen) {
            // Nothing to compare with: this scan is only the baseline.
            seen = true;
            remember(time, energy, velocity);
            return Reading.FIRST;
        }
        // Ticks since the last scan: more than 1 when scans were missed. The wall test
        // needs it to tell braking from a crash.
        long elapsed = Math.max(1, time - lastTime);
        double raw = lastEnergy - energy;
        double explained = raw - ourDamage + theirRefund - collisionDamage;
        // A collision can stop the enemy as dead as a wall can, and the two cannot be told
        // apart, so no wall hit is inferred on a scan that follows a collision.
        double wall = collisionDamage == 0
            ? wallDamage(explained, lastVelocity, velocity, x, y, elapsed) : 0;
        double corrected = explained - wall;
        boolean rawShot = isShot(raw);
        boolean shot = isShot(corrected);
        remember(time, energy, velocity);
        return new Reading(raw, corrected, wall, shot, rawShot && !shot, shot && !rawShot);
    }

    /**
     * Energies arrive as doubles, so a 0.1 shot can read as 0.09999999999999998. Drops are
     * compared with this much slack; it is far below the 0.1 step between bullet powers.
     */
    static final double EPSILON = 1e-6;

    /**
     * WAVE-2: only a corrected drop in [0.1, 3.0] is a bullet. The bounds are
     * {@link #MIN_SHOT} and {@link #MAX_SHOT}, widened by {@code EPSILON} for rounding.
     *
     * @param drop an energy loss, in energy
     * @return whether a bullet of that power could have caused it
     */
    public static boolean isShot(double drop) {
        return drop >= MIN_SHOT - EPSILON && drop <= MAX_SHOT + EPSILON;
    }

    /**
     * Damage from a wall hit since the last scan, {@code elapsed} ticks ago, or 0.
     * {@code unexplained} is the drop left after the other corrections.
     *
     * <p>A robot brakes by at most 2 per tick, so stopping dead next to a wall means it hit
     * the wall unless it could have braked in the time since the last scan. The engine
     * applies each tick's acceleration before it checks walls, so the speed at impact is
     * anywhere from {@code elapsed} faster to {@code 2 × elapsed} slower than last scanned,
     * and the damage differs by 0.5 per step. Energy alone can't always say which, so, in
     * order:</p>
     * <ol>
     * <li>if the enemy is not stopped now, was already stopped at the last scan, or is not
     *     within {@link #WALL_MARGIN} of a wall, there was no wall hit;</li>
     * <li>if it could have braked to a stop legally over a scan gap (more than one tick), no
     *     wall hit is assumed, even if a wall hit would explain the drop;</li>
     * <li>a speed whose damage explains the whole drop is taken (no shot): that step is far
     *     likelier than a shot of exactly that power fired as the enemy struck the wall;</li>
     * <li>if it could have braked in the single tick (it was doing 2 px/tick or less), no
     *     wall hit is assumed;</li>
     * <li>otherwise the speed nearest the scanned one that leaves a legal bullet power is
     *     taken, so a shot fired at the wall still becomes a wave, if possibly 0.5 off;</li>
     * <li>failing all that, the damage at the scanned speed is taken.</li>
     * </ol>
     */
    double wallDamage(double unexplained, double previousVelocity, double velocity,
                      double x, double y, long elapsed) {
        // The engine zeroes a robot's velocity when it hits a wall: a moving robot, or one
        // that was already standing, did not just crash.
        if (velocity != 0 || previousVelocity == 0) return 0;
        boolean nearWall = x <= WALL_MARGIN || y <= WALL_MARGIN
            || x >= fieldWidth - WALL_MARGIN || y >= fieldHeight - WALL_MARGIN;
        if (!nearWall) return 0;
        double speed = Math.abs(previousVelocity);
        // Braking at 2 px/tick, could it have stopped in the ticks since the last scan?
        // No robot is faster than 8 px/tick, so any gap of 4 ticks or more returns just
        // below, and impactSpeeds is only ever asked for 1 to 3 ticks (at most 10 speeds).
        boolean couldBrake = speed <= Rules.DECELERATION * elapsed;
        if (couldBrake && elapsed > 1) return 0;
        double[] impacts = impactSpeeds(speed, elapsed);
        for (double impact : impacts) {
            // Damage 0 (2 px/tick or slower) explains nothing, so it cannot be the match.
            double damage = Rules.getWallHitDamage(impact);
            if (damage > 0 && Math.abs(unexplained - damage) < EPSILON) return damage;
        }
        if (couldBrake) return 0;
        for (double impact : impacts) {
            double damage = Rules.getWallHitDamage(impact);
            if (isShot(unexplained - damage)) return damage;
        }
        return Rules.getWallHitDamage(speed);
    }

    /**
     * Speeds the enemy could have struck the wall at, nearest the scanned {@code speed}
     * first: {@code elapsed} ticks of acceleration by 1 or braking by 2 each.
     *
     * <p>The candidates go in 1 px/tick steps (each step is 0.5 of wall damage): the scanned
     * speed, then one faster and one slower, then two of each, and so on. Faster speeds stop
     * at 8 px/tick (the cap can repeat 8), and slower ones stop above 0, since a robot
     * travelling at 0 does no damage. At most {@code 3 × elapsed + 1} speeds.</p>
     *
     * @param speed the speed at the last scan, in px/tick, not negative
     * @param elapsed ticks since the last scan, at least 1
     * @return the candidate impact speeds, in px/tick, nearest {@code speed} first
     */
    static double[] impactSpeeds(double speed, long elapsed) {
        long up = elapsed;
        long down = 2 * elapsed;
        double[] out = new double[(int) (up + down + 1)];
        int n = 0;
        out[n++] = speed;
        for (long step = 1; step <= Math.max(up, down); step++) {
            if (step <= up) out[n++] = Math.min(speed + step * Rules.ACCELERATION, Rules.MAX_VELOCITY);
            if (step <= down && speed - step > 0) out[n++] = speed - step;
        }
        return Arrays.copyOf(out, n);
    }

    /** Makes this scan the baseline for the next, and clears the held corrections. */
    private void remember(long time, double energy, double velocity) {
        lastTime = time;
        lastEnergy = energy;
        lastVelocity = velocity;
        ourDamage = 0;
        theirRefund = 0;
        collisionDamage = 0;
    }
}
