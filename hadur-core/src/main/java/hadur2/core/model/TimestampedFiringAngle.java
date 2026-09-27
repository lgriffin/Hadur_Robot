package hadur2.core.model;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;

import java.awt.geom.Point2D;

/**
 * One of the gun's KNN samples: where the enemy went relative to one of our waves, logged
 * by {@code GunController} when the wave breaks on it (or replayed from a gun seed).
 *
 * <p>It keeps the same outcome in two forms, because the two guns read it differently. The
 * {@link #guessFactor} is the precise guess factor of the enemy's position at the break
 * ({@link Wave#guessFactorPrecise}). The {@link #displacementVector} is the enemy's average
 * movement per tick from the wave's fire time to the break, rotated into the frame of its
 * heading at fire time and mirrored by its orbit direction ({@link Wave#displacementVector});
 * the main gun replays it from the target's current situation with
 * {@link Wave#projectLocationBlind}, which follows walls the guess factor cannot see.</p>
 */
public class TimestampedFiringAngle extends Timestamped {
    /** The precise guess factor of the enemy's position when the wave broke, about [-1, 1]. */
    public final double guessFactor;
    /**
     * The enemy's movement per tick over the wave's flight, pixels per tick, in the frame of
     * its effective heading at fire time (y along the heading, x to its clockwise side),
     * mirrored by the orbit direction so that mirror-image movements give the same vector.
     */
    public final Point2D.Double displacementVector;

    /**
     * A sample observed in this battle.
     *
     * @param round the round the wave was fired in
     * @param time the tick the wave broke
     * @param guessFactor the precise guess factor at the break
     * @param displacementVector the movement per tick in the fire-time frame
     */
    public TimestampedFiringAngle(int round, long time, double guessFactor,
                                  Point2D.Double displacementVector) {
        this(round, time, guessFactor, displacementVector, null);
    }

    /**
     * A sample, seeded when {@code seed} is not null (ADAPT-3).
     *
     * @param round the round the wave was fired in, or {@link Timestamped#SEED_ROUND}
     * @param time the tick the wave broke, or the seed's load order
     * @param guessFactor the precise guess factor at the break
     * @param displacementVector the movement per tick in the fire-time frame
     * @param seed the seed's shared weight, or null for a live sample
     */
    public TimestampedFiringAngle(int round, long time, double guessFactor,
                                  Point2D.Double displacementVector, SeedWeight seed) {
        super(round, time, seed);
        this.guessFactor = guessFactor;
        this.displacementVector = displacementVector;
    }
}
