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
 */
public final class OpponentProfile {

    /** Distance bands: under 150, 150-300, 300-450, 450-600, 600 and over. */
    public static final int BANDS = 5;
    /** Bullet power bins of width 0.5 from 0.1 to 3.0. */
    public static final int POWER_BINS = 6;
    public static final int MAX_OUTCOMES = 10;
    public static final int MAX_GUN_SEED = 600;
    public static final int MAX_SURF_SEED = 300;
    /** A seed sample as shorts; see {@link Seeds} for what each holds. */
    public static final int SAMPLE_WIDTH = 13;
    /** A count group is halved when it passes this. */
    public static final float DECAY_LIMIT = 4000f;

    /** One battle's result as Hadur saw it. Score is estimated; the robot never sees the enemy's. */
    public static final class BattleOutcome {
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

        public int rounds() {
            return rounds;
        }

        public int wins() {
            return wins;
        }

        public float ourDamage() {
            return ourDamage;
        }

        public float theirDamage() {
            return theirDamage;
        }

        public double survivalShare() {
            return rounds == 0 ? 0.5 : (double) wins / rounds;
        }

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
    private String lastName;
    int battles;
    int rounds;
    long lastFought;

    // Outcomes, oldest first.
    final List<BattleOutcome> outcomes = new ArrayList<>();

    // Their gun: how often their bullets hit us.
    final float[] shotsAtUs = new float[BANDS];
    final float[] hitsOnUs = new float[BANDS];
    /** Their shots and hits while we were moving [0] and stopped [1]. */
    final float[] shotsByMotion = new float[2];
    final float[] hitsByMotion = new float[2];
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
    final float[] ourShots = new float[BANDS];
    final float[] ourHits = new float[BANDS];
    /** Scans, velocity reversals, summed |lateral velocity|, scans near a wall, scans stopped. */
    final float[] motion = new float[5];

    // Seeds: recent samples for the KNN views (S4).
    final List<short[]> gunSeed = new ArrayList<>();
    final List<short[]> surfSeed = new ArrayList<>();

    public OpponentProfile(String key) {
        this.key = key;
        this.lastName = key;
    }

    public String key() {
        return key;
    }

    public String lastName() {
        return lastName;
    }

    public int battles() {
        return battles;
    }

    public int rounds() {
        return rounds;
    }

    public long lastFought() {
        return lastFought;
    }

    public List<BattleOutcome> outcomes() {
        return Collections.unmodifiableList(outcomes);
    }

    public int gunSeedSize() {
        return gunSeed.size();
    }

    public int surfSeedSize() {
        return surfSeed.size();
    }

    public List<short[]> gunSeed() {
        return Collections.unmodifiableList(gunSeed);
    }

    public List<short[]> surfSeed() {
        return Collections.unmodifiableList(surfSeed);
    }

    /** Called once per battle, when the profile is loaded for a new battle. */
    void startBattle(String exactName, long battleNumber) {
        setLastName(exactName == null ? key : exactName);
        battles++;
        lastFought = battleNumber;
        outcomes.add(new BattleOutcome(0, 0, 0, 0));
        while (outcomes.size() > MAX_OUTCOMES) outcomes.remove(0);
    }

    void setLastName(String name) {
        // The file format keeps at most 255 characters of a string.
        this.lastName = name.length() > 255 ? name.substring(0, 255) : name;
    }

    /** The current battle's outcome; the one {@link #startBattle} opened. */
    BattleOutcome currentOutcome() {
        if (outcomes.isEmpty()) outcomes.add(new BattleOutcome(0, 0, 0, 0));
        return outcomes.get(outcomes.size() - 1);
    }

    public void addGunSample(short[] sample) {
        addSample(gunSeed, sample, MAX_GUN_SEED);
    }

    public void addSurfSample(short[] sample) {
        addSample(surfSeed, sample, MAX_SURF_SEED);
    }

