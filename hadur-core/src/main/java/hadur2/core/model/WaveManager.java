package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;
import java.util.*;

public class WaveManager {

    private static final int WAVE_MATCH_THRESHOLD = 50;

    private final List<Wave> waves = new ArrayList<>();
    private final Map<Wave, RobotStateLog> stateLogs = new HashMap<>();

    public void initRound() {
        waves.clear();
        stateLogs.clear();
    }

    public void addWave(Wave wave) {
        waves.add(wave);
    }

    public void checkActiveWaves(long currentTime, RobotState lastScanState,
                                  WaveBreakListener listener) {
        if (lastScanState.time != currentTime) return;

        Iterator<Wave> it = waves.iterator();
        while (it.hasNext()) {
            Wave w = it.next();
            addRobotState(w, lastScanState);
            if (w.checkWavePosition(lastScanState) == Wave.WavePosition.GONE) {
                List<RobotState> breakStates = getWaveBreakStates(w, currentTime);
                listener.onWaveBreak(w, breakStates);
                it.remove();
                stateLogs.remove(w);
            }
        }
    }

    void addRobotState(Wave w, RobotState state) {
        RobotStateLog log = stateLogs.computeIfAbsent(w, k -> new RobotStateLog());
        log.addState(state);
    }

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

    public Wave findClosestWave(Point2D.Double targetLocation, long currentTime,
                                boolean onlyFiring, String botName, double bulletPower) {
        double closestDistance = Double.POSITIVE_INFINITY;
        Wave closestWave = null;
        for (Wave w : waves) {
            if (w.altWave) continue;
            if (onlyFiring && !w.firingWave) continue;
            if (bulletPower != -1 && Math.abs(bulletPower - w.bulletPower()) >= 0.001) continue;
            if (botName != null && !botName.equals(w.botName) && !botName.isEmpty()) continue;

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

    public Wave findSurfableWave(int surfIndex, RobotState targetState,
                                  Wave.WavePosition unsurfablePosition) {
        int searchIndex = 0;
        for (Wave w : waves) {
            if (!w.firingWave || w.processedBulletHit()) continue;
            Wave.WavePosition pos = w.checkWavePosition(targetState, unsurfablePosition);
            if (pos.getIndex() >= unsurfablePosition.getIndex()) continue;
            if (searchIndex == surfIndex) return w;
            searchIndex++;
        }
        return null;
    }

    public Wave getWaveByFireTime(long fireTime) {
        for (Wave w : waves) {
            if (w.fireTime == fireTime) return w;
        }
        return null;
    }

    public Wave getPastWave(int x) {
        return waves.get(waves.size() - 1 - x);
    }

    public long getLastFireTime() {
        long last = -1;
        for (Wave w : waves) {
            if (!w.altWave && w.fireTime > last) last = w.fireTime;
        }
        return last;
    }

    public void forAllWaves(AllWaveListener listener) {
        for (Wave w : waves) {
            listener.onWave(w);
        }
    }

    public void checkCurrentWaves(long currentTime, CurrentWaveListener listener) {
        for (Wave w : waves) {
            if (w.fireTime == currentTime) listener.onCurrentWave(w);
        }
    }

    public int size() {
        return waves.size();
    }

    public interface WaveBreakListener {
        void onWaveBreak(Wave w, List<RobotState> waveBreakStates);
    }

    public interface AllWaveListener {
        void onWave(Wave w);
    }

    public interface CurrentWaveListener {
        void onCurrentWave(Wave w);
    }
}
