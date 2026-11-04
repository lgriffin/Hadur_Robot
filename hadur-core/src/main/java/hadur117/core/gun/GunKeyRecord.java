package hadur117.core.gun;

import hadur117.core.model.RobotState;
import hadur117.core.model.Wave;
import java.util.List;
import java.util.Locale;

/**
 * GKEY-1: the gun-key record, one line per duel gun wave as it breaks, with the wave's point in the main
 * gun's feature space ({@link GunFormula}) and where the target went. The offline fit
 * ({@code data/tools/gun_key_fit.py}) replays the main gun's neighbour search on these records under
 * other feature weights and learns, per opponent, which weights would have hit it most. Measurement
 * only: a bench build turns it on, the competition jar never does, and nothing here changes the gun.
 *
 * <p>The line, after the {@code GKR,round,tick,} the duel puts in front:
 * {@code fireTime,power,firing,distance,gf,hitGf,halfWidthGf,} then the point's ten values. The guess
 * factors are on the classic scale ({@link Wave#guessFactor(double)}): {@code gf} where the target was at
 * the last tick the wave crossed it, {@code hitGf} and {@code halfWidthGf} the centre and half-width of
 * the bearings that would have hit it ({@link Wave#preciseIntersection}); both are NaN when the wave
 * never crossed it.</p>
 */
public final class GunKeyRecord {

    private GunKeyRecord() { }

    /**
     * The record's line, without the {@code GKR,round,tick,} prefix.
     *
     * @param w the broken wave
     * @param point its {@link GunFormula} point (as logged)
     * @param breakStates the target's states while the wave crossed it
     * @param last the last of them
     * @return the comma-separated fields
     */
    public static String line(Wave w, double[] point, List<RobotState> breakStates, RobotState last) {
        Wave.Intersection x = w.preciseIntersection(breakStates);
        double hit = x == null ? Double.NaN : w.guessFactor(x.angle);
        double half = x == null ? Double.NaN : x.bandwidth / w.maxEscapeAngle();
        StringBuilder b = new StringBuilder(256);
        b.append(w.fireTime).append(',').append(num(w.bulletPower()))
         .append(',').append(w.firingWave ? 1 : 0)
         .append(',').append(num(w.sourceLocation.distance(w.targetLocation)))
         .append(',').append(num(w.guessFactor(last.location)))
         .append(',').append(num(hit)).append(',').append(num(half));
        for (double v : point) b.append(',').append(num(v));
        return b.toString();
    }

    /** A number in the record: 6 significant digits, NaN as {@code nan} (as the surf's AES record). */
    static String num(double v) {
        if (Double.isNaN(v)) return "nan";
        if (v == 0) return "0";
        return String.format(Locale.ROOT, "%.6g", v);
    }
}
