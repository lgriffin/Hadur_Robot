package hadur2.core.port;

import java.util.List;

/**
 * Where opponent profiles are kept between battles: a flat directory of named byte
 * blobs with a size quota. It is the core's only way to persistent storage: the core
 * itself may do no file I/O (RES-6), so the adapter hands one in. The robot adapter backs it with Robocode's data directory;
 * {@link MemoryProfileStore} backs it with a map for tests and the bench.
 *
 * <p>The port is deliberately dumb. A write may be cut short (the JVM can be killed
 * mid-write), and nothing here checks what the bytes mean: the core's
 * {@code ProfileLibrary} owns the format, the checksums, atomic replacement (RES-3) and
 * eviction (MEM-5). Any method may throw an unchecked exception when storage fails; the
 * core treats that as a failed load or save, never as fatal (MEM-4).</p>
 */
public interface ProfileStore {

    /** The whole content of {@code name}, or {@code null} when there is no such entry. */
    byte[] read(String name);

    /**
     * Replaces {@code name} with {@code bytes}, creating it if needed. Not atomic: if the
     * robot dies part way, the entry may hold any prefix of {@code bytes}.
     */
    void write(String name, byte[] bytes);

    /** Removes {@code name}; does nothing when it does not exist. */
    void delete(String name);

    /** Every entry name, in no particular order. */
    List<String> names();

    /** Bytes held by all entries together. */
    long bytesUsed();

    /** The most bytes the store may hold. */
    long quota();
}
