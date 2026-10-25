package hadur117.micro.core;

/**
 * Target selection and the radar (Figment, Wallaby): the nearest robot, kept by name until it
 * dies or a nearer one is scanned (SAOR-3); any death frees the target and the radar
 * (SAOR-4); the radar spins free and is held on the target only while the gun is about to
 * fire (SAOR-5).
 */
public final class Selection {

    private Selection() {
    }

    /**
     * Whether a scanned robot becomes, or stays, the target (SAOR-3).
     *
     * @param distance the scanned robot's distance
     * @param targetDistance the target's distance at its last scan; infinite after a death
     * @param isTarget whether the scanned robot is the target, by name
     * @return true to aim at it this tick
     */
    public static boolean adopt(double distance, double targetDistance, boolean isTarget) {
        return distance < targetDistance || isTarget;
    }

    /**
     * The target distance after any robot dies (SAOR-4): infinite, so the next robot scanned
     * becomes the target. The same value, as a radar turn, sets the radar spinning.
     *
     * @return positive infinity
     */
    public static double afterDeath() {
        return Double.POSITIVE_INFINITY;
    }

    /**
     * Whether the radar is held on the target this tick (SAOR-5).
     *
     * @param gunHeat the gun's heat
     * @return true while the heat is below 1
     */
    public static boolean holdRadar(double gunHeat) {
        return gunHeat < 1;
    }

    /**
     * The radar turn that holds the beam on the target: an infinite turn toward its bearing,
     * so the beam passes it by at most one sweep and the next scan swings it back (SAOR-5).
     * The sign of {@code sin} is the sign of the bearing normalised to (-pi, pi], so the core
     * needs no engine helper.
     *
     * @param bearing absolute bearing to the target, radians
     * @param radarHeading the radar's heading, radians
     * @return the radar turn: infinite, signed toward the target
     */
    public static double radarTurn(double bearing, double radarHeading) {
        return Double.POSITIVE_INFINITY * Math.sin(bearing - radarHeading);
    }
}
