package hadur2.core.move;

import hadur2.core.model.Wave;

/**
 * MOVE-27: an ensemble of enemy-gun models for the stop-point surf, after BeepBoop's
 * (docs/bench/surf-b-rivals-read.md). Hadur's danger views mostly learn from the bullets that hit
 * us; a learning gun learns from where we went on every wave. So beside the views this keeps a
 * few mimics of common learning guns: classic visit-count buffers of guess factors, segmented from
 * the shooter's side of the wave (flight time, lateral speed, acceleration, wall room, time since
 * our last speed change) and each with its own rolling depth, from a flattener with no segments to
 * a heavily segmented slow one.
 *
 * <p>Each model, the views included, is scored per opponent by how well it predicted the real
 * bullets: at every bullet whose angle we learn (a hit, or one our bullet met), its probability in
 * a window around that guess factor, relative to a uniform guess, is folded into a rolling mean.
 * The blend weights the models by that score cubed, so a model counts only once it has beaten the
 * others at real bullets. The views start well ahead, so the blend begins as the views.</p>
 *
 * <p>Pure: it holds only its buffers and scores. Duel only, off unless the duel turns it on.</p>
 */
public final class GunMimics {

    /** Guess-factor bins of each mimic's buffer over [-1, 1]. */
    static final int GF_BINS = 47;
    /** Each new score sample's share of a model's rolling score. */
    static final double SCORE_RATE = 0.05;
    /** The power of the score in a model's blend weight. */
    static final double POWER = 3.0;
    /** The views' starting score: 2 times a uniform guess, 64 times a mimic's starting weight. */
    static final double VIEWS_START = 2.0;
    /** A mimic's starting score: half a uniform guess. */
    static final double MIMIC_START = 0.5;
    /** The half-width, in guess factor, of the window a bullet is scored in. */
    static final double SCORE_WINDOW = 0.05;
    /** The weight of a mimic's unsegmented buffer in its profile, so a fresh segment is not empty. */
    static final double FLAT_SHARE = 0.1;

    /** Features read from the shooter's side of a wave. */
    enum Feature {
        FLIGHT(15, 30, 45, 60, 75),
        LATERAL(1, 3, 5, 7),
        ADVANCING(-4, -1, 1, 4),
        ACCEL(-0.5, 0.5),
        WALL(0.3, 0.65, 0.99),
        REVERSE_WALL(0.3, 0.65),
        SINCE_CHANGE(0.1, 0.3, 0.6);

        final double[] cuts;

        Feature(double... cuts) {
            this.cuts = cuts;
        }

        double value(Wave w) {
            double speed = w.targetVelocitySign * w.targetVelocity;
            switch (this) {
                case FLIGHT: return w.targetDistance / w.bulletSpeed();
                case LATERAL: return Math.abs(speed * Math.sin(w.targetRelativeHeading));
                case ADVANCING: return -speed * Math.cos(w.targetRelativeHeading);
                case ACCEL: return w.targetAccel;
                case WALL: return w.targetWallDistance;
                case REVERSE_WALL: return w.targetRevWallDistance;
                case SINCE_CHANGE:
                    return w.targetVchangeTime / Math.max(1.0, w.targetDistance / w.bulletSpeed());
                default: throw new AssertionError(this);
            }
        }

        int segment(Wave w) {
            double v = value(w);
            int s = 0;
            while (s < cuts.length && v >= cuts[s]) s++;
            return s;
        }
    }

    /** One mimic: a segmented rolling-average buffer and an unsegmented one. */
    static final class Mimic {
        final Feature[] features;
        final double depth;
        final double[][] buffers;
        final int[] counts;
        final double[] flat = new double[GF_BINS];
        int flatCount;

        Mimic(double depth, Feature... features) {
            this.features = features;
            this.depth = depth;
            int segments = 1;
            for (Feature f : features) segments *= f.cuts.length + 1;
            buffers = new double[segments][GF_BINS];
            counts = new int[segments];
        }

        int segment(Wave w) {
            int s = 0;
            for (Feature f : features) s = s * (f.cuts.length + 1) + f.segment(w);
            return s;
        }

        void learn(Wave w, double gf) {
            int s = segment(w);
            counts[s] = roll(buffers[s], counts[s], gf, depth);
            flatCount = roll(flat, flatCount, gf, depth);
        }

