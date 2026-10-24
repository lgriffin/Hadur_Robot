package hadur2.core.move;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;
import java.util.function.Consumer;

/**
 * What the duel's surf knows about the enemy's gun: its waves in flight, the KNN danger
 * views that score where on a wave its bullets go, its hit rate on us, and our bullets in
 * flight with the shadows they cast on its waves (MOVE-1). {@link SurfMover} decides where
 * to drive; this class answers how dangerous a place on a wave is.
 *
 * <p><b>Where it sits in the tick.</b> {@code HadurCore} drives it only in the duel posture.
 * Each scan adds an enemy wave at the power the enemy last fired ({@link #addWave},
 * {@link #guessBulletPower}); when the energy ledger explains a drop as a shot (WAVE-1,
 * WAVE-2), {@link #updateFiringWave} marks the matching wave as a real bullet, and only
 * firing waves are surfed, scored or counted. Each duel tick then runs
 * {@link #setKShare} (TIME-1, TIME-2), {@link #checkWaves} (break waves that have passed
 * us and learn from them), {@link #takeBrokenWaveOutcomes} (read by the distance and flavour
 * policies), {@link #updateShadows} (MOVE-1) and finally {@link SurfMover#move}, which asks
 * {@link #findSurfableWave} and {@link #getDangerScore}. Bullet events arrive through
 * {@link #logBulletHit}, {@link #ourBulletFired} and {@link #ourBulletGone}.</p>
 *
 * <p><b>Danger views.</b> Eleven {@link KnnView}s hold past guess factors, each in its own
 * feature space ({@link SimpleFormula}, {@link MoveFormula}, {@link FlattenerFormula}). Most
 * learn only from bullets that hit us; the flatteners learn from every wave that breaks.
 * Each view is on only while the enemy's normalised hit rate on us clears its thresholds,
 * so a gun that rarely hits meets only the simple view, and one that hits often meets the
 * recent and flattener views too. The hit rate is normalised: each hit counts
 * {@code 0.1 / (our angular width)}, scaled by the wave's escape-angle range, so hits from
 * close range (where we look wide) count for less than hits from afar.</p>
 *
 * <p><b>Opponent memory.</b> The opening book can hand in the profile's hit rate as a prior
 * ({@link #setPrior}), which decides the views while it is more certain than the live
 * estimate (DIAL-1, ADAPT-2); it can force the flatteners on ({@link #setFlattenerFirst},
 * ADAPT-2, and MOVE-2's first flavour); and it replays stored hits as seeds that weigh
 * their {@link SeedWeight} against a live sample's 1 ({@link #seed}, ADAPT-3). RES-4 takes
 * the prior away ({@link #clearPrior}) and fades the seeds' weight.</p>
 *
 * <p><b>Units and conventions.</b> Angles are radians on Robocode's compass (0 north,
 * clockwise); guess factors are the firing angle's offset from the wave's bearing to us,
 * signed by our orbit direction, over the wave's maximum escape angle (nominally in
 * [-1, 1]); hit percentages and their margins are in percent, hit rates are fractions.</p>
 *
 * <p><b>Bounds (RES-2).</b> Each view caps its points ({@link KnnView#DEFAULT_MAX_DATA_POINTS}
 * or its own limit); waves are dropped by the {@link WaveManager} when they break and at
 * each round; our bullets leave the list when an event names them, when they leave the
 * field, or at the round's start; the broken-wave outcomes are drained each tick.</p>
 *
 * <p>The move package never sees the gun, melee, memory, adapt, policy or posture packages
 * (the ArchUnit rules): every decision from them comes in through the setters here.</p>
 */
public class MoveController {

    /** MOVE-5: the padded hit rate, in percent, at which the flattener views switch on. */
    public static final double FLATTENER_THRESHOLD = 4.5;

    /**
     * A surf seed sample: the flattener formula's 11 data-point values (the normal views use
     * the first 9), the simple view's lateral-velocity value, and the guess factor that hit us.
     */
    public static final int SAMPLE_WIDTH = 13;

    /**
     * The escape-angle range, in radians, a normalised hit is scaled to: a hit on a wave
     * whose precise escape range is wider than this counts for more, one narrower for less.
     */
    private static final double TYPICAL_ESCAPE_RANGE = 0.98;
    /**
     * The decaying views' age factor: among a search's neighbours, each one older than the
     * next weighs 1 / 1.8 as much (see {@link KnnView#getDecayWeights}), so the views that
     * set it follow a gun that changes its aim.
     */
    private static final double DECAY_RATE = 1.8;

    /** The danger views, in the order {@link #initSurfViews} adds them; never changes size. */
    private final List<KnnView<TimestampedGuessFactor>> views = new ArrayList<>();
    private final BattleField battleField;
    private final MovementPredictor predictor;
    private final WaveManager waveManager;

    /** Enemy firing waves that broke on us this battle, bullet-hit-bullet ones aside. */
    private int raw1v1ShotsFired;
    /** Of those, the ones whose bullet hit us. */
    private int raw1v1ShotsHit;
    /** The same hits, each weighted by our angular width and the escape range (normalised). */
    private double weighted1v1ShotsHit;
    /** The power of the enemy's last detected shot; 0 before the first one of a round. */
    private double lastBulletPower;
    /** The fire time, in ticks, of the wave last marked as the enemy's shot. */
    private long lastBulletFireTime;
    /** The profile's normalised hit rate and margin, in percent; NaN when there is none (ADAPT-2). */
    private double priorHitPercentage = Double.NaN;
    private double priorMarginOfError = Double.NaN;
    /** ADAPT-2: the flattener views are on while the prior stands, whatever the thresholds say. */
    private boolean flattenerFirst;
    /** MOVE-24: the flattener views off (set per battle by the duel, duel only). */
    private boolean flattenerOff;
    private KnnView<TimestampedGuessFactor> flattener, flattener2;
    /** Seeded samples so far; their time, so the decaying views see them oldest first. */
    private int seedsLoaded;
    /** Lays out the first eleven values of each sample handed to {@link #sampleSink}. */
    private final FlattenerFormula sampleFormula = new FlattenerFormula();
    /** Where hits on us go, for the opponent profile's surf seed; null until the opening sets it. */
    private Consumer<double[]> sampleSink;
    /** MOVE-16: the views' multipliers, kept for the battle (not reset by {@link #initRound}). */
    private final ReplicatorWeights replicatorWeights;
    /** MOVE-16: whether the multipliers are learned and applied; off, the weights are fixed. */
    private boolean replicator;
    /** MOVE-21: whether the danger kernel is the point value at the intersection centre (off by default). */
    private boolean pointKernel;

    /**
     * A controller with empty views and no waves, for a battle on {@code battleField}.
     *
     * @param battleField the field, for our bullets leaving it
     * @param predictor the movement predictor the waves share
     */
    public MoveController(BattleField battleField, MovementPredictor predictor) {
        this.battleField = battleField;
        this.predictor = predictor;
        this.waveManager = new WaveManager();
        initSurfViews();
        this.replicatorWeights = new ReplicatorWeights(views.size());
    }

    /**
     * MOVE-16: whether each enemy bullet that hits us moves the danger views' weights toward the
     * views that predicted it (the replicator equation, {@link ReplicatorWeights}). Off, the
     * weights stay fixed and the multipliers are never read.
     *
     * @param on true to learn and apply the multipliers
     */
    public void setReplicator(boolean on) {
        this.replicator = on;
    }

    /** MOVE-21: the danger kernel is the point value at the intersection centre (Diamond's); off, MOVE-4's integral. */
    public void setPointKernel(boolean on) {
        this.pointKernel = on;
    }

    /**
     * MOVE-4 or MOVE-21: the kernel's weight for a neighbour at angle {@code at}: the integrated
     * mass, or with the point kernel on, {@code 2^-|u|} at the intersection's centre
     * ({@code u} in bandwidths), scaled by the share of the intersection the shadows leave.
     */
    double kernel(double at, double bandwidth, List<double[]> segments) {
        return pointKernel ? pointKernelValue(at, bandwidth, segments) : kernelMass(at, bandwidth, segments);
    }

