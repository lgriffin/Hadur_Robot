package hadur2.core.gun;

import hadur2.core.model.*;
import hadur2.core.physics.*;
import hadur2.core.knn.*;
import hadur2.core.gun.*;
import hadur2.core.move.*;

import java.awt.geom.Point2D;
import java.util.*;
import java.util.function.Consumer;

/**
 * The duel's gun: owns every opponent's gun views, picks which gun aims, scores the virtual
 * guns, learns from each gun wave as it breaks, and chooses the bullet power.
 *
 * <p>Where it sits in the tick: {@code HadurCore} builds a gun wave at every scan of the
 * enemy and hands broken waves to {@link #onWaveBreak}; on each duel tick it calls
 * {@link #aim} (once the gun is within three ticks of cooling) and, when a real bullet goes
 * out, {@link #fireVirtualBullets}. It asks {@link #calculateBulletPower} for the power of
 * the next wave, which the core's power policy may then raise (POW-1, POW-2 live there).
 * The opening book's and the tick budget's decisions come in through {@link #setOpening}
 * and {@link #setKShare}, and the opponent profile's seeds through {@link #seed}.</p>
 *
 * <p>Which gun aims, in a duel:</p>
 * <ol>
 * <li>With an opening from the profile, that gun from the first wave (ADAPT-1), until the
 *     live virtual-gun ratings differ by more than their margin of error (DIAL-1).</li>
 * <li>Otherwise head-on until the main view holds {@link #DATA_THRESHOLD} points that still
 *     count, then the anti-surfer gun while its virtual rating is strictly higher, else the
 *     main gun (1.20's rule).</li>
 * </ol>
 * <p>With several opponents at the battle's start only the main gun aims and no virtual
 * guns are scored.</p>
 *
 * <p>Growth is bounded (RES-2): views are per opponent name and each is capped by its tree;
 * the virtual bullets are keyed by wave and cleared at each round's start. Angles are
 * Robocode bearings in radians (0 north, clockwise); guess factors are in [-1, 1].</p>
 */
public class GunController {

    /** The gun an opening book asks for until the live virtual guns clearly disagree (ADAPT-1). */
    public enum Opening { MAIN, ANTI_SURFER }

    /** A gun seed sample: the main view's 10 data-point values, the guess factor, the displacement. */
    public static final int SAMPLE_WIDTH = 13;

    /** Points the main view must hold (that still count) before the learned guns aim. */
    private static final int DATA_THRESHOLD = 9;

    private final MainGun mainGun;
    private final AntiSurferGun antiSurferGun;
    private final BattleField battleField;
    /** Opponents at the battle's start. */
    private final int enemiesTotal;
    /** One opponent at the battle's start. Fixed for the battle. */
    private final boolean is1v1;

    /** Per opponent name: the main view, then the four anti-surfer views, by view name. */
    private final Map<String, Map<String, KnnView<TimestampedFiringAngle>>> enemyViews =
        new HashMap<>();
    /** Per opponent name: the main gun's virtual record. */
    private final Map<String, GunStats> mainGunStats = new HashMap<>();
    /** Per opponent name: the anti-surfer gun's virtual record. */
    private final Map<String, GunStats> antiSurferStats = new HashMap<>();
    /** Each real bullet's wave, until it breaks: the main and anti-surfer angles, in that order. */
    private final Map<Wave, double[]> virtualBullets = new HashMap<>();
    /** Builds the seed samples' first ten values, in the main view's space. */
    private final GunFormula sampleFormula;
    private Opening opening;
    private Consumer<double[]> sampleSink;
    /** Seeded samples so far; their time, so they keep their order. */
    private int seedsLoaded;

    /**
     * A gun for a battle.
     *
     * @param battleField the battle field
     * @param enemiesTotal the opponents at the battle's start; 1 makes this a duel gun
     */
    public GunController(BattleField battleField, int enemiesTotal) {
        this.battleField = battleField;
        this.enemiesTotal = enemiesTotal;
        this.is1v1 = (enemiesTotal <= 1);
        this.mainGun = new MainGun(battleField);
        this.antiSurferGun = new AntiSurferGun(battleField, is1v1);
        this.sampleFormula = new GunFormula(enemiesTotal);
    }

    /**
     * ADAPT-1: the gun to use from the first firing wave, until the live virtual-gun ratings
     * disagree by more than their margin of error. Null (the default) keeps 1.20's choice:
     * head-on for the first nine waves, then whichever virtual gun rates higher.
     *
     * <p>The core sets it from the opening book at the first scan, and back to null once
     * the gun seed is distrusted (RES-4).</p>
     *
     * @param opening the opening gun, or null for 1.20's rule
     */
    public void setOpening(Opening opening) {
        this.opening = opening;
    }

