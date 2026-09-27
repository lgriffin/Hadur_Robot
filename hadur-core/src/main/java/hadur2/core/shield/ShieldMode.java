package hadur2.core.shield;

import hadur2.core.physics.Angles;
import java.util.ArrayList;
import java.util.List;

/**
 * Hadur's own bullet shield (SHIELD-3..6): sit still and shoot the enemy's bullets down.
 *
 * <p>Against a still target most guns fire head-on, so the heading of each enemy bullet can
 * be worked out from where the two robots stood (SHIELD-4). For each enemy wave that would
 * hit us, the shield plans a bullet, no stronger than the enemy's, that meets it in mid-air
 * ({@link ShieldGeometry}), stepping 0.1 px sideways on the tick before it fires so the two
 * paths are not collinear. Between shields it fires at the enemy only when its gun will be
 * cool again in time for the enemy's next shot (SHIELD-6).</p>
 *
 * <p>Shield mode starts on in every duel and is turned off for the rest of the battle as
 * soon as it is shown not to work (SHIELD-5): most strong guns add a little jitter against
 * a still target, and a still robot is easy to hit.</p>
 *
 * <p>Plain Java and the engine's physics only; deterministic (CORE-2, RES-6), and every
 * list is bounded (RES-2).</p>
 */
public final class ShieldMode {

    /** Head-on bases for a bullet's heading; see {@link #onEnemyShot}. */
    public static final int BASES = 4;
    /**
     * Heading predictors: each base as is, plus a learned offset, and plus a learned offset
     * times our lateral direction (a guess-factor gun that has only seen us still still
     * flips its tiny offset with the way we last moved).
     */
    public static final int PREDICTORS = 3 * BASES;
    /** How close a predicted heading must be to count as exact. */
    public static final double EXACT = 1e-5;
    /** The sideways step taken on the tick before a shield fires. */
    public static final double WIGGLE = 0.1;
    public static final int MAX_UNPREDICTED_HITS = 3;
    public static final int MIN_HITS_TO_JUDGE = 3;
    public static final int MAX_RAMS = 2;
    /** Ticks without an enemy shot after which we fire at it anyway. */
    public static final int IDLE_TICKS = 32;

    private static final int HISTORY = 8;
    private static final int MAX_WAVES = 16;
    private static final double MAX_GUN_TURN = Math.toRadians(20);
    private static final int POWER_SAMPLES = 10;

    /** One tick's view of the duel. */
    public static final class Situation {
        final long time;
        final double x;
        final double y;
        final double heading;
        final double gunHeading;
        final double gunHeat;
        final double coolingRate;
        final double energy;
        final double enemyX;
        final double enemyY;
        final double enemyEnergy;
        final double attackAngle;
        final double attackPower;
        final boolean gunOnTarget;

        /**
         * {@code attackAngle} and {@code attackPower} are what the main gun would fire at the
         * enemy; {@code gunOnTarget} says whether the gun finished last tick's turn.
         */
        public Situation(long time, double x, double y, double heading, double gunHeading,
                         double gunHeat, double coolingRate, double energy, double enemyX,
                         double enemyY, double enemyEnergy, double attackAngle,
                         double attackPower, boolean gunOnTarget) {
            this.time = time;
            this.x = x;
            this.y = y;
            this.heading = heading;
            this.gunHeading = gunHeading;
            this.gunHeat = gunHeat;
            this.coolingRate = coolingRate;
            this.energy = energy;
            this.enemyX = enemyX;
            this.enemyY = enemyY;
            this.enemyEnergy = enemyEnergy;
            this.attackAngle = attackAngle;
            this.attackPower = attackPower;
            this.gunOnTarget = gunOnTarget;
        }
    }

    /** What to do this tick. {@code attack} marks a shot at the enemy rather than a shield. */
    public static final class Command {
        public final double bodyTurn;
        public final double ahead;
        public final double gunTurn;
        public final double firePower;
        public final boolean attack;

        Command(double bodyTurn, double ahead, double gunTurn, double firePower, boolean attack) {
            this.bodyTurn = bodyTurn;
            this.ahead = ahead;
            this.gunTurn = gunTurn;
            this.firePower = firePower;
            this.attack = attack;
        }
    }

