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
        f.fold(true);
        for (int i = 0; i < gunSeed; i++) p.addGunSample(sampleValues(i));
        for (int i = 0; i < surfSeed; i++) p.addSurfSample(sampleValues(-i));
        return p;
    }

    static short[] sampleValues(int seed) {
        short[] s = new short[OpponentProfile.SAMPLE_WIDTH];
        for (int i = 0; i < s.length; i++) s[i] = (short) (seed * 31 + i * 1009);
        return s;
    }
}
