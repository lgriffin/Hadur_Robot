package hadur.bench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/** One entry of {@code reference-set.txt}. */
public final class Opponent {

    public final String name;
    public final String role;
    /** Jar in opponents/, or null for a bundled sample bot. */
    public final String jar;
    /**
     * BENCH-1: this opponent's share of the rumble population it stands in for, used to
     * weight it into a stratified APS estimate. 0 when the set carries no weight column
     * (every opponent then counts equally, as before).
     */
    public final double weight;

    Opponent(String name, String role, String jar, double weight) {
        this.name = name;
        this.role = role;
        this.jar = jar;
        this.weight = weight;
    }

    static List<Opponent> load(Path file) throws IOException {
        List<Opponent> list = new ArrayList<>();
        for (String line : Files.readAllLines(file)) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] f = line.split("\\|");
            String jar = f.length > 2 ? f[2].trim() : "-";
            double weight = f.length > 3 && !f[3].trim().isEmpty() ? Double.parseDouble(f[3].trim()) : 0;
            list.add(new Opponent(f[0].trim(), f.length > 1 ? f[1].trim() : "",
                jar.equals("-") ? null : jar, weight));
        }
        return list;
    }

    String slug() {
        return name.replaceAll("[^A-Za-z0-9.]+", "_");
    }
}
