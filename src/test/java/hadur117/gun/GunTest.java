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
        @DisplayName("caps at 0.5 when myEnergy < 10")
        void capsAt05() {
            // dist=100 => base 3.0, myE=5 => cap 0.5
            // dist <= 200: no myEnergy/4 cap
            // min(0.5, max(0.1, 100/4+0.2))=min(0.5, 25.2)=0.5
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
        @DisplayName("caps at 0.8 when >15 shots and <12% accuracy")
        void lowAccuracyCap() throws Exception {
            setShotsFired(20);
            setShotsHit(1); // 5% accuracy
            // dist=100 => base 3.0, myE=100
            // accuracy cap: min(3.0, 0.8) = 0.8
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(0.8, power, 1e-9);
        }

        @Test
        @DisplayName("caps at 1.2 when >10 shots and <18% accuracy")
        void mediumAccuracyCap() throws Exception {
            setShotsFired(12);
            setShotsHit(2); // 16.7% accuracy
            // dist=100 => base 3.0, myE=100
            // shotsFired=12, accuracy=16.7% -> 12>10 && 16.7%<18% => cap 1.2
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(1.2, power, 1e-9);
        }

        @Test
        @DisplayName("no accuracy cap when shots <= 10")
        void noCapFewShots() throws Exception {
            setShotsFired(8);
            setShotsHit(0); // 0% accuracy but too few shots
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

        @Test
        @DisplayName("boundary: exactly 15 shots with 12% hits no penalty for first bracket")
        void boundary15Shots12Percent() throws Exception {
            setShotsFired(15);
            setShotsHit(1); // 6.7% < 12% but shotsFired=15 which is NOT > 15
            // So the first bracket (shotsFired > 15) doesn't apply
            // But shotsFired=15 > 10, accuracy=6.7% < 18% => cap 1.2
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(1.2, power, 1e-9);
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
            // base: 2.0, myE cap since < 10: 0.5
            // dist>200: min(0.5, 4/4)=min(0.5, 1.0)=0.5
            // min(0.5, max(0.1, 100/4+0.2))=min(0.5, 25.2)=0.5
            double power = gun.smartFirePower(300, 4, 100);
            assertEquals(0.5, power, 1e-9);
        }

        @Test
        @DisplayName("myEnergy/4 cap does not apply at distance <= 200")
        void noMyCapCloseRange() {
            // dist=100 (<=200), myE=2 => base 3.0
            // energy conservation: myE<10 => cap 0.5
            // no myEnergy/4 cap since dist <= 200
            // min(0.5, max(0.1, 100/4+0.2))=min(0.5, 25.2)=0.5
            double power = gun.smartFirePower(100, 2, 100);
            assertEquals(0.5, power, 1e-9);
        }
    }

    // ── smartFirePower: result clamping ─────────────────────────────────

    @Nested
    @DisplayName("smartFirePower() result clamping")
    class ResultClamping {

        @Test
        @DisplayName("result is always >= 0.1 when myEnergy >= 0.2")
        void minimumResult() {
            // Even with extreme caps, result should be >= 0.1
            double power = gun.smartFirePower(1000, 0.5, 0.01);
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
