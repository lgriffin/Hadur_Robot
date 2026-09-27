package hadur2.core.memory;

/**
 * Collects one round's observations of the opponent and folds them into its profile when
 * the round ends (MEM-2). The core reports what it sees as it sees it; nothing reaches the
 * profile until {@link #fold}, so the profile always holds whole rounds.
 *
 * <p>Distances are those at the moment of the observation: a shot is filed under the
 * distance when it was fired or detected, a hit under the distance its wave was fired
 * from when that is known.</p>
 *
 * <p>{@code HadurCore} makes one folder per battle, at the first scan, around the profile
 * the library loaded, and reports what it sees of the duel opponent as it sees it. The virtual-gun and
 * normalised counts arrive differently from the rest: the gun and the surf keep battle
 * totals, so the core hands the folder those totals just before {@link #fold} and the
 * folder adds only what they grew by since the previous fold.</p>
 *
 * <p>Every per-round buffer is bounded (RES-2): the counts are fixed-size arrays and the
 * seed buffers keep only the latest {@link OpponentProfile#MAX_GUN_SEED} and
 * {@link OpponentProfile#MAX_SURF_SEED} samples. Non-finite damage and lateral velocity
 * are read as 0, so one bad input cannot poison a profile that lasts many battles.</p>
 */
public final class ProfileFolder {

    /** A robot centre closer than this to a wall is hugging it. */
    static final double WALL_MARGIN = 50;

    private final OpponentProfile profile;
    private final double fieldWidth;
    private final double fieldHeight;

    private final float[] shotsAtUs = new float[OpponentProfile.BANDS];
    private final float[] hitsOnUs = new float[OpponentProfile.BANDS];
    private final float[] shotsByMotion = new float[2];
    private final float[] hitsByMotion = new float[2];
    private final float[] powers = new float[OpponentProfile.POWER_BINS];
    private final float[] ourShots = new float[OpponentProfile.BANDS];
    private final float[] ourHits = new float[OpponentProfile.BANDS];
    private final float[] motion = new float[5];
    private float ourDamage;
    private float theirDamage;
    /** The sign of their last non-zero velocity, to count reversals; 0 before one is seen. */
    private int lastVelocitySign;
    /** Virtual-gun totals at the last fold; the gun keeps battle totals, the profile wants rounds. */
    private final double[] virtualAtLastFold = new double[4];
    private final double[] virtualNow = new double[4];
    /** Their firing waves and weighted hits, battle totals at the last fold and now. */
    private final double[] normalisedAtLastFold = new double[2];
    private final double[] normalisedNow = new double[2];
    /** This round's seed samples, quantised, newest last. */
    private final java.util.ArrayDeque<short[]> gunSamples = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<short[]> surfSamples = new java.util.ArrayDeque<>();

    /**
     * A folder for one battle against the opponent {@code profile} describes.
     *
     * @param profile the loaded profile, which {@link #fold} changes
     * @param fieldWidth the battlefield's width in px, for the wall-hug count
     * @param fieldHeight the battlefield's height in px
     */
    public ProfileFolder(OpponentProfile profile, double fieldWidth, double fieldHeight) {
        this.profile = profile;
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
    }

    /** The profile this folder adds to. */
    public OpponentProfile profile() {
        return profile;
    }

    /**
     * The ledger found an enemy shot of {@code power} at {@code distance} (a firing wave
     * after WAVE-1's corrections).
     *
     * @param distance the distance between the robots when the drop was seen, in px
     * @param power the bullet's power
     * @param weWereMoving whether our velocity was non-zero
     */
    public void enemyShot(double distance, double power, boolean weWereMoving) {
        shotsAtUs[OpponentProfile.band(distance)]++;
        shotsByMotion[weWereMoving ? 0 : 1]++;
        powers[OpponentProfile.powerBin(power)]++;
    }

    /**
     * One of their bullets hit us.
     *
     * @param distance the distance its wave was fired from, or the last scan's distance
     *     when the wave is not known, in px
     * @param weWereMoving whether our velocity was non-zero
     * @param damage the energy we lost to it; non-finite reads as 0
     */
    public void hitByEnemy(double distance, boolean weWereMoving, double damage) {
        hitsOnUs[OpponentProfile.band(distance)]++;
        hitsByMotion[weWereMoving ? 0 : 1]++;
        theirDamage += finite(damage);
    }

    /**
     * We fired a real bullet.
     *
     * @param distance the distance to the enemy at the last scan, in px
     */
    public void ourShot(double distance) {
        ourShots[OpponentProfile.band(distance)]++;
    }

    /**
     * One of our real bullets hit the enemy.
     *
     * @param distance the distance to the enemy at the last scan, in px
     * @param damage the damage it dealt, in energy points; non-finite reads as 0
     */
    public void ourHit(double distance, double damage) {
        ourHits[OpponentProfile.band(distance)]++;
        ourDamage += finite(damage);
    }

    /**
     * A scan of the enemy: its velocity, its velocity across our line of sight, where it is.
     *
     * @param velocity its velocity in px per tick, negative when reversing
     * @param lateralVelocity its velocity across our line of sight, in px per tick
     * @param x its x in px
     * @param y its y in px
     */
    public void enemyScanned(double velocity, double lateralVelocity, double x, double y) {
        motion[0]++;
        // A reversal is a change of sign between non-zero velocities; stopping in between
        // does not reset the comparison.
        int sign = velocity > 0 ? 1 : velocity < 0 ? -1 : 0;
        if (sign != 0) {
            if (lastVelocitySign != 0 && sign != lastVelocitySign) motion[1]++;
            lastVelocitySign = sign;
        }
        // 8 px per tick is Robocode's top speed, so anything larger is bad input.
        motion[2] += (float) Math.min(8, Math.abs(finite(lateralVelocity)));
        if (x < WALL_MARGIN || y < WALL_MARGIN || x > fieldWidth - WALL_MARGIN
                || y > fieldHeight - WALL_MARGIN) {
            motion[3]++;
        }
        if (velocity == 0) motion[4]++;
    }