    static double pointKernelValue(double at, double bandwidth, List<double[]> segments) {
        double from = segments.get(0)[0];
        double to = segments.get(segments.size() - 1)[1];
        double open = 0;
        for (double[] s : segments) open += s[2] * (s[1] - s[0]);
        double through = to > from ? open / (to - from) : 1.0;
        double centre = (from + to) / 2;
        return through * Math.pow(2.0, -Math.abs(at - centre) / bandwidth);
    }

    /** DODGE-2: the simple-aim dodger the surf asks, or null when it is off (duel only). */
    private ShotDodger shotDodger;

    /** DODGE-2: sets the dodger the surf asks for each wave's danger; null turns it off. */
    public void setShotDodger(ShotDodger dodger) {
        this.shotDodger = dodger;
    }

    /** DODGE-2: the dodger, or null. */
    public ShotDodger shotDodger() {
        return shotDodger;
    }

    /** MOVE-16: each view's multiplier, in the order the views were built; all 1 until learned. */
    double[] replicatorMultipliers() {
        return replicatorWeights.multipliers();
    }

    /** MOVE-16: the view's weight in the danger average: its own, times its multiplier when on. */
    private double effectiveWeight(int i) {
        KnnView<TimestampedGuessFactor> view = views.get(i);
        return replicator ? view.weight * replicatorWeights.multiplier(i) : view.weight;
    }

