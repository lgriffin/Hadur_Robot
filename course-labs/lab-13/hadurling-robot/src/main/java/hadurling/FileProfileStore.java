package hadurling;

import hadurling.core.port.ProfileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import robocode.AdvancedRobot;
import robocode.RobocodeFileOutputStream;

/**
 * The {@link ProfileStore} on Robocode's data directory. Robocode lets a robot write only
 * through {@link RobocodeFileOutputStream}, only inside its own data directory, and only up to
 * its data quota; it forbids renaming files. This adapter only moves bytes: the core's
 * {@code ProfileLibrary} does the checksums and the crash-safe order of writes.
 *
 * <p>Robocode's quota counts bytes written, not bytes on disk: opening a file for writing
 * gives back its old length, but deleting it gives back nothing. A deleted file's bytes would
 * stay charged for the rest of the battle. So {@link #delete} first empties the file through
 * the stream, which returns its length, and then deletes it.</p>
 *
 * <p>{@link #names}, {@link #size} and {@link #lastModified} ask the disk every time they are
 * called. That is fine for a store that is asked rarely, which is why the core's
 * {@code ProfileLibrary} keeps its own index and lists this store once per battle (HL-40).
 * {@link #listings()} counts the directory scans so a test can check that.</p>
 *
 * <p>Failures surface as unchecked exceptions; the library turns any of them into a counted
 * load or save failure, so a broken data directory costs memory, never the robot.</p>
 */
final class FileProfileStore implements ProfileStore {

    /** Opens a file for writing; the robot uses Robocode's stream, tests a plain one. */
    interface Opener {
        OutputStream open(File file) throws IOException;
    }

    private final File dir;
    private final long quota;
    private final Opener opener;
    private int listings;

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

    /**
     * The store for a running robot: its data directory and its whole data quota.
     *
     * @param robot the running robot
     * @return the store
     */
    static FileProfileStore forRobot(AdvancedRobot robot) {
        File dir = robot.getDataDirectory();
        // Robocode reports what is left, not the total; the store wants the total, so add
        // back what is already on disk.
        long used = 0;
        File[] files = dir == null ? null : dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) used += f.length();
            }
        }
        return new FileProfileStore(dir, used + robot.getDataQuotaAvailable(), RobocodeFileOutputStream::new);
    }

    @Override
    public byte[] read(String name) {
        File f = file(name);
        if (!f.isFile()) return null;
        try (InputStream in = new FileInputStream(f)) {
            // InputStream.read may return fewer bytes than asked, so read until full or ended.
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
     * the library writes a temporary copy first.
     */
    @Override
    public void write(String name, byte[] bytes) {
        try (OutputStream out = opener.open(file(name))) {
            out.write(bytes);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** Empties the file through the opener, to get its length back from the quota, then deletes it. */
    @Override
    public void delete(String name) {
        File f = file(name);
        if (!f.exists()) return;
        try (OutputStream out = opener.open(f)) {
            out.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        if (!f.delete()) throw new IllegalStateException("could not delete " + name);
    }

    /** @return how many times the data directory has been listed by {@link #names()} */
    int listings() {
        return listings;
    }

    /** Lists the data directory. */
    @Override
    public List<String> names() {
        listings++;
        List<String> out = new ArrayList<>();
        File[] files = dir == null ? null : dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) out.add(f.getName());
            }
        }
        out.sort(null);
        return out;
    }

    @Override
    public long size(String name) {
        File f = file(name);
        return f.isFile() ? f.length() : 0;
    }

    @Override
    public long lastModified(String name) {
        File f = file(name);
        return f.isFile() ? f.lastModified() : 0;
    }

    @Override
    public long quota() {
        return quota;
    }

    /** Names come from the core, but a path must never leave the data directory (HL-22). */
    private File file(String name) {
        if (name.isEmpty() || name.contains("/") || name.contains("\\") || name.startsWith(".")) {
            throw new IllegalArgumentException("bad store name " + name);
        }
        return new File(dir, name);
    }
}
