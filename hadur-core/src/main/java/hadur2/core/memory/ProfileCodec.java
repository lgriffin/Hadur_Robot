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
 *
 * <p>The checksum is what makes RES-3's write order safe: a file cut short at any byte
 * either fails the length check or the CRC, so {@link ProfileLibrary} can always tell a
 * complete copy from a torn one. Every count read back is also checked to be finite and
 * not negative, and every list length against its cap, so even a file with a valid CRC but
 * nonsense values cannot put a NaN or an unbounded list
 * into the core (RES-2).</p>
 *
 * <p>Encoding is deterministic: the same profile always gives the same bytes.</p>
 */
public final class ProfileCodec {

    /**
     * 2 adds the normalised hit counts after the motion group (S4) and gives the seeds their
     * meaning ({@link Seeds}). A version 1 file loads with those counts at zero and without
     * its seeds, which had no defined layout (S3 never filled them): stats kept, seeds dropped.
     */
    public static final int VERSION = 2;
    /** The oldest version {@link #decode} still accepts. */
    static final int OLDEST_VERSION = 1;
    /** The first magic byte, {@code 'H'} (Hadur). */
    static final int MAGIC_0 = 'H';
    /** The second magic byte, {@code 'P'} (profile). */
    static final int MAGIC_1 = 'P';
    /** Header bytes: two of magic, one of version, four of payload length. */
    static final int HEADER = 7;
    /** Trailer bytes: the CRC-32. */
    static final int TRAILER = 4;
    /** No real profile comes near this; a bigger length field is damage. */
    static final int MAX_PAYLOAD = 64 * 1024;

    private ProfileCodec() {}

    /**
     * Encodes a profile in the current {@link #VERSION}. The payload holds, in order:
     *
     * <ol>
     * <li>key and last name (u8 length, then UTF-16 units); battles and rounds (i32);
     *     lastFought (i64);</li>
     * <li>the outcomes: a u8 count, then rounds and wins (u16) and our and their damage
     *     (f32) for each;</li>
     * <li>the count groups, each a u8 length and f32 values: shots at us, hits on us, shots
     *     and hits by motion, the power histogram, virtual waves and hits, our shots and
     *     hits, motion, and (version 2) the normalised waves and hits;</li>
     * <li>the gun seed, then the surf seed: a u16 count, a u8 width (13), then the samples'
     *     shorts.</li>
     * </ol>
     *
     * @param p the profile
     * @return the file's bytes, header, payload and CRC included
     */
    public static byte[] encode(OpponentProfile p) {
        return encode(p, VERSION, p.gunSeed, p.surfSeed);
    }

    /**
     * MEM-7: encodes a profile in {@code version} instead of the current one, so a client
     * still running a previous release can go on reading what a newer one writes. Only
     * {@link #OLDEST_VERSION} to {@link #VERSION} are supported, the same range
     * {@link #decode} accepts; a version-gated field a target version does not have (today,
     * only the normalised-hits group, added in version 2) is left out, exactly as that
     * version's own encoder would have left it out.
     *
     * @param p the profile
     * @param version the format version to write, {@link #OLDEST_VERSION} to {@link #VERSION}
     * @return the file's bytes, header, payload and CRC included
     * @throws IllegalArgumentException if {@code version} is outside the supported range
     */
    public static byte[] encode(OpponentProfile p, int version) {
        return encode(p, version, p.gunSeed, p.surfSeed);
    }

    /**
     * TIME-4: encodes {@code p}'s statistics with empty seed sections, without ever
     * serialising its actual (possibly large, capped-size) seed lists. Used to build a
     * cheap, independent copy of just the stats fields for a checkpoint that will not
     * write seeds; the copy still decodes at the current version, so seeds carried over
     * from elsewhere can be added back onto it afterwards.
     *
     * @param p the profile
     * @return the file's bytes, header, payload and CRC included, with no seed samples
     */
    static byte[] encodeStatsOnly(OpponentProfile p) {
        return encode(p, VERSION, java.util.List.of(), java.util.List.of());
    }

