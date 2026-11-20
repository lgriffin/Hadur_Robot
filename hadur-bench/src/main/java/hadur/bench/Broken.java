package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * BENCH-169: the robots an engine will not load, listed as {@code name version | mode | reason}. Every battle
 * against one fails, so a card's {@code fails} stop rule halts on them (pc-mimic, issue #570); the bench drops
 * them from a set before it starts, and says which.
 *
 * <p>BENCH-266: the list follows the engine. On 1.12.0, the live clients' engine and the bench default, it is
 * {@value #FILE_112} (the few robots 1.12.0 rejects, none of them in the live 1v1 rumble); on 1.11.x it is
 * {@value #FILE_1112}, which also holds the robots only 1.12.0 loads.
 */
final class Broken {

    /** The 1.11.x list, beside the sets. */
    static final String FILE_1112 = "broken-1.11.2.txt";

    /** The 1.12.0 list, beside the sets (BENCH-266). */
    static final String FILE_112 = "broken-1.12.0.txt";

    /** The list for the engine the battles run on (Report.ENGINE). */
    static final String FILE = file(Report.ENGINE);

    /** The list for {@code engine}: 1.11.x and older read the 1.11.2 list, anything else the 1.12.0 one. */
    static String file(String engine) {
        return engine.matches("1\\.([0-9]|10|11)(\\..*)?") ? FILE_1112 : FILE_112;
    }

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
