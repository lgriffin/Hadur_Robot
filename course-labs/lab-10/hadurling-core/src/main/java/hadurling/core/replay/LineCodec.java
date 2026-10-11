package hadurling.core.replay;

import hadurling.core.model.Event;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import java.util.ArrayList;
import java.util.List;

/**
 * The text form of an {@link Input} and of {@link Orders}, one line each, so a battle can be
 * written to a file and fed back through the core later. Doubles are written with
 * {@link Double#toString}, which reads back to exactly the same bits, NaN and infinities
 * included.
 *
 * <pre>
 * I,time,x,y,heading,velocity,energy,gunHeat,gunHeading,radarHeading,event;event;...
 * O,bodyTurn,ahead,gunTurn,radarTurn,firePower
 * </pre>
 *
 * <p>An event is a type letter and its fields separated by {@code :}</p>
 * <ul>
 * <li>{@code S}: scan; name, bearing, distance, energy, heading, velocity</li>
 * <li>{@code H}: hit by a bullet; shooter, power</li>
 * <li>{@code B}: our bullet hit; victim, power</li>
 * <li>{@code W}: we hit a wall; bearing</li>
 * <li>{@code D}: a robot died; name</li>
 * </ul>
 *
 * <p>Names may contain the separators, so {@code % , ; :} and line breaks are written as
 * {@code %XX} (two hex digits). Anything malformed is rejected with an
 * {@link IllegalArgumentException}.</p>
 */
public final class LineCodec {

    private LineCodec() {}

    /**
     * One {@code I} line for a tick's input.
     *
     * @param in the input
     * @return the line, without a line terminator
     */
    public static String encode(Input in) {
        StringBuilder b = new StringBuilder("I");
        b.append(',').append(in.time());
        for (double d : new double[] {in.x(), in.y(), in.heading(), in.velocity(), in.energy(),
                in.gunHeat(), in.gunHeading(), in.radarHeading()}) {
            b.append(',').append(d);
        }
        b.append(',');
        for (int i = 0; i < in.events().size(); i++) {
            if (i > 0) b.append(';');
            b.append(encode(in.events().get(i)));
        }
        return b.toString();
    }

    /**
     * One {@code O} line for a tick's orders.
     *
     * @param o the orders
     * @return the line, without a line terminator
     */
    public static String encode(Orders o) {
        return "O," + o.bodyTurn() + "," + o.ahead() + "," + o.gunTurn() + ","
            + o.radarTurn() + "," + o.firePower();
    }

    /**
     * Reads an {@code I} line.
     *
     * @param line a line written by {@link #encode(Input)}
     * @return the input, equal to the one that was written
     * @throws IllegalArgumentException if the line is not a valid {@code I} line
     */
    public static Input decodeInput(String line) {
        try {
            String[] f = line.split(",", -1);
            if (f.length != 11 || !f[0].equals("I")) throw new IllegalArgumentException("not an I line");
            List<Event> events = new ArrayList<>();
            if (!f[10].isEmpty()) {
                for (String e : f[10].split(";", -1)) events.add(decodeEvent(e));
            }
            return new Input(Long.parseLong(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]), d(f[6]),
                d(f[7]), d(f[8]), d(f[9]), events);
        } catch (RuntimeException e) {
            throw bad(line, e);
        }
    }

    /**
     * Reads an {@code O} line.
     *
     * @param line a line written by {@link #encode(Orders)}
     * @return the orders, equal to the ones that were written
     * @throws IllegalArgumentException if the line is not a valid {@code O} line
     */
    public static Orders decodeOrders(String line) {
        try {
            String[] f = line.split(",", -1);
            if (f.length != 6 || !f[0].equals("O")) throw new IllegalArgumentException("not an O line");
            return Orders.builder().bodyTurn(d(f[1])).ahead(d(f[2])).gunTurn(d(f[3]))
                .radarTurn(d(f[4])).fire(d(f[5])).build();
        } catch (RuntimeException e) {
            throw bad(line, e);
        }
    }

    private static String encode(Event e) {
        if (e instanceof Event.Scan) {
            Event.Scan s = (Event.Scan) e;
            return "S:" + escape(s.name()) + ":" + s.bearing() + ":" + s.distance() + ":"
                + s.energy() + ":" + s.heading() + ":" + s.velocity();
        }
        if (e instanceof Event.HitByBullet) {
            Event.HitByBullet h = (Event.HitByBullet) e;
            return "H:" + escape(h.shooter()) + ":" + h.power();
        }
        if (e instanceof Event.BulletHit) {
            Event.BulletHit h = (Event.BulletHit) e;
            return "B:" + escape(h.victim()) + ":" + h.power();
        }
        if (e instanceof Event.HitWall) return "W:" + ((Event.HitWall) e).bearing();
        if (e instanceof Event.RobotDeath) return "D:" + escape(((Event.RobotDeath) e).name());
        throw new IllegalArgumentException("unknown event " + e);
    }

    private static Event decodeEvent(String text) {
        String[] f = text.split(":", -1);
        switch (f[0]) {
            case "S":
                need(f, 7);
                return new Event.Scan(unescape(f[1]), d(f[2]), d(f[3]), d(f[4]), d(f[5]), d(f[6]));
            case "H":
                need(f, 3);
                return new Event.HitByBullet(unescape(f[1]), d(f[2]));
            case "B":
                need(f, 3);
                return new Event.BulletHit(unescape(f[1]), d(f[2]));
            case "W":
                need(f, 2);
                return new Event.HitWall(d(f[1]));
            case "D":
                need(f, 2);
                return new Event.RobotDeath(unescape(f[1]));
            default:
                throw new IllegalArgumentException("unknown event type " + f[0]);
        }
    }

    private static void need(String[] fields, int count) {
        if (fields.length != count) throw new IllegalArgumentException("wrong field count");
    }

    private static double d(String s) {
        return Double.parseDouble(s);
    }

    private static IllegalArgumentException bad(String line, RuntimeException cause) {
        return new IllegalArgumentException("bad line '" + line + "': " + cause.getMessage(), cause);
    }

    /** Writes the separator characters, and {@code %} itself, as {@code %XX}. */
    static String escape(String s) {
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '%' || c == ',' || c == ';' || c == ':' || c == '\n' || c == '\r') {
                b.append('%').append(String.format("%02X", (int) c));
            } else {
                b.append(c);
            }
        }
        return b.toString();
    }

    /** The inverse of {@link #escape}. */
    static String unescape(String s) {
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
