package hadur117;

import hadur117.core.port.ProfileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.zip.CRC32;
import robocode.AdvancedRobot;
import robocode.RobocodeFileOutputStream;
import robocode.TeamRobot;

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
 * <p>MEM-15: in the robot, every size or age the sandbox is asked for costs a permission
 * check that resolves the file's full path, three times over, and on Windows each one walks
 * the path on disk. Listing a full data directory that way (about 400 profiles on a client
 * that has run for days) took over half a second before the first turn, which the engine
 * charged as skipped turns and usually a lost first round. So the robot's store also keeps
 * its index on disk, in {@link #INDEX}, rewritten with every change: a battle starts from the
 * directory's names (one check) and that one file, and lists file by file only when the
 * names on disk are not the ones the index was written for, or the index is damaged.</p>
 *
 * <p>The saved index may overstate a file, never understate it: before a write it records
 * the larger of the file's old and new lengths, and it is rewritten after a write only when
 * the file shrank. If it cannot be saved, it is removed before the write goes ahead, and if
 * it cannot be removed either, the write fails. In a team battle the five members share the
 * directory, each with its own index in memory, so none of them may keep the saved one: the
 * first change any of them makes removes it, and the next battle alone lists the directory
 * and saves it again.</p>
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
    /** MEM-15: the index's own file, kept beside the profiles and never among {@link #names}. */
    static final String INDEX = "store.hx";
    /** MEM-15: whether the index is kept on disk (the robot's store) or only in memory. */
    private final boolean keepIndex;
    /** MEM-15: names in the directory that are not plain files, so the saved index can vouch for them. */
    private final TreeSet<String> others = new TreeSet<>();
    /** MEM-15: the index file's length on disk, charged to the quota like any file. */
    private long indexLength;
    /** MEM-15: whether this battle's index came from {@link #INDEX} rather than a listing. */
    private boolean indexRead;
    /** MEM-15: a store that shares the directory (a team member) removes the saved index before its first change. */
    private boolean dropSaved;
    /** MEM-15: whether a dropping store has removed the saved index yet. */
    private boolean dropped;

    /**
     * A store over {@code dir}.
     *
     * @param dir the directory; may not exist yet, in which case the store is empty
     * @param quota the most bytes the store may hold
     * @param opener how files are opened for writing
     */
    FileProfileStore(File dir, long quota, Opener opener) {
        this(dir, quota, opener, false);
    }

    /**
     * A store over {@code dir} that may keep its index on disk (MEM-15).
     *
     * @param keepIndex true to start from {@link #INDEX} and rewrite it with every change
     */
    FileProfileStore(File dir, long quota, Opener opener, boolean keepIndex) {
        this.dir = dir;
        this.quota = quota;
        this.opener = opener;
        this.keepIndex = keepIndex;
    }

    /** The store for a running robot: its data directory and its whole data quota. */
    static FileProfileStore forRobot(AdvancedRobot robot) {
        File dir = robot.getDataDirectory();
        // Robocode reports what is left, not the total; the store wants the total, so it
        // adds back what is already on disk, from MEM-11's index (MEM-15: read from its
        // file when it is current, so no file is asked its size).
        long available = robot.getDataQuotaAvailable();
        // A team's members share the directory, so none of them may trust or keep the saved index.
        boolean shared = robot instanceof TeamRobot && ((TeamRobot) robot).getTeammates() != null;
        FileProfileStore probe = new FileProfileStore(dir, 0, RobocodeFileOutputStream::new, !shared);
        if (shared) probe.dropsSavedIndex();
        probe.index();
        FileProfileStore store = new FileProfileStore(dir, probe.bytesUsed() + available,
            RobocodeFileOutputStream::new, !shared);
        if (shared) store.dropsSavedIndex();
        store.take(probe);
        return store;
    }

    /** MEM-15: for a store that shares its directory: never read the saved index, and remove it before the first change. */
    FileProfileStore dropsSavedIndex() {
        dropSaved = true;
        return this;
    }

    /** Takes another store's index of the same directory, so it is not built twice. */
    private void take(FileProfileStore other) {
        index = other.index;
        clock = other.clock;
        others.addAll(other.others);
        indexLength = other.indexLength;
        indexRead = other.indexRead;
    }

    /** MEM-15: whether this battle's index came from the index file, with no file listed one by one. */
    boolean indexRead() {
        index();
        return indexRead;
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
        File target = file(name);
        // MEM-15: the saved index records the write before it happens, at the larger of the
        // file's old and new lengths, so a robot killed before or during the write leaves an
        // index that only overstates what is used.
        long[] old = idx.get(name);
        long before = old == null ? 0 : old[0];
        long stamp = ++clock;
        idx.put(name, new long[] {Math.max(before, bytes.length), stamp});
        others.remove(name);
        if (!saveIndex()) {
            if (old == null) idx.remove(name); else idx.put(name, old);
            throw new IllegalStateException("store index could not be saved or removed; " + name + " not written");
        }
        try (OutputStream out = opener.open(target)) {
            out.write(bytes);
        } catch (IOException e) {
            // The write stopped part way: record whatever the file holds now.
            idx.remove(name);
            if (target.isFile()) idx.put(name, new long[] {target.length(), ++clock});
            saveIndex();
            throw new UncheckedIOException(e);
        }
        idx.put(name, new long[] {bytes.length, stamp});
        // Only a file that shrank leaves the saved index overstating it; a failure here keeps that.
        if (bytes.length < before) saveIndex();
    }

    /** Empties the file through the opener, to get its length back from the quota, then deletes it. */
    @Override
    public void delete(String name) {
        File f = file(name);
        if (!f.exists()) {
            if (index().remove(name) != null) saveIndex();
            return;
        }
        // MEM-15: a store sharing the directory removes the saved index before its first change.
        if (dropSaved && !saveIndex()) throw new IllegalStateException("store index could not be removed; " + name + " not deleted");
        // Empty it first: Robocode refunds a file's length when it is opened for writing.
        try (OutputStream out = opener.open(f)) {
            out.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        // Emptied, so its bytes are back in the quota even if the delete below fails.
        index().put(name, new long[] {0, ++clock});
        if (!f.delete()) {
            saveIndex();
            throw new IllegalStateException("could not delete " + name);
        }
        index().remove(name);
        saveIndex();
    }

    /** The plain files in the data directory, from the index; an absent directory has none. */
    @Override
    public List<String> names() {
        return new ArrayList<>(index().keySet());
    }

    /** The total length of the files in the data directory, from the index, the index's own file included. */
    @Override
    public long bytesUsed() {
        return total(index()) + indexLength;
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

    /**
     * MEM-11: the index, built the first time it is needed. MEM-15: from {@link #INDEX} when
     * it was written for exactly the names now in the directory, else by listing every file.
     */
    private Map<String, long[]> index() {
        if (index != null) return index;
        if (keepIndex && !dropSaved && dir != null) {
            String[] names = dir.list();
            if (names == null) {
                adopt(new TreeMap<>());
                return index;
            }
            TreeSet<String> sorted = new TreeSet<>(Arrays.asList(names));
            if (sorted.remove(INDEX)) {
                Map<String, long[]> read = readIndex(sorted);
                if (read != null) {
                    adopt(read);
                    indexRead = true;
                    return index;
                }
            }
        }
        Map<String, long[]> listed = list(dir);
        long[] own = listed.remove(INDEX);
        boolean saves = keepIndex || dropSaved;
        indexLength = saves && own != null ? own[0] : 0;
        if (!saves && own != null) listed.put(INDEX, own);
        if (saves && dir != null) {
            String[] names = dir.list();
            if (names != null) {
                for (String n : names) if (!n.equals(INDEX) && !listed.containsKey(n)) others.add(n);
            }
        }
        adopt(listed);
        return index;
    }

    /**
     * MEM-15: the index file's entries when it is intact and was written for exactly
     * {@code names}; otherwise null. Also records its length and the directory's other names.
     */
    private Map<String, long[]> readIndex(TreeSet<String> names) {
        byte[] b;
        File f = new File(dir, INDEX);
        try (InputStream in = new FileInputStream(f)) {
            b = in.readAllBytes();
        } catch (IOException | RuntimeException e) {
            return null;
        }
        Map<String, long[]> out = decodeIndex(b, names, others);
        if (out == null) {
            others.clear();
            return null;
        }
        indexLength = b.length;
        return out;
    }

    /**
     * MEM-15: the index's bytes. Format: 'H','X', version 1, the count of names, the CRC32
     * of the names (sorted, one per line), the smallest modification time, then for each
     * name in order its length plus one (0 for a name that is not a plain file) and, for a
     * file, its time above the smallest, both as varints; last, the CRC32 of all before it.
     * About 4 bytes a file: under 2 KB for a full directory, against a 200 KB quota.
     */
    static byte[] encodeIndex(Map<String, long[]> files, TreeSet<String> others) {
        TreeSet<String> names = new TreeSet<>(files.keySet());
        names.addAll(others);
        long base = Long.MAX_VALUE;
        for (long[] e : files.values()) base = Math.min(base, e[1]);
        if (files.isEmpty()) base = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write('H');
        out.write('X');
        out.write(1);
        varint(out, names.size());
        int32(out, namesCrc(names));
        varint(out, base);
        for (String n : names) {
            long[] e = files.get(n);
            if (e == null) {
                varint(out, 0);
            } else {
                varint(out, e[0] + 1);
                varint(out, e[1] - base);
            }
        }
        CRC32 crc = new CRC32();
        crc.update(out.toByteArray());
        int32(out, (int) crc.getValue());
        return out.toByteArray();
    }

    /**
     * The entries of an index written for exactly {@code names}, adding the names that are
     * not plain files to {@code others}; null when the bytes are damaged, of another
     * version, or for another set of names.
     */
    static Map<String, long[]> decodeIndex(byte[] b, TreeSet<String> names, TreeSet<String> others) {
        if (b == null || b.length < 3 + 1 + 4 + 1 + 4) return null;
        CRC32 crc = new CRC32();
        crc.update(b, 0, b.length - 4);
        if ((int) crc.getValue() != readInt32(b, b.length - 4)) return null;
        if (b[0] != 'H' || b[1] != 'X' || b[2] != 1) return null;
        int[] at = {3};
        int end = b.length - 4;
        try {
            if (readVarint(b, at, end) != names.size()) return null;
            if (at[0] + 4 > end || readInt32(b, at[0]) != namesCrc(names)) return null;
            at[0] += 4;
            long base = readVarint(b, at, end);
            Map<String, long[]> out = new TreeMap<>();
            List<String> notFiles = new ArrayList<>();
            for (String n : names) {
                long len = readVarint(b, at, end);
                if (len == 0) {
                    notFiles.add(n);
                } else {
                    out.put(n, new long[] {len - 1, base + readVarint(b, at, end)});
                }
            }
            if (at[0] != end) return null;
            others.addAll(notFiles);
            return out;
        } catch (IllegalStateException e) {
            return null;
        }
    }

    /**
     * MEM-15: brings {@link #INDEX} in line with the index in memory: rewrites it, or, for a
     * store sharing the directory, removes it once. When it cannot be rewritten (the quota,
     * the sandbox) it is removed instead, so the next battle lists the directory. Returns
     * false only when a saved index that no longer matches may still be on disk.
     */
    private boolean saveIndex() {
        if (dir == null || index == null) return true;
        if (dropSaved) {
            if (!dropped) dropped = removeIndexFile();
            return dropped;
        }
        if (!keepIndex) return true;
        byte[] bytes = encodeIndex(index, others);
        File f = new File(dir, INDEX);
        try (OutputStream out = opener.open(f)) {
            out.write(bytes);
            indexLength = bytes.length;
            return true;
        } catch (IOException | RuntimeException e) {
            // A file cut part way fails its CRC; one the opener never touched must go.
            return removeIndexFile();
        }
    }

    /**
     * MEM-15: removes {@link #INDEX}: empties it through the opener first (Robocode refunds
     * its length, and an empty index never decodes), then deletes it. True when no index
     * that could be read is left on disk.
     */
    private boolean removeIndexFile() {
        File f = new File(dir, INDEX);
        try {
            if (!f.exists()) {
                indexLength = 0;
                return true;
            }
            try (OutputStream out = opener.open(f)) {
                out.flush();
                indexLength = 0;
            } catch (IOException | RuntimeException e) {
                // Could not empty it: deleting it still keeps a stale index from being read.
            }
            f.delete();
            if (!f.exists()) {
                indexLength = 0;
                return true;
            }
            indexLength = f.isFile() ? f.length() : 0;
            return f.isFile() && f.length() == 0;
        } catch (RuntimeException e) {
            return false;
        }
    }

    private static int namesCrc(TreeSet<String> names) {
        CRC32 crc = new CRC32();
        for (String n : names) {
            crc.update(n.getBytes(StandardCharsets.UTF_8));
            crc.update('\n');
        }
        return (int) crc.getValue();
    }

    private static void varint(ByteArrayOutputStream out, long v) {
        if (v < 0) throw new IllegalArgumentException("negative " + v);
        while ((v & ~0x7FL) != 0) {
            out.write((int) ((v & 0x7F) | 0x80));
            v >>>= 7;
        }
        out.write((int) v);
    }

    private static long readVarint(byte[] b, int[] at, int end) {
        long v = 0;
        for (int shift = 0; shift < 64; shift += 7) {
            if (at[0] >= end) throw new IllegalStateException("short index");
            int x = b[at[0]++] & 0xFF;
            v |= (long) (x & 0x7F) << shift;
            if ((x & 0x80) == 0) return v;
        }
        throw new IllegalStateException("long varint");
    }

    private static void int32(ByteArrayOutputStream out, int v) {
        out.write(v >>> 24);
        out.write(v >>> 16);
        out.write(v >>> 8);
        out.write(v);
    }

    private static int readInt32(byte[] b, int at) {
        return (b[at] & 0xFF) << 24 | (b[at + 1] & 0xFF) << 16 | (b[at + 2] & 0xFF) << 8 | (b[at + 3] & 0xFF);
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