    /** The opening gun in force, or null when 1.20's rule picks the gun. */
    public Opening opening() {
        return opening;
    }

    /**
     * Receives one {@link #SAMPLE_WIDTH}-value sample per real bullet's wave as it breaks.
     *
     * @param sampleSink where the samples go (the profile's folder), or null for none
     */
    public void setSampleSink(Consumer<double[]> sampleSink) {
        this.sampleSink = sampleSink;
    }

    /**
     * ADAPT-3: adds a seeded sample (as the sample sink produced it) to every gun view for
     * {@code botName}. The main view takes all ten values, the anti-surfer views the first nine.
     *
     * @param botName the opponent
     * @param sample {@link #SAMPLE_WIDTH} values: ten features, the guess factor, then the
     *     displacement vector's x and y
     * @param weight the weight every gun seed shares, which the seed trust may lower (RES-4)
     * @throws IllegalArgumentException if the sample is not {@link #SAMPLE_WIDTH} long
     */
    public void seed(String botName, double[] sample, SeedWeight weight) {
        if (sample.length != SAMPLE_WIDTH) throw new IllegalArgumentException("a gun sample has 13 values");
        // Filed under SEED_ROUND, before any round of this battle, with a running count
        // for its time, so seeds sort before live samples and in their stored order.
        TimestampedFiringAngle tfa = new TimestampedFiringAngle(Timestamped.SEED_ROUND, seedsLoaded++,
            sample[10], new Point2D.Double(sample[11], sample[12]), weight);
        for (KnnView<TimestampedFiringAngle> view : getOrCreateViews(botName).values()) {
            // Truncate to the view's dimensions: 10 for the main view, 9 for anti-surfer.
            view.logSeed(Arrays.copyOf(sample, view.formula.weights.length), tfa, weight);
        }
    }

    /** TIME-1, TIME-2: the k share every gun view uses, kept for views made later. */
    private double kShare = 1.0;

    /**
     * Starts a round: drops the virtual bullets still in flight (their waves will never
     * break) and the views' neighbour caches. What the views have learned is kept.
     */
    public void initRound() {
        virtualBullets.clear();
        for (Map<String, KnnView<TimestampedFiringAngle>> views : enemyViews.values()) {
            for (KnnView<TimestampedFiringAngle> view : views.values()) {
                view.clearCache();
            }
        }
    }

    /**
     * The gun views for {@code botName}, made on first use: the main view, then the four
     * anti-surfer views, each at the current k share.
     *
     * @param botName the opponent
     * @return the views by name, in that order
     */
    public Map<String, KnnView<TimestampedFiringAngle>> getOrCreateViews(String botName) {
        return enemyViews.computeIfAbsent(botName, k -> {
            Map<String, KnnView<TimestampedFiringAngle>> views = new LinkedHashMap<>();
            views.put(MainGun.viewName(), mainGun.createView(enemiesTotal).setKShare(kShare));
            for (KnnView<TimestampedFiringAngle> asView : antiSurferGun.createViews()) {
                views.put(asView.name, asView.setKShare(kShare));
            }
            return views;
        });
    }

    /**
     * TIME-1, TIME-2: the share of k every gun view uses; 1 is all of it.
     *
     * @param kShare the share, 1 at full computation and 0.5 from level 2
     */
    public void setKShare(double kShare) {
        if (kShare == this.kShare) return;
        this.kShare = kShare;
        for (Map<String, KnnView<TimestampedFiringAngle>> views : enemyViews.values()) {
            for (KnnView<TimestampedFiringAngle> view : views.values()) view.setKShare(kShare);
        }
    }

    /**
     * The bearing to turn the gun to for the shot on {@code w}, chosen as the class
     * description sets out.
     *
     * @param w the latest gun wave at the target
     * @param myNextLocation where we will be when the bullet leaves, the next tick
     * @param currentTime the present tick
     * @return an absolute bearing in radians
     */
    public double aim(Wave w, Point2D.Double myNextLocation, long currentTime) {
        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);
        KnnView<TimestampedFiringAngle> mainView = views.get(MainGun.viewName());

        if (is1v1 && opening != null) {
            // ADAPT-1: the profile's gun from the first wave, unless the live ratings disagree.
            // There is no head-on warm-up here: the seeds are the data, and each gun falls
            // back to head-on by itself while it has none.
            Opening live = liveVerdict(w.botName);
            Opening use = live != null ? live : opening;
            return use == Opening.ANTI_SURFER
                ? antiSurferGun.aim(w, views, myNextLocation, currentTime)
                : mainGun.aim(w, mainView, myNextLocation, currentTime);
        }