    private static byte[] encode(OpponentProfile p, int version, java.util.List<short[]> gunSeed,
            java.util.List<short[]> surfSeed) {
        if (version < OLDEST_VERSION || version > VERSION) {
            throw new IllegalArgumentException("unsupported version " + version);
        }
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
            .floats(p.ourShots).floats(p.ourHits).floats(p.motion);
        // Version 1 had no normalised group; a version 1 file must not have one either.
        if (version >= 2) payload.floats(p.normalised);
        writeSeed(payload, gunSeed);
        writeSeed(payload, surfSeed);

        // Frame the payload: header, payload, then a CRC over everything written so far.
        Bytes.Writer out = new Bytes.Writer();
        out.u8(MAGIC_0).u8(MAGIC_1).u8(version).i32(payload.size());
        byte[] body = payload.toArray();
        for (byte b : body) out.u8(b);
        out.i32(crc(out.toArray(), out.size()));
        return out.toArray();
    }

    /** A seed as a u16 sample count, a u8 width, then every sample's shorts. */
    private static void writeSeed(Bytes.Writer w, java.util.List<short[]> seed) {
        w.u16(seed.size()).u8(OpponentProfile.SAMPLE_WIDTH);
        for (short[] s : seed) w.shorts(s);
    }

    /**
     * Decodes a profile written by {@link #encode}, in this version or any since
     * {@link #OLDEST_VERSION}.
     *
     * @param bytes the file's content; may be null
     * @return a profile whose every count is finite and not negative and whose lists are
     *     within their caps
     * @throws ProfileFormatException for any input that is not such a profile; no other
     *     exception escapes (MEM-4)
     */
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

    /** {@link #decode}'s work, which may throw anything; the wrapper narrows it. */
    private static OpponentProfile decodeChecked(byte[] bytes) {
        // Frame checks come first, cheapest first: size, magic, version, length, checksum.
        // Only a frame whose CRC holds has its payload parsed.
        if (bytes == null || bytes.length < HEADER + TRAILER) {
            throw new ProfileFormatException("too short: " + (bytes == null ? 0 : bytes.length) + " bytes");
        }
        Bytes.Reader h = new Bytes.Reader(bytes, 0, bytes.length);
        if (h.u8() != MAGIC_0 || h.u8() != MAGIC_1) throw new ProfileFormatException("not a profile");
        int version = h.u8();
        if (version < OLDEST_VERSION || version > VERSION) throw new ProfileFormatException("unknown version " + version);
        int length = h.i32();
        // The length must account for the file exactly: a torn write is shorter, and a
        // stray byte after the trailer is damage too. MAX_PAYLOAD also stops a corrupt
        // length from sizing anything large.
        if (length < 0 || length > MAX_PAYLOAD || HEADER + length + TRAILER != bytes.length) {
            throw new ProfileFormatException("length " + length + " does not fit " + bytes.length + " bytes");
        }
        // The CRC covers the header and payload, i.e. every byte before the trailer.
        int stored = new Bytes.Reader(bytes, HEADER + length, bytes.length).i32();
        if (stored != crc(bytes, HEADER + length)) throw new ProfileFormatException("checksum mismatch");

        // The payload, field by field in encode()'s order, each value range-checked.
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
        // Version 1 had no normalised group; its counts stay at zero.
        if (version >= 2) {
            r.floats(p.normalised, "normalised hits");
        }
        readSeed(r, p.gunSeed, OpponentProfile.MAX_GUN_SEED, "gun seed");
        readSeed(r, p.surfSeed, OpponentProfile.MAX_SURF_SEED, "surf seed");
        // Every payload byte must be accounted for.
        if (r.remaining() != 0) throw new ProfileFormatException(r.remaining() + " stray bytes");
        // Version 1 seeds had no defined layout, so they are read (to keep the parse
        // honest) and then discarded.
        if (version == 1) p.dropSeeds();
        return p;
    }

    /** Reads a seed written by {@link #writeSeed}; its count must be within {@code max} and its width 13. */
    private static void readSeed(Bytes.Reader r, java.util.List<short[]> into, int max, String what) {
        int n = r.u16();
        int width = r.u8();
        if (n > max || width != OpponentProfile.SAMPLE_WIDTH) {
            throw new ProfileFormatException(what + ": " + n + " samples of " + width);
        }
        for (int i = 0; i < n; i++) into.add(r.shorts(width));
    }

    /** Returns {@code v}, or throws if it is negative (a count read as a signed i32). */
    private static int nonNegative(int v, String what) {
        if (v < 0) throw new ProfileFormatException(what + " " + v);
        return v;
    }

    /**
     * The CRC-32 (the zip polynomial, {@code java.util.zip.CRC32}) of the first
     * {@code length} bytes, as a signed int. Also used for the battle clock file.
     */
    static int crc(byte[] bytes, int length) {
        CRC32 crc = new CRC32();
        crc.update(bytes, 0, length);
        return (int) crc.getValue();
    }
}
