package hadurling.core.memory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

/**
 * The profile file format: small, hand-written, versioned and checksummed. Not Java
 * serialisation, which breaks when a class changes, and not text, which would not fit many
 * opponents in Robocode's data quota.
 *
 * <pre>
 * 'H' 'P'           magic
 * u8                version (2; version 1 still loads)
 * i32               payload length
 * payload           see below
 * i32               CRC-32 of everything before it
 * </pre>
 *
 * <p>The payload of version 1 is the key (as {@link DataOutputStream#writeUTF}), then the
 * i32 fields {@code rounds}, {@code theirShots} and {@code theirHits}. Version 2 appends
 * {@code ourShots} and {@code ourHits} (i32), the seed's sample count (u8) and, for each
 * sample, {@link Profile#SEED_WIDTH} f32 values.</p>
 *
 * <p>{@link #decode} either returns a profile or throws {@link ProfileFormatException}; no
 * input, however damaged, makes it throw anything else (HL-18). The checksum is what makes a
 * file cut short at any byte, or altered at any bit, detectable. A file from an unknown
 * version is rejected like a damaged one, so the opponent is treated as a stranger rather
 * than misread. A version 1 file loads with the version 2 fields at their defaults (HL-19).</p>
 *
 * <p>Encoding is deterministic: the same profile always gives the same bytes.</p>
 */
public final class ProfileCodec {

    /** The version written now. */
    public static final int VERSION = 2;
    /** The oldest version {@link #decode} still accepts. */
    public static final int OLDEST_VERSION = 1;
    private static final int MAGIC_0 = 'H';
    private static final int MAGIC_1 = 'P';
    /** Two of magic, one of version, four of payload length. */
    private static final int HEADER = 7;
    /** The CRC-32. */
    private static final int TRAILER = 4;
    /** No real profile comes near this; a bigger length field is damage. */
    private static final int MAX_PAYLOAD = 16 * 1024;

    private ProfileCodec() {}

    /**
     * Encodes a profile in the current {@link #VERSION}.
     *
     * @param p the profile
     * @return the file's bytes, header, payload and checksum included
     */
    public static byte[] encode(Profile p) {
        return encode(p, VERSION);
    }

    /**
     * Encodes a profile in an older version, as an older release would have written it. A
     * version 1 file leaves out what version 2 added.
     *
     * @param p the profile
     * @param version {@link #OLDEST_VERSION} to {@link #VERSION}
     * @return the file's bytes
     * @throws IllegalArgumentException if the version is not supported
     */
    public static byte[] encode(Profile p, int version) {
        if (version < OLDEST_VERSION || version > VERSION) throw new IllegalArgumentException("version " + version);
        byte[] payload = payload(p, version);
        ByteBuffer b = ByteBuffer.allocate(HEADER + payload.length + TRAILER);
        b.put((byte) MAGIC_0).put((byte) MAGIC_1).put((byte) version).putInt(payload.length).put(payload);
        b.putInt(crc(b.array(), HEADER + payload.length));
        return b.array();
    }

    private static byte[] payload(Profile p, int version) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        // try-with-resources closes (and flushes) the stream even if a write throws.
        try (DataOutputStream out = new DataOutputStream(bytes)) {
            out.writeUTF(p.key());
            out.writeInt(p.rounds());
            out.writeInt(p.theirShots());
            out.writeInt(p.theirHits());
            if (version >= 2) {
                out.writeInt(p.ourShots());
                out.writeInt(p.ourHits());
                List<float[]> seed = p.seed();
                out.writeByte(seed.size());
                for (float[] sample : seed) {
                    for (float f : sample) out.writeFloat(f);
                }
            }
        } catch (IOException e) {
            // Writing to a byte array cannot fail; if it does, something is badly wrong.
            throw new UncheckedIOException(e);
        }
        return bytes.toByteArray();
    }

    /**
     * Reads a profile.
     *
     * @param bytes a file's whole content
     * @return the profile
     * @throws ProfileFormatException if the bytes are too short, have the wrong magic, an
     *     unknown version, a wrong length or checksum, or a payload that does not parse
     */
    public static Profile decode(byte[] bytes) throws ProfileFormatException {
        if (bytes.length < HEADER + TRAILER) throw new ProfileFormatException("only " + bytes.length + " bytes");
        ByteBuffer b = ByteBuffer.wrap(bytes);
        if ((b.get() & 0xFF) != MAGIC_0 || (b.get() & 0xFF) != MAGIC_1) throw new ProfileFormatException("not a profile");
        int version = b.get() & 0xFF;
        if (version < OLDEST_VERSION || version > VERSION) throw new ProfileFormatException("unknown version " + version);
        int length = b.getInt();
        if (length < 0 || length > MAX_PAYLOAD || HEADER + length + TRAILER != bytes.length) {
            throw new ProfileFormatException("length field " + length + " does not match " + bytes.length + " bytes");
        }
        int stored = ByteBuffer.wrap(bytes, bytes.length - TRAILER, TRAILER).getInt();
        if (stored != crc(bytes, bytes.length - TRAILER)) throw new ProfileFormatException("checksum mismatch");
        try {
            return parse(bytes, version, length);
        } catch (IOException | IllegalArgumentException e) {
            // EOFException is an IOException: the payload ended early. IllegalArgumentException
            // is the Profile constructor refusing values that make no sense.
            throw new ProfileFormatException("payload: " + e);
        }
    }

    private static Profile parse(byte[] bytes, int version, int length) throws IOException, ProfileFormatException {
        ByteArrayInputStream raw = new ByteArrayInputStream(bytes, HEADER, length);
        try (DataInputStream in = new DataInputStream(raw)) {
            String key = in.readUTF();
            int rounds = in.readInt();
            int theirShots = in.readInt();
            int theirHits = in.readInt();
            int ourShots = 0;
            int ourHits = 0;
            List<float[]> seed = new ArrayList<>();
            if (version >= 2) {
                ourShots = in.readInt();
                ourHits = in.readInt();
                int count = in.readUnsignedByte();
                for (int i = 0; i < count; i++) {
                    float[] sample = new float[Profile.SEED_WIDTH];
                    for (int j = 0; j < sample.length; j++) sample[j] = in.readFloat();
                    seed.add(sample);
                }
            }
            if (raw.available() != 0) throw new ProfileFormatException("extra bytes after the payload");
            return new Profile(key, rounds, theirShots, theirHits, ourShots, ourHits, seed);
        }
    }

    private static int crc(byte[] bytes, int length) {
        CRC32 crc = new CRC32();
        crc.update(bytes, 0, length);
        return (int) crc.getValue();
    }
}
