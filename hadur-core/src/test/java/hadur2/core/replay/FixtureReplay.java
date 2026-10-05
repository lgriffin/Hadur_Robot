package hadur2.core.replay;

import hadur2.core.Guard;
import hadur2.core.HadurCore;
import hadur2.core.model.BotEvent;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.MemoryProfileStore;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * STRAND-4: replays a recorded battle the whole way the adapter drives it, not only tick by
 * tick. On top of what {@link Replay#run} does, it seeds the store the battle started on
 * ({@code Q} and {@code D} lines), prepares memory as the adapter does once the core is
 * built, and makes the adapter's round-end, checkpoint, battle-end and health-record calls
 * where the recorder logged them ({@code RE}, {@code CP}, {@code BE}, {@code HE}). The
 * guard's fault counts are the replay's own, as the adapter's are the live guard's.
 *
 * <p>The result carries the orders of every tick, every telemetry line the replayed core
 * and guard wrote, the files left in the store, and the files the live robot left
 * ({@code S} lines), so a test can compare all three. A recording with no {@code Q} line
 * (the six S1 fixtures) replays with no store and no memory calls, exactly as
 * {@link Replay#run} does.</p>
 *
 * <p>Test code on purpose: A0 changes no shipped class, the {@code replay} package
 * included.</p>
 */
public final class FixtureReplay {

    /** What one replay produced. */
    public static final class Result {
        public final List<Replay.Tick> ticks = new ArrayList<>();
        public final List<String> telemetry = new ArrayList<>();
        /** The store's files after the battle, by name; empty without a store. */
        public final Map<String, byte[]> store = new TreeMap<>();
        /** The files the live robot left, by name; null when the recording has none. */
        public Map<String, byte[]> recordedStore;
        /** Whether the recording carried a store (a {@code Q} line). */
        public boolean hasStore;
    }

    /** Where each fixture's telemetry snapshot is kept. */
    public static final java.nio.file.Path TELEMETRY = Fixtures.DIR.resolve("telemetry");

    /**
     * Telemetry lines a stage added on purpose, which the snapshot comparison sets aside.
     * None yet: A1's {@code ROLE} record is the first.
     */
    public static final List<String> SET_ASIDE = List.of();

    private FixtureReplay() {}

    /** {@code lines} less the lines the comparison sets aside. */
    public static List<String> comparable(List<String> lines) {
        List<String> out = new ArrayList<>();
        for (String l : lines) {
            if (SET_ASIDE.stream().noneMatch(l::startsWith)) out.add(l);
        }
        return out;
    }

    /** The pinned telemetry of fixture {@code name}, less the lines set aside. */
    public static List<String> snapshot(String name) {
        return comparable(Fixtures.lines(TELEMETRY.resolve(name + ".txt.gz")));
    }

    /** Replays {@code lines}; see the class comment. */
    public static Result run(List<String> lines) {
        Result r = new Result();
        MemoryProfileStore store = null;
        HadurCore core = null;
        Guard guard = null;
        int faults = 0;
        long sequence = 0;
        List<Object[]> ages = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.startsWith("Q,")) {
                store = new MemoryProfileStore(Long.parseLong(line.substring(2)));
                r.hasStore = true;
            } else if (line.startsWith("D,")) {
                // D,name,lastModified,base64: written now, aged below once all are in.
                String[] d = line.split(",", 4);
                store.write(d[1], Base64.getDecoder().decode(d[3]));
                ages.add(new Object[] {Long.parseLong(d[2]), d[1]});
            } else if (line.startsWith("F,")) {
                // The store's ages keep the files' order on disk (MEM-5's least recently
                // fought), ranked 1..n so the battle's own writes come after every one.
                ages.sort((a, b) -> a[0].equals(b[0]) ? ((String) a[1]).compareTo((String) b[1])
                    : Long.compare((Long) a[0], (Long) b[0]));
                for (Object[] a : ages) store.touch((String) a[1], ++sequence);
                String[] f = line.split(",");
                core = new HadurCore(Double.parseDouble(f[1]), Double.parseDouble(f[2]),
                    Integer.parseInt(f[3]), r.telemetry::add, store);
                if (store != null) core.prepareMemory();
                HadurCore c = core;
                guard = new Guard(c::tick, c::recover, r.telemetry::add);
            } else if (line.startsWith("N,")) {
                core.newRound(Integer.parseInt(line.substring(2)));
                guard.newRound();
            } else if (line.startsWith("I,")) {
                BotInput in = LineCodec.decodeInput(line);
                BotOrders recorded = i + 1 < lines.size() && lines.get(i + 1).startsWith("O,")
                    ? LineCodec.decodeOrders(lines.get(i + 1)) : null;
                r.ticks.add(new Replay.Tick(i + 1, in, recorded, guard.tick(in)));
            } else if (line.startsWith("RE,")) {
                String[] e = line.split(",");
                faults += guard.faultsThisRound();
                core.roundEnded(Long.parseLong(e[1]), e[2], Double.parseDouble(e[3]),
                    guard.faultsThisRound());
            } else if (line.startsWith("CP,")) {
                core.checkpoint(Long.parseLong(line.substring(3)));
            } else if (line.startsWith("BE,")) {
                core.battleEnded(Long.parseLong(line.substring(3)));
            } else if (line.startsWith("HE,")) {
                String[] h = line.split(",");
                core.writeBattleHealth(Integer.parseInt(h[1]), Integer.parseInt(h[2]), faults,
                    Integer.parseInt(h[3]));
            } else if (line.startsWith("S,")) {
                String[] s = line.split(",", 3);
                if (r.recordedStore == null) r.recordedStore = new TreeMap<>();
                r.recordedStore.put(s[1], Base64.getDecoder().decode(s[2]));
            }
        }
        if (store != null) {
            for (String name : store.names()) r.store.put(name, store.read(name));
            // A battle that ends with no file left still says so.
            if (r.recordedStore == null && lines.stream().anyMatch(l -> l.startsWith("HE,"))) {
                r.recordedStore = Collections.emptyMap();
            }
        }
        return r;
    }

    /** The store as {@code name -> base64}, for readable comparisons. */
    public static Map<String, String> readable(Map<String, byte[]> files) {
        Map<String, String> out = new LinkedHashMap<>();
        if (files == null) return null;
        files.forEach((n, b) -> out.put(n, Base64.getEncoder().encodeToString(b)));
        return out;
    }

    /** Whether any tick of the recording carries a skipped turn, the duress fixture's mark. */
    public static boolean skipsTurns(Result r) {
        for (Replay.Tick t : r.ticks) {
            for (BotEvent e : t.input().events()) {
                if (e instanceof BotEvent.SkippedTurn) return true;
            }
        }
        return false;
    }
}