    private static final class EnemyWave {
        long time;
        double ox;
        double oy;
        double power;
        double speed;
        final double[] headings = new double[BASES];
        double direction = 1;
        boolean shieldTried;
        boolean resolved;
    }

    private static final class Plan {
        EnemyWave wave;
        long fireTime;
        double x;
        double y;
        double wiggle;
        double angle;
        double width;
        double power;
    }

    private final long[] scanTime = new long[HISTORY];
    private final double[][] scan = new double[HISTORY][7];
    private int scans;
    private final List<EnemyWave> waves = new ArrayList<>();
    private final int[] exactHits = new int[PREDICTORS];
    private final double[] offsets = new double[BASES];
    private final double[] directionalOffsets = new double[BASES];
    private int offsetSamples;
    private double lateralDirection = 1;
    private Plan plan;
    private long enemyNextFire;
    private long lastEnemyShot;
    private double lastEnemyPower = 2.0;
    private double coolingRate = 0.1;
    private boolean enemyMoved;
    private int wiggleSide = 1;

    private boolean off;
    private int hitsWhileOn;
    private int unpredictedHits;
    private int interceptsWhileOn;
    private int rams;
    private int shieldsFired;

    /** {@code duel} is false for a melee battle, where the shield never starts. */
    public ShieldMode(boolean duel) {
        this.off = !duel;
        newRound();
    }

    /** Forgets the round's waves and scans; keeps the predictor scores and the verdict. */
    public void newRound() {
        scans = 0;
        waves.clear();
        plan = null;
        // Every gun starts a round at heat 3.0.
        enemyNextFire = (long) Math.ceil(3.0 / coolingRate);
        lastEnemyShot = 0;
        enemyMoved = false;
    }

    /** SHIELD-5: whether shield mode is still on for this battle. */
    public boolean active() {
        return !off;
    }

    public int shieldsFired() {
        return shieldsFired;
    }

    /** The predictor that has matched the most enemy bullets exactly (SHIELD-4). */
    public int bestPredictor() {
        int best = 0;
        for (int i = 1; i < PREDICTORS; i++) {
            if (exactHits[i] > exactHits[best]) best = i;
        }
        return best;
    }

    public void onScan(long time, double myX, double myY, double myHeading, double myVelocity,
                       double enemyX, double enemyY, double enemyHeading, double enemyVelocity) {
        double lateral = myVelocity
            * Math.sin(myHeading - ShieldGeometry.bearing(enemyX, enemyY, myX, myY));
        if (Math.abs(lateral) > 1e-6) lateralDirection = Math.signum(lateral);
        int i = scans % HISTORY;
        scanTime[i] = time;
        double[] s = scan[i];
        s[0] = myX;
        s[1] = myY;
        s[2] = enemyX;
        s[3] = enemyY;
        s[4] = enemyHeading;
        s[5] = enemyVelocity;
        s[6] = lateralDirection;
        scans++;
        if (enemyVelocity != 0) enemyMoved = true;
    }

    private double[] scanAt(long time) {
        for (int n = 0; n < Math.min(scans, HISTORY); n++) {
            int i = (scans - 1 - n) % HISTORY;
            if (scanTime[i] == time) return scan[i];
        }
        return null;
    }

    /**
     * SHIELD-4: an enemy bullet of {@code power} fired in the enemy's tick {@code fireTime}
     * code, from where it stood at that tick. Its heading is predicted four ways, all
     * head-on at where we stood on the tick before: from where the enemy stood then (0),
     * from its firing point (1), from where its velocity was taking it (2), and at where we
     * stood on the firing tick (3).
     */
    public void onEnemyShot(long fireTime, double power) {
        lastEnemyShot = fireTime;
        lastEnemyPower = power;
        enemyNextFire = fireTime + (long) Math.ceil((1 + power / 5) / coolingRate - 1e-9);
        if (off) return;
        double[] now = scanAt(fireTime);
        double[] before = scanAt(fireTime - 1);
        if (now == null || before == null) return;
        EnemyWave w = new EnemyWave();
        w.time = fireTime;
        w.ox = now[2];
        w.oy = now[3];
        w.power = power;
        w.speed = 20 - 3 * power;
        w.headings[0] = ShieldGeometry.bearing(before[2], before[3], before[0], before[1]);
        w.headings[1] = ShieldGeometry.bearing(now[2], now[3], before[0], before[1]);
        double projX = before[2] + Math.sin(before[4]) * before[5];
        double projY = before[3] + Math.cos(before[4]) * before[5];
        w.headings[2] = ShieldGeometry.bearing(projX, projY, before[0], before[1]);
        w.headings[3] = ShieldGeometry.bearing(now[2], now[3], now[0], now[1]);
        w.direction = before[6];
        if (waves.size() >= MAX_WAVES) waves.remove(0);
        waves.add(w);
    }

