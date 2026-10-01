package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * A wave: the circle a bullet fired at {@link #fireTime} from {@link #sourceLocation} would
 * lie on, growing by {@link #bulletSpeed()} pixels every tick. Whatever angle the shooter
 * chose, its bullet is somewhere on that circle, so when the circle sweeps past the target
 * the angle that would have hit can be measured and learned from, without knowing where the
 * real bullet went.
 *
 * <p>The duel makes two waves at every scan. A gun wave goes from us at the enemy, and the
 * gun learns from where the enemy was when it broke; it is a {@link #firingWave} only if we
 * really fired on that tick. A movement wave goes from the enemy at us, and becomes a firing
 * wave when the energy ledger finds that the enemy fired on its tick (WAVE-1, WAVE-2); only
 * those are surfed. {@link WaveManager} holds them and decides when each one breaks.</p>
 *
 * <p><b>Guess factors.</b> Angles on a wave are measured from {@link #absBearing}, the
 * bearing from source to target at fire time, and scaled by the most the target could have
 * moved off that line before the bullet arrived. A guess factor of 0 is head-on; 1 is the
 * full escape angle in the target's {@link #orbitDirection} (the way it was moving round
 * the source), -1 the full escape angle the other way. Scaling by the escape angle, and
 * mirroring by the orbit direction, lets what was learned at one distance, bullet power and
 * direction of travel apply to another. The classic scale is {@link #maxEscapeAngle()},
 * {@code asin(8 / bulletSpeed)}: a robot at most 8 px/tick fast, moving square to the line
 * of fire, against a bullet of that speed. The precise scale,
 * {@link #preciseEscapeAngle(boolean)}, simulates the target's escape on each side and
 * accounts for the walls.</p>
 *
 * <p><b>Engine facts relied on.</b> A bullet of power {@code p} moves at
 * {@code 20 - 3p} px/tick. Robots are 36 by 36 pixel squares aligned with the axes. Each
 * turn the engine moves every bullet before any robot, so a bullet's move from radius
 * {@code r(t)} to {@code r(t + 1)} is tested against where the robot stood at the end of
 * tick {@code t}; that is why {@link #checkWavePosition} and {@link #preciseIntersection}
 * test a state of tick {@code t} against the next tick's radius.</p>
 *
 * <p><b>Bullet shadows (MOVE-1).</b> A wave from the enemy also carries the firing angles
 * at which its bullet would meet one of ours in flight and never arrive; the movement
 * computes them ({@code move.BulletShadows}) and scales the danger at each angle by what is
 * left unshadowed ({@link #shadowedFraction}).</p>
 *
 * <p>The target attributes ({@code target...} fields) are a snapshot of the target at fire
 * time. They are the raw features the KNN formulas in the gun and movement packages turn
 * into search coordinates. Angles are absolute radians (0 = north, clockwise); note that
 * {@link #absBearing} comes from {@code atan2} and may be negative. Distances are pixels,
 * times ticks. The fields are public and mutable, as in the 1.20 code this was ported
 * from.</p>
 */
public class Wave implements Cloneable {

    /**
     * Wall stick, in pixels, for the wall smoothing used when the precise escape angle's
     * straight run hits a wall: how far ahead of the robot a heading is tested against the
     * walls.
     */
    public static final double PRECISE_MEA_WALL_STICK = 120.0;
    /** The origin, from which displacement vectors are projected and measured. */
    public static final Point2D.Double ORIGIN = new Point2D.Double(0, 0);
    /**
     * Half the diagonal of a robot's 36 by 36 box, 18 &times; sqrt(2) &asymp; 25.46 px: the
     * farthest any point of a robot is from its centre. A cheap bound before the exact
     * box test in {@link #checkWavePosition}.
     */
    public static final double MAX_BOT_RADIUS = 18.0 / Math.cos(Math.PI / 4);

    /**
     * The duel opponent this wave concerns: its target for a gun wave, its source for a
     * movement wave. Views and statistics are kept per name.
     */
    public String botName;
    /** Where the bullet was (or would have been) fired from, pixels. */
    public Point2D.Double sourceLocation;
    /** The target's centre at fire time, pixels. */
    public Point2D.Double targetLocation;
    /**
     * The bearing from source to target at fire time, radians, in (-pi, pi]: guess factor
     * 0.
     */
    public double absBearing;
    /** The round the wave was fired in, from 0. */
    public int fireRound;
    /** The tick the wave was fired; its radius is 0 at this tick. */
    public long fireTime;
    /**
     * +1 when the target's direction of travel at fire time turns clockwise from the line
     * of fire (it is orbiting the source clockwise), -1 when counter-clockwise. A relative
     * heading of exactly 0 counts as +1. Multiplying by it mirrors counter-clockwise movement onto
     * clockwise, so both share guess factors.
     */
    public int orbitDirection;
    /** The target's body heading at fire time, radians (0 = north, clockwise). */
    public double targetHeading;
    /**
     * The angle between the target's direction of travel and the line of fire, radians, in
     * [0, pi]: 0 moving straight away from the source, pi/2 square to it, pi straight at it.
     */
    public double targetRelativeHeading;
    /** The target's velocity at fire time, pixels per tick, signed as the engine gives it. */
    public double targetVelocity;
    /**
     * The sign of the target's last non-zero velocity, +1 or -1: which way it was going,
     * remembered through a stop.
     */
    public int targetVelocitySign;
    /**
     * The target's acceleration at fire time, pixels per tick per tick: positive speeding up
     * in its direction of travel, negative braking ({@code DiaUtils.accel}).
     */
    public double targetAccel;
    /** The distance from source to target at fire time, pixels. */
    public double targetDistance;
    /** Kept for the formulas' layout; nothing in the core sets it, so it stays 0. */
    public long targetDchangeTime;
    /**
     * How many scans in a row the target's velocity had stayed within 0.5 px/tick of its
     * value at the scan before; 0 right after a change.
     */
    public long targetVchangeTime;
    /**
     * How far the target could orbit in its orbit direction before a wall, as a multiple of
     * the classic escape angle, capped at 1.5 by {@link #setWallDistances()}.
     */
    public double targetWallDistance;
    /** As {@link #targetWallDistance}, orbiting the other way. */
    public double targetRevWallDistance;
    /**
     * Pixels between the target's position at fire time and 8 ticks earlier (or its
     * earliest logged position this round, when the log is shorter).
     */
    public double targetDl8t;
    /** Pixels between the target's position at fire time and 20 ticks earlier. */
    public double targetDl20t;
    /** Pixels between the target's position at fire time and 40 ticks earlier. */
    public double targetDl40t;
    /**
     * GUN-2: how many scans in a row the target's velocity had kept the same sign (its
     * direction along its heading) at fire time; 0 right after a reversal. Distinct from
     * {@link #targetVchangeTime}, which resets on any speed change of more than 0.5 px/tick,
     * not only a change of direction.
     */
    public long targetTicksSinceReversal;
    /**
     * GUN-2: how many times the target's orbit direction around the source flipped over the
     * 40 scans up to and including fire time (clockwise to counter-clockwise or back); a
     * surfer that keeps changing which way it orbits scores high here.
     */
    public int targetOrbitChanges40;
    /** The target's energy at fire time. */
    public double targetEnergy;
    /** The source's energy at fire time. */
    public double sourceEnergy;
    /** Gun waves: our gun heat at fire time, for {@link #virtuality()}. */
    public double gunHeat;
    /** Opponents alive at fire time (the gun's melee feature); 0 when not set. */
    public int enemiesAlive;
    /** Gun waves: the tick of our last real bullet this round, 0 when none yet. */
    public long lastBulletFiredTime;
    /**
     * Movement waves: the enemy's bullet on this wave hit us, set when the bullet is matched
     * to the wave. Its break then reports a hit to their rolling hit rate.
     */
    public boolean hitByBullet;
    /** Movement waves: this wave's bullet was shot down by one of ours; no longer surfed. */
    public boolean bulletHitBullet;
    /**
     * A real bullet rides on this wave: we fired on this tick (gun wave), or the energy
     * ledger found an enemy shot on it (movement wave; WAVE-1, WAVE-2). Other waves are
     * virtual.
     */
    public boolean firingWave;
    /**
     * An alternative wave, which bullet matching, the gun's logging and the last-fire-time
     * lookup skip. Nothing in the core currently sets it.
     */
    public boolean altWave;
    /**
     * WAVE-3: this movement wave's power came from a scan where the energy ledger also
     * inferred a wall hit, so the split between the wall and the bullet is a guess. Surfed
     * at half weight ({@code SurfMover}) rather than trusted like a clean reading.
     */
    public boolean uncertain;

    /** The bullet's power, in [0.1, 3.0]; for a movement wave, a guess until a shot is found. */
    private double bulletPower;
    /** {@code 20 - 3 * bulletPower}, px/tick: the engine's bullet speed. */
    private double bulletSpeed;
    /** The classic escape angle {@code asin(8 / bulletSpeed)}, radians. */
    private double maxEscapeAngle;

    /** The field, for the wall distances. */
    private BattleField battleField;
    /** The movement predictor, for the precise escape angles. */
    private MovementPredictor predictor;

    /** The precise escape angle on the positive guess-factor side, once computed. */
    private Double cachedPositiveEscapeAngle;
    /** The precise escape angle on the negative guess-factor side, once computed. */
    private Double cachedNegativeEscapeAngle;

    /**
     * MOVE-1: firing angles (absolute, from the source) where one of our bullets meets this
     * wave's bullet, as disjoint {@code [low, high]} pairs; empty when none of ours crosses it.
     */
    private List<double[]> shadows = new ArrayList<>();
    /** MOVE-1: the angles that may meet one of ours, depending on the engine's bullet order. */
    private List<double[]> possibleShadows = new ArrayList<>();
    /** MOVE-1: whether this wave has ever had a shadow, for the round's count. */
    public boolean everShadowed;
    /** MOVE-1: the version of our bullets in flight these shadows were computed for; -1 never. */
    public long shadowVersion = -1;

    /** An empty wave with no field or predictor, for subclasses and tests. */
    protected Wave() {}

    /**
     * A wave fired now. The other target attributes are set afterwards with the fluent
     * setters, and {@link #setWallDistances()} once the power is known.
     *
     * @param botName the duel opponent the wave concerns
     * @param sourceLocation where it is fired from, pixels
     * @param targetLocation the target's centre now, pixels
     * @param fireRound the current round
     * @param fireTime the current tick
     * @param bulletPower the bullet's power (a guess, for a movement wave)
     * @param targetHeading the target's body heading, radians
     * @param targetVelocity the target's velocity, pixels per tick
     * @param targetVelocitySign the sign of its last non-zero velocity, +1 or -1
     * @param battleField the field, for wall distances
     * @param predictor the movement predictor, for the precise escape angles
     */
    public Wave(String botName, Point2D.Double sourceLocation, Point2D.Double targetLocation,
                int fireRound, long fireTime, double bulletPower,
                double targetHeading, double targetVelocity, int targetVelocitySign,
                BattleField battleField, MovementPredictor predictor) {
        this.botName = botName;
        this.sourceLocation = sourceLocation;
        this.targetLocation = targetLocation;
        this.fireRound = fireRound;
        this.fireTime = fireTime;
        setBulletPower(bulletPower);
        this.targetHeading = targetHeading;
        this.targetVelocity = targetVelocity;
        this.targetVelocitySign = targetVelocitySign;
        this.battleField = battleField;
        this.predictor = predictor;
        this.absBearing = DiaUtils.absoluteBearing(sourceLocation, targetLocation);
        // The direction of travel relative to the line of fire, in [-pi, pi): its sign is
        // which way the target is going round the source, its size how square it is to
        // the line. Both must use the direction of travel (effectiveHeading), not the body
        // heading, or a robot backing up would look like it went the other way.
        double relativeHeading = Angles.normalRelativeAngle(
            effectiveHeading() - absBearing);
        this.orbitDirection = relativeHeading < 0 ? -1 : 1;
        this.targetRelativeHeading = Math.abs(relativeHeading);
        this.hitByBullet = false;
        this.bulletHitBullet = false;
        this.firingWave = false;
        this.altWave = false;
    }

    /** MOVE-1: replaces the wave's bullet shadows (see {@link #shadows()}); the possible ones are the certain ones. */
    public Wave setShadows(List<double[]> shadows) {
        return setShadows(shadows, shadows);
    }

    /**
     * MOVE-1: replaces the wave's certain shadows and the possible ones (which include the
     * certain ones): angles a bullet of ours meets whatever order the engine moves them in,
     * and angles it meets in one order of the two.
     */
    public Wave setShadows(List<double[]> certain, List<double[]> possible) {
        this.shadows = certain;
        this.possibleShadows = possible;
        return this;
    }

    /**
     * MOVE-1: the firing angles, absolute radians from the source as {@code [low, high]}
     * pairs, that may meet one of our bullets depending on the engine's bullet order; they
     * include the certain {@link #shadows()}.
     */
    public List<double[]> possibleShadows() {
        return possibleShadows;
    }

    /**
     * MOVE-1: the firing angles, absolute radians from the source as {@code [low, high]}
     * pairs, whose bullet meets one of ours whatever order the engine moves them in.
     */
    public List<double[]> shadows() {
        return shadows;
    }

    /**
     * MOVE-1: the share of the firing angles that would hit a robot at {@code intersection}
     * that fall in a bullet shadow, in [0, 1]. A bullet fired at a shadowed angle meets one
     * of ours first and never arrives.
     */
    public double shadowedFraction(Intersection intersection) {
        // "!(bandwidth > 0)" also catches a NaN width. With no width there is no share to
        // take, and covered() would divide by zero.
        if (possibleShadows.isEmpty() || intersection == null || !(intersection.bandwidth > 0)) return 0;
        // A possible shadow stops the bullet about half the time. The possible shadows
        // contain the certain ones, so with c the certain share and p the possible share,
        // (c + p) / 2 = c + (p - c) / 2: the certain part counts fully, the part that is
        // only possible counts half. The danger kept is 1 minus this.
        return (covered(shadows, intersection) + covered(possibleShadows, intersection)) / 2;
    }

    /**
     * MOVE-3: how much of a bullet fired at each angle of the intersection would still reach
     * us. The range {@code angle +/- bandwidth} is cut at every shadow edge into segments
     * {@code {from, to, transmission}}: 0 inside a certain shadow, 0.5 where the shadow is
     * only possible (a bullet stopped about half the time), 1 elsewhere. The segments are in
     * ascending order and cover the whole range; with no shadows it is one segment at 1.
     *
     * @param intersection the firing angles that would hit us
     * @return the segments, never empty for a positive width
     */
    public List<double[]> transmission(Intersection intersection) {
        double low = intersection.angle - intersection.bandwidth;
        double high = intersection.angle + intersection.bandwidth;
        List<double[]> out = new ArrayList<>();
        if (possibleShadows.isEmpty() || !(intersection.bandwidth > 0)) {
            out.add(new double[] {low, high, 1.0});
            return out;
        }
        java.util.TreeSet<Double> cuts = new java.util.TreeSet<>();
        cuts.add(low);
        cuts.add(high);
        for (List<double[]> list : List.of(shadows, possibleShadows)) {
            for (double[] shadow : list) {
                double from = DiaUtils.normalizeAngle(shadow[0], intersection.angle);
                double to = from + (shadow[1] - shadow[0]);
                if (from > low && from < high) cuts.add(from);
                if (to > low && to < high) cuts.add(to);
            }
        }
        Double previous = null;
        for (double cut : cuts) {
            if (previous != null && cut > previous) {
                double mid = (previous + cut) / 2;
                double stopped = ((contains(shadows, mid, intersection.angle) ? 1 : 0)
                    + (contains(possibleShadows, mid, intersection.angle) ? 1 : 0)) / 2.0;
                out.add(new double[] {previous, cut, 1.0 - stopped});
            }
            previous = cut;
        }
        return out;
    }

    private static boolean contains(List<double[]> intervals, double angle, double near) {
        for (double[] shadow : intervals) {
            double from = DiaUtils.normalizeAngle(shadow[0], near);
            if (angle >= from && angle <= from + (shadow[1] - shadow[0])) return true;
        }
        return false;
    }

    /**
     * The share of the intersection's angle range, {@code angle +/- bandwidth}, that the
     * {@code intervals} cover, in [0, 1]. The intervals are assumed disjoint, as the shadow
     * lists are, so their overlaps can simply be added.
     */
    private static double covered(List<double[]> intervals, Intersection intersection) {
        double low = intersection.angle - intersection.bandwidth;
        double high = intersection.angle + intersection.bandwidth;
        double covered = 0;
        for (double[] shadow : intervals) {
            // Shift the interval by whole turns so its start lies within pi of the
            // intersection's angle; otherwise an interval near 2 pi and an intersection
            // near 0 would never seem to overlap. The width is unchanged.
            double from = DiaUtils.normalizeAngle(shadow[0], intersection.angle);
            double to = from + (shadow[1] - shadow[0]);
            covered += Math.max(0, Math.min(high, to) - Math.max(low, from));
        }
        return Math.min(1.0, covered / (high - low));
    }

    /**
     * MOVE-1: whether a bullet fired along {@code angle} from the source may meet one of ours.
     * The core uses it as a self-check: an enemy bullet our bullet destroyed should have
     * been fired inside a possible shadow.
     *
     * @param angle the firing angle, absolute radians
     * @param tolerance radians of slack on each side of every shadow
     * @return whether the angle lies in a possible shadow, within the tolerance
     */
    public boolean inShadow(double angle, double tolerance) {
        for (double[] shadow : possibleShadows) {
            // Bring the angle within pi of the shadow's middle before comparing, so the
            // wrap at 2 pi cannot hide a match.
            double a = DiaUtils.normalizeAngle(angle, (shadow[0] + shadow[1]) / 2);
            if (a >= shadow[0] - tolerance && a <= shadow[1] + tolerance) return true;
        }
        return false;
    }

    /**
     * Sets the bullet's power and with it the speed and the classic escape angle. A
     * movement wave is made with a guessed power, and this corrects it once the ledger
     * measures the real shot.
     *
     * @param power the bullet power, in [0.1, 3.0]
     * @return this wave
     */
    public Wave setBulletPower(double power) {
        this.bulletPower = power;
        // Robocode's rule: bullets fly at 20 - 3 * power px/tick, from 11 (power 3) to
        // 19.7 (power 0.1).
        this.bulletSpeed = 20.0 - 3.0 * power;
        // The farthest a robot at the top speed of 8 px/tick can get off the line of fire,
        // moving square to it, while the bullet covers the distance: sin(angle) = 8 / speed.
        this.maxEscapeAngle = Math.asin(8.0 / bulletSpeed);
        // The precise angles depend on the speed, so they must be simulated again.
        cachedPositiveEscapeAngle = null;
        cachedNegativeEscapeAngle = null;
        return this;
    }

    /**
     * Overrides the bearing that is guess factor 0, radians; the orbit direction and
     * relative heading are not recomputed.
     *
     * @param absBearing the new bearing, radians
     * @return this wave
     */
    public Wave setAbsBearing(double absBearing) {
        this.absBearing = absBearing;
        return this;
    }

    // Fluent setters for the fire-time snapshot; each sets the field it names and returns
    // this wave. See the fields for meanings and units.

    /** Sets {@link #targetAccel}, px/tick per tick. */
    public Wave setAccel(double accel) { this.targetAccel = accel; return this; }
    /** Sets {@link #targetDistance}, pixels. */
    public Wave setDistance(double d) { this.targetDistance = d; return this; }
    /** Sets {@link #targetDchangeTime}. */
    public Wave setDchangeTime(long t) { this.targetDchangeTime = t; return this; }
    /** Sets {@link #targetVchangeTime}, scans. */
    public Wave setVchangeTime(long t) { this.targetVchangeTime = t; return this; }
    /** Sets {@link #targetDl8t}, pixels. */
    public Wave setDistanceLast8Ticks(double d) { this.targetDl8t = d; return this; }
    /** Sets {@link #targetDl20t}, pixels. */
    public Wave setDistanceLast20Ticks(double d) { this.targetDl20t = d; return this; }
    /** Sets {@link #targetDl40t}, pixels. */
    public Wave setDistanceLast40Ticks(double d) { this.targetDl40t = d; return this; }
    /** GUN-2: sets {@link #targetTicksSinceReversal}, scans. */
    public Wave setTicksSinceReversal(long t) { this.targetTicksSinceReversal = t; return this; }
    /** GUN-2: sets {@link #targetOrbitChanges40}. */
    public Wave setOrbitChanges40(int n) { this.targetOrbitChanges40 = n; return this; }
    /** Sets {@link #targetEnergy}. */
    public Wave setTargetEnergy(double e) { this.targetEnergy = e; return this; }
    /** Sets {@link #sourceEnergy}. */
    public Wave setSourceEnergy(double e) { this.sourceEnergy = e; return this; }
    /** Sets {@link #gunHeat}. */
    public Wave setGunHeat(double h) { this.gunHeat = h; return this; }
    /** Sets {@link #enemiesAlive}. */
    public Wave setEnemiesAlive(int n) { this.enemiesAlive = n; return this; }
    /** Sets {@link #lastBulletFiredTime}, a tick. */
    public Wave setLastBulletFiredTime(long t) { this.lastBulletFiredTime = t; return this; }
    /** Sets {@link #altWave}. */
    public Wave setAltWave(boolean b) { this.altWave = b; return this; }
    /** Sets {@link #firingWave}. */
    public Wave setFiringWave(boolean b) { this.firingWave = b; return this; }
    /** Sets {@link #hitByBullet}. */
    public Wave setHitByBullet(boolean b) { this.hitByBullet = b; return this; }
    /** Sets {@link #bulletHitBullet}. */
    public Wave setBulletHitBullet(boolean b) { this.bulletHitBullet = b; return this; }

    /** The bullet's power, in [0.1, 3.0]. */
    public double bulletPower() { return bulletPower; }
    /** The bullet's speed, {@code 20 - 3 * power} px/tick: how much the radius grows a tick. */
    public double bulletSpeed() { return bulletSpeed; }
    /** The classic escape angle {@code asin(8 / bulletSpeed)}, radians: guess factor 1. */
    public double maxEscapeAngle() { return maxEscapeAngle; }

    /**
     * The target's direction of travel at fire time, radians in [0, 2 pi): its body heading,
     * turned half a circle when it was driving backwards.
     */
    public double effectiveHeading() {
        return Angles.normalAbsoluteAngle(
            targetHeading + (targetVelocitySign == 1 ? 0 : Math.PI));
    }

    /** The wave's radius at {@code currentTime}, pixels: 0 at the fire time. */
    public double distanceTraveled(long currentTime) {
        return (currentTime - fireTime) * bulletSpeed;
    }

    /**
     * The target's speed square to the line of fire at fire time, px/tick. Never negative:
     * the direction is in {@link #orbitDirection}.
     */
    public double lateralVelocity() {
        return Math.sin(targetRelativeHeading) * (targetVelocitySign * targetVelocity);
    }

    /** Whether this wave's bullet is already accounted for: it hit us or was shot down. */
    public boolean processedBulletHit() {
        return hitByBullet || bulletHitBullet;
    }

    /**
     * Gun waves: how far this wave is, in time, from a real bullet, in units of 8 ticks. A
     * firing wave is 0. Otherwise it is the smaller of the ticks since our last real bullet
     * and the ticks until the gun is cool again, over 8; before the round's first bullet,
     * only the second counts and the result is capped at 1. The gun's KNN formulas use it as
     * one dimension (the query while aiming uses 0), so virtual waves close in time to a real
     * shot sit near the real ones.
     */
    public double virtuality() {
        long timeSinceLastBullet = fireTime - lastBulletFiredTime;
        // Ticks until the gun can fire, taking it to cool by 0.1 a tick (Robocode's default
        // cooling rate), rounded up to whole ticks.
        long timeToNextBullet = Math.round(Math.ceil(gunHeat * 10.0));
        if (firingWave) return 0.0;
        if (lastBulletFiredTime > 0) {
            return Math.min(timeSinceLastBullet, timeToNextBullet) / 8.0;
        }
        return Math.min(1.0, timeToNextBullet / 8.0);
    }

    /**
     * Computes {@link #targetWallDistance} and {@link #targetRevWallDistance} from the field
     * and the current bullet power: how far the target could orbit each way, keeping its
     * distance from the source, before reaching a wall, as a multiple of the classic escape
     * angle and capped at 1.5. A movement wave's values are recomputed
     * when {@code MoveController.updateFiringWave} corrects its power (WAVE-4).
     */
    public void setWallDistances() {
        targetWallDistance = Math.min(1.5,
            battleField.orbitalWallDistance(sourceLocation, targetLocation, bulletPower, orbitDirection));
        targetRevWallDistance = Math.min(1.5,
            battleField.orbitalWallDistance(sourceLocation, targetLocation, bulletPower, -orbitDirection));
    }

    /**
     * The absolute firing angle, radians, of a guess factor on the classic scale: the
     * inverse of {@link #guessFactor(double)}.
     */
    public double firingAngle(double guessFactor) {
        return absBearing + guessFactor * orbitDirection * maxEscapeAngle;
    }

    /** The absolute bearing from the source to {@code firingTarget}, radians in [0, 2 pi). */
    public double firingAngleFromTargetLocation(Point2D.Double firingTarget) {
        return Angles.normalAbsoluteAngle(
            DiaUtils.absoluteBearing(sourceLocation, firingTarget));
    }

    // Displacement vector: encode enemy's movement relative to orbit direction

    /**
     * The target's movement from fire time to {@code waveBreakState}, as a displacement
     * vector (see {@link #displacementVector(Point2D.Double, long)}).
     */
    public Point2D.Double displacementVector(RobotState waveBreakState) {
        return displacementVector(waveBreakState.location, waveBreakState.time);
    }

    /**
     * The target's movement from its fire-time location to {@code botLocation}, reached at
     * {@code time}, in a frame that makes it comparable across situations: the direction is
     * taken relative to the target's direction of travel at fire time and mirrored by the
     * orbit direction, and the length is divided by the ticks elapsed, giving pixels per
     * tick. Replayed with {@link #projectLocationBlind}, it gives where the same movement
     * would take the target from another wave's situation, walls included. {@code time}
     * must be after the fire time.
     *
     * @param botLocation where the target was, pixels
     * @param time the tick it was there
     * @return the vector, x to the side and y along the direction of travel, px per tick
     */
    public Point2D.Double displacementVector(Point2D.Double botLocation, long time) {
        // Where it went, as an angle off its own direction of travel.
        double vectorBearing = Angles.normalRelativeAngle(
            DiaUtils.absoluteBearing(targetLocation, botLocation) - effectiveHeading());
        // How far, as an average per tick, so waves of different flight times compare.
        double vectorDistance = targetLocation.distance(botLocation) / (time - fireTime);
        // Mirroring by the orbit direction makes a clockwise and a counter-clockwise
        // mirror-image path the same vector. project() uses the Robocode convention, so the
        // vector's y is along the travel direction and x to its clockwise side.
        return DiaUtils.project(ORIGIN, vectorBearing * orbitDirection, vectorDistance);
    }

    // Project a displacement vector to a firing location

    /**
     * Where {@code dispVector} would take this wave's target if a bullet were fired from the
     * source at fire time, by the same fixed-point replay as {@link #projectLocationBlind}
     * with no extra ticks.
     */
    public Point2D.Double projectLocationFromDisplacementVector(Point2D.Double dispVector) {
        return projectLocation(sourceLocation, dispVector, 0);
    }

    /**
     * Where {@code dispVector} would take this wave's target by the time a bullet fired now,
     * from {@code myNextLocation}, reaches it. "Blind" because it starts from the wave's
     * fire-time snapshot, not from a newer scan: the target has been moving along the vector
     * since the fire time, so the ticks from then until the bullet leaves the gun
     * ({@code currentTime - fireTime + 1}) are added to the flight time. The guns aim at the
     * bearing of the result.
     *
     * @param myNextLocation where our gun will be when the bullet is fired, pixels
     * @param dispVector a displacement vector from {@link #displacementVector}
     * @param currentTime the current tick
     * @return the projected target location, pixels (not clipped to the field)
     */
    public Point2D.Double projectLocationBlind(Point2D.Double myNextLocation,
            Point2D.Double dispVector, long currentTime) {
        return projectLocation(myNextLocation, dispVector, currentTime - fireTime + 1);
    }

    /**
     * Replays a displacement vector from the target's fire-time location. The target is
     * taken to move along the vector's direction (turned back from the wave's frame into an
     * absolute angle) at the vector's length per tick, for the bullet's flight time from
     * {@code firingLocation} plus {@code extraTicks}. The flight time depends on where the
     * target ends up, which depends on the flight time, so the two are iterated to a fixed
     * point.
     *
     * @param firingLocation where the bullet is fired from, pixels
     * @param dispVector a displacement vector in this wave's frame
     * @param extraTicks ticks of movement before the bullet is in flight
     * @return the projected target location, pixels
     */
    Point2D.Double projectLocation(Point2D.Double firingLocation,
            Point2D.Double dispVector, long extraTicks) {
        // Undo the frame of displacementVector: un-mirror by the orbit direction and add
        // this wave's direction of travel back.
        double dispAngle = effectiveHeading()
            + DiaUtils.absoluteBearing(ORIGIN, dispVector) * orbitDirection;
        double dispDistance = ORIGIN.distance(dispVector);
        Point2D.Double projectedLocation = targetLocation;
        long bulletTicks = -1;
        long prevBulletTicks = -1;
        long prevPrevBulletTicks;
        double daSin = Math.sin(dispAngle);
        double daCos = Math.cos(dispAngle);
        // Start from the target where it stood, compute the flight time to it, move the
        // target that many ticks along the vector, and repeat. The flight time is a whole
        // number of ticks, so it settles quickly; it can also flip between two values, so
        // the loop stops as soon as it repeats either of the last two.
        do {
            prevPrevBulletTicks = prevBulletTicks;
            prevBulletTicks = bulletTicks;
            // The bullet needs ceil(distance / speed) ticks to cover the distance; the count
            // of target movement used is one less.
            bulletTicks = DiaUtils.bulletTicksFromSpeed(
                firingLocation.distance(projectedLocation), bulletSpeed) - 1;
            projectedLocation = DiaUtils.project(targetLocation, daSin, daCos,
                (bulletTicks + extraTicks) * dispDistance);
        } while (bulletTicks != prevBulletTicks && bulletTicks != prevPrevBulletTicks);
        return projectedLocation;
    }

    // Guess factor from a target location

    /** The classic guess factor of {@code targetLoc} as seen from the source. */
    public double guessFactor(Point2D.Double targetLoc) {
        return guessFactor(DiaUtils.absoluteBearing(sourceLocation, targetLoc));
    }

    /**
     * The guess factor of an absolute bearing from the source, on the classic scale:
     * {@link #guessAngle} over {@link #maxEscapeAngle()}. Not clamped, so a target that
     * outran the classic bound gives a value beyond [-1, 1].
     */
    public double guessFactor(double bearingToTarget) {
        return guessAngle(bearingToTarget) / maxEscapeAngle;
    }

    /**
     * The angle, radians, from guess factor 0 to {@code bearingToTarget}, positive in the
     * orbit direction; in [-pi, pi].
     */
    public double guessAngle(double bearingToTarget) {
        return orbitDirection * Angles.normalRelativeAngle(bearingToTarget - absBearing);
    }

    /**
     * The guess factor of {@code targetLoc} on the precise scale: the guess angle over the
     * precise escape angle of the side it lies on. Near a wall one side's escape angle is
     * smaller, so the same angle is a larger guess factor there: the sample is scaled by the
     * room the target really had.
     */
    public double guessFactorPrecise(Point2D.Double targetLoc) {
        double bearing = DiaUtils.absoluteBearing(sourceLocation, targetLoc);
        double guessAngle = orbitDirection * Angles.normalRelativeAngle(bearing - absBearing);
        // Positive guess angles are on the orbit-direction side; each side has its own bound.
        double mea = preciseEscapeAngle(guessAngle >= 0);
        return guessAngle / mea;
    }

    /**
     * The precise escape angle on one side, radians, simulated on first use and cached until
     * the bullet power changes.
     *
     * @param positiveGF true for the orbit-direction side (positive guess factors), false
     *     for the other
     * @return the escape angle on that side, radians
     */
    public double preciseEscapeAngle(boolean positiveGF) {
        if (positiveGF) {
            if (cachedPositiveEscapeAngle == null) {
                cachedPositiveEscapeAngle = calculatePreciseEscapeAngle(true).angle;
            }
            return cachedPositiveEscapeAngle;
        }
        if (cachedNegativeEscapeAngle == null) {
            cachedNegativeEscapeAngle = calculatePreciseEscapeAngle(false).angle;
        }
        return cachedNegativeEscapeAngle;
    }

    /**
     * The total precise escape range, both sides together, radians. The gun and movement
     * scale hit weights by it relative to a typical range, so a hit on a wave that left the
     * target little room counts for less.
     */
    public double escapeAngleRange() {
        return preciseEscapeAngle(true) + preciseEscapeAngle(false);
    }

    /**
     * Simulates the target escaping on one side with {@link MovementPredictor}: from its
     * fire-time state, at full speed square to the line of fire, until the wave passes it,
     * with wall smoothing ({@link #PRECISE_MEA_WALL_STICK}) when the straight run hits a
     * wall. Uncached; {@link #preciseEscapeAngle(boolean)} caches the angle.
     *
     * @param positiveGF true for the orbit-direction side, false for the other
     * @return the escape angle and where the target would be
     */
    public MaxEscapeTarget calculatePreciseEscapeAngle(boolean positiveGF) {
        RobotState startState = RobotState.newBuilder()
            .setLocation((Point2D.Double) targetLocation.clone())
            .setHeading(targetHeading).setVelocity(targetVelocity)
            .setTime(fireTime).build();
        return predictor.preciseEscapeAngle(
            orbitDirection * (positiveGF ? 1 : -1),
            sourceLocation, fireTime, bulletSpeed, startState, PRECISE_MEA_WALL_STICK);
    }

    // Wave position checking

    /** Where this wave is relative to a robot in {@code currentState}; see the full form. */
    public WavePosition checkWavePosition(RobotState currentState) {
        return checkWavePosition(currentState, false, null);
    }

    /** As the full form, optionally skipping the mid-air test. */
    public WavePosition checkWavePosition(RobotState currentState, boolean skipMidair) {
        return checkWavePosition(currentState, skipMidair, null);
    }

    /** As the full form, stopping at {@code maxPosition}. */
    public WavePosition checkWavePosition(RobotState currentState, WavePosition maxPosition) {
        return checkWavePosition(currentState, false, maxPosition);
    }

    /**
     * Where this wave is relative to a robot in {@code currentState}, judged by the bullet's
     * next move: from the radius at {@code currentState.time} to the radius a tick later,
     * which the engine tests against the robot's box as it stands in that state (bullets
     * move before robots).
     *
     * <ul>
     * <li>{@link WavePosition#MIDAIR}: the next move ends short of the robot's box.</li>
     * <li>{@link WavePosition#BREAKING_FRONT}: it reaches the box but not the centre.</li>
     * <li>{@link WavePosition#BREAKING_CENTER}: it passes the centre, but the wave has not
     * yet passed every corner.</li>
     * <li>{@link WavePosition#GONE}: the wave already encloses the whole box, so its bullet
     * can no longer touch the robot.</li>
     * </ul>
     *
     * @param currentState the robot's state; its tick sets the radii
     * @param skipMidair whether to skip the mid-air test, when the caller knows the wave has
     *     arrived
     * @param maxPosition the furthest position to test for, or null for all: the result is
     *     the actual position or this one, whichever comes first, and tests beyond it are
     *     skipped
     * @return the position
     */
    public WavePosition checkWavePosition(RobotState currentState,
            boolean skipMidair, WavePosition maxPosition) {
        Point2D.Double location = currentState.location;
        double enemyDistSq = sourceLocation.distanceSq(location);
        // The radius after the bullet's next move.
        double endBulletDistance = distanceTraveled(currentState.time + 1);

        // Mid-air unless the next move reaches the box. The centre test against
        // MAX_BOT_RADIUS is a cheap early out; the exact test is the nearest point of the
        // box, which is closer than the centre by anything from 18 px (face on) to
        // MAX_BOT_RADIUS (corner on).
        if (!skipMidair && (maxPosition == WavePosition.MIDAIR
                || enemyDistSq > DiaUtils.square(endBulletDistance + MAX_BOT_RADIUS)
                || distancePointToBot(sourceLocation, currentState) > endBulletDistance)) {
            return WavePosition.MIDAIR;
        }
        // Reached the box but not the centre.
        if (maxPosition == WavePosition.BREAKING_FRONT
                || enemyDistSq > DiaUtils.square(endBulletDistance)) {
            return WavePosition.BREAKING_FRONT;
        }
        if (maxPosition == WavePosition.BREAKING_CENTER) {
            return WavePosition.BREAKING_CENTER;
        }

        // Past the centre. The wave is gone only once its current radius, where the next move
        // starts, already contains all four corners: then no part of the box is left ahead
        // of it. The farthest point of an axis-aligned box from any outside point is a
        // corner, so the corners suffice.
        double startBulletDistance = distanceTraveled(currentState.time);
        for (Point2D.Double corner : currentState.botCorners()) {
            if (corner.distanceSq(sourceLocation) > DiaUtils.square(startBulletDistance)) {
                return WavePosition.BREAKING_CENTER;
            }
        }
        return WavePosition.GONE;
    }

    /**
     * The distance, pixels, from {@code point} to the nearest point of the robot's box in
     * {@code state}: 0 inside the box, otherwise the shortest distance to one of its sides.
     */
    private static double distancePointToBot(Point2D.Double point, RobotState state) {
        double x = state.location.x, y = state.location.y;
        if (point.x > x - 18 && point.x < x + 18 && point.y > y - 18 && point.y < y + 18) {
            return 0;
        }
        double distance = Double.POSITIVE_INFINITY;
        for (Line2D.Double side : state.botSides()) {
            distance = Math.min(distance, side.ptSegDist(point));
        }
        return distance;
    }

    // Precise intersection for VG scoring and movement danger

    /**
     * The range of firing angles whose bullet would have touched the robot, given its states
     * on the ticks this wave was crossing it: the precise intersection.
     *
     * <p>On each such tick the bullet moves along a short segment of its ray, between the
     * radius at that tick and the radius a tick later, and the engine tests that segment
     * against the robot's box. So the angles that hit are those of the points of the box
     * lying in the ring between those two radii. That region's extreme angles are always
     * among: the box's corners inside the ring, and the points where the box's sides cross
     * either circle. The result spans the smallest and largest of those angles over all the
     * ticks. The virtual guns score against it, and the surf uses it both to log where the
     * enemy aimed and as the width of the angles a candidate position would be hit by.</p>
     *
     * @param waveBreakStates the robot's states on the ticks the wave was crossing it (from
     *     {@link WaveManager} or the surf's prediction), in any order
     * @return the centre angle and half-width, or null when there are no states or no
     *     angle hits
     */
    public Intersection preciseIntersection(List<RobotState> waveBreakStates) {
        if (waveBreakStates == null || waveBreakStates.isEmpty()) return null;

        List<Double> aimAngles = new ArrayList<>();
        for (RobotState state : waveBreakStates) {
            // The ring the bullet sweeps during the next tick, as in checkWavePosition.
            double waveStartR = bulletSpeed * (state.time - fireTime);
            double waveEndR = bulletSpeed * (state.time - fireTime + 1);
            for (Point2D.Double corner : state.botCorners()) {
                double cornerDist = corner.distance(sourceLocation);
                if (cornerDist <= waveEndR && cornerDist >= waveStartR) {
                    aimAngles.add(DiaUtils.absoluteBearing(sourceLocation, corner));
                }
            }
            for (Line2D.Double side : state.botSides()) {
                addCircleLineIntersections(aimAngles, sourceLocation, waveStartR, side);
                addCircleLineIntersections(aimAngles, sourceLocation, waveEndR, side);
            }
        }
        if (aimAngles.isEmpty()) return null;

        // Angles come from atan2 in (-pi, pi]; a robot straddling south of the source would
        // give angles near both pi and -pi. Normalising each within pi of the first keeps the
        // span contiguous, since a robot covers far less than half a turn.
        double ref = aimAngles.get(0);
        double minAngle = ref, maxAngle = ref;
        for (double angle : aimAngles) {
            double norm = DiaUtils.normalizeAngle(angle, ref);
            minAngle = Math.min(minAngle, norm);
            maxAngle = Math.max(maxAngle, norm);
        }
        // Stored as centre and half-width, the form the danger and scoring kernels use.
        double center = (minAngle + maxAngle) / 2;
        double bandwidth = maxAngle - center;
        return new Intersection(center, bandwidth);
    }

    /**
     * Adds to {@code angles} the bearing from {@code center} of each point where the circle
     * of {@code radius} about {@code center} crosses the segment {@code line}.
     */
    private static void addCircleLineIntersections(List<Double> angles,
            Point2D.Double center, double radius, Line2D.Double line) {
        // Points on the segment are P(t) = P1 + t * d for t in [0, 1]. Setting
        // |P(t) - center|^2 = radius^2 gives the quadratic a t^2 + b t + c = 0 below, with
        // f = P1 - center.
        double dx = line.x2 - line.x1;
        double dy = line.y2 - line.y1;
        double fx = line.x1 - center.x;
        double fy = line.y1 - center.y;
        double a = dx * dx + dy * dy;
        double b = 2 * (fx * dx + fy * dy);
        double c = fx * fx + fy * fy - radius * radius;
        double disc = b * b - 4 * a * c;
        // No real root: the line misses the circle.
        if (disc < 0) return;
        disc = Math.sqrt(disc);
        double t1 = (-b - disc) / (2 * a);
        double t2 = (-b + disc) / (2 * a);
        // Only roots within [0, 1] lie on the segment itself.
        if (t1 >= 0 && t1 <= 1) {
            angles.add(DiaUtils.absoluteBearing(center,
                new Point2D.Double(line.x1 + t1 * dx, line.y1 + t1 * dy)));
        }
        // A tangent gives a double root; add its point only once.
        if (t2 >= 0 && t2 <= 1 && Math.abs(t2 - t1) > 1e-10) {
            angles.add(DiaUtils.absoluteBearing(center,
                new Point2D.Double(line.x1 + t2 * dx, line.y1 + t2 * dy)));
        }
    }

    /**
     * A copy of this wave's fire-time snapshot and flags. The constructor recomputes the
     * orbit direction and relative heading, and the copy starts with no bullet shadows and
     * empty escape-angle caches.
     */
    @Override
    public Object clone() {
        Wave w = new Wave(botName, sourceLocation, targetLocation, fireRound, fireTime,
            bulletPower, targetHeading, targetVelocity, targetVelocitySign,
            battleField, predictor);
        w.absBearing = absBearing;
        w.targetAccel = targetAccel;
        w.targetDistance = targetDistance;
        w.targetDchangeTime = targetDchangeTime;
        w.targetVchangeTime = targetVchangeTime;
        w.targetDl8t = targetDl8t;
        w.targetDl20t = targetDl20t;
        w.targetDl40t = targetDl40t;
        w.targetTicksSinceReversal = targetTicksSinceReversal;
        w.targetOrbitChanges40 = targetOrbitChanges40;
        w.targetEnergy = targetEnergy;
        w.sourceEnergy = sourceEnergy;
        w.altWave = altWave;
        w.firingWave = firingWave;
        w.uncertain = uncertain;
        w.hitByBullet = hitByBullet;
        w.bulletHitBullet = bulletHitBullet;
        w.enemiesAlive = enemiesAlive;
        w.lastBulletFiredTime = lastBulletFiredTime;
        w.gunHeat = gunHeat;
        w.targetWallDistance = targetWallDistance;
        w.targetRevWallDistance = targetRevWallDistance;
        return w;
    }

    /** A range of absolute firing angles from a wave's source: a centre and a half-width. */
    public static class Intersection {
        /** The centre of the range, absolute radians from the source. */
        public final double angle;
        /** Half the range's width, radians; the range is {@code angle +/- bandwidth}. */
        public final double bandwidth;

        /**
         * A range of firing angles.
         *
         * @param angle the centre, absolute radians
         * @param bandwidth the half-width, radians
         */
        public Intersection(double angle, double bandwidth) {
            this.angle = angle;
            this.bandwidth = bandwidth;
        }
    }

    /**
     * Where a wave is relative to a robot, in the order a wave passes through them; see
     * {@link Wave#checkWavePosition(RobotState, boolean, WavePosition)}.
     */
    public enum WavePosition {
        /** The bullet's next move ends short of the robot's box. */
        MIDAIR(0, false),
        /** The next move reaches the box but not its centre. */
        BREAKING_FRONT(1, true),
        /** The next move passes the centre; part of the box is still ahead of the wave. */
        BREAKING_CENTER(2, true),
        /** The wave has passed the whole box. */
        GONE(3, false);

        /** Position in the order above, from 0. */
        private final int index;
        /** Whether the wave's bullet could touch the robot on this tick. */
        private final boolean breaking;

        WavePosition(int index, boolean breaking) {
            this.index = index;
            this.breaking = breaking;
        }

        /** The position's place in the order a wave passes through them, from 0. */
        public int getIndex() { return index; }
        /** Whether the wave is crossing the robot's box: its bullet could touch it now. */
        public boolean isBreaking() { return breaking; }
    }
}
