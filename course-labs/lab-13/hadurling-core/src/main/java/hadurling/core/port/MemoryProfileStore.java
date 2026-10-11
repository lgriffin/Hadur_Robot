package hadurling.core.port;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * A {@link ProfileStore} held in memory, for tests and the bench. It enforces its quota the
 * way Robocode does (a write that would pass it fails, and changes nothing) and can simulate a
 * robot killed in the middle of a write, so that crash-safety can be tested without files.
 *
 * <p>Entries are kept in a sorted map and every read and write copies the bytes, so the
 * listing order is stable and no caller can change stored bytes behind the store's back. It
 * is plain Java with no I/O, so it may live in the core.</p>
 */
public final class MemoryProfileStore implements ProfileStore {

    /** Thrown by a write that {@link #crashOnWrite} cut short. */
    public static final class Crash extends RuntimeException {
        private static final long serialVersionUID = 1L;

        /**
         * A simulated crash.
         *
         * @param message what was cut short, for test failure messages
         */
        public Crash(String message) {
            super(message);
        }
    }

    private final Map<String, byte[]> entries = new TreeMap<>();
    /** The write number each entry was last written at, standing in for a modification time. */
    private final Map<String, Long> written = new TreeMap<>();
    private final long quota;
    private long writes;
    private int listings;
    private long crashAt = -1;
    private int crashKeep;

    /**
     * An empty store.
     *
     * @param quota the most bytes it may hold, as Robocode's data quota
     */
    public MemoryProfileStore(long quota) {
        this.quota = quota;
    }

    /**
     * Arms a crash: the {@code nth} write from now keeps only its first {@code keepBytes}
     * bytes and then throws {@link Crash}, as if the JVM had died there. One-shot.
     *
     * @param nth which write from now, 1 for the next one
     * @param keepBytes how many leading bytes of that write reach the store
     * @return this store
     */
    public MemoryProfileStore crashOnWrite(int nth, int keepBytes) {
        this.crashAt = writes + nth;
        this.crashKeep = keepBytes;
        return this;
    }

    /** @return how many writes have been attempted, including refused and crashed ones */
    public long writes() {
        return writes;
    }

    @Override
    public byte[] read(String name) {
        byte[] b = entries.get(name);
        return b == null ? null : b.clone();
    }

    @Override
    public void write(String name, byte[] bytes) {
        writes++;
        byte[] old = entries.get(name);
        long after = bytesUsed() - (old == null ? 0 : old.length) + bytes.length;
        if (after > quota) throw new IllegalStateException("quota exceeded writing " + name);
        if (writes == crashAt) {
            // A torn write: the entry is left holding only a prefix of the new bytes, which
            // is what a robot killed part way through a stream leaves on disk.
            int keep = Math.min(crashKeep, bytes.length);
            entries.put(name, Arrays.copyOf(bytes, keep));
            written.put(name, writes);
            throw new Crash("killed after " + keep + " bytes of " + name);
        }
        entries.put(name, bytes.clone());
        written.put(name, writes);
    }

    @Override
    public void delete(String name) {
        entries.remove(name);
        written.remove(name);
    }

    @Override
    public List<String> names() {
        listings++;
        return new ArrayList<>(entries.keySet());
    }

    /**
     * @return how many times {@link #names()} has been called. A real store pays for each
     *     listing with a pass over its directory; a test that counts them can say how often
     *     the library asks.
     */
    public int listings() {
        return listings;
    }

    @Override
    public long size(String name) {
        byte[] b = entries.get(name);
        return b == null ? 0 : b.length;
    }

    @Override
    public long lastModified(String name) {
        return written.getOrDefault(name, 0L);
    }

    @Override
    public long quota() {
        return quota;
    }

    /** @return the bytes held by all entries together */
    public long bytesUsed() {
        long total = 0;
        for (byte[] b : entries.values()) total += b.length;
        return total;
    }
}
