package hadur2.core.port;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * A {@link ProfileStore} held in memory, for tests and the bench. It enforces its quota
 * the way Robocode does (a write that would pass it fails) and can simulate a robot
 * killed in the middle of a write, so the core's crash-safety (RES-3) can be tested
 * without files.
 *
 * <p>Quota accounting: replacing an entry counts only the difference in size, as opening
 * a Robocode data file for writing refunds its old length. A delete here frees the entry's
 * bytes; in Robocode a delete refunds nothing, which is why the robot's
 * {@code FileProfileStore} empties a file before deleting it, giving the same net effect.
 * A write refused for quota leaves the store unchanged.</p>
 *
 * <p>Entries are kept in a sorted map and every read and write copies the bytes, so the
 * listing order is stable (CORE-2) and no caller can change stored bytes behind the
 * store's back. Plain Java, with no I/O (RES-6), so it may live in the core.</p>
 */
public final class MemoryProfileStore implements ProfileStore {

    /** Thrown by a write that {@link #crashAfter} cut short. */
    public static final class Crash extends RuntimeException {
        /**
         * A simulated crash.
         *
         * @param message what was cut short, for test failure messages
         */
        public Crash(String message) {
            super(message);
        }
    }

    /** Entry bytes by name, sorted by name so {@link #names()} is deterministic. */
    private final Map<String, byte[]> entries = new TreeMap<>();
    /** The most bytes the entries may hold together. */
    private final long quota;
    /** Bytes the next write keeps before it "crashes"; -1 when no crash is armed. */
    private int crashAfterBytes = -1;
    /** Writes attempted so far, including refused and crashed ones. */
    private int writes;
    /** MEM-13: each entry's write sequence number, standing in for a file's modification time. */
    private final Map<String, Long> written = new TreeMap<>();

    /**
     * An empty store.
     *
     * @param quota the most bytes it may hold, as Robocode's data quota
     */
    public MemoryProfileStore(long quota) {
        this.quota = quota;
    }

    /**
     * Makes the next write keep only its first {@code bytes} bytes and then throw
     * {@link Crash}, as if the JVM died there. Later writes behave normally. Tests use
     * {@link #writes()} to arm it before a chosen write, and so cut every write of a save
     * at every byte (RES-3).
     *
     * @param bytes how many leading bytes of the next write to keep
     * @return this store
     */
    public MemoryProfileStore crashAfter(int bytes) {
        this.crashAfterBytes = bytes;
        return this;
    }

    /** How many writes have been attempted, including ones refused or cut short. */
    public int writes() {
        return writes;
    }

    /** A copy of the entry's bytes, or {@code null} when there is none. */
    @Override
    public byte[] read(String name) {
        byte[] b = entries.get(name);
        return b == null ? null : b.clone();
    }

    /**
     * Replaces the entry with a copy of {@code bytes}. Throws {@link IllegalStateException},
     * changing nothing, if the store would pass its quota; throws {@link Crash} after keeping
     * a prefix if {@link #crashAfter} armed it.
     */
    @Override
    public void write(String name, byte[] bytes) {
        writes++;
        // The quota is checked with the entry's old size refunded, as Robocode refunds a
        // file's old length when it is opened for writing.
        byte[] old = entries.get(name);
        long after = bytesUsed() - (old == null ? 0 : old.length) + bytes.length;
        if (after > quota) {
            throw new IllegalStateException("quota exceeded writing " + name);
        }
        if (crashAfterBytes >= 0) {
            // A torn write: the entry is left holding only a prefix of the new bytes, which
            // is what a robot killed part way through a stream leaves on disk. The crash is
            // one-shot.
            int keep = Math.min(crashAfterBytes, bytes.length);
            crashAfterBytes = -1;
            entries.put(name, Arrays.copyOf(bytes, keep));
            written.put(name, (long) writes);
            throw new Crash("killed after " + keep + " bytes of " + name);
        }
        entries.put(name, bytes.clone());
        written.put(name, (long) writes);
    }

    /** Removes the entry and frees its bytes; does nothing when there is none. */
    @Override
    public void delete(String name) {
        entries.remove(name);
        written.remove(name);
    }

    /** Every entry name, in sorted order, as a new list. */
    @Override
    public List<String> names() {
        return new ArrayList<>(entries.keySet());
    }

    /** Bytes held by all entries together, summed on each call. */
    @Override
    public long bytesUsed() {
        long total = 0;
        for (byte[] b : entries.values()) total += b.length;
        return total;
    }

    /** The entry's length, without copying it. */
    @Override
    public long size(String name) {
        byte[] b = entries.get(name);
        return b == null ? 0 : b.length;
    }

    /** The number of the write that last replaced the entry; 0 when there is none. */
    @Override
    public long lastModified(String name) {
        return written.getOrDefault(name, 0L);
    }

    /**
     * Test support: makes {@code name} look written at {@code sequence}, as if its file's
     * modification time were set back, so MEM-13's order can be arranged directly.
     *
     * @param name an existing entry
     * @param sequence the write number it should appear to have
     */
    public void touch(String name, long sequence) {
        if (entries.containsKey(name)) written.put(name, sequence);
    }

    /** The quota given at construction. */
    @Override
    public long quota() {
        return quota;
    }
}
