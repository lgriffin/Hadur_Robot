package hadur2.core.model;

/**
 * The weight a group of seeded samples carries in the KNN views (ADAPT-3). Samples observed
 * in the current battle weigh 1; samples replayed from an opponent profile share one of
 * these, so lowering it (RES-4) lowers all of them at once without touching the trees.
 *
 * <p>{@code HadurCore} makes two at the first scan, one for the gun seed and one for the
 * surf seed, starting at the opening book's seed weight ({@code OpeningBook.SEED_WEIGHT},
 * 0.5), or 0 when there is no seed.
 * Every seeded {@link Timestamped} sample holds a reference to its group's weight and
 * reports it through {@link Timestamped#weight()}; the main gun's density, the anti-surfer
 * gun's and the surf's danger multiply each neighbour by it. An {@code adapt.SeedTrust}
 * lowers it by a twentieth of its starting value per wave once the live estimate disagrees
 * with the profile's, so it reaches 0 within 20 waves (RES-4); at 0 a seeded sample no
 * longer counts at all.</p>
 *
 * <p>It lives in the model rather than in {@code adapt} because the gun, movement and KNN
 * code may not depend on the adapt package (the ArchUnit rule tagged DIAL-2), while all of
 * them may see the model.</p>
 */
public final class SeedWeight {

    /** The current weight, in [0, 1]. */
    private double value;

    /**
     * A weight starting at {@code value}, clamped as {@link #set} does.
     *
     * @param value the starting weight
     */
    public SeedWeight(double value) {
        set(value);
    }

    /** The current weight, in [0, 1]: 0 means the seed no longer counts. */
    public double value() {
        return value;
    }

    /** Sets the weight, clamped to [0, 1]; NaN reads as 0. */
    public void set(double value) {
        // The comparison is false for NaN, so NaN and anything at or below 0 become 0; a
        // seed never weighs more than a live sample, which weighs 1 (ADAPT-3).
        this.value = value > 0 ? Math.min(1.0, value) : 0.0;
    }
}
