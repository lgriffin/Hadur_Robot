package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/** BENCH-51: the conditions sidecar and the checksums it is made of. No battle is started. */
@Tag("BENCH-51")
class ConditionsTest {

    @Test
    @DisplayName("sha256 of a file is the standard digest")
    void sha256IsTheStandardDigest(@TempDir Path dir) throws IOException {
        Path f = dir.resolve("abc.txt");
        Files.write(f, "abc".getBytes(StandardCharsets.UTF_8));
        assertEquals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad", Conditions.sha256(f));
    }

    @Test
    @DisplayName("an absent data directory is an empty shelf")
    void absentShelfIsEmpty(@TempDir Path dir) throws IOException {
        Conditions.Shelf shelf = Conditions.shelf(dir.resolve("nothing"));
        assertEquals(0, shelf.files());
        assertEquals(0, shelf.bytes());
        assertEquals(Conditions.shelf(dir.resolve("also-nothing")).sha256(), shelf.sha256());
    }

    @Test
    @DisplayName("the shelf checksum follows the files' names and bytes, not the order they were made in")
    void shelfChecksumFollowsContent(@TempDir Path dir) throws IOException {
        Path a = dir.resolve("a");
        Path b = dir.resolve("b");
        Files.createDirectories(a.resolve("sub"));
        Files.createDirectories(b.resolve("sub"));
        Files.writeString(a.resolve("x.dat"), "one");
        Files.writeString(a.resolve("sub/y.dat"), "two");
        Files.writeString(b.resolve("sub/y.dat"), "two");
        Files.writeString(b.resolve("x.dat"), "one");
        Conditions.Shelf sa = Conditions.shelf(a);
        assertEquals(2, sa.files());
        assertEquals(6, sa.bytes());
        assertEquals(sa.sha256(), Conditions.shelf(b).sha256());
        Files.writeString(b.resolve("x.dat"), "uno");
        assertNotEquals(sa.sha256(), Conditions.shelf(b).sha256());
    }

    @Test
    @DisplayName("a jar that cannot be read is described by its path and the error")
    void unreadableJarIsDescribed(@TempDir Path dir) {
        Map<String, Object> m = Conditions.jar(dir.resolve("missing.jar"));
        assertTrue(m.containsKey("path"));
        assertTrue(m.containsKey("error"));
    }

    @Test
    @DisplayName("the repository's commit is a sha, or unknown when git is not there")
    void gitNamesACommit() {
        Map<String, Object> m = Conditions.git(Path.of("").toAbsolutePath());
        String sha = (String) m.get("sha");
        assertTrue(sha.equals("unknown") || sha.matches("[0-9a-f]{40}"), sha);
    }

    @Test
    @DisplayName("json writes nested maps and lists, escapes strings and writes a non-finite number as null")
    void jsonShape() {
        Map<String, Object> inner = new LinkedHashMap<>();
        inner.put("cpu", Double.NaN);
        inner.put("jvms", 3);
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("note", "say \"hi\"\n");
        m.put("flags", List.of("-Xmx512M", "-XX:ActiveProcessorCount=2"));
        m.put("sample", inner);
        m.put("none", null);
        m.put("empty", List.of());
        m.put("done", true);
        String json = Conditions.json(m);
        assertTrue(json.contains("\"note\": \"say \\\"hi\\\"\\n\""), json);
        assertTrue(json.contains("\"cpu\": null"), json);
        assertTrue(json.contains("\"jvms\": 3"), json);
        assertTrue(json.contains("\"-XX:ActiveProcessorCount=2\""), json);
        assertTrue(json.contains("\"none\": null"), json);
        assertTrue(json.contains("\"empty\": []"), json);
        assertTrue(json.contains("\"done\": true"), json);
        assertTrue(json.startsWith("{\n") && json.endsWith("}\n"));
    }
}
