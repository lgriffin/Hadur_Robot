package hadur2.core.replay;

import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * Text form of {@link BotInput} and {@link BotOrders}, one line each, so a battle can be
 * recorded and replayed through the core (CORE-2). Doubles are written with
 * {@link Double#toString}, which reads back to the same bits, including NaN and infinities.
 *
 * <pre>
 * I,time,round,x,y,heading,velocity,energy,gunHeat,gunCoolingRate,gunHeading,
 *   gunTurnRemaining,radarHeading,others,event;event;...[,numSentries,sentryBorderSize]
 * O,bodyTurn,ahead,maxVelocity,gunTurn,radarTurn,firePower[,message;message;...]
 * </pre>
 *
 * <p>An {@code O} line carries the tick's messages to teammates (A4) only when there are
 * any, each in Base64, so every line written off a team reads as before.</p>
 *
 * <p>The sentry fields (M1) are written only when there are sentries, and a scan's sentry
 * flag only when it is set, so lines from battles without sentries, and the fixtures
 * recorded before M1, read the same.</p>
 *
 * <p>An event is its type letter and fields separated by {@code :}. Names escape
 * {@code % , ; :} as {@code %XX}. Pure string work: no I/O here (RES-6).</p>
 *
 * <p>Event letters and fields, in the order written:</p>
 * <ul>
 * <li>{@code S}: scan; name, bearing, distance, energy, heading, velocity, and {@code 1}
 *     when the robot is a sentry (GATE-3).</li>
 * <li>{@code H}: hit by a bullet; shooter's name, power, bullet x, y, heading.</li>
 * <li>{@code B}: our bullet hit; victim's name, power, victim's energy, bullet heading.</li>
 * <li>{@code X}: our bullet hit a bullet; our power, x, y, the other bullet's power, our
 *     bullet's heading, and from A4 the other bullet's owner when known.</li>
 * <li>{@code M}: our bullet missed; power, bullet heading.</li>
 * <li>{@code W}: we hit a wall; bearing.</li>
 * <li>{@code R}: we hit a robot; name, bearing, its energy, whether it was our fault.</li>
 * <li>{@code D}: a robot died; name.</li>
 * <li>{@code K}: a skipped turn; the skipped tick (TIME-2).</li>
 * <li>{@code Q}: the last core tick's duration and the allowance, in nanoseconds
 *     (TIME-1).</li>
 * <li>{@code G}: a teammate's message (A4); the sender's name and the bytes in Base64.</li>
 * </ul>
 *
 * <p>Formats only ever grow by appending optional fields, and the decoder treats a missing
 * trailing field as its default (NaN for a bullet heading, not a sentry, no sentries), so
 * every fixture recorded by an older build still replays. Angles are in radians as the
 * adapter reports them, distances in px.</p>
 */
public final class LineCodec {

    private LineCodec() {}

    /**
     * One {@code I} line for a tick's input.
     *
     * @param in the input
     * @return the line, without a line terminator
     */
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
        // Double.compare rather than != so that a -0.0 or NaN border size is written too
        // and reads back exactly.
        if (in.numSentries() != 0 || Double.compare(in.sentryBorderSize(), 0.0) != 0) {
            b.append(',').append(in.numSentries()).append(',').append(in.sentryBorderSize());
        }
        return b.toString();
    }

    /**
     * One {@code O} line for a tick's orders.
     *
     * @param o the orders
     * @return the line, without a line terminator
     */
    public static String encode(BotOrders o) {
        String line = "O," + o.bodyTurn() + "," + o.ahead() + "," + o.maxVelocity() + ","
            + o.gunTurn() + "," + o.radarTurn() + "," + o.firePower();
        List<byte[]> messages = o.messages();
        if (messages.isEmpty()) return line;
        StringBuilder b = new StringBuilder(line).append(',');
        for (int i = 0; i < messages.size(); i++) {
            if (i > 0) b.append(';');
            b.append(Base64.getEncoder().encodeToString(messages.get(i)));
        }
        return b.toString();
    }

    /**
     * Reads an {@code I} line.
     *
     * @param line a line written by {@link #encode(BotInput)}
     * @return the input it describes
     * @throws IllegalArgumentException if it is not an input line, or a field does not parse
     */
    public static BotInput decodeInput(String line) {
        // The -1 limit keeps trailing empty fields, so a tick with no events still has
        // its (empty) field 14. 15 fields without the sentry pair, 17 with it.
        String[] f = line.split(",", -1);
        if ((f.length != 15 && f.length != 17) || !f[0].equals("I")) {
            throw new IllegalArgumentException("Not an input line: " + line);
        }
        List<BotEvent> events = new ArrayList<>();
        if (!f[14].isEmpty()) {
            for (String e : f[14].split(";", -1)) events.add(decodeEvent(e));
        }
        return new BotInput(Long.parseLong(f[1]), Integer.parseInt(f[2]), d(f[3]), d(f[4]),
            d(f[5]), d(f[6]), d(f[7]), d(f[8]), d(f[9]), d(f[10]), d(f[11]), d(f[12]),
            Integer.parseInt(f[13]), events,
            f.length == 17 ? Integer.parseInt(f[15]) : 0, f.length == 17 ? d(f[16]) : 0);
    }

    /**
     * Reads an {@code O} line.
     *
     * @param line a line written by {@link #encode(BotOrders)}
     * @return the orders it describes
     * @throws IllegalArgumentException if it is not an orders line, or a field does not parse
     */
    public static BotOrders decodeOrders(String line) {
        String[] f = line.split(",", -1);
        if ((f.length != 7 && f.length != 8) || !f[0].equals("O")) {
            throw new IllegalArgumentException("Not an orders line: " + line);
        }
        List<byte[]> messages = new ArrayList<>();
        if (f.length == 8) {
            for (String m : f[7].split(";", -1)) messages.add(Base64.getDecoder().decode(m));
        }
        return new BotOrders(d(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]), d(f[6]), messages);
    }

    /**
     * One event as its letter and {@code :}-separated fields; see the class comment.
     * Optional trailing fields (a sentry flag, a bullet heading) are written only when set,
     * so the line is the same as an older build's whenever they are not.
     */
    static String encode(BotEvent e) {
        if (e instanceof BotEvent.Scan) {
            BotEvent.Scan s = (BotEvent.Scan) e;
            return s.sentry()
                ? join("S", esc(s.name()), s.bearing(), s.distance(), s.energy(), s.heading(),
                    s.velocity(), 1)
                : join("S", esc(s.name()), s.bearing(), s.distance(), s.energy(), s.heading(),
                    s.velocity());
        } else if (e instanceof BotEvent.HitByBullet) {
            BotEvent.HitByBullet h = (BotEvent.HitByBullet) e;
            return join("H", esc(h.name()), h.power(), h.x(), h.y(), h.heading());
        } else if (e instanceof BotEvent.BulletHit) {
            BotEvent.BulletHit b = (BotEvent.BulletHit) e;
            return Double.isNaN(b.bulletHeading())
                ? join("B", esc(b.name()), b.power(), b.energy())
                : join("B", esc(b.name()), b.power(), b.energy(), b.bulletHeading());
        } else if (e instanceof BotEvent.BulletHitBullet) {
            BotEvent.BulletHitBullet b = (BotEvent.BulletHitBullet) e;
            if (b.owner() != null) {
                return join("X", b.power(), b.x(), b.y(), b.enemyPower(), b.bulletHeading(), esc(b.owner()));
            }
            return Double.isNaN(b.bulletHeading())
                ? join("X", b.power(), b.x(), b.y(), b.enemyPower())
                : join("X", b.power(), b.x(), b.y(), b.enemyPower(), b.bulletHeading());
        } else if (e instanceof BotEvent.BulletMissed) {
            BotEvent.BulletMissed m = (BotEvent.BulletMissed) e;
            return Double.isNaN(m.bulletHeading())
                ? join("M", m.power())
                : join("M", m.power(), m.bulletHeading());
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
        } else if (e instanceof BotEvent.TickTime) {
            BotEvent.TickTime t = (BotEvent.TickTime) e;
            return join("Q", t.usedNanos(), t.allowanceNanos());
        } else if (e instanceof BotEvent.Message) {
            BotEvent.Message m = (BotEvent.Message) e;
            return join("G", esc(m.sender()), Base64.getEncoder().encodeToString(m.bytes()));
        }
        throw new IllegalArgumentException("Unknown event " + e);
    }

    /** Reads one event written by {@link #encode(BotEvent)}. */
    static BotEvent decodeEvent(String s) {
        String[] f = s.split(":", -1);
        switch (f[0]) {
            case "S": return new BotEvent.Scan(unesc(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]), d(f[6]),
                f.length > 7 && f[7].equals("1"));
            case "H": return new BotEvent.HitByBullet(unesc(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]));
            // S6 appended our bullet's heading to B, X and M; older fixtures lack it.
            case "B": return new BotEvent.BulletHit(unesc(f[1]), d(f[2]), d(f[3]), opt(f, 4));
            case "X": return new BotEvent.BulletHitBullet(d(f[1]), d(f[2]), d(f[3]), d(f[4]), opt(f, 5),
                f.length > 6 ? unesc(f[6]) : null);
            case "M": return new BotEvent.BulletMissed(d(f[1]), opt(f, 2));
            case "W": return new BotEvent.HitWall(d(f[1]));
            case "R": return new BotEvent.HitRobot(unesc(f[1]), d(f[2]), d(f[3]),
                Boolean.parseBoolean(f[4]));
            case "D": return new BotEvent.RobotDeath(unesc(f[1]));
            case "K": return new BotEvent.SkippedTurn(Long.parseLong(f[1]));
            case "Q": return new BotEvent.TickTime(Long.parseLong(f[1]), Long.parseLong(f[2]));
            case "G": return new BotEvent.Message(unesc(f[1]), Base64.getDecoder().decode(f[2]));
            default: throw new IllegalArgumentException("Unknown event " + s);
        }
    }

    /**
     * The type letter and each field's {@code toString()}, separated by {@code :}. Doubles
     * go through {@code Double.toString}, which round-trips exactly.
     */
    private static String join(String type, Object... fields) {
        StringBuilder b = new StringBuilder(type);
        for (Object o : fields) b.append(':').append(o);
        return b.toString();
    }

    /** Field {@code i} as a double, or NaN when an older line does not have it. */
    private static double opt(String[] f, int i) {
        return f.length > i ? d(f[i]) : Double.NaN;
    }

    /** Parses a double as {@code Double.toString} wrote it, NaN and infinities included. */
    private static double d(String s) {
        return Double.parseDouble(s);
    }

    /**
     * Escapes a robot name for a field: {@code % , ; :} and control characters become
     * {@code %XX} (two hex digits), everything else is kept.
     */
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

    /** Reverses {@link #esc}. */
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