    /**
     * Builds the eleven danger views. Each is set by its weight in the danger average, its k
     * (the most neighbours a search returns) and k divisor (a view of n points uses at most
     * n / divisor neighbours, and at least 1), its point cap, its thresholds, its age decay
     * and what it learns from:
     *
     * <ul>
     * <li>"simple": no thresholds, so it is on from the first hit; a stranger's surf starts
     *     with it alone (DIAL-1).</li>
     * <li>"normal": on once their hit rate is at least 3%.</li>
     * <li>"recent1" to "recent6": on at 2.5%, weight 100 each. recent1 and recent2 keep only
     *     the last 1 and 5 hits; recent3 to recent6 keep every hit (to the default cap) but
     *     decay by age, and use 1, 7, 35 and 100 neighbours.</li>
     * <li>"lightFlattener": the {@link MoveFormula} space, learning from every wave, on once
     *     the hit rate less its margin of error is at least 3% (a padded threshold, DIAL-1).</li>
     * <li>"flattener" and "flattener2": the {@link FlattenerFormula} space, learning from
     *     every wave, on once the padded hit rate is at least {@value #FLATTENER_THRESHOLD}% (MOVE-5); flattener2 holds 2,000
     *     points and decays by age. These are the views ADAPT-2 and MOVE-2 turn on early.</li>
     * </ul>
     *
     * <p>The hit views learn from {@link #logBulletHit}, the visit views from
     * {@link #checkWaves}. The weights, k values and thresholds are tuning values; nothing
     * in the repository derives them.</p>
     */
    private void initSurfViews() {
        views.add(new KnnView<TimestampedGuessFactor>(new SimpleFormula())
            .setWeight(3).setK(25).setKDivisor(5).bulletHitsOn()
            .setName("simple"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(40).setK(20).setKDivisor(5).setHitThreshold(3.0).bulletHitsOn()
            .setName("normal"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(1).setMaxDataPoints(1).setHitThreshold(2.5).bulletHitsOn()
            .setName("recent1"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(1).setMaxDataPoints(5).setHitThreshold(2.5).bulletHitsOn()
            .setName("recent2"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(1).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent3"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(7).setKDivisor(4).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent4"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(35).setKDivisor(3).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent5"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(100).setK(100).setKDivisor(2).setHitThreshold(2.5).setDecayRate(DECAY_RATE).bulletHitsOn()
            .setName("recent6"));
        views.add(new KnnView<TimestampedGuessFactor>(new MoveFormula())
            .setWeight(10).setK(50).setMaxDataPoints(1000).setKDivisor(5)
            .setPaddedHitThreshold(3.0).visitsOn()
            .setName("lightFlattener"));
        flattener = new KnnView<TimestampedGuessFactor>(new FlattenerFormula())
            .setWeight(50).setK(25).setMaxDataPoints(300).setKDivisor(12)
            .setPaddedHitThreshold(FLATTENER_THRESHOLD).visitsOn()
            .setName("flattener");
        views.add(flattener);
        flattener2 = new KnnView<TimestampedGuessFactor>(new FlattenerFormula())
            .setWeight(500).setK(50).setMaxDataPoints(2000).setKDivisor(14)
            .setPaddedHitThreshold(FLATTENER_THRESHOLD).setDecayRate(DECAY_RATE).visitsOn()
            .setName("flattener2");
        views.add(flattener2);
    }

    /**
     * ADAPT-2, DIAL-1: the enemy's normalised hit rate on us as the profile knows it. While
     * its margin of error is narrower than the live estimate's, it decides which danger views
     * are enabled, so a gun the profile rates T3 meets the flattener from the first wave.
     *
     * @param hitRate the profile's normalised hit rate, as a fraction
     * @param marginOfError its 95% margin of error, as a fraction
     */
    public void setPrior(double hitRate, double marginOfError) {
        this.priorHitPercentage = 100.0 * hitRate;
        this.priorMarginOfError = 100.0 * marginOfError;
    }

    /**
     * MOVE-24: the two flattener views stay off whatever the hit rate, and nothing forces the
     * visit-logging views on (ADAPT-2's flattener-first is not read); the other views go by their
     * thresholds. The top-5 census (PR #222) measured this, as the {@code flat} ablation (nf), at part
     * of +0.34 APS with swall. The duel sets it, in a duel only.
     *
     * @param flattenerOff true to keep the flatteners off
     */
    public void setFlattenerOff(boolean flattenerOff) {
        this.flattenerOff = flattenerOff;
    }

    /** MOVE-24: whether the flatteners are kept off. */
    public boolean flattenerOff() {
        return flattenerOff;
    }

    /**
     * ADAPT-2: while the prior stands, turn on the flattener views (the ones that learn from
     * every wave, not only hits) as soon as they hold data, whatever their thresholds say.
     * MOVE-2's first flavour sets it too, when the live hit rate beats the profile's. It
     * takes effect at the next danger score.
     *
     * @param flattenerFirst true to force the visit-logging views on whatever the thresholds
     */
    public void setFlattenerFirst(boolean flattenerFirst) {
        this.flattenerFirst = flattenerFirst;
    }

    /**
     * RES-4: forget the profile's estimate and the flattener it asked for; live data decides.
     * {@code HadurCore} calls it once the surf seed's trust finds the live hit rate diverging
     * from the profile's.
     */
    public void clearPrior() {
        this.priorHitPercentage = Double.NaN;
        this.priorMarginOfError = Double.NaN;
        this.flattenerFirst = false;
    }

    /**
     * The views whose thresholds the current estimate meets, data or not: the policy the
     * danger score applies (a view also needs data to count).
     *
     * @return the names of the views on, in the order they were built
     */
    public List<String> viewsOn() {
        List<String> on = new ArrayList<>();
        double[] estimate = viewEstimate();
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (viewOn(view, estimate)) on.add(view.name);
        }
        return on;
    }

    /**
     * DIAL-1: the hit percentage and margin that decide the views: the more certain estimate.
     * Element 0 is the percentage, element 1 its margin, both in percent.
     */
    private double[] viewEstimate() {
        double hitPercentage = normalizedEnemyHitPercentage();
        double marginOfError = hitPercentageMarginOfError();
        // Before any wave has broken the live margin is 100, so any prior wins; as live waves
        // accumulate the live margin narrows and takes over once it is the tighter one.
        if (!Double.isNaN(priorHitPercentage) && priorMarginOfError < marginOfError) {
            hitPercentage = priorHitPercentage;
            marginOfError = priorMarginOfError;
        }
        return new double[] {hitPercentage, marginOfError};
    }

    /**
     * Whether {@code view} is on for {@code estimate} (percentage, margin): forced on when it
     * is a visit-logging (flattener) view and the flattener is forced (ADAPT-2, MOVE-2),
     * otherwise by its thresholds ({@link KnnView#thresholdsMet}).
     */
    private boolean viewOn(KnnView<TimestampedGuessFactor> view, double[] estimate) {
        if (flattenerOff) return view != flattener && view != flattener2 && view.thresholdsMet(estimate[0], estimate[1]);
        if (flattenerFirst && view.logVisits) return true;
        return view.thresholdsMet(estimate[0], estimate[1]);
    }

    /**
     * Whether the profile's estimate is deciding the danger views right now (the same test
     * as the view estimate's).
     *
     * @return true while a prior is set and its margin is narrower than the live one
     */
    public boolean priorInUse() {
        return !Double.isNaN(priorHitPercentage) && priorMarginOfError < hitPercentageMarginOfError();
    }

    /**
     * Receives one {@link #SAMPLE_WIDTH}-value sample per enemy bullet that hits us: the
     * {@link FlattenerFormula} point of the wave (0 to 10), the {@link SimpleFormula}
     * lateral-velocity value (11) and the guess factor that hit (12). The opponent profile
     * stores them as the surf seed a later battle replays through {@link #seed}.
     *
     * @param sampleSink the receiver, or null for none
     */
    public void setSampleSink(Consumer<double[]> sampleSink) {
        this.sampleSink = sampleSink;
    }

    /**
     * ADAPT-3: adds a seeded hit to every view that learns from bullet hits. The flattener
     * views learn from visits, which a seed does not hold, so they get none.
     *
     * @param sample a stored surf sample, laid out as {@link #setSampleSink} describes
     * @param weight the weight all of this battle's surf seeds share; RES-4 lowers it
     * @throws IllegalArgumentException if the sample is not {@link #SAMPLE_WIDTH} values long
     */
    public void seed(double[] sample, SeedWeight weight) {
        if (sample.length != SAMPLE_WIDTH) throw new IllegalArgumentException("a surf sample has 13 values");
        // Seeds are filed under round -1, numbered in load order: older than anything this
        // battle observes, so the decaying views weigh them least.
        TimestampedGuessFactor tsgf = new TimestampedGuessFactor(Timestamped.SEED_ROUND,
            seedsLoaded++, sample[12], weight);
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (!view.logBulletHits) continue;
            double[] point;
            // Cut the sample to the view's space: the simple view takes flight time (0),
            // lateral velocity (11) and acceleration (4); the MoveFormula views the first nine.
            if (view.formula instanceof SimpleFormula) {
                point = new double[] {sample[0], sample[11], sample[4]};
            } else {
                point = Arrays.copyOf(sample, view.formula.weights.length);
            }
            view.logSeed(point, tsgf, weight);
        }
    }

    /**
     * Samples in the danger view called {@code name}, or -1 if there is none.
     *
     * @param name a view name, as {@link #viewsOn} gives them
     * @return the view's point count, seeds included
     */
    public int viewSize(String name) {
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (view.name.equals(name)) return view.size();
        }
        return -1;
    }

    /**
     * Firing waves that have broken on us this battle, bullet-hit-bullet ones aside: the
     * sample size of the normalised hit rate.
     *
     * @return the count since the controller was made (not reset by {@link #initRound})
     */
    public int enemyFiringWaves() {
        return raw1v1ShotsFired;
    }

    /**
     * Whether each firing wave that broke on us since the last call hit us, in the order
     * the waves broke, bullet-hit-bullet ones aside. The list is handed over and emptied.
     * {@code HadurCore} drains it once a duel tick into the rolling hit-rate window that
     * DIST-1 and MOVE-2 read, so it never holds more than a tick's breaks.
     *
     * @return a new list, true for each wave that hit us
     */
    public List<Boolean> takeBrokenWaveOutcomes() {
        List<Boolean> taken = new ArrayList<>(brokenWaveOutcomes);
        brokenWaveOutcomes.clear();
        return taken;
    }

    /**
     * The bullet power of each firing wave that broke on us since the last call, in the order
     * the waves broke and one for each outcome {@link #takeBrokenWaveOutcomes} hands over, so a
     * caller drains both together (POW-11 counts each outcome in its power class). The list is
     * handed over and emptied.
     *
     * @return a new list of powers, as the waves carried them
     */
    public List<Double> takeBrokenWavePowers() {
        List<Double> taken = new ArrayList<>(brokenWavePowers);
        brokenWavePowers.clear();
        return taken;
    }

    /**
     * Their hits on us over those waves, each weighted by our angular width (normalised).
     *
     * @return the weighted hit count this battle; divided by {@link #enemyFiringWaves} it is
     *     {@link #normalizedEnemyHitRate}
     */
    public double enemyWeightedHits() {
        return weighted1v1ShotsHit;
    }

    /**
     * Starts a round, or recovers after a fault (RES-1): drops the waves, our bullets and
     * this round's counts, and the cached neighbours. What the views learned and the
     * battle's hit counts are kept.
     */
    public void initRound() {
        waveManager.initRound();
        raw1v1ShotsFiredThisRound = 0;
        raw1v1ShotsHitThisRound = 0;
        weighted1v1ShotsHitThisRound = 0;
        lastBulletPower = 0;
        brokenWaveOutcomes.clear();
        brokenWavePowers.clear();
        ourBullets.clear();
        plan = List.of();
        lastPlans.clear();
        lastPlanTimes.clear();
        lastOptions.clear();
        lastChosen.clear();
        lastOptionTimes.clear();
        newestWave = null;
        provisionalTime = -1;
        provisionalAnchor = -1;
        shadowedWaves = 0;
        shadowComputations = 0;
        // A new version, so no wave can match a stale one and skip its shadow computation.
        bulletsVersion++;
        clearNeighborCache();
    }

    /** The round's share of the battle counts above; kept up to date but not read here. */
    private int raw1v1ShotsFiredThisRound;
    private int raw1v1ShotsHitThisRound;
    private double weighted1v1ShotsHitThisRound;
    /** Whether each firing wave broken since the last {@link #takeBrokenWaveOutcomes} hit us. */
    private final List<Boolean> brokenWaveOutcomes = new ArrayList<>();
    /** The power of each wave in {@link #brokenWaveOutcomes}, in the same order (POW-11). */
    private final List<Double> brokenWavePowers = new ArrayList<>();
    /** MOVE-1: our bullets in flight, oldest first, for the shadows they cast. */
    private final List<OurBullet> ourBullets = new ArrayList<>();
    /** MOVE-8: where the surf's plan puts us on each wave in the air; empty when it has none. */
    private List<PlanInterval> plan = List.of();
    /** MOVE-9: the last plan interval published for each wave this round, by identity. */
    private final Map<Wave, PlanInterval> lastPlans = new IdentityHashMap<>();
    /** MOVE-9: the tick each of {@link #lastPlans} was published. */
    private final Map<Wave, Long> lastPlanTimes = new IdentityHashMap<>();
    /**
     * MOVE-10: each three-option surf option's first plan on a wave, by option ordinal: the
     * first tick the wave was surfed, when the options were furthest apart.
     */
    private final Map<Wave, PlanInterval[]> lastOptions = new IdentityHashMap<>();
    /** MOVE-10: the ordinal of the option taken when {@link #lastOptions} was published. */
    private final Map<Wave, Integer> lastChosen = new IdentityHashMap<>();
    /** MOVE-10: the tick {@link #lastOptions} was published. */
    private final Map<Wave, Long> lastOptionTimes = new IdentityHashMap<>();
    /** The tick of the latest {@link #checkWaves}, the duel tick a plan is published on. */
    private long lastCheckTime = -1;
    /** MOVE-1: waves that have had a shadow this round. */
    private int shadowedWaves;
    /** Bumped whenever the bullets in flight change; a wave's shadows are current at one version. */
    private long bulletsVersion;
    /** MOVE-1: shadow computations this round, for the round record (TIME-1's saving shows here). */
    private int shadowComputations;

    /**
     * Forgets every view's cached neighbour searches. The cache is keyed by the index of the
     * surfed wave, so it must be cleared whenever the wave at an index changes (a new wave is
     * surfed), when k changes, and at each round.
     */
    public void clearNeighborCache() {
        for (KnnView<TimestampedGuessFactor> view : views) {
            view.clearCache();
        }
        cacheOwners.clear();
    }

    /** MOVE-7: the wave each surf index's cached neighbours were searched for. */
    private final Map<Integer, Wave> cacheOwners = new HashMap<>();

    /**
     * MOVE-7: drops the cached neighbours of a surf index whose wave is not the one they
     * were searched for, so a wave that moved up the surf order never reads another's.
     */
    private void validateCache(Wave w, int surfWaveIndex) {
        if (cacheOwners.get(surfWaveIndex) == w) return;
        for (KnnView<TimestampedGuessFactor> view : views) view.cachedNeighbors.remove(surfWaveIndex);
        cacheOwners.put(surfWaveIndex, w);
    }

    /**
     * TIME-1, TIME-2: the share of k every danger view uses; 1 is all of it. The tick budget
     * sets 0.5 from computation level 2.
     *
     * @param kShare the share, in (0, 1]
     */
    public void setKShare(double kShare) {
        // Called every duel tick: only a change costs anything (and drops the cached searches,
        // which were made with the old k).
        if (kShare == this.kShare) return;
        this.kShare = kShare;
        for (KnnView<TimestampedGuessFactor> view : views) view.setKShare(kShare);
        clearNeighborCache();
    }

    /** The share of k last passed to the views. */
    private double kShare = 1.0;

    /**
     * MOVE-1: one of our bullets has left the gun.
     *
     * @param bullet the bullet, fired from where we stood along the gun's heading
     */
    public void ourBulletFired(OurBullet bullet) {
        ourBullets.add(bullet);
        bulletsVersion++;
    }

    /**
     * MOVE-1: one of our bullets hit, missed or met a bullet. The engine names it by heading
     * and power; an event without a heading (NaN) stands for the oldest bullet of that power.
     * An event that matches no bullet (one already dropped off the field, say) changes
     * nothing.
     *
     * @param heading the bullet's heading, in radians, or NaN when the event has none
     * @param power the bullet's power
     */
    public void ourBulletGone(double heading, double power) {
        // Oldest first, so of two matching bullets the older one goes.
        for (Iterator<OurBullet> it = ourBullets.iterator(); it.hasNext(); ) {
            OurBullet b = it.next();
            if (Double.isNaN(heading) ? Math.abs(b.power - power) < 1e-6 : b.is(heading, power)) {
                it.remove();
                bulletsVersion++;
                return;
            }
        }
    }

    /**
     * MOVE-8: the surf publishes the intervals its plan occupies, one per enemy wave in the
     * air that it scored, nearest wave first. Replaces the last tick's.
     *
     * @param intervals the plan's intervals; copied
     */
    public void publishPlan(List<PlanInterval> intervals) {
        plan = intervals.isEmpty() ? List.of() : List.copyOf(intervals);
        // MOVE-9: the latest plan on each wave, kept after it stops being published.
        for (PlanInterval i : plan) {
            lastPlans.put(i.wave, i);
            lastPlanTimes.put(i.wave, lastCheckTime);
        }
    }

    /**
     * MOVE-9: the last interval the surf published for wave {@code w} this round, or null when
     * it never planned on it.
     */
    public PlanInterval lastPlanFor(Wave w) {
        return lastPlans.get(w);
    }

    /**
     * MOVE-10: the three-option surf's plan on its first wave for every option it rated this
     * tick, by option ordinal (a null slot for an option with no plan there), and the ordinal
     * it took. Only the first publication on each wave is kept, until the round ends: by the
     * tick before a wave arrives every option leads to the same place, so only the first
     * says whether another option would have dodged a hit. Measurement only.
     *
     * @param options one interval or null per option, all on the same wave; copied
     * @param chosen the ordinal of the option taken
     * @return true when these were the wave's first options, the ones kept
     */
    public boolean publishOptions(PlanInterval[] options, int chosen) {
        Wave w = null;
        for (PlanInterval i : options) if (i != null) w = i.wave;
        if (w == null) return false;
        if (lastOptions.containsKey(w)) return false;
        lastOptions.put(w, options.clone());
        lastChosen.put(w, chosen);
        lastOptionTimes.put(w, lastCheckTime);
        return true;
    }

    /** AES-1: whether wave {@code w} has had its first options published this round. */
    public boolean hasOptions(Wave w) {
        return lastOptions.containsKey(w);
    }

    /** MOVE-10: the tick {@link #lastOptionsFor} was published, or -1 when there is none. */
    public long lastOptionTime(Wave w) {
        Long t = lastOptionTimes.get(w);
        return t == null ? -1 : t;
    }

    /** MOVE-10: the options last published for wave {@code w}, or null when there are none. */
    public PlanInterval[] lastOptionsFor(Wave w) {
        PlanInterval[] o = lastOptions.get(w);
        return o == null ? null : o.clone();
    }

    /** MOVE-10: the ordinal of the option taken with {@link #lastOptionsFor}, or -1. */
    public int lastChosenFor(Wave w) {
        Integer c = lastChosen.get(w);
        return c == null ? -1 : c;
    }

    /** MOVE-9: the tick {@link #lastPlanFor} was published, or -1 when there is none. */
    public long lastPlanTime(Wave w) {
        Long t = lastPlanTimes.get(w);
        return t == null ? -1 : t;
    }

    /** MOVE-8: withdraws the plan, for a tick on which the surf does not drive. */
    public void clearPlan() {
        plan = List.of();
    }

    /**
     * MOVE-8: the guess-factor interval, as the absolute bearing interval from each wave's
     * source, that the current plan occupies when that wave arrives, for each enemy wave in
     * the air the surf scored. Read-only; the duel's gun reads it (GUN-7).
     *
     * @return an unmodifiable list, empty when the surf has no plan on any wave
     */
    public List<PlanInterval> planIntervals() {
        return plan;
    }

    /** MOVE-1: our bullets still in flight, as far as the events and the field edge tell. */
    public int ourBulletsInFlight() {
        return ourBullets.size();
    }

    /**
     * MOVE-1: forgets bullets that have left the field by {@code time} and computes the
     * shadow our bullets in flight cast on each firing wave. A shadow depends only on the
     * wave and the bullets, not the time, so a wave is recomputed only when it is new or the
     * bullets in flight have changed since (TIME-1: a slow tick repeats none of it).
     *
     * @param time the current tick
     */
    public void updateShadows(long time) {
        // RES-2: a bullet whose event we never get (or have not got yet) still leaves the
        // list once it is off the field.
        if (ourBullets.removeIf(b -> {
            java.awt.geom.Point2D.Double p = b.at(time);
            return p.x < 0 || p.y < 0 || p.x > battleField.width || p.y > battleField.height;
        })) {
            bulletsVersion++;
        }
        waveManager.forAllWaves(w -> {
            // Only real bullets can be shadowed; a wave already current needs nothing.
            if (!w.firingWave || w.shadowVersion == bulletsVersion) return;
            w.shadowVersion = bulletsVersion;
            shadowComputations++;
            if (ourBullets.isEmpty()) {
                w.setShadows(new ArrayList<>());
            } else {
                List<List<double[]>> shadows =
                    BulletShadows.of(w, ourBullets, battleField.width, battleField.height);
                w.setShadows(shadows.get(0), shadows.get(1));
            }
            // Count each wave once per round, the first time it has any shadow at all.
            if (!w.possibleShadows().isEmpty() && !w.everShadowed) {
                w.everShadowed = true;
                shadowedWaves++;
            }
        });
    }

    /** MOVE-1: how many times a wave's shadows were computed this round. */
    public int shadowComputations() {
        return shadowComputations;
    }

    /** MOVE-1: enemy firing waves one of our bullets shadowed this round. */
    public int shadowedWaves() {
        return shadowedWaves;
    }

    /** The enemy waves in flight at us, firing or not. */
    public WaveManager getWaveManager() {
        return waveManager;
    }

    /** The power of the enemy's last detected shot this round; 0 before the first. */
    public double getLastBulletPower() {
        return lastBulletPower;
    }

    /** The fire time, in ticks, of the wave last marked as the enemy's shot. */
    public long getLastBulletFireTime() {
        return lastBulletFireTime;
    }

    /**
     * Logs our position on every enemy wave and breaks the waves that have wholly passed us
     * this tick. A firing wave that breaks teaches the flattener views where we were
     * (whether or not it hit) and counts toward the enemy's hit rate on us.
     *
     * @param currentTime the current tick
     * @param myLocation our position this tick, in px
     */
    public void checkWaves(long currentTime, Point2D.Double myLocation) {
        lastCheckTime = currentTime;
        // Only location and time matter here: a wave's position test and the precise
        // intersection read our 36 x 36 px hit box, which Robocode keeps axis-aligned
        // whatever our heading.
        RobotState myState = RobotState.newBuilder()
            .setLocation(myLocation).setTime(currentTime).build();
        waveManager.checkActiveWaves(currentTime, myState, (w, breakStates) -> {
            if (w.firingWave) {
                onFiringWaveBreak(w, breakStates, currentTime);
            }
        });
    }

    /**
     * Learns from a firing wave that has passed us. The precise intersection is the range of
     * firing angles that would have hit us on any tick the wave was crossing us, from the
     * states logged while it did; its centre is the guess factor the flatteners log, and its
     * half-width ({@code bandwidth}) is how wide we looked from the source.
     */
    private void onFiringWaveBreak(Wave w, List<RobotState> breakStates,
                                    long currentTime) {
        Wave.Intersection intersection = w.preciseIntersection(breakStates);
        // No logged state touched the wave (scans missed while it crossed us): nothing to learn.
        if (intersection == null) return;

        int currentRound = w.fireRound;
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (!view.logVisits) continue;
            // MOVE-25: a visit learned is a change of the views too.
            viewRevision++;
            // Visits are logged even for a wave our bullet destroyed: we were still there.
            double gf = w.guessFactor(intersection.angle);
            view.logWave(w, new TimestampedGuessFactor(currentRound, currentTime, gf));
        }

        // A bullet that met one of ours never had its chance at us, so it is no shot at us.
        if (!w.bulletHitBullet) {
            raw1v1ShotsFired++;
            raw1v1ShotsFiredThisRound++;
            brokenWaveOutcomes.add(w.hitByBullet);
            brokenWavePowers.add(w.bulletPower());
            if (w.hitByBullet) {
                // Normalise the hit: it counts (range / width) * (0.1 / 0.98), where width is
                // our full angular width at the intersection and range the wave's precise
                // escape range, both in radians. range / width is the inverse of a uniformly
                // random shot's chance of hitting us, so a close-range hit on a wide target
                // counts less; a hit at 0.1 rad wide over a 0.98 rad range counts exactly 1.
                double angularBotWidth = intersection.bandwidth * 2.0;
                double thisHit = 0.1 / angularBotWidth
                    * (w.escapeAngleRange() / TYPICAL_ESCAPE_RANGE);
                weighted1v1ShotsHit += thisHit;
                weighted1v1ShotsHitThisRound += thisHit;
                raw1v1ShotsHit++;
                raw1v1ShotsHitThisRound++;
            }
        }
    }

