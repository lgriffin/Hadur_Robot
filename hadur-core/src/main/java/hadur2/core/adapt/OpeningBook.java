package hadur2.core.adapt;

import hadur2.core.memory.Estimate;
import hadur2.core.memory.OpponentProfile;
import hadur2.core.memory.Seeds;
import hadur2.core.memory.Tiers;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a profile's tiers once and turns them into an {@link Opening} (the artifact's
 * "Recognise, then adapt"). It is a pure function of the profile: it takes no tick, round
 * or clock, so no decision here can come from elapsed time alone (DIAL-2).
 *
 * <ul>
 * <li>ADAPT-1: movement tier M2 or M3 (a surfer) starts on the anti-surfer gun; M0 or M1
 *     on the main gun. An unknown tier leaves the choice to live data, as 1.20 did.</li>
 * <li>ADAPT-2: gun tier T3 turns the flattener views on from the first surfable wave,
 *     whatever their own thresholds say. Any known gun tier also hands the profile's hit
 *     rate to the surf, which reads it in place of the live one while the profile's is the
 *     more certain, so the simple, normal and recent views start where the last battle
 *     left them rather than where a stranger starts.</li>
 * <li>ADAPT-3: the seeds start at {@link #SEED_WEIGHT}, half a live sample.</li>
 * <li>DIAL-1: a tier whose estimate is too uncertain is unknown (see {@link Tiers}), and
 *     an unknown tier selects the conservative setting, 1.20's.</li>
 * </ul>
 */
public final class OpeningBook {

    /** ADAPT-3: a seeded sample's weight at the start of a battle; a live one weighs 1. */
    public static final double SEED_WEIGHT = 0.5;

    private OpeningBook() {}

    public static Opening read(OpponentProfile profile) {
        if (profile == null) return Opening.STRANGER;
        Tiers.Gun gunTier = Tiers.gun(profile);
        Tiers.Move moveTier = Tiers.move(profile);
        Opening.Gun gun;
        switch (moveTier) {
            case M2:
            case M3:
                gun = Opening.Gun.ANTI_SURFER;
                break;
            case M0:
            case M1:
                gun = Opening.Gun.MAIN;
                break;
            default:
                gun = Opening.Gun.LIVE;
        }
        Estimate theirHitRate = Tiers.theirHitRate(profile);
        Estimate surfPrior = gunTier == Tiers.Gun.UNKNOWN ? Estimate.NONE : theirHitRate;
        List<double[]> gunSeed = new ArrayList<>(profile.gunSeedSize());
        for (short[] s : profile.gunSeed()) gunSeed.add(Seeds.gun(s));
        List<double[]> surfSeed = new ArrayList<>(profile.surfSeedSize());
        for (short[] s : profile.surfSeed()) surfSeed.add(Seeds.surf(s));
        return new Opening(gunTier, moveTier, gun, gunTier == Tiers.Gun.T3, surfPrior,
            theirHitRate, Tiers.mainGunRating(profile), SEED_WEIGHT, gunSeed, surfSeed);
    }
}
