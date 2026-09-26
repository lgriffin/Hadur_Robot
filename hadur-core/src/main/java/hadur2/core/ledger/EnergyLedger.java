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
 */
public final class EnergyLedger {

    public static final double MIN_SHOT = Rules.MIN_BULLET_POWER;
    public static final double MAX_SHOT = Rules.MAX_BULLET_POWER;
    /** A robot touching a wall has its centre half a robot (18 px) from it; allow for scan rounding. */
    static final double WALL_MARGIN = 18 + 1.0;

    /** One scan's reading. {@code corrected} is the part of the drop spent on a bullet. */
    public static final class Reading {
        private final double raw;
        private final double corrected;
        private final double wallDamage;
        private final boolean shot;
        private final boolean phantom;
        private final boolean hidden;

        public Reading(double raw, double corrected, double wallDamage, boolean shot, boolean phantom, boolean hidden) {
            this.raw = raw;
            this.corrected = corrected;
            this.wallDamage = wallDamage;
            this.shot = shot;
            this.phantom = phantom;
            this.hidden = hidden;
        }

        public double raw() {
            return raw;
        }

        public double corrected() {
            return corrected;
        }

        public double wallDamage() {
            return wallDamage;
        }

        public boolean shot() {
            return shot;
        }

        public boolean phantom() {
            return phantom;
        }

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

        static final Reading FIRST = new Reading(0, 0, 0, false, false, false);
    }

    private final double fieldWidth;
    private final double fieldHeight;
    private boolean seen;
    private double lastEnergy;
    private double lastVelocity;
    private long lastTime;
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
     * Reads the enemy's energy from a scan at {@code time}. The enemy is at ({@code x},
     * {@code y}) moving at {@code velocity}.
     */
    public Reading scan(long time, double energy, double velocity, double x, double y) {
        if (!seen) {
            seen = true;
            remember(time, energy, velocity);
            return Reading.FIRST;
        }
        long elapsed = Math.max(1, time - lastTime);
        double raw = lastEnergy - energy;
        double explained = raw - ourDamage + theirRefund - collisionDamage;
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

    /** WAVE-2: only a corrected drop in [0.1, 3.0] is a bullet. */
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
     * <li>a speed whose damage explains the whole drop is taken (no shot): that step is far
     *     likelier than a shot of exactly that power fired as the enemy struck the wall;</li>
     * <li>if the enemy could have braked legally over a scan gap, no wall hit is assumed;</li>
     * <li>otherwise the speed nearest the scanned one that leaves a legal bullet power is
     *     taken, so a shot fired at the wall still becomes a wave, if possibly 0.5 off.</li>
     * </ol>
     */
    double wallDamage(double unexplained, double previousVelocity, double velocity,
                      double x, double y, long elapsed) {
        if (velocity != 0 || previousVelocity == 0) return 0;
        boolean nearWall = x <= WALL_MARGIN || y <= WALL_MARGIN
            || x >= fieldWidth - WALL_MARGIN || y >= fieldHeight - WALL_MARGIN;
        if (!nearWall) return 0;
        double speed = Math.abs(previousVelocity);
        boolean couldBrake = speed <= Rules.DECELERATION * elapsed;
        if (couldBrake && elapsed > 1) return 0;
        double[] impacts = impactSpeeds(speed, elapsed);
        for (double impact : impacts) {
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

    private void remember(long time, double energy, double velocity) {
        lastTime = time;
        lastEnergy = energy;
        lastVelocity = velocity;
        ourDamage = 0;
        theirRefund = 0;
        collisionDamage = 0;
    }
}