        /** The model's probability over {@code bins} equal bins of [-1, 1], or null with no data. */
        double[] profile(Wave w, int bins) {
            if (flatCount == 0) return null;
            double[] seg = buffers[segment(w)];
            double[] out = new double[bins];
            double total = 0;
            for (int j = 0; j < bins; j++) {
                int b = gfBin(-1 + (j + 0.5) * 2.0 / bins, GF_BINS);
                out[j] = seg[b] + FLAT_SHARE * flat[b];
                total += out[j];
            }
            if (!(total > 0)) return null;
            for (int j = 0; j < bins; j++) out[j] /= total;
            return out;
        }
    }

    /** The mimics, after the views (model 0). */
    final Mimic[] mimics = {
        new Mimic(20),
        new Mimic(5, Feature.LATERAL, Feature.FLIGHT),
        new Mimic(10, Feature.LATERAL, Feature.ACCEL, Feature.WALL),
        new Mimic(30, Feature.LATERAL, Feature.FLIGHT, Feature.ACCEL, Feature.WALL, Feature.SINCE_CHANGE),
        new Mimic(15, Feature.ADVANCING, Feature.LATERAL, Feature.FLIGHT, Feature.REVERSE_WALL),
        new Mimic(3, Feature.LATERAL, Feature.ACCEL, Feature.SINCE_CHANGE),
    };

    /** Each model's rolling score: index 0 the views, then the mimics in order. */
    final double[] scores = new double[mimics.length + 1];

    public GunMimics() {
        scores[0] = VIEWS_START;
        for (int m = 1; m < scores.length; m++) scores[m] = MIMIC_START;
    }

    /** Every mimic learns where we were when wave {@code w} passed: guess factor {@code gf}. */
    public void learnVisit(Wave w, double gf) {
        for (Mimic m : mimics) m.learn(w, gf);
    }

    /**
     * A real bullet on wave {@code w} was fired at {@code gf}: scores every model on the profile
     * it gave the wave, before anything learns the bullet. {@code viewsProfile} is the views'.
     */
    public void scoreBullet(Wave w, double gf, double[] viewsProfile) {
        int bins = viewsProfile.length;
        update(0, density(viewsProfile, gf));
        for (int m = 0; m < mimics.length; m++) {
            double[] p = mimics[m].profile(w, bins);
            update(m + 1, p == null ? 1.0 : density(p, gf));
        }
    }

    private void update(int model, double density) {
        scores[model] += SCORE_RATE * (density - scores[model]);
    }

    /**
     * The blended profile for wave {@code w}: the views' and each mimic's, weighted by their
     * score cubed, normalised. A mimic with no data yet is left out.
     */
    public double[] blend(Wave w, double[] viewsProfile) {
        int bins = viewsProfile.length;
        double[] out = new double[bins];
        double weight = Math.pow(scores[0], POWER);
        for (int j = 0; j < bins; j++) out[j] = weight * viewsProfile[j];
        double total = weight;
        for (int m = 0; m < mimics.length; m++) {
            double[] p = mimics[m].profile(w, bins);
            if (p == null) continue;
            double mw = Math.pow(scores[m + 1], POWER);
            for (int j = 0; j < bins; j++) out[j] += mw * p[j];
            total += mw;
        }
        for (int j = 0; j < bins; j++) out[j] /= total;
        return out;
    }

    /** The scores, views first; a copy. */
    public double[] scores() {
        return scores.clone();
    }

    /** {@code profile}'s mass within {@link #SCORE_WINDOW} of {@code gf}, over a uniform guess's. */
    static double density(double[] profile, double gf) {
        int bins = profile.length;
        int lo = gfBin(gf - SCORE_WINDOW, bins);
        int hi = gfBin(gf + SCORE_WINDOW, bins);
        double mass = 0;
        for (int j = lo; j <= hi; j++) mass += profile[j];
        return mass * bins / (hi - lo + 1);
    }

    /** The bin of {@code gf} among {@code bins} equal bins over [-1, 1], clamped. */
    static int gfBin(double gf, int bins) {
        int b = (int) Math.floor((gf + 1) / 2 * bins);
        return Math.max(0, Math.min(bins - 1, b));
    }

    /**
     * Folds a visit at {@code gf} into a rolling-average buffer of {@code count} samples so far, at
     * most {@code depth} deep, with the classic 1 / (d^2 + 1) spread; returns the new count.
     */
    static int roll(double[] buffer, int count, double gf, double depth) {
        int bin = gfBin(gf, buffer.length);
        double n = Math.min(count, depth);
        for (int i = 0; i < buffer.length; i++) {
            double d = i - bin;
            buffer[i] = (buffer[i] * n + 1.0 / (d * d + 1)) / (n + 1);
        }
        return count + 1;
    }
}