    /** An enemy bullet hit us, at ({@code x}, {@code y}) heading {@code heading}. */
    public void onHitByBullet(long time, double power, double x, double y, double heading) {
        EnemyWave w = findWave(time, power, x, y);
        boolean predicted = false;
        if (w != null) {
            w.resolved = true;
            for (int i = 0; i < PREDICTORS; i++) {
                if (Math.abs(Angles.normalRelativeAngle(heading - predicted(w, i))) < EXACT) {
                    exactHits[i]++;
                    predicted = true;
                }
            }
            for (int b = 0; b < BASES; b++) {
                double err = Angles.normalRelativeAngle(heading - w.headings[b]);
                offsets[b] = (offsets[b] * offsetSamples + err) / (offsetSamples + 1);
                directionalOffsets[b] = (directionalOffsets[b] * offsetSamples + err * w.direction)
                    / (offsetSamples + 1);
            }
            offsetSamples++;
        }
        if (off) return;
        hitsWhileOn++;
        if (!predicted) unpredictedHits++;
        judge();
    }

    /** SHIELD-4: predictor {@code i}'s heading for wave {@code w}. */
    private double predicted(EnemyWave w, int i) {
        int b = i % BASES;
        switch (i / BASES) {
            case 0: return w.headings[b];
            case 1: return w.headings[b] + offsets[b];
            default: return w.headings[b] + w.direction * directionalOffsets[b];
        }
    }

    /** One of our bullets met an enemy bullet of {@code enemyPower} at ({@code x}, {@code y}). */
    public void onIntercepted(long time, double enemyPower, double x, double y) {
        EnemyWave w = findWave(time, enemyPower, x, y);
        if (w != null) w.resolved = true;
        if (!off) interceptsWhileOn++;
    }

    /** The enemy drove into us. */
    public void onRammed() {
        if (off) return;
        rams++;
        judge();
    }

    /** We lost a round; a shield that loses rounds is not working. */
    public void onRoundLost() {
        off = true;
    }

    private void judge() {
        if (unpredictedHits >= MAX_UNPREDICTED_HITS
                || (hitsWhileOn >= MIN_HITS_TO_JUDGE && hitsWhileOn > interceptsWhileOn)
                || rams >= MAX_RAMS) {
            off = true;
            plan = null;
        }
    }

    private EnemyWave findWave(long time, double power, double x, double y) {
        EnemyWave best = null;
        double bestErr = Double.POSITIVE_INFINITY;
        for (EnemyWave w : waves) {
            if (w.resolved || Math.abs(w.power - power) > 0.001) continue;
            double err = Math.abs(Math.hypot(x - w.ox, y - w.oy) - w.speed * (time - w.time));
            if (err < bestErr) {
                bestErr = err;
                best = w;
            }
        }
        return best != null && bestErr <= 1.5 * best.speed ? best : null;
    }

