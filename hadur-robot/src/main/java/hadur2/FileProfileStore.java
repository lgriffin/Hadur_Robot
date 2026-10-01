package hadur2;

import hadur2.core.port.ProfileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import robocode.AdvancedRobot;
import robocode.RobocodeFileOutputStream;

/**
 * The {@link ProfileStore} on Robocode's data directory. Robocode lets a robot write only
 * through {@link RobocodeFileOutputStream}, only inside its own data directory, and only
 * up to its data quota; it forbids renaming files. This adapter only moves bytes: the
 * core's {@code ProfileLibrary} does the checksums, the crash-safe write order (RES-3)
 * and eviction (MEM-5).
 *
 * <p>Robocode's quota counts bytes written, not bytes on disk: opening a file for writing
 * gives back its old length, but deleting it gives back nothing. A deleted file's bytes
 * would stay charged for the rest of the battle, and with seeded profiles (about 22 KB,
 * written twice a save) the quota ran out by the tenth round. So {@link #delete} first
 * empties the file through the stream, which returns its length, and then deletes it.</p>
 *
 * <p>MEM-11: the directory is listed once per battle, the first time a name, a size or the
 * total is asked for, into an index of each file's length and modification time. Every
 * later question is answered from the index, and {@link #write} and {@link #delete} keep it
 * current, so a save does work for the files it touches, never for the files on disk. Only
 * this battle's robot writes into its own data directory, so the index cannot go stale.</p>
 *
 * <p>Failures surface as unchecked exceptions ({@code UncheckedIOException},
 * {@code IllegalStateException}, {@code IllegalArgumentException}, or the sandbox's own
 * {@code SecurityException}); the library turns any of them into a counted load or save
 * failure (MEM-4), so a broken data directory costs memory, never the robot.</p>
 */
final class FileProfileStore implements ProfileStore {

    /** Opens a file for writing; the robot uses Robocode's stream, tests a plain one. */
    interface Opener {
        OutputStream open(File file) throws IOException;
    }

    /** The robot's data directory; every entry is a plain file directly inside it. */
    private final File dir;
    /** The most bytes the directory may hold, fixed when the store is made. */
    private final long quota;
    private final Opener opener;
    /** MEM-11: name to {length, modification time}; null until the one listing. */
    private Map<String, long[]> index;
    /** MEM-13: the latest modification time handed out, so later writes always order later. */
    private long clock;

    /**
     * A store over {@code dir}.
     *
     * @param dir the directory; may not exist yet, in which case the store is empty
     * @param quota the most bytes the store may hold
     * @param opener how files are opened for writing
     */
    FileProfileStore(File dir, long quota, Opener opener) {
        this.dir = dir;
        this.quota = quota;
        this.opener = opener;
    }

    /** The store for a running robot: its data directory and its whole data quota. */
    static FileProfileStore forRobot(AdvancedRobot robot) {
        File dir = robot.getDataDirectory();
        // Robocode reports what is left, not the total; the store wants the total, so it
        // adds back what is already on disk. The listing that sums it is MEM-11's one
        // listing: the store keeps it as its index.
        Map<String, long[]> index = list(dir);
        long used = total(index);
        FileProfileStore store = new FileProfileStore(dir, used + robot.getDataQuotaAvailable(),
            RobocodeFileOutputStream::new);
        store.adopt(index);
        return store;
    }

    /** Reads a whole file; reading needs no special stream in Robocode's sandbox. */
    @Override
    public byte[] read(String name) {
        File f = file(name);
        if (!f.isFile()) return null;
        try (InputStream in = new FileInputStream(f)) {
            // Size the buffer from the file's length (capped below the largest array a JVM
            // allows) and read until it is full or the stream ends: InputStream.read may
            // return fewer bytes than asked. A file that shrank meanwhile gives a shorter
            // array, which the library rejects (a profile by its length field, the clock by
            // its size).
            byte[] buf = new byte[(int) Math.min(f.length(), Integer.MAX_VALUE - 8)];
            int n = 0;
            while (n < buf.length) {
                int r = in.read(buf, n, buf.length - n);
                if (r < 0) break;
                n += r;
            }
            return n == buf.length ? buf : Arrays.copyOf(buf, n);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * Replaces a file's content through the opener (Robocode's stream in the robot). If the
     * robot is killed part way, the file may hold any prefix of {@code bytes}, which is why
     * the library writes a temporary copy first (RES-3).
     */
    @Override
    public void write(String name, byte[] bytes) {
        Map<String, long[]> idx = index();
        try (OutputStream out = opener.open(file(name))) {
            out.write(bytes);
        } catch (IOException e) {
            // The write stopped part way: record whatever the file holds now.
            idx.remove(name);
            File f = new File(dir, name);
            if (f.isFile()) idx.put(name, new long[] {f.length(), ++clock});
            throw new UncheckedIOException(e);
        }
        idx.put(name, new long[] {bytes.length, ++clock});
    }

    /** Empties the file through the opener, to get its length back from the quota, then deletes it. */
    @Override
    public void delete(String name) {
        File f = file(name);
        if (!f.exists()) {
            index().remove(name);
            return;
        }
        // Empty it first: Robocode refunds a file's length when it is opened for writing.
        try (OutputStream out = opener.open(f)) {
            out.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        // Emptied, so its bytes are back in the quota even if the delete below fails.
        index().put(name, new long[] {0, ++clock});
        if (!f.delete()) throw new IllegalStateException("could not delete " + name);
        index().remove(name);
    }

    /** The plain files in the data directory, from the index; an absent directory has none. */
    @Override
    public List<String> names() {
        return new ArrayList<>(index().keySet());
    }

    /** The total length of the files in the data directory, from the index. */
    @Override
    public long bytesUsed() {
        return total(index());
    }

    /** A file's length from the index, 0 when there is no such file. */
    @Override
    public long size(String name) {
        long[] e = index().get(name);
        return e == null ? 0 : e[0];
    }

    /** A file's modification time from the index, 0 when there is no such file. */
    @Override
    public long lastModified(String name) {
        long[] e = index().get(name);
        return e == null ? 0 : e[1];
    }

    /** The quota computed when the store was made. */
    @Override
    public long quota() {
        return quota;
    }

    /** Names come from the core, but a path must never leave the data directory. */
    private File file(String name) {
        if (name.isEmpty() || name.contains("/") || name.contains("\\") || name.startsWith(".")) {
            throw new IllegalArgumentException("bad store name " + name);
        }
        return new File(dir, name);
    }

    /** MEM-11: the index, listing the directory the first time it is needed. */
    private Map<String, long[]> index() {
        if (index == null) adopt(list(dir));
        return index;
    }

    /** Takes {@code listing} as the index; later writes are stamped after its newest file. */
    private void adopt(Map<String, long[]> listing) {
        index = listing;
        for (long[] e : listing.values()) clock = Math.max(clock, e[1]);
    }

    /**
     * The one listing: every plain file directly in {@code dir} with its length and
     * modification time, sorted by name; empty when {@code dir} is null or absent.
     */
    private static Map<String, long[]> list(File dir) {
        Map<String, long[]> out = new TreeMap<>();
        File[] files = dir == null ? null : dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) out.put(f.getName(), new long[] {f.length(), f.lastModified()});
            }
        }
        return out;
    }

    /** The total length of the files in {@code index}. */
    private static long total(Map<String, long[]> index) {
        long total = 0;
        for (long[] e : index.values()) total += e[0];
        return total;
    }
}
