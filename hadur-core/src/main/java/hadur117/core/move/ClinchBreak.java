package hadur117.core.move;

import hadur117.core.model.BotOrders;
import hadur117.core.model.RobotState;
import hadur117.core.physics.Angles;
import hadur117.core.physics.BattleField;
import hadur117.core.physics.DiaUtils;

import java.awt.geom.Point2D;

/**
 * MOVE-75: getting out of contact with the enemy.
 *
 * <p>Once the two robots touch, the surf and the orbit can hold us there: near a wall or in a
 * corner their wall-smoothed heading bends back toward the enemy, the engine stops a robot that
 * drives into another one, and we stand still at point-blank range while it fires (the easy-robot
 * dodge study, docs/bench/easy-dodge-study.md: 25 ticks a battle within 60 px against the robots
 * BeepBoop scores 98% on, 8 for BeepBoop, and half the bullet damage we take inside 200 px).
 * No dodge works at that range; the only answer is to leave.</p>
 *
 * <p>While active, the drive is the heading that ends furthest from the enemy: of the headings
 * within {@link #SPREAD} of straight away from it, the one whose straight run of up to
 * {@link #RUN} px (cut short at a wall) ends furthest from where the enemy is now. Such a heading
 * never points into the enemy, so the engine never stops us for it. We drive whichever end of the
 * robot already points away, turning it onto the heading, so the first tick already moves.</p>
 *
 * <p>It starts inside {@link #START} px, centre to centre, and ends past {@link #RELEASE}.
 * Deterministic and stateless apart from that latch.</p>
 */
public final class ClinchBreak {

    /** Centre distance, px, under which the break starts: two 36 px robots touch at 36 to 51 px. */
    public static final double START = 62.0;
    /** Centre distance, px, past which the usual movement takes the drive back. */
    public static final double RELEASE = 110.0;
    /** The straight run each heading is scored on, px. */
    static final double RUN = 120.0;
    /** Headings are tried this far either side of straight away, radians. */
    static final double SPREAD = Math.toRadians(75);
    /** The step between the headings tried, radians. */
    static final double STEP = Math.toRadians(15);
    /** An end of the robot counts as pointing at the enemy within this of its bearing, radians. */
    static final double TOWARD = Math.toRadians(85);

    private final BattleField battleField;
    private boolean active;

    /**
     * @param battleField the field, for the walls
     */
    public ClinchBreak(BattleField battleField) {
        this.battleField = battleField;
    }

    /** A new round: not in contact. */
    public void initRound() {
        active = false;
    }

    /**
     * Latches the break on inside {@link #START} and off past {@link #RELEASE}.
     *
     * @param distance the centre distance to the enemy this tick, px
     * @return whether the break drives this tick
     */
    public boolean update(double distance) {
        if (distance < START) active = true;
        else if (distance > RELEASE) active = false;
        return active;
    }

    /**
     * The heading to leave on.
     *
     * @param me our centre, px
     * @param enemy the enemy's centre, px
     * @return the absolute heading, radians, within {@link #SPREAD} of straight away from the enemy
     */
    public double heading(Point2D.Double me, Point2D.Double enemy) {
        double away = DiaUtils.absoluteBearing(enemy, me);
        double best = away;
        double bestScore = Double.NEGATIVE_INFINITY;
        int steps = (int) Math.round(SPREAD / STEP);
        // Straight away first, then alternately either side, so ties keep the most direct heading.
        for (int i = 0; i <= 2 * steps; i++) {
            int k = (i + 1) / 2 * (i % 2 == 0 ? 1 : -1);
            double h = away + k * STEP;
            double run = Math.min(RUN, wallRun(me, h));
            double score = DiaUtils.project(me, h, run).distance(enemy);
            if (score > bestScore + 1e-9) {
                bestScore = score;
                best = h;
            }
        }
        return best;
    }

    /** How far a robot's centre can go from {@code from} along {@code heading} before a wall, px. */
    double wallRun(Point2D.Double from, double heading) {
        double sin = Math.sin(heading);
        double cos = Math.cos(heading);
        double run = Double.POSITIVE_INFINITY;
        if (sin > 1e-9) run = Math.min(run, (battleField.width - 18.0 - from.x) / sin);
        if (sin < -1e-9) run = Math.min(run, (18.0 - from.x) / sin);
        if (cos > 1e-9) run = Math.min(run, (battleField.height - 18.0 - from.y) / cos);
        if (cos < -1e-9) run = Math.min(run, (18.0 - from.y) / cos);
        return Math.max(0.0, run);
    }

    /**
     * Writes this tick's drive: full speed on {@link #heading}, with the end of the robot that
     * points away from the enemy leading.
     *
     * @param orders the orders to write the drive into
     * @param me our state this tick
     * @param enemy the enemy's centre, px
     */
    public void move(BotOrders.Builder orders, RobotState me, Point2D.Double enemy) {
        double go = heading(me.location, enemy);
        double toEnemy = DiaUtils.absoluteBearing(me.location, enemy);
        double frontTurn = Angles.normalRelativeAngle(go - me.heading);
        double backTurn = Angles.normalRelativeAngle(go - me.heading - Math.PI);
        boolean frontAtEnemy = Math.abs(Angles.normalRelativeAngle(toEnemy - me.heading)) < TOWARD;
        boolean backAtEnemy = Math.abs(Angles.normalRelativeAngle(toEnemy - me.heading - Math.PI)) < TOWARD;
        // The end needing less turn leads, unless it points at the enemy and the other does not.
        boolean front = Math.abs(frontTurn) <= Math.abs(backTurn);
        if (front && frontAtEnemy && !backAtEnemy) front = false;
        else if (!front && backAtEnemy && !frontAtEnemy) front = true;
        orders.maxVelocity(8.0);
        orders.turnRight(front ? frontTurn : backTurn);
        orders.ahead(front ? 100.0 : -100.0);
    }
}
