package hadur117.twin.core;

/**
 * The team layer (docs/twinsaor.md section 4): who to shoot, where to stand, when to hold fire
 * and how hard to fire. Pure statics on primitives (TWIN-3).
 */
public final class Team {

    /** Twin Duel's field side. */
    public static final double FIELD = 800;
    /** How close to a wall a station may sit. */
    public static final double WALL = 30;
    /** Energy lead the other enemy needs before the twins switch to it (TWIN-7). */
    public static final double SWITCH_MARGIN = 20;
    /** Station range with two enemies alive (TWIN-9). */
    public static final double RANGE_TWO = 250;
    /** Station range with one enemy alive (TWIN-9). */
    public static final double RANGE_ONE = 100;
    /** Half the leg a twin shuttles along, across its line to the target. */
    public static final double LEG = 60;
    /** The arc either side of the gun inside which a nearer partner holds fire (TWIN-11). */
    public static final double HOLD_ARC = 0.15;

    private Team() {
    }

    /**
     * Whether the twins switch from the current target to a candidate (TWIN-7): when there is no
     * live target yet, or the candidate has at least {@link #SWITCH_MARGIN} less energy.
     *
     * @param candidateEnergy the candidate's energy
     * @param targetEnergy the current target's energy, or NaN without a live target
     * @return true to switch
     */
    public static boolean switchTo(double candidateEnergy, double targetEnergy) {
        return Double.isNaN(targetEnergy) || candidateEnergy <= targetEnergy - SWITCH_MARGIN;
    }

    /**
     * The range a twin keeps from the target while its partner lives (TWIN-9).
     *
     * @param enemiesAlive enemies alive
     * @return px
     */
    public static double range(int enemiesAlive) {
        return enemiesAlive > 1 ? RANGE_TWO : RANGE_ONE;
    }

    /**
     * The bearing, from the target, of a twin's station (TWIN-9): 45 degrees either side of the
     * bearing from the target to the team's midpoint, the leader on the clockwise side.
     *
     * @param tx the target's x
     * @param ty its y
     * @param midX the team's midpoint x
     * @param midY its y
     * @param leader whether this twin is the leader
     * @return radians, Robocode's convention (0 north, clockwise)
     */
    public static double stationBearing(double tx, double ty, double midX, double midY, boolean leader) {
        return Math.atan2(midX - tx, midY - ty) + (leader ? Math.PI / 4 : -Math.PI / 4);
    }

    /**
     * The point a twin drives to: on its station's bearing at {@code range} from the target,
     * moved {@link #LEG} across that line on the side {@code side}, and kept {@link #WALL} px off
     * every wall.
     *
     * @param tx the target's x
     * @param ty its y
     * @param bearing the station's bearing from the target
     * @param range px from the target
     * @param side +1 or -1, the end of the leg
     * @return {x, y}
     */
    public static double[] point(double tx, double ty, double bearing, double range, int side) {
        double x = tx + Math.sin(bearing) * range + Math.sin(bearing + Math.PI / 2) * LEG * side;
        double y = ty + Math.cos(bearing) * range + Math.cos(bearing + Math.PI / 2) * LEG * side;
        return new double[] {clamp(x), clamp(y)};
    }

    /**
     * A coordinate kept {@link #WALL} px inside the field.
     *
     * @param c px
     * @return px
     */
    public static double clamp(double c) {
        return Math.max(WALL, Math.min(FIELD - WALL, c));
    }

    /**
     * Whether the target fired between two scans (TWIN-10): its energy fell by a bullet's cost.
     *
     * @param lastEnergy its energy at the scan before
     * @param energy its energy now
     * @return true for a drop of 0.1 to 3
     */
    public static boolean fired(double lastEnergy, double energy) {
        double drop = lastEnergy - energy;
        return drop > 0.09 && drop < 3.01;
    }

    /**
     * Whether to hold fire because the partner is in the line (TWIN-11).
     *
     * @param x our x
     * @param y our y
     * @param gunHeading the gun's heading, radians
     * @param targetDistance the target's distance
     * @param mateX the partner's x
     * @param mateY its y
     * @return true when the partner is nearer than the target and within {@link #HOLD_ARC}
     */
    public static boolean hold(double x, double y, double gunHeading, double targetDistance, double mateX, double mateY) {
        return Math.hypot(mateX - x, mateY - y) < targetDistance
            && Math.abs(Gun.normalRelativeAngle(Math.atan2(mateX - x, mateY - y) - gunHeading)) < HOLD_ARC;
    }

    /**
     * Bullet power: Saor's {@code log10(energy) * 325 / distance}, capped by mode. With the
     * partner alive, 2.9 against two enemies and 3 against one; alone, Saor's end-game 1.9.
     *
     * @param energy our energy
     * @param distance the target's distance
     * @param mateAlive whether the partner lives
     * @param enemiesAlive enemies alive
     * @return the power
     */
    public static double power(double energy, double distance, boolean mateAlive, int enemiesAlive) {
        double cap = mateAlive ? (enemiesAlive > 1 ? 2.9 : 3) : 1.9;
        return Math.min(cap, Math.log10(energy) * 325 / distance);
    }

    /**
     * Saor's corner oscillation on the 800 field (TWIN-12): one coordinate of the point the last
     * twin drives to with two enemies alive.
     *
     * @param againstWall whether the point sits against this axis's wall
     * @param targetDistance the target's distance
     * @param position our coordinate on this axis
     * @return the point's coordinate
     */
    public static double corner(boolean againstWall, double targetDistance, double position) {
        double c = againstWall ? 25 : Math.min(300, 55 + targetDistance / 2.5);
        return position > FIELD / 2 ? FIELD - c : c;
    }
}