    /**
     * The virtual guns' battle totals so far: main waves, main weighted hits, anti-surfer
     * waves, anti-surfer weighted hits. Only the growth since the last fold is folded.
     *
     * @param mainFired the main gun's virtual waves so far this battle
     * @param mainHits its weighted virtual hits
     * @param asFired the anti-surfer gun's virtual waves so far this battle
     * @param asHits its weighted virtual hits
     */
    public void virtualGuns(double mainFired, double mainHits, double asFired, double asHits) {
        virtualNow[0] = mainFired;
        virtualNow[1] = mainHits;
        virtualNow[2] = asFired;
        virtualNow[3] = asHits;
    }

    /**
     * The surf's battle totals so far: their firing waves that broke on us and their hits
     * over them, each weighted by our angular width. Only the growth since the last fold is
     * folded.
     *
     * @param waves their firing waves that broke on us so far this battle
     * @param weightedHits their hits over those waves, weighted
     */
    public void normalised(double waves, double weightedHits) {
        normalisedNow[0] = waves;
        normalisedNow[1] = weightedHits;
    }

    /**
     * A gun sample (see {@link Seeds}) from one of our bullets' waves; kept until the fold.
     *
     * @param sample 13 values in the gun layout
     */
    public void gunSample(double[] sample) {
        keep(gunSamples, Seeds.gun(sample), OpponentProfile.MAX_GUN_SEED);
    }

    /**
     * A surf sample (see {@link Seeds}) from an enemy bullet that hit us; kept until the fold.
     *
     * @param sample 13 values in the surf layout
     */
    public void surfSample(double[] sample) {
        keep(surfSamples, Seeds.surf(sample), OpponentProfile.MAX_SURF_SEED);
    }

    /** Appends {@code sample}, keeping only the latest {@code max} (RES-2). */
    private static void keep(java.util.ArrayDeque<short[]> buffer, short[] sample, int max) {
        buffer.addLast(sample);
        while (buffer.size() > max) buffer.removeFirst();
    }

    /**
     * MEM-2: adds this round to the profile and starts the next one.
     *
     * <p>The core calls this once per round, at its end, after passing the battle totals
     * to {@link #virtualGuns} and {@link #normalised}. The profile then decays any count
     * group past its limit (RES-2).</p>
     *
     * @param won whether Hadur won the round
     */
    public void fold(boolean won) {
        OpponentProfile p = profile;
        add(p.shotsAtUs, shotsAtUs);
        add(p.hitsOnUs, hitsOnUs);
        add(p.shotsByMotion, shotsByMotion);
        add(p.hitsByMotion, hitsByMotion);
        add(p.powerHistogram, powers);
        add(p.ourShots, ourShots);
        add(p.ourHits, ourHits);
        add(p.motion, motion);
        p.virtualFired[0] += growth(0);
        p.virtualHits[0] += growth(1);
        p.virtualFired[1] += growth(2);
        p.virtualHits[1] += growth(3);
        // Remember the totals just folded, so the next fold adds only the next round's growth.
        System.arraycopy(virtualNow, 0, virtualAtLastFold, 0, 4);
        p.normalised[0] += growth(normalisedNow[0] - normalisedAtLastFold[0]);
        p.normalised[1] += growth(normalisedNow[1] - normalisedAtLastFold[1]);
        System.arraycopy(normalisedNow, 0, normalisedAtLastFold, 0, 2);
        for (short[] sample : gunSamples) p.addGunSample(sample);
        for (short[] sample : surfSamples) p.addSurfSample(sample);

        OpponentProfile.BattleOutcome o = p.currentOutcome();
        // Capped at what the format's u16 fields can hold, keeping wins at most rounds.
        o.rounds = Math.min(o.rounds + 1, 0xffff);
        if (won) o.wins = Math.min(o.wins + 1, o.rounds);
        o.ourDamage += ourDamage;
        o.theirDamage += theirDamage;
        p.rounds++;
        p.decay();
        reset();
    }

    /** Growth of virtual-gun total {@code i} since the last fold. */
    private float growth(int i) {
        return growth(virtualNow[i] - virtualAtLastFold[i]);
    }

    /**
     * A total's growth as a count: negative growth (a total that went down) and
     * non-finite values add nothing.
     */
    private static float growth(double g) {
        return g > 0 && !Double.isInfinite(g) ? (float) g : 0f;
    }

    /**
     * Clears the round's buffers. The battle totals at the last fold are kept: they are
     * what the next round's growth is measured from.
     */
    private void reset() {
        java.util.Arrays.fill(shotsAtUs, 0);
        java.util.Arrays.fill(hitsOnUs, 0);
        java.util.Arrays.fill(shotsByMotion, 0);
        java.util.Arrays.fill(hitsByMotion, 0);
        java.util.Arrays.fill(powers, 0);
        java.util.Arrays.fill(ourShots, 0);
        java.util.Arrays.fill(ourHits, 0);
        java.util.Arrays.fill(motion, 0);
        ourDamage = 0;
        theirDamage = 0;
        lastVelocitySign = 0;
        gunSamples.clear();
        surfSamples.clear();
    }

    /** Adds {@code from} into {@code into}, element by element. */
    private static void add(float[] into, float[] from) {
        for (int i = 0; i < into.length; i++) into[i] += from[i];
    }

    /** {@code d}, or 0 when it is NaN or infinite. */
    private static double finite(double d) {
        return Double.isNaN(d) || Double.isInfinite(d) ? 0 : d;
    }
}
