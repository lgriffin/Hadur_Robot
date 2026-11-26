package hadur117;

import hadur117.core.Guard;
import hadur117.core.HadurCore;
import hadur117.core.model.BotInput;
import hadur117.core.model.BotOrders;
import hadur117.core.port.MemoryProfileStore;
import hadur117.core.replay.LineCodec;
import hadur117.core.replay.Replay;
import hadur117.core.role.Charter;
import hadur117.core.shieldmode.ShieldList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/**
 * TIME-11: the tick-time replay. Plays recorded battles (the bench's {@code --record}
 * transcripts) back through a core built exactly as the robot builds it (the shipped shield
 * list, the store the battle started on, the round-end and checkpoint calls where the
 * recorder logged them) and times every call the robot's thread makes into the core:
 * each tick through the guard, and each round-end, checkpoint and battle-end call.
 *
 * <p>For each recording and pass it prints the tick count, the mean, p50, p90, p99, p99.9 and
 * maximum tick time in microseconds, the ticks over 70% and over 100% of the allowance (the
 * live CPU constant by default), the bytes allocated per tick, the GC collections and pause
 * time the pass caused, the slowest round-end call, and how many ticks' orders differ from
 * the recorded ones. A recording made on build X and replayed on build Y with zero
 * differing ticks shows Y plays X's battle tick for tick: the proof an optimisation changed
 * no behaviour.</p>
 *
 * <p>Pass 1 of a recording runs on a cold JVM, as a battle's first rounds do (every battle
 * is its own JVM on the bench and a fresh class loader on a rumble client); later passes
 * show the warmed-up cost. Test code on purpose: nothing here ships.</p>
 *
 * <pre>
 * java -cp ... hadur117.TickPerf [--passes N] [--allowance NANOS] [--ticks-out DIR] [--profile-loop SECONDS] FILE...
 * </pre>
 */
public final class TickPerf {

    /** The live rumble CPU constant (BENCH-245), the default allowance. */
    public static final long LIVE_ALLOWANCE = 3_272_413L;

    /** What one pass over one recording measured. */
    public static final class Pass {
        public long[] tickNanos = new long[0];
        public long[] tickBytes = new long[0];
        public int[] tickRound = new int[0];
        public int ticks;
        public int mismatches;
        public int firstMismatchLine = -1;
        public long allocBytes;
        public long gcCount;
        public long gcMillis;
        public long roundEndMaxNanos;
        public long roundEndTotalNanos;
        public int roundEnds;
        public long wallNanos;
        /** A digest of every replayed order, so two builds can be compared without a recording match. */
        public long ordersDigest = 1125899906842597L;
    }

    private static final com.sun.management.ThreadMXBean THREADS =
        (com.sun.management.ThreadMXBean) ManagementFactory.getThreadMXBean();

    private TickPerf() {}

