package hadur2.core.replay;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import java.util.ArrayList;
import java.util.List;

/**
 * Text form of {@link BotInput} and {@link BotOrders}, one line each, so a battle can be
 * recorded and replayed through the core (CORE-2). Doubles are written with
 * {@link Double#toString}, which reads back to the same bits, including NaN and infinities.
 *
 * <pre>
 * I,time,round,x,y,heading,velocity,energy,gunHeat,gunCoolingRate,gunHeading,
 *   gunTurnRemaining,radarHeading,others,event;event;...
 * O,bodyTurn,ahead,maxVelocity,gunTurn,radarTurn,firePower
 * </pre>
 *
 * <p>An event is its type letter and fields separated by {@code :}. Names escape
 * {@code % , ; :} as {@code %XX}. Pure string work: no I/O here (RES-6).</p>
 */
public final class LineCodec {

    private LineCodec() {}

    public static String encode(BotInput in) {
        StringBuilder b = new StringBuilder("I");
        b.append(',').append(in.time()).append(',').append(in.round());
        for (double d : new double[] {in.x(), in.y(), in.heading(), in.velocity(), in.energy(),
                in.gunHeat(), in.gunCoolingRate(), in.gunHeading(), in.gunTurnRemaining(),
                in.radarHeading()}) {
            b.append(',').append(d);
        }
        b.append(',').append(in.others()).append(',');
        for (int i = 0; i < in.events().size(); i++) {
            if (i > 0) b.append(';');
            b.append(encode(in.events().get(i)));
        }
        return b.toString();
    }

    public static String encode(BotOrders o) {
        return "O," + o.bodyTurn() + "," + o.ahead() + "," + o.maxVelocity() + ","
            + o.gunTurn() + "," + o.radarTurn() + "," + o.firePower();
    }

    public static BotInput decodeInput(String line) {
        String[] f = line.split(",", -1);
        if (f.length != 15 || !f[0].equals("I")) {
            throw new IllegalArgumentException("Not an input line: " + line);
        }
        List<BotEvent> events = new ArrayList<>();
        if (!f[14].isEmpty()) {
            for (String e : f[14].split(";", -1)) events.add(decodeEvent(e));
        }
        return new BotInput(Long.parseLong(f[1]), Integer.parseInt(f[2]), d(f[3]), d(f[4]),
            d(f[5]), d(f[6]), d(f[7]), d(f[8]), d(f[9]), d(f[10]), d(f[11]), d(f[12]),
            Integer.parseInt(f[13]), events);
    }

    public static BotOrders decodeOrders(String line) {
        String[] f = line.split(",", -1);
        if (f.length != 7 || !f[0].equals("O")) {
            throw new IllegalArgumentException("Not an orders line: " + line);
        }
        return new BotOrders(d(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]), d(f[6]));
    }

    static String encode(BotEvent e) {
        if (e instanceof BotEvent.Scan) {
            BotEvent.Scan s = (BotEvent.Scan) e;
            return join("S", esc(s.name()), s.bearing(), s.distance(), s.energy(), s.heading(),
                s.velocity());
        } else if (e instanceof BotEvent.HitByBullet) {
            BotEvent.HitByBullet h = (BotEvent.HitByBullet) e;
            return join("H", esc(h.name()), h.power(), h.x(), h.y(), h.heading());
        } else if (e instanceof BotEvent.BulletHit) {
            BotEvent.BulletHit b = (BotEvent.BulletHit) e;
            return join("B", esc(b.name()), b.power(), b.energy());
        } else if (e instanceof BotEvent.BulletHitBullet) {
            BotEvent.BulletHitBullet b = (BotEvent.BulletHitBullet) e;
            return join("X", b.power(), b.x(), b.y(), b.enemyPower());
        } else if (e instanceof BotEvent.BulletMissed) {
            BotEvent.BulletMissed m = (BotEvent.BulletMissed) e;
            return join("M", m.power());
        } else if (e instanceof BotEvent.HitWall) {
            BotEvent.HitWall w = (BotEvent.HitWall) e;
            return join("W", w.bearing());
        } else if (e instanceof BotEvent.HitRobot) {
            BotEvent.HitRobot r = (BotEvent.HitRobot) e;
            return join("R", esc(r.name()), r.bearing(), r.energy(), r.myFault());
        } else if (e instanceof BotEvent.RobotDeath) {
            BotEvent.RobotDeath d = (BotEvent.RobotDeath) e;
            return join("D", esc(d.name()));
        } else if (e instanceof BotEvent.SkippedTurn) {
            BotEvent.SkippedTurn s = (BotEvent.SkippedTurn) e;
            return join("K", s.skippedTime());
        }
        throw new IllegalArgumentException("Unknown event " + e);
    }

    static BotEvent decodeEvent(String s) {
        String[] f = s.split(":", -1);
        switch (f[0]) {
            case "S": return new BotEvent.Scan(unesc(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]), d(f[6]));
            case "H": return new BotEvent.HitByBullet(unesc(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]));
            case "B": return new BotEvent.BulletHit(unesc(f[1]), d(f[2]), d(f[3]));
            case "X": return new BotEvent.BulletHitBullet(d(f[1]), d(f[2]), d(f[3]), d(f[4]));
            case "M": return new BotEvent.BulletMissed(d(f[1]));
            case "W": return new BotEvent.HitWall(d(f[1]));
            case "R": return new BotEvent.HitRobot(unesc(f[1]), d(f[2]), d(f[3]),
                Boolean.parseBoolean(f[4]));
            case "D": return new BotEvent.RobotDeath(unesc(f[1]));
            case "K": return new BotEvent.SkippedTurn(Long.parseLong(f[1]));
            default: throw new IllegalArgumentException("Unknown event " + s);
        }
    }

    private static String join(String type, Object... fields) {
        StringBuilder b = new StringBuilder(type);
        for (Object o : fields) b.append(':').append(o);
        return b.toString();
    }

    private static double d(String s) {
        return Double.parseDouble(s);
    }

    static String esc(String s) {
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '%' || c == ',' || c == ';' || c == ':' || c < 0x20) {
                b.append('%').append(String.format("%02X", (int) c));
            } else {
                b.append(c);
            }
        }
        return b.toString();
    }

    static String unesc(String s) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '%') {
                b.append((char) Integer.parseInt(s.substring(i + 1, i + 3), 16));
                i += 2;
            } else {
                b.append(c);
            }
        }
        return b.toString();
    }
}
