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

    // ── smartFirePower: distance-based power ──────────────────────────

    @Nested
    @DisplayName("smartFirePower() distance bands")
    class DistanceBands {

        @Test
        @DisplayName("distance < 150 returns 3.0")
        void veryClose() {
            assertEquals(3.0, gun.smartFirePower(100, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance exactly 150 returns 1.5 (default rolling accuracy)")
        void boundary150() {
            assertEquals(1.5, gun.smartFirePower(150, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance 400 returns 1.5 (default rolling accuracy)")
        void dist400() {
            assertEquals(1.5, gun.smartFirePower(400, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("distance 800 returns 1.5 (default rolling accuracy)")
        void dist800() {
            assertEquals(1.5, gun.smartFirePower(800, 100, 100), 1e-9);
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
            double power = gun.smartFirePower(200, 0.2, 100);
            assertTrue(power > 0);
        }

        @Test
        @DisplayName("fires low power with low energy at range")
        void lowEnergyAtRange() {
            double power = gun.smartFirePower(300, 0.8, 100);
            assertTrue(power > 0);
            assertTrue(power <= 0.8);
        }

        @Test
        @DisplayName("returns > 0 when myEnergy < 1.0 and distance <= 150")
        void energyCriticalCloseRange() {
            double power = gun.smartFirePower(100, 0.8, 100);
            assertTrue(power > 0);
        }
    }

    // ── smartFirePower: enemy energy cap ───────────────────────────────

    @Nested
    @DisplayName("smartFirePower() enemy energy cap")
    class EnemyEnergyCap {

        @Test
        @DisplayName("capped by (enemyEnergy + 0.1) / 4")
        void cappedByEnemyEnergy() {
            // eE=2: (2.1)/4 = 0.525
            double power = gun.smartFirePower(300, 100, 2);
            assertEquals(0.525, power, 1e-9);
        }

        @Test
        @DisplayName("enemy cap floor at 0.1")
        void enemyCapFloor() {
            // eE=0: (0.1)/4 = 0.025 → clamped to 0.1
            double power = gun.smartFirePower(300, 100, 0);
            assertEquals(0.1, power, 1e-9);
        }

        @Test
        @DisplayName("energy reserve cap: power*6 >= myEnergy")
        void energyReserveCap() {
            // dist=300, myE=4, eE=4: power=1.9, eE cap=1.025, 1.025*6=6.15>=4 → 4/6=0.667
            double power = gun.smartFirePower(300, 4, 4);
            assertEquals(4.0 / 6.0, power, 1e-9);
        }

        @Test
        @DisplayName("stay-alive cap: power >= myEnergy - 0.1")
        void stayAliveCap() {
            // dist=100, myE=0.3, eE=100: power=3.0, eE cap=25, 3*6=18>=0.3 → 0.3/6=0.05
            // 0.05 >= 0.3-0.1=0.2? No. max(0.1, 0.05) = 0.1
            double power = gun.smartFirePower(100, 0.3, 100);
            assertEquals(0.1, power, 1e-9);
        }
    }

    // ── smartFirePower: energy conservation ───────────────────────────

    @Nested
    @DisplayName("smartFirePower() energy conservation")
    class EnergyConservation {

        @Test
        @DisplayName("fires 3.0 close range with enough energy")
        void fullPowerClose() {
            assertEquals(3.0, gun.smartFirePower(100, 50, 50), 1e-9);
        }

        @Test
        @DisplayName("1/6 reserve cap with medium energy")
        void reserveCapMediumEnergy() {
            // dist=100, myE=10, eE=10: power=3.0, eE cap=2.525, 2.525*6=15.15>=10 → 10/6
            double power = gun.smartFirePower(100, 10, 10);
            assertEquals(10.0 / 6.0, power, 1e-9);
        }

        @Test
        @DisplayName("fires 1.5 at range with default rolling accuracy")
        void rangedPower() {
            assertEquals(1.5, gun.smartFirePower(400, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("fires aggressively even at energy disadvantage")
        void aggressiveAtDisadvantage() {
            // dist=100, myE=20, eE=100: power=3.0, eE cap=25, 3*6=18<20, 3<19.9 → 3.0
            assertEquals(3.0, gun.smartFirePower(100, 20, 100), 1e-9);
        }
    }

    // ── smartFirePower: no accuracy penalty ──────────────────────────────

    @Nested
    @DisplayName("smartFirePower() no accuracy penalty")
    class NoAccuracyPenalty {

        @Test
        @DisplayName("no cap even with 0% accuracy after many shots")
        void noCapZeroAccuracy() throws Exception {
            setShotsFired(50);
            setShotsHit(0);
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(3.0, power, 1e-9);
        }

        @Test
        @DisplayName("no cap with low accuracy")
        void noCapLowAccuracy() throws Exception {
            setShotsFired(20);
            setShotsHit(1);
            double power = gun.smartFirePower(100, 100, 100);
            assertEquals(3.0, power, 1e-9);
        }
    }

    // ── smartFirePower: result clamping ─────────────────────────────────

    @Nested
    @DisplayName("smartFirePower() result clamping")
    class ResultClamping {

        @Test
        @DisplayName("result is always >= 0.1 when myEnergy >= 0.2")
        void minimumResult() {
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

    // ── Rolling accuracy power scaling ─────────────────────────────────

    @Nested
    @DisplayName("smartFirePower() rolling accuracy scaling")
    class RollingAccuracyScaling {

        @Test
        @DisplayName("default rolling accuracy is 0.15")
        void defaultRollingAccuracy() {
            assertEquals(0.15, gun.getRollingAccuracy(), 1e-9);
        }

        @Test
        @DisplayName("low rolling accuracy gives 1.0 power at range")
        void lowRollingAccGivesLowPower() throws Exception {
            setRollingAccuracy(0, 30);
            assertEquals(1.0, gun.smartFirePower(400, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("high rolling accuracy gives 1.9 power at range")
        void highRollingAccGivesHighPower() throws Exception {
            setRollingAccuracy(6, 30);
            assertEquals(1.9, gun.smartFirePower(400, 100, 100), 1e-9);
        }

        @Test
        @DisplayName("close range always 3.0 regardless of accuracy")
        void closeRangeIgnoresAccuracy() throws Exception {
            setRollingAccuracy(0, 30);
            assertEquals(3.0, gun.smartFirePower(100, 100, 100), 1e-9);
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

    // ── KNN constants ─────────────────────────────────────────────────

    @Nested
    @DisplayName("KNN targeting constants")
    class KnnConstants {

        @Test
        @DisplayName("buffer size is 2000")
        void bufferSize() throws Exception {
            Field f = Gun.class.getDeclaredField("KNN_BUFFER_SIZE");
            f.setAccessible(true);
            assertEquals(2000, f.getInt(null));
        }

        @Test
        @DisplayName("feature vector has 13 dimensions")
        void dimensions() throws Exception {
            Field f = Gun.class.getDeclaredField("KNN_DIMENSIONS");
            f.setAccessible(true);
            assertEquals(13, f.getInt(null));
        }

        @Test
        @DisplayName("minimum data threshold is 30")
        void minData() throws Exception {
            Field f = Gun.class.getDeclaredField("KNN_MIN_DATA");
            f.setAccessible(true);
            assertEquals(30, f.getInt(null));
        }
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

    private void setRollingAccuracy(int hits, int total) throws Exception {
        Field hitsField = Gun.class.getDeclaredField("rollingHits");
        hitsField.setAccessible(true);
        boolean[] arr = (boolean[]) hitsField.get(gun);
        for (int i = 0; i < total; i++) arr[i] = i < hits;
        Field sizeField = Gun.class.getDeclaredField("rollingSize");
        sizeField.setAccessible(true);
        sizeField.setInt(gun, total);
    }
}
