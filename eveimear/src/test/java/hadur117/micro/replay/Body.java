package hadur117.micro.replay;
import java.util.*;
import robocode.Condition;
public class Body {
    public double x, y, heading, velocity, gunHeading, energy = 100, radarRemaining, turn, ahead, gun;
    public int round, shots, passed;
    public final List<Condition> conditions = new ArrayList<>();
    public final StringBuilder out;
    public Body(StringBuilder out) { this.out = out; }
    public void put(String o, double v) { out.append(o).append(Long.toHexString(Double.doubleToLongBits(v))).append(' '); }
}
