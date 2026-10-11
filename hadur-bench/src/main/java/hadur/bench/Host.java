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
        java.util.Map<String, Integer> byMain = robocodeJvms(lines, ProcessHandle.current().pid(), java.util.Set.of());
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

    /**
     * The Robocode-looking JVMs in {@code jps -l} output, by main class, leaving out the JVM
     * {@code self} and every pid in {@code own} (the bench's own battle children, which the
     * sampler must not count as somebody else's load).
     */
    static java.util.Map<String, Integer> robocodeJvms(List<String> jpsLines, long self,
                                                        java.util.Set<Long> own) {
        java.util.Map<String, Integer> byMain = new java.util.TreeMap<>();
        for (String line : jpsLines) {
            String[] f = line.trim().split("\\s+", 2);
            if (f.length < 2) continue;
            long pid;
            try {
                pid = Long.parseLong(f[0]);
            } catch (NumberFormatException e) {
                continue;
            }
            if (pid == self || own.contains(pid)) continue;
            String main = f[1];
            String lower = main.toLowerCase(Locale.ROOT);
            if (!(lower.contains("robocode") || lower.contains("roborumble") || lower.startsWith("hadur.bench."))) continue;
            byMain.merge(main, 1, Integer::sum);
        }
        return byMain;
    }

    /** What the sampler saw during one battle's window (BENCH-50). */
    record Window(double cpuMin, double cpuMean, double cpuMax, int otherJvms, int samples) {
        static final Window NONE = new Window(Double.NaN, Double.NaN, Double.NaN, -1, 0);
    }

    /**
     * BENCH-50: samples the host's CPU utilisation once a second and counts the other Robocode
     * JVMs every few seconds, on one daemon thread, so each battle can be given the load it ran
     * under ({@link #window}). Battles overlap when run in parallel, so samples are kept with
     * their time and a battle takes the ones inside its own start and end.
     */
    static final class Sampler implements AutoCloseable {
        private record Sample(long at, double cpu, int otherJvms) {}

        private final long intervalMs;
        private final long jvmEveryMs;
        private final java.util.function.DoubleSupplier cpu;
        private final java.util.function.IntSupplier jvms;
        private final List<Sample> samples = new java.util.ArrayList<>();
        private Thread thread;
        private volatile boolean stopped;

        Sampler(long intervalMs, long jvmEveryMs, java.util.function.DoubleSupplier cpu,
                java.util.function.IntSupplier jvms) {
            this.intervalMs = intervalMs;
            this.jvmEveryMs = jvmEveryMs;
            this.cpu = cpu;
            this.jvms = jvms;
        }

        /** The real thing: one sample a second, a {@code jps} count every ten. */
        static Sampler system() {
            java.lang.management.OperatingSystemMXBean os =
                java.lang.management.ManagementFactory.getOperatingSystemMXBean();
            java.util.function.DoubleSupplier cpu = os instanceof com.sun.management.OperatingSystemMXBean x
                ? x::getCpuLoad : () -> Double.NaN;
            return new Sampler(1000, 10_000, cpu, Host::countOtherJvms);
        }

        void start() {
            thread = new Thread(() -> {
                long lastJvmAt = Long.MIN_VALUE;
                int lastJvms = -1;
                while (!stopped) {
                    long now = System.currentTimeMillis();
                    if (lastJvmAt == Long.MIN_VALUE || now - lastJvmAt >= jvmEveryMs) {
                        lastJvms = jvms.getAsInt();
                        lastJvmAt = System.currentTimeMillis();
                    }
                    record(now, cpu.getAsDouble(), lastJvms);
                    try {
                        Thread.sleep(intervalMs);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }, "bench-host-sampler");
            thread.setDaemon(true);
            thread.start();
        }

        @Override
        public void close() {
            stopped = true;
            if (thread != null) thread.interrupt();
        }

        /** Adds one sample; a CPU load that is negative or NaN (the JVM's "not yet known") is kept as NaN. */
        synchronized void record(long at, double cpuLoad, int otherJvms) {
            samples.add(new Sample(at, cpuLoad >= 0 && cpuLoad <= 1 ? cpuLoad : Double.NaN, otherJvms));
        }

        /** The samples taken from {@code from} to {@code to} (ms); the last one before {@code to} if none fell inside. */
        synchronized Window window(long from, long to) {
            List<Sample> inside = new java.util.ArrayList<>();
            Sample before = null;
            for (Sample s : samples) {
                if (s.at() >= from && s.at() <= to) inside.add(s);
                if (s.at() < from) before = s;
            }
            if (inside.isEmpty() && before != null) inside.add(before);
            return summarise(inside);
        }

        synchronized Window overall() {
            return summarise(samples);
        }

        private static Window summarise(List<Sample> in) {
            double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY, sum = 0;
            int n = 0, jvms = -1;
            for (Sample s : in) {
                jvms = Math.max(jvms, s.otherJvms());
                if (Double.isNaN(s.cpu())) continue;
                min = Math.min(min, s.cpu());
                max = Math.max(max, s.cpu());
                sum += s.cpu();
                n++;
            }
            if (n == 0) return new Window(Double.NaN, Double.NaN, Double.NaN, jvms, in.size());
            return new Window(min, sum / n, max, jvms, in.size());
        }
    }

    /** Other Robocode JVMs right now, not counting this bench's own battle children; -1 when {@code jps} is unavailable. */
    static int countOtherJvms() {
        List<String> lines;
        try {
            lines = runAll(List.of("jps", "-l"));
        } catch (IOException | InterruptedException e) {
            return -1;
        }
        if (lines == null) return -1;
        java.util.Set<Long> own = new java.util.HashSet<>();
        ProcessHandle.current().descendants().forEach(h -> own.add(h.pid()));
        return robocodeJvms(lines, ProcessHandle.current().pid(), own).values().stream()
            .mapToInt(Integer::intValue).sum();
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
