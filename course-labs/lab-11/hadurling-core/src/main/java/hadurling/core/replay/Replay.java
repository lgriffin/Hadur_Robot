package hadurling.core.replay;

import hadurling.core.Core;
import hadurling.core.Guard;
import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.port.Telemetry;
import java.util.ArrayList;
import java.util.List;

/**
 * Feeds a recorded battle through a fresh core and reports, tick by tick, what the live robot
 * did and what the core does now. If they differ, the core's behaviour has changed since the
 * battle was recorded.
 *
 * <p>A transcript is a list of lines: {@code R,n} starts round {@code n} with a new core,
 * then each tick is an {@code I} line followed by the {@code O} line the robot actually
 * issued. Blank lines and lines starting with {@code #} are ignored. See {@link LineCodec}.</p>
 */
public final class Replay {

    private Replay() {}

    /** One replayed tick. */
    public static final class Tick {
        private final int line;
        private final Input input;
        private final Orders recorded;
        private final Orders replayed;

        Tick(int line, Input input, Orders recorded, Orders replayed) {
            this.line = line;
            this.input = input;
            this.recorded = recorded;
            this.replayed = replayed;
        }

        /** @return the 1-based number of the {@code I} line in the transcript */
        public int line() { return line; }
        /** @return the tick's input */
        public Input input() { return input; }
        /** @return the orders the live robot issued */
        public Orders recorded() { return recorded; }
        /** @return the orders the core issues now for the same input */
        public Orders replayed() { return replayed; }
    }

    /**
     * Replays a transcript.
     *
     * @param lines the transcript's lines
     * @return one {@link Tick} per recorded tick, in order
     * @throws IllegalArgumentException if a line is malformed or an {@code I} line has no
     *     {@code O} line after it
     */
    public static List<Tick> run(List<String> lines) {
        List<Tick> ticks = new ArrayList<>();
        Guard guard = null;
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.isBlank() || line.startsWith("#")) continue;
            if (line.startsWith("R,")) {
                // A new round: a new core, as the robot builds one each round.
                guard = new Guard(new Core()::tick, Telemetry.NONE);
                guard.newRound();
            } else if (line.startsWith("I,")) {
                if (guard == null) throw new IllegalArgumentException("line " + (i + 1) + ": no R line before the first tick");
                if (i + 1 >= lines.size()) throw new IllegalArgumentException("line " + (i + 1) + ": no O line after the I line");
                Input in = LineCodec.decodeInput(line);
                Orders recorded = LineCodec.decodeOrders(lines.get(i + 1));
                ticks.add(new Tick(i + 1, in, recorded, guard.tick(in)));
                i++;
            } else {
                throw new IllegalArgumentException("line " + (i + 1) + ": unexpected '" + line + "'");
            }
        }
        return ticks;
    }
}