    /** Reads a transcript, gzipped or not. */
    public static List<String> read(Path file) throws IOException {
        InputStream in = Files.newInputStream(file);
        if (file.toString().endsWith(".gz")) in = new GZIPInputStream(in, 1 << 16);
        try (BufferedReader r = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8), 1 << 16)) {
            return r.lines().toList();
        }
    }

    /** One line of a transcript, decoded just before it is replayed (outside the timed calls). */
    private record Step(char kind, String line, BotInput input, BotOrders recorded, int lineNo) {}

    /**
     * The transcript's steps, read and decoded one at a time, so the replay's heap holds only
     * what the core holds (a decoded battle would add ~100 MB and distort every GC pause).
     */
    private static final class Steps implements java.util.Iterator<Step>, AutoCloseable {
        private final BufferedReader in;
        private String pending;
        private int lineNo;
        private Step next;

        Steps(BufferedReader in) throws IOException {
            this.in = in;
            this.pending = in.readLine();
            advance();
        }

        Steps(List<String> lines) throws IOException {
            this(new BufferedReader(new java.io.StringReader(String.join("\n", lines))));
        }

        private String take() throws IOException {
            String l = pending;
            pending = in.readLine();
            lineNo++;
            return l;
        }

        private void advance() throws IOException {
            next = null;
            while (next == null && pending != null) {
                String l = take();
                if (l.startsWith("I,")) {
                    int at = lineNo;
                    BotOrders rec = pending != null && pending.startsWith("O,") ? LineCodec.decodeOrders(pending) : null;
                    next = new Step('I', null, LineCodec.decodeInput(l), rec, at);
                } else if (l.startsWith("RE,") || l.startsWith("CP,") || l.startsWith("BE,") || l.startsWith("HE,")) {
                    next = new Step(l.startsWith("RE,") ? 'R' : l.startsWith("CP,") ? 'C' : l.startsWith("BE,") ? 'B' : 'H',
                        l, null, null, lineNo);
                } else if (l.length() > 1 && l.charAt(1) == ',' && "QDFN".indexOf(l.charAt(0)) >= 0) {
                    next = new Step(l.charAt(0), l, null, null, lineNo);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Step next() {
            Step s = next;
            try {
                advance();
            } catch (IOException e) {
                throw new java.io.UncheckedIOException(e);
            }
            return s;
        }

        @Override
        public void close() throws IOException {
            in.close();
        }
    }

    /** Opens a transcript, gzipped or not, as a stream of steps. */
    private static Steps open(Path file) throws IOException {
        InputStream in = Files.newInputStream(file);
        if (file.toString().endsWith(".gz")) in = new GZIPInputStream(in, 1 << 16);
        return new Steps(new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8), 1 << 16));
    }

    /**
     * Replays {@code lines} once, timing every core call.
     *
     * @param lines the transcript
     * @param shield the shield list the core is built with
     * @return what the pass measured
     */
    public static Pass run(List<String> lines, ShieldList shield) {
        try (Steps steps = new Steps(lines)) {
            return runSteps(steps, shield);
        } catch (IOException e) {
            throw new java.io.UncheckedIOException(e);
        }
    }

    private static Pass runSteps(java.util.Iterator<Step> steps, ShieldList shield) {
        Pass p = new Pass();
        int n = 4096;
        p.tickNanos = new long[n];
        p.tickBytes = new long[n];
        p.tickRound = new int[n];
        MemoryProfileStore store = null;
        HadurCore core = null;
        Guard guard = null;
        int faults = 0;
        int round = 0;
        long sequence = 0;
        List<Object[]> ages = new ArrayList<>();
        List<String> telemetry = new ArrayList<>();
        long gcCount0 = gcCount(), gcMillis0 = gcMillis();
        long wall0 = System.nanoTime();
        while (steps.hasNext()) {
            Step s = steps.next();
            switch (s.kind) {
                case 'Q' -> store = new MemoryProfileStore(Long.parseLong(s.line.substring(2)));
                case 'D' -> {
                    String[] d = s.line.split(",", 4);
                    store.write(d[1], Base64.getDecoder().decode(d[3]));
                    ages.add(new Object[] {Long.parseLong(d[2]), d[1]});
                }
                case 'F' -> {
                    ages.sort((a, b) -> a[0].equals(b[0]) ? ((String) a[1]).compareTo((String) b[1])
                        : Long.compare((Long) a[0], (Long) b[0]));
                    for (Object[] a : ages) store.touch((String) a[1], ++sequence);
                    core = new HadurCore(Replay.facts(s.line), telemetry::add, store, null, shield);
                    if (store != null) core.prepareMemory();
                    HadurCore c = core;
                    guard = new Guard(c::tick, c::recover, telemetry::add, c.charter() == Charter.TEAM);
                }
                case 'N' -> {
                    round = Integer.parseInt(s.line.substring(2));
                    core.newRound(round);
                    guard.newRound();
                }
                case 'I' -> {
                    long b0 = THREADS.getCurrentThreadAllocatedBytes();
                    long t0 = System.nanoTime();
                    BotOrders out = guard.tick(s.input);
                    long t1 = System.nanoTime();
                    long b1 = THREADS.getCurrentThreadAllocatedBytes();
                    int k = p.ticks++;
                    if (k == p.tickNanos.length) {
                        p.tickNanos = Arrays.copyOf(p.tickNanos, 2 * k);
                        p.tickBytes = Arrays.copyOf(p.tickBytes, 2 * k);
                        p.tickRound = Arrays.copyOf(p.tickRound, 2 * k);
                    }
                    p.tickNanos[k] = t1 - t0;
                    p.tickBytes[k] = b1 - b0;
                    p.tickRound[k] = round;
                    p.ordersDigest = p.ordersDigest * 31 + out.hashCode();
                    if (s.recorded != null && !s.recorded.equals(out)) {
                        if (p.mismatches++ == 0) p.firstMismatchLine = s.lineNo;
                    }
                    if (telemetry.size() > 4096) telemetry.clear();
                }
                case 'R' -> {
                    String[] e = s.line.split(",");
                    faults += guard.faultsThisRound();
                    long t0 = System.nanoTime();
                    core.roundEnded(Long.parseLong(e[1]), e[2], Double.parseDouble(e[3]), guard.faultsThisRound());
                    roundEndTook(p, System.nanoTime() - t0);
                }
                case 'C' -> {
                    long t0 = System.nanoTime();
                    core.checkpoint(Long.parseLong(s.line.substring(3)));
                    roundEndTook(p, System.nanoTime() - t0);
                }
                case 'B' -> {
                    long t0 = System.nanoTime();
                    core.battleEnded(Long.parseLong(s.line.substring(3)));
                    roundEndTook(p, System.nanoTime() - t0);
                }
                case 'H' -> {
                    String[] h = s.line.split(",");
                    if (h.length >= 7) {
                        core.writeBattleHealth(Integer.parseInt(h[1]), Integer.parseInt(h[2]), faults,
                            Integer.parseInt(h[3]), Integer.parseInt(h[4]), Long.parseLong(h[5]),
                            Integer.parseInt(h[6]));
                    } else {
                        core.writeBattleHealth(Integer.parseInt(h[1]), Integer.parseInt(h[2]), faults,
                            Integer.parseInt(h[3]));
                    }
                }
                default -> { }
            }
        }
        p.wallNanos = System.nanoTime() - wall0;
        p.allocBytes = 0;
        for (int i = 0; i < p.ticks; i++) p.allocBytes += p.tickBytes[i];
        p.gcCount = gcCount() - gcCount0;
        p.gcMillis = gcMillis() - gcMillis0;
        return p;
    }

    private static void roundEndTook(Pass p, long nanos) {
        p.roundEnds++;
        p.roundEndTotalNanos += nanos;
        p.roundEndMaxNanos = Math.max(p.roundEndMaxNanos, nanos);
    }

    private static long gcCount() {
        long c = 0;
        for (GarbageCollectorMXBean g : ManagementFactory.getGarbageCollectorMXBeans()) c += Math.max(0, g.getCollectionCount());
        return c;
    }

    private static long gcMillis() {
        long c = 0;
        for (GarbageCollectorMXBean g : ManagementFactory.getGarbageCollectorMXBeans()) c += Math.max(0, g.getCollectionTime());
        return c;
    }

    /** The {@code q}-quantile of {@code sorted}, nearest rank. */
    static long quantile(long[] sorted, double q) {
        if (sorted.length == 0) return 0;
        int i = (int) Math.ceil(q * sorted.length) - 1;
        return sorted[Math.max(0, Math.min(sorted.length - 1, i))];
    }

    /** The summary row's header. */
    public static final String HEADER = "recording\tpass\tticks\tmean_us\tp50_us\tp90_us\tp99_us\tp999_us\tmax_us"
        + "\tover70\tover100\tkb_tick\tgc_n\tgc_ms\troundend_max_us\twall_s\tmismatch\tfirst_mismatch\tdigest";

    /** One summary row for {@code p}. */
    public static String row(String name, int pass, Pass p, long allowance) {
        long[] s = Arrays.copyOf(p.tickNanos, p.ticks);
        Arrays.sort(s);
        long sum = 0;
        int over70 = 0, over100 = 0;
        for (long t : s) {
            sum += t;
            if (t > 0.7 * allowance) over70++;
            if (t > allowance) over100++;
        }
        double mean = p.ticks == 0 ? 0 : sum / (double) p.ticks;
        return String.format(Locale.ROOT, "%s\t%d\t%d\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%d\t%d\t%.1f\t%d\t%d\t%.1f\t%.2f\t%d\t%d\t%016x",
            name, pass, p.ticks, mean / 1e3, quantile(s, 0.5) / 1e3, quantile(s, 0.9) / 1e3, quantile(s, 0.99) / 1e3,
            quantile(s, 0.999) / 1e3, (s.length == 0 ? 0 : s[s.length - 1]) / 1e3, over70, over100,
            p.ticks == 0 ? 0 : p.allocBytes / 1024.0 / p.ticks, p.gcCount, p.gcMillis, p.roundEndMaxNanos / 1e3,
            p.wallNanos / 1e9, p.mismatches, p.firstMismatchLine, p.ordersDigest);
    }

    public static void main(String[] args) throws IOException {
        int passes = 3;
        long allowance = LIVE_ALLOWANCE;
        Path ticksOut = null;
        double profileLoop = 0;
        List<Path> files = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--passes" -> passes = Integer.parseInt(args[++i]);
                case "--allowance" -> allowance = Long.parseLong(args[++i]);
                case "--ticks-out" -> ticksOut = Path.of(args[++i]);
                case "--profile-loop" -> profileLoop = Double.parseDouble(args[++i]);
                default -> files.add(Path.of(args[i]));
            }
        }
        ShieldList shield = ShieldList.parse(Hadur.shieldListLines());
        PrintStream out = System.out;
        out.println(HEADER);
        for (int pass = 1; pass <= passes; pass++) {
            for (Path f : files) {
                String name = f.getFileName().toString().replaceAll("\\.txt(\\.gz)?$", "");
                Pass p;
                try (Steps steps = open(f)) {
                    p = runSteps(steps, shield);
                }
                out.println(row(name, pass, p, allowance));
                out.flush();
                if (ticksOut != null) writeTicks(ticksOut.resolve(name + "-pass" + pass + ".tsv"), p);
            }
        }
        // For a profiler: keep replaying the set until the time is up, warm.
        long end = System.nanoTime() + (long) (profileLoop * 1e9);
        while (System.nanoTime() < end) {
            for (Path f : files) {
                try (Steps steps = open(f)) {
                    runSteps(steps, shield);
                }
            }
        }
    }

    private static void writeTicks(Path file, Pass p) throws IOException {
        Files.createDirectories(file.getParent());
        StringBuilder sb = new StringBuilder("round\tnanos\tbytes\n");
        for (int i = 0; i < p.ticks; i++) {
            sb.append(p.tickRound[i]).append('\t').append(p.tickNanos[i]).append('\t').append(p.tickBytes[i]).append('\n');
        }
        Files.writeString(file, sb);
    }
}