    /** SHIELD-3, SHIELD-6: one tick of shield mode. */
    public Command tick(Situation s) {
        coolingRate = s.coolingRate;
        prune(s);
        double back = 0;

        if (plan != null && s.time == plan.fireTime) {
            Plan p = plan;
            plan = null;
            p.wave.shieldTried = true;
            if (canFire(p, s)) {
                shieldsFired++;
                wiggleSide = -wiggleSide;
                return new Command(0, -p.wiggle,
                    Angles.normalRelativeAngle(s.attackAngle - s.gunHeading), p.power, false);
            }
            // No shot: still step back to where the enemy is aiming.
            back = -p.wiggle;
        } else if (plan != null && s.time > plan.fireTime) {
            plan.wave.shieldTried = true;
            plan = null;
        }

        EnemyWave threat = nextThreat(s);
        if (threat != null) plan = buildPlan(threat, s);
        if (plan != null) {
            double gunTurn = Angles.normalRelativeAngle(plan.angle - s.gunHeading);
            if (s.time == plan.fireTime - 1) {
                // Commit: step aside and point the gun; no body turn, so the step is exact.
                return new Command(0, plan.wiggle, gunTurn, 0, false);
            }
            return new Command(towardParallel(s), back, gunTurn, 0, false);
        }

        double gunTurn = Angles.normalRelativeAngle(s.attackAngle - s.gunHeading);
        double power = attackPower(s);
        if (power > 0) return new Command(towardParallel(s), back, gunTurn, power, true);
        return new Command(towardParallel(s), back, gunTurn, 0, false);
    }

    private boolean canFire(Plan p, Situation s) {
        if (s.gunHeat > 0 || s.energy <= p.power) return false;
        if (Math.hypot(s.x - p.x, s.y - p.y) < 1e-6) {
            return Math.abs(Angles.normalRelativeAngle(s.gunHeading - p.angle)) <= p.width / 2;
        }
        // We are not quite where the plan put us: check the gun against the shadow from here.
        ShieldGeometry.Shadow shadow = shadow(p.wave, s.x, s.y, s.time, p.power);
        return shadow != null
            && Math.abs(Angles.normalRelativeAngle(s.gunHeading - shadow.fireAngle)) <= shadow.width / 2;
    }

    private void prune(Situation s) {
        waves.removeIf(w -> w.speed * (s.time - w.time)
            > Math.hypot(s.x - w.ox, s.y - w.oy) + ShieldGeometry.BODY_HALF_DIAGONAL + 2 * w.speed);
        if (plan != null && !waves.contains(plan.wave)) plan = null;
    }

    /** The earliest enemy wave still in flight whose predicted heading crosses our body. */
    private EnemyWave nextThreat(Situation s) {
        int k = bestPredictor();
        for (EnemyWave w : waves) {
            if (w.resolved || w.shieldTried) continue;
            if (w.speed * (s.time - w.time) > Math.hypot(s.x - w.ox, s.y - w.oy)) continue;
            if (crossesBody(w.ox, w.oy, predicted(w, k), s.x, s.y)) return w;
        }
        return null;
    }

    private static boolean crossesBody(double ox, double oy, double heading, double x, double y) {
        double d = Math.hypot(x - ox, y - oy);
        double off = Math.abs(Angles.normalRelativeAngle(heading - ShieldGeometry.bearing(ox, oy, x, y)));
        return off < Math.PI / 2 && d * Math.sin(off) < ShieldGeometry.BODY_HALF_DIAGONAL;
    }

    private ShieldGeometry.Shadow shadow(EnemyWave w, double x, double y, long fireTime, double power) {
        long last = ShieldGeometry.lastTurnBeforeContact(w.ox, w.oy, w.time, w.speed, x, y);
        return ShieldGeometry.solve(w.ox, w.oy, w.time, w.speed, predicted(w, bestPredictor()),
            x, y, fireTime, 20 - 3 * power, last);
    }

    private Plan buildPlan(EnemyWave w, Situation s) {
        long earliest = s.time + Math.max(1, ticksUntilCool(s.gunHeat, s.coolingRate));
        long last = ShieldGeometry.lastTurnBeforeContact(w.ox, w.oy, w.time, w.speed, s.x, s.y);
        for (long fireTime = earliest; fireTime < last; fireTime++) {
            // The step aside is seen by the enemy's radar. A gun that leads a moving target
            // would aim its next shot off our centre, so keep the step clear of the ticks
            // the enemy aims that shot from.
            if (fireTime + 1 >= enemyNextFire - 2 && fireTime <= enemyNextFire) continue;
            Plan p = buildPlan(w, s, fireTime);
            if (p != null) return p;
        }
        return null;
    }

