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
 * <li>ADAPT-3: the seeds start at {@link #SEED_WEIGHT}, half a live sample, and are replayed
 *     only when the tier they back is known.</li>
 * <li>DIAL-1: a tier whose estimate is too uncertain is unknown (see {@link Tiers}), and
 *     an unknown tier selects the conservative setting, 1.20's.</li>
 * <li>S5: the gun tier also sets the starting distance ({@link Opening#distance}): close against a
 *     gun that cannot hit, further out the better it is. A stranger starts at 1.20's
 *     650 px.</li>
 * </ul>
 */
public final class OpeningBook {

    /** ADAPT-3: a seeded sample's weight at the start of a battle; a live one weighs 1. */
    public static final double SEED_WEIGHT = 0.5;

    /** S5: a stranger's starting distance, 1.20's fixed one. */
    public static final double STRANGER_DISTANCE = 650;
    /**
     * S5: the starting distance for gun tiers T0 to T3. The artifact's bands started T0 at
     * 150-250 px, but the bench showed head-on guns hit Hadur often inside 400 px, so every
     * tier starts at or beyond the distance controller's 400 px floor.
     */
    private static final double[] TIER_DISTANCE = {400, 450, 500, 550};

    private OpeningBook() {}

    /** S5: the distance to start at against a gun of {@code tier}. */
    static double distance(Tiers.Gun tier) {
        switch (tier) {
            case T0: return TIER_DISTANCE[0];
            case T1: return TIER_DISTANCE[1];
            case T2: return TIER_DISTANCE[2];
            case T3: return TIER_DISTANCE[3];
            default: return STRANGER_DISTANCE;
        }
    }

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
        // A seed is replayed only when its evidence named a tier: a thin profile plays as a
        // stranger, down to the nine-wave head-on warm-up its samples would otherwise fill.
        List<double[]> gunSeed = new ArrayList<>();
        if (moveTier != Tiers.Move.UNKNOWN) {
            for (short[] s : profile.gunSeed()) gunSeed.add(Seeds.gun(s));
        }
        List<double[]> surfSeed = new ArrayList<>();
        if (gunTier != Tiers.Gun.UNKNOWN) {
            for (short[] s : profile.surfSeed()) surfSeed.add(Seeds.surf(s));
        }
        return new Opening(gunTier, moveTier, gun, gunTier == Tiers.Gun.T3, surfPrior,
            theirHitRate, Tiers.mainGunRating(profile), SEED_WEIGHT, gunSeed, surfSeed,
            distance(gunTier));
    }
}
