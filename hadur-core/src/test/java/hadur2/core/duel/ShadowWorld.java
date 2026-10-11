package hadur2.core.duel;

import hadur2.core.model.Wave;
import hadur2.core.move.PlanInterval;
import java.util.List;

/**
 * Test support for the GUN-7 Cucumber steps (package {@code hadur2.core.steps}): a public
 * door onto the duel's seam, with one enemy wave in the air and a plan interval on it.
 */
public final class ShadowWorld {

    private final Wave wave = ShadowAvoidanceTest.wave();
    private ShadowAvoidance seam;
    private double danger;

    /** Movement's published interval on the wave: the bearing to us, a bot's width either side. */
    public void planOnTheWave(double danger) {
        this.danger = danger;
        seam = ShadowAvoidanceTest.seam(new PlanInterval(wave, ShadowAvoidanceTest.DOWN - 0.05,
            ShadowAvoidanceTest.DOWN + 0.05, danger));
    }

    /** The damage the best of the bullets near the line at the enemy would save. */
    public double bestSaving() {
        return seam.avoided(ShadowAvoidanceTest.bestHeading(seam), 1.95);
    }

    /** The damage a bullet fired across the field would save. */
    public double sidewaysSaving() {
        return seam.avoided(Math.PI / 2, 1.95);
    }

    /** The most the interval could ever be worth. */
    public double ceiling() {
        return seam.ceiling(1.95);
    }

    /** The wave's shadows already stop all of the interval. */
    public void shadowsAlreadyStopEverything() {
        wave.setShadows(List.of(new double[] {ShadowAvoidanceTest.DOWN - 0.2, ShadowAvoidanceTest.DOWN + 0.2}));
        planOnTheWave(danger);
    }
}
