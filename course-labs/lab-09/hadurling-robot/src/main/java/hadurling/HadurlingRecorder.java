package hadurling;

import hadurling.core.model.Input;
import hadurling.core.model.Orders;
import hadurling.core.replay.LineCodec;
import java.io.IOException;
import java.io.PrintWriter;
import robocode.RobocodeFileWriter;
import robocode.RoundEndedEvent;

/**
 * Hadurling with a tape recorder. It fights exactly as {@link Hadurling} does and also writes
 * every tick's {@code Input} and {@code Orders} to {@code transcript.txt} in its data folder,
 * in the format of {@link LineCodec}. Copy the file into a core module's
 * {@code src/test/resources/replay/} and a real battle becomes a replay test.
 *
 * <p>Robocode gives a robot a small data quota (200 KB by default), so a long battle is cut
 * short: record two or three rounds. The recorder lives in the same jar as the robot; it
 * is a second robot, {@code hadurling.HadurlingRecorder}, with its own properties file.</p>
 */
public class HadurlingRecorder extends Hadurling {

    private PrintWriter tape;

    @Override
    protected void roundStarted(int round) {
        try {
            // Append, so one battle's rounds end up in one file. A second battle adds to it:
            // delete the file between battles.
            tape = new PrintWriter(new RobocodeFileWriter(getDataFile("transcript.txt").getPath(), true));
            tape.println("R," + round);
        } catch (IOException e) {
            out.println("recorder: " + e);
            tape = null;
        }
    }

    @Override
    protected void ticked(Input in, Orders orders) {
        if (tape == null) return;
        tape.println(LineCodec.encode(in));
        tape.println(LineCodec.encode(orders));
    }

    /**
     * Flushes the tape. Writing to a file is allowed here but not in {@code run()} after
     * the round has ended, so this is where it is closed.
     *
     * @param e the engine's report
     */
    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        if (tape != null) {
            tape.close();
            tape = null;
        }
    }
}
