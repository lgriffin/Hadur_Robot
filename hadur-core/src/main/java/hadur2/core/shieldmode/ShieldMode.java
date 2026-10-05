package hadur2.core.shieldmode;

import hadur2.core.physics.Angles;
import hadur2.core.port.Telemetry;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Hadur's own bullet shield (SHIELD-5, SHIELD-6): sit still and shoot the enemy's bullets
 * down.
 *
 * <p>Against a still target most guns fire head-on, so the heading of each enemy bullet can
 * be worked out from where the two robots stood. For each enemy wave that would hit us, the
 * mode plans a bullet, no stronger than the enemy's, that meets it in mid-air
 * ({@link ShieldGeometry}), stepping 0.1 px sideways on the tick before it fires so the two
 * paths are not collinear. Between shields it fires at the enemy only when its gun will be
 * cool again in time for the enemy's next shot. The heading is predicted by twelve
 * predictors: four head-on bases (from where the enemy stood on the tick before it fired,
 * from its firing point, from where its velocity was taking it, and at where we stood on the
 * firing tick), each plain, plus a learned offset, and plus a learned offset times our
 * lateral direction. The predictor that has matched the most enemy bullets exactly is used.</p>
 *
 * <p><b>When it is on (SHIELD-5).</b> {@link ShieldList} is asked once, with the opponent's
 * name at the first scan. For a listed opponent each round opens in shield mode. For anyone
 * else, and when the list is empty, the mode never starts and every method here returns at
 * once without a record: the duel plays exactly as it did before this class existed. Only
 * the Duel's brain makes one, and only for a battle of one opponent.</p>
 *
 * <p><b>When it is left.</b></p>
 * <ul>
 * <li>For the rest of the battle (SHIELD-6): the enemy's bullet damage has exceeded the
 *     {@link ShieldBudget}'s allowance, the amount that would hold our score share at 85%.</li>
 * <li>For the rest of the round, back on at the next round's start:
 *     <ul>
 *     <li>{@code close}: the enemy is within {@link #CLOSE_RANGE} px, so a rammer is on us;</li>
 *     <li>{@code rammed}: the enemy drove into us;</li>
 *     <li>{@code unpredicted}: {@link #MAX_UNPREDICTED_HITS} of its bullets hit us that no
 *         predictor had matched, so the predictions are failing;</li>
 *     <li>{@code outhit}: at least {@link #MIN_HITS_TO_JUDGE} of its bullets hit us and more
 *         than we shot down;</li>
 *     <li>{@code quiet}: it has fired nothing for {@link #QUIET_TICKS} ticks, so there is
 *         nothing to shield against and the gun is better used by the duel;</li>
 *     <li>{@code duress}: the engine has skipped turns and the duel is in RES-14's duress.</li>
 *     </ul></li>
 * </ul>
 *
 * <p>Records, written only when the opponent is listed: {@code SH,round,tick,on}, {@code
 * SH,round,tick,exit,reason} and {@code SH,round,tick,off,budget} as the mode changes, and
 * at each round's end {@code SR,round,tick,shieldShots,intercepts,hitsTaken,unpredicted,
 * attackShots,damageTaken,allowed,exit}.</p>
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
    /** Bullets that hit us with no predictor exact, in one round, before the round's exit. */
    public static final int MAX_UNPREDICTED_HITS = 2;
    /** Hits taken in one round, outnumbering our interceptions, before the round's exit. */
    public static final int MIN_HITS_TO_JUDGE = 3;
    /** Closer than this, in px, the enemy is ramming or about to. */
    public static final double CLOSE_RANGE = 100;
    /** Ticks without an enemy shot after which the round leaves shield mode. */
    public static final int QUIET_TICKS = 120;
    /** Ticks without an enemy shot after which we fire at it anyway. */
    public static final int IDLE_TICKS = 32;

    private static final int HISTORY = 8;
    private static final int MAX_WAVES = 16;
    private static final int MAX_OWN_BULLETS = 16;
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
        final boolean mayFire;

        /**
         * One tick's view of the duel. {@code attackAngle} and {@code attackPower} are what
         * the main gun would fire at the enemy; {@code gunOnTarget} says whether the gun
         * finished last tick's turn and may fire at that aim.
         *
         * @param time the tick
         * @param x our x, px
         * @param y our y, px
         * @param heading our body's heading, radians
         * @param gunHeading our gun's heading, radians
         * @param gunHeat the gun's heat
         * @param coolingRate the gun's cooling rate per tick
         * @param energy our energy
         * @param enemyX the enemy's x at the last scan, px
         * @param enemyY the enemy's y at the last scan, px
         * @param enemyEnergy the enemy's energy at the last scan
         * @param attackAngle the angle the main gun would aim at
         * @param attackPower the power the main gun would fire
         * @param gunOnTarget whether the gun may fire at the attack aim
         * @param mayFire whether the conductor lets a shot leave this tick (WEAVE-3)
         */
        public Situation(long time, double x, double y, double heading, double gunHeading,
                         double gunHeat, double coolingRate, double energy, double enemyX,
                         double enemyY, double enemyEnergy, double attackAngle,
                         double attackPower, boolean gunOnTarget, boolean mayFire) {
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
            this.mayFire = mayFire;
        }
    }

    /** What to do this tick. {@code attack} marks a shot at the enemy rather than a shield. */
    public static final class Command {
        /** Body turn, radians, right positive. */
        public final double bodyTurn;
        /** Distance to drive ahead, px; the sideways step. */
        public final double ahead;
        /** Gun turn, radians, right positive. */
        public final double gunTurn;
        /** Power to fire, or 0 to hold fire. */
        public final double firePower;
        /** Whether a shot is at the enemy (true) or at one of its bullets (false). */
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

    private final ShieldList list;
    private final Telemetry telemetry;
    private final ShieldBudget budget;

    private final long[] scanTime = new long[HISTORY];
    private final double[][] scan = new double[HISTORY][7];
    private int scans;
    private final List<EnemyWave> waves = new ArrayList<>();
    private final List<Double> ownBullets = new ArrayList<>();
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

    /** The opponent the list was asked about, and the answer. */
    private String decidedFor;
    private boolean listed;
    private boolean battleOff;
    private boolean roundOff;
    private String exitReason = "-";
    private boolean announced;
    private int round;
    private long now;

    private int hitsThisRound;
    private int unpredictedThisRound;
    private int interceptsThisRound;
    private int shieldShotsThisRound;
    private int attackShotsThisRound;

    /**
     * A shield mode for one battle.
     *
     * @param list the opponents it applies to; null or empty for none
     * @param telemetry where its records go
     */
    public ShieldMode(ShieldList list, Telemetry telemetry) {
        this(list, telemetry, 0);
    }

    /**
     * A shield mode for one battle of a known length.
     *
     * @param list the opponents it applies to; null or empty for none
     * @param telemetry where its records go
     * @param rounds the battle's number of rounds, for SHIELD-6's budget; 0 when not known
     */
    public ShieldMode(ShieldList list, Telemetry telemetry, int rounds) {
        this.list = list == null ? ShieldList.NONE : list;
        this.telemetry = telemetry;
        this.budget = new ShieldBudget(rounds);
        newRound(0);
    }

    /**
     * Forgets the round's waves, scans and counters; keeps the predictor scores, the budget
     * and the battle's verdict. The round is on again unless the battle's verdict is off.
     *
     * @param round the round number, from 0
     */
    public void newRound(int round) {
        this.round = round;
        scans = 0;
        waves.clear();
        ownBullets.clear();
        plan = null;
        // Every gun starts a round at heat 3.0.
        enemyNextFire = (long) Math.ceil(3.0 / coolingRate);
        lastEnemyShot = 0;
        enemyMoved = false;
        roundOff = false;
        exitReason = "-";
        announced = false;
        now = 0;
        hitsThisRound = 0;
        unpredictedThisRound = 0;
        interceptsThisRound = 0;
        shieldShotsThisRound = 0;
        attackShotsThisRound = 0;
    }

    /**
     * SHIELD-5: whether the opponent is on the list. False before the first scan.
     *
     * @return whether shield mode applies to this battle's opponent
     */
    public boolean listed() {
        return listed;
    }

    /**
     * SHIELD-5, SHIELD-6: whether shield mode is on now: the opponent is listed, the battle's
     * budget has not run out and the round has not left it.
     *
     * @return whether the mode drives this tick
     */
    public boolean active() {
        return listed && !battleOff && !roundOff;
    }

    /**
     * SHIELD-6: whether the mode has been left for the rest of the battle.
     *
     * @return true after the budget ran out
     */
    public boolean battleOff() {
        return battleOff;
    }

    /**
     * The budget's state, for tests and records.
     *
     * @return the battle's SHIELD-6 budget
     */
    public ShieldBudget budget() {
        return budget;
    }

    /**
     * The shield bullets fired this round.
     *
     * @return the count
     */
    public int shieldShots() {
        return shieldShotsThisRound;
    }

    /**
     * The enemy bullets of this round that our bullets met.
     *
     * @return the count
     */
    public int intercepts() {
        return interceptsThisRound;
    }

    /** The predictor that has matched the most enemy bullets exactly. */
    int bestPredictor() {
        int best = 0;
        for (int i = 1; i < PREDICTORS; i++) {
            if (exactHits[i] > exactHits[best]) best = i;
        }
        return best;
    }

    /**
     * One scan of the enemy. The first of the battle asks the list (SHIELD-5).
     *
     * @param name the enemy's name as the engine lists it
     * @param time the tick
     * @param myX our x
     * @param myY our y
     * @param myHeading our body's heading, radians
     * @param myVelocity our velocity
     * @param enemyX the enemy's x
     * @param enemyY the enemy's y
     * @param enemyHeading the enemy's heading, radians
     * @param enemyVelocity the enemy's velocity
     */
    public void onScan(String name, long time, double myX, double myY, double myHeading,
                       double myVelocity, double enemyX, double enemyY, double enemyHeading,
                       double enemyVelocity) {
        if (decidedFor == null || !decidedFor.equals(name)) {
            decidedFor = name;
            listed = list.matches(name);
        }
        if (!listed) return;
        now = time;
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
        if (active() && !announced) {
            announced = true;
            telemetry.emit("SH," + round + "," + time + ",on");
        }
    }

    private double[] scanAt(long time) {
        for (int n = 0; n < Math.min(scans, HISTORY); n++) {
            int i = (scans - 1 - n) % HISTORY;
            if (scanTime[i] == time) return scan[i];
        }
        return null;
    }

    /**
     * An enemy bullet of {@code power} fired in the enemy's tick {@code fireTime}, from where
     * it stood at that tick. Its heading is predicted four ways, all head-on at where we
     * stood on the tick before: from where the enemy stood then (0), from its firing point
     * (1), from where its velocity was taking it (2), and at where we stood on the firing
     * tick (3).
     *
     * @param fireTime the tick the bullet left
     * @param power the bullet's power
     */
    public void onEnemyShot(long fireTime, double power) {
        if (!listed) return;
        lastEnemyShot = fireTime;
        lastEnemyPower = power;
        enemyNextFire = fireTime + (long) Math.ceil((1 + power / 5) / coolingRate - 1e-9);
        if (!active()) return;
        double[] at = scanAt(fireTime);
        double[] before = scanAt(fireTime - 1);
        if (at == null || before == null) return;
        EnemyWave w = new EnemyWave();
        w.time = fireTime;
        w.ox = at[2];
        w.oy = at[3];
        w.power = power;
        w.speed = 20 - 3 * power;
        w.headings[0] = ShieldGeometry.bearing(before[2], before[3], before[0], before[1]);
        w.headings[1] = ShieldGeometry.bearing(at[2], at[3], before[0], before[1]);
        double projX = before[2] + Math.sin(before[4]) * before[5];
        double projY = before[3] + Math.cos(before[4]) * before[5];
        w.headings[2] = ShieldGeometry.bearing(projX, projY, before[0], before[1]);
        w.headings[3] = ShieldGeometry.bearing(at[2], at[3], at[0], at[1]);
        w.direction = before[6];
        if (waves.size() >= MAX_WAVES) waves.remove(0);
        waves.add(w);
    }

    /**
     * An enemy bullet hit us: its damage goes to SHIELD-6's budget, and its heading scores
     * the predictors.
     *
     * @param time the tick
     * @param power the bullet's power
     * @param x where it hit, x
     * @param y where it hit, y
     * @param heading the bullet's heading, radians
     */
    public void onHitByBullet(long time, double power, double x, double y, double heading) {
        if (!listed) return;
        now = time;
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
        budget.damageTaken(power);
        if (!battleOff && budget.exceeded()) {
            battleOff = true;
            plan = null;
            telemetry.emit("SH," + round + "," + time + ",off,budget");
            return;
        }
        if (!active()) return;
        hitsThisRound++;
        if (!predicted) unpredictedThisRound++;
        if (unpredictedThisRound >= MAX_UNPREDICTED_HITS) {
            leaveRound(time, "unpredicted");
        } else if (hitsThisRound >= MIN_HITS_TO_JUDGE && hitsThisRound > interceptsThisRound) {
            leaveRound(time, "outhit");
        }
    }

    /** SHIELD-5, SHIELD-6: predictor {@code i}'s heading for wave {@code w}. */
    private double predicted(EnemyWave w, int i) {
        int b = i % BASES;
        switch (i / BASES) {
            case 0: return w.headings[b];
            case 1: return w.headings[b] + offsets[b];
            default: return w.headings[b] + w.direction * directionalOffsets[b];
        }
    }

    /**
     * One of our bullets met an enemy bullet.
     *
     * @param time the tick
     * @param enemyPower the enemy bullet's power
     * @param x where they met, x
     * @param y where they met, y
     */
    public void onIntercepted(long time, double enemyPower, double x, double y) {
        if (!listed) return;
        now = time;
        EnemyWave w = findWave(time, enemyPower, x, y);
        if (w != null) w.resolved = true;
        if (active()) interceptsThisRound++;
    }

    /**
     * One of our bullets hit the enemy: the damage is ours in SHIELD-6's budget.
     *
     * @param power our bullet's power
     */
    public void onOurBulletHit(double power) {
        if (listed) budget.damageDealt(power);
    }

    /** The enemy drove into us, or we into it: a rammer is no target for a shield. */
    public void onRammed() {
        if (active()) leaveRound(now, "rammed");
    }

    /**
     * The engine has skipped turns and the duel is in duress (RES-14): the predictions'
     * timing can no longer be trusted, so the round leaves shield mode.
     *
     * @param time the tick
     */
    public void onDuress(long time) {
        if (active()) leaveRound(time, "duress");
    }

    /**
     * A round ended: the round's record is written and the budget is checked.
     *
     * @param tick the tick the round ended on
     * @param won whether we won it
     */
    public void onRoundEnded(long tick, boolean won) {
        if (!listed) return;
        telemetry.emit(String.format(Locale.ROOT, "SR,%d,%d,%d,%d,%d,%d,%d,%.1f,%.1f,%s",
            round, tick, shieldShotsThisRound, interceptsThisRound, hitsThisRound,
            unpredictedThisRound, attackShotsThisRound, budget.taken(), budget.allowed(),
            battleOff ? "budget" : exitReason));
        if (!battleOff && budget.exceeded()) {
            battleOff = true;
            plan = null;
            telemetry.emit("SH," + round + "," + tick + ",off,budget");
        }
    }

    /**
     * Whether a bullet of ours of {@code power} that has just hit, missed or met a bullet is
     * one this mode shot at an enemy bullet, and so no evidence about the enemy's aim (not
     * SHIELD-1's detector's, not the hit rate's). The oldest shield bullet of that power is
     * taken off the list.
     *
     * @param power the bullet's power
     * @return whether it was a shield bullet
     */
    public boolean ownBulletResolved(double power) {
        for (int i = 0; i < ownBullets.size(); i++) {
            if (Math.abs(ownBullets.get(i) - power) < 1e-6) {
                ownBullets.remove(i);
                return true;
            }
        }
        return false;
    }

    private void leaveRound(long time, String reason) {
        roundOff = true;
        plan = null;
        exitReason = reason;
        telemetry.emit("SH," + round + "," + time + ",exit," + reason);
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

    /**
     * One tick of shield mode. Returns null when the tick's own check has just ended the
     * mode for the round ({@code close} or {@code quiet}); the duel then plays the tick as it
     * would without shield mode.
     *
     * @param s the tick's view
     * @return what to do, or null if the mode has been left
     */
    public Command tick(Situation s) {
        now = s.time;
        coolingRate = s.coolingRate;
        if (Math.hypot(s.enemyX - s.x, s.enemyY - s.y) < CLOSE_RANGE) {
            leaveRound(s.time, "close");
            return null;
        }
        if (s.time - lastEnemyShot >= QUIET_TICKS) {
            leaveRound(s.time, "quiet");
            return null;
        }
        prune(s);
        double back = 0;

        if (plan != null && s.time == plan.fireTime) {
            Plan p = plan;
            plan = null;
            p.wave.shieldTried = true;
            if (canFire(p, s)) {
                shieldShotsThisRound++;
                if (ownBullets.size() >= MAX_OWN_BULLETS) ownBullets.remove(0);
                ownBullets.add(p.power);
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
        if (power > 0) {
            attackShotsThisRound++;
            return new Command(towardParallel(s), back, gunTurn, power, true);
        }
        return new Command(towardParallel(s), back, gunTurn, 0, false);
    }

    private boolean canFire(Plan p, Situation s) {
        if (!s.mayFire || s.gunHeat > 0 || s.energy <= p.power) return false;
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
     * The power to fire at the enemy now, or 0. Only with the gun cool and on target, no
     * unshielded threat in flight, and either the enemy idle for {@link #IDLE_TICKS} or our
     * gun cool again in time to shield its next possible shot.
     */
    private double attackPower(Situation s) {
        if (!s.mayFire || s.gunHeat > 0 || !s.gunOnTarget || s.attackPower < 0.1) return 0;
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