    /**
     * An enemy bullet hit us: teaches every hit view the guess factor it was fired at, and
     * hands the stored-sample form to the sample sink. The wave's {@code hitByBullet} flag,
     * set by the caller, makes it count as a hit when it breaks.
     *
     * @param hitWave the wave the bullet belongs to ({@link #findBulletWave}); null does nothing
     * @param bulletLocation where the bullet was when it hit, in px
     * @param currentRound the round, for the sample's age
     * @param currentTime the tick, for the sample's age
     */
    public void logBulletHit(Wave hitWave, Point2D.Double bulletLocation,
                              int currentRound, long currentTime) {
        if (hitWave == null) return;
        // The bullet lies on its firing line, so its bearing from the source is the exact
        // angle it was fired at.
        double hitGF = hitWave.guessFactor(bulletLocation);
        // MOVE-25: the stop-point surf replans once the views have learned something new.
        viewRevision++;
        // MOVE-16: rate the hit before any view learns it, so each view is judged on a prediction.
        if (replicator) updateReplicator(hitWave, hitGF);
        for (KnnView<TimestampedGuessFactor> view : views) {
            if (!view.logBulletHits) continue;
            view.logWave(hitWave, new TimestampedGuessFactor(
                currentRound, currentTime, hitGF));
        }
        if (sampleSink != null) {
            // Laid out as setSampleSink says: the flattener point, then two extra slots.
            double[] sample = Arrays.copyOf(sampleFormula.dataPointFromWave(hitWave), SAMPLE_WIDTH);
            sample[11] = (hitWave.lateralVelocity() + 0.1) / 8.1;
            sample[12] = hitGF;
            sampleSink.accept(sample);
        }
    }

