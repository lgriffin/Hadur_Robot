package hadur117.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MovementType enum")
class MovementTypeTest {

    @Test
    @DisplayName("exactly seven enum values")
    void exactlySevenValues() {
        assertEquals(7, MovementType.values().length);
    }

    @Test
    @DisplayName("all seven constants exist")
    void allConstantsExist() {
        assertNotNull(MovementType.STOPPED);
        assertNotNull(MovementType.LINEAR);
        assertNotNull(MovementType.CIRCULAR);
        assertNotNull(MovementType.OSCILLATING);
        assertNotNull(MovementType.RANDOM);
        assertNotNull(MovementType.WAVE_SURFER);
        assertNotNull(MovementType.UNKNOWN);
    }

    @Test
    @DisplayName("declaration order matches specification")
    void declarationOrder() {
        MovementType[] vals = MovementType.values();
        assertEquals(MovementType.STOPPED, vals[0]);
        assertEquals(MovementType.LINEAR, vals[1]);
        assertEquals(MovementType.CIRCULAR, vals[2]);
        assertEquals(MovementType.OSCILLATING, vals[3]);
        assertEquals(MovementType.RANDOM, vals[4]);
        assertEquals(MovementType.WAVE_SURFER, vals[5]);
        assertEquals(MovementType.UNKNOWN, vals[6]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"STOPPED", "LINEAR", "CIRCULAR", "OSCILLATING", "RANDOM", "WAVE_SURFER", "UNKNOWN"})
    @DisplayName("valueOf round-trips for all names")
    void valueOfRoundTrips(String name) {
        MovementType mt = MovementType.valueOf(name);
        assertEquals(name, mt.name());
    }

    @Test
    @DisplayName("valueOf with invalid name throws IllegalArgumentException")
    void valueOfInvalid() {
        assertThrows(IllegalArgumentException.class, () -> MovementType.valueOf("ZIGZAG"));
    }

    @Test
    @DisplayName("valueOf with null throws NullPointerException")
    void valueOfNull() {
        assertThrows(NullPointerException.class, () -> MovementType.valueOf(null));
    }

    @Test
    @DisplayName("valueOf is case-sensitive")
    void valueOfCaseSensitive() {
        assertThrows(IllegalArgumentException.class, () -> MovementType.valueOf("stopped"));
        assertThrows(IllegalArgumentException.class, () -> MovementType.valueOf("Linear"));
    }

    @ParameterizedTest
    @EnumSource(MovementType.class)
    @DisplayName("each value has correct ordinal")
    void ordinalsAreSequential(MovementType mt) {
        assertTrue(mt.ordinal() >= 0 && mt.ordinal() < 7);
    }

    @Test
    @DisplayName("UNKNOWN ordinal is 6 (last)")
    void unknownIsLast() {
        assertEquals(6, MovementType.UNKNOWN.ordinal());
    }
}
