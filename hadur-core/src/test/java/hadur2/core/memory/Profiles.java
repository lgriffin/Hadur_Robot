package hadur2.core.memory;

/** Test profiles with every section filled. */
public final class Profiles {

    private Profiles() {}

    /** A profile for {@code name} after {@code battles} battles, with seeds when asked. */
    public static OpponentProfile sample(String name, long battleNumber, int gunSeed, int surfSeed) {
        OpponentProfile p = new OpponentProfile(LineageKey.of(name));
        p.startBattle(name, battleNumber);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        for (int i = 0; i < 40; i++) {
            f.enemyShot(100 + i * 15, 0.5 + (i % 5) * 0.5, i % 3 != 0);
            f.ourShot(120 + i * 12);
            f.enemyScanned(i % 7 == 0 ? -8 : 8, 5.5, 30 + i, 300);
        }
        for (int i = 0; i < 6; i++) {
            f.hitByEnemy(200 + i * 40, true, 10);
            f.ourHit(300, 16);
        }
        f.virtualGuns(40, 5.5, 40, 7.25);
        f.normalised(40, 5.2);
        f.fold(true);
        for (int i = 0; i < gunSeed; i++) p.addGunSample(sampleValues(i));
        for (int i = 0; i < surfSeed; i++) p.addSurfSample(sampleValues(-i));
        return p;
    }

    /**
     * A profile fought twice and losing both times (MEM-8: worth keeping seeds for — met
     * at least twice, recorded score share under 60%), with seeds when asked. Otherwise the
     * same shape as {@link #sample}.
     */
    public static OpponentProfile seedWorthy(String name, long battleNumber, int gunSeed, int surfSeed) {
        OpponentProfile p = new OpponentProfile(LineageKey.of(name));
        p.startBattle(name, Math.max(0, battleNumber - 1));
        new ProfileFolder(p, 800, 600).fold(false);
        p.startBattle(name, battleNumber);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        for (int i = 0; i < 40; i++) {
            f.enemyShot(100 + i * 15, 0.5 + (i % 5) * 0.5, i % 3 != 0);
            f.ourShot(120 + i * 12);
            f.enemyScanned(i % 7 == 0 ? -8 : 8, 5.5, 30 + i, 300);
        }
        for (int i = 0; i < 6; i++) {
            f.hitByEnemy(200 + i * 40, true, 10);
            f.ourHit(300, 16);
        }
        f.virtualGuns(40, 5.5, 40, 7.25);
        f.normalised(40, 5.2);
        f.fold(false);
        for (int i = 0; i < gunSeed; i++) p.addGunSample(sampleValues(i));
        for (int i = 0; i < surfSeed; i++) p.addSurfSample(sampleValues(-i));
        return p;
    }

    /**
     * Sets the evidence behind the tiers to 2000 waves each: their normalised hit rate on
     * us, and our main and anti-surfer virtual ratings. Margins are then about 1.5 points.
     */
    public static OpponentProfile tiers(OpponentProfile p, double theirRate, double mainRating,
                                        double antiSurferRating) {
        p.normalised[0] = 2000;
        p.normalised[1] = (float) (2000 * theirRate);
        p.virtualFired[0] = 2000;
        p.virtualHits[0] = (float) (2000 * mainRating);
        p.virtualFired[1] = 2000;
        p.virtualHits[1] = (float) (2000 * antiSurferRating);
        return p;
    }

    /** Sets ADAPT-5's verdict: POW-7's hit-rate condition stood at the last battle's end. */
    public static OpponentProfile leadAware(OpponentProfile p, boolean standing) {
        p.leadAware = standing;
        return p;
    }

    /** Sets every tier's evidence to {@code waves} waves, their normalised rate to {@code theirRate}. */
    public static OpponentProfile evidence(OpponentProfile p, int waves, double theirRate) {
        p.normalised[0] = waves;
        p.normalised[1] = (float) (waves * theirRate);
        p.virtualFired[0] = waves;
        p.virtualHits[0] = waves * 0.2f;
        p.virtualFired[1] = waves;
        p.virtualHits[1] = waves * 0.2f;
        return p;
    }

    /** A plausible gun sample (see {@link Seeds}): data point, guess factor, displacement. */
    public static double[] gunSample(double guessFactor, double dx, double dy) {
        double[] s = new double[OpponentProfile.SAMPLE_WIDTH];
        for (int i = 0; i < 10; i++) s[i] = 0.1 * (i % 5);
        s[10] = guessFactor;
        s[11] = dx;
        s[12] = dy;
        return s;
    }

    /** A plausible surf sample: 11 flattener values, the lateral value, the guess factor. */
    public static double[] surfSample(double guessFactor) {
        double[] s = new double[OpponentProfile.SAMPLE_WIDTH];
        for (int i = 0; i < 12; i++) s[i] = 0.05 * (i % 7);
        s[12] = guessFactor;
        return s;
    }

    static short[] sampleValues(int seed) {
        short[] s = new short[OpponentProfile.SAMPLE_WIDTH];
        for (int i = 0; i < s.length; i++) s[i] = (short) (seed * 31 + i * 1009);
        return s;
    }
}
