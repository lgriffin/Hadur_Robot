package hadur117.core.duel;

/** Duel-side switches for gun experiments; the gun package never reads them. All ship off. */
final class GunDesign {
    /**
     * GUN-8: in a duel the main gun aims from a TripHammer view (Diamond 1.8.22's duel gun):
     * its formula, weight schedule, k, candidate grid and cube kernel. The displacement view
     * keeps logging; the main candidate's virtual bullet and rating are the TripHammer's.
     */
    static final boolean TRIPHAMMER = false;

    /**
     * GUN-9: the live gun verdict is the highest-rated candidate with no margin test (Diamond's
     * bestGun), in both power classes. The hybrid gun's gate is unchanged.
     */
    static final boolean FREE_GUN = false;

    /**
     * GUN-10: a gun's rating is its lifetime hits over shots, without GUN-1's 100-shot
     * half-life (Diamond's GunStats).
     */
    static final boolean UNDECAYED = false;

    /**
     * GKEY-1 (measurement): every duel gun wave that breaks also prints a {@code GKR} record with its
     * {@link hadur117.core.gun.GunFormula} point and where the target went, for the offline per-opponent
     * gun-key fit ({@code data/tools/gun_key_fit.py}). Behaviour unchanged.
     */
    static final boolean GUN_KEY_RECORD = false;

    private GunDesign() { }
}
