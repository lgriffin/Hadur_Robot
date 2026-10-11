package hadur2.core.melee;

import hadur2.core.world.EnemyTracker;
import hadur2.core.physics.DiaUtils;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;
import hadur2.core.physics.Angles;

/**
 * Minimal radar physics: the radar turns at most 45 degrees a tick and scans every
 * robot inside the arc it sweeps.
 */
public class RadarSim {

    public static final double MAX_RADAR_TURN = Math.toRadians(45);

    private final MeleeRadar radar = new MeleeRadar();
    private final EnemyTracker tracker;
    private final Point2D.Double me;
    private final Map<String, Point2D.Double> robots;
    private final Map<String, Long> maxGap = new HashMap<>();
    private final Map<String, Long> lastSeen = new HashMap<>();
    private double heading;

    public RadarSim(EnemyTracker tracker, Point2D.Double me, Map<String, Point2D.Double> robots) {
        this.tracker = tracker;
        this.me = me;
        this.robots = robots;
    }

    public void run(long ticks) {
        for (long t = 0; t < ticks; t++) {
            double turn = radar.radarTurn(me, heading, tracker, robots.size());
            turn = Math.max(-MAX_RADAR_TURN, Math.min(MAX_RADAR_TURN, turn));
            double start = heading;
            heading = Angles.normalAbsoluteAngle(heading + turn);
            for (Map.Entry<String, Point2D.Double> r : robots.entrySet()) {
                double off = Angles.normalRelativeAngle(
                    DiaUtils.absoluteBearing(me, r.getValue()) - start);
                boolean inArc = turn >= 0 ? off >= 0 && off <= turn : off <= 0 && off >= turn;
                if (inArc) {
                    Long prev = lastSeen.get(r.getKey());
                    if (prev != null) maxGap.merge(r.getKey(), t - prev, Math::max);
                    lastSeen.put(r.getKey(), t);
                    tracker.onScan(r.getKey(), r.getValue(), 100, 0, 0, t);
                }
            }
        }
    }

    /** Longest run of ticks between two scans of any robot. */
    public long worstGap() {
        return maxGap.values().stream().mapToLong(Long::longValue).max().orElse(Long.MAX_VALUE);
    }

    public boolean sawAll() {
        return lastSeen.keySet().containsAll(robots.keySet());
    }
}