        // Warm-up: too few points to learn from, so fire head-on from our next position.
        // effectiveSize, not size: a seed that has faded to nothing is no data (RES-4).
        if (mainView.effectiveSize() < DATA_THRESHOLD) {
            return DiaUtils.absoluteBearing(myNextLocation, w.targetLocation);
        }

        if (is1v1) {
            GunStats mStats = mainGunStats.computeIfAbsent(w.botName, k -> new GunStats());
            GunStats aStats = antiSurferStats.computeIfAbsent(w.botName, k -> new GunStats());
            // 1.20's rule: strictly better, with no margin of error; ties go to the main gun.
            if (aStats.gunRating() > mStats.gunRating()) {
                return antiSurferGun.aim(w, views, myNextLocation, currentTime);
            }
        }
        return mainGun.aim(w, mainView, myNextLocation, currentTime);
    }

    /**
     * DIAL-1: the gun the live virtual ratings pick, or null while the gap between them is
     * within the margin of error of the better one (Agresti-Coull, 95%).
     *
     * <p>The margin used is the larger of the two guns' margins, so either gun's
     * uncertainty holds the opening in place. Null too before the first virtual bullet has
     * been scored.</p>
     */
    Opening liveVerdict(String botName) {
        GunStats m = mainGunStats.get(botName);
        GunStats a = antiSurferStats.get(botName);
        if (m == null || a == null || m.shotsFired == 0) return null;
        double mr = m.gunRating();
        double ar = a.gunRating();
        double margin = Math.max(margin(m.shotsHit, m.shotsFired), margin(a.shotsHit, a.shotsFired));
        if (Math.abs(ar - mr) <= margin) return null;
        return ar > mr ? Opening.ANTI_SURFER : Opening.MAIN;
    }

    /**
     * The 95% margin of error of a rate of {@code hits} in {@code n} (Agresti-Coull).
     *
     * <p>Agresti-Coull adds z^2 / 2 (about 2) successes and z^2 (about 4) trials, with
     * z = 1.96, before taking the normal approximation's half-width
     * {@code z * sqrt(p (1 - p) / n)}. The adjustment keeps the margin sensible at small
     * {@code n} and at rates near 0, where the plain formula gives a margin of zero.</p>
     */
    static double margin(double hits, double n) {
        double p = (hits + 2) / (n + 4);
        return 1.96 * Math.sqrt(p * (1 - p) / (n + 4));
    }

    /**
     * Fires one virtual bullet for each gun along with a real bullet: records the angle each
     * gun would have fired on {@code w}, to be scored when the wave breaks. Duels only. The
     * core skips this call at its lowest computation level (TIME-1, TIME-2).
     *
     * @param w the wave the real bullet rides
     * @param myNextLocation where we will be when the bullet leaves
     * @param currentTime the present tick
     */
    public void fireVirtualBullets(Wave w, Point2D.Double myNextLocation,
                                    long currentTime) {
        if (!is1v1) return;

        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);
        // Each gun's own choice, whichever gun actually aimed the real bullet.
        double mainAngle = mainGun.aim(w, views.get(MainGun.viewName()),
            myNextLocation, currentTime);
        double asAngle = antiSurferGun.aim(w, views, myNextLocation, currentTime);
        virtualBullets.put(w, new double[]{mainAngle, asAngle});

        // Records exist from the first virtual bullet, so liveVerdict can read them.
        mainGunStats.computeIfAbsent(w.botName, k -> new GunStats());
        antiSurferStats.computeIfAbsent(w.botName, k -> new GunStats());
    }

    /**
     * A gun wave has passed the target: scores its virtual bullets (a real bullet's wave in
     * a duel) and logs where the target went into every view that learns from it.
     *
     * @param w the wave that broke
     * @param waveBreakStates the target's states on the ticks the wave was crossing it,
     *     oldest first; nothing is done when empty
     */
    public void onWaveBreak(Wave w, List<RobotState> waveBreakStates) {
        if (waveBreakStates.isEmpty()) return;

        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);

        if (is1v1 && w.firingWave) {
            scoreVirtualGuns(w, waveBreakStates);
        }

        logWaveData(w, waveBreakStates, views);
    }

    /**
     * Scores both virtual bullets on a broken real-bullet wave against the precise range
     * of angles that would have hit the target.
     *
     * <p>{@link Wave#preciseIntersection} gives the centre and half-width of the bearings,
     * from the wave's source, at which a bullet would have touched the target's 36 px box
     * while the wave crossed it. Each gun earns {@code hitWeight * 1.6^(-u)}, {@code u} its
     * error from the centre in half-widths: full credit dead centre, 1/1.6 at the robot's
     * edge, and a little for a near miss.</p>
     *
     * <p>{@code hitWeight} normalises for how easy the shot was: it is the escape-angle
     * range over the target's angular width, divided by 9, so a target that fills a ninth of
     * the range scores 1 for a centred hit, a smaller (further) one more and a larger
     * (nearer) one less. So a rating can exceed 1.</p>
     */
    private void scoreVirtualGuns(Wave w, List<RobotState> waveBreakStates) {
        double[] vbAngles = virtualBullets.remove(w);
        if (vbAngles == null) return;

        Wave.Intersection intersection = w.preciseIntersection(waveBreakStates);
        if (intersection == null) return;

        double hitAngle = intersection.angle;
        double tolerance = intersection.bandwidth;
        if (tolerance <= 0) return;

        double angularBotWidth = tolerance * 2.0;
        // 0.1 / width * range / 0.9 = (range / width) / 9.
        double hitWeight = 0.1 / angularBotWidth * (w.escapeAngleRange() / 0.9);

        GunStats mStats = mainGunStats.get(w.botName);
        GunStats aStats = antiSurferStats.get(w.botName);

        if (mStats != null) {
            double ux = Math.abs(Angles.normalRelativeAngle(
                vbAngles[0] - hitAngle)) / tolerance;
            mStats.shotsHit += hitWeight * Math.pow(1.6, -ux);
            mStats.shotsFired++;
        }
        if (aStats != null) {
            double ux = Math.abs(Angles.normalRelativeAngle(
                vbAngles[1] - hitAngle)) / tolerance;
            aStats.shotsHit += hitWeight * Math.pow(1.6, -ux);
            aStats.shotsFired++;
        }
    }

    /**
     * Logs the wave's outcome into the views, and a seed sample to the sink.
     *
     * <p>The outcome is read at the last break state, where the target was on the last tick
     * the wave was crossing it: its displacement vector (for the main gun) and its precise guess
     * factor (for the anti-surfer gun), stamped with the wave's round and that tick. Only
     * real-bullet waves in a duel that are not marked {@code altWave} become samples (MEM-2 folds them into the
     * profile at the round's end).</p>
     */
    private void logWaveData(Wave w, List<RobotState> waveBreakStates,
                             Map<String, KnnView<TimestampedFiringAngle>> views) {
        RobotState breakState = waveBreakStates.get(waveBreakStates.size() - 1);
        Point2D.Double dv = w.displacementVector(breakState);
        double gf = w.guessFactorPrecise(breakState.location);

        TimestampedFiringAngle tfa = new TimestampedFiringAngle(
            w.fireRound, breakState.time, gf, dv);

        for (KnnView<TimestampedFiringAngle> view : views.values()) {
            if (shouldLog(view, w)) {
                view.logWave(w, tfa);
            }
        }
        if (sampleSink != null && is1v1 && w.firingWave && !w.altWave) {
            // The layout seed() reads back: ten features, gf, dv.x, dv.y.
            double[] sample = Arrays.copyOf(sampleFormula.dataPointFromWave(w), SAMPLE_WIDTH);
            sample[10] = gf;
            sample[11] = dv.x;
            sample[12] = dv.y;
            sampleSink.accept(sample);
        }
    }

    /**
     * Whether {@code view} learns from {@code w}: never from a wave marked {@code altWave},
     * never unless the view logs visits, and from a virtual wave or in a melee battle only
     * when the view is built for them.
     */
    private boolean shouldLog(KnnView<?> view, Wave w) {
        if (w.altWave) return false;
        if (!view.logVisits) return false;
        if (!w.firingWave && !view.logVirtual) return false;
        if (enemiesTotal > 1 && !view.logMelee) return false;
        return true;
    }

    /**
     * The bullet power for the next gun wave, before the core's power policy.
     *
     * @param distance the distance to the target, px
     * @param myEnergy our energy
     * @param enemyEnergy the target's energy
     * @param enemiesAlive the opponents alive
     * @return the power; at least 0.1 unless our energy is lower, and never above it
     */
    public double calculateBulletPower(double distance, double myEnergy,
                                        double enemyEnergy, int enemiesAlive) {
        if (is1v1) {
            return calculate1v1BulletPower(distance, myEnergy, enemyEnergy);
        }
        return calculateMeleeBulletPower(distance, myEnergy, enemyEnergy, enemiesAlive);
    }

    /**
     * 1.20's duel power: 1.95, or 2.95 inside 150 px; beyond 325 px, cut while our energy
     * is below a threshold of 63 (4 lower per point of energy we lead by, never below 35),
     * to 1.95 times the cube of our energy's share of that threshold. Then capped at a quarter of the enemy's
     * energy, floored at 0.1 and capped at our own energy.
     */
    private double calculate1v1BulletPower(double distance, double myEnergy,
                                            double enemyEnergy) {
        double bulletPower = 1.95;
        if (distance < 150.0) {
            bulletPower = 2.95;
        }
        if (distance > 325.0) {
            // 63 at an even or worse energy balance, 4 lower per point we lead, never below 35.
            double powerDownPoint = DiaUtils.limit(35.0,
                63.0 + (enemyEnergy - myEnergy) * 4.0, 63.0);
            if (myEnergy < powerDownPoint) {
                bulletPower = Math.min(bulletPower,
                    Math.pow(myEnergy / powerDownPoint, 3) * 1.95);
            }
        }
        // A bullet does at least 4 x power damage, so a quarter of their energy kills.
        bulletPower = Math.min(bulletPower, enemyEnergy / 4.0);
        // Robocode's minimum bullet power.
        bulletPower = Math.max(bulletPower, 0.1);
        bulletPower = Math.min(bulletPower, myEnergy);
        return bulletPower;
    }

    /**
     * 1.20's melee power, by opponents alive, distance and energy: 2.999 in a crowd, 1.999
     * with three or fewer left, 1.499 with five or fewer beyond 500 px, and 0.999 beyond
     * 700 px or, with five or fewer left, beyond 300 px while we have less energy than the
     * target. Below 20 energy and behind the target, capped at {@code 2 - (20 - energy) / 11}.
     * Then floored at 0.1 and capped at our energy.
     */
    private double calculateMeleeBulletPower(double distance, double myEnergy,
                                              double enemyEnergy, int enemiesAlive) {
        double bulletPower = 2.999;
        if (enemiesAlive <= 3) bulletPower = 1.999;
        if (enemiesAlive <= 5 && distance > 500.0) bulletPower = 1.499;
        if ((myEnergy < enemyEnergy && enemiesAlive <= 5 && distance > 300.0)
                || distance > 700.0) {
            bulletPower = 0.999;
        }
        if (myEnergy < 20.0 && myEnergy < enemyEnergy) {
            bulletPower = Math.min(bulletPower, 2.0 - (20.0 - myEnergy) / 11.0);
        }
        bulletPower = Math.max(bulletPower, 0.1);
        bulletPower = Math.min(bulletPower, myEnergy);
        return bulletPower;
    }

    /**
     * The virtual guns' battle totals against {@code botName}: main-gun waves, main weighted
     * hits, anti-surfer waves, anti-surfer weighted hits. Zeros before any virtual bullet.
     *
     * <p>The core folds them into the profile (MEM-2), where they set the movement tier the
     * next opening reads, and checks the gun seed against the main gun's live rating (RES-4).</p>
     *
     * @param botName the opponent
     * @return four totals, as above
     */
    public double[] virtualGunScores(String botName) {
        GunStats m = mainGunStats.get(botName);
        GunStats a = antiSurferStats.get(botName);
        return new double[] {
            m == null ? 0 : m.shotsFired, m == null ? 0 : m.shotsHit,
            a == null ? 0 : a.shotsFired, a == null ? 0 : a.shotsHit};
    }

    /**
     * The label of the gun with the higher virtual rating against {@code botName}, for the
     * logs; the main gun on a tie and always in melee.
     *
     * @param botName the opponent
     * @return a gun's label
     */
    public String bestGunLabel(String botName) {
        if (!is1v1) return mainGun.getLabel();
        GunStats mStats = mainGunStats.get(botName);
        GunStats aStats = antiSurferStats.get(botName);
        double mainRating = mStats != null ? mStats.gunRating() : 0;
        double asRating = aStats != null ? aStats.gunRating() : 0;
        return asRating > mainRating ? antiSurferGun.getLabel() : mainGun.getLabel();
    }

    /** One virtual gun's record against one opponent over the battle. */
    private static class GunStats {
        /** Virtual bullets scored. */
        int shotsFired = 0;
        /** The sum of their weighted hit scores (see scoreVirtualGuns). */
        double shotsHit = 0.0;

        /** Weighted hits per virtual bullet; 0 before the first. */
        double gunRating() {
            return shotsFired == 0 ? 0.0 : shotsHit / (double) shotsFired;
        }
    }
}
