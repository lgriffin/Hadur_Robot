package hadur117.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Snapshot (immutable data carrier)")
class SnapshotTest {

    @Test
    @DisplayName("constructor sets all fields correctly")
    void constructorSetsFields() {
        Snapshot s = new Snapshot(42L, 1.5, 6.0, 85.0, 300.0, 400.0);
        assertEquals(42L, s.tick);
        assertEquals(1.5, s.heading, 1e-9);
        assertEquals(6.0, s.velocity, 1e-9);
        assertEquals(85.0, s.energy, 1e-9);
        assertEquals(300.0, s.x, 1e-9);
        assertEquals(400.0, s.y, 1e-9);
    }

    @Test
    @DisplayName("fields are final and immutable after construction")
    void fieldsAreFinal() throws NoSuchFieldException {
        assertTrue(java.lang.reflect.Modifier.isFinal(
                Snapshot.class.getField("tick").getModifiers()));
        assertTrue(java.lang.reflect.Modifier.isFinal(
                Snapshot.class.getField("heading").getModifiers()));
        assertTrue(java.lang.reflect.Modifier.isFinal(
                Snapshot.class.getField("velocity").getModifiers()));
        assertTrue(java.lang.reflect.Modifier.isFinal(
                Snapshot.class.getField("energy").getModifiers()));
        assertTrue(java.lang.reflect.Modifier.isFinal(
                Snapshot.class.getField("x").getModifiers()));
        assertTrue(java.lang.reflect.Modifier.isFinal(
                Snapshot.class.getField("y").getModifiers()));
    }

    @Test
    @DisplayName("zero values are preserved")
    void zeroValues() {
        Snapshot s = new Snapshot(0L, 0.0, 0.0, 0.0, 0.0, 0.0);
        assertEquals(0L, s.tick);
        assertEquals(0.0, s.heading, 1e-9);
        assertEquals(0.0, s.velocity, 1e-9);
        assertEquals(0.0, s.energy, 1e-9);
        assertEquals(0.0, s.x, 1e-9);
        assertEquals(0.0, s.y, 1e-9);
    }

    @Test
    @DisplayName("negative values are preserved")
    void negativeValues() {
        Snapshot s = new Snapshot(-1L, -Math.PI, -8.0, 0.0, -100.0, -200.0);
        assertEquals(-1L, s.tick);
        assertEquals(-Math.PI, s.heading, 1e-9);
        assertEquals(-8.0, s.velocity, 1e-9);
        assertEquals(0.0, s.energy, 1e-9);
        assertEquals(-100.0, s.x, 1e-9);
        assertEquals(-200.0, s.y, 1e-9);
    }

    @Test
    @DisplayName("large tick values are preserved")
    void largeTick() {
        Snapshot s = new Snapshot(Long.MAX_VALUE, 0, 0, 0, 0, 0);
        assertEquals(Long.MAX_VALUE, s.tick);
    }

    @Test
    @DisplayName("two snapshots with same data are distinct objects")
    void distinctInstances() {
        Snapshot a = new Snapshot(1, 0.5, 3.0, 100, 100, 200);
        Snapshot b = new Snapshot(1, 0.5, 3.0, 100, 100, 200);
        assertNotSame(a, b);
    }

    @Test
    @DisplayName("fields are public")
    void fieldsArePublic() throws NoSuchFieldException {
        assertTrue(java.lang.reflect.Modifier.isPublic(
                Snapshot.class.getField("tick").getModifiers()));
        assertTrue(java.lang.reflect.Modifier.isPublic(
                Snapshot.class.getField("x").getModifiers()));
    }
}
