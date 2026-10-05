package hadur2.core.link;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

/**
 * LINK-1: a {@link Report} as bytes and back. Big-endian, doubles as their raw bits, so a
 * report reads back exactly (CORE-2).
 *
 * <pre>
 * 'H' 'L' version:u8 round:u16 tick:i64
 * x y heading velocity energy:f64
 * sightings:u8 { name tick:i64 x y heading velocity energy:f64 }
 * deaths:u8 { name }
 * shots:u8 { tick:i64 x y heading power:f64 }
 * crc:i32                      CRC-32 of every byte before it
 * name = length:u8 then that many UTF-16 chars:u16
 * </pre>
 *
 * <p>LINK-2: {@link #decode} refuses a message whose checksum fails, whose version is not
 * {@link #VERSION}, or that is cut short or runs long, by throwing {@link LinkFormatException};
 * the caller ignores it and counts it. Pure byte work: no I/O (RES-6).</p>
 */
public final class LinkCodec {

    /** The format this build writes and the only one it reads. */
    public static final int VERSION = 1;
    /** The engine's limit on one serialized message. */
    public static final int MAX_BYTES = 32_768;
    /** More than any battle holds, so a list's count fits a byte. */
    static final int MAX_ITEMS = 255;

    private LinkCodec() {}

    /**
     * @param r the report
     * @return its bytes
     * @throws IllegalArgumentException if a list or a name is too long for the format
     */
    public static byte[] encode(Report r) {
        Out o = new Out();
        o.u8('H').u8('L').u8(VERSION).u16(r.round()).i64(r.tick());
        o.f64(r.x()).f64(r.y()).f64(r.heading()).f64(r.velocity()).f64(r.energy());
        o.count(r.sightings().size());
        for (Report.Sighting s : r.sightings()) {
            o.name(s.name).i64(s.tick).f64(s.x).f64(s.y).f64(s.heading).f64(s.velocity).f64(s.energy);
        }
        o.count(r.deaths().size());
        for (String d : r.deaths()) o.name(d);
        o.count(r.shots().size());
        for (Report.Shot s : r.shots()) o.i64(s.tick).f64(s.x).f64(s.y).f64(s.heading).f64(s.power);
        byte[] body = o.bytes();
        byte[] all = new byte[body.length + 4];
        System.arraycopy(body, 0, all, 0, body.length);
        int crc = crc(body, body.length);
        for (int i = 0; i < 4; i++) all[body.length + i] = (byte) (crc >>> (24 - 8 * i));
        if (all.length > MAX_BYTES) throw new IllegalArgumentException("report of " + all.length + " bytes");
        return all;
    }

    /**
     * @param bytes a message as it arrived
     * @return the report it holds
     * @throws LinkFormatException if the bytes are not a whole report this build can read
     */
    public static Report decode(byte[] bytes) {
        if (bytes == null || bytes.length < 7) throw new LinkFormatException("short");
        if (bytes[0] != 'H' || bytes[1] != 'L') throw new LinkFormatException("magic");
        int n = bytes.length - 4;
        int stored = ((bytes[n] & 0xff) << 24) | ((bytes[n + 1] & 0xff) << 16)
            | ((bytes[n + 2] & 0xff) << 8) | (bytes[n + 3] & 0xff);
        if (stored != crc(bytes, n)) throw new LinkFormatException("checksum");
        if ((bytes[2] & 0xff) != VERSION) throw new LinkFormatException("version " + (bytes[2] & 0xff));
        In in = new In(bytes, 3, n);
        int round = in.u16();
        long tick = in.i64();
        double x = in.f64(), y = in.f64(), heading = in.f64(), velocity = in.f64(), energy = in.f64();
        List<Report.Sighting> sightings = new ArrayList<>();
        for (int i = in.u8(); i > 0; i--) {
            sightings.add(new Report.Sighting(in.name(), in.i64(), in.f64(), in.f64(), in.f64(), in.f64(),
                in.f64()));
        }
        List<String> deaths = new ArrayList<>();
        for (int i = in.u8(); i > 0; i--) deaths.add(in.name());
        List<Report.Shot> shots = new ArrayList<>();
        for (int i = in.u8(); i > 0; i--) shots.add(new Report.Shot(in.i64(), in.f64(), in.f64(), in.f64(), in.f64()));
        if (in.pos != n) throw new LinkFormatException("trailing bytes");
        return new Report(round, tick, x, y, heading, velocity, energy, sightings, deaths, shots);
    }

    private static int crc(byte[] b, int length) {
        CRC32 c = new CRC32();
        c.update(b, 0, length);
        return (int) c.getValue();
    }

    /** A growing big-endian buffer. */
    private static final class Out {
        private byte[] buf = new byte[256];
        private int len;

        Out u8(int v) {
            if (len == buf.length) buf = java.util.Arrays.copyOf(buf, buf.length * 2);
            buf[len++] = (byte) v;
            return this;
        }

        Out u16(int v) {
            return u8(v >>> 8).u8(v);
        }

        Out i64(long v) {
            for (int i = 56; i >= 0; i -= 8) u8((int) (v >>> i));
            return this;
        }

        Out f64(double v) {
            return i64(Double.doubleToRawLongBits(v));
        }

        Out count(int n) {
            if (n > MAX_ITEMS) throw new IllegalArgumentException(n + " items");
            return u8(n);
        }

        Out name(String s) {
            count(s.length());
            for (int i = 0; i < s.length(); i++) u16(s.charAt(i));
            return this;
        }

        byte[] bytes() {
            return java.util.Arrays.copyOf(buf, len);
        }
    }

    /** Reads up to {@code end}, refusing to run past it. */
    private static final class In {
        private final byte[] b;
        private final int end;
        int pos;

        In(byte[] b, int pos, int end) {
            this.b = b;
            this.pos = pos;
            this.end = end;
        }

        int u8() {
            if (pos >= end) throw new LinkFormatException("truncated");
            return b[pos++] & 0xff;
        }

        int u16() {
            return (u8() << 8) | u8();
        }

        long i64() {
            long v = 0;
            for (int i = 0; i < 8; i++) v = (v << 8) | u8();
            return v;
        }

        double f64() {
            return Double.longBitsToDouble(i64());
        }

        String name() {
            int n = u8();
            StringBuilder s = new StringBuilder(n);
            for (int i = 0; i < n; i++) s.append((char) u16());
            return s.toString();
        }
    }
}
