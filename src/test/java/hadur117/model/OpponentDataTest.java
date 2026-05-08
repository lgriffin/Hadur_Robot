package hadur117.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("OpponentData (mutable per-opponent state)")
class OpponentDataTest {

    private OpponentData od;

    @BeforeEach
    void setUp() {
        od = new OpponentData("TestBot");
    }

    // ── Constructor ────────────────────────────────────────────────────

    @Test
    @DisplayName("constructor sets name")
    void constructorSetsName() {
        assertEquals("TestBot", od.name);
    }

    @Test
    @DisplayName("constructor accepts empty name")
    void emptyName() {
        OpponentData empty = new OpponentData("");
        assertEquals("", empty.name);
    }

    // ── Default values ─────────────────────────────────────────────────

    @Test
    @DisplayName("default movementType is UNKNOWN")
    void defaultMovementType() {
        assertEquals(MovementType.UNKNOWN, od.movementType);
    }

    @Test
    @DisplayName("default gunType is UNKNOWN")
    void defaultGunType() {
        assertEquals("UNKNOWN", od.gunType);
    }

    @Test
    @DisplayName("default threatLevel is 0.5")
    void defaultThreatLevel() {
        assertEquals(0.5, od.threatLevel, 1e-9);
    }

    @Test
    @DisplayName("default energy is 100")
    void defaultEnergy() {
        assertEquals(100.0, od.energy, 1e-9);
    }

    @Test
    @DisplayName("default lastScanTick is -1")
    void defaultLastScanTick() {
        assertEquals(-1L, od.lastScanTick);
    }

    @Test
    @DisplayName("default lastEnergy is -1")
    void defaultLastEnergy() {
        assertEquals(-1.0, od.lastEnergy, 1e-9);
    }

    @Test
    @DisplayName("default fireCount is 0")
    void defaultFireCount() {
        assertEquals(0, od.fireCount);
    }

    @Test
    @DisplayName("default totalBulletPower is 0")
    void defaultTotalBulletPower() {
        assertEquals(0.0, od.totalBulletPower, 1e-9);
    }

    @Test
    @DisplayName("default damageDealt is 0")
    void defaultDamageDealt() {
        assertEquals(0.0, od.damageDealt, 1e-9);
    }

    @Test
    @DisplayName("default damageReceived is 0")
    void defaultDamageReceived() {
        assertEquals(0.0, od.damageReceived, 1e-9);
    }

    @Test
    @DisplayName("default hitsOnUs is 0")
    void defaultHitsOnUs() {
        assertEquals(0, od.hitsOnUs);
    }

    @Test
    @DisplayName("default x and y are 0")
    void defaultPosition() {
        assertEquals(0.0, od.x, 1e-9);
        assertEquals(0.0, od.y, 1e-9);
    }

    @Test
    @DisplayName("default heading and velocity are 0")
    void defaultHeadingAndVelocity() {
        assertEquals(0.0, od.heading, 1e-9);
        assertEquals(0.0, od.velocity, 1e-9);
    }

    // ── Profile tracking defaults ─────────────────────────────────────

    @Test
    @DisplayName("default shotsFiredAt is 0")
    void defaultShotsFiredAt() {
        assertEquals(0, od.shotsFiredAt);
    }

    @Test
    @DisplayName("default shotsHitOn is 0")
    void defaultShotsHitOn() {
        assertEquals(0, od.shotsHitOn);
    }

    @Test
    @DisplayName("hitBearingErrors list is initially empty")
    void hitBearingErrorsEmpty() {
        assertNotNull(od.hitBearingErrors);
        assertTrue(od.hitBearingErrors.isEmpty());
    }

    @Test
    @DisplayName("default prevRoundMovementType is UNKNOWN")
    void defaultPrevRoundMovementType() {
        assertEquals(MovementType.UNKNOWN, od.prevRoundMovementType);
    }

    @Test
    @DisplayName("shotsFiredAt is mutable")
    void shotsFiredAtMutable() {
        od.shotsFiredAt = 10;
        assertEquals(10, od.shotsFiredAt);
    }

    @Test
    @DisplayName("shotsHitOn is mutable")
    void shotsHitOnMutable() {
        od.shotsHitOn = 5;
        assertEquals(5, od.shotsHitOn);
    }

