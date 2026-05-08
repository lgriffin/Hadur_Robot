package hadur117.intel;

import hadur117.model.MovementType;

/**
 * Read-only snapshot of per-opponent strategy recommendations.
 *
 * <p>Brain produces a profile for each opponent based on accumulated evidence
 * (movement classification, gun type detection, per-opponent accuracy). Subsystems
 * consume the profile to adapt gun selection, fire power, and movement flattening.</p>
 */
public class TargetProfile {

    public final MovementType movementType;
    public final String gunType;
    public final double firePowerMult;
    public final double ourAccuracy;
    public final int shotsFiredAt;

    public static final TargetProfile BALANCED_DEFAULT =
            new TargetProfile(MovementType.UNKNOWN, "UNKNOWN", 1.0, 0.15, 0);

    public TargetProfile(MovementType movementType, String gunType,
                          double firePowerMult, double ourAccuracy,
                          int shotsFiredAt) {
        this.movementType = movementType;
        this.gunType = gunType;
        this.firePowerMult = firePowerMult;
        this.ourAccuracy = ourAccuracy;
        this.shotsFiredAt = shotsFiredAt;
    }
}
