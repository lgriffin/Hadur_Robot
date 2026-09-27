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
 */
public class HadurRecorder extends Hadur {

    private static BufferedWriter writer;

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

    @Override
    protected void roundStarted(int round) {
        write("N," + round);
    }

    @Override
    protected void ticked(BotInput in, BotOrders orders) {
        write(LineCodec.encode(in));
        write(LineCodec.encode(orders));
        // The engine can stop the robot's thread after the last round without another
        // event, so each tick goes to disk whole.
        flush();
    }

    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        super.onRoundEnded(e);
        flush();
    }

    @Override
    public void onBattleEnded(BattleEndedEvent e) {
        super.onBattleEnded(e);
        flush();
    }

    private static void write(String line) {
        try {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static void flush() {
        try {
            writer.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
