package hadurling.core.port;

import java.util.List;

/**
 * Where opponent profiles are kept between battles: a flat folder of named byte blobs with a
 * size quota. A <em>port</em>, like {@link Telemetry}: the core says what it needs and the
 * adapter decides what that is. In the robot it is Robocode's data directory; in tests it is
 * a {@link MemoryProfileStore}.
 *
 * <p>The port is deliberately dumb. A write may be cut short (the JVM can be killed in the
 * middle of one), and nothing here checks what the bytes mean: the core's
 * {@code ProfileLibrary} owns the format, the checksums and the order of writes that make a
 * save safe. Any method may throw an unchecked exception when storage fails; the core treats
 * that as a failed load or save, never as fatal.</p>
 */
public interface ProfileStore {

    /**
     * @param name an entry name
     * @return the whole content of {@code name}, or {@code null} when there is no such entry
     */
    byte[] read(String name);

    /**
     * Replaces {@code name} with {@code bytes}, creating it if needed. Not atomic: if the
     * robot dies part way, the entry may hold any prefix of {@code bytes}.
     *
     * @param name an entry name
     * @param bytes the new content
     */
    void write(String name, byte[] bytes);

    /**
     * Removes {@code name}; does nothing when it does not exist.
     *
     * @param name an entry name
     */
    void delete(String name);

    /** @return every entry name, in no particular order */
    List<String> names();

    /**
     * @param name an entry name
     * @return the length of {@code name} in bytes, 0 when it does not exist
     */
    long size(String name);

    /**
     * @param name an entry name
     * @return when {@code name} was last written, as a number that only grows with later
     *     writes; 0 when it does not exist. The library forgets the least recently written
     *     profiles first when it needs room.
     */
    long lastModified(String name);

    /** @return the most bytes the store may hold */
    long quota();
}
