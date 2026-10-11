package hadurling.core.ledger;

import hadurling.core.physics.Rules;

/**
 * Explains the enemy's energy changes between two scans, so that only a drop the enemy spent
 * on a bullet becomes a wave (HL-14, HL-15).
 *
 * <p>An enemy's energy does not only fall when it fires. Between two scans it also changes
 * because:</p>
 * <ul>
 * <li>one of our bullets hit it: it loses {@link Rules#bulletDamage} of our bullet's power;</li>
 * <li>one of its bullets hit us: it <em>gains</em> back 3 times that bullet's power;</li>
 * <li>it hit a wall: it loses {@code max(0, speed / 2 - 1)}.</li>
 * </ul>
 *
 * <p>The ledger is told about the first two as they happen ({@link #ourBulletHit},
 * {@link #enemyBulletHitUs}), because the engine sends events for them. A wall hit has no
 * event, so it is inferred: the enemy was going faster than it can brake in one tick, and is
 * now stopped. (Hadur also requires the enemy to be at a wall; Hadurling does not, so an
 * enemy that rams a robot is read as hitting a wall. Exercise 3 closes that gap.) At the next
 * {@link #scan} the ledger takes all of that out of the drop. What is left,
 * {@link Reading#corrected()}, is the energy the enemy spent on a bullet, if it fired.</p>
 *
 * <p>The sign convention is the drop's: a positive value is energy the enemy lost. A corrected
 * drop is a shot only if it is a legal bullet power, between {@link #MIN_SHOT} and
 * {@link #MAX_SHOT} (HL-15). Anything else is energy the ledger could not explain and is not
 * turned into a wave.</p>
 *
 * <p>It keeps a fixed handful of numbers, so nothing in it grows over a battle.</p>
 */
public final class EnergyLedger {

    /** The weakest bullet, 0.1. */
    public static final double MIN_SHOT = Rules.MIN_BULLET_POWER;
    /** The strongest bullet, 3.0. */
    public static final double MAX_SHOT = Rules.MAX_BULLET_POWER;
    /** The most a robot's speed can fall in one tick, so a bigger fall to 0 was a wall. */
    static final double MAX_BRAKING = 2.0;
    /** Allowance for floating-point noise when the corrected drop is compared with a bullet power. */
    static final double TOLERANCE = 1e-9;

    /** What one scan showed. */
    public static final class Reading {
        private final double raw;
        private final double corrected;
        private final double wallDamage;
        private final boolean shot;

        Reading(double raw, double corrected, double wallDamage, boolean shot) {
            this.raw = raw;
            this.corrected = corrected;
            this.wallDamage = wallDamage;
            this.shot = shot;
        }

        /** @return the energy the enemy lost since the last scan, as read (negative if it gained) */
        public double raw() { return raw; }
        /** @return the loss left once hits, refunds and wall damage are taken out */
        public double corrected() { return corrected; }
        /** @return the wall damage inferred for this interval, or 0 */
        public double wallDamage() { return wallDamage; }
        /** @return whether {@link #corrected()} is a bullet's power, so a wave is due */
        public boolean shot() { return shot; }

        @Override
        public String toString() {
            return "Reading[raw=" + raw + ", corrected=" + corrected + ", wall=" + wallDamage + ", shot=" + shot + "]";
        }
    }

    private double energy = Double.NaN;
    private double velocity = Double.NaN;
    private double ourDamage;
    private double refund;

    /**
     * One of our bullets hit the enemy since the last scan.
     *
     * @param power the bullet's power
     */
    public void ourBulletHit(double power) {
        ourDamage += Rules.bulletDamage(power);
    }

    /**
     * One of the enemy's bullets hit us since the last scan; the enemy gains 3 times its power.
     *
     * @param power the bullet's power
     */
    public void enemyBulletHitUs(double power) {
        refund += 3 * power;
    }

    /**
     * Reads a scan of the enemy and closes the interval since the previous scan.
     *
     * @param enemyEnergy the enemy's energy now
     * @param enemyVelocity the enemy's velocity now
     * @return the reading; the first scan of a round, which has nothing to compare with, never
     *     reports a shot
     */
    public Reading scan(double enemyEnergy, double enemyVelocity) {
        Reading reading;
        if (Double.isNaN(energy)) {
            reading = new Reading(0, 0, 0, false);
        } else {
            double raw = energy - enemyEnergy;
            double wall = wallDamage(velocity, enemyVelocity);
            double corrected = raw - ourDamage + refund - wall;
            boolean shot = corrected >= MIN_SHOT - TOLERANCE && corrected <= MAX_SHOT + TOLERANCE;
            reading = new Reading(raw, corrected, wall, shot);
        }
        energy = enemyEnergy;
        velocity = enemyVelocity;
        ourDamage = 0;
        refund = 0;
        return reading;
    }

    /** The damage of a wall hit inferred from the speed before and after, or 0. */
    static double wallDamage(double before, double after) {
        if (Double.isNaN(before) || after != 0 || Math.abs(before) <= MAX_BRAKING) return 0;
        return Math.max(0, Math.abs(before) / 2 - 1);
    }
}
