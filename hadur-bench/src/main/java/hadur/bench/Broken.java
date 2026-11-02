package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * BENCH-169: the robots Robocode 1.11.2 (the rumble's minimum client since 2026-11-01) will not load,
 * listed in {@value #FILE} as {@code name version | mode | reason}. Every battle against one fails, so a
 * card's {@code fails} stop rule halts on them (pc-mimic, issue #570); the bench drops them from a set
 * before it starts, and says which.
 */
final class Broken {

    /** The shared list, beside the sets. */
    static final String FILE = "broken-1.11.2.txt";

    private Broken() {
    }

    /** The names in {@code file}, empty when it is missing. */
    static Set<String> names(Path file) throws IOException {
        Set<String> out = new LinkedHashSet<>();
        if (!Files.isRegularFile(file)) return out;
        for (String line : Files.readAllLines(file)) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String name = line.split("\\|")[0].trim().replaceAll("\\s+", " ");
            if (!name.isEmpty()) out.add(name);
        }
        return out;
    }

    /** Drops the listed robots from {@code opponents}; returns how many it dropped. */
    static int drop(List<Opponent> opponents, Set<String> broken) {
        int before = opponents.size();
        opponents.removeIf(o -> broken.contains(o.name.trim().replaceAll("\\s+", " ")));
        return before - opponents.size();
    }
}
