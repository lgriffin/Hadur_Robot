package hadur2;

import hadur2.core.model.BotInput;
import hadur2.core.model.BotOrders;
import hadur2.core.replay.LineCodec;
import hadur2.core.replay.Replay;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import robocode.BattleEndedEvent;
import robocode.DeathEvent;
import robocode.RoundEndedEvent;
import robocode.SkippedTurnEvent;
import robocode.WinEvent;

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
 * <p>A0 (STRAND-4) adds the lines a replay needs to run the adapter's memory calls too, and
 * to check the files they leave. {@link Replay} ignores them; the tests' fixture replay
 * reads them. They are re-derived here, in the recorder's own handlers, from the same
 * getters and in the same order {@link Hadur} uses, so the shipped adapter is unchanged:</p>
 * <ul>
 * <li>{@code Q,quota} and one {@code D,name,lastModified,base64} per file in the data
 *     directory, before the {@code F} line: the store the battle started on;</li>
 * <li>{@code RE,tick,result,energy}: the adapter's one {@code roundEnded} call of a round
 *     (the guard's fault count is the replay's own);</li>
 * <li>{@code CP,tick}: the round-end checkpoint, made only while Hadur is alive;</li>
 * <li>{@code BE,tick} and {@code HE,rounds,survived,skippedTurns}: the battle-end save and
 *     the health record's arguments (faults again the replay's own);</li>
 * <li>one {@code S,name,base64} per file the battle left in the data directory.</li>
 * </ul>
 *
 * <p>This class writes a file outside the data directory with plain {@code java.nio},
 * which Robocode's sandbox would forbid, hence security off. Any I/O failure is thrown
 * as {@code UncheckedIOException}.</p>
 */
public class HadurRecorder extends Hadur {

    /** The transcript for the whole battle; static, like the core, so it spans the rounds. */
    private static BufferedWriter writer;
    /** Rounds reported, rounds not lost and skipped turns, as the adapter counts them (RES-8). */
    private static int rounds, survived, skipped;
    /** Whether this round's end has been written; the round's end can arrive by several events. */
    private boolean reported;

    /** On the battle's first round, opens the transcript and writes the store it starts on. */
    @Override
    public void run() {
        if (writer == null) {
            try {
                writer = Files.newBufferedWriter(Path.of(System.getProperty("hadur.record")),
                    StandardCharsets.UTF_8);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            writeStore("D");
        }
        super.run();
    }

    /** Writes the {@code F} line: {@code F,width,height,enemies}. */
    @Override
    protected void battleStarted(double width, double height, int enemies) {
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

    @Override
    public void onWin(WinEvent e) {
        roundEnd("win");
        super.onWin(e);
    }

    @Override
    public void onDeath(DeathEvent e) {
        roundEnd("loss");
        super.onDeath(e);
    }

    @Override
    public void onSkippedTurn(SkippedTurnEvent e) {
        skipped++;
        super.onSkippedTurn(e);
    }

    /** The robot's own round-end handling, recorded as the adapter makes it, then a flush. */
    @Override
    public void onRoundEnded(RoundEndedEvent e) {
        roundEnd(getEnergy() <= 0 ? "loss" : getOthers() == 0 ? "win" : "draw");
        if (getEnergy() > 0) write("CP," + getTime());
        super.onRoundEnded(e);
        flush();
    }

    /** The robot's own battle-end handling, then the files it left, then a flush. */
    @Override
    public void onBattleEnded(BattleEndedEvent e) {
        write("BE," + getTime());
        write("HE," + rounds + "," + survived + "," + skipped);
        super.onBattleEnded(e);
        writeStore("S");
        flush();
    }

    /** The adapter's {@code reportRound}: the first end-of-round event of a round counts. */
    private void roundEnd(String result) {
        if (reported) return;
        reported = true;
        rounds++;
        if (!"loss".equals(result)) survived++;
        write("RE," + getTime() + "," + result + "," + getEnergy());
    }

    /**
     * Writes every file in the data directory as {@code prefix,name,...,base64}; the
     * starting store ({@code D}) also carries the quota and each file's age.
     */
    private void writeStore(String prefix) {
        File dir = getDataDirectory();
        File[] files = dir == null ? null : dir.listFiles();
        List<File> plain = new ArrayList<>();
        long used = 0;
        if (files != null) {
            for (File f : files) {
                if (!f.isFile()) continue;
                plain.add(f);
                used += f.length();
            }
        }
        plain.sort((a, b) -> a.getName().compareTo(b.getName()));
        if ("D".equals(prefix)) write("Q," + (used + getDataQuotaAvailable()));
        for (File f : plain) {
            try {
                String bytes = Base64.getEncoder().encodeToString(Files.readAllBytes(f.toPath()));
                write("D".equals(prefix)
                    ? "D," + f.getName() + "," + f.lastModified() + "," + bytes
                    : "S," + f.getName() + "," + bytes);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }
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