    /**
     * MOVE-16: the replicator step for a bullet fired at {@code hitGf} on wave {@code w}. Each view
     * that is on with data (the test {@link #getDangerScore} applies) is rated by its density at
     * that guess factor, normalised over the {@link HitForensics#SAMPLES} guess factors in
     * [-1, 1]; {@link ReplicatorWeights#update} moves the multipliers. Read-only on the views:
     * it uses the cache slot of {@link #dangerPercentile} and empties it after.
     */
    private void updateReplicator(Wave w, double hitGf) {
        int n = views.size();
        double bandwidth = Math.atan(HitForensics.HALF_WIDTH / Math.max(w.targetDistance, HitForensics.HALF_WIDTH));
        double[] estimate = viewEstimate();
        double[] weights = new double[n];
        double[] densities = new double[n];
        boolean[] on = new boolean[n];
        try {
            validateCache(w, FORENSICS_CACHE);
            for (int i = 0; i < n; i++) {
                KnnView<TimestampedGuessFactor> view = views.get(i);
                weights[i] = view.weight;
                if (view.effectiveSize() == 0 || !viewOn(view, estimate)) continue;
                on[i] = true;
                List<KdTree.Entry<TimestampedGuessFactor>> neighbors =
                    getNearestNeighbors(view, w, FORENSICS_CACHE);
                Map<Timestamped, Double> weightMap = view.getDecayWeights(neighbors);
                double[] scan = new double[neighbors.size()];
                double[] angle = new double[neighbors.size()];
                for (int k = 0; k < scan.length; k++) {
                    KdTree.Entry<TimestampedGuessFactor> entry = neighbors.get(k);
                    scan[k] = weightMap.get(entry.value)
                        / Math.sqrt(Math.max(entry.distance, MIN_DISTANCE)) * entry.value.weight();
                    angle[k] = w.firingAngle(entry.value.guessFactor);
                }
                double[] grid = new double[HitForensics.SAMPLES];
                for (int g = 0; g < grid.length; g++) {
                    grid[g] = kernelSum(w, scan, angle, HitForensics.sampleGuessFactor(g), bandwidth);
                }
                densities[i] = ReplicatorWeights.density(kernelSum(w, scan, angle, hitGf, bandwidth), grid);
            }
            replicatorWeights.update(weights, on, densities);
        } finally {
            for (KnnView<TimestampedGuessFactor> view : views) view.cachedNeighbors.remove(FORENSICS_CACHE);
            cacheOwners.remove(FORENSICS_CACHE);
        }
    }

    /** MOVE-16: the neighbours' point kernels {@code 2^-|u|} summed at guess factor {@code gf} (u in half-widths). */
    private static double kernelSum(Wave w, double[] scan, double[] angle, double gf, double bandwidth) {
        double at = w.firingAngle(gf);
        double sum = 0;
        for (int k = 0; k < scan.length; k++) {
            sum += scan[k] * Math.pow(2.0, -Math.abs(DiaUtils.normalizeAngle(angle[k], at) - at) / bandwidth);
        }
        return sum;
    }

