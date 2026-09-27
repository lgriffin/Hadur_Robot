package hadur2.core.replay;

import hadur2.core.Guard;
import hadur2.core.HadurCore;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.port.ProfileStore;
import hadur2.core.port.Telemetry;
import java.util.ArrayList;
import java.util.List;

/**
 * Runs a recorded battle back through a fresh core and guard, the same way the robot
 * drives them, and returns the orders for every tick (CORE-2).
 *
 * <p>A recording is a list of lines: {@code F,width,height,enemies} once, {@code N,round}
 * at each round start, then an {@code I} line per tick, each followed by the {@code O}
 * line the live robot issued. Other lines are ignored.</p>
 *
 * <p>The driver mirrors {@code hadur2.Hadur}: the {@code F} line builds one core and one
 * guard for the battle (the robot keeps them static across rounds), each {@code N} line
 * calls {@code newRound} on both, and each {@code I} line goes through
 * {@link Guard#tick}, so a fault is covered by the same safe orders as in the robot
 * (RES-1). The guard's recovery hook is the core's {@code recover}, as in the robot.</p>
 *
 * <p>With a {@link ProfileStore}, the core loads and folds opponent memory as the robot
 * would; the recorded orders then only match if the store holds the same profile state
 * the live battle started with (CORE-2's "identical profile state"). The adapter's own
 * {@code prepareMemory}, {@code saveProfile} and end-of-round calls are not replayed.</p>
 */
public final class Replay {

    /** One replayed tick: what the live robot issued and what the replay produced. */
    public static final class Tick {
        /** The 1-based line number of the tick's {@code I} line in the recording. */
        private final int line;
        private final BotInput input;
        private final BotOrders recorded;
        private final BotOrders replayed;

        /**
         * A replayed tick.
         *
         * @param line the 1-based line number of the {@code I} line
         * @param input the decoded input
         * @param recorded the orders the live robot issued, or null if no {@code O} line followed
         * @param replayed the orders the fresh core and guard produced
         */
        public Tick(int line, BotInput input, BotOrders recorded, BotOrders replayed) {
            this.line = line;
            this.input = input;
            this.recorded = recorded;
            this.replayed = replayed;
        }

        /** The 1-based line number of the tick's {@code I} line, for failure messages. */
        public int line() {
            return line;
        }

        /** The tick's input as recorded. */
        public BotInput input() {
            return input;
        }

        /** The orders the live robot issued, or null if the recording has none for this tick. */
        public BotOrders recorded() {
            return recorded;
        }

        /** The orders the replay produced. */
        public BotOrders replayed() {
            return replayed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tick)) return false;
            Tick that = (Tick) o;
            return line == that.line
                && java.util.Objects.equals(input, that.input)
                && java.util.Objects.equals(recorded, that.recorded)
                && java.util.Objects.equals(replayed, that.replayed);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(line, input, recorded, replayed);
        }

        @Override
        public String toString() {
            return "Tick[line=" + line + ", input=" + input + ", recorded=" + recorded + ", replayed=" + replayed + "]";
        }
    }

    private Replay() {}

    /**
     * Replays without opponent memory.
     *
     * @param lines the recording
     * @param telemetry where the replayed core's records go
     * @return one entry per {@code I} line, in order
     * @throws IllegalArgumentException if an {@code N} or {@code I} line comes before the
     *     {@code F} line, or a line does not parse
     */
    public static List<Tick> run(List<String> lines, Telemetry telemetry) {
        return run(lines, telemetry, null);
    }

    /**
     * Replays with opponent memory in {@code store} (null for none), as the robot runs.
     *
     * @param lines the recording
     * @param telemetry where the replayed core's records go
     * @param store the profile store, or null for a battle without memory
     * @return one entry per {@code I} line, in order
     * @throws IllegalArgumentException if an {@code N} or {@code I} line comes before the
     *     {@code F} line, or a line does not parse
     */
    public static List<Tick> run(List<String> lines, Telemetry telemetry, ProfileStore store) {
        HadurCore core = null;
        Guard guard = null;
        List<Tick> ticks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.startsWith("F,")) {
                String[] f = line.split(",");
                core = new HadurCore(Double.parseDouble(f[1]), Double.parseDouble(f[2]),
                    Integer.parseInt(f[3]), telemetry, store);
                HadurCore c = core;
                guard = new Guard(c::tick, c::recover, telemetry);
            } else if (line.startsWith("N,")) {
                requireStarted(core, i);
                core.newRound(Integer.parseInt(line.substring(2)));
                guard.newRound();
            } else if (line.startsWith("I,")) {
                requireStarted(core, i);
                BotInput in = LineCodec.decodeInput(line);
                // The O line, if any, is the one straight after its I line.
                BotOrders recorded = i + 1 < lines.size() && lines.get(i + 1).startsWith("O,")
                    ? LineCodec.decodeOrders(lines.get(i + 1)) : null;
                ticks.add(new Tick(i + 1, in, recorded, guard.tick(in)));
            }
        }
        return ticks;
    }

    /** Throws unless the {@code F} line has been read; {@code line} is 0-based. */
    private static void requireStarted(HadurCore core, int line) {
        if (core == null) {
            throw new IllegalArgumentException("Line " + (line + 1) + " comes before the F line");
        }
    }
}
