package hadur2;

import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.replay.LineCodec;
import hadur2.core.replay.Replay;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import robocode.BattleEndedEvent;
import robocode.RoundEndedEvent;

/**
 * Hadur, plus a transcript of every input and order in {@link Replay}'s format. The bench
 * runs it with Robocode's security off to capture replay fixtures (CORE-2); it is left out
 * of the competition jar.
 *
 * <p>The transcript goes to the file named by the {@code hadur.record} system property.</p>
 *
 * <p>The transcript is the format {@link Replay#run} reads: an {@code F} line when the
 * battle starts, an {@code N} line at each round's start, then for every turn the
 * {@code I} line of the input the core was given and the {@code O} line of the orders it
 * returned, both from {@link LineCodec}. Replaying it through a fresh core must give the
 * same orders tick for tick (CORE-2).</p>
 *
 * <p>This class writes a file outside the data directory with plain {@code java.nio},
 * which Robocode's sandbox would forbid, hence security off. Any I/O failure is thrown
 * as {@code UncheckedIOException}.</p>
 */
public class HadurRecorder extends Hadur {

    /** The transcript for the whole battle; static, like the core, so it spans the rounds. */
    private static BufferedWriter writer;

    /** Opens the transcript and writes its {@code F} line: {@code F,width,height,enemies}. */
    @Override
    protected void battleStarted(double width, double height, int enemies) {
        try {
            writer = Files.newBufferedWriter(Path.of(System.getProperty("hadur.record")),
                StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        write("F," + width + "," + height + "," + enemies);
    }

    /** Writes {@code N,round}. */
    @Override
    protected void roundStarted(int round) {
        write("N," + round);
    }

    /** Writes the tick's {@code I} and {@code O} lines and flushes them. */
    @Override
    protected void ticked(BotInput in, BotOrders orders) {
        write(LineCodec.encode(in));
        write(LineCodec.encode(orders));
        // The engine can stop the robot's thread after the last round without another
        // event, so each tick goes to disk whole.
        flush();
    }

    /** The robot's own round-end handling, then a flush. */
    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        super.onRoundEnded(e);
        flush();
    }

    /** The robot's own battle-end handling, then a flush. */
    @Override
    public void onBattleEnded(BattleEndedEvent e) {
        super.onBattleEnded(e);
        flush();
    }

    /** Appends one line and a line separator. */
    private static void write(String line) {
        try {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** Pushes buffered lines to the file. */
    private static void flush() {
        try {
            writer.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
