import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.ProfileLibrary;
import hadur2.core.port.ProfileStore;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Builds the data directory a 3.2 jar would have after N battles against N distinct
 * opponents, using 3.2's own ProfileLibrary (on the classpath from the release jar):
 * each "battle" loads a stranger, fills its seeds, and saves it in full, under a
 * 200,000-byte quota (Robocode's default), so the eviction dynamics are the real ones.
 *
 * Usage: java -cp hadur2.Hadur_3.2.jar Prefill.java DIR N
 */
public class Prefill {
    static final class DirStore implements ProfileStore {
        final File dir;
        DirStore(File dir) { this.dir = dir; dir.mkdirs(); }
        public byte[] read(String name) {
            try {
                File f = new File(dir, name);
                return f.isFile() ? Files.readAllBytes(f.toPath()) : null;
            } catch (IOException e) { throw new RuntimeException(e); }
        }
        public void write(String name, byte[] bytes) {
            try { Files.write(new File(dir, name).toPath(), bytes); } catch (IOException e) { throw new RuntimeException(e); }
        }
        public void delete(String name) { new File(dir, name).delete(); }
        public List<String> names() {
            List<String> out = new ArrayList<>();
            String[] n = dir.list();
            if (n != null) for (String s : n) if (new File(dir, s).isFile()) out.add(s);
            return out;
        }
        public long bytesUsed() {
            long t = 0;
            File[] fs = dir.listFiles();
            if (fs != null) for (File f : fs) if (f.isFile()) t += f.length();
            return t;
        }
        public long quota() { return 200_000L; }
    }

    public static void main(String[] args) throws Exception {
        Path dir = Path.of(args[0]);
        int n = Integer.parseInt(args[1]);
        Random rnd = new Random(42);
        DirStore store = new DirStore(dir.toFile());
        for (int i = 1; i <= n; i++) {
            ProfileLibrary lib = new ProfileLibrary(store);
            lib.prepare();
            ProfileLibrary.Loaded loaded = lib.load("prefill.Bot" + i + " 1.0");
            OpponentProfile p = loaded.profile();
            for (int g = 0; g < OpponentProfile.MAX_GUN_SEED; g++) p.addGunSample(sample(rnd));
            for (int s = 0; s < OpponentProfile.MAX_SURF_SEED; s++) p.addSurfSample(sample(rnd));
            ProfileLibrary.Saved saved = lib.save(p);
            if (i % 50 == 0 || i == n) {
                System.out.printf("%d: %s, files=%d, bytes=%d, evicted=%d, note=%s%n", i, saved,
                    store.names().size(), store.bytesUsed(), lib.seedsEvicted(), lib.lastNote());
            }
        }
    }

    static short[] sample(Random rnd) {
        short[] s = new short[OpponentProfile.SAMPLE_WIDTH];
        for (int i = 0; i < s.length; i++) s[i] = (short) rnd.nextInt(2000);
        return s;
    }
}
