package hadur117.micro;

import hadur117.micro.core.Energy;
import hadur117.micro.core.Movement;
import hadur117.micro.core.Selection;
import hadur117.micro.core.Targeting;
import java.awt.Color;
import java.awt.Graphics2D;
import robocode.AdvancedRobot;
import robocode.BulletHitEvent;
import robocode.RobotDeathEvent;
import robocode.RoundEndedEvent;
import robocode.ScannedRobotEvent;
import robocode.StatusEvent;
import robocode.util.Utils;

/**
 * The bench adapter: Saor driven by the core, call by call, plus paint and one log line a
 * round. It is the reference the shipped class is held to: {@code SaorEquivalenceTest} feeds
 * both the same events and requires the same orders (SAOR-15). Built into its own jar
 * ({@code hadur117.micro.SaorLab_<release>.jar}); it never ships to the rumble.
 *
 * <p>The log line, {@code SAOR round=R shots=S hits=H damage=D}, is what the bench keeps of
 * the robot's console per battle.</p>
 */
public class SaorLab extends AdvancedRobot {

    static char[][][] markov = new char[Targeting.OPPONENTS][Targeting.STATES][Targeting.ROW + 1];
    static String targetName;
    static double targetDistance;
    static double targetVelocity;
    static double targetHeading;
    static int targetState;
    static double myX;
    static double myY;
    static int axis;

    private int pointX;
    private int pointY;
    private int shots;
    private int hits;
    private double damage;

    @Override
    public void run() {
        setAdjustGunForRobotTurn(true);
        onRobotDeath(null);
    }

    @Override
    public void onStatus(StatusEvent e) {
        axis = Movement.axis(axis, getDistanceRemaining());
        int leg = Movement.leg(targetDistance);
        int x = Movement.coordinate(axis > 0, leg, myX = getX());
        int y = Movement.coordinate(axis <= 0, leg, myY = getY());
        double turn = Movement.turn(x, y, myX, myY, getHeadingRadians());
        setTurnRightRadians(Movement.bodyTurn(turn));
        setAhead(Movement.ahead(turn, x, y, myX, myY));
        pointX = x;
        pointY = y;
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        String name = e.getName();
        double bearing = getHeadingRadians() + e.getBearingRadians();
        double distance = e.getDistance();
        if (!Selection.adopt(distance, targetDistance, name == targetName)) {
            return;
        }
        targetName = name;
        if (Selection.holdRadar(getGunHeat())) {
            setTurnRadarRightRadians(Selection.radarTurn(bearing, getRadarHeadingRadians()));
        }
        double power = Energy.power(getEnergy(), targetDistance = distance);
        if (Energy.fire(getGunTurnRemaining())) {
            // The engine drops the order while the gun is hot; count only the ones it can fire.
            if (getGunHeat() == 0 && getEnergy() > 0) {
                shots++;
            }
            setFire(power);
        }
        double velocity = e.getVelocity();
        double lastHeading = targetHeading;
        int state = Targeting.state(velocity, targetVelocity, lastHeading, targetHeading = e.getHeadingRadians());
        try {
            char[][] table = Targeting.table(markov, name.hashCode());
            int best = Targeting.aim(table, state, myX, myY, bearing, distance, targetHeading, velocity, power);
            setTurnGunRightRadians(Utils.normalRelativeAngle(Targeting.angle(best) - getGunHeadingRadians()));
            Targeting.record(table[targetState], state);
        } catch (RuntimeException ex) {
            // A full row or an out-of-range state, as in the shipped class.
        }
        targetState = state;
        targetVelocity = velocity;
    }

    @Override
    public void onRobotDeath(RobotDeathEvent e) {
        setTurnRadarRightRadians(targetDistance = Selection.afterDeath());
    }

    @Override
    public void onBulletHit(BulletHitEvent e) {
        hits++;
        double p = e.getBullet().getPower();
        damage += 4 * p + (p > 1 ? 2 * (p - 1) : 0);
    }

    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        out.printf("SAOR round=%d shots=%d hits=%d damage=%.1f%n", e.getRound(), shots, hits, damage);
    }

    @Override
    public void onPaint(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.drawOval(pointX - 6, pointY - 6, 12, 12);
        g.drawLine((int) myX, (int) myY, pointX, pointY);
        g.setColor(Color.YELLOW);
        double gun = getGunHeadingRadians();
        g.drawLine((int) myX, (int) myY, (int) (myX + Math.sin(gun) * 1200), (int) (myY + Math.cos(gun) * 1200));
    }
}
