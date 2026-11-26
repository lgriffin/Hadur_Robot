package hadur117.sepia;

import hadur117.core.model.Wave;
import hadur117.core.move.BulletShadows;
import hadur117.core.move.OurBullet;
import hadur117.core.physics.Rules;
import java.util.List;

/**
 * One enemy shot, read from its energy drop, with the landing Sepia has fixed for it.
 *
 * <p>The geometry is the kernel's {@link Wave}: source, fire tick, speed and the precise
 * intersection that gives the hit set. Sepia adds what the ink needs: the hit set of the
 * committed landing ({@link #lo} to {@link #hi}, bearings from the source), the tick the wave can
 * first meet the body there ({@link #arrival}) and the tick it has passed ({@link #passed}), and the
 * shadows our bullets in the air cast on it before {@link #arrival} (INK-5).</p>
 */
public final class InkWave {

    /** The kernel's wave: source, fire tick, power and the target's state when it was fired. */
    public final Wave wave;
    /** The tick the shot was read, one after it was fired. */
    public final long detected;
    /** The damage its bullet does on a hit. */
    public final double damage;

    /** Whether a landing is fixed. */
    boolean committed;
    /** The hit set of the fixed landing: bearings from the source, radians. */
    double lo, hi;
    /** The distance from the source to the fixed landing, px. */
    double landingDistance;
    /** The first tick the wave can meet the body at the fixed landing. */
    long arrival = Long.MAX_VALUE;
    /** The last tick the wave can meet the body there. */
    long passed = Long.MAX_VALUE;
    /** The option fixed for this wave, or null. */
    Gait.Option option;

    /** The shadows of our bullets in the air, before {@link #arrival}; recomputed when they change. */
    List<double[]> certain = List.of();
    /** Every bearing our bullets may stop, the certain ones included. */
    List<double[]> possible = List.of();
    /** Inks that added shade to this wave when they were fired. */
    int inks;
    /** Whether our bullet met this wave's bullet. */
    boolean met;
    /** Whether this wave's bullet hit us. */
    boolean hit;

    /**
     * A wave read on tick {@code detected}.
     *
     * @param wave the kernel wave, fired the tick before
     * @param detected the tick the drop was read
     */
    public InkWave(Wave wave, long detected) {
        this.wave = wave;
        this.detected = detected;
        this.damage = Rules.getBulletDamage(wave.bulletPower());
    }

    /** The bullet's power. */
    public double power() {
        return wave.bulletPower();
    }

    /** Whether the landing is fixed. */
    public boolean committed() {
        return committed;
    }

    /** The hit set's low bearing. */
    public double lo() {
        return lo;
    }

    /** The hit set's high bearing. */
    public double hi() {
        return hi;
    }

    /** The first tick the wave can meet the body at the fixed landing. */
    public long arrival() {
        return arrival;
    }

    /** The last tick the wave can meet the body at the fixed landing. */
    public long passed() {
        return passed;
    }

    /** The hit set's width in px at the landing. */
    public double widthPx() {
        return (hi - lo) * landingDistance;
    }

    /** The share of the hit set our bullets in the air shade (INK-5). */
    public double shaded() {
        return Arcs.shade(lo, hi, certain, possible);
    }

    /** The share of the hit set shaded when the wave reached the body; NaN until it has. */
    double landedShade = Double.NaN;

    /** A copy of the landing and its shadows, so a trial landing can be put back. */
    static final class Landing {
        final boolean committed;
        final double lo, hi, distance;
        final long arrival, passed;
        final Gait.Option option;
        final List<double[]> certain, possible;

        Landing(InkWave w) {
            committed = w.committed;
            lo = w.lo;
            hi = w.hi;
            distance = w.landingDistance;
            arrival = w.arrival;
            passed = w.passed;
            option = w.option;
            certain = w.certain;
            possible = w.possible;
        }
    }

    /** The landing as it stands, to {@link #restore} after a trial. */
    Landing landing() {
        return new Landing(this);
    }

    /** Puts back a landing taken with {@link #landing()}. */
    void restore(Landing l) {
        committed = l.committed;
        lo = l.lo;
        hi = l.hi;
        landingDistance = l.distance;
        arrival = l.arrival;
        passed = l.passed;
        option = l.option;
        certain = l.certain;
        possible = l.possible;
    }

    /** The option fixed for this wave, or null. */
    public Gait.Option option() {
        return option;
    }

    /**
     * Fixes the landing.
     *
     * @param lo the hit set's low bearing
     * @param hi its high bearing
     * @param distance the source's distance to the landing, px
     * @param arrival the first tick the wave meets the body there
     * @param passed the last tick it can
     * @param option the option that leads there
     */
    void commit(double lo, double hi, double distance, long arrival, long passed, Gait.Option option) {
        this.committed = true;
        this.lo = lo;
        this.hi = hi;
        this.landingDistance = distance;
        this.arrival = arrival;
        this.passed = passed;
        this.option = option;
    }

    /**
     * Recasts the shadows of {@code bullets} on this wave, each walked only up to the turn of
     * {@link #arrival}: a meeting after the wave reaches the body comes too late (INK-5).
     *
     * @param bullets our bullets in flight
     * @param fieldWidth the field's width, px
     * @param fieldHeight the field's height, px
     */
    void recast(List<OurBullet> bullets, double fieldWidth, double fieldHeight) {
        if (bullets.isEmpty()) {
            certain = List.of();
            possible = List.of();
            return;
        }
        // The cutoff is exclusive: a meeting on the arrival turn itself still stops the bullet.
        long stop = arrival + 1;
        List<List<double[]>> s = BulletShadows.of(wave, bullets, b -> stop, fieldWidth, fieldHeight);
        certain = s.get(0);
        possible = s.get(1);
    }

    /**
     * Whether the wave's front has gone past a body {@code distance} px from the source by tick
     * {@code time}: its ring has left the farthest corner of a 36 px box.
     *
     * @param time the tick
     * @param distance the body's distance from the source, px
     * @return true once nothing of the body can be met
     */
    public boolean pastBody(long time, double distance) {
        return wave.distanceTraveled(time) > distance + 26;
    }
}