    /** MOVE-9: the neighbour-cache key the HF danger reading uses, apart from every surf index. */
    private static final int FORENSICS_CACHE = -1;

    /**
     * MOVE-9: how the danger views rate the angle a bullet came from, as the share of the
     * wave's guess factors in [-1, 1] ({@link HitForensics#SAMPLES} of them) they score less
     * dangerous. Call it before {@link #logBulletHit} so the hit itself does not teach the
     * reading. It uses a cache slot of its own and empties it after, so the surf's cached
     * neighbours and its choices are untouched.
     *
     * @param w the wave that carried the bullet
     * @param hitGf the guess factor the bullet was fired at
     * @return the percentile in [0, 1]
     */
    public double dangerPercentile(Wave w, double hitGf) {
        double bandwidth = Math.atan(HitForensics.HALF_WIDTH / Math.max(w.targetDistance, HitForensics.HALF_WIDTH));
        double[] samples = new double[HitForensics.SAMPLES];
        try {
            double at = getDangerScore(w, new Wave.Intersection(w.firingAngle(hitGf), bandwidth), FORENSICS_CACHE);
            for (int i = 0; i < samples.length; i++) {
                samples[i] = getDangerScore(w, new Wave.Intersection(
                    w.firingAngle(HitForensics.sampleGuessFactor(i)), bandwidth), FORENSICS_CACHE);
            }
            return HitForensics.percentile(samples, at);
        } finally {
            for (KnnView<TimestampedGuessFactor> view : views) view.cachedNeighbors.remove(FORENSICS_CACHE);
            cacheOwners.remove(FORENSICS_CACHE);
        }
    }

    /**
     * The firing wave a bullet of {@code bulletPower} at {@code bulletLocation} belongs to:
     * the one whose radius this tick is nearest the bullet's distance from its source,
     * within 50 px (see {@link WaveManager#findClosestWave}).
     *
     * @param bulletLocation the bullet's position, in px
     * @param currentTime the current tick
     * @param botName the shooter's name, or null for any
     * @param bulletPower the bullet's power, which the wave's must match
     * @return the wave, or null when none matches
     */
    public Wave findBulletWave(Point2D.Double bulletLocation, long currentTime,
                                String botName, double bulletPower) {
        return waveManager.findClosestWave(bulletLocation, currentTime,
            true, botName, bulletPower);
    }

    /** The movement wave added last (MOVE-11's candidate). */
    private Wave newestWave;
    /** The tick whose newest wave may be surfed as a provisional one, or -1 (MOVE-11). */
    private long provisionalTime = -1;
    /**
     * MOVE-11: the fire time of the movement wave held as the provisional one, or -1. It is
     * held while the gun stays ready, so the surf ranks its options against one wave rather
     * than a new one each tick (which made it reverse almost every tick).
     */
    private long provisionalAnchor = -1;
    /** MOVE-13: whether the provisional wave is held (true) or taken afresh each tick. */
    private boolean provisionalHold = true;

    /**
     * Adds an enemy wave. {@code HadurCore} adds one every scan, at the power the enemy last
     * fired; only the one {@link #updateFiringWave} marks becomes a firing wave.
     *
     * @param w the wave, from the enemy's position to ours
     */
    public void addWave(Wave w) {
        waveManager.addWave(w);
        newestWave = w;
    }

    /**
     * MOVE-11: whether this tick's newest movement wave may be surfed as the enemy's next
     * shot. The duel decides (the enemy's gun is about to be cool, the switch is on) and
     * says so each tick; the move package never reads the enemy's gun heat.
     *
     * @param ready whether the gun-heat wave is wanted this tick
     * @param time the tick
     */
    /**
     * MOVE-13: whether the provisional wave is held while the gun stays ready (MOVE-11) or taken
     * afresh each tick, which makes the surf re-rank its options every tick.
     *
     * @param hold true to hold
     */
    public void setProvisionalHold(boolean hold) {
        provisionalHold = hold;
    }

    public void setProvisionalReady(boolean ready, long time) {
        provisionalTime = ready ? time : -1;
        if (!ready) provisionalAnchor = -1;
    }

    /**
     * The movement wave surfed in place of a bullet not yet fired, or null (MOVE-11). The wave
     * of the first ready tick is held while the gun stays ready; once it has gone or been found
     * to be a real shot, this tick's newest wave takes its place. A held wave about to pass
     * {@code myState} is not offered, but stays held until it has gone, so a predicted state
     * never moves the hold.
     */
    private Wave provisionalWave(RobotState myState) {
        if (!provisionalHold) provisionalAnchor = -1;
        Wave held = provisionalAnchor < 0 ? null : waveManager.getWaveByFireTime(provisionalAnchor);
        if (held == null || held.firingWave || held.altWave) {
            held = null;
            provisionalAnchor = -1;
            Wave w = newestWave;
            if (w != null && w.fireTime == provisionalTime && !w.firingWave && !w.altWave) {
                held = w;
                provisionalAnchor = w.fireTime;
            }
        }
        if (held == null) return null;
        return held.checkWavePosition(myState, Wave.WavePosition.BREAKING_CENTER).getIndex()
            >= Wave.WavePosition.BREAKING_CENTER.getIndex() ? null : held;
    }

    /**
     * Marks the wave the enemy fired as a real bullet of {@code bulletPower}. The shot was
     * fired between the previous scan and the tick before this one; after missed scans the
     * latest wave in that span stands in for it. Returns the fire time of the wave marked,
     * or {@code currentTime - 1} when no wave exists.
     *
     * <p>Called only for a drop the energy ledger could not explain, within [0.1, 3.0]
     * (WAVE-1, WAVE-2), so every firing wave stands for a real shot.</p>
     *
     * @param previousScanTime the tick of the scan before this one
     * @param currentTime the tick of this scan
     * @param bulletPower the shot's power, from the corrected energy drop
     * @param uncertain WAVE-3: whether a wall hit was inferred on the same interval, so the
     *     wave is surfed at half weight ({@code SurfMover})
     * @return the marked wave's fire time, or {@code currentTime - 1}
     */
    public long updateFiringWave(long previousScanTime, long currentTime, double bulletPower,
                                  boolean uncertain) {
        // Newest first: after missed scans the latest wave in the span is the best guess.
        for (long fireTime = currentTime - 1; fireTime >= previousScanTime; fireTime--) {
            Wave w = waveManager.getWaveByFireTime(fireTime);
            if (w != null) {
                w.firingWave = true;
                w.uncertain = uncertain;
                // The wave was made at the guessed power; the real one fixes its speed and
                // escape angle.
                w.setBulletPower(bulletPower);
                // WAVE-4: the wall room is a function of the power's escape angle.
                w.setWallDistances();
                lastBulletPower = bulletPower;
                lastBulletFireTime = fireTime;
                return fireTime;
            }
        }
        return currentTime - 1;
    }

    /**
     * The {@code surfIndex}-th firing wave (0 the first) that has not yet reached our centre
     * and has not already hit us or met one of our bullets.
     *
     * @param surfIndex which wave, counting from 0 in the order the waves were added
     * @param myState our state, real or predicted
     * @return the wave, or null when there are not that many
     */
    public Wave findSurfableWave(int surfIndex, RobotState myState) {
        // BREAKING_CENTER is the first unsurfable position: once the wave's front will pass
        // our centre next tick it is too late to dodge it.
        Wave real = waveManager.findSurfableWave(surfIndex, myState,
            Wave.WavePosition.BREAKING_CENTER);
        if (real != null || provisionalTime < 0) return real;
        // MOVE-11: with fewer than two real waves in the air, the next shot's wave follows
        // them. It is a movement wave still, so no statistic ever counts it.
        if (surfIndex >= 2) return null;
        if (surfIndex > 0 && waveManager.findSurfableWave(surfIndex - 1, myState,
            Wave.WavePosition.BREAKING_CENTER) == null) {
            return null;
        }
        return provisionalWave(myState);
    }

