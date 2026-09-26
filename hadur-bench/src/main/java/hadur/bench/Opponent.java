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

    Opponent(String name, String role, String jar) {
        this.name = name;
        this.role = role;
        this.jar = jar;
    }

    static List<Opponent> load(Path file) throws IOException {
        List<Opponent> list = new ArrayList<>();
        for (String line : Files.readAllLines(file)) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            String[] f = line.split("\\|");
            String jar = f.length > 2 ? f[2].trim() : "-";
            list.add(new Opponent(f[0].trim(), f.length > 1 ? f[1].trim() : "",
                jar.equals("-") ? null : jar));
        }
        return list;
    }

    String slug() {
        return name.replaceAll("[^A-Za-z0-9.]+", "_");
    }
}
