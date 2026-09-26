package hadur.bench;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;
import robocode.control.events.BattleAdaptor;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.snapshot.BulletState;
import robocode.control.snapshot.IBulletSnapshot;
import robocode.control.snapshot.IRobotSnapshot;
import robocode.control.snapshot.ITurnSnapshot;

/**
 * Collects what a battle looked like from the outside.
 *
 * <ul>
 * <li>{@code hadur.log}: every line Hadur printed, prefixed with round and turn.</li>
 * <li>{@code truth.log.gz}: one {@code T} record per turn with both robots' true state and
 *     every live bullet, in the artifact's line format.</li>
 * </ul>
 *
 * <p>Also measures wall-clock time per turn and counts skipped turns reported in Hadur's
 * console output.</p>
 */
public class LogHarvester extends BattleAdaptor {

    private final String us;
    private final BufferedWriter hadurLog;
    private final BufferedWriter truthLog;
    private int round;
    private long lastTurnNanos;
    private long[] turnNanos = new long[4096];
    private int turns;
    private int skippedTurns;
    private int roundRecords, faults, faultRecords;
    private double ourHitRateSum, theirHitRateSum;

    public LogHarvester(Path dir, String us) throws IOException {
        this.us = us;
        this.hadurLog = Files.newBufferedWriter(dir.resolve("hadur.log"), StandardCharsets.UTF_8);
        this.truthLog = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(
            Files.newOutputStream(dir.resolve("truth.log.gz"))), StandardCharsets.UTF_8));
        truthLog.write("V,1\n");
    }

    @Override
    public void onRoundStarted(RoundStartedEvent e) {
        round = e.getRound();
        lastTurnNanos = System.nanoTime();
    }

    @Override
    public void onTurnEnded(TurnEndedEvent e) {
        long now = System.nanoTime();
        if (turns == turnNanos.length) turnNanos = Arrays.copyOf(turnNanos, turns * 2);
        turnNanos[turns++] = now - lastTurnNanos;
        lastTurnNanos = now;

        ITurnSnapshot snap = e.getTurnSnapshot();
        int turn = snap.getTurn();
        IRobotSnapshot me = null, enemy = null;
        for (IRobotSnapshot r : snap.getRobots()) {
            if (r.getName().equals(us)) me = r;
            else enemy = r;
        }
        try {
            if (me != null) harvestConsole(me, turn);
            if (me != null && enemy != null) writeTruth(snap, me, enemy, turn);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    private void harvestConsole(IRobotSnapshot me, int turn) throws IOException {
        String out = me.getOutputStreamSnapshot();
        if (out == null || out.isEmpty()) return;
        for (String line : out.split("\\R")) {
            if (line.isEmpty()) continue;
            // The engine announces each skipped turn as "SYSTEM: <robot> skipped turn <n>".
            if (line.startsWith("SYSTEM:") && line.contains("skipped turn")) skippedTurns++;
            readRecord(line);
            hadurLog.write(round + "," + turn + "," + line + "\n");
        }
    }

    /** Reads Hadur's own R and FAULT records so the report can show them (RES-5). */
    private void readRecord(String line) {
        if (line.startsWith("FAULT,")) {
            faultRecords++;
        } else if (line.startsWith("R,")) {
            String[] f = line.split(",");
            if (f.length < 14) return;
            try {
                ourHitRateSum += Double.parseDouble(f[6]);
                theirHitRateSum += Double.parseDouble(f[8]);
                faults += Integer.parseInt(f[12]);
                roundRecords++;
            } catch (NumberFormatException ignored) {
                // A malformed record is left out of the averages.
            }
        }
    }

    private void writeTruth(ITurnSnapshot snap, IRobotSnapshot me, IRobotSnapshot enemy,
                            int turn) throws IOException {
        StringBuilder b = new StringBuilder("T,").append(round).append(',').append(turn);
        appendRobot(b, me);
        appendRobot(b, enemy);
        b.append(',');
        boolean first = true;
        for (IBulletSnapshot bullet : snap.getBullets()) {
            if (bullet.getState() != BulletState.FIRED && bullet.getState() != BulletState.MOVING) {
                continue;
            }
            if (!first) b.append(' ');
            first = false;
            String owner = bullet.getOwnerIndex() == me.getRobotIndex() ? "H" : "E";
            b.append(owner).append(':').append(f(bullet.getX())).append(':')
             .append(f(bullet.getY())).append(':').append(f(bullet.getHeading())).append(':')
             .append(f(bullet.getPower()));
        }
        truthLog.write(b.append('\n').toString());
    }

    private static void appendRobot(StringBuilder b, IRobotSnapshot r) {
        b.append(',').append(f(r.getX())).append(',').append(f(r.getY()))
         .append(',').append(f(r.getBodyHeading())).append(',').append(f(r.getVelocity()))
         .append(',').append(f(r.getEnergy()));
    }

    private static String f(double d) {
        return String.format(Locale.ROOT, "%.2f", d);
    }

    public int turns() {
        return turns;
    }

    public int skippedTurns() {
        return skippedTurns;
    }

    /** Rounds that ended with an R record. */
    public int roundRecords() {
        return roundRecords;
    }

    /** Ticks the guard covered for a failing core, summed over R records. */
    public int faults() {
        return faults;
    }

    /** FAULT records: at most one per round. */
    public int faultRecords() {
        return faultRecords;
    }

    /** Mean of the per-round hit rates Hadur reported, or NaN with no R records. */
    public double ourHitRate() {
        return roundRecords == 0 ? Double.NaN : ourHitRateSum / roundRecords;
    }

    public double theirHitRate() {
        return roundRecords == 0 ? Double.NaN : theirHitRateSum / roundRecords;
    }

    /** Wall-clock milliseconds per turn at percentile {@code p} (1.0 = max). */
    public double turnMillisPercentile(double p) {
        if (turns == 0) return 0;
        long[] sorted = Arrays.copyOf(turnNanos, turns);
        Arrays.sort(sorted);
        int i = (int) Math.min(turns - 1, Math.ceil(p * turns) - 1);
        return sorted[Math.max(0, i)] / 1e6;
    }

    public void close() throws IOException {
        hadurLog.close();
        truthLog.close();
    }
}
