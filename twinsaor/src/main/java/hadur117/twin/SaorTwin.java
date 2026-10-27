package hadur117.twin;

import hadur117.twin.core.Gun;
import hadur117.twin.core.Team;
import java.awt.geom.Point2D;
import robocode.MessageEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;
import robocode.util.Utils;

/**
 * One twin of TwinSaor, the Twin Duel team (docs/twinsaor.md): the team file lists this class
 * twice, and the first listed is the leader by the engine's rule (TWIN-1).
 *
 * <p>Every scan of an enemy is broadcast and then handled by the same path as the partner's
 * (TWIN-5), so both twins hold the same record of both enemies and learn the same transitions
 * (TWIN-6). The decisions are the core's ({@code hadur117.twin.core}); this class turns them
 * into orders. Statics are per robot, because each robot has its own class loader, so the
 * Markov tables are the only state kept from round to round.</p>
 */
public class SaorTwin extends TeamRobot {

    /**
     * Enemy slots by name hash: the Twin Duel field has about 54 robot names. Two enemies of one
     * pairing share a slot with odds of 1 in 128; the ids are not kept, for bytes.
     */
    static final int SLOTS = 128;
    /** Record fields. */
    static final int X = 0, Y = 1, HEADING = 2, VELOCITY = 3, ENERGY = 4, TIME = 5, STATE = 6, ALIVE = 7;

