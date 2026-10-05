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
    /** Seeded samples so far; their time, so the decaying views see them oldest first. */
    private int seedsLoaded;
    /** Lays out the first eleven values of each sample handed to {@link #sampleSink}. */
    private final FlattenerFormula sampleFormula = new FlattenerFormula();
    /** Where hits on us go, for the opponent profile's surf seed; null until the opening sets it. */
    private Consumer<double[]> sampleSink;

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
        views.add(new KnnView<TimestampedGuessFactor>(new FlattenerFormula())
            .setWeight(50).setK(25).setMaxDataPoints(300).setKDivisor(12)
            .setPaddedHitThreshold(FLATTENER_THRESHOLD).visitsOn()
            .setName("flattener"));
        views.add(new KnnView<TimestampedGuessFactor>(new FlattenerFormula())
            .setWeight(500).setK(50).setMaxDataPoints(2000).setKDivisor(14)
            .setPaddedHitThreshold(FLATTENER_THRESHOLD).setDecayRate(DECAY_RATE).visitsOn()
            .setName("flattener2"));
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

    /**
     * Adds an enemy wave. {@code HadurCore} adds one every scan, at the power the enemy last
     * fired; only the one {@link #updateFiringWave} marks becomes a firing wave.
     *
     * @param w the wave, from the enemy's position to ours
     */
    public void addWave(Wave w) {
        waveManager.addWave(w);
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
        return waveManager.findSurfableWave(surfIndex, myState,
            Wave.WavePosition.BREAKING_CENTER);
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
        double dangerAngle = intersection.angle;
        double bandwidth = intersection.bandwidth;
        validateCache(w, surfWaveIndex);
        // MOVE-3: the intersection cut at the shadows' edges, each part with what gets through.
        List<double[]> segments = w.transmission(intersection);
        double totalDanger = 0;
        double totalScanWeight = 0;
        int enabledSize = 0;
        double[] estimate = viewEstimate();

        for (KnnView<TimestampedGuessFactor> view : views) {
            // RES-4: a view holding only faded seeds is as good as empty.
            if (view.effectiveSize() == 0 || !viewOn(view, estimate)) continue;
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
                density += scanWeight * kernelMass(xFiringAngle, bandwidth, segments);
                viewScanWeight += scanWeight;
            }
            totalScanWeight += viewScanWeight * view.weight;
            totalDanger += view.weight * density;
        }

        // !(x > 0) also catches NaN.
        if (enabledSize == 0 || !(totalScanWeight > 0)) {
            return defaultDanger(w, segments, bandwidth);
        }
        return totalDanger / totalScanWeight;
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
    private static double defaultDanger(Wave w, List<double[]> segments, double bandwidth) {
        double[] guessFactors = {0.0, 0.85};
        double[] weights = {3.0, 1.0};
        double danger = 0;
        for (int i = 0; i < guessFactors.length; i++) {
            double firingAngle = w.firingAngle(guessFactors[i]);
            double centre = (segments.get(0)[0] + segments.get(segments.size() - 1)[1]) / 2;
            danger += weights[i] * kernelMass(DiaUtils.normalizeAngle(firingAngle, centre), bandwidth, segments);
        }
        return danger;
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
