package hadur.bench;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
 *     every live bullet, in the artifact's line format, and an {@code F,round,turn,E,power}
 *     record when an enemy bullet first appears.</li>
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
    private int engineDisables;
    /** RES-9: ticks that ran in duress, from the R records. */
    private int duressTicks;
    private int roundRecords, faults, faultRecords, phantomWaves;
    /** Enemy bullets as the engine saw them, and the waves Hadur inferred (S2 wave fidelity). */
    private final List<double[]> enemyShots = new ArrayList<>();
    private final List<double[]> inferredWaves = new ArrayList<>();
    private int radarReacquired;
    private int hiddenShots;
    private int bulletsIntercepted;
    private int jitteredShots;
    private int shotsFired;
    private final Set<Integer> enemyBulletIds = new HashSet<>();
    private double ourHitRateSum, theirHitRateSum;
    /** Opponent memory (S3): whether the B record said a profile was found, failures, evictions. */
    private int profileFound, memoryFailures, seedsEvicted;
    /** Recognise and adapt (S4): tiers and seed sizes at the first scan, the opening gun, seed decays. */
    private String tiers = "-", openingGun = "-";
    private int gunSeed, surfSeed, seedDecays;
    /** Aggressive (S5): the opening's distance, per-round mean distances, the last target, round lengths, endgame and full-power counts. */
    private String openingDistance = "-";
    private double distanceSum, targetDistance = Double.NaN;
    private int distanceRounds;
    private long roundTicks;
    private int finishTicks, ramTicks, fullPowerShots;
    /** Unhittable (S6): the highest computation level, slow ticks, shadows, intercepts in a shadow, flavour changes and the step reached. */
    private int maxLevel, slowTicks, shadowedWaves, interceptsShadowed, flavourChanges, flavourStep;

    /** One round as the harness saw it: engine truth per turn, plus the fields of Hadur's R record when one arrived (G3). */
    public static final class RoundRow {
        public final int round;
        public long ticks;
        public double damageDealt, damageTaken;
        public boolean alive;
        public int skips;
        /** From the R record; {@code hasRecord} is false when it never arrived. */
        public boolean hasRecord, won;
        public double ourHitRate = Double.NaN;
        public int duressTicks;

        RoundRow(int round) {
            this.round = round;
        }
    }

    private final java.util.TreeMap<Integer, RoundRow> roundRows = new java.util.TreeMap<>();
    private volatile boolean battleFinished;
    private volatile long lastEventNanos = System.nanoTime();

    private RoundRow row(int r) {
        return roundRows.computeIfAbsent(r, RoundRow::new);
    }

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
        enemyBulletIds.clear();
        lastTurnNanos = System.nanoTime();
    }

    @Override
    public void onTurnEnded(TurnEndedEvent e) {
        long now = System.nanoTime();
        if (turns == turnNanos.length) turnNanos = Arrays.copyOf(turnNanos, turns * 2);
        turnNanos[turns++] = now - lastTurnNanos;
        lastTurnNanos = now;

        lastEventNanos = now;
        ITurnSnapshot snap = e.getTurnSnapshot();
        int turn = snap.getTurn();
        IRobotSnapshot me = null, enemy = null;
        for (IRobotSnapshot r : snap.getRobots()) {
            if (r.getName().equals(us)) me = r;
            else enemy = r;
        }
        if (me != null && enemy != null) {
            noteTurn(round, turn, me.getScoreSnapshot().getCurrentBulletDamageScore(),
                enemy.getScoreSnapshot().getCurrentBulletDamageScore(),
                me.getState() != robocode.control.snapshot.RobotState.DEAD);
        }
        try {
            if (me != null) harvestConsole(me, turn);
            if (me != null && enemy != null) writeTruth(snap, me, enemy, turn);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    /** The latest turn of {@code round} wins: damage so far, whether we are alive, and the tick count. */
    void noteTurn(int round, int turn, double dealt, double taken, boolean alive) {
        RoundRow r = row(round);
        r.ticks = Math.max(r.ticks, turn + 1L);
        r.damageDealt = dealt;
        r.damageTaken = taken;
        r.alive = alive;
    }

    @Override
    public void onBattleFinished(robocode.control.events.BattleFinishedEvent e) {
        battleFinished = true;
        lastEventNanos = System.nanoTime();
    }

    /**
     * G14: waits, up to {@code maxMillis}, until the engine has announced the battle's end and
     * no turn has been reported for {@code quietMillis}, so nothing still in flight is lost
     * when the log is read. Returns whether it saw the battle finish.
     */
    public boolean awaitDrain(long maxMillis, long quietMillis) throws InterruptedException {
        long deadline = System.nanoTime() + maxMillis * 1_000_000L;
        while (System.nanoTime() < deadline) {
            if (battleFinished && System.nanoTime() - lastEventNanos >= quietMillis * 1_000_000L) return true;
            Thread.sleep(10);
        }
        return battleFinished;
    }

    /** The per-round rows, in round order. */
    public List<RoundRow> rounds() {
        return new ArrayList<>(roundRows.values());
    }

    /** G14: true when rounds were played but the last round's R record never arrived. */
    public boolean finalRecordMissing(int rounds) {
        RoundRow last = roundRows.get(rounds - 1);
        return rounds > 0 && (last == null || !last.hasRecord);
    }

    private void harvestConsole(IRobotSnapshot me, int turn) throws IOException {
        String out = me.getOutputStreamSnapshot();
        if (out == null || out.isEmpty()) return;
        for (String line : out.split("\\R")) {
            if (line.isEmpty()) continue;
            // The engine announces each skipped turn as "SYSTEM: <robot> skipped turn <n>".
            if (line.startsWith("SYSTEM:") && line.contains("skipped turn")) {
                skippedTurns++;
                row(round).skips++;
            }
            // BENCH-6: the engine switching the robot off for being too slow or silent.
            if (line.startsWith("SYSTEM:") && (line.contains("Robot disabled")
                    || line.contains("not performed any actions"))) engineDisables++;
            readRecord(line);
            hadurLog.write(round + "," + turn + "," + line + "\n");
        }
    }

    /** Reads Hadur's own R and FAULT records so the report can show them (RES-5). */
    void readRecord(String line) {
        if (line.startsWith("FAULT,")) {
            faultRecords++;
        } else if (line.startsWith("B,")) {
            // B,round,tick,battle,exactName,lineageKey,found,tiers,gunSeed,surfSeed,level
            String[] f = line.split(",");
            if (f.length >= 7 && f[6].equals("1")) profileFound = 1;
            if (f.length >= 10 && tiers.equals("-")) {
                tiers = f[7];
                try {
                    gunSeed = Integer.parseInt(f[8]);
                    surfSeed = Integer.parseInt(f[9]);
                } catch (NumberFormatException ignored) {
                    // Sizes stay 0.
                }
            }
        } else if (line.startsWith("P,")) {
            // P,round,tick,policy,value,margin,setting: the opening gun is "<tier>:<gun>".
            String[] f = line.split(",");
            if (f.length >= 7 && f[3].equals("opening-gun") && openingGun.equals("-")) {
                int colon = f[6].indexOf(':');
                openingGun = colon < 0 ? f[6] : f[6].substring(colon + 1);
            }
            // S5: the opening's distance is "<tier>:<px>"; later distance records are steps.
            if (f.length >= 7 && f[3].equals("distance") && openingDistance.equals("-")
                    && f[6].indexOf(':') >= 0) {
                openingDistance = f[6].substring(f[6].indexOf(':') + 1);
            }
        } else if (line.startsWith("MEM,")) {
            // MEM,round,tick,event,detail: every memory failure writes one (MEM-4, RES-5).
            String[] f = line.split(",");
            if (f.length >= 4 && !f[3].equals("written_without_seeds")) memoryFailures++;
        } else if (line.startsWith("EW,")) {
            // EW,round,tick,waveId,fireTick,rawDrop,correctedDrop,power,distance
            String[] f = line.split(",");
            if (f.length < 8) return;
            try {
                inferredWaves.add(new double[] {Integer.parseInt(f[1]), Long.parseLong(f[4]),
                    Double.parseDouble(f[7])});
            } catch (NumberFormatException ignored) {
                // A malformed record is left out of the fidelity count.
            }
        } else if (line.startsWith("R,")) {
            String[] f = line.split(",");
            if (f.length < 14) return;
            try {
                ourHitRateSum += Double.parseDouble(f[6]);
                theirHitRateSum += Double.parseDouble(f[8]);
                faults += Integer.parseInt(f[12]);
                phantomWaves += Integer.parseInt(f[10]);
                if (f.length >= 16) {
                    radarReacquired += Integer.parseInt(f[14]);
                    hiddenShots += Integer.parseInt(f[15]);
                }
                if (f.length >= 19) {
                    // Battle totals so far, so the last R record holds the battle's.
                    seedsEvicted = Math.max(seedsEvicted, Integer.parseInt(f[18]));
                }
                if (f.length >= 22) {
                    bulletsIntercepted += Integer.parseInt(f[19]);
                    jitteredShots += Integer.parseInt(f[20]);
                    shotsFired += Integer.parseInt(f[21]);
                }
                if (f.length >= 23) seedDecays = Math.max(seedDecays, Integer.parseInt(f[22]));
                roundTicks += Long.parseLong(f[2]);
                if (f.length >= 28) {
                    double mean = Double.parseDouble(f[23]);
                    if (!Double.isNaN(mean)) {
                        distanceSum += mean;
                        distanceRounds++;
                    }
                    targetDistance = Double.parseDouble(f[24]);
                    finishTicks += Integer.parseInt(f[25]);
                    ramTicks += Integer.parseInt(f[26]);
                    fullPowerShots += Integer.parseInt(f[27]);
                }
                if (f.length >= 33) {
                    maxLevel = Math.max(maxLevel, Integer.parseInt(f[13]));
                    slowTicks += Integer.parseInt(f[28]);
                    shadowedWaves += Integer.parseInt(f[29]);
                    flavourChanges += Integer.parseInt(f[30]);
                    flavourStep = Math.max(flavourStep, Integer.parseInt(f[31]));
                    interceptsShadowed += Integer.parseInt(f[32]);
                }
                int duress = f.length >= 34 ? Integer.parseInt(f[33]) : 0;
                duressTicks += duress;
                RoundRow rr = row(Integer.parseInt(f[1]));
                rr.hasRecord = true;
                rr.won = f[3].equals("win");
                rr.ourHitRate = Double.parseDouble(f[6]);
                rr.duressTicks = duress;
                roundRecords++;
            } catch (NumberFormatException ignored) {
                // A malformed record is left out of the averages.
            }
        }
    }

    private void writeTruth(ITurnSnapshot snap, IRobotSnapshot me, IRobotSnapshot enemy,
                            int turn) throws IOException {
        StringBuilder spawns = new StringBuilder();
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
            if (owner.equals("E") && enemyBulletIds.add(bullet.getBulletId())) {
                // {round, turn, power, disabled}: disabled marks a shot fired while either
                // robot was disabled, which a scan may never reveal.
                enemyShots.add(new double[] {round, turn, bullet.getPower(),
                    me.getEnergy() <= 0 || enemy.getEnergy() <= 0 ? 1 : 0});
                spawns.append("F,").append(round).append(',').append(turn).append(",E,")
                    .append(f(bullet.getPower())).append('\n');
            }
            b.append(owner).append(':').append(f(bullet.getX())).append(':')
             .append(f(bullet.getY())).append(':').append(f(bullet.getHeading())).append(':')
             .append(f(bullet.getPower()));
        }
        truthLog.write(b.append('\n').toString());
        truthLog.write(spawns.toString());
    }

    private static void appendRobot(StringBuilder b, IRobotSnapshot r) {
        b.append(',').append(f(r.getX())).append(',').append(f(r.getY()))
         .append(',').append(f(r.getBodyHeading())).append(',').append(f(r.getVelocity()))
         .append(',').append(f(r.getEnergy()));
    }

    private static String f(double d) {
        return String.format(Locale.ROOT, "%.2f", d);
    }

    /** S5: the opening's starting distance, "-" before S5 or without memory. */
    public String openingDistance() {
        return openingDistance;
    }

    /** S5: the mean of each round's mean scan distance; NaN without S5 R records. */
    public double meanDistance() {
        return distanceRounds == 0 ? Double.NaN : distanceSum / distanceRounds;
    }

    /** S5: the distance controller's target when the last round ended. */
    public double targetDistance() {
        return targetDistance;
    }

    /** Mean round length in ticks, from the R records. */
    public double roundTicks() {
        return roundRecords == 0 ? Double.NaN : (double) roundTicks / roundRecords;
    }

    public int finishTicks() {
        return finishTicks;
    }

    public int ramTicks() {
        return ramTicks;
    }

    public int fullPowerShots() {
        return fullPowerShots;
    }

    public int maxLevel() {
        return maxLevel;
    }

    public int slowTicks() {
        return slowTicks;
    }

    public int shadowedWaves() {
        return shadowedWaves;
    }

    public int interceptsShadowed() {
        return interceptsShadowed;
    }

    public int flavourChanges() {
        return flavourChanges;
    }

    public int flavourStep() {
        return flavourStep;
    }

    public String tiers() {
        return tiers;
    }

    public String openingGun() {
        return openingGun;
    }

    public int gunSeed() {
        return gunSeed;
    }

    public int surfSeed() {
        return surfSeed;
    }

    public int seedDecays() {
        return seedDecays;
    }

    public int profileFound() {
        return profileFound;
    }

    public int memoryFailures() {
        return memoryFailures;
    }

    public int seedsEvicted() {
        return seedsEvicted;
    }

    public int turns() {
        return turns;
    }

    public int skippedTurns() {
        return skippedTurns;
    }

    /** Ledger phantom waves Hadur reported in its R records. */
    public int phantomWaves() {
        return phantomWaves;
    }

    /**
     * Enemy bullets fired while Hadur or the enemy was disabled that no inferred wave
     * matched: a disabled robot is still scanned, so some of these are seen, but a shot
     * fired while Hadur is disabled, or just before a round ends, cannot be.
     */
    public int unseenShots() {
        boolean[] matched = WaveMatcher.matchedShots(enemyShots, inferredWaves);
        int unseen = 0;
        for (int i = 0; i < matched.length; i++) {
            if (!matched[i] && enemyShots.get(i)[3] == 1) unseen++;
        }
        return unseen;
    }

    /** Enemy bullets the engine fired, from the ground truth, less the unseen ones. */
    public int enemyShots() {
        return enemyShots.size() - unseenShots();
    }

    /** Ticks Hadur's radar spent sweeping for a lost enemy (RADAR-1), from its R records. */
    public int radarReacquired() {
        return radarReacquired;
    }

    /** Shots the ledger found that the raw energy drop hid (WAVE-1), from its R records. */
    public int hiddenShots() {
        return hiddenShots;
    }

    /** Our bullets destroyed by enemy bullets (SHIELD-1). */
    public int bulletsIntercepted() {
        return bulletsIntercepted;
    }

    /** Shots fired with an anti-shield aim offset (SHIELD-2). */
    public int jitteredShots() {
        return jitteredShots;
    }

    /** Shots Hadur fired, from its R records. */
    public int shotsFired() {
        return shotsFired;
    }

    /** Enemy waves Hadur inferred (EW records). */
    public int inferredWaves() {
        return inferredWaves.size();
    }

    /**
     * Inferred waves that match a real enemy bullet: same round, fired within
     * {@link WaveMatcher#TICK_WINDOW} turns of the inferred fire tick, and a power within
     * {@link WaveMatcher#POWER_TOLERANCE}.
     */
    public int matchedWaves() {
        return WaveMatcher.match(enemyShots, inferredWaves);
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

    /** RES-9: ticks the robot ran in duress, summed over its R records. */
    public int duressTicks() {
        return duressTicks;
    }

    /** BENCH-6: how many times the engine disabled the robot (too many skipped turns, or no actions). */
    public int engineDisables() {
        return engineDisables;
    }

    public void close() throws IOException {
        hadurLog.close();
        truthLog.close();
    }
}