    /** Per-enemy Markov rows, kept across rounds. */
    static char[][][] markov = new char[SLOTS][Gun.STATES][Gun.ROW + 1];
    /** The latest record of each enemy this round. */
    static double[][] seen = new double[SLOTS][8];
    static int target;
    static boolean leader;
    static boolean mateAlive;
    static double mateX;
    static double mateY;
    static int side = 1;
    static int axis;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        leader = getEnergy() > 150;
        mateAlive = true;
        target = -1;
        for (double[] r : seen) {
            r[ALIVE] = 0;
            r[TIME] = -9;
        }
        while (true) {
            tick();
            execute();
        }
    }

    /** One tick's decisions from the records as they stand. */
    void tick() {
        double x = getX();
        double y = getY();
        long now = getTime();
        broadcast(new double[] {x, y});
        int enemies = getOthers() - (mateAlive ? 1 : 0);

        // TWIN-7: the least energy, sticky by the switch margin; the other enemy is the radar's.
        int other = -1;
        if (target >= 0 && seen[target][ALIVE] == 0) {
            target = -1;
        }
        for (int s = 0; s < SLOTS; s++) {
            if (seen[s][ALIVE] > 0 && s != target) {
                if (Team.switchTo(seen[s][ENERGY], target < 0 ? Double.NaN : seen[target][ENERGY])) {
                    other = target;
                    target = s;
                } else {
                    other = s;
                }
            }
        }

        // TWIN-8: the leader's radar on the target, the other twin's on the other enemy.
        int radar = mateAlive && !leader && other >= 0 ? other : target;
        double[] r;
        if (radar >= 0 && now - (r = seen[radar])[TIME] <= 1 && (mateAlive || enemies < 2 || getGunHeat() < 1)) {
            setTurnRadarRightRadians(Double.POSITIVE_INFINITY
                * Math.sin(Math.atan2(r[X] - x, r[Y] - y) - getRadarHeadingRadians()));
        } else {
            setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
        }
        if (target < 0) {
            return;
        }

        double[] t = seen[target];
        int age = (int) (now - t[TIME]);
        double distance = Point2D.distance(x, y, t[X], t[Y]);
        double power = Team.power(getEnergy(), distance, mateAlive, enemies);
        if (age <= 4) {
            // SAOR-10: fire only once the gun has reached last tick's aim; TWIN-11: never through the partner.
            if (getGunTurnRemaining() == 0
                    && !(mateAlive && Team.hold(x, y, getGunHeadingRadians(), distance, mateX, mateY))) {
                setFire(power);
            }
            try {
                setTurnGunRightRadians(Utils.normalRelativeAngle(Gun.aim(markov[target], (int) t[STATE], age, x, y,
                    t[X], t[Y], t[HEADING], t[VELOCITY], power) - getGunHeadingRadians()));
            } catch (RuntimeException e) {
                // A state packed across a scan gap is out of range; hold the gun this tick.
            }
        }

        double px;
        double py;
        if (mateAlive || enemies < 2) {
            // TWIN-9 and TWIN-10: a station on the L, shuttling across the line to the target.
            double bearing = mateAlive
                ? Team.stationBearing(t[X], t[Y], (x + mateX) / 2, (y + mateY) / 2, leader)
                : Math.atan2(x - t[X], y - t[Y]);
            double[] p = Team.point(t[X], t[Y], bearing, mateAlive ? Team.range(enemies) : Team.RANGE_TWO, side);
            px = p[0];
            py = p[1];
            if (Point2D.distance(x, y, px, py) < 20) {
                side = -side;
            }
        } else {
            // TWIN-12: the last twin against two plays Saor's corner oscillation.
            if (getDistanceRemaining() == 0) {
                axis ^= 1;
            }
            px = Team.corner(axis == 0, distance, x);
            py = Team.corner(axis != 0, distance, y);
        }
        double turn;
        setTurnRightRadians(Math.tan(turn = Math.atan2(px - x, py - y) - getHeadingRadians()));
        setAhead(Math.cos(turn) * Point2D.distance(x, y, px, py));
    }

    /** Sends a message to the partner, ignoring a send the engine refuses. */
    void broadcast(double[] message) {
        try {
            broadcastMessage(message);
        } catch (Exception e) {
            // No partner to send to.
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        String name = e.getName();
        double bearing = getHeadingRadians() + e.getBearingRadians();
        double d = e.getDistance();
        double[] m = {name.hashCode(), getX() + Math.sin(bearing) * d,
            getY() + Math.cos(bearing) * d, e.getHeadingRadians(), e.getVelocity(), e.getEnergy(), getTime()};
        if (isTeammate(name)) {
            mateX = m[1];
            mateY = m[2];
            return;
        }
        broadcast(m);
        handle(m);
    }

    @Override
    public void onMessageReceived(MessageEvent e) {
        double[] m = (double[]) e.getMessage();
        if (m.length == 2) {
            mateX = m[0];
            mateY = m[1];
        } else {
            handle(m);
        }
    }

    /**
     * A scan of an enemy, ours or the partner's (TWIN-5): a newer scan replaces the record, and
     * one exactly a tick after the last records a transition (TWIN-6).
     */
    static void handle(double[] m) {
        int s = (int) m[0] & (SLOTS - 1);
        double[] r = seen[s];
        if (m[6] <= r[TIME]) {
            return;
        }
        int state = (int) r[STATE];
        if (m[6] == r[TIME] + 1) {
            state = Gun.state(m[4], r[VELOCITY], r[HEADING], m[3]);
            try {
                Gun.record(markov[s][(int) r[STATE]], state);
            } catch (RuntimeException ex) {
                state = (int) r[STATE];
            }
            if (s == target && Team.fired(r[ENERGY], m[5])) {
                side = -side;
            }
        } else if (r[TIME] < 0) {
            // The first scan of a round: no turn or acceleration known, so the state holds speed.
            state = 1 + ((int) (8.5 + m[4]) << 2) + (2 << 7);
        }
        r[X] = m[1];
        r[Y] = m[2];
        r[HEADING] = m[3];
        r[VELOCITY] = m[4];
        r[ENERGY] = m[5];
        r[TIME] = m[6];
        r[STATE] = state;
        r[ALIVE] = 1;
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        if (isTeammate(e.getName())) {
            mateAlive = false;
        } else {
            // A dead enemy's record takes an endless time, so a scan of it the partner sent before
            // the death, arriving after it, is older and cannot bring it back.
            double[] r = seen[e.getName().hashCode() & (SLOTS - 1)];
            r[ALIVE] = 0;
            r[TIME] = Double.POSITIVE_INFINITY;
        }
    }
}
