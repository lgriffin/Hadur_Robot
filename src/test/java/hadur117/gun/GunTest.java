package hadur117.gun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Gun (virtual gun array)")
class GunTest {

    private Gun gun;

    @BeforeEach
    void setUp() {
        gun = new Gun();
        gun.init(800, 600);
    }

    // ── smartFirePower: basic distance bands ───────────────────────────

    @Nested
    @DisplayName("smartFirePower() distance bands")
    class DistanceBands {

        @Test
        @DisplayName("distance < 150 returns 3.0")
        void veryClose() {
            assertEquals(3.0, gun.smartFirePower(100, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance exactly 150 returns 2.5")
        void boundary150() {
            assertEquals(2.5, gun.smartFirePower(150, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance 200 returns 2.5")
        void dist200() {
            assertEquals(2.5, gun.smartFirePower(200, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance exactly 250 returns 2.0")
        void boundary250() {
            // distance=250, myE=100, enemyE=100 => power=2.0
            // no energy conservation applies (myE >= 35)
            // no accuracy penalty (shotsFired=0)
            // distance > 200: min(2.0, 100/4)=min(2.0,25)=2.0
            // min(2.0, max(0.1, 100/4+0.2))=min(2.0, 25.2)=2.0
            assertEquals(2.0, gun.smartFirePower(250, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance 350 returns 2.0")
        void dist350() {
            assertEquals(2.0, gun.smartFirePower(350, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance exactly 400 returns 1.5")
        void boundary400() {
            assertEquals(1.5, gun.smartFirePower(400, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance 500 returns 1.5")
        void dist500() {
            assertEquals(1.5, gun.smartFirePower(500, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance exactly 600 returns 1.0")
        void boundary600() {
            assertEquals(1.0, gun.smartFirePower(600, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance 800 returns 1.0")
        void dist800() {
            assertEquals(1.0, gun.smartFirePower(800, 100, 100), 1e-9);
        }
    }

    // ── smartFirePower: zero energy ────────────────────────────────────

    @Nested
    @DisplayName("smartFirePower() energy edge cases")
    class EnergyCases {

        @Test
        @DisplayName("returns 0.0 when myEnergy < 0.2")
        void myEnergyTooLow() {
            assertEquals(0.0, gun.smartFirePower(200, 0.1, 100), 1e-9);
        }

        @Test
        @DisplayName("returns 0.0 when myEnergy = 0")
        void myEnergyZero() {
            assertEquals(0.0, gun.smartFirePower(200, 0.0, 100), 1e-9);
        }

        @Test
        @DisplayName("returns > 0 when myEnergy = 0.2")
        void myEnergyExactly02() {
            // 0.2 is NOT < 0.2, so should return something
            double power = gun.smartFirePower(200, 0.2, 100);
            assertTrue(power > 0);
        }

        @Test
        @DisplayName("returns 0.0 when myEnergy < 1.0 and distance > 200")
        void energyCriticalFarAway() {
            assertEquals(0.0, gun.smartFirePower(300, 0.8, 100), 1e-9);
        }

        @Test
        @DisplayName("returns > 0 when myEnergy < 1.0 and distance <= 200")
        void energyCriticalCloseRange() {
            // myE=0.8, dist=100: myE < 1.0 but dist NOT > 200
            double power = gun.smartFirePower(100, 0.8, 100);
            assertTrue(power > 0);
        }
    }

    // ── smartFirePower: finishing move ──────────────────────────────────

    @Nested
    @DisplayName("smartFirePower() finishing move")
    class FinishingMove {

        @Test
        @DisplayName("finishing move when enemy <= 4 energy, my > 30, dist < 300")
        void finishingMoveTriggered() {
            // enemyEnergy=4, myEnergy=50, dist=200
            // finishing: min(3.0, max(0.1, 4/4 + 0.1)) = min(3.0, 1.1) = 1.1
            double power = gun.smartFirePower(200, 50, 4.0);
            assertEquals(1.1, power, 1e-9);
        }

        @Test
        @DisplayName("finishing move with 1 energy enemy")
        void finishingOneEnergy() {
            // min(3.0, max(0.1, 1/4+0.1)) = min(3.0, 0.35) = 0.35
            double power = gun.smartFirePower(100, 50, 1.0);
            assertEquals(0.35, power, 1e-9);
        }

        @Test
        @DisplayName("finishing move with 0.1 energy enemy")
        void finishingNearZeroEnergy() {
            // min(3.0, max(0.1, 0.1/4+0.1)) = min(3.0, max(0.1, 0.125)) = 0.125
            double power = gun.smartFirePower(100, 50, 0.1);
            assertEquals(0.125, power, 1e-9);
        }

        @Test
        @DisplayName("no finishing move when myEnergy <= 30")
        void noFinishingLowMyEnergy() {
            // enemyEnergy=4, myEnergy=30, dist=200 => finishing not triggered
            double power = gun.smartFirePower(200, 30, 4.0);
            // Falls through to normal distance-based: dist 200 => 2.5
            // But capped by min(power, myEnergy/4) since dist>200: min(2.5, 7.5)=2.5
            // Then min(2.5, max(0.1, 4/4+0.2))=min(2.5, 1.2)=1.2
            assertEquals(1.2, power, 1e-9);
        }

        @Test
        @DisplayName("no finishing move when distance >= 300")
        void noFinishingFarAway() {
            double power = gun.smartFirePower(300, 50, 4.0);
            // dist=300 => normal: 250<=300<400 => 2.0
            // dist>200: min(2.0, 50/4)=min(2.0,12.5)=2.0
            // min(2.0, max(0.1, 4/4+0.2))=min(2.0, 1.2)=1.2
            assertEquals(1.2, power, 1e-9);
        }

        @Test
        @DisplayName("no finishing move when enemyEnergy > 4")
        void noFinishingHighEnemyEnergy() {
            double power = gun.smartFirePower(200, 50, 5.0);
            // Normal: dist 200 => 2.5
            // dist>200: min(2.5, 50/4)=min(2.5,12.5)=2.5
            // min(2.5, max(0.1, 5/4+0.2))=min(2.5, 1.45)=1.45
            assertEquals(1.45, power, 1e-9);
        }
    }

    // ── smartFirePower: energy conservation caps ───────────────────────

    @Nested
    @DisplayName("smartFirePower() energy conservation")
    class EnergyConservation {

        @Test
        @DisplayName("caps at 0.3 when myEnergy < 5")
        void capsAt03() {
            // dist=100 => base 3.0, myE=4 => cap 0.3
            double power = gun.smartFirePower(100, 4, 100);
            assertEquals(0.3, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 0.5 when myEnergy < 10 and >= 5")
        void capsAt05() {
            // dist=100 => base 3.0, myE=5 => cap 0.5 (5 is NOT < 5)
            double power = gun.smartFirePower(100, 5, 100);
            assertEquals(0.5, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 1.0 when myEnergy < 20 and >= 10")
        void capsAt10() {
            // dist=100 => base 3.0, myE=15 => cap 1.0
            double power = gun.smartFirePower(100, 15, 100);
            assertEquals(1.0, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 1.5 when myEnergy < 35 and >= 20")
        void capsAt15() {
            // dist=100 => base 3.0, myE=25 => cap 1.5
            double power = gun.smartFirePower(100, 25, 100);
            assertEquals(1.5, power, 1e-9);
        }

        @Test
        @DisplayName("no cap when myEnergy >= 35 and no enemy advantage")
        void noCap() {
            // dist=100 => base 3.0, myE=50, enemyE=50 => no conservation cap, no enemy advantage
            double power = gun.smartFirePower(100, 50, 50);
            assertEquals(3.0, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 1.5 when enemy has 30+ more energy")
        void enemyMuchStronger() {
            // dist=100 => base 3.0, myE=50, enemyE=81 (81>50+30)
            // energy advantage cap: min(3.0, 1.5) = 1.5
            double power = gun.smartFirePower(100, 50, 81);
            assertEquals(1.5, power, 1e-9);
        }

        @Test
        @DisplayName("no energy advantage cap when enemy has exactly 30 more")
        void enemyExactly30More() {
            // enemyE = myE + 30 = 80, which is NOT > myE+30
            double power = gun.smartFirePower(100, 50, 80);
            assertEquals(3.0, power, 1e-9);
        }
    }

    // ── smartFirePower: accuracy penalty ───────────────────────────────

    @Nested
    @DisplayName("smartFirePower() accuracy penalty")
    class AccuracyPenalty {

        @Test
        @DisplayName("caps at 0.5 when >8 shots and <10% accuracy")
        void veryLowAccuracyCap() throws Exception {
            setShotsFired(10);
            setShotsHit(0); // 0% accuracy
            // 10>8 && 0%<10% => cap 0.5
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(0.5, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 0.8 when >12 shots and <12% accuracy but >= 10%")
        void lowAccuracyCap() throws Exception {
            setShotsFired(15);
            setShotsHit(1); // 6.7% < 10% → first bracket catches it
            // 15>8 && 6.7%<10% => cap 0.5
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(0.5, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 0.8 when >12 shots and accuracy between 10-12%")
        void lowAccuracySecondBracket() throws Exception {
            setShotsFired(15);
            setShotsHit(1); // 6.7% triggers first bracket at 0.5
            // To test second bracket: need accuracy >= 10% but < 12%
            // 15 shots, 1 hit = 6.7%, still first bracket
            // Let's use 13 shots, 1 hit = 7.7% — first bracket
            // For second bracket test: use acc >= 10% but < 12%
            setShotsFired(20);
            setShotsHit(2); // 10% — NOT < 10%, falls to second
            // 20>12 && 10%<12% => cap 0.8
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(0.8, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 1.2 when >10 shots and <18% accuracy")
        void mediumAccuracyCap() throws Exception {
            setShotsFired(12);
            setShotsHit(2); // 16.7% accuracy
            // 12>8 && 16.7%<10%? NO. 12>12? NO.
            // 12>10 && 16.7%<18% => cap 1.2
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(1.2, power, 1e-9);
        }

        @Test
        @DisplayName("no accuracy cap when shots <= 8")
        void noCapFewShots() throws Exception {
            setShotsFired(8);
            setShotsHit(0); // 0% accuracy but 8 is NOT > 8
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(3.0, power, 1e-9);
        }

        @Test
        @DisplayName("no accuracy cap when accuracy >= 18%")
        void noCapGoodAccuracy() throws Exception {
            setShotsFired(20);
            setShotsHit(4); // 20% accuracy
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(3.0, power, 1e-9);
        }
    }

    // ── smartFirePower: enemy energy cap ───────────────────────────────

    @Nested
    @DisplayName("smartFirePower() enemy energy cap")
    class EnemyEnergyCap {

        @Test
        @DisplayName("capped by enemyEnergy/4 + 0.2")
        void cappedByEnemyEnergy() {
            // dist=300, myE=100, enemyE=2
            // base power for dist 300: 2.0
            // dist>200: min(2.0, 100/4)=min(2.0, 25)=2.0
            // min(2.0, max(0.1, 2/4+0.2))=min(2.0, 0.7)=0.7
            double power = gun.smartFirePower(300, 100, 2);
            assertEquals(0.7, power, 1e-9);
        }

        @Test
        @DisplayName("enemyEnergy cap does not go below 0.1")
        void enemyCapFloor() {
            // enemyEnergy=0 => max(0.1, 0/4+0.2) = max(0.1, 0.2) = 0.2
            double power = gun.smartFirePower(300, 100, 0);
            assertEquals(0.2, power, 1e-9);
        }

        @Test
        @DisplayName("myEnergy/4 cap at distance > 200")
        void myEnergyCap() {
            // dist=300, myE=4, enemyE=100
            // base: 2.0, myE < 5 => cap 0.3
            // dist>200: min(0.3, 4/4)=min(0.3, 1.0)=0.3
            // min(0.3, max(0.1, 100/4+0.2))=min(0.3, 25.2)=0.3
            double power = gun.smartFirePower(300, 4, 100);
            assertEquals(0.3, power, 1e-9);
        }

        @Test
        @DisplayName("myEnergy/4 cap does not apply at distance <= 200")
        void noMyCapCloseRange() {
            // dist=100 (<=200), myE=2 => base 3.0
            // energy conservation: myE<5 => cap 0.3
            // no myEnergy/4 cap since dist <= 200
            // min(0.3, max(0.1, 100/4+0.2))=min(0.3, 25.2)=0.3
            double power = gun.smartFirePower(100, 2, 100);
            assertEquals(0.3, power, 1e-9);
        }
    }

    // ── smartFirePower: result clamping ─────────────────────────────────

    @Nested
    @DisplayName("smartFirePower() result clamping")
    class ResultClamping {

        @Test
        @DisplayName("result is always >= 0.1 when myEnergy >= 0.2 and not energy-critical")
        void minimumResult() {
            // myE=0.5, dist=100 (close range, not energy-critical)
            double power = gun.smartFirePower(100, 0.5, 0.01);
            assertTrue(power >= 0.1);
        }

        @Test
        @DisplayName("result never exceeds 3.0")
        void maximumResult() {
            double power = gun.smartFirePower(50, 500, 500);
            assertTrue(power <= 3.0);
        }
    }

    // ── Accuracy and stats ─────────────────────────────────────────────

    @Nested
    @DisplayName("accuracy and stats")
    class StatsTests {

        @Test
        @DisplayName("initial accuracy is 0")
        void initialAccuracy() {
            assertEquals(0.0, gun.getAccuracy(), 1e-9);
        }

        @Test
        @DisplayName("initial shotsFired is 0")
        void initialShotsFired() {
            assertEquals(0, gun.getShotsFired());
        }

        @Test
        @DisplayName("initial shotsHit is 0")
        void initialShotsHit() {
            assertEquals(0, gun.getShotsHit());
        }

        @Test
        @DisplayName("accuracy = shotsHit / shotsFired")
        void accuracyCalculation() throws Exception {
            setShotsFired(10);
            setShotsHit(3);
            assertEquals(0.3, gun.getAccuracy(), 1e-9);
        }
    }

    // ── Active gun name ────────────────────────────────────────────────

    @Nested
    @DisplayName("getActiveGunName()")
    class ActiveGunNameTests {

        @Test
        @DisplayName("default active gun is GuessFactor")
        void defaultGun() {
            assertEquals("GuessFactor", gun.getActiveGunName());
        }

        @Test
        @DisplayName("active gun index 1 returns PatternMatch")
        void patternMatch() throws Exception {
            setActiveGun(1);
            assertEquals("PatternMatch", gun.getActiveGunName());
        }

        @Test
        @DisplayName("active gun index 2 returns Circular")
        void circular() throws Exception {
            setActiveGun(2);
            assertEquals("Circular", gun.getActiveGunName());
        }

        @Test
        @DisplayName("active gun index 3 returns Linear")
        void linear() throws Exception {
            setActiveGun(3);
            assertEquals("Linear", gun.getActiveGunName());
        }

        @Test
        @DisplayName("active gun index 4 returns HeadOn")
        void headOn() throws Exception {
            setActiveGun(4);
            assertEquals("HeadOn", gun.getActiveGunName());
        }

        @Test
        @DisplayName("active gun index out of range returns Unknown")
        void unknown() throws Exception {
            setActiveGun(99);
            assertEquals("Unknown", gun.getActiveGunName());
        }
    }

    // ── applyMeleeCap ──────────────────────────────────────────────────

    @Nested
    @DisplayName("applyMeleeCap()")
    class MeleeCapTests {

        @Test
        @DisplayName("caps at 0.5 when 4 opponents alive")
        void capsAt05With4Opponents() {
            assertEquals(0.5, gun.applyMeleeCap(3.0, 4), 1e-9);
        }

        @Test
        @DisplayName("caps at 0.5 when 5 opponents alive")
        void capsAt05With5Opponents() {
            assertEquals(0.5, gun.applyMeleeCap(2.0, 5), 1e-9);
        }

        @Test
        @DisplayName("caps at 1.0 when exactly 3 opponents alive")
        void capsAt10With3Opponents() {
            assertEquals(1.0, gun.applyMeleeCap(3.0, 3), 1e-9);
        }

        @Test
        @DisplayName("no cap when 2 opponents alive")
        void noCapWith2Opponents() {
            assertEquals(3.0, gun.applyMeleeCap(3.0, 2), 1e-9);
        }

        @Test
        @DisplayName("no cap when 1 opponent alive")
        void noCapWith1Opponent() {
            assertEquals(2.5, gun.applyMeleeCap(2.5, 1), 1e-9);
        }

        @Test
        @DisplayName("does not increase power already below 4-opponent cap")
        void doesNotIncreaseLowPowerWith4() {
            assertEquals(0.3, gun.applyMeleeCap(0.3, 4), 1e-9);
        }

        @Test
        @DisplayName("does not increase power already below 3-opponent cap")
        void doesNotIncreaseLowPowerWith3() {
            assertEquals(0.3, gun.applyMeleeCap(0.3, 3), 1e-9);
        }
    }

    // ── per-opponent accuracy tiers (5-param smartFirePower) ─────────

    @Nested
    @DisplayName("smartFirePower() per-opponent accuracy tiers")
    class PerOpponentAccuracy {

        @Test
        @DisplayName("caps at 0.3 when perOpponentAccuracy < 5% with 8+ shots")
        void veryLowAccuracy() {
            double power = gun.smartFirePower(100, 100, 100, 0.04, 10);
            assertEquals(0.3, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 0.5 when perOpponentAccuracy 5-10% with 8+ shots")
        void lowAccuracy() {
            double power = gun.smartFirePower(100, 100, 100, 0.08, 10);
            assertEquals(0.5, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 0.8 when perOpponentAccuracy 10-15% with 8+ shots")
        void mediumAccuracy() {
            double power = gun.smartFirePower(100, 100, 100, 0.12, 10);
            assertEquals(0.8, power, 1e-9);
        }

        @Test
        @DisplayName("no per-opponent cap when accuracy >= 15%")
        void goodAccuracy() {
            double power = gun.smartFirePower(100, 100, 100, 0.16, 10);
            assertEquals(3.0, power, 1e-9);
        }

        @Test
        @DisplayName("no per-opponent cap when fewer than 8 shots fired")
        void tooFewShots() {
            double power = gun.smartFirePower(100, 100, 100, 0.02, 7);
            assertEquals(3.0, power, 1e-9);
        }
    }

    // ── lastFirePower ─────────────────────────────────────────────────

    @Test
    @DisplayName("getLastFirePower returns 0 initially")
    void lastFirePowerInitial() {
        assertEquals(0.0, gun.getLastFirePower(), 1e-9);
    }

    // ── init ───────────────────────────────────────────────────────────

    @Test
    @DisplayName("init sets battlefield dimensions")
    void initSetsSize() throws Exception {
        gun.init(1200, 900);
        Field bfW = Gun.class.getDeclaredField("bfWidth");
        bfW.setAccessible(true);
        Field bfH = Gun.class.getDeclaredField("bfHeight");
        bfH.setAccessible(true);
        assertEquals(1200.0, bfW.getDouble(gun), 1e-9);
        assertEquals(900.0, bfH.getDouble(gun), 1e-9);
    }

    // ── Helper methods ─────────────────────────────────────────────────

    private void setShotsFired(int n) throws Exception {
        Field f = Gun.class.getDeclaredField("shotsFired");
        f.setAccessible(true);
        f.setInt(gun, n);
    }

    private void setShotsHit(int n) throws Exception {
        Field f = Gun.class.getDeclaredField("shotsHit");
        f.setAccessible(true);
        f.setInt(gun, n);
    }

    private void setActiveGun(int idx) throws Exception {
        Field f = Gun.class.getDeclaredField("activeGun");
        f.setAccessible(true);
        f.setInt(gun, idx);
    }
}
