package hadur2.core.memory;

import java.util.Arrays;

/**
 * Big-endian byte writing and reading for the profile format, without java.io (the core
 * does no I/O, RES-6). The reader throws {@link ProfileFormatException} past the end.
 *
 * <p>Big-endian means most significant byte first, the byte order
 * {@code java.io.DataOutputStream} uses. Floats are stored as
 * their IEEE 754 bits, so a value reads back bit for bit.</p>
 */
final class Bytes {

    private Bytes() {}

    /** A growable big-endian byte buffer. Values are truncated to the width written. */
    static final class Writer {
        private byte[] buf = new byte[256];
        private int size;

        /** Bytes written so far. */
        int size() {
            return size;
        }

        /** A copy of the bytes written so far. */
        byte[] toArray() {
            return Arrays.copyOf(buf, size);
        }

        /** The low 8 bits of {@code v}. */
        Writer u8(int v) {
            ensure(1);
            buf[size++] = (byte) v;
            return this;
        }

        /** The low 16 bits of {@code v}, high byte first. */
        Writer u16(int v) {
            ensure(2);
            buf[size++] = (byte) (v >>> 8);
            buf[size++] = (byte) v;
            return this;
        }

        /** Four bytes, high byte first. */
        Writer i32(int v) {
            ensure(4);
            for (int shift = 24; shift >= 0; shift -= 8) buf[size++] = (byte) (v >>> shift);
            return this;
        }

        /** Eight bytes: the high 32 bits, then the low 32. */
        Writer i64(long v) {
            i32((int) (v >>> 32));
            return i32((int) v);
        }

        /** A float as its IEEE 754 bits, which keeps NaN and infinities distinct. */
        Writer f32(float v) {
            return i32(Float.floatToIntBits(v));
        }

        /**
         * A float array: its length as a u8, then each value. The length is not checked, so
         * arrays must be shorter than 256 (every profile array is).
         */
        Writer floats(float[] a) {
            u8(a.length);
            for (float f : a) f32(f);
            return this;
        }

        /** A string as a length and UTF-16 code units, at most 255 of them. */
        Writer str(String s) {
            int n = Math.min(s.length(), 255);
            u8(n);
            for (int i = 0; i < n; i++) u16(s.charAt(i));
            return this;
        }

        /** Each short as a u16, with no length prefix: the reader must know the count. */
        Writer shorts(short[] a) {
            for (short s : a) u16(s);
            return this;
        }

        /** Grows the buffer, at least doubling it, so appends cost amortised constant time. */
        private void ensure(int n) {
            if (size + n > buf.length) buf = Arrays.copyOf(buf, Math.max(buf.length * 2, size + n));
        }
    }

    /**
     * Reads big-endian values from {@code buf[start, end)}. Every read checks the bounds
     * first and throws {@link ProfileFormatException} rather than
     * {@code ArrayIndexOutOfBoundsException}, so a truncated or lying length field is
     * reported as damage (MEM-4).
     */
    static final class Reader {
        private final byte[] buf;
        private final int end;
        private int pos;

        /** A reader over {@code buf} from {@code start} (inclusive) to {@code end} (exclusive). */
        Reader(byte[] buf, int start, int end) {
            this.buf = buf;
            this.pos = start;
            this.end = end;
        }

        /** The index of the next byte to read. */
        int position() {
            return pos;
        }

        /** Bytes left before {@code end}. */
        int remaining() {
            return end - pos;
        }

        /** Throws unless {@code n} more bytes are available; a negative {@code n} is damage too. */
        private void need(int n) {
            if (n < 0 || pos + n > end) {
                throw new ProfileFormatException("truncated at byte " + pos);
            }
        }

        /** An unsigned byte, 0 to 255. */
        int u8() {
            need(1);
            return buf[pos++] & 0xff;
        }

        /** An unsigned 16-bit value, 0 to 65535. */
        int u16() {
            need(2);
            int v = ((buf[pos] & 0xff) << 8) | (buf[pos + 1] & 0xff);
            pos += 2;
            return v;
        }

        /** A signed 32-bit value. */
        int i32() {
            need(4);
            int v = 0;
            for (int i = 0; i < 4; i++) v = (v << 8) | (buf[pos++] & 0xff);
            return v;
        }

        /** A signed 64-bit value from two 32-bit halves. */
        long i64() {
            // Mask each half to unsigned so the low half's sign bit does not smear upward.
            long hi = i32() & 0xffffffffL;
            long lo = i32() & 0xffffffffL;
            return (hi << 32) | lo;
        }

        /** A float from its IEEE 754 bits. */
        float f32() {
            return Float.intBitsToFloat(i32());
        }

        /**
         * Reads a float array written by {@link Writer#floats} into {@code into}. The stored
         * length must equal {@code into.length}, and every value must pass {@link #count}.
         */
        void floats(float[] into, String what) {
            int n = u8();
            if (n != into.length) {
                throw new ProfileFormatException(what + " has " + n + " values, expected " + into.length);
            }
            for (int i = 0; i < n; i++) into[i] = count(f32(), what);
        }

        /** A string written by {@link Writer#str}. */
        String str() {
            int n = u8();
            need(2 * n);
            StringBuilder b = new StringBuilder(n);
            for (int i = 0; i < n; i++) b.append((char) u16());
            return b.toString();
        }

        /** {@code n} shorts written by {@link Writer#shorts}. */
        short[] shorts(int n) {
            need(2 * n);
            short[] a = new short[n];
            for (int i = 0; i < n; i++) a[i] = (short) u16();
            return a;
        }

        /** A count must be finite and not negative. */
        static float count(float f, String what) {
            if (!(f >= 0) || Float.isInfinite(f)) {
                throw new ProfileFormatException(what + " holds " + f);
            }
            return f;
        }
    }
}
