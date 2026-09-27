package hadur2.core.port;

/**
 * Where the core sends telemetry lines (the artifact's CSV record format). The robot
 * adapter prints them to the console; tests collect them. The core itself does no I/O.
 *
 * <p>Each line is one comma-separated record whose first field names its kind: {@code V}
 * (opens every battle's log), {@code B} (the opponent at the battle's first scan and
 * what memory held for it), {@code EW} (an enemy shot the energy ledger found), {@code P}
 * (a policy decision and its evidence), {@code MEM} (a profile load or save problem),
 * {@code FAULT} (a caught exception, RES-1, GATE-4), {@code R} (the round's statistics and
 * fault counters, RES-5) and {@code M} (the round's posture statistics, in a battle
 * with several opponents or with sentries). The bench
 * parses them into its report. Because the core writes through this port and never to
 * {@code System.out}, it keeps its ban on I/O (RES-6).</p>
 */
@FunctionalInterface
public interface Telemetry {

    /** A telemetry sink that discards every line. */
    Telemetry NONE = line -> { };

    /**
     * Records one telemetry line.
     *
     * @param line a complete CSV record, without a line terminator
     */
    void emit(String line);
}
