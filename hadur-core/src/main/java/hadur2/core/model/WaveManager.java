package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;
import java.util.*;

/**
 * The waves in flight on one side of the duel, and the bookkeeping that decides when each
 * one has passed its target.
 *
 * <p>The core keeps two. {@code HadurCore}'s gun wave manager holds a wave from us at the
 * enemy for every scan, real or virtual; when one breaks, the gun logs where the enemy went
 * and scores the virtual guns. {@code MoveController}'s holds a wave from the enemy at us for
 * every scan; the one whose fire time matches a shot the energy ledger found becomes a
 * firing wave (WAVE-1, WAVE-2), and only firing waves are surfed and, when they break,
 * logged as where the enemy aimed. Waves are kept in the order they were added, which is
 * fire-time order.</p>
 *
 * <p>A wave can only be judged against the target's states during its flight, and scans do
 * not arrive every tick. So every scan's target state is added to a per-wave
 * {@link RobotStateLog}, and when the wave is gone the log fills in the missing ticks by
 * interpolation to recover every tick on which the wave was crossing the target. That log
 * is dropped with its wave, so it holds at most one wave's flight (RES-2); the list itself
 * is cleared each round.</p>
 */
public class WaveManager {

    /**
     * Pixels of slack when matching a bullet to the wave that carried it: a wave matches
     * if the bullet lies within this distance of the wave's front, measured along the line
     * from the wave's source.
     */
    private static final int WAVE_MATCH_THRESHOLD = 50;

    /** The waves in flight, in the order they were added. */
    private final List<Wave> waves = new ArrayList<>();
    /** The target's states during each wave's flight; one entry per active wave at most. */
    private final Map<Wave, RobotStateLog> stateLogs = new HashMap<>();

    /** Forgets every wave and its states, at the start of a round. */
    public void initRound() {
        waves.clear();
        stateLogs.clear();
    }

    /** Adds a wave; it is checked from the next call to {@link #checkActiveWaves} on. */
    public void addWave(Wave wave) {
        waves.add(wave);
    }

    /**
     * Advances every wave to {@code currentTime}: records the target's state in each wave's
     * log, and hands each wave that has now completely passed the target to
     * {@code listener}, with the states during which it was crossing the target, before
     * removing it.
     *
     * @param currentTime the current tick
     * @param lastScanState the target's latest state; nothing happens unless it is from
     *     {@code currentTime}
     * @param listener told about each wave that broke, once
     */
    public void checkActiveWaves(long currentTime, RobotState lastScanState,
                                  WaveBreakListener listener) {
        // Only a state from this very tick is logged and judged. Both callers pass one (the
        // gun at each scan, the movement with our own position each tick), so ticks in
        // between are filled in by interpolation when a wave breaks.
        if (lastScanState.time != currentTime) return;

        Iterator<Wave> it = waves.iterator();
        while (it.hasNext()) {
            Wave w = it.next();
            addRobotState(w, lastScanState);
            // GONE: every corner of the target's box is inside the wave's current radius, so
            // no bullet on this wave can still touch it.
            if (w.checkWavePosition(lastScanState) == Wave.WavePosition.GONE) {
                List<RobotState> breakStates = getWaveBreakStates(w, currentTime);
                listener.onWaveBreak(w, breakStates);
                it.remove();
                // RES-2: the wave's state log goes with it.
                stateLogs.remove(w);
            }
        }
    }

    /** Records {@code state} in {@code w}'s own log of its target, creating the log if needed. */
    void addRobotState(Wave w, RobotState state) {
        RobotStateLog log = stateLogs.computeIfAbsent(w, k -> new RobotStateLog());
        log.addState(state);
    }

    /**
     * The target's states, one per tick from the wave's fire time to the tick before
     * {@code currentTime}, on which the wave was breaking (touching the target's box):
     * {@link Wave.WavePosition#BREAKING_FRONT} or {@link Wave.WavePosition#BREAKING_CENTER}.
     * Unobserved ticks are interpolated from the wave's log; ticks that cannot be are left
     * out. These are the states {@link Wave#preciseIntersection} turns into the range of
     * firing angles that would have hit.
     */
    List<RobotState> getWaveBreakStates(Wave w, long currentTime) {
        List<RobotState> breakStates = new ArrayList<>();
        RobotStateLog log = stateLogs.get(w);
        if (log == null) return breakStates;

        for (long time = w.fireTime; time < currentTime; time++) {
            RobotState state = log.getState(time);
            if (state != null && w.checkWavePosition(state).isBreaking()) {
                breakStates.add(state);
            }
        }
        return breakStates;
    }