    private static void addSample(List<short[]> seed, short[] sample, int max) {
        if (sample.length != SAMPLE_WIDTH) {
            throw new IllegalArgumentException("a sample has " + SAMPLE_WIDTH + " values");
        }
        seed.add(sample.clone());
        while (seed.size() > max) seed.remove(0);
    }

    /** Drops both seeds, keeping the stats (MEM-5). Returns whether there was anything to drop. */
    public boolean dropSeeds() {
        boolean had = !gunSeed.isEmpty() || !surfSeed.isEmpty();
        gunSeed.clear();
        surfSeed.clear();
        return had;
    }

    // Derived statistics.

    public double theirShots() {
        return sum(shotsAtUs);
    }

    /** Their bullets that hit us over their bullets we saw, or NaN before any shot. */
    public double theirHitRate() {
        double shots = sum(shotsAtUs);
        return shots == 0 ? Double.NaN : sum(hitsOnUs) / shots;
    }

    public double theirHitRate(int band) {
        return shotsAtUs[band] == 0 ? Double.NaN : hitsOnUs[band] / shotsAtUs[band];
    }

    public double theirHitRateMoving() {
        return shotsByMotion[0] == 0 ? Double.NaN : hitsByMotion[0] / shotsByMotion[0];
    }

    public double theirHitRateStopped() {
        return shotsByMotion[1] == 0 ? Double.NaN : hitsByMotion[1] / shotsByMotion[1];
    }

    public double normalisedWaves() {
        return normalised[0];
    }

    public double normalisedHits() {
        return normalised[1];
    }

    /** Their normalised hit rate on us, or NaN before any wave. */
    public double normalisedHitRate() {
        return normalised[0] == 0 ? Double.NaN : normalised[1] / normalised[0];
    }

    /** The share of their shots in each power bin. */
    public double[] powerShares() {
        double total = sum(powerHistogram);
        double[] shares = new double[POWER_BINS];
        for (int i = 0; i < POWER_BINS; i++) shares[i] = total == 0 ? 0 : powerHistogram[i] / total;
        return shares;
    }

    public double ourShots() {
        return sum(ourShots);
    }

    public double ourHitRate() {
        double shots = sum(ourShots);
        return shots == 0 ? Double.NaN : sum(ourHits) / shots;
    }

    public double ourHitRate(int band) {
        return ourShots[band] == 0 ? Double.NaN : ourHits[band] / ourShots[band];
    }

    public double virtualWaves() {
        return virtualFired[0];
    }

    /** The main gun's virtual rating: weighted virtual hits per wave. */
    public double mainGunRating() {
        return virtualFired[0] == 0 ? Double.NaN : virtualHits[0] / virtualFired[0];
    }

    public double antiSurferRating() {
        return virtualFired[1] == 0 ? Double.NaN : virtualHits[1] / virtualFired[1];
    }

    public double scans() {
        return motion[0];
    }

    /** Velocity reversals per scan. */
    public double reversalRate() {
        return motion[0] == 0 ? Double.NaN : motion[1] / motion[0];
    }

    public double averageLateralVelocity() {
        return motion[0] == 0 ? Double.NaN : motion[2] / motion[0];
    }

    public double wallHugFraction() {
        return motion[0] == 0 ? Double.NaN : motion[3] / motion[0];
    }

    public double stoppedFraction() {
        return motion[0] == 0 ? Double.NaN : motion[4] / motion[0];
    }

    /** The band a distance falls in. */
    public static int band(double distance) {
        if (!(distance >= 0)) return 0;
        return (int) Math.min(BANDS - 1, Math.floor(distance / 150.0));
    }

    /** The bin a bullet power falls in. */
    public static int powerBin(double power) {
        if (!(power >= 0)) return 0;
        return (int) Math.min(POWER_BINS - 1, Math.floor(power / 0.5));
    }

    /** Halves each group of counts that has grown past {@link #DECAY_LIMIT}. */
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

    static double sum(float[] a) {
        double s = 0;
        for (float f : a) s += f;
        return s;
    }

    private static void halve(float[] a) {
        for (int i = 0; i < a.length; i++) a[i] /= 2;
    }

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
