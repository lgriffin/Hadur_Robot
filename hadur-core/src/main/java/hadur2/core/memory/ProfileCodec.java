package hadur2.core.memory;

import java.util.zip.CRC32;

/**
 * The profile file format: small, hand-written, versioned and checksummed (the artifact's
 * "Format" section). Not Java serialisation, which breaks when classes change, and not
 * text, which would not fit many opponents in the 200 KB data quota.
 *
 * <pre>
 * 'H' 'P'           magic
 * u8                version (2; version 1 still loads)
 * i32               payload length
 * payload           see {@link #encode}
 * i32               CRC-32 of everything before it
 * </pre>
 *
 * <p>{@link #decode} either returns a profile whose every count is finite and not negative,
 * or throws {@link ProfileFormatException}; no input, however damaged, makes it throw
 * anything else (MEM-4). A file from an unknown version is rejected like a damaged one,
 * so the opponent is treated as a stranger rather than misread.</p>
 */
public final class ProfileCodec {

    /**
     * 2 adds the normalised hit counts after the motion group (S4) and gives the seeds their
     * meaning ({@link Seeds}). A version 1 file loads with those counts at zero and without
     * its seeds, which had no defined layout (S3 never filled them): stats kept, seeds dropped.
     */
    public static final int VERSION = 2;
    static final int OLDEST_VERSION = 1;
    static final int MAGIC_0 = 'H';
    static final int MAGIC_1 = 'P';
    static final int HEADER = 7;
    static final int TRAILER = 4;
    /** No real profile comes near this; a bigger length field is damage. */
    static final int MAX_PAYLOAD = 64 * 1024;

    private ProfileCodec() {}

    public static byte[] encode(OpponentProfile p) {
        Bytes.Writer payload = new Bytes.Writer();
        payload.str(p.key()).str(p.lastName())
            .i32(p.battles).i32(p.rounds).i64(p.lastFought);
        payload.u8(p.outcomes.size());
        for (OpponentProfile.BattleOutcome o : p.outcomes) {
            payload.u16(o.rounds).u16(o.wins).f32(o.ourDamage).f32(o.theirDamage);
        }
        payload.floats(p.shotsAtUs).floats(p.hitsOnUs)
            .floats(p.shotsByMotion).floats(p.hitsByMotion).floats(p.powerHistogram)
            .floats(p.virtualFired).floats(p.virtualHits)
            .floats(p.ourShots).floats(p.ourHits).floats(p.motion)
            .floats(p.normalised);
        writeSeed(payload, p.gunSeed);
        writeSeed(payload, p.surfSeed);

        Bytes.Writer out = new Bytes.Writer();
        out.u8(MAGIC_0).u8(MAGIC_1).u8(VERSION).i32(payload.size());
        byte[] body = payload.toArray();
        for (byte b : body) out.u8(b);
        out.i32(crc(out.toArray(), out.size()));
        return out.toArray();
    }

    private static void writeSeed(Bytes.Writer w, java.util.List<short[]> seed) {
        w.u16(seed.size()).u8(OpponentProfile.SAMPLE_WIDTH);
        for (short[] s : seed) w.shorts(s);
    }

    public static OpponentProfile decode(byte[] bytes) {
        try {
            return decodeChecked(bytes);
        } catch (ProfileFormatException e) {
            throw e;
        } catch (RuntimeException e) {
            // Belt and braces: whatever went wrong, the caller sees one kind of failure.
            throw new ProfileFormatException(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    private static OpponentProfile decodeChecked(byte[] bytes) {
        if (bytes == null || bytes.length < HEADER + TRAILER) {
            throw new ProfileFormatException("too short: " + (bytes == null ? 0 : bytes.length) + " bytes");
        }
        Bytes.Reader h = new Bytes.Reader(bytes, 0, bytes.length);
        if (h.u8() != MAGIC_0 || h.u8() != MAGIC_1) throw new ProfileFormatException("not a profile");
        int version = h.u8();
        if (version < OLDEST_VERSION || version > VERSION) throw new ProfileFormatException("unknown version " + version);
        int length = h.i32();
        if (length < 0 || length > MAX_PAYLOAD || HEADER + length + TRAILER != bytes.length) {
            throw new ProfileFormatException("length " + length + " does not fit " + bytes.length + " bytes");
        }
        int stored = new Bytes.Reader(bytes, HEADER + length, bytes.length).i32();
        if (stored != crc(bytes, HEADER + length)) throw new ProfileFormatException("checksum mismatch");

        Bytes.Reader r = new Bytes.Reader(bytes, HEADER, HEADER + length);
        String key = r.str();
        if (key.isEmpty()) throw new ProfileFormatException("empty key");
        OpponentProfile p = new OpponentProfile(key);
        p.setLastName(r.str());
        p.battles = nonNegative(r.i32(), "battles");
        p.rounds = nonNegative(r.i32(), "rounds");
        p.lastFought = r.i64();
        if (p.lastFought < 0) throw new ProfileFormatException("lastFought " + p.lastFought);
        int outcomes = r.u8();
        if (outcomes > OpponentProfile.MAX_OUTCOMES) throw new ProfileFormatException(outcomes + " outcomes");
        for (int i = 0; i < outcomes; i++) {
            int rounds = r.u16();
            int wins = r.u16();
            if (wins > rounds) throw new ProfileFormatException("more wins than rounds");
            p.outcomes.add(new OpponentProfile.BattleOutcome(rounds, wins,
                Bytes.Reader.count(r.f32(), "our damage"), Bytes.Reader.count(r.f32(), "their damage")));
        }
        r.floats(p.shotsAtUs, "shots at us");
        r.floats(p.hitsOnUs, "hits on us");
        r.floats(p.shotsByMotion, "shots by motion");
        r.floats(p.hitsByMotion, "hits by motion");
        r.floats(p.powerHistogram, "power histogram");
        r.floats(p.virtualFired, "virtual waves");
        r.floats(p.virtualHits, "virtual hits");
        r.floats(p.ourShots, "our shots");
        r.floats(p.ourHits, "our hits");
        r.floats(p.motion, "motion");
        if (version >= 2) {
            r.floats(p.normalised, "normalised hits");
        }
        readSeed(r, p.gunSeed, OpponentProfile.MAX_GUN_SEED, "gun seed");
        readSeed(r, p.surfSeed, OpponentProfile.MAX_SURF_SEED, "surf seed");
        if (r.remaining() != 0) throw new ProfileFormatException(r.remaining() + " stray bytes");
        if (version == 1) p.dropSeeds();
        return p;
    }

    private static void readSeed(Bytes.Reader r, java.util.List<short[]> into, int max, String what) {
        int n = r.u16();
        int width = r.u8();
        if (n > max || width != OpponentProfile.SAMPLE_WIDTH) {
            throw new ProfileFormatException(what + ": " + n + " samples of " + width);
        }
        for (int i = 0; i < n; i++) into.add(r.shorts(width));
    }

    private static int nonNegative(int v, String what) {
        if (v < 0) throw new ProfileFormatException(what + " " + v);
        return v;
    }

    static int crc(byte[] bytes, int length) {
        CRC32 crc = new CRC32();
        crc.update(bytes, 0, length);
        return (int) crc.getValue();
    }
}
