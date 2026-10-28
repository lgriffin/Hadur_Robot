package hadur117.core.move;

import hadur117.core.model.Wave;

/**
 * ORACLE-1 (K0 of the road to king): the oracle record, one line per wave at the three-option
 * surf's first rating of it, with every danger view's neighbours on the wave, so models of the
 * enemy's gun can be scored offline against the bullet the engine says was fired
 * ({@code data/tools/gun_oracle.py}, docs/requirements.md ORACLE-1). Measurement only: a bench
 * build turns it on, the competition jar never does, and nothing here changes what the surf does.
 *
 * <p>The line, after the {@code ORC,round,tick,} the duel puts in front:
 * {@code fireTime,power,firing,sourceX,sourceY,absBearing,orbitDirection,maxEscapeAngle,distance,chosen,}
 * then for each option in ordinal order (counter-clockwise, stop, clockwise) its plan interval
 * {@code low,high} ({@code nan,nan} with no plan on the wave), then {@code views}, then per view
 * {@code on,weight,count} and {@code count} pairs {@code guessFactor,scanWeight}
 * ({@link MoveController#oracleNeighbours}). A guess factor {@code g} is the absolute angle
 * {@code absBearing + g * orbitDirection * maxEscapeAngle} from the source. The surf's view score
 * on an interval is then each view's weight times its neighbours' kernel mass over the interval,
 * summed, over each view's weight times its summed scan weight.</p>
 */
public final class OracleRecord {

    /** Fields per view before its neighbours: on, weight, count. */
    public static final int VIEW_HEAD = 3;

    private OracleRecord() { }

    /**
     * The record's line, without the {@code ORC,round,tick,} prefix.
     *
     * @param wave the wave rated
     * @param chosen the ordinal of the option taken
     * @param firsts each option's plan interval on the wave, by ordinal, null for none
     * @param views the number of danger views
     * @param neighbours {@link MoveController#oracleNeighbours} of the wave
     * @return the comma-separated fields
     */
    public static String line(Wave wave, int chosen, PlanInterval[] firsts, int views, double[] neighbours) {
        StringBuilder b = new StringBuilder(8192);
        b.append(wave.fireTime).append(',').append(AesRecord.num(wave.bulletPower()))
         .append(',').append(wave.firingWave ? 1 : 0)
         .append(',').append(AesRecord.num(wave.sourceLocation.x))
         .append(',').append(AesRecord.num(wave.sourceLocation.y))
         .append(',').append(AesRecord.num(wave.absBearing))
         .append(',').append(wave.orbitDirection)
         .append(',').append(AesRecord.num(wave.maxEscapeAngle()))
         .append(',').append(AesRecord.num(wave.targetDistance))
         .append(',').append(chosen);
        for (PlanInterval p : firsts) {
            b.append(',').append(p == null ? "nan" : AesRecord.num(p.low))
             .append(',').append(p == null ? "nan" : AesRecord.num(p.high));
        }
        b.append(',').append(views);
        for (double v : neighbours) b.append(',').append(AesRecord.num(v));
        return b.toString();
    }
}
