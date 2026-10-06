package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileFolderTest {

    @Test
    @Tag("MEM-2")
    @DisplayName("nothing reaches the profile until the round ends")
    void foldsOnlyAtRoundEnd() {
        OpponentProfile p = new OpponentProfile("a.B");
        p.startBattle("a.B 1", 1);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        f.enemyShot(320, 1.9, true);
        f.ourShot(320);
        assertEquals(0, p.theirShots());
        assertEquals(0, p.ourShots());
        f.fold(false);
        assertEquals(1, p.theirShots());
        assertEquals(1, p.ourShots());
        assertEquals(1, p.rounds());
    }

    @Test
    @Tag("ADAPT-5")
    @DisplayName("ADAPT-5: the folder keeps the latest verdict, so the last round's is the battle's end")
    void leadAwareVerdictIsTheLatest() {
        OpponentProfile p = new OpponentProfile("a.B");
        p.startBattle("a.B 1", 1);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        assertFalse(p.leadAware(), "a stranger has no verdict");
        f.leadAware(true);
        f.fold(true);
        assertTrue(p.leadAware());
        f.leadAware(true);
        f.fold(false);
        assertTrue(p.leadAware());
        f.leadAware(false);
        f.fold(false);
        assertFalse(p.leadAware(), "the battle's last round contradicted it");
    }

    @Test
    @Tag("MEM-2")
    @DisplayName("a round's gun, movement and outcome statistics are folded in")
    void foldsEveryGroup() {
        OpponentProfile p = new OpponentProfile("a.B");
        p.startBattle("a.B 1", 1);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        // Their gun: 4 shots, 1 hit at 320 px while we moved; one at 100 px while we stood.
        for (int i = 0; i < 4; i++) f.enemyShot(320, 2.9, true);
        f.enemyShot(100, 0.5, false);
        f.hitByEnemy(320, true, 16);
        // Our gun: 2 shots, 1 hit.
        f.ourShot(500);
        f.ourShot(500);
        f.ourHit(500, 16);
        // Their movement: forward, back, stopped at the wall.
        f.enemyScanned(8, 6, 400, 300);
        f.enemyScanned(-8, -6, 400, 300);
        f.enemyScanned(0, 0, 20, 300);
        f.virtualGuns(10, 2, 10, 3);
        f.fold(true);

        assertEquals(0.2, p.theirHitRate(), 1e-6);
        assertEquals(0.25, p.theirHitRate(OpponentProfile.band(320)), 1e-6);
        assertEquals(0.25, p.theirHitRateMoving(), 1e-6);
        assertEquals(0.0, p.theirHitRateStopped(), 1e-6);
        assertEquals(0.8, p.powerShares()[OpponentProfile.powerBin(2.9)], 1e-6);
        assertEquals(0.5, p.ourHitRate(), 1e-6);
        assertEquals(3, p.scans(), 1e-6);
        assertEquals(1.0 / 3, p.reversalRate(), 1e-6);
        assertEquals(4.0, p.averageLateralVelocity(), 1e-6);
        assertEquals(1.0 / 3, p.wallHugFraction(), 1e-6);
        assertEquals(1.0 / 3, p.stoppedFraction(), 1e-6);
        assertEquals(0.2, p.mainGunRating(), 1e-6);
        assertEquals(0.3, p.antiSurferRating(), 1e-6);
        OpponentProfile.BattleOutcome o = p.outcomes().get(0);
        assertEquals(1, o.rounds());
        assertEquals(1, o.wins());
        assertEquals(16, o.ourDamage(), 1e-6);
        assertEquals(16, o.theirDamage(), 1e-6);
    }

    @Test
    @Tag("MEM-2")
    @DisplayName("virtual-gun totals are folded as each round's growth, not counted twice")
    void virtualGunsFoldGrowth() {
        OpponentProfile p = new OpponentProfile("a.B");
        p.startBattle("a.B", 1);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        f.virtualGuns(10, 1, 10, 2);
        f.fold(true);
        f.virtualGuns(25, 4, 25, 5);
        f.fold(true);
        assertEquals(25, p.virtualWaves(), 1e-6);
        assertEquals(4.0 / 25, p.mainGunRating(), 1e-6);
    }

    @Test
    @Tag("RES-2")
    @DisplayName("the profile stays bounded however long it is kept")
    void bounded() {
        OpponentProfile p = new OpponentProfile("a.B");
        for (int b = 1; b <= 50; b++) {
            p.startBattle("a.B", b);
            ProfileFolder f = new ProfileFolder(p, 800, 600);
            for (int r = 0; r < 35; r++) {
                for (int i = 0; i < 20; i++) {
                    f.enemyShot(300, 2, true);
                    f.ourShot(300);
                    f.enemyScanned(8, 8, 400, 300);
                }
                f.virtualGuns((r + 1) * 20.0, 0, (r + 1) * 20.0, 0);
                f.fold(r % 2 == 0);
            }
        }
        for (int i = 0; i < 2000; i++) {
            p.addGunSample(Profiles.sampleValues(i));
            p.addSurfSample(Profiles.sampleValues(i));
        }
        assertEquals(OpponentProfile.MAX_OUTCOMES, p.outcomes().size());
        assertEquals(OpponentProfile.MAX_GUN_SEED, p.gunSeedSize());
        assertEquals(OpponentProfile.MAX_SURF_SEED, p.surfSeedSize());
        assertTrue(p.theirShots() <= OpponentProfile.DECAY_LIMIT + 20 * 35);
        assertTrue(p.ourShots() <= OpponentProfile.DECAY_LIMIT + 20 * 35);
        assertTrue(p.virtualWaves() <= OpponentProfile.DECAY_LIMIT + 20 * 35);
        assertTrue(p.scans() <= OpponentProfile.DECAY_LIMIT * 10 + 20 * 35);
        assertTrue(ProfileCodec.encode(p).length < 25 * 1024);
    }

    @Test
    @DisplayName("tiers follow the artifact's tables once the margin of error is narrow enough")
    void tiers() {
        OpponentProfile p = new OpponentProfile("a.B");
        p.startBattle("a.B", 1);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        f.normalised(50, 7.5);
        f.virtualGuns(50, 5, 50, 12);
        f.fold(true);
        assertEquals(Tiers.Gun.UNKNOWN, Tiers.gun(p), "50 waves leave too wide a margin");
        assertEquals(Tiers.Move.UNKNOWN, Tiers.move(p));
        f.normalised(1000, 150);
        f.virtualGuns(1000, 100, 1000, 240);
        f.fold(true);
        assertEquals(Tiers.Gun.T3, Tiers.gun(p), "15% normalised hit rate");
        assertEquals(Tiers.Move.M2, Tiers.move(p), "anti-surfer clearly ahead");
        assertEquals("T3/M2", Tiers.label(p));
    }

    @Test
    @Tag("MEM-2")
    @DisplayName("seeds and normalised counts join the profile only at the fold")
    void seedsFoldAtRoundEnd() {
        OpponentProfile p = new OpponentProfile("a.B");
        p.startBattle("a.B", 1);
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        for (int i = 0; i < 3; i++) f.gunSample(Profiles.gunSample(0.1 * i, 1, 2));
        f.surfSample(Profiles.surfSample(-0.5));
        f.normalised(12, 1.5);
        assertEquals(0, p.gunSeedSize(), "nothing before the fold");
        f.fold(true);
        assertEquals(3, p.gunSeedSize());
        assertEquals(1, p.surfSeedSize());
        assertEquals(0.2, Seeds.gun(p.gunSeed().get(2))[10], 1e-4);
        assertEquals(-0.5, Seeds.surf(p.surfSeed().get(0))[12], 1e-4);
        assertEquals(12, p.normalisedWaves(), 1e-6);
        f.normalised(20, 2.5);
        f.fold(false);
        assertEquals(20, p.normalisedWaves(), 1e-6, "battle totals fold as growth");
        assertEquals(2.5, p.normalisedHits(), 1e-6);
        assertEquals(3, p.gunSeedSize(), "a round's samples fold once");
    }

    @Test
    @DisplayName("a round keeps only the newest samples a seed can hold")
    void seedBufferIsBounded() {
        OpponentProfile p = new OpponentProfile("a.B");
        ProfileFolder f = new ProfileFolder(p, 800, 600);
        for (int i = 0; i < OpponentProfile.MAX_GUN_SEED + 50; i++) f.gunSample(Profiles.gunSample(0, i / 1000.0, 0));
        f.fold(true);
        assertEquals(OpponentProfile.MAX_GUN_SEED, p.gunSeedSize());
        assertEquals(0.05, Seeds.gun(p.gunSeed().get(0))[11], 1e-3, "the oldest 50 went");
    }
}
