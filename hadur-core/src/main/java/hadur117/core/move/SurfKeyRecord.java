package hadur117.core.move;

import hadur117.core.model.Wave;

/**
 * SKEY-1: the surf-key record, one line per wave at the three-option surf's first rating of it, with
 * the wave's point in the surf sample's feature space ({@link FlattenerFormula}; its first nine values
 * are the {@link MoveFormula} point the hit views search on). With the ORC record of the same wave and
 * the engine's truth log, the offline fit ({@code data/tools/surf_key_fit.py}) learns per opponent
 * which key weights and kernel width explain that opponent's bullets best. Measurement only: a bench
 * build turns it on, the competition jar never does, and nothing here changes what the surf does.
 *
 * <p>The line, after the {@code SKN,round,tick,} the duel puts in front:
 * {@code fireTime,power,firing,} then the point's values.</p>
 */
public final class SurfKeyRecord {

    private SurfKeyRecord() { }

    /**
     * The record's line, without the {@code SKN,round,tick,} prefix.
     *
     * @param wave the wave rated
     * @param point its surf-key point
     * @return the comma-separated fields
     */
    public static String line(Wave wave, double[] point) {
        StringBuilder b = new StringBuilder(256);
        b.append(wave.fireTime).append(',').append(AesRecord.num(wave.bulletPower()))
         .append(',').append(wave.firingWave ? 1 : 0);
        for (double v : point) b.append(',').append(AesRecord.num(v));
        return b.toString();
    }
}
