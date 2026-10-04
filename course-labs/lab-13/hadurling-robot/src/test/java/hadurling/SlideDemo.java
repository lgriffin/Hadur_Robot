package hadurling;

import hadurling.core.memory.Profile;
import hadurling.core.memory.ProfileCodec;
import hadurling.core.memory.ProfileLibrary;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.List;

/**
 * Reproduces "the slide" in miniature, by hand. It is not a test (its name does not end in
 * Test), so {@code mvn verify} does not run it.
 *
 * <p>It saves one profile per opponent into a real folder, 100 at a time, up to a count you
 * choose, and prints how long each hundred took, twice: once with the room check lab 10 to
 * lab 12 used (list the folder and ask every file's size on every save, copied below), and
 * once with the library as it is now (one listing per battle, then an index). The first column
 * grows with the folder; the second does not.</p>
 *
 * <pre>
 * mvn -B -q test-compile dependency:build-classpath -pl hadurling-robot -am -Dmdep.outputFile=target/cp.txt
 * cd hadurling-robot
 * java -cp target/classes:target/test-classes:$(cat target/cp.txt) hadurling.SlideDemo 1500
 * </pre>
 */
public final class SlideDemo {

    private SlideDemo() {}

    private static Profile profile(String key) {
        return new Profile(key, 1, 4, 1, 8, 2, List.of(new float[] {0.1f, 0.2f, 0.3f}));
    }

    /** The old way: list the folder and add up every file's size before each write. */
    private static void naiveSave(FileProfileStore store, Profile p) {
        byte[] bytes = ProfileCodec.encode(p);
        String file = ProfileCodecNames.file(p.key());
        long used = 0;
        for (String name : store.names()) used += store.size(name);
        if (used + 2L * bytes.length > store.quota()) throw new IllegalStateException("full");
        store.write(file + ".tmp", bytes);
        store.write(file, bytes);
        store.delete(file + ".tmp");
    }

    /**
     * Runs the demo.
     *
     * @param args the number of profiles to save (default 1000)
     * @throws Exception if the temporary folders cannot be made
     */
    public static void main(String[] args) throws Exception {
        int total = args.length > 0 ? Integer.parseInt(args[0]) : 1000;
        File oldDir = Files.createTempDirectory("slide-old").toFile();
        File newDir = Files.createTempDirectory("slide-new").toFile();
        FileProfileStore oldStore = new FileProfileStore(oldDir, 1L << 40, FileOutputStream::new);
        FileProfileStore newStore = new FileProfileStore(newDir, 1L << 40, FileOutputStream::new);
        ProfileLibrary library = new ProfileLibrary(newStore);
        System.out.println("profiles | ms per 100 saves, list every time | ms per 100 saves, indexed");
        long oldNanos = 0;
        long newNanos = 0;
        for (int i = 1; i <= total; i++) {
            Profile p = profile("bot.Opponent" + i);
            long t0 = System.nanoTime();
            naiveSave(oldStore, p);
            long t1 = System.nanoTime();
            library.save(p);
            long t2 = System.nanoTime();
            oldNanos += t1 - t0;
            newNanos += t2 - t1;
            if (i % 100 == 0) {
                System.out.printf(java.util.Locale.ROOT, "%8d | %34.1f | %27.1f%n", i, oldNanos / 1e6, newNanos / 1e6);
                oldNanos = 0;
                newNanos = 0;
            }
        }
        System.out.println("directory scans: list every time " + oldStore.listings() + ", indexed " + newStore.listings());
        System.out.println("(both folders are left in the temp directory: " + oldDir + " and " + newDir + ")");
    }
}
