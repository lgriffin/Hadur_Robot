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
 */
final class FileProfileStore implements ProfileStore {

    /** Opens a file for writing; the robot uses Robocode's stream, tests a plain one. */
    interface Opener {
        OutputStream open(File file) throws IOException;
    }

    private final File dir;
    private final long quota;
    private final Opener opener;

    FileProfileStore(File dir, long quota, Opener opener) {
        this.dir = dir;
        this.quota = quota;
        this.opener = opener;
    }

    /** The store for a running robot: its data directory and its whole data quota. */
    static FileProfileStore forRobot(AdvancedRobot robot) {
        File dir = robot.getDataDirectory();
        long used = sizeOf(dir);
        return new FileProfileStore(dir, used + robot.getDataQuotaAvailable(),
            RobocodeFileOutputStream::new);
    }

    @Override
    public byte[] read(String name) {
        File f = file(name);
        if (!f.isFile()) return null;
        try (InputStream in = new FileInputStream(f)) {
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

    @Override
    public void write(String name, byte[] bytes) {
        try (OutputStream out = opener.open(file(name))) {
            out.write(bytes);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void delete(String name) {
        File f = file(name);
        if (!f.exists()) return;
        // Empty it first: Robocode refunds a file's length when it is opened for writing.
        try (OutputStream out = opener.open(f)) {
            out.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        if (!f.delete()) throw new IllegalStateException("could not delete " + name);
    }

    @Override
    public List<String> names() {
        String[] names = dir.list();
        List<String> out = new ArrayList<>();
        if (names == null) return out;
        for (String n : names) {
            if (new File(dir, n).isFile()) out.add(n);
        }
        return out;
    }

    @Override
    public long bytesUsed() {
        return sizeOf(dir);
    }

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

    private static long sizeOf(File dir) {
        File[] files = dir == null ? null : dir.listFiles();
        long total = 0;
        if (files != null) {
            for (File f : files) if (f.isFile()) total += f.length();
        }
        return total;
    }
}
