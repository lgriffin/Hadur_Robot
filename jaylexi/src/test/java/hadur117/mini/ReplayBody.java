package hadur117.mini;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import robocode.Bullet;
import robocode.Condition;

/** What Replay hands the robot, and the orders the robot gives, recorded bit for bit. */
public class ReplayBody {
    public double x, y, heading, velocity, gunHeading, radarHeading, energy = 100, gunTurnRemaining;
    double turn, ahead, gun;
    final List<Condition> conditions = new ArrayList<>();
    final StringBuilder out;
    final Random random;

    ReplayBody(StringBuilder out, Random random) {
        this.out = out;
        this.random = random;
    }

    public void put(String order, double v) {
        out.append(order).append(Long.toHexString(Double.doubleToLongBits(v))).append(' ');
    }

    public void turn(double v) { put("t", turn = v); }
    public void ahead(double v) { put("a", ahead = v); }
    public void gun(double v) { put("g", gun = v); }
    public void radar(double v) { put("r", v); }

    public Bullet fire(double power) {
        put("f", power);
        Replay.shots++;
        return random.nextInt(3) == 0 ? null : new Bullet(0, x, y, power, "me", null, true, 1);
    }

    public void add(Condition c) {
        conditions.add(c);
        out.append("+c ");
    }

    public void remove(Condition c) {
        conditions.remove(c);
        out.append("-c ");
    }
}
