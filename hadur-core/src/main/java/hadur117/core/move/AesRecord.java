package hadur117.core.move;

import hadur117.core.model.Wave;
import java.util.Arrays;
import java.util.Locale;

/**
 * AES-1: the decision record, one line per wave at the three-option surf's first rating of it,
 * with every term of each option's danger before they are blended, so the blend can be refitted
 * offline against the bullet the engine says was fired (docs/plan-aes.md,
 * {@code data/tools/aes_rank.py}). Measurement only: a bench build turns it on, the competition
 * jar never does, and nothing here changes what the surf does.
 *
 * <p>The line, after the {@code AES,round,tick,} the duel puts in front:
 * {@code fireTime,power,firing,sourceX,sourceY,chosen,views,} ({@code firing} 1 for a wave a
 * real bullet rides, 0 for a virtual one such as MOVE-11's gun-heat wave), then for each option in ordinal order
 * (counter-clockwise, stop, clockwise) {@code present,total,} and the {@link #FIXED} terms
 * below followed by the {@code 2 * views + 1} view parts of
 * {@code MoveController.getDangerScore}. An option with no plan on the wave writes
 * {@code 0} and no more fields for it.</p>
 */
public final class AesRecord {

    /** The plan interval's low end, absolute radians from the wave's source. */
    public static final int LOW = 0;
    /** The plan interval's high end. */
    public static final int HIGH = 1;
    /** The first wave's danger, every multiplier applied: the total less the next wave's. */
    public static final int FIRST = 2;
    /** The enemy's normalised hit rate, the term added to the views' score. */
    public static final int HIT_RATE = 3;
    /** The share of the intersection our bullets' shadows cover (MOVE-1). */
    public static final int SHADOWED = 4;
    /** The views' score, the first n parts over the next n (or the fallback). */
    public static final int VIEW_SCORE = 5;
    /** The bullet's damage. */
    public static final int DAMAGE = 6;
    /** 1 for a WAVE-3 uncertain wave (trusted at half), else 0. */
    public static final int UNCERTAIN = 7;
    /** Ticks to impact as we stand, at least 1. */
    public static final int TIME_TO_IMPACT = 8;
    /** The distancing quotient, distance now over distance at the move's end. */
    public static final int DISTANCE_QUOTIENT = 9;
    /** The MOVE-12 escape-room multiplier, 1 when the term is off. */
    public static final int ESCAPE = 10;
    /** How many fixed terms come before the view parts. */
    public static final int FIXED = 11;

    private AesRecord() { }

    /**
     * A fresh capture for one option.
     *
     * @param views the number of danger views
     * @return NaN-filled terms, {@link #FIXED} plus {@code 2 * views + 1} long
     */
    public static double[] capture(int views) {
        double[] c = new double[FIXED + 2 * views + 1];
        Arrays.fill(c, Double.NaN);
        return c;
    }

    /**
     * The record's line, without the {@code AES,round,tick,} prefix.
     *
     * @param wave the wave rated
     * @param chosen the ordinal of the option taken
     * @param views the number of danger views
     * @param present whether each option had a plan on the wave, by ordinal
     * @param totals each option's total danger, by ordinal
     * @param captures each option's terms, by ordinal
     * @return the comma-separated fields
     */
    public static String line(Wave wave, int chosen, int views, boolean[] present,
                              double[] totals, double[][] captures) {
        StringBuilder b = new StringBuilder(2048);
        b.append(wave.fireTime).append(',').append(num(wave.bulletPower()))
         .append(',').append(wave.firingWave ? 1 : 0)
         .append(',').append(num(wave.sourceLocation.x)).append(',').append(num(wave.sourceLocation.y))
         .append(',').append(chosen).append(',').append(views);
        for (int o = 0; o < present.length; o++) {
            if (!present[o]) {
                b.append(",0");
                continue;
            }
            b.append(",1,").append(num(totals[o]));
            for (double v : captures[o]) b.append(',').append(num(v));
        }
        return b.toString();
    }

    /** A number in the record: 6 significant digits, NaN as {@code nan}. */
    static String num(double v) {
        if (Double.isNaN(v)) return "nan";
        if (v == 0) return "0";
        return String.format(Locale.ROOT, "%.6g", v);
    }
}