    /**
     * The wave most likely to have carried a bullet seen at {@code targetLocation}: of the
     * waves that pass the filters, the one whose front at {@code currentTime} is nearest the
     * bullet, within 50 pixels ({@code WAVE_MATCH_THRESHOLD}). The core uses it to tie a bullet
     * that hit us, or hit one of ours, back to the enemy wave that fired it.
     *
     * @param targetLocation where the bullet was, pixels
     * @param currentTime the current tick
     * @param onlyFiring whether to consider firing waves only
     * @param botName the firer's name; null or empty matches any
     * @param bulletPower the bullet's power, matched to within 0.001; -1 matches any
     * @return the closest wave, or null when none is within the threshold
     */
    public Wave findClosestWave(Point2D.Double targetLocation, long currentTime,
                                boolean onlyFiring, String botName, double bulletPower) {
        double closestDistance = Double.POSITIVE_INFINITY;
        Wave closestWave = null;
        for (Wave w : waves) {
            if (w.altWave) continue;
            if (onlyFiring && !w.firingWave) continue;
            if (bulletPower != -1 && Math.abs(bulletPower - w.bulletPower()) >= 0.001) continue;
            if (botName != null && !botName.equals(w.botName) && !botName.isEmpty()) continue;

            // Compare squared distances first, so waves out of range cost no square root: the
            // bullet must sit in the ring of radius waveDistTraveled +/- the threshold.
            double targetDistSq = w.sourceLocation.distanceSq(targetLocation);
            double waveDistTraveled = w.distanceTraveled(currentTime);
            if (targetDistSq >= DiaUtils.square(waveDistTraveled + WAVE_MATCH_THRESHOLD)) continue;
            if (targetDistSq <= DiaUtils.square(Math.max(0, waveDistTraveled - WAVE_MATCH_THRESHOLD))) continue;

            double dist = Math.abs(Math.sqrt(targetDistSq) - waveDistTraveled);
            if (dist < closestDistance) {
                closestDistance = dist;
                closestWave = w;
            }
        }
        return closestWave;
    }

    /**
     * The {@code surfIndex}-th wave (0 = the oldest) that is still worth dodging: a firing
     * wave whose bullet has not already hit us or been shot down, and which has not reached
     * {@code unsurfablePosition} relative to {@code targetState}. The surf asks with
     * {@link Wave.WavePosition#BREAKING_CENTER}, so it stops dodging a wave once the wave is
     * past our centre and turns to the next one.
     *
     * @param surfIndex which surfable wave, counting from the oldest
     * @param targetState our state, usually now or predicted
     * @param unsurfablePosition the first position at which a wave is no longer surfable
     * @return the wave, or null when there are not that many surfable waves
     */
    public Wave findSurfableWave(int surfIndex, RobotState targetState,
                                  Wave.WavePosition unsurfablePosition) {
        int searchIndex = 0;
        for (Wave w : waves) {
            if (!w.firingWave || w.processedBulletHit()) continue;
            // Passing the limit as the maximum lets the check stop early: it never needs to
            // tell BREAKING_CENTER from GONE when both mean "no longer surfable".
            Wave.WavePosition pos = w.checkWavePosition(targetState, unsurfablePosition);
            if (pos.getIndex() >= unsurfablePosition.getIndex()) continue;
            if (searchIndex == surfIndex) return w;
            searchIndex++;
        }
        return null;
    }

    /**
     * The first wave fired at {@code fireTime}, or null. The movement side uses it to turn
     * the wave of the tick the ledger says the enemy fired on into a firing wave.
     */
    public Wave getWaveByFireTime(long fireTime) {
        for (Wave w : waves) {
            if (w.fireTime == fireTime) return w;
        }
        return null;
    }

    /**
     * The {@code x}-th most recently added wave, 0 being the newest; throws
     * {@link IndexOutOfBoundsException} when there are not that many.
     */
    public Wave getPastWave(int x) {
        return waves.get(waves.size() - 1 - x);
    }

    /** The latest fire time of any wave that is not an alternative wave, or -1 without one. */
    public long getLastFireTime() {
        long last = -1;
        for (Wave w : waves) {
            if (!w.altWave && w.fireTime > last) last = w.fireTime;
        }
        return last;
    }

    /** Calls {@code listener} with every wave in flight, oldest first. */
    public void forAllWaves(AllWaveListener listener) {
        for (Wave w : waves) {
            listener.onWave(w);
        }
    }

    /** Calls {@code listener} with every wave fired at {@code currentTime}. */
    public void checkCurrentWaves(long currentTime, CurrentWaveListener listener) {
        for (Wave w : waves) {
            if (w.fireTime == currentTime) listener.onCurrentWave(w);
        }
    }

    /** Per-wave state logs held; one per active wave at most (RES-2). */
    int stateLogCount() {
        return stateLogs.size();
    }

    /** Waves in flight. */
    public int size() {
        return waves.size();
    }

    /** Told when a wave has completely passed its target. */
    public interface WaveBreakListener {
        /**
         * Called once, just before the wave is removed.
         *
         * @param w the wave that broke
         * @param waveBreakStates the target's states on the ticks the wave was crossing it,
         *     in time order; empty when none could be recovered
         */
        void onWaveBreak(Wave w, List<RobotState> waveBreakStates);
    }

    /** Receives each wave from {@link #forAllWaves}. */
    public interface AllWaveListener {
        /**
         * Called once per wave in flight.
         *
         * @param w the wave
         */
        void onWave(Wave w);
    }

    /** Receives each wave from {@link #checkCurrentWaves}. */
    public interface CurrentWaveListener {
        /**
         * Called once per wave fired this tick.
         *
         * @param w the wave
         */
        void onCurrentWave(Wave w);
    }
}
