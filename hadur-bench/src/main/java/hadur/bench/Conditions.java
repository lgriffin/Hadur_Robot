package hadur.bench;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * BENCH-51: the run's conditions as a {@code conditions.json} sidecar, so a result can be
 * judged later against the build, the host and the settings that made it. Also the helpers it
 * is made of: file checksums, the repository's commit
 * and the fingerprint of the data directory a run starts on (BENCH-54).
 */
final class Conditions {

    private Conditions() {}

    /** The data directory's size and checksum: sorted relative paths and bytes, hashed together. */
    record Shelf(int files, long bytes, String sha256) {
        Map<String, Object> toMap() {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("files", files);
            m.put("bytes", bytes);
            m.put("sha256", sha256);
            return m;
        }
    }

    /** The shelf under {@code data} (Robocode's {@code robots/.data}); an empty one when there is none. */
    static Shelf shelf(Path data) throws IOException {
        MessageDigest md = digest();
        int files = 0;
        long bytes = 0;
        if (Files.isDirectory(data)) {
            List<Path> all = new ArrayList<>();
            try (Stream<Path> walk = Files.walk(data)) {
                walk.filter(Files::isRegularFile).forEach(all::add);
            }
            Collections.sort(all);
            for (Path f : all) {
                String name = data.relativize(f).toString().replace('\\', '/');
                byte[] content = Files.readAllBytes(f);
                md.update(name.getBytes(StandardCharsets.UTF_8));
                md.update((byte) 0);
                md.update(content);
                md.update((byte) 0);
                files++;
                bytes += content.length;
            }
        }
        return new Shelf(files, bytes, HexFormat.of().formatHex(md.digest()));
    }

    static String sha256(Path file) throws IOException {
        MessageDigest md = digest();
        try (InputStream in = Files.newInputStream(file)) {
            byte[] buf = new byte[1 << 16];
            for (int n; (n = in.read(buf)) > 0;) md.update(buf, 0, n);
        }
        return HexFormat.of().formatHex(md.digest());
    }

    private static MessageDigest digest() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /** The jar's identity: path, size and checksum, or just the path and the error when it cannot be read. */
    static Map<String, Object> jar(Path jar) {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("path", jar.toString());
        try {
            m.put("bytes", Files.size(jar));
            m.put("sha256", sha256(jar));
        } catch (IOException e) {
            m.put("error", e.toString());
        }
        return m;
    }

    /** The commit {@code dir}'s repository is at, and whether its tracked files have uncommitted changes. */
    static Map<String, Object> git(Path dir) {
        Map<String, Object> m = new LinkedHashMap<>();
        String sha = gitOut(dir, "rev-parse", "HEAD");
        m.put("sha", sha == null ? "unknown" : sha);
        String status = gitOut(dir, "status", "--porcelain", "--untracked-files=no");
        m.put("dirty", status == null ? null : !status.isBlank());
        return m;
    }

    private static String gitOut(Path dir, String... args) {
        List<String> cmd = new ArrayList<>(List.of("git", "-C", dir.toString()));
        cmd.addAll(List.of(args));
        try {
            Process p = new ProcessBuilder(cmd).redirectErrorStream(true).start();
            String out = new String(p.getInputStream().readAllBytes(), StandardCharsets.UTF_8).trim();
            if (!p.waitFor(10, TimeUnit.SECONDS)) {
                p.destroyForcibly();
                return null;
            }
            return p.exitValue() == 0 ? out : null;
        } catch (IOException e) {
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /** {@code value} as JSON: maps, lists, strings, numbers (a non-finite one as null), booleans and null. */
    static String json(Object value) {
        StringBuilder b = new StringBuilder();
        write(b, value, 0);
        return b.append('\n').toString();
    }

    private static void write(StringBuilder b, Object v, int depth) {
        String pad = "  ".repeat(depth + 1);
        if (v == null) {
            b.append("null");
        } else if (v instanceof Map<?, ?> m) {
            if (m.isEmpty()) {
                b.append("{}");
                return;
            }
            b.append("{\n");
            int i = 0;
            for (Map.Entry<?, ?> e : m.entrySet()) {
                b.append(pad);
                string(b, String.valueOf(e.getKey()));
                b.append(": ");
                write(b, e.getValue(), depth + 1);
                b.append(++i < m.size() ? ",\n" : "\n");
            }
            b.append("  ".repeat(depth)).append('}');
        } else if (v instanceof List<?> l) {
            if (l.isEmpty()) {
                b.append("[]");
                return;
            }
            b.append("[\n");
            for (int i = 0; i < l.size(); i++) {
                b.append(pad);
                write(b, l.get(i), depth + 1);
                b.append(i + 1 < l.size() ? ",\n" : "\n");
            }
            b.append("  ".repeat(depth)).append(']');
        } else if (v instanceof Double d) {
            b.append(Double.isFinite(d) ? String.format(Locale.ROOT, "%.4f", d) : "null");
        } else if (v instanceof Number || v instanceof Boolean) {
            b.append(v);
        } else {
            string(b, v.toString());
        }
    }

    private static void string(StringBuilder b, String s) {
        b.append('"');
        for (char c : s.toCharArray()) {
            switch (c) {
                case '"' -> b.append("\\\"");
                case '\\' -> b.append("\\\\");
                case '\n' -> b.append("\\n");
                case '\r' -> b.append("\\r");
                case '\t' -> b.append("\\t");
                default -> {
                    if (c < 0x20) b.append(String.format("\\u%04x", (int) c));
                    else b.append(c);
                }
            }
        }
        b.append('"');
    }
}
