package hadur2.core.replay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

/** The recorded battles under src/test/resources/replay, one per reference opponent. */
public final class Fixtures {

    public static final Path DIR = Path.of("src/test/resources/replay");

    private Fixtures() {}

    public static List<Path> all() {
        try (Stream<Path> files = Files.list(DIR)) {
            return files.filter(p -> p.toString().endsWith(".txt.gz")).sorted().toList();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static List<String> lines(Path fixture) {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(
                new GZIPInputStream(Files.newInputStream(fixture)), StandardCharsets.UTF_8))) {
            return r.lines().toList();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** "abc.Shadow_3.83c.txt.gz" -> "abc.Shadow_3.83c". */
    public static String opponent(Path fixture) {
        return fixture.getFileName().toString().replace(".txt.gz", "");
    }
}
