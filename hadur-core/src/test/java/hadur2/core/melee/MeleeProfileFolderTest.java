package hadur2.core.melee;

import static hadur2.core.melee.Fixtures.field;
import static hadur2.core.melee.Fixtures.pt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.physics.DiaUtils;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** A round's melee observations and how they join an opponent's block (MMEM-1). */
class MeleeProfileFolderTest {

    private final MeleeProfileFolder folder = new MeleeProfileFolder();

    @Test
    @Tag("MMEM-1")
    @DisplayName("shots, hits, aims and powers fold into rates")
    void rates() {
        folder.scanned("a", 400);
        for (int i = 0; i < 10; i++) folder.shotInferred("a", i < 5 ? 1.0 : 3.0);
        folder.hitOnHadur("a", MeleeProfile.AimClass.LINEAR);
        folder.hitOnHadur("a", MeleeProfile.AimClass.LINEAR);
        folder.hitOnHadur("a", MeleeProfile.AimClass.HEAD_ON);
        folder.hitOnHadur("a", null);
        MeleeProfile p = new MeleeProfile("a");
        folder.foldInto("a", p, 5, 3);
        assertEquals(1, p.rounds());
        assertEquals(3, p.lastFought());
        assertEquals(0.4, p.meleeHitRateOnHadur(), 1e-6);
        assertEquals(2.0, p.avgBulletPower(), 1e-6);
        assertEquals(MeleeProfile.AimClass.LINEAR, p.aimStyle());
        assertEquals(1, p.typicalSurvivalRank(), 1e-9, "alive at the round's end: first");
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("a stranger has no rates, and two classified hits name no aim style")
    void strangerHasNoRates() {
        MeleeProfile p = new MeleeProfile("a");
        assertTrue(Double.isNaN(p.meleeHitRateOnHadur()));
        assertTrue(Double.isNaN(p.avgBulletPower()));
        assertTrue(Double.isNaN(p.rams()));
        assertTrue(Double.isNaN(p.typicalSurvivalRank()));
        folder.scanned("a", 400);
        folder.hitOnHadur("a", MeleeProfile.AimClass.HEAD_ON);
        folder.hitOnHadur("a", MeleeProfile.AimClass.HEAD_ON);
        folder.foldInto("a", p, 3, 1);
        assertNull(p.aimStyle());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("deaths place opponents from the last; survivors place first")
    void rankByDeathOrder() {
        for (String n : List.of("a", "b", "c", "d")) folder.scanned(n, 500);
        folder.died("c");
        folder.died("a");
        folder.died("c");
        folder.died("sentry");
        assertEquals(4, folder.rank("c", 4));
        assertEquals(3, folder.rank("a", 4));
        assertEquals(1, folder.rank("b", 4));
        assertEquals(1, folder.rank("d", 4));
        assertEquals(0, folder.rank("sentry", 4), "never scanned, never placed");
        assertEquals(List.of("a", "b", "c", "d"), folder.scannedNames());

        MeleeProfile c = new MeleeProfile("c");
        folder.foldInto("c", c, 4, 1);
        folder.newRound();
        folder.scanned("c", 500);
        folder.foldInto("c", c, 4, 2);
        assertEquals(2.5, c.typicalSurvivalRank(), 1e-9);
        assertEquals(2, c.lastFought());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("close scans at ramming range make a rammer")
    void rams() {
        for (int i = 0; i < 10; i++) folder.scanned("r", i < 6 ? 40 : 150);
        folder.scanned("r", 500);
        MeleeProfile p = new MeleeProfile("r");
        folder.foldInto("r", p, 3, 1);
        assertEquals(0.6, p.rams(), 1e-6);
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("counts decay past their limits, keeping the rates")
    void decays() {
        MeleeProfile p = new MeleeProfile("a");
        for (int round = 0; round < 300; round++) {
            folder.newRound();
            folder.scanned("a", 50);
            for (int i = 0; i < 100; i++) folder.shotInferred("a", 2.0);
            for (int i = 0; i < 25; i++) folder.hitOnHadur("a", MeleeProfile.AimClass.HEAD_ON);
            folder.foldInto("a", p, 3, 1);
        }
        assertTrue(p.shotsInferred() <= MeleeProfile.SHOT_LIMIT, "shots " + p.shotsInferred());
        assertTrue(p.typicalSurvivalRank() == 1 && p.rankRounds <= MeleeProfile.RANK_LIMIT);
        assertEquals(0.25, p.meleeHitRateOnHadur(), 1e-6);
        assertEquals(2.0, p.avgBulletPower(), 1e-6);
        assertEquals(1.0, p.rams(), 1e-9);
        assertEquals(300, p.rounds());
    }

    @Test
    @Tag("MMEM-1")
    @DisplayName("the melee brain feeds the round's shots, hits and deaths to the folder")
    void controllerFeedsTheFolder() {
        MeleeController c = new MeleeController(field(800, 600));
        c.onScan("a", pt(400, 500), 200, 100, 0, 0, 1);
        c.onScan("b", pt(100, 100), 360, 100, 0, 0, 1);
        c.onScan("a", pt(400, 500), 200, 98, 0, 0, 2);
        c.tick(new MeleeController.Situation(pt(400, 300), 0, 0, 100, 2, 2));
        c.tick(new MeleeController.Situation(pt(400, 300), 0, 0, 100, 3, 2));
        // a's bullet flew head-on at where Hadur stood.
        c.onHitByBullet("a", 2.0, DiaUtils.absoluteBearing(pt(400, 500), pt(400, 300)), pt(400, 300), 16);
        c.onRobotDeath("b");
        MeleeProfile a = new MeleeProfile("a");
        c.profiles().foldInto("a", a, 2, 1);
        assertEquals(1, a.shotsInferred(), 1e-9);
        assertEquals(2.0, a.avgBulletPower(), 1e-9);
        assertEquals(1, a.hitsOnHadur(), 1e-9);
        assertEquals(1, a.aimHits(MeleeProfile.AimClass.HEAD_ON), 1e-9);
        assertEquals(2, c.profiles().rank("b", 2));
        c.newRound();
        assertEquals(List.of("a", "b"), c.profiles().scannedNames(), "the core clears it, not a recovery");
    }
}
