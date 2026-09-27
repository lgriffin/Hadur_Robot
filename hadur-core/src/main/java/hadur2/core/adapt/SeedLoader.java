package hadur2.core.adapt;

import java.util.List;
import java.util.function.Consumer;

/**
 * Replays an opening's seeds into the KNN views a few at a time, so that loading hundreds
 * of samples never lands on one tick (the first scan is already the battle's slowest).
 * The gun's first shot and the enemy's first wave are a dozen ticks or more away, and the
 * whole seed goes in well before then. Gun and surf samples alternate.
 *
 * <p>At {@link #PER_TICK} samples a tick, the largest possible seed (600 gun and 300 surf
 * samples, the profile's caps) takes 18 ticks. The core calls {@link #step()} once a duel
 * tick after the opening, and drops the loader once {@link #done()}. The sinks add each
 * sample to the gun's or the surf's KNN views at the opening's shared seed weight
 * (ADAPT-3).</p>
 */
public final class SeedLoader {

    /** Samples loaded per tick, gun and surf together. */
    public static final int PER_TICK = 50;

    private final List<double[]> gun;
    private final List<double[]> surf;
    private final Consumer<double[]> gunSink;
    private final Consumer<double[]> surfSink;
    private int nextGun;
    private int nextSurf;

    /**
     * A loader for one battle's seeds. The lists are read, not copied.
     *
     * @param gun gun samples, oldest first
     * @param surf surf samples, oldest first
     * @param gunSink where each gun sample goes (the gun's KNN views)
     * @param surfSink where each surf sample goes (the surf's KNN views)
     */
    public SeedLoader(List<double[]> gun, List<double[]> surf, Consumer<double[]> gunSink,
                      Consumer<double[]> surfSink) {
        this.gun = gun;
        this.surf = surf;
        this.gunSink = gunSink;
        this.surfSink = surfSink;
    }

    /** Whether every sample of both seeds has been handed on. */
    public boolean done() {
        return nextGun >= gun.size() && nextSurf >= surf.size();
    }

    /**
     * Loads up to {@link #PER_TICK} more samples, one gun then one surf in turn, so both
     * seeds fill at the same pace until the shorter runs out.
     *
     * @return how many were loaded; 0 once done
     */
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
