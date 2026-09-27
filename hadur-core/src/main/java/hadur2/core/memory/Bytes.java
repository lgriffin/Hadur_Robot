package hadur2.core.memory;

import java.util.Arrays;

/**
 * Big-endian byte writing and reading for the profile format, without java.io (the core
 * does no I/O, RES-6). The reader throws {@link ProfileFormatException} past the end.
 */
final class Bytes {

    private Bytes() {}

    static final class Writer {
        private byte[] buf = new byte[256];
        private int size;

        int size() {
            return size;
        }

        byte[] toArray() {
            return Arrays.copyOf(buf, size);
        }

        Writer u8(int v) {
            ensure(1);
            buf[size++] = (byte) v;
            return this;
        }

        Writer u16(int v) {
            ensure(2);
            buf[size++] = (byte) (v >>> 8);
            buf[size++] = (byte) v;
            return this;
        }

        Writer i32(int v) {
            ensure(4);
            for (int shift = 24; shift >= 0; shift -= 8) buf[size++] = (byte) (v >>> shift);
            return this;
        }

        Writer i64(long v) {
            i32((int) (v >>> 32));
            return i32((int) v);
        }

        Writer f32(float v) {
            return i32(Float.floatToIntBits(v));
        }

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

        Writer shorts(short[] a) {
            for (short s : a) u16(s);
            return this;
        }

        private void ensure(int n) {
            if (size + n > buf.length) buf = Arrays.copyOf(buf, Math.max(buf.length * 2, size + n));
        }
    }

    static final class Reader {
        private final byte[] buf;
        private final int end;
        private int pos;

        Reader(byte[] buf, int start, int end) {
            this.buf = buf;
            this.pos = start;
            this.end = end;
        }

        int position() {
            return pos;
        }

        int remaining() {
            return end - pos;
        }

        private void need(int n) {
            if (n < 0 || pos + n > end) {
                throw new ProfileFormatException("truncated at byte " + pos);
            }
        }

        int u8() {
            need(1);
            return buf[pos++] & 0xff;
        }

        int u16() {
            need(2);
            int v = ((buf[pos] & 0xff) << 8) | (buf[pos + 1] & 0xff);
            pos += 2;
            return v;
        }

        int i32() {
            need(4);
            int v = 0;
            for (int i = 0; i < 4; i++) v = (v << 8) | (buf[pos++] & 0xff);
            return v;
        }

        long i64() {
            long hi = i32() & 0xffffffffL;
            long lo = i32() & 0xffffffffL;
            return (hi << 32) | lo;
        }

        float f32() {
            return Float.intBitsToFloat(i32());
        }

        /** Reads a float array written by {@link Writer#floats}; its length must be {@code expected}. */
        void floats(float[] into, String what) {
            int n = u8();
            if (n != into.length) {
                throw new ProfileFormatException(what + " has " + n + " values, expected " + into.length);
            }
            for (int i = 0; i < n; i++) into[i] = count(f32(), what);
        }

        String str() {
            int n = u8();
            need(2 * n);
            StringBuilder b = new StringBuilder(n);
            for (int i = 0; i < n; i++) b.append((char) u16());
            return b.toString();
        }

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
