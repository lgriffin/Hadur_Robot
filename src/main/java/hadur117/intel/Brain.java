package hadur117.intel;

import hadur117.model.BattleMode;
import hadur117.model.MovementType;
import hadur117.model.OpponentData;
import hadur117.model.Snapshot;
import robocode.ScannedRobotEvent;
import java.util.*;

/**
 * Central opponent intelligence hub — tracks, classifies, and assesses all opponents.
 *
 * <p>The static {@code opponents} map persists across rounds so classification
 * improves over time. Movement classification uses heading-change statistics,
 * velocity reversal rate, and wave-surfer correlation. Threat assessment combines
 * accuracy, energy, aggression, and average bullet power into a 0–1 score.</p>
 *
 * @see OpponentData
 * @see MovementType
 */
public class Brain {

    private static final int WINDOW_SIZE = 100;
    private static final int MIN_TICKS = 30;

    private static final Map<String, OpponentData> opponents = new HashMap<>();

    private BattleMode battleMode = BattleMode.DUEL;
    private final List<Long> ourFireTicks = new ArrayList<>();

    public void setBattleMode(int othersCount) {
        battleMode = othersCount > 1 ? BattleMode.MELEE : BattleMode.DUEL;
    }

    public BattleMode getBattleMode() {
        return battleMode;
    }

    public void update(ScannedRobotEvent e, double myX, double myY,
                       double myHeadingRad, long time) {
        String name = e.getName();
        OpponentData od = opponents.computeIfAbsent(name, OpponentData::new);

        double absBearing = myHeadingRad + e.getBearingRadians();
        od.x = myX + e.getDistance() * Math.sin(absBearing);
        od.y = myY + e.getDistance() * Math.cos(absBearing);
        od.heading = e.getHeadingRadians();
        od.velocity = e.getVelocity();
        od.energy = e.getEnergy();
        od.lastScanTick = time;

        if (od.lastEnergy >= 0) {
            double drop = od.lastEnergy - e.getEnergy();
            if (drop >= 0.09 && drop <= 3.01) {
                od.fireCount++;
                od.totalBulletPower += drop;
                od.fireTicks.add(time);
            }
        }
        od.lastEnergy = e.getEnergy();

        od.window.addLast(new Snapshot(time, od.heading, od.velocity,
                                       od.energy, od.x, od.y));
        while (od.window.size() > WINDOW_SIZE) {
            od.window.removeFirst();
        }

        od.movementType = classify(od);
        od.threatLevel = assessThreat(od);
    }

    public void recordOurFire(long tick) {
        ourFireTicks.add(tick);
    }

    public void recordDamageDealt(String name, double damage) {
        OpponentData od = opponents.get(name);
        if (od != null) od.damageDealt += damage;
    }

    public void recordDamageReceived(String name, double damage) {
        OpponentData od = opponents.get(name);
        if (od != null) {
            od.damageReceived += damage;
            od.hitsOnUs++;
        }
    }

    public OpponentData getOpponent(String name) {
        return opponents.get(name);
    }

    public Collection<OpponentData> getAllOpponents() {
        return opponents.values();
    }

    public int getAliveCount(long currentTime) {
        int count = 0;
        for (OpponentData od : opponents.values()) {
            if (od.energy > 0 && currentTime - od.lastScanTick < 50) count++;
        }
        return count;
    }

    public OpponentData getStalestOpponent(long currentTime) {
        OpponentData stalest = null;
        long oldest = Long.MAX_VALUE;
        for (OpponentData od : opponents.values()) {
            if (od.energy > 0 && od.lastScanTick < oldest) {
                oldest = od.lastScanTick;
                stalest = od;
            }
        }
        return stalest;
    }

    public void removeOpponent(String name) {
        OpponentData od = opponents.get(name);
        if (od != null) od.energy = 0;
    }

    public void resetRound() {
        ourFireTicks.clear();
        for (OpponentData od : opponents.values()) {
            od.window.clear();
            od.lastEnergy = -1;
            od.lastScanTick = -1;
            od.fireCount = 0;
            od.totalBulletPower = 0;
            od.fireTicks.clear();
        }
    }

    // ── Classification ──────────────────────────────────────────────────

