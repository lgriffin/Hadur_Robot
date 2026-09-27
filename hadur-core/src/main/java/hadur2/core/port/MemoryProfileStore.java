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
 */
public final class MemoryProfileStore implements ProfileStore {

    /** Thrown by a write that {@link #crashAfter} cut short. */
    public static final class Crash extends RuntimeException {
        public Crash(String message) {
            super(message);
        }
    }

    private final Map<String, byte[]> entries = new TreeMap<>();
    private final long quota;
    private int crashAfterBytes = -1;
    private int writes;

    public MemoryProfileStore(long quota) {
        this.quota = quota;
    }

    /**
     * Makes the next write keep only its first {@code bytes} bytes and then throw
     * {@link Crash}, as if the JVM died there. Later writes behave normally.
     */
    public MemoryProfileStore crashAfter(int bytes) {
        this.crashAfterBytes = bytes;
        return this;
    }

    /** How many writes have been attempted. */
    public int writes() {
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
        if (after > quota) {
            throw new IllegalStateException("quota exceeded writing " + name);
        }
        if (crashAfterBytes >= 0) {
            int keep = Math.min(crashAfterBytes, bytes.length);
            crashAfterBytes = -1;
            entries.put(name, Arrays.copyOf(bytes, keep));
            throw new Crash("killed after " + keep + " bytes of " + name);
        }
        entries.put(name, bytes.clone());
    }

    @Override
    public void delete(String name) {
        entries.remove(name);
    }

    @Override
    public List<String> names() {
        return new ArrayList<>(entries.keySet());
    }

    @Override
    public long bytesUsed() {
        long total = 0;
        for (byte[] b : entries.values()) total += b.length;
        return total;
    }

    @Override
    public long quota() {
        return quota;
    }
}
