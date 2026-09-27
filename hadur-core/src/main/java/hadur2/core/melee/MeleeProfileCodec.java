package hadur2.core.melee;

import java.util.Arrays;
import java.util.zip.CRC32;

/**
 * The melee profile block's file format (MMEM-1): small, hand-written, versioned and
 * checksummed like the 1v1 profile's, and written to its own file beside it.
 *
 * <pre>
 * 'H' 'M'           magic
 * u8                version (1)
 * i32               payload length
 * payload           key (u8 length, UTF-16 code units), i32 rounds, i64 lastFought,
 *                   u8 count, then that many f32 counts (see {@link #encode})
 * i32               CRC-32 of everything before it
 * </pre>
 *
 * <p>{@link #decode} either returns a block whose every count is finite and not negative,
 * or throws {@link MeleeProfileFormatException}; no input, however damaged, makes it throw
 * anything else. Only version 1 is read: a block from any other version is rejected like a
 * damaged one, so the opponent is met as a stranger rather than misread. Encoding is
 * canonical: decoding a block and encoding it again gives the same bytes.</p>
 */
public final class MeleeProfileCodec {

    public static final int VERSION = 1;
    static final int MAGIC_0 = 'H';
    static final int MAGIC_1 = 'M';
    static final int HEADER = 7;
    static final int TRAILER = 4;
    /** The counts after the key, rounds and stamp. */
    static final int COUNTS = 10;
    /** No real block comes near this; a bigger length field is damage. */
    static final int MAX_PAYLOAD = 4096;
    /** Keys longer than this are cut; lineage keys are at most 120 characters. */
    static final int MAX_KEY = 255;

    private MeleeProfileCodec() {}

    public static byte[] encode(MeleeProfile p) {
        Writer payload = new Writer();
        String key = p.key();
        int n = Math.min(key.length(), MAX_KEY);
        payload.u8(n);
        for (int i = 0; i < n; i++) payload.u16(key.charAt(i));
        payload.i32(p.rounds).i64(p.lastFought).u8(COUNTS);
        float[] counts = {p.shotsInferred, p.hitsOnHadur, p.aimHits[0], p.aimHits[1],
            p.powerSum, p.powerCount, p.closeScans, p.ramScans, p.rankSum, p.rankRounds};
        for (float f : counts) payload.i32(Float.floatToIntBits(f));

        Writer out = new Writer();
        out.u8(MAGIC_0).u8(MAGIC_1).u8(VERSION).i32(payload.size);
        for (int i = 0; i < payload.size; i++) out.u8(payload.buf[i]);
        out.i32(crc(out.buf, out.size));
        return out.toArray();
    }