    @Test
    @DisplayName("hitBearingErrors can be added")
    void hitBearingErrorsAddable() {
        od.hitBearingErrors.add(0.05);
        od.hitBearingErrors.add(-0.03);
        assertEquals(2, od.hitBearingErrors.size());
    }

    @Test
    @DisplayName("prevRoundMovementType is mutable")
    void prevRoundMovementTypeMutable() {
        od.prevRoundMovementType = MovementType.CIRCULAR;
        assertEquals(MovementType.CIRCULAR, od.prevRoundMovementType);
    }

    // ── Collections ────────────────────────────────────────────────────

    @Test
    @DisplayName("fireTicks list is initially empty")
    void fireTicksEmpty() {
        assertNotNull(od.fireTicks);
        assertTrue(od.fireTicks.isEmpty());
    }

    @Test
    @DisplayName("window is initially empty")
    void windowEmpty() {
        assertNotNull(od.window);
        assertTrue(od.window.isEmpty());
    }

    // ── Mutability ─────────────────────────────────────────────────────

    @Test
    @DisplayName("name is mutable")
    void nameMutable() {
        od.name = "Changed";
        assertEquals("Changed", od.name);
    }

    @Test
    @DisplayName("movementType is mutable")
    void movementTypeMutable() {
        od.movementType = MovementType.CIRCULAR;
        assertEquals(MovementType.CIRCULAR, od.movementType);
    }

    @Test
    @DisplayName("gunType is mutable")
    void gunTypeMutable() {
        od.gunType = "HEAD_ON";
        assertEquals("HEAD_ON", od.gunType);
    }

    @Test
    @DisplayName("threatLevel is mutable")
    void threatLevelMutable() {
        od.threatLevel = 0.9;
        assertEquals(0.9, od.threatLevel, 1e-9);
    }

    @Test
    @DisplayName("position is mutable")
    void positionMutable() {
        od.x = 500.0;
        od.y = 300.0;
        assertEquals(500.0, od.x, 1e-9);
        assertEquals(300.0, od.y, 1e-9);
    }

    @Test
    @DisplayName("energy is mutable")
    void energyMutable() {
        od.energy = 42.5;
        assertEquals(42.5, od.energy, 1e-9);
    }

    @Test
    @DisplayName("fireCount is mutable")
    void fireCountMutable() {
        od.fireCount = 7;
        assertEquals(7, od.fireCount);
    }

    @Test
    @DisplayName("damage stats are mutable")
    void damageMutable() {
        od.damageDealt = 120.0;
        od.damageReceived = 80.0;
        od.hitsOnUs = 5;
        assertEquals(120.0, od.damageDealt, 1e-9);
        assertEquals(80.0, od.damageReceived, 1e-9);
        assertEquals(5, od.hitsOnUs);
    }

    // ── Snapshot window operations ─────────────────────────────────────

    @Test
    @DisplayName("snapshots can be added to window")
    void addSnapshot() {
        od.window.add(new Snapshot(1, 0, 0, 100, 100, 100));
        assertEquals(1, od.window.size());
    }

    @Test
    @DisplayName("window maintains insertion order (LinkedList)")
    void windowOrder() {
        od.window.add(new Snapshot(1, 0, 0, 100, 100, 100));
        od.window.add(new Snapshot(2, 0, 0, 99, 101, 101));
        od.window.add(new Snapshot(3, 0, 0, 98, 102, 102));
        assertEquals(1L, od.window.getFirst().tick);
        assertEquals(3L, od.window.getLast().tick);
    }

    @Test
    @DisplayName("fireTicks can be added")
    void addFireTicks() {
        od.fireTicks.add(10L);
        od.fireTicks.add(25L);
        assertEquals(2, od.fireTicks.size());
        assertEquals(10L, od.fireTicks.get(0));
    }

    @Test
    @DisplayName("window is clearable")
    void windowClearable() {
        od.window.add(new Snapshot(1, 0, 0, 100, 0, 0));
        od.window.add(new Snapshot(2, 0, 0, 100, 0, 0));
        od.window.clear();
        assertTrue(od.window.isEmpty());
    }
}