    /**
     * How dangerous it is to be at {@code intersection} when wave {@code w} breaks, by the
     * views that are on: a weighted average, in [0, 1], of how close each neighbour's
     * firing angle falls to the intersection. The shadow (MOVE-1), the bullet's damage and
     * its time to impact are applied by {@link SurfMover}, not here.
     *
     * <p>Each neighbour found for the wave (the enemy's past firing situations most like
     * this one) contributes a kernel {@code 2^-|u|}, where {@code u} is the distance from its
     * firing angle to the intersection's centre in units of the intersection's half-width:
     * 1 at the centre, 1/2 at our edge, and falling off beyond. A neighbour weighs its age
     * decay, over its feature-space distance, times its seed weight (ADAPT-3). Each view's
     * weighted sum is multiplied by the view's weight; the total is divided by the total
     * weight, so the result is an average, not a sum.</p>
     *
     * <p>When no view is on with data, or all neighbours weigh nothing (faded seeds, RES-4),
     * it falls back to a fixed guess: a head-on gun and one aiming near the escape angle.</p>
     *
     * @param w the wave being surfed
     * @param intersection the firing angles that would hit us (centre and half-width)
     * @param surfWaveIndex the wave's index among the surfable waves, which keys the
     *     neighbour cache
     * @return the danger, in [0, 1] from the views; the fallback's sum can be up to 4
     */
    public double getDangerScore(Wave w, Wave.Intersection intersection,
                                  int surfWaveIndex) {
        return getDangerScore(w, intersection, surfWaveIndex, null);
    }

    /**
     * AES-1: {@link #getDangerScore}, also writing each view's two sums into {@code parts}
     * when it is not null: {@code parts[i]} is view {@code i}'s weight times its density,
     * {@code parts[n + i]} its weight times its scan weight (both 0 for a view that is off
     * or empty), and {@code parts[2n]} the fallback's danger when the fallback was used, else
     * NaN. The score is the sum of the first n over the sum of the next n. Measurement only.
     *
     * @param parts null, or at least {@code 2 * viewCount() + 1} long
     */
    double getDangerScore(Wave w, Wave.Intersection intersection, int surfWaveIndex,
                          double[] parts) {
        if (parts != null) Arrays.fill(parts, 0, 2 * views.size(), 0.0);
        double dangerAngle = intersection.angle;
        double bandwidth = intersection.bandwidth;
        validateCache(w, surfWaveIndex);
        // MOVE-3: the intersection cut at the shadows' edges, each part with what gets through.
        List<double[]> segments = w.transmission(intersection);
        double totalDanger = 0;
        double totalScanWeight = 0;
        int enabledSize = 0;
        double[] estimate = viewEstimate();

        for (int vi = 0; vi < views.size(); vi++) {
            KnnView<TimestampedGuessFactor> view = views.get(vi);
            // RES-4: a view holding only faded seeds is as good as empty.
            if (view.effectiveSize() == 0 || !viewOn(view, estimate)) continue;
            double viewWeight = effectiveWeight(vi);
            enabledSize += view.effectiveSize();

            List<KdTree.Entry<TimestampedGuessFactor>> neighbors =
                getNearestNeighbors(view, w, surfWaveIndex);
            Map<Timestamped, Double> weightMap = view.getDecayWeights(neighbors);

            double density = 0;
            double viewScanWeight = 0;
            for (KdTree.Entry<TimestampedGuessFactor> entry : neighbors) {
                TimestampedGuessFactor tsgf = entry.value;
                // ADAPT-3: a seeded sample counts for its seed's weight, a live one for 1.
                // entry.distance is the squared weighted distance, so this divides by the
                // Euclidean distance: nearer situations count for more.
                // An exact feature match has distance 0; the floor keeps the weight finite
                // (#50 item 4) while still letting that neighbour dominate.
                double scanWeight = weightMap.get(tsgf)
                    / Math.sqrt(Math.max(entry.distance, MIN_DISTANCE)) * tsgf.weight();
                // The neighbour's guess factor as an angle on this wave, unwrapped near ours.
                double xFiringAngle = DiaUtils.normalizeAngle(
                    w.firingAngle(tsgf.guessFactor), dangerAngle);
                // MOVE-4: the kernel's mass over the whole intersection, not its height at the
                // centre; MOVE-3: counting only what the shadows let through.
                density += scanWeight * kernel(xFiringAngle, bandwidth, segments);
                viewScanWeight += scanWeight;
            }
            totalScanWeight += viewScanWeight * viewWeight;
            totalDanger += viewWeight * density;
            if (parts != null) {
                parts[vi] = viewWeight * density;
                parts[views.size() + vi] = viewWeight * viewScanWeight;
            }
        }

        // !(x > 0) also catches NaN.
        if (enabledSize == 0 || !(totalScanWeight > 0)) {
            double fallback = defaultDanger(w, segments, bandwidth);
            if (parts != null) parts[2 * views.size()] = fallback;
            return fallback;
        }
        if (parts != null) parts[2 * views.size()] = Double.NaN;
        return totalDanger / totalScanWeight;
    }

    /**
     * MOVE-14: each danger view's own score at {@code intersection}, and its share of the
     * average, for the protean pick's spread. The views are the ones {@link #getDangerScore}
     * averages, with the same kernel and shadows: view {@code i}'s danger is its density over
     * its scan weight, and its share is its weight times its scan weight, normalised to sum
     * to 1, so the weighted mean of the dangers is {@link #getDangerScore} (less its no-data
     * fallback). Read-only: it only reads the neighbour cache, as {@link #getDangerScore} does.
     *
     * @param w the wave being surfed
     * @param intersection the firing angles that would hit us
     * @param surfWaveIndex the wave's index among the surfable waves, which keys the cache
     * @param dangers receives each counted view's danger; at least as long as the view list
     * @param weights receives each counted view's normalised weight; same length
     * @return how many views were counted (0 when none is on with data)
     */
    int viewDangers(Wave w, Wave.Intersection intersection, int surfWaveIndex,
                    double[] dangers, double[] weights) {
        double dangerAngle = intersection.angle;
        double bandwidth = intersection.bandwidth;
        validateCache(w, surfWaveIndex);
        List<double[]> segments = w.transmission(intersection);
        double[] estimate = viewEstimate();
        int n = 0;
        double total = 0;
        for (int vi = 0; vi < views.size(); vi++) {
            KnnView<TimestampedGuessFactor> view = views.get(vi);
            if (view.effectiveSize() == 0 || !viewOn(view, estimate)) continue;
            List<KdTree.Entry<TimestampedGuessFactor>> neighbors =
                getNearestNeighbors(view, w, surfWaveIndex);
            Map<Timestamped, Double> weightMap = view.getDecayWeights(neighbors);
            double density = 0;
            double viewScanWeight = 0;
            for (KdTree.Entry<TimestampedGuessFactor> entry : neighbors) {
                TimestampedGuessFactor tsgf = entry.value;
                double scanWeight = weightMap.get(tsgf)
                    / Math.sqrt(Math.max(entry.distance, MIN_DISTANCE)) * tsgf.weight();
                double xFiringAngle = DiaUtils.normalizeAngle(
                    w.firingAngle(tsgf.guessFactor), dangerAngle);
                density += scanWeight * kernel(xFiringAngle, bandwidth, segments);
                viewScanWeight += scanWeight;
            }
            // !(x > 0) also catches NaN: such a view adds nothing to the average either.
            if (!(viewScanWeight > 0)) continue;
            dangers[n] = density / viewScanWeight;
            weights[n] = effectiveWeight(vi) * viewScanWeight;
            total += weights[n];
            n++;
        }
        if (!(total > 0)) return 0;
        for (int i = 0; i < n; i++) weights[i] /= total;
        return n;
    }

