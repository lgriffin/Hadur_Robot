package hadur2.core.melee;

import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import hadur2.core.physics.Angles;

/**
 * Melee radar: a continuous sweep that always turns toward the opponent scanned
 * longest ago, so no opponent goes more than about one sweep (8 ticks) unscanned.
 */
public class MeleeRadar {

    private int direction = 1;

    public void newRound() {
        direction = 1;
    }

    /** Radar turn for this tick, in radians (infinite: keep sweeping that way). */
    public double radarTurn(Point2D.Double me, double radarHeading,
                            EnemyTracker tracker, int others) {
        EnemyInfo stalest = tracker.stalest();
        // Until every opponent has been seen, sweep the full circle.
        if (stalest != null && tracker.alive().size() >= others) {
            double offset = Angles.normalRelativeAngle(
                DiaUtils.absoluteBearing(me, stalest.location) - radarHeading);
            direction = offset >= 0 ? 1 : -1;
        }
        return direction * Double.POSITIVE_INFINITY;
    }
}
