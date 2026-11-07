package hadur117.core.policy;

import hadur117.core.physics.Rules;

/**
 * POW-17: bullet power chosen by the rest of the round's energy race, for the opponents the mode
 * table names ({@code race-power:}).
 *
 * <p>The other power rules each look at one thing: a tier, a range, a rate, a lead. This one
 * values a power by what it does to the whole remaining exchange. The round from here is a race
 * between two energies: each side fires at the rate its gun heat allows, each shot costs its
 * power, a hit takes the bullet's damage from the target and gives the shooter three times the
 * power back. The value of a pair of energies is the expected score still to come, ours less
 * theirs: the bullet damage each side still deals, and {@link #ROUND_SWING} for the side left
 * alive (survival, the last-survivor bonus and roughly the kill bonus). We fire whichever power
 * gives the highest value; the opponent fires the power it has been firing, capped by its
 * energy.</p>
 *
 * <p>The values are solved on a grid of energy pairs, finer at low energy where single shots
 * decide rounds, by value iteration with bilinear interpolation between grid points. A shot
 * moves the energies by less than a grid cell, so most of a state's successors interpolate back
 * onto the state itself; that share is solved in closed form per power, which is what lets a few
 * sweeps converge. Hit chances come from this battle's own counts with a prior, and are moved to
 * other powers by the ratio of maximum escape angles: a slower bullet gives the target a wider
 * arc to be in. Range, walls, ramming and bullet shadows are not modelled.</p>
 *
 * <p>The solve is spread over the calls, {@link #ROWS_PER_CALL} grid rows each. Until both sides have
 * {@link #MIN_SHOTS} resolved shots and {@link #WARMUP_SWEEPS} sweeps are done, {@link #choose} returns NaN and the
 * other rules stand. Bounded: a fixed grid, six counters, no allocation per tick (RES-2).</p>
 */
public final class EnergyRace {

    /** Score for the side left alive: survival 50, last survivor 10, about 20 kill bonus. */
    static final double ROUND_SWING = 80.0;
    /** The powers we choose among. */
    static final double[] POWERS = {0.1, 0.5, 1.0, 1.5, 1.95, 2.5, 3.0};
    /** Energy grid, finer at the low end. */
    static final double[] GRID = {0, 0.3, 1, 2, 3, 4.5, 6, 8, 10, 12.5, 15, 17.5, 20, 25, 30, 35,
        40, 45, 50, 55, 60, 70, 80, 90, 100, 110, 120};
    /** Resolved shots each side needs before the race decides. */
    static final int MIN_SHOTS = 8;
    /** Prior hit rates and their weight in shots. */
    static final double OUR_PRIOR = 0.12;
    static final double THEIR_PRIOR = 0.10;
    static final double PRIOR_SHOTS = 15.0;
    /**
     * Grid rows swept a call: the solve is spread over ticks, a full sweep every nine, so no tick
     * pays for a whole solve (a whole solve a call cost the smoke battle 63 skipped turns against 9).
     * The counts move slowly, so values that trail them by a few sweeps stay close.
     */
    static final int ROWS_PER_CALL = 3;
    /** Full sweeps from the starting guess before the race decides. */
    static final int WARMUP_SWEEPS = 4;

    private static final int N = GRID.length;

    private double ourShots, ourHits, ourPowerSum;
    private double theirShots, theirHits, theirPowerSum;
    private final double[][] value = new double[N][N];
    private boolean solved;
    private boolean dirty = true;

    /** One of our bullets resolved. */
    public void ours(double power, boolean hit) {
        if (!(power > 0)) return;
        ourShots++;
        ourPowerSum += power;
        if (hit) ourHits++;
        dirty = true;
    }

    /** One of their bullets resolved. */
    public void theirs(double power, boolean hit) {
        if (!(power > 0)) return;
        theirShots++;
        theirPowerSum += power;
        if (hit) theirHits++;
        dirty = true;
    }

    /** A new duel opponent: forget everything. */
    public void clear() {
        ourShots = ourHits = ourPowerSum = 0;
        theirShots = theirHits = theirPowerSum = 0;
        solved = false;
        dirty = true;
    }

    /** Whether both sides have enough resolved shots for the race to decide. */
    public boolean ready() {
        return ourShots >= MIN_SHOTS && theirShots >= MIN_SHOTS;
    }

    /**
     * The power the race picks at these energies.
     *
     * @param ourEnergy our energy now
     * @param theirEnergy theirs
     * @return a power from {@link #POWERS} we can pay for, or NaN when not ready or none is payable
     */
    public double choose(double ourEnergy, double theirEnergy) {
        if (!ready() || !(ourEnergy > POWERS[0]) || !(theirEnergy > 0)) return Double.NaN;
        Model m = refresh();
        if (sweepsDone < WARMUP_SWEEPS) return Double.NaN;
        double best = Double.NEGATIVE_INFINITY;
        double pick = Double.NaN;
        for (double p : POWERS) {
            if (!(ourEnergy > p)) break;
            double q = qValue(m, ourEnergy, theirEnergy, p);
            if (q > best + 1e-9) {
                best = q;
                pick = p;
            }
        }
        return pick;
    }

