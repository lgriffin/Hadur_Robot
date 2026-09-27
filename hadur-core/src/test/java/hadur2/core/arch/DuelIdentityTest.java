package hadur2.core.arch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The melee extension's "1v1 is sacred" rule, as a build check: the duel's packages are
 * pinned by a hash of every source file in them, taken at M0. The melee work adds packages
 * and routes around the duel; it never edits it. The replay fixtures pin the rest of the
 * duel (the orchestrator's routing) tick for tick (CORE-2).
 *
 * <p>Sources rather than class files are hashed, since class bytes change with the JDK
 * that compiles them. Line endings are normalised. When a duel change is intended, a
 * duel stage (not a melee one) re-pins the snapshot by running this test with
 * {@code -Dhadur.duel.snapshot=write}.</p>
 */
class DuelIdentityTest {

    /** Everything the duel is made of, below {@code hadur2.core}. */
    static final List<String> DUEL_PACKAGES = List.of(
        "adapt", "gun", "knn", "ledger", "memory", "move", "physics", "policy", "shield");

    static final String SNAPSHOT = "duel-sources.sha256";

    @Test
    @DisplayName("the duel's packages are unchanged since the M0 snapshot")
    void duelSourcesUnchanged() throws IOException {
        Path root = sourceRoot();
        Map<String, String> now = hashes(root);
        Path snapshot = snapshotFile();
        if ("write".equals(System.getProperty("hadur.duel.snapshot"))) {
            StringBuilder b = new StringBuilder();
            now.forEach((file, hash) -> b.append(hash).append("  ").append(file).append('\n'));
            Files.writeString(snapshot, b, StandardCharsets.UTF_8);
        }
        Map<String, String> pinned = read(snapshot);
        List<String> changed = new ArrayList<>();
        for (String file : pinned.keySet()) {
            if (!now.containsKey(file)) changed.add("removed " + file);
            else if (!now.get(file).equals(pinned.get(file))) changed.add("edited " + file);
        }
        for (String file : now.keySet()) {
            if (!pinned.containsKey(file)) changed.add("added " + file);
        }
        assertTrue(changed.isEmpty(), "The duel changed: " + changed);
        assertEquals(pinned.size(), now.size());
    }

    static Map<String, String> hashes(Path root) throws IOException {
        Map<String, String> out = new TreeMap<>();
        for (String pkg : DUEL_PACKAGES) {
            Path dir = root.resolve("hadur2/core").resolve(pkg);
            try (Stream<Path> files = Files.walk(dir)) {
                for (Path f : (Iterable<Path>) files::iterator) {
                    if (!f.toString().endsWith(".java")) continue;
                    String rel = root.relativize(f).toString().replace('\\', '/');
                    out.put(rel, sha256(Files.readString(f, StandardCharsets.UTF_8)
                        .replace("\r\n", "\n")));
                }
            }
        }
        return out;
    }

    static Map<String, String> read(Path snapshot) throws IOException {
        Map<String, String> out = new TreeMap<>();
        for (String line : Files.readAllLines(snapshot, StandardCharsets.UTF_8)) {
            if (line.isBlank()) continue;
            String[] parts = line.split("  ", 2);
            out.put(parts[1], parts[0]);
        }
        return out;
    }

    static String sha256(String s) {
        try {
            byte[] d = MessageDigest.getInstance("SHA-256").digest(s.getBytes(StandardCharsets.UTF_8));
            StringBuilder b = new StringBuilder();
            for (byte x : d) b.append(String.format("%02x", x));
            return b.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    static Path moduleDir() {
        for (Path p = Path.of("").toAbsolutePath(); p != null; p = p.getParent()) {
            if (Files.isDirectory(p.resolve("src/main/java/hadur2/core"))) return p;
            if (Files.isDirectory(p.resolve("hadur-core/src/main/java/hadur2/core"))) {
                return p.resolve("hadur-core");
            }
        }
        throw new UncheckedIOException(new IOException("hadur-core sources not found"));
    }

    static Path sourceRoot() {
        return moduleDir().resolve("src/main/java");
    }

    static Path snapshotFile() {
        return moduleDir().resolve("src/test/resources").resolve(SNAPSHOT);
    }
}
