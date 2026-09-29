package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * BENCH-4: a file of rumble-client conditions, one bench pass per line.
 *
 * <p>Format: {@code label | key=value key=value ...}, blank lines and {@code #} comments
 * ignored. Keys, all optional:</p>
 * <ul>
 * <li>{@code data=shared}: never wipe the robot data directory during the pass (the rumble
 *     client's reality), instead of the bench's usual per-seed or per-opponent wipe.</li>
 * <li>{@code data=prefill:DIR}: copy DIR's contents into
 *     {@code robots/.data/hadur2/Hadur.data/} once before the pass, then never wipe.</li>
 * <li>{@code cpu=NANOS}: write {@code robocode.cpu.constant} before the pass.</li>
 * <li>{@code load=N}: run N CPU-bound threads alongside the battles.</li>
 * <li>{@code engine=VERSION}: use the Robocode jars under {@code engines/VERSION/} instead
 *     of the default engine; the condition is skipped, not failed, when that directory is
 *     not present locally.</li>
 * <li>{@code java=DIR}: run the battle's child JVM from this JDK home instead of the one
 *     running the bench; skipped, not failed, when {@code DIR/bin/java} is not present.</li>
 * </ul>
 */
final class ClientConditions {

    record Condition(String label, String data, Long cpuNanos, int load, String engine, String javaHome) {

        /** True for both {@code data=shared} and {@code data=prefill:DIR}: never wipe mid-pass. */
        boolean neverWipe() {
            return data != null;
        }

        /** The directory to prefill from, or null for a plain {@code data=shared}. */
        String prefillDir() {
            return data != null && data.startsWith("prefill:") ? data.substring("prefill:".length()) : null;
        }
    }

    private ClientConditions() {}

    static List<Condition> parse(Path file) throws IOException {
        List<Condition> conditions = new ArrayList<>();
        for (String raw : Files.readAllLines(file)) {
            String line = raw.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] parts = line.split("\\|", 2);
            String label = parts[0].trim();
            Map<String, String> kv = new LinkedHashMap<>();
            if (parts.length > 1) {
                for (String tok : parts[1].trim().split("\\s+")) {
                    String[] pair = tok.split("=", 2);
                    if (pair.length == 2) kv.put(pair[0], pair[1]);
                }
            }
            conditions.add(new Condition(label, kv.get("data"),
                kv.containsKey("cpu") ? Long.parseLong(kv.get("cpu")) : null,
                kv.containsKey("load") ? Integer.parseInt(kv.get("load")) : 0,
                kv.get("engine"), kv.get("java")));
        }
        return conditions;
    }
}
