package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
 * <li>{@code repeat=N}: BENCH-77, fight the list N times over in the one engine (default 1),
 *     so a short set makes a session as long as a client's.</li>
 * <li>{@code shuffle=SEED}: BENCH-77, fight the repeated list in an order shuffled with this
 *     seed rather than in list order; the robot and its control get the same order.</li>
 * </ul>
 */
record SessionFile(String opponents, String heap, boolean fresh, boolean wipe, int rounds,
                   String control, String controlJar, int repeat, Long shuffle) {

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
            kv.get("control"), kv.get("control-jar"),
            Integer.parseInt(kv.getOrDefault("repeat", "1")),
            kv.containsKey("shuffle") ? Long.valueOf(kv.get("shuffle")) : null);
    }

    SessionFile {
        if (repeat < 1) throw new IllegalArgumentException("repeat must be at least 1, was " + repeat);
    }

    /** BENCH-77: the order the session fights {@code opponents} in: repeated, then shuffled when asked. */
    <T> List<T> order(List<T> opponents) {
        List<T> all = new ArrayList<>(opponents.size() * repeat);
        for (int i = 0; i < repeat; i++) all.addAll(opponents);
        if (shuffle != null) Collections.shuffle(all, new Random(shuffle));
        return all;
    }

    /** The JVM flag for the heap cap, or null for none. */
    String heapFlag() {
        return heap.equals("none") ? null : "-Xmx" + heap;
    }
}
