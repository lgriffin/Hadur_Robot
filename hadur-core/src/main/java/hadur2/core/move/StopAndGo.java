package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;

import java.awt.geom.Point2D;

/**
 * POISON-1: stop-and-go against an opponent whose gun learns from where we are when it fires,
 * as Saguaro's WavePoison and WavePoisonShift play it (docs/bench/rivals-source-read.md).
 *
 * <p>We crawl (half a pixel a tick along the orbit) while the enemy's gun cools, so it always
 * fires at a robot that is all but stopped; one or two ticks before its gun is ready we crawl
 * back the other way, so its velocity reading is the wrong way round too. Once it has fired, we
 * go: full speed along the orbit, toward a point 140 px ahead and pushed out to 250 px from the
 * enemy, until there is just time to brake before its gun is ready again. A gun that aims from
 * our velocity at fire time sees the same still robot every shot, and the bullet arrives where
 * that robot no longer is. The orbit direction is kept and turned round only when the wall
 * smoothing would steer us within 45 degrees of the enemy.</p>
 *
 * <p>Deterministic; state is the orbit direction, the last enemy shot seen, and whether one has
 * been seen this round. {@link #initRound} clears it.</p>
 */
public final class StopAndGo {

    /** WavePoison: the reverse crawl comes one tick before the enemy's gun is ready. */
    public static final int PREFIRE_TICKS = 1;
    /** WavePoisonShift: two ticks before. */
    public static final int PREFIRE_TICKS_SHIFT = 2;
    /** The crawl while the enemy's gun cools, px a tick. */
    static final double CRAWL = 0.5;
    /** How far ahead along the orbit the go phase steers, px. */
    static final double WAYPOINT = 140.0;
    /** Inside this distance the go point is pushed out from the enemy, px. */
    static final double DISTANCE = 250.0;
    /** The most the go point is pushed out, px. */
    static final double MAX_PUSH = 90.0;
    /** The wall-smoothing stick, px. */
    static final double WALL_STICK = 160.0;
    /** A smoothed heading nearer the enemy's bearing than this turns the orbit round, radians. */
    static final double MIN_WALL_OFFSET = Math.toRadians(45.0);

    private final BattleField battleField;
    private final int prefireTicks;
    private int direction;
    private long lastShot = Long.MIN_VALUE;
    private boolean moving;
    private final int[] phaseTicks = new int[Phase.values().length];

    /**
     * @param battleField the field, for wall smoothing
     * @param prefireTicks ticks before the enemy's gun is ready that the reverse crawl comes
     */
    public StopAndGo(BattleField battleField, int prefireTicks) {
        this.battleField = battleField;
        this.prefireTicks = prefireTicks;
    }

    /** A new round: no direction, no shot seen. */
    public void initRound() {
        direction = 0;
        lastShot = Long.MIN_VALUE;
        moving = false;
        java.util.Arrays.fill(phaseTicks, 0);
    }

    /** Ticks this round spent in {@code phase}, for the round's {@code WP} record. */
    public int ticks(Phase phase) {
        return phaseTicks[phase.ordinal()];
    }

    /** The phase of the last {@link #move}: the next one's input decides it. */
    public enum Phase { STOP, GO, REVERSE }