    public static MeleeProfile decode(byte[] bytes) {
        try {
            return decodeChecked(bytes);
        } catch (MeleeProfileFormatException e) {
            throw e;
        } catch (RuntimeException e) {
            // Belt and braces: whatever went wrong, the caller sees one kind of failure.
            throw new MeleeProfileFormatException(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    /**
     * The stamp of an encoded block, or -1 when the bytes are not a valid block. Used to
     * find the least recently fought block without keeping the blocks themselves.
     */
    public static long stampOf(byte[] bytes) {
        try {
            return decode(bytes).lastFought;
        } catch (MeleeProfileFormatException e) {
            return -1;
        }
    }

    private static MeleeProfile decodeChecked(byte[] bytes) {
        if (bytes == null || bytes.length < HEADER + TRAILER) {
            throw new MeleeProfileFormatException("too short: " + (bytes == null ? 0 : bytes.length) + " bytes");
        }
        Reader h = new Reader(bytes, 0, bytes.length);
        if (h.u8() != MAGIC_0 || h.u8() != MAGIC_1) throw new MeleeProfileFormatException("not a melee profile");
        int version = h.u8();
        if (version != VERSION) throw new MeleeProfileFormatException("unknown version " + version);
        int length = h.i32();
        if (length < 0 || length > MAX_PAYLOAD || HEADER + length + TRAILER != bytes.length) {
            throw new MeleeProfileFormatException("length " + length + " does not fit " + bytes.length + " bytes");
        }
        int stored = new Reader(bytes, HEADER + length, bytes.length).i32();
        if (stored != crc(bytes, HEADER + length)) throw new MeleeProfileFormatException("checksum mismatch");

        Reader r = new Reader(bytes, HEADER, HEADER + length);
        int keyLength = r.u8();
        StringBuilder key = new StringBuilder(keyLength);
        for (int i = 0; i < keyLength; i++) key.append((char) r.u16());
        if (key.length() == 0) throw new MeleeProfileFormatException("empty key");
        MeleeProfile p = new MeleeProfile(key.toString());
        p.rounds = r.i32();
        if (p.rounds < 0) throw new MeleeProfileFormatException("rounds " + p.rounds);
        p.lastFought = r.i64();
        if (p.lastFought < 0) throw new MeleeProfileFormatException("lastFought " + p.lastFought);
        int n = r.u8();
        if (n != COUNTS) throw new MeleeProfileFormatException(n + " counts, expected " + COUNTS);
        float[] c = new float[COUNTS];
        for (int i = 0; i < COUNTS; i++) {
            c[i] = Float.intBitsToFloat(r.i32());
            if (!(c[i] >= 0) || Float.isInfinite(c[i])) throw new MeleeProfileFormatException("count " + i + " holds " + c[i]);
        }
        if (r.remaining() != 0) throw new MeleeProfileFormatException(r.remaining() + " stray bytes");
        p.shotsInferred = c[0];
        p.hitsOnHadur = c[1];
        p.aimHits[0] = c[2];
        p.aimHits[1] = c[3];
        p.powerSum = c[4];
        p.powerCount = c[5];
        p.closeScans = c[6];
        p.ramScans = c[7];
        p.rankSum = c[8];
        p.rankRounds = c[9];
        return p;
    }

    static int crc(byte[] bytes, int length) {
        CRC32 crc = new CRC32();
        crc.update(bytes, 0, length);
        return (int) crc.getValue();
    }

    /** Big-endian writing without java.io (the core does no I/O, RES-6). */
    private static final class Writer {
        byte[] buf = new byte[128];
        int size;

        Writer u8(int v) {
            ensure(1);
            buf[size++] = (byte) v;
            return this;
        }

        Writer u16(int v) {
            return u8(v >>> 8).u8(v);
        }

        Writer i32(int v) {
            for (int shift = 24; shift >= 0; shift -= 8) u8(v >>> shift);
            return this;
        }

        Writer i64(long v) {
            i32((int) (v >>> 32));
            return i32((int) v);
        }

        byte[] toArray() {
            return Arrays.copyOf(buf, size);
        }

        private void ensure(int n) {
            if (size + n > buf.length) buf = Arrays.copyOf(buf, Math.max(buf.length * 2, size + n));
        }
    }

    /** Big-endian reading that throws {@link MeleeProfileFormatException} past the end. */
    private static final class Reader {
        private final byte[] buf;
        private final int end;
        private int pos;

        Reader(byte[] buf, int start, int end) {
            this.buf = buf;
            this.pos = start;
            this.end = end;
        }

        int remaining() {
            return end - pos;
        }

        int u8() {
            if (pos >= end) throw new MeleeProfileFormatException("truncated at byte " + pos);
            return buf[pos++] & 0xff;
        }

        int u16() {
            return (u8() << 8) | u8();
        }

        int i32() {
            int v = 0;
            for (int i = 0; i < 4; i++) v = (v << 8) | u8();
            return v;
        }

        long i64() {
            long hi = i32() & 0xffffffffL;
            long lo = i32() & 0xffffffffL;
            return (hi << 32) | lo;
        }
    }
}