    /** The value of a pair of energies, for tests: expected score to come, ours less theirs. */
    double valueAt(double ourEnergy, double theirEnergy) {
        converge();
        return interp(ourEnergy, theirEnergy);
    }

    /** The model of the counts now, the grid re-solved when they changed since the last solve. */
    private Model refresh() {
        if (dirty || current == null) {
            current = model();
            dirty = false;
        }
        if (!solved) {
            guess();
            solved = true;
            sweepsDone = 0;
            cursor = 0;
        }
        for (int r = 0; r < ROWS_PER_CALL; r++) {
            for (int j = 0; j < N; j++) value[cursor][j] = stateValue(current, cursor, j);
            if (++cursor == N) {
                cursor = 0;
                sweepsDone++;
            }
        }
        return current;
    }

    /** The next grid row to sweep, and the full sweeps done since the starting guess. */
    private int cursor;
    private int sweepsDone;

    /** The starting guess: the energy lead, bounded by the round's stakes. */
    private void guess() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                value[i][j] = Math.max(-ROUND_SWING, Math.min(ROUND_SWING, GRID[i] - GRID[j]));
            }
        }
    }

    private Model current;

    // ---- the model ----------------------------------------------------------------------

    /** What the race is built from: both hit rates at the powers fired, and their power. */
    private static final class Model {
        final double ourRate, ourMeanPower, theirRate, theirPower;

        Model(double ourRate, double ourMeanPower, double theirRate, double theirPower) {
            this.ourRate = ourRate;
            this.ourMeanPower = ourMeanPower;
            this.theirRate = theirRate;
            this.theirPower = theirPower;
        }

        /** Our hit chance at a power. */
        double ourHit(double p) {
            return clampRate(ourRate * escape(ourMeanPower) / escape(p));
        }
    }

    private Model model() {
        double ourMean = ourShots > 0 ? ourPowerSum / ourShots : 1.95;
        double theirMean = theirShots > 0 ? theirPowerSum / theirShots : 1.95;
        double ourRate = (ourHits + OUR_PRIOR * PRIOR_SHOTS) / (ourShots + PRIOR_SHOTS);
        double theirRate = (theirHits + THEIR_PRIOR * PRIOR_SHOTS) / (theirShots + PRIOR_SHOTS);
        return new Model(ourRate, ourMean, clampRate(theirRate), theirMean);
    }

    /** Maximum escape angle of a bullet of this power. */
    static double escape(double power) {
        return Math.asin(Rules.MAX_VELOCITY / Rules.getBulletSpeed(power));
    }

    private static double clampRate(double r) {
        return Math.max(0.005, Math.min(0.95, r));
    }

    /** Ticks between shots at a power. */
    private static double coolTicks(double power) {
        return Rules.getGunHeat(power) / 0.1;
    }

    /** The power they fire at an energy: their usual, capped by what they can pay. */
    private static double theirPowerAt(Model m, double theirEnergy) {
        double q = Math.min(m.theirPower, theirEnergy - 0.01);
        return q >= Rules.MIN_BULLET_POWER ? q : Double.NaN;
    }

    // ---- the solve ----------------------------------------------------------------------

    /** For tests: sweep until the values settle. */
    void converge() {
        for (int k = 0; k < 40 * N / ROWS_PER_CALL; k++) refresh();
    }

    /** One grid state's value, the self-referencing share of each power solved in closed form. */
    private double stateValue(Model m, int i, int j) {
        double eu = GRID[i];
        double et = GRID[j];
        if (et <= 0) return eu > 0 ? ROUND_SWING : 0.0;
        if (eu <= 0) return -ROUND_SWING;
        double q = theirPowerAt(m, et);
        boolean ourFire = eu > POWERS[0];
        if (!ourFire && Double.isNaN(q)) return 0.0;
        double best = Double.NEGATIVE_INFINITY;
        if (!ourFire) {
            return actionValue(m, i, j, Double.NaN, q);
        }
        for (double p : POWERS) {
            if (!(eu > p)) break;
            best = Math.max(best, actionValue(m, i, j, p, q));
        }
        return best;
    }

    /**
     * The value at grid state (i, j) when we keep firing p (NaN: we cannot fire) and they fire q
     * (NaN: they cannot), with the share of successors that lands back on (i, j) solved exactly.
     */
    private double actionValue(Model m, int i, int j, double p, double q) {
        double eu = GRID[i];
        double et = GRID[j];
        double ru = Double.isNaN(p) ? 0 : 1.0 / coolTicks(p);
        double rt = Double.isNaN(q) ? 0 : 1.0 / coolTicks(q);
        double total = ru + rt;
        if (total <= 0) return 0.0;
        double self = 0;
        double rest = 0;
        if (ru > 0) {
            double w = ru / total;
            double h = m.ourHit(p);
            double dmg = Math.min(Rules.getBulletDamage(p), et);
            // A hit: damage dealt, power back three times over.
            part(eu + 2 * p, et - Rules.getBulletDamage(p), i, j);
            rest += w * h * (dmg + partRest);
            self += w * h * partSelf;
            part(eu - p, et, i, j);
            rest += w * (1 - h) * partRest;
            self += w * (1 - h) * partSelf;
        }
        if (rt > 0) {
            double w = rt / total;
            double g = m.theirRate;
            double dmg = Math.min(Rules.getBulletDamage(q), eu);
            part(eu - Rules.getBulletDamage(q), et + 2 * q, i, j);
            rest += w * g * (-dmg + partRest);
            self += w * g * partSelf;
            part(eu, et - q, i, j);
            rest += w * (1 - g) * partRest;
            self += w * (1 - g) * partSelf;
        }
        if (self >= 1 - 1e-9) return 0.0;
        return rest / (1 - self);
    }

    /** {@link #part}'s result: the weight on grid state (i, j), and the value from every other corner. */
    private double partSelf, partRest;

    /**
     * A successor's interpolated value split into the weight it puts on grid state (i, j) and the
     * value it takes from the other corners, left in {@link #partSelf} and {@link #partRest}.
     * Terminal successors carry their terminal value.
     */
    private void part(double eu, double et, int i, int j) {
        partSelf = 0;
        partRest = 0;
        if (et <= 0 && eu > 0) {
            partRest = ROUND_SWING;
            return;
        }
        if (eu <= 0) {
            partRest = et > 0 ? -ROUND_SWING : 0.0;
            return;
        }
        int a = cell(eu);
        int b = cell(et);
        double fa = frac(eu, a);
        double fb = frac(et, b);
        for (int da = 0; da < 2; da++) {
            for (int db = 0; db < 2; db++) {
                double w = (da == 0 ? 1 - fa : fa) * (db == 0 ? 1 - fb : fb);
                if (w == 0) continue;
                int ii = Math.min(N - 1, a + da);
                int jj = Math.min(N - 1, b + db);
                if (ii == i && jj == j) partSelf += w;
                else partRest += w * value[ii][jj];
            }
        }
    }

    /** The one-step value of firing p from exact energies, for the pick. */
    private double qValue(Model m, double eu, double et, double p) {
        double q = theirPowerAt(m, et);
        double ru = 1.0 / coolTicks(p);
        double rt = Double.isNaN(q) ? 0 : 1.0 / coolTicks(q);
        double total = ru + rt;
        double h = m.ourHit(p);
        double v = ru / total * (h * (Math.min(Rules.getBulletDamage(p), et)
                + interp(eu + 2 * p, et - Rules.getBulletDamage(p)))
            + (1 - h) * interp(eu - p, et));
        if (rt > 0) {
            double g = m.theirRate;
            v += rt / total * (g * (-Math.min(Rules.getBulletDamage(q), eu)
                    + interp(eu - Rules.getBulletDamage(q), et + 2 * q))
                + (1 - g) * interp(eu, et - q));
        }
        return v;
    }

    /** The interpolated value at any pair of energies, terminal outside the grid. */
    private double interp(double eu, double et) {
        if (et <= 0) return eu > 0 ? ROUND_SWING : 0.0;
        if (eu <= 0) return -ROUND_SWING;
        int a = cell(eu);
        int b = cell(et);
        double fa = frac(eu, a);
        double fb = frac(et, b);
        int a1 = Math.min(N - 1, a + 1);
        int b1 = Math.min(N - 1, b + 1);
        return (1 - fa) * ((1 - fb) * value[a][b] + fb * value[a][b1])
            + fa * ((1 - fb) * value[a1][b] + fb * value[a1][b1]);
    }

    /** The grid cell holding an energy: the index of the grid point at or below it. */
    private static int cell(double e) {
        if (e >= GRID[N - 1]) return N - 1;
        int k = CELL[(int) (e * CELL_RES)];
        while (k + 1 < N && GRID[k + 1] <= e) k++;
        return k;
    }

    /** {@link #cell} by lookup: the grid point at or below each tenth of an energy, then a step or two. */
    private static final int CELL_RES = 10;
    private static final int[] CELL = new int[(int) (120 * CELL_RES) + 1];

    static {
        int k = 0;
        for (int x = 0; x < CELL.length; x++) {
            double e = x / (double) CELL_RES;
            while (k + 1 < N && GRID[k + 1] <= e) k++;
            CELL[x] = k;
        }
    }

    private static double frac(double e, int k) {
        if (k >= N - 1) return 0;
        return (e - GRID[k]) / (GRID[k + 1] - GRID[k]);
    }
}
