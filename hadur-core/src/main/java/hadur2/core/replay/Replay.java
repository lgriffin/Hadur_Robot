package hadur2.core.replay;

import hadur2.core.Guard;
import hadur2.core.HadurCore;
import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
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
    public record Tick(int line, BotInput input, BotOrders recorded, BotOrders replayed) {}

    private Replay() {}

    public static List<Tick> run(List<String> lines, Telemetry telemetry) {
        HadurCore core = null;
        Guard guard = null;
        List<Tick> ticks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.startsWith("F,")) {
                String[] f = line.split(",");
                core = new HadurCore(Double.parseDouble(f[1]), Double.parseDouble(f[2]),
                    Integer.parseInt(f[3]), telemetry);
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
