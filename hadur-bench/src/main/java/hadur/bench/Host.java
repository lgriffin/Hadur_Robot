package hadur.bench;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Describes the machine a bench ran on, for the report header (issue #102: bench numbers
 * differ between hosts, so each report says which one made them). The CPU model comes from
 * the OS; everything else from the JVM.
 */
final class Host {

    private Host() {}

    /**
     * e.g. {@code AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0,
     * 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6)}. The other JVMs are
     * rumble clients or benches already on the host when this one started: they share the
     * CPU with it, and a report that does not say so cannot be compared with one made on an
     * idle machine.
     */
    static String describe() {
        return String.format(Locale.ROOT, "%s, %d logical cores, %s %s, %s",
            cpuModel(), Runtime.getRuntime().availableProcessors(),
            System.getProperty("os.name"), System.getProperty("os.version"), otherJvms());
    }

    /**
     * The other Java processes on the host that look like Robocode work ({@code jps -l}
     * lines naming robocode, roborumble or the bench's own runners), summarised by main
     * class; "other Robocode JVMs unknown" when {@code jps} is not on the PATH.
     */
    static String otherJvms() {
        List<String> lines;
        try {
            lines = runAll(List.of("jps", "-l"));
        } catch (IOException | InterruptedException e) {
            lines = null;
        }
        if (lines == null) return "other Robocode JVMs unknown (no jps)";
        java.util.Map<String, Integer> byMain = new java.util.TreeMap<>();
        long self = ProcessHandle.current().pid();
        for (String line : lines) {
            String[] f = line.trim().split("\\s+", 2);
            if (f.length < 2 || f[0].equals(String.valueOf(self))) continue;
            String main = f[1];
            String lower = main.toLowerCase(Locale.ROOT);
            if (!(lower.contains("robocode") || lower.contains("roborumble") || lower.startsWith("hadur.bench."))) continue;
            byMain.merge(main, 1, Integer::sum);
        }
        if (byMain.isEmpty()) return "no other Robocode JVMs running";
        StringBuilder b = new StringBuilder();
        int total = 0;
        for (java.util.Map.Entry<String, Integer> e : byMain.entrySet()) {
            total += e.getValue();
            if (b.length() > 0) b.append(", ");
            b.append(e.getKey()).append(" x").append(e.getValue());
        }
        return total + " other Robocode JVM" + (total == 1 ? "" : "s") + " running (" + b + ")";
    }

    /** Every line a command prints within a few seconds, or null when it cannot run. */
    private static List<String> runAll(List<String> cmd) throws IOException, InterruptedException {
        Process p;
        try {
            p = new ProcessBuilder(cmd).redirectErrorStream(true).start();
        } catch (IOException e) {
            return null;
        }
        String out = new String(p.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        if (!p.waitFor(10, TimeUnit.SECONDS)) {
            p.destroyForcibly();
            return null;
        }
        if (p.exitValue() != 0) return null;
        return java.util.Arrays.asList(out.split("\\R"));
    }

    /** The CPU's marketing name, or what the JVM knows when the OS does not say. */
    static String cpuModel() {
        String os = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        String model = null;
        try {
            if (os.contains("win")) {
                model = run(List.of("powershell", "-NoProfile", "-NonInteractive", "-Command",
                    "(Get-CimInstance Win32_Processor | Select-Object -First 1).Name"));
                if (model == null) model = System.getenv("PROCESSOR_IDENTIFIER");
            } else if (os.contains("mac")) {
                model = run(List.of("sysctl", "-n", "machdep.cpu.brand_string"));
            } else {
                Path cpuinfo = Path.of("/proc/cpuinfo");
                if (Files.isReadable(cpuinfo)) {
                    for (String line : Files.readAllLines(cpuinfo, StandardCharsets.UTF_8)) {
                        if (line.startsWith("model name")) {
                            model = line.substring(line.indexOf(':') + 1).trim();
                            break;
                        }
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            model = null;
        }
        return model == null || model.isBlank() ? System.getProperty("os.arch") : model.trim();
    }

    /** The first non-blank line a command prints within a few seconds, or null. */
    private static String run(List<String> cmd) throws IOException, InterruptedException {
        Process p;
        try {
            p = new ProcessBuilder(cmd).redirectErrorStream(true).start();
        } catch (IOException e) {
            return null;
        }
        String out = new String(p.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        if (!p.waitFor(10, TimeUnit.SECONDS)) {
            p.destroyForcibly();
            return null;
        }
        for (String line : out.split("\\R")) {
            if (!line.isBlank()) return line.trim();
        }
        return null;
    }
}
