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
 */
public final class Replay {

    /** One replayed tick: what the live robot issued and what the replay produced. */
    public static final class Tick {
        private final int line;
        private final BotInput input;
        private final BotOrders recorded;
        private final BotOrders replayed;

        public Tick(int line, BotInput input, BotOrders recorded, BotOrders replayed) {
            this.line = line;
            this.input = input;
            this.recorded = recorded;
            this.replayed = replayed;
        }

        public int line() {
            return line;
        }

        public BotInput input() {
            return input;
        }

        public BotOrders recorded() {
            return recorded;
        }

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

    public static List<Tick> run(List<String> lines, Telemetry telemetry) {
        return run(lines, telemetry, null);
    }

    /** Replays with opponent memory in {@code store} (null for none), as the robot runs. */
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
                BotOrders recorded = i + 1 < lines.size() && lines.get(i + 1).startsWith("O,")
                    ? LineCodec.decodeOrders(lines.get(i + 1)) : null;
                ticks.add(new Tick(i + 1, in, recorded, guard.tick(in)));
            }
        }
        return ticks;
    }

    private static void requireStarted(HadurCore core, int line) {
        if (core == null) {
            throw new IllegalArgumentException("Line " + (line + 1) + " comes before the F line");
        }
    }
}
