package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * BENCH-6: a session file says how a rumble client's session is imitated, one
 * {@code key=value} per line ({@code #} comments and blanks ignored).
 *
 * <ul>
 * <li>{@code opponents=FILE}: the set ({@code name | aps | jar}) fought in list order, once
 *     each, through one engine process. The role column carries the opponent's rumble APS
 *     so the report can split sub-50 bots from the rest.</li>
 * <li>{@code heap=512M} (default) or {@code heap=none}: the child JVM's {@code -Xmx}, the
 *     client's cap, or none.</li>
 * <li>{@code fresh=true}: a fresh JVM per battle (the old bench's way), data directory kept.
 *     Default false: one JVM for the whole session.</li>
 * <li>{@code wipe=true}: delete the robot data directory before every battle. Default false.</li>
 * <li>{@code rounds=N}: rounds per battle, default 35.</li>
 * <li>{@code control=ROBOT}: BENCH-7, run the same session again with this robot, which
 *     cannot be the cause (a sample bot, or an old release); {@code control-jar=JAR}
 *     installs it when it is not a bundled sample.</li>
 * </ul>
 */
record SessionFile(String opponents, String heap, boolean fresh, boolean wipe, int rounds,
                   String control, String controlJar) {

    static SessionFile parse(Path file) throws IOException {
        Map<String, String> kv = new LinkedHashMap<>();
        for (String raw : Files.readAllLines(file)) {
            String line = raw.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] pair = line.split("=", 2);
            if (pair.length == 2) kv.put(pair[0].trim(), pair[1].trim());
        }
        String opponents = kv.get("opponents");
        if (opponents == null) throw new IllegalArgumentException(file + " names no opponents=FILE");
        return new SessionFile(opponents, kv.getOrDefault("heap", "512M"),
            Boolean.parseBoolean(kv.getOrDefault("fresh", "false")),
            Boolean.parseBoolean(kv.getOrDefault("wipe", "false")),
            Integer.parseInt(kv.getOrDefault("rounds", "35")),
            kv.get("control"), kv.get("control-jar"));
    }

    /** The JVM flag for the heap cap, or null for none. */
    String heapFlag() {
        return heap.equals("none") ? null : "-Xmx" + heap;
    }
}
