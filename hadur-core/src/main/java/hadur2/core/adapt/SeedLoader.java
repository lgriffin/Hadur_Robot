package hadur2.core.adapt;

import java.util.List;
import java.util.function.Consumer;

/**
 * Replays an opening's seeds into the KNN views a few at a time, so that loading hundreds
 * of samples never lands on one tick (the first scan is already the battle's slowest).
 * The gun's first shot and the enemy's first wave are a dozen ticks or more away, and the
 * whole seed goes in well before then. Gun and surf samples alternate.
 */
public final class SeedLoader {

    /** Samples loaded per tick. */
    public static final int PER_TICK = 50;

    private final List<double[]> gun;
    private final List<double[]> surf;
    private final Consumer<double[]> gunSink;
    private final Consumer<double[]> surfSink;
    private int nextGun;
    private int nextSurf;

    public SeedLoader(List<double[]> gun, List<double[]> surf, Consumer<double[]> gunSink,
                      Consumer<double[]> surfSink) {
        this.gun = gun;
        this.surf = surf;
        this.gunSink = gunSink;
        this.surfSink = surfSink;
    }

    public boolean done() {
        return nextGun >= gun.size() && nextSurf >= surf.size();
    }

    /** Loads up to {@link #PER_TICK} more samples; returns how many. */
    public int step() {
        int loaded = 0;
        while (loaded < PER_TICK && !done()) {
            if (nextGun < gun.size()) {
                gunSink.accept(gun.get(nextGun++));
                loaded++;
            }
            if (loaded < PER_TICK && nextSurf < surf.size()) {
                surfSink.accept(surf.get(nextSurf++));
                loaded++;
            }
        }
        return loaded;
    }
}
