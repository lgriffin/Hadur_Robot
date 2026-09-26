package hadur2.core.ledger;

import hadur2.core.physics.Rules;

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
 */
public final class EnergyLedger {

    public static final double MIN_SHOT = Rules.MIN_BULLET_POWER;
    public static final double MAX_SHOT = Rules.MAX_BULLET_POWER;
    /** A robot touching a wall has its centre half a robot (18 px) from it; allow for scan rounding. */
    static final double WALL_MARGIN = 18 + 1.0;

    /** One scan's reading. {@code corrected} is the part of the drop spent on a bullet. */
    public record Reading(double raw, double corrected, double wallDamage, boolean shot,
                          boolean phantom, boolean hidden) {

        static final Reading FIRST = new Reading(0, 0, 0, false, false, false);
    }

    private final double fieldWidth;
    private final double fieldHeight;
    private boolean seen;
    private double lastEnergy;
    private double lastVelocity;
    private double ourDamage;
    private double theirRefund;
    private double collisionDamage;

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

    /** One of our bullets of {@code power} hit the enemy. */
    public void ourBulletHit(double power) {
        ourDamage += Rules.getBulletDamage(power);
    }

    /** An enemy bullet of {@code power} hit us; the enemy gains 3 × power. */
    public void enemyBulletHitUs(double power) {
        theirRefund += Rules.getBulletHitBonus(power);
    }

    /** The robots collided; each loses {@link Rules#ROBOT_HIT_DAMAGE}. */
    public void robotsCollided() {
        collisionDamage += Rules.ROBOT_HIT_DAMAGE;
    }

    /**
     * Reads the enemy's energy from a scan. The enemy is at ({@code x}, {@code y}) moving at
     * {@code velocity}.
     */
    public Reading scan(double energy, double velocity, double x, double y) {
        if (!seen) {
            seen = true;
            remember(energy, velocity);
            return Reading.FIRST;
        }
        double raw = lastEnergy - energy;
        double explained = raw - ourDamage + theirRefund - collisionDamage;
        double wall = collisionDamage == 0 ? wallDamage(explained, lastVelocity, velocity, x, y) : 0;
        double corrected = explained - wall;
        boolean rawShot = isShot(raw);
        boolean shot = isShot(corrected);
        remember(energy, velocity);
        return new Reading(raw, corrected, wall, shot, rawShot && !shot, shot && !rawShot);
    }

    /**
     * Energies arrive as doubles, so a 0.1 shot can read as 0.09999999999999998. Drops are
     * compared with this much slack; it is far below the 0.1 step between bullet powers.
     */
    static final double EPSILON = 1e-6;

    /** WAVE-2: only a corrected drop in [0.1, 3.0] is a bullet. */
    public static boolean isShot(double drop) {
        return drop >= MIN_SHOT - EPSILON && drop <= MAX_SHOT + EPSILON;
    }

    /**
     * Damage from a wall hit since the last scan, or 0. {@code unexplained} is the drop
     * left after the other corrections.
     *
     * <p>A robot can brake by at most 2 per tick, so stopping dead next to a wall means it
     * hit the wall, unless it was already slow enough to brake. The engine applies the
     * tick's acceleration before it checks walls, so the speed at impact is anywhere from
     * one faster (still accelerating) to two slower (braking) than the last scan showed,
     * and the damage differs by 0.5 per step. The speed whose damage explains the whole
     * drop is taken: that step is far likelier than a 0.5 shot fired as the enemy struck
     * the wall. Otherwise the last scanned speed is used.</p>
     */
    double wallDamage(double unexplained, double previousVelocity, double velocity,
                      double x, double y) {
        if (velocity != 0 || previousVelocity == 0) return 0;
        boolean nearWall = x <= WALL_MARGIN || y <= WALL_MARGIN
            || x >= fieldWidth - WALL_MARGIN || y >= fieldHeight - WALL_MARGIN;
        if (!nearWall) return 0;
        double speed = Math.abs(previousVelocity);
        for (double step = Rules.ACCELERATION; step >= -Rules.DECELERATION; step--) {
            double impact = Math.min(speed + step, Rules.MAX_VELOCITY);
            if (impact <= 0) continue;
            double damage = Rules.getWallHitDamage(impact);
            if (damage > 0 && Math.abs(unexplained - damage) < EPSILON) return damage;
        }
        return speed > Rules.DECELERATION ? Rules.getWallHitDamage(speed) : 0;
    }

    private void remember(double energy, double velocity) {
        lastEnergy = energy;
        lastVelocity = velocity;
        ourDamage = 0;
        theirRefund = 0;
        collisionDamage = 0;
    }
}