    /**
     * Writes this tick's drive into {@code orders} and returns its phase.
     *
     * @param orders the orders to write into
     * @param me our state this tick
     * @param enemy the enemy's location
     * @param enemyGunHeat the enemy gun's heat now, estimated
     * @param coolingRate gun heat lost a tick
     * @param lastEnemyShot the fire tick of the enemy's last detected shot
     */
    public Phase move(BotOrders.Builder orders, RobotState me, Point2D.Double enemy, double enemyGunHeat,
                      double coolingRate, long lastEnemyShot) {
        if (lastEnemyShot > lastShot) {
            lastShot = lastEnemyShot;
            moving = true;
        }
        if (direction == 0) direction = roomier(me.location, enemy);
        if (tooSharp(me.location, enemy, direction) && !tooSharp(me.location, enemy, -direction)) direction = -direction;
        double heading = smoothed(me.location, enemy, direction);
        int ready = enemyGunHeat <= 0 || coolingRate <= 0 ? 0 : (int) Math.ceil(enemyGunHeat / coolingRate - 1e-9);
        int braking = Math.max(2, (int) Math.ceil(Math.abs(me.velocity) / 2.0) + 1);
        if (ready == prefireTicks) {
            // The crawl turned round: the gun reads a robot backing the other way.
            crawl(orders, me.heading, heading, -CRAWL);
            return count(Phase.REVERSE);
        }
        if (moving && ready > braking + 1) {
            orders.maxVelocity(8.0);
            DiaUtils.setBackAsFront(orders, me.heading, heading);
            return count(Phase.GO);
        }
        crawl(orders, me.heading, heading, CRAWL);
        return count(Phase.STOP);
    }

    private Phase count(Phase phase) {
        phaseTicks[phase.ordinal()]++;
        return phase;
    }

    /** The orbit direction last used: +1 clockwise, -1 counter-clockwise, 0 before the first move. */
    public int direction() {
        return direction;
    }

    /** Drives {@code distance} px along {@code heading}, turning the nearer end toward it. */
    private static void crawl(BotOrders.Builder orders, double myHeading, double heading, double distance) {
        double turn = Angles.normalRelativeAngle(heading - myHeading);
        double d = distance;
        if (Math.abs(turn) > Math.PI / 2) {
            turn = Angles.normalRelativeAngle(turn + Math.PI);
            d = -d;
        }
        orders.maxVelocity(8.0);
        orders.turnRight(turn);
        orders.ahead(d);
    }

    /** The orbit's go point: {@link #WAYPOINT} along the perpendicular, pushed out from the enemy inside {@link #DISTANCE}. */
    double[] goPoint(Point2D.Double me, Point2D.Double enemy, int dir, double ahead) {
        double toEnemy = Math.atan2(enemy.x - me.x, enemy.y - me.y);
        // The surf's convention: the bearing from the enemy plus dir quarter turns.
        double along = toEnemy + Math.PI + dir * Math.PI / 2;
        double push = Math.max(0, Math.min(MAX_PUSH, DISTANCE - me.distance(enemy)));
        return new double[] {me.x + Math.sin(along) * ahead - Math.sin(toEnemy) * push,
            me.y + Math.cos(along) * ahead - Math.cos(toEnemy) * push};
    }

    /** The heading to the go point, wall-smoothed on the orbit's side. */
    double smoothed(Point2D.Double me, Point2D.Double enemy, int dir) {
        double[] p = goPoint(me, enemy, dir, WAYPOINT);
        double raw = Math.atan2(p[0] - me.x, p[1] - me.y);
        return battleField.wallSmoothing(me, Angles.normalAbsoluteAngle(raw), dir, WALL_STICK);
    }

    /** Whether the smoothed heading turns us within {@link #MIN_WALL_OFFSET} of the enemy, nearer than the orbit would. */
    boolean tooSharp(Point2D.Double me, Point2D.Double enemy, int dir) {
        double toEnemy = Math.atan2(enemy.x - me.x, enemy.y - me.y);
        double orbit = Math.PI / 2;
        double smooth = Math.abs(Angles.normalRelativeAngle(smoothed(me, enemy, dir) - toEnemy));
        return smooth < MIN_WALL_OFFSET && smooth < orbit - 1e-9;
    }

    /** The direction whose point 80 px along the orbit is further from the walls. */
    int roomier(Point2D.Double me, Point2D.Double enemy) {
        double cw = wallRoom(goPoint(me, enemy, 1, 80));
        double ccw = wallRoom(goPoint(me, enemy, -1, 80));
        return ccw > cw + 1e-9 ? -1 : 1;
    }

    private double wallRoom(double[] p) {
        return Math.min(Math.min(p[0] - 26, battleField.width - 26 - p[0]),
            Math.min(p[1] - 26, battleField.height - 26 - p[1]));
    }
}
