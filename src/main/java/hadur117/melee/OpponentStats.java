package hadur117.melee;

import robocode.util.Utils;

/**
 * Statistics about one opponent, accumulated across every round of a battle.
 */
public class OpponentStats {

    public enum MovementType { UNKNOWN, STOPPED, LINEAR, CIRCULAR, OSCILLATING }
    public enum GunType { UNKNOWN, HEAD_ON, LEADING }

    private static final int MIN_MOVE_SAMPLES = 10;
    private static final int MIN_GUN_SAMPLES = 3;

    public final String name;
    private double damageDealtTo;
    private double damageReceivedFrom;
    private double distanceSum;
    private int distanceSamples;

    private int moveSamples, stoppedSamples, turningSamples, reversals;
    private int lastVelocitySign;
    private int headOnHits, leadingHits;

    public OpponentStats(String name) {
        this.name = name;
    }

    public void recordScan(double distance, double velocity, double turnRate) {
        distanceSum += distance;
        distanceSamples++;

        moveSamples++;
        if (Math.abs(velocity) < 0.5) {
            stoppedSamples++;
            return;
        }
        int sign = velocity > 0 ? 1 : -1;
        if (lastVelocitySign != 0 && sign != lastVelocitySign) reversals++;
        lastVelocitySign = sign;
        if (!Double.isNaN(turnRate) && Math.abs(turnRate) > 0.02) turningSamples++;
    }

    public void recordDamageDealt(double damage) {
        damageDealtTo += damage;
    }

    /**
     * Records a hit on Hadur. {@code aimOffset} is the angle between the bullet's
     * heading and the direct bearing from the shooter to where Hadur was when it fired.
     */
    public void recordDamageReceived(double damage, double aimOffset, double botWidthAngle) {
        damageReceivedFrom += damage;
        if (Double.isNaN(aimOffset)) return;
        if (Math.abs(Utils.normalRelativeAngle(aimOffset)) <= botWidthAngle) headOnHits++;
        else leadingHits++;
    }

    public double damageDealtTo() { return damageDealtTo; }
    public double damageReceivedFrom() { return damageReceivedFrom; }

    public double averageDistance() {
        return distanceSamples == 0 ? 0 : distanceSum / distanceSamples;
    }

    public MovementType movementType() {
        if (moveSamples < MIN_MOVE_SAMPLES) return MovementType.UNKNOWN;
        if (stoppedSamples > 0.7 * moveSamples) return MovementType.STOPPED;
        int moving = moveSamples - stoppedSamples;
        if (reversals * 6 >= moving) return MovementType.OSCILLATING;
        if (turningSamples * 2 > moving) return MovementType.CIRCULAR;
        return MovementType.LINEAR;
    }

    public GunType gunType() {
        int hits = headOnHits + leadingHits;
        if (hits < MIN_GUN_SAMPLES) return GunType.UNKNOWN;
        return headOnHits >= 0.6 * hits ? GunType.HEAD_ON : GunType.LEADING;
    }
}