    /** MOVE-14: how many danger views there are, the size of {@link #viewDangers}' arrays. */
    int viewCount() {
        return views.size();
    }

    /**
     * MOVE-14: the fewest ticks before a real (firing) wave that has not yet hit us or met
     * one of our bullets reaches our centre, as we stand now; infinity when there is none.
     * A wave already past our centre is not counted. Read-only.
     *
     * @param myState our state now
     * @return the ticks, 0 or more, or {@link Double#POSITIVE_INFINITY}
     */
    public double soonestFiringImpact(RobotState myState) {
        double[] soonest = {Double.POSITIVE_INFINITY};
        waveManager.forAllWaves(w -> {
            if (!w.firingWave || w.processedBulletHit()) return;
            double remaining = myState.location.distance(w.sourceLocation)
                - w.distanceTraveled(myState.time);
            if (remaining < 0) return;
            soonest[0] = Math.min(soonest[0], remaining / w.bulletSpeed());
        });
        return soonest[0];
    }

    /**
     * The view's neighbours for wave {@code w}, searched once per surfed-wave index and then
     * cached: a wave's features are fixed, and the surf asks for the same wave many times a
     * tick (every option, every predicted tick). {@link #clearNeighborCache} empties it.
     */
    @SuppressWarnings("unchecked")
    private List<KdTree.Entry<TimestampedGuessFactor>> getNearestNeighbors(
            KnnView<TimestampedGuessFactor> view, Wave w, int surfWaveIndex) {
        if (!view.cachedNeighbors.containsKey(surfWaveIndex)) {
            view.cachedNeighbors.put(surfWaveIndex,
                (List) view.nearestNeighbors(w, false));
        }
        return (List<KdTree.Entry<TimestampedGuessFactor>>)
            (List<?>) view.cachedNeighbors.get(surfWaveIndex);
    }

    /**
     * The danger with no data: the same kernel as {@link #getDangerScore}, summed (not
     * averaged) over two assumed guns: head-on (guess factor 0, weight 3) and one firing at
     * 0.85 of the escape angle toward our direction of travel (weight 1).
     */
    private double defaultDanger(Wave w, List<double[]> segments, double bandwidth) {
        double[] guessFactors = {0.0, 0.85};
        double[] weights = {3.0, 1.0};
        double danger = 0;
        for (int i = 0; i < guessFactors.length; i++) {
            double firingAngle = w.firingAngle(guessFactors[i]);
            double centre = (segments.get(0)[0] + segments.get(segments.size() - 1)[1]) / 2;
            danger += weights[i] * kernel(DiaUtils.normalizeAngle(firingAngle, centre), bandwidth, segments);
        }
        return danger;
    }

    /** MOVE-25: counts every sample the danger views learn, hit or visit, this battle. */
    private long viewRevision;

    /** MOVE-25: the danger views' revision; it changes whenever a view learns a hit or a visit. */
    public long viewRevision() {
        return viewRevision;
    }

    /**
     * MOVE-25: the danger views' firing angles for {@code w} as a histogram over the classic
     * guess factor: {@code bins} equal bins across [-1, 1], each holding the summed weight of
     * the neighbours whose guess factor falls in it (view weight times scan weight, the same
     * weights {@link #getDangerScore} averages), normalised to sum to 1. No kernel and no
     * shadows: the stop-point surf smooths it and applies them. With no view on with data it
     * holds {@link #defaultDanger}'s fixed guess (GF 0 weight 3, GF 0.85 weight 1).
     *
     * @param w the wave
     * @param surfWaveIndex the wave's index among the surfable waves, which keys the cache
     * @param bins the number of bins, at least 2
     * @return the histogram, summing to 1
     */
    public double[] dangerProfile(Wave w, int surfWaveIndex, int bins) {
        validateCache(w, surfWaveIndex);
        double[] out = new double[bins];
        double[] estimate = viewEstimate();
        double total = 0;
        for (int vi = 0; vi < views.size(); vi++) {
            KnnView<TimestampedGuessFactor> view = views.get(vi);
            if (view.effectiveSize() == 0 || !viewOn(view, estimate)) continue;
            double viewWeight = effectiveWeight(vi);
            List<KdTree.Entry<TimestampedGuessFactor>> neighbors =
                getNearestNeighbors(view, w, surfWaveIndex);
            Map<Timestamped, Double> weightMap = view.getDecayWeights(neighbors);
            for (KdTree.Entry<TimestampedGuessFactor> entry : neighbors) {
                TimestampedGuessFactor tsgf = entry.value;
                double scanWeight = weightMap.get(tsgf)
                    / Math.sqrt(Math.max(entry.distance, MIN_DISTANCE)) * tsgf.weight();
                double add = viewWeight * scanWeight;
                if (!(add > 0)) continue;
                out[profileBin(tsgf.guessFactor, bins)] += add;
                total += add;
            }
        }
        if (!(total > 0)) {
            Arrays.fill(out, 0.0);
            out[profileBin(0.0, bins)] += 0.75;
            out[profileBin(0.85, bins)] += 0.25;
            return out;
        }
        for (int i = 0; i < bins; i++) out[i] /= total;
        return out;
    }

    /** MOVE-25: the bin of {@code gf} among {@code bins} equal bins over [-1, 1], clamped. */
    static int profileBin(double gf, int bins) {
        int b = (int) Math.floor((gf + 1) / 2 * bins);
        return Math.max(0, Math.min(bins - 1, b));
    }

    /** Floor for a neighbour's squared distance, so an exact match weighs a lot but not infinitely. */
    private static final double MIN_DISTANCE = 1e-12;

    /**
     * MOVE-3, MOVE-4: the mass of the kernel {@code 2^(-|a - at| / bandwidth)} over the
     * intersection's segments, each scaled by its transmission, and normalised so that a kernel
     * centred on an unshadowed intersection scores 1 (the value the point kernel gave there).
     * It is the kernel's antiderivative, so a wide intersection is charged for every angle that
     * hits, at the cost of a few exponentials a neighbour.
     */
    static double kernelMass(double at, double bandwidth, List<double[]> segments) {
        double mass = 0;
        for (double[] s : segments) {
            if (s[2] <= 0) continue;
            mass += s[2] * (kernelCdf(s[1], at, bandwidth) - kernelCdf(s[0], at, bandwidth));
        }
        return mass;
    }

    /** The kernel's integral from {@code at}, in units where [at - b, at + b] weighs 1. */
    private static double kernelCdf(double a, double at, double bandwidth) {
        double d = (a - at) / bandwidth;
        double m = 1.0 - Math.pow(2.0, -Math.abs(d));
        return d >= 0 ? m : -m;
    }

    /**
     * The enemy's normalised hit rate on us this battle: weighted hits per firing wave, a
     * fraction; 0 before any wave has broken. It is not capped at 1.
     *
     * @return the rate
     */
    public double normalizedEnemyHitRate() {
        return raw1v1ShotsFired == 0 ? 0.0
            : weighted1v1ShotsHit / (double) raw1v1ShotsFired;
    }

    /** {@link #normalizedEnemyHitRate}, in percent: what the views' thresholds compare to. */
    public double normalizedEnemyHitPercentage() {
        return 100.0 * normalizedEnemyHitRate();
    }

    /**
     * The 95% margin of error of {@link #normalizedEnemyHitPercentage}, in percent: the
     * normal approximation {@code 1.96 sqrt(p (1 - p) / n)} over the firing waves. With no
     * waves it is 100, as uncertain as can be (DIAL-1).
     *
     * @return the margin, in percent
     */
    public double hitPercentageMarginOfError() {
        if (raw1v1ShotsFired == 0) return 100.0;
        return 100.0 * DiaUtils.marginOfError(normalizedEnemyHitRate(), raw1v1ShotsFired);
    }

    /**
     * The power to give a new enemy wave before we know if it is a shot: the last shot's
     * power this round, else 1.9.
     *
     * @return a bullet power in [0.1, 3.0]
     */
    public double guessBulletPower() {
        return lastBulletPower > 0 ? lastBulletPower : 1.9;
    }
}
