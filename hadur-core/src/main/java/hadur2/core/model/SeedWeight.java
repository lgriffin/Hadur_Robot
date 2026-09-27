package hadur2.core.model;

/**
 * The weight a group of seeded samples carries in the KNN views (ADAPT-3). Samples observed
 * in the current battle weigh 1; samples replayed from an opponent profile share one of
 * these, so lowering it (RES-4) lowers all of them at once without touching the trees.
 */
public final class SeedWeight {

    private double value;

    public SeedWeight(double value) {
        set(value);
    }

    public double value() {
        return value;
    }

    /** Sets the weight, clamped to [0, 1]; NaN reads as 0. */
    public void set(double value) {
        this.value = value > 0 ? Math.min(1.0, value) : 0.0;
    }
}