    private MovementType classify(OpponentData od) {
        int n = od.window.size();
        if (n < MIN_TICKS) return MovementType.UNKNOWN;

        double[] hc = new double[n - 1];
        int[] velSigns = new int[n - 1];
        int stoppedCount = 0;

        Iterator<Snapshot> it = od.window.iterator();
        Snapshot prev = it.next();
        if (Math.abs(prev.velocity) < 0.1) stoppedCount++;
        int idx = 0;
        while (it.hasNext()) {
            Snapshot cur = it.next();
            hc[idx] = Math.abs(normalRelAngle(cur.heading - prev.heading));
            velSigns[idx] = cur.velocity > 0.1 ? 1 : (cur.velocity < -0.1 ? -1 : 0);
            if (Math.abs(cur.velocity) < 0.1) stoppedCount++;
            prev = cur;
            idx++;
        }
        int ticks = idx;

        if ((double) stoppedCount / n > 0.80) return MovementType.STOPPED;

        double sumHC = 0, sumHC2 = 0;
        for (int i = 0; i < ticks; i++) {
            sumHC += hc[i];
            sumHC2 += hc[i] * hc[i];
        }
        double avgHC = sumHC / ticks;
        double varHC = sumHC2 / ticks - avgHC * avgHC;
        if (varHC < 0) varHC = 0;
        double stdHC = Math.sqrt(varHC);

        int reversals = 0;
        int lastSign = 0;
        for (int i = 0; i < ticks; i++) {
            int s = velSigns[i];
            if (s != 0) {
                if (lastSign != 0 && s != lastSign) reversals++;
                lastSign = s;
            }
        }
        double revRate = (double) reversals / ticks;

        double sumDHC = 0;
        int dc = 0;
        for (int i = 1; i < ticks; i++) {
            sumDHC += Math.abs(hc[i] - hc[i - 1]);
            dc++;
        }
        double avgDHC = dc > 0 ? sumDHC / dc : 0;

        if (detectWaveSurfer(od, ticks, reversals)) return MovementType.WAVE_SURFER;
        if (avgHC < 0.03 && revRate < 0.04) return MovementType.LINEAR;
        if (revRate >= 0.06) return MovementType.OSCILLATING;

        if (avgHC >= 0.03) {
            double cv = avgHC > 0 ? stdHC / avgHC : 0;
            if (cv < 0.5 && avgDHC < 0.02) return MovementType.CIRCULAR;
            if (cv >= 0.8 || stdHC > 0.04) return MovementType.RANDOM;
            if (revRate >= 0.03) return MovementType.OSCILLATING;
            return MovementType.CIRCULAR;
        }

        if (revRate >= 0.04) return MovementType.OSCILLATING;
        return MovementType.LINEAR;
    }

    private boolean detectWaveSurfer(OpponentData od, int ticks, int reversals) {
        if (ourFireTicks.size() < 5 || reversals < 3) return false;

        List<Long> revTicks = new ArrayList<>();
        Iterator<Snapshot> it = od.window.iterator();
        Snapshot prev = it.next();
        int lastSign = prev.velocity > 0.1 ? 1 : (prev.velocity < -0.1 ? -1 : 0);
        while (it.hasNext()) {
            Snapshot cur = it.next();
            int s = cur.velocity > 0.1 ? 1 : (cur.velocity < -0.1 ? -1 : 0);
            if (s != 0 && lastSign != 0 && s != lastSign) revTicks.add(cur.tick);
            if (s != 0) lastSign = s;
        }

        int closeCount = 0;
        for (long rt : revTicks) {
            for (long ft : ourFireTicks) {
                if (Math.abs(rt - ft) <= 4) { closeCount++; break; }
            }
        }
        return revTicks.size() > 0 && (double) closeCount / revTicks.size() > 0.50;
    }

    // ── Threat assessment ───────────────────────────────────────────────

    private double assessThreat(OpponentData od) {
        if (od.window.size() < 2) return 0.5;

        double accuracy = od.fireCount > 0
                ? Math.min(1.0, (double) od.hitsOnUs / od.fireCount) : 0.3;
        double energyComp = clamp(od.energy / 150.0, 0, 1);

        long span = od.window.getLast().tick - od.window.getFirst().tick;
        if (span < 1) span = 1;
        double aggrComp = clamp(od.fireCount / (double) span / 0.10, 0, 1);

        double avgPower = od.fireCount > 0
                ? od.totalBulletPower / od.fireCount : 1.5;
        double powerComp = clamp(avgPower / 3.0, 0, 1);

        return clamp(0.35 * accuracy + 0.25 * energyComp
                     + 0.20 * aggrComp + 0.20 * powerComp, 0, 1);
    }

    public String detectGunType(String name, double[] hitBearingErrors) {
        if (hitBearingErrors == null || hitBearingErrors.length < 5) return "UNKNOWN";
        double sumAbs = 0;
        for (double e : hitBearingErrors) sumAbs += Math.abs(e);
        if (sumAbs / hitBearingErrors.length < Math.toRadians(5)) return "HEAD_ON";
        return "STATISTICAL";
    }

    private static double normalRelAngle(double angle) {
        while (angle > Math.PI) angle -= 2 * Math.PI;
        while (angle < -Math.PI) angle += 2 * Math.PI;
        return angle;
    }

    private static double clamp(double v, double lo, double hi) {
        return Math.max(lo, Math.min(hi, v));
    }
}