    private Plan buildPlan(EnemyWave w, Situation s, long fireTime) {
        double maxPower = Math.min(3.0, s.energy - 0.1);
        if (enemyMoved) maxPower = Math.min(maxPower, Math.max(0.1, w.power - 0.01));
        else maxPower = Math.min(maxPower, 0.1);
        if (maxPower < 0.1) return null;
        Plan best = null;
        double[] wiggles = {wiggleSide * WIGGLE, 0};
        for (double wiggle : wiggles) {
            double x = s.x + Math.sin(s.heading) * wiggle;
            double y = s.y + Math.cos(s.heading) * wiggle;
            for (int i = 0; i < POWER_SAMPLES; i++) {
                double power = 0.1 * Math.pow(maxPower / 0.1, i / (double) (POWER_SAMPLES - 1));
                if (i > 0 && maxPower <= 0.1) break;
                ShieldGeometry.Shadow sh = shadow(w, x, y, fireTime, power);
                if (sh == null) continue;
                double turn = Math.abs(Angles.normalRelativeAngle(sh.fireAngle - s.gunHeading));
                if (turn > MAX_GUN_TURN * (fireTime - s.time) + 1e-9) continue;
                if (best == null || sh.width > best.width) {
                    best = new Plan();
                    best.wave = w;
                    best.fireTime = fireTime;
                    best.x = x;
                    best.y = y;
                    best.wiggle = wiggle;
                    best.angle = sh.fireAngle;
                    best.width = sh.width;
                    best.power = power;
                }
            }
        }
        return best;
    }

    /**
     * SHIELD-6: the power to fire at the enemy now, or 0. Only with the gun cool and on
     * target, no unshielded threat in flight, and either the enemy idle for
     * {@link #IDLE_TICKS} or our gun cool again in time to shield its next possible shot.
     */
    private double attackPower(Situation s) {
        if (s.gunHeat > 0 || !s.gunOnTarget || s.attackPower < 0.1) return 0;
        double power = Math.min(s.attackPower, s.energy - 1);
        if (power < 0.1) return 0;
        if (nextThreat(s) != null) return 0;
        if (s.time - lastEnemyShot >= IDLE_TICKS && s.time >= enemyNextFire) return power;
        long deadline = latestShieldTimeForNextShot(s);
        for (double p = power; p >= 0.1 - 1e-9; p -= 0.1) {
            long cool = ticksUntilCool(1 + p / 5, s.coolingRate);
            if (s.time + cool + 2 <= deadline) return p;
        }
        return 0;
    }

    /** The latest tick we could fire a 0.1 shield at a head-on shot fired at the earliest. */
    private long latestShieldTimeForNextShot(Situation s) {
        long waveTime = Math.max(s.time, enemyNextFire);
        double speed = 20 - 3 * lastEnemyPower;
        double heading = ShieldGeometry.bearing(s.enemyX, s.enemyY, s.x, s.y);
        long last = ShieldGeometry.lastTurnBeforeContact(s.enemyX, s.enemyY, waveTime, speed, s.x, s.y);
        double x = s.x + Math.sin(s.heading) * WIGGLE;
        double y = s.y + Math.cos(s.heading) * WIGGLE;
        for (long f = last - 1; f > s.time; f--) {
            if (ShieldGeometry.solve(s.enemyX, s.enemyY, waveTime, speed, heading, x, y, f, 19.7,
                    last) != null) {
                return f;
            }
        }
        return Long.MIN_VALUE;
    }

    /** Turns the body side-on to the enemy, so a step ahead is a step sideways. */
    private static double towardParallel(Situation s) {
        double across = ShieldGeometry.bearing(s.x, s.y, s.enemyX, s.enemyY) + Math.PI / 2;
        double turn = Angles.normalRelativeAngle(across - s.heading);
        if (Math.abs(turn) > Math.PI / 2) turn = Angles.normalRelativeAngle(turn + Math.PI);
        return turn;
    }

    /** Ticks until a gun at {@code heat} can fire, erring late when the division is near whole. */
    static long ticksUntilCool(double heat, double coolingRate) {
        if (heat <= 0) return 0;
        double q = heat / coolingRate;
        long n = (long) Math.ceil(q);
        long r = Math.round(q);
        if (Math.abs(q - r) <= 1e-6) n = Math.max(n, r + 1);
        return n;
    }
}
