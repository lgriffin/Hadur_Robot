package lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Shared body of the movement lab's reference shooters (docs/bench/move-lab.md). Every shooter
 * moves the same way, locks the radar the same way and fires the same power; the subclasses differ
 * only in {@link #aim()}, so a difference in damage taken between two Hadur movements, per shooter,
 * is the gun's doing.
 *
 * <p>Movement: orbit the enemy at about 450 px, reversing every 30 to 60 ticks on a fixed
 * schedule (the same in every round), with wall smoothing. Gun: fixed power 2.0, fired whenever the
 * gun is cool and turned. Waves: a wave leaves the shooter's position at the tick of the shot,
 * travels 20 - 3 * power px per tick and breaks when its radius passes the enemy; the guess
 * factor is the enemy's angle from the wave's source over the maximum escape angle asin(8 / speed),
 * signed by the enemy's lateral direction at the shot.</p>
 */
public abstract class LabBase extends AdvancedRobot {

    public static final double POWER = 2.0;
    public static final double SPEED = 20 - 3 * POWER;
    public static final double ORBIT = 450;
    static final double MARGIN = 18;
    /** Reversal schedule: ticks between direction changes, 30 to 60, the same in every round. */
    static final int[] LEGS = {41, 33, 57, 48, 36, 53, 30, 45, 60, 38, 51, 44};

    /** A wave: where and when a shot (real or logged) left, and what the shooter knew then. */
    protected static final class Wave {
        double x, y, absBearing;
        long fired;
        int dir;
        Object info;
    }

    // Per-tick picture of the enemy, set before aim() runs.
    protected long time;
    protected double myX, myY;
    protected double eX, eY, eHeading, eVelocity, eDistance, absBearing;
    protected double eLateral, eAdvancing, eAccel, eTurn, eEnergy;
    protected int latDir = 1;
    protected int sinceDirChange;
    protected int fw, fh;
    protected final List<Wave> waves = new ArrayList<Wave>();

    private int moveDir = 1;
    private int leg;
    private long nextFlip;
    private long lastScan = -1;
    private double prevVelocity, prevHeading;
    private boolean haveEnemy;
    private double lastLat;

    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        setAdjustRadarForRobotTurn(true);
        fw = (int) getBattleFieldWidth();
        fh = (int) getBattleFieldHeight();
        waves.clear();
        haveEnemy = false;
        leg = 0;
        moveDir = 1;
        nextFlip = LEGS[0];
        sinceDirChange = 0;
        latDir = 1;
        lastLat = 0;
        roundStart();
        while (true) {
            if (getTime() != lastScan) setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
            execute();
        }
    }

    // ---- hooks -------------------------------------------------------------------------

    /** Per-round reset of a subclass's history. */
    protected void roundStart() {}

    /** The absolute bearing to fire along, from the state of this tick. */
    protected abstract double aim();

    /** Whether the shooter keeps waves at all. */
    protected boolean usesWaves() { return false; }

    /** Whether a wave is logged every tick, firing or not (otherwise one per shot). */
    protected boolean waveEveryTick() { return false; }

    /** What a wave remembers about the moment it left. */
    protected Object snapshot() { return null; }

    /** A wave has broken: the enemy's guess factor on it is {@code gf}. */
    protected void waveBroke(Wave w, double gf) {}

    // ---- the tick ------------------------------------------------------------------------

    public void onScannedRobot(ScannedRobotEvent e) {
        time = getTime();
        lastScan = time;
        myX = getX();
        myY = getY();
        absBearing = getHeadingRadians() + e.getBearingRadians();
        eDistance = e.getDistance();
        eX = myX + Math.sin(absBearing) * eDistance;
        eY = myY + Math.cos(absBearing) * eDistance;
        eHeading = e.getHeadingRadians();
        eVelocity = e.getVelocity();
        eEnergy = e.getEnergy();
        eLateral = eVelocity * Math.sin(eHeading - absBearing);
        eAdvancing = -eVelocity * Math.cos(eHeading - absBearing);
        if (haveEnemy) {
            eAccel = Math.abs(eVelocity) - Math.abs(prevVelocity);
            eTurn = Utils.normalRelativeAngle(eHeading - prevHeading);
        } else {
            eAccel = 0;
            eTurn = 0;
        }
        int sign = eLateral > 0.01 ? 1 : eLateral < -0.01 ? -1 : 0;
        if (sign != 0) {
            if (lastLat != 0 && sign != (lastLat > 0 ? 1 : -1)) sinceDirChange = 0; else sinceDirChange++;
            latDir = sign;
            lastLat = sign;
        } else {
            sinceDirChange++;
        }
        prevVelocity = eVelocity;
        prevHeading = eHeading;
        haveEnemy = true;

        breakWaves();
        observe();
        move();
        setTurnRadarRightRadians(Utils.normalRelativeAngle(absBearing - getRadarHeadingRadians()) * 2);
        shoot();
    }

    /** Called once per scan after the waves broke, before the gun: histories grow here. */
    protected void observe() {}

    private void breakWaves() {
        for (Iterator<Wave> it = waves.iterator(); it.hasNext();) {
            Wave w = it.next();
            double radius = (time - w.fired) * SPEED;
            if (radius >= Math.hypot(eX - w.x, eY - w.y)) {
                double a = Math.atan2(eX - w.x, eY - w.y);
                double gf = Utils.normalRelativeAngle(a - w.absBearing) / escape() * w.dir;
                waveBroke(w, Math.max(-1, Math.min(1, gf)));
                it.remove();
            }
        }
    }

    protected static double escape() { return Math.asin(8 / SPEED); }

    private void move() {
        if (time >= nextFlip) {
            moveDir = -moveDir;
            leg = (leg + 1) % LEGS.length;
            nextFlip = time + LEGS[leg];
        }
        double closing = Math.max(-1, Math.min(1, (eDistance - ORBIT) / 300)) * 0.6;
        double goal = absBearing + moveDir * (Math.PI / 2 - closing);
        for (int i = 0; i < 32; i++) {
            double px = myX + Math.sin(goal) * 160, py = myY + Math.cos(goal) * 160;
            if (px > 30 && px < fw - 30 && py > 30 && py < fh - 30) break;
            goal -= moveDir * 0.1;
        }
        double turn = Utils.normalRelativeAngle(goal - getHeadingRadians());
        double ahead = 1;
        if (Math.abs(turn) > Math.PI / 2) {
            turn = Utils.normalRelativeAngle(turn + Math.PI);
            ahead = -1;
        }
        setTurnRightRadians(turn);
        setMaxVelocity(8);
        setAhead(ahead * 100);
    }

    private void shoot() {
        double target = aim();
        double delta = Utils.normalRelativeAngle(target - getGunHeadingRadians());
        setTurnGunRightRadians(delta);
        boolean fire = getGunHeat() == 0 && Math.abs(delta) < 0.03 && getEnergy() > POWER;
        if (fire) setFire(POWER);
        if (usesWaves() && (fire || waveEveryTick())) {
            Wave w = new Wave();
            w.x = myX;
            w.y = myY;
            w.fired = time;
            w.absBearing = Math.atan2(eX - myX, eY - myY);
            w.dir = latDir;
            w.info = snapshot();
            waves.add(w);
        }
    }

    // ---- helpers for the guns --------------------------------------------------------------

    protected double clipX(double x) { return Math.max(MARGIN, Math.min(fw - MARGIN, x)); }

    protected double clipY(double y) { return Math.max(MARGIN, Math.min(fh - MARGIN, y)); }

    /**
     * Iterative lead: the enemy moves at {@code v} with heading changing by {@code turn} per tick,
     * clipped to the walls; the first tick k at which the bullet's radius k * SPEED reaches it is the
     * aim point. Falls back to head-on if nothing is reached within 200 ticks.
     */
    protected double lead(double turn) {
        double x = eX, y = eY, h = eHeading;
        for (int k = 1; k <= 200; k++) {
            h += turn;
            x = clipX(x + Math.sin(h) * eVelocity);
            y = clipY(y + Math.cos(h) * eVelocity);
            if (Math.hypot(x - myX, y - myY) <= k * SPEED) return Math.atan2(x - myX, y - myY);
        }
        return absBearing;
    }

    /** Aim for a guess factor: the head-on bearing offset by gf * escape angle in the lateral direction. */
    protected double aimAt(double gf) {
        return absBearing + latDir * gf * escape();
    }
}
