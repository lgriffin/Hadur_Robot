package hadur2.core.memory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Everything Hadur remembers about one opponent lineage between battles (the artifact's
 * profile schema): who it is, how recent battles went, how its gun does against us, how
 * it moves under our guns, and seed samples for the KNN views (S4).
 *
 * <p>Counts are floats so that old evidence can fade: once a group of counts passes
 * {@link #DECAY_LIMIT} it is halved, which keeps the profile weighted toward recent
 * battles and bounds every number (RES-2). Lists are capped too: the last
 * {@link #MAX_OUTCOMES} battles, {@link #MAX_GUN_SEED} gun samples and
 * {@link #MAX_SURF_SEED} surf samples.</p>
 *
 * <p>A profile is created or loaded by {@link ProfileLibrary#load} at the first scan
 * (MEM-1), stamped as fought in this battle, and then only changed by
 * {@link ProfileFolder#fold} at each round's end (MEM-2), so it always holds whole rounds.
 * {@link ProfileCodec} writes every field; {@link Tiers} and the adapt and policy
 * packages read it through the derived statistics below.</p>
 *
 * <p>Units: distances in pixels, bullet power in Robocode's 0.1 to 3.0, damage in energy
 * points, lateral velocity in pixels per tick, rates as fractions. The count fields are
 * package-private so that the folder and codec can reach them without accessors; outside
 * the package the profile is read-only except for {@link #addGunSample},
 * {@link #addSurfSample} and {@link #dropSeeds}.</p>
 */
public final class OpponentProfile {

    /** Distance bands of 150 px: under 150, 150-300, 300-450, 450-600, 600 and over. */
    public static final int BANDS = 5;
    /** Bullet power bins of width 0.5 from 0.1 to 3.0; the last bin, [2.5, 3.0], also takes 3.0 itself. */
    public static final int POWER_BINS = 6;
    /** Battles whose outcomes are kept, newest last (RES-2). */
    public static final int MAX_OUTCOMES = 10;
    /** Gun seed samples kept, newest last (RES-2); older ones are dropped first. */
    public static final int MAX_GUN_SEED = 600;
    /** Surf seed samples kept, newest last (RES-2). */
    public static final int MAX_SURF_SEED = 300;
    /** A seed sample as shorts; see {@link Seeds} for what each holds. */
    public static final int SAMPLE_WIDTH = 13;
    /**
     * A count group is halved when it passes this (RES-2). Halving keeps every ratio in the
     * group, so rates are unchanged, but halves the weight of everything seen so far
     * relative to what comes next. The scan counts use ten times this, as a robot is scanned
     * far more often than it fires.
     */
    public static final float DECAY_LIMIT = 4000f;

    /** One battle's result as Hadur saw it. Score is estimated; the robot never sees the enemy's. */
    public static final class BattleOutcome {
        /** Rounds folded so far in this battle; at most 65535, the format's u16. */
        int rounds;
        int wins;
        float ourDamage;
        float theirDamage;

        BattleOutcome(int rounds, int wins, float ourDamage, float theirDamage) {
            this.rounds = rounds;
            this.wins = wins;
            this.ourDamage = ourDamage;
            this.theirDamage = theirDamage;
        }

        /** Rounds of this battle folded into the profile. */
        public int rounds() {
            return rounds;
        }

        /** Rounds Hadur won; never more than {@link #rounds()}. */
        public int wins() {
            return wins;
        }

        /** Bullet damage Hadur dealt, in energy points. */
        public float ourDamage() {
            return ourDamage;
        }

        /** Bullet damage the opponent dealt to Hadur, in energy points. */
        public float theirDamage() {
            return theirDamage;
        }

        /** Rounds won over rounds played; a half when no round was played. */
        public double survivalShare() {
            return rounds == 0 ? 0.5 : (double) wins / rounds;
        }

        /** Our share of the bullet damage both sides dealt; a half when neither dealt any. */
        public double bulletDamageShare() {
            double total = ourDamage + theirDamage;
            return total == 0 ? 0.5 : ourDamage / total;
        }

        /**
         * Robocode's 1v1 score from what the robot can see: 60 a round for surviving
         * (50 survival, 10 last-survivor bonus) plus bullet damage, for each side.
         * Bullet-kill and ram bonuses are left out.
         */
        public double estimatedScoreShare() {
            double ours = 60.0 * wins + ourDamage;
            double theirs = 60.0 * (rounds - wins) + theirDamage;
            return ours + theirs == 0 ? 0.5 : ours / (ours + theirs);
        }

        /** Field-by-field equality, floats compared bitwise; used to check codec round trips. */
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof BattleOutcome)) return false;
            BattleOutcome b = (BattleOutcome) o;
            return rounds == b.rounds && wins == b.wins
                && Float.compare(ourDamage, b.ourDamage) == 0
                && Float.compare(theirDamage, b.theirDamage) == 0;
        }

        @Override
        public int hashCode() {
            return (rounds * 31 + wins) * 31 + Float.hashCode(ourDamage) * 7 + Float.hashCode(theirDamage);
        }
    }

    // Identity.
    private final String key;
    /** The exact name last scanned, version included; at most 255 characters. */
    private String lastName;
    /** Battles this lineage has been loaded for. */
    int battles;
    /** Rounds folded into this profile, over every battle. */
    int rounds;
    /** The battle number ({@link ProfileLibrary}'s clock) it was last fought in; drives MEM-5's eviction order. */
    long lastFought;

    // Outcomes, oldest first.
    final List<BattleOutcome> outcomes = new ArrayList<>();

    // Their gun: how often their bullets hit us. Indexed by distance band (see band()).
    final float[] shotsAtUs = new float[BANDS];
    final float[] hitsOnUs = new float[BANDS];
    /** Their shots and hits while we were moving [0] and stopped [1]. */
    final float[] shotsByMotion = new float[2];
    final float[] hitsByMotion = new float[2];
    /** Their shots by bullet power bin (see {@link #powerBin}). */
    final float[] powerHistogram = new float[POWER_BINS];
    /**
     * Their firing waves that broke on us [0] and their hits over them [1], each hit weighted
     * by our angular width as seen from the shooter: the normalised hit rate (S4, format v2).
     */
    final float[] normalised = new float[2];

    // Their movement: how well our guns do against it.
    /** Virtual-gun waves and weighted hits for the main gun [0] and the anti-surfer gun [1]. */
    final float[] virtualFired = new float[2];
    final float[] virtualHits = new float[2];
    /** Our real bullets fired, and those that hit, by distance band. */
    final float[] ourShots = new float[BANDS];
    final float[] ourHits = new float[BANDS];
    /** Scans, velocity reversals, summed |lateral velocity|, scans near a wall, scans stopped. */
    final float[] motion = new float[5];

    // Seeds: recent samples for the KNN views (S4), in Seeds' quantised layout, oldest first.
    final List<short[]> gunSeed = new ArrayList<>();
    final List<short[]> surfSeed = new ArrayList<>();

    /**
     * An empty profile: a stranger with no battles and no evidence.
     *
     * @param key the lineage key ({@link LineageKey#of}); also the last name until one is set
     */
    public OpponentProfile(String key) {
        this.key = key;
        this.lastName = key;
    }

    /** The lineage key the profile is filed under, such as {@code "abc.Shadow"}. */
    public String key() {
        return key;
    }

    /** The exact name last scanned, such as {@code "abc.Shadow 3.84"}. */
    public String lastName() {
        return lastName;
    }

    /** Battles fought against this lineage, including the current one once loaded. */
    public int battles() {
        return battles;
    }

    /** Rounds folded into the profile over all battles. */
    public int rounds() {
        return rounds;
    }

    /** The battle number this lineage was last fought in (the library's battle clock). */
    public long lastFought() {
        return lastFought;
    }

    /** The last {@link #MAX_OUTCOMES} battles' outcomes, oldest first; read-only. */
    public List<BattleOutcome> outcomes() {
        return Collections.unmodifiableList(outcomes);
    }

    /** Gun seed samples stored. */
    public int gunSeedSize() {
        return gunSeed.size();
    }

    /** Surf seed samples stored. */
    public int surfSeedSize() {
        return surfSeed.size();
    }

    /**
     * The gun seed, oldest first, in {@link Seeds}' quantised layout. The list is read-only
     * but the arrays are the profile's own; callers must not change them.
     */
    public List<short[]> gunSeed() {
        return Collections.unmodifiableList(gunSeed);
    }

    /** The surf seed, oldest first; read-only as for {@link #gunSeed()}. */
    public List<short[]> surfSeed() {
        return Collections.unmodifiableList(surfSeed);
    }

    /**
     * Called once per battle, when the profile is loaded for a new battle: records the
     * exact name, counts the battle, stamps it with the battle clock and opens an empty
     * outcome for it (dropping the oldest past {@link #MAX_OUTCOMES}).
     */
    void startBattle(String exactName, long battleNumber) {
        setLastName(exactName == null ? key : exactName);
        battles++;
        lastFought = battleNumber;
        outcomes.add(new BattleOutcome(0, 0, 0, 0));
        while (outcomes.size() > MAX_OUTCOMES) outcomes.remove(0);
    }

    /** Sets {@link #lastName()}, cut to what the file format can hold. */
    void setLastName(String name) {
        // The file format keeps at most 255 characters of a string.
        this.lastName = name.length() > 255 ? name.substring(0, 255) : name;
    }

    /**
     * The current battle's outcome; the one {@link #startBattle} opened. A profile folded
     * without being started (the library's warm-up) gets one here rather than failing.
     */
    BattleOutcome currentOutcome() {
        if (outcomes.isEmpty()) outcomes.add(new BattleOutcome(0, 0, 0, 0));
        return outcomes.get(outcomes.size() - 1);
    }

    /**
     * Appends a gun sample, dropping the oldest past {@link #MAX_GUN_SEED}.
     *
     * @param sample {@link #SAMPLE_WIDTH} shorts from {@link Seeds#gun(double[])}; copied
     * @throws IllegalArgumentException if the sample has the wrong width
     */
    public void addGunSample(short[] sample) {
        addSample(gunSeed, sample, MAX_GUN_SEED);
    }

    /**
     * Appends a surf sample, dropping the oldest past {@link #MAX_SURF_SEED}.
     *
     * @param sample {@link #SAMPLE_WIDTH} shorts from {@link Seeds#surf(double[])}; copied
     * @throws IllegalArgumentException if the sample has the wrong width
     */
    public void addSurfSample(short[] sample) {
        addSample(surfSeed, sample, MAX_SURF_SEED);
    }

    /** Appends a copy of {@code sample} and trims the list to {@code max}, oldest first (RES-2). */
    private static void addSample(List<short[]> seed, short[] sample, int max) {
        if (sample.length != SAMPLE_WIDTH) {
            throw new IllegalArgumentException("a sample has " + SAMPLE_WIDTH + " values");
        }
        seed.add(sample.clone());
        while (seed.size() > max) seed.remove(0);
    }

    /**
     * Drops both seeds, keeping the stats (MEM-5). The seeds are most of a profile's size
     * (13 shorts a sample, up to 900 samples), so this is what eviction frees.
     *
     * @return whether there was anything to drop
     */
    public boolean dropSeeds() {
        boolean had = !gunSeed.isEmpty() || !surfSeed.isEmpty();
        gunSeed.clear();
        surfSeed.clear();
        return had;
    }

    // Derived statistics. Each rate is NaN while its denominator is zero, so a caller can
    // tell "never seen" from "never hit".

    /** Their bullets we detected, over all bands (decayed counts, so not a whole number). */
    public double theirShots() {
        return sum(shotsAtUs);
    }

    /** Their bullets that hit us over their bullets we saw, or NaN before any shot. */
    public double theirHitRate() {
        double shots = sum(shotsAtUs);
        return shots == 0 ? Double.NaN : sum(hitsOnUs) / shots;
    }

    /**
     * Their raw hit rate on us at one distance band.
     *
     * @param band a band from {@link #band(double)}
     * @return hits over shots in that band, or NaN before any shot there
     */
    public double theirHitRate(int band) {
        return shotsAtUs[band] == 0 ? Double.NaN : hitsOnUs[band] / shotsAtUs[band];
    }

    /** Their raw hit rate on us for shots fired while we were moving, or NaN. */
    public double theirHitRateMoving() {
        return shotsByMotion[0] == 0 ? Double.NaN : hitsByMotion[0] / shotsByMotion[0];
    }

    /** Their raw hit rate on us for shots fired while we were stopped, or NaN. */
    public double theirHitRateStopped() {
        return shotsByMotion[1] == 0 ? Double.NaN : hitsByMotion[1] / shotsByMotion[1];
    }

    /** Their firing waves that broke on us, the denominator of the normalised hit rate. */
    public double normalisedWaves() {
        return normalised[0];
    }

    /** Their hits over those waves, each weighted by our angular width as seen from the shooter. */
    public double normalisedHits() {
        return normalised[1];
    }

    /** Their normalised hit rate on us, or NaN before any wave. */
    public double normalisedHitRate() {
        return normalised[0] == 0 ? Double.NaN : normalised[1] / normalised[0];
    }

    /** The share of their shots in each power bin; all zero before any shot. */
    public double[] powerShares() {
        double total = sum(powerHistogram);
        double[] shares = new double[POWER_BINS];
        for (int i = 0; i < POWER_BINS; i++) shares[i] = total == 0 ? 0 : powerHistogram[i] / total;
        return shares;
    }

    /** Our real bullets fired at them, over all bands. */
    public double ourShots() {
        return sum(ourShots);
    }

    /** Our real bullets' hit rate on them, or NaN before any shot. */
    public double ourHitRate() {
        double shots = sum(ourShots);
        return shots == 0 ? Double.NaN : sum(ourHits) / shots;
    }

    /**
     * Our real bullets' hit rate at one distance band.
     *
     * @param band a band from {@link #band(double)}
     * @return hits over shots in that band, or NaN before any shot there
     */
    public double ourHitRate(int band) {
        return ourShots[band] == 0 ? Double.NaN : ourHits[band] / ourShots[band];
    }

    /** Virtual waves of our main gun, the denominator of its rating. */
    public double virtualWaves() {
        return virtualFired[0];
    }

    /** The main gun's virtual rating: weighted virtual hits per wave. */
    public double mainGunRating() {
        return virtualFired[0] == 0 ? Double.NaN : virtualHits[0] / virtualFired[0];
    }

    /** The anti-surfer gun's virtual rating: weighted virtual hits per wave, or NaN. */
    public double antiSurferRating() {
        return virtualFired[1] == 0 ? Double.NaN : virtualHits[1] / virtualFired[1];
    }

    /** Scans of them folded into the profile. */
    public double scans() {
        return motion[0];
    }

    /** Velocity reversals per scan. */
    public double reversalRate() {
        return motion[0] == 0 ? Double.NaN : motion[1] / motion[0];
    }

    /** Their mean |lateral velocity| across our line of sight, in px per tick (at most 8), or NaN. */
    public double averageLateralVelocity() {
        return motion[0] == 0 ? Double.NaN : motion[2] / motion[0];
    }

    /** The share of scans with their centre within {@link ProfileFolder}'s 50 px of a wall, or NaN. */
    public double wallHugFraction() {
        return motion[0] == 0 ? Double.NaN : motion[3] / motion[0];
    }

    /** The share of scans with their velocity exactly 0, or NaN. */
    public double stoppedFraction() {
        return motion[0] == 0 ? Double.NaN : motion[4] / motion[0];
    }

    /**
     * The band a distance falls in: {@code floor(distance / 150)}, capped at the last band.
     *
     * @param distance in px; NaN or negative reads as band 0
     * @return 0 to {@link #BANDS} - 1
     */
    public static int band(double distance) {
        if (!(distance >= 0)) return 0;
        return (int) Math.min(BANDS - 1, Math.floor(distance / 150.0));
    }

    /**
     * The bin a bullet power falls in: {@code floor(power / 0.5)}, capped at the last bin.
     *
     * @param power a bullet power; NaN or negative reads as bin 0
     * @return 0 to {@link #POWER_BINS} - 1
     */
    public static int powerBin(double power) {
        if (!(power >= 0)) return 0;
        return (int) Math.min(POWER_BINS - 1, Math.floor(power / 0.5));
    }

    /**
     * Halves each group of counts that has grown past {@link #DECAY_LIMIT} (RES-2). A group
     * is halved together (shots with their hits, and so on) so its rates survive. Called
     * after every fold.
     */
    void decay() {
        if (sum(shotsAtUs) > DECAY_LIMIT) {
            halve(shotsAtUs);
            halve(hitsOnUs);
            halve(shotsByMotion);
            halve(hitsByMotion);
            halve(powerHistogram);
        }
        if (normalised[0] > DECAY_LIMIT) halve(normalised);
        if (virtualFired[0] > DECAY_LIMIT || virtualFired[1] > DECAY_LIMIT) {
            halve(virtualFired);
            halve(virtualHits);
        }
        if (sum(ourShots) > DECAY_LIMIT) {
            halve(ourShots);
            halve(ourHits);
        }
        if (motion[0] > DECAY_LIMIT * 10) halve(motion);
    }

    /** The sum of a count group, in double precision. */
    static double sum(float[] a) {
        double s = 0;
        for (float f : a) s += f;
        return s;
    }

    private static void halve(float[] a) {
        for (int i = 0; i < a.length; i++) a[i] /= 2;
    }

    /** Equality over every stored field, seeds included; the codec's round-trip tests use it. */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof OpponentProfile)) return false;
        OpponentProfile p = (OpponentProfile) o;
        return key.equals(p.key) && lastName.equals(p.lastName) && battles == p.battles
            && rounds == p.rounds && lastFought == p.lastFought && outcomes.equals(p.outcomes)
            && Arrays.equals(shotsAtUs, p.shotsAtUs) && Arrays.equals(hitsOnUs, p.hitsOnUs)
            && Arrays.equals(shotsByMotion, p.shotsByMotion)
            && Arrays.equals(hitsByMotion, p.hitsByMotion)
            && Arrays.equals(powerHistogram, p.powerHistogram)
            && Arrays.equals(normalised, p.normalised)
            && Arrays.equals(virtualFired, p.virtualFired)
            && Arrays.equals(virtualHits, p.virtualHits)
            && Arrays.equals(ourShots, p.ourShots) && Arrays.equals(ourHits, p.ourHits)
            && Arrays.equals(motion, p.motion)
            && samplesEqual(gunSeed, p.gunSeed) && samplesEqual(surfSeed, p.surfSeed);
    }

    private static boolean samplesEqual(List<short[]> a, List<short[]> b) {
        if (a.size() != b.size()) return false;
        for (int i = 0; i < a.size(); i++) {
            if (!Arrays.equals(a.get(i), b.get(i))) return false;
        }
        return true;
    }

    /** Consistent with {@link #equals}, from the key and battle count only. */
    @Override
    public int hashCode() {
        return key.hashCode() * 31 + battles;
    }

    @Override
    public String toString() {
        return "OpponentProfile[" + key + ", battles=" + battles + ", rounds=" + rounds
            + ", lastFought=" + lastFought + ", tiers=" + Tiers.label(this) + "]";
    }
}
