package hadur117.intel;

import hadur117.model.MovementType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TargetProfile (per-opponent strategy snapshot)")
class TargetProfileTest {

    @Nested
    @DisplayName("BALANCED_DEFAULT")
    class DefaultTests {

        @Test
        @DisplayName("default movementType is UNKNOWN")
        void defaultMovementType() {
            assertEquals(MovementType.UNKNOWN,
                    TargetProfile.BALANCED_DEFAULT.movementType);
        }

        @Test
        @DisplayName("default gunType is UNKNOWN")
        void defaultGunType() {
            assertEquals("UNKNOWN", TargetProfile.BALANCED_DEFAULT.gunType);
        }

        @Test
        @DisplayName("default firePowerMult is 1.0")
        void defaultFirePowerMult() {
            assertEquals(1.0, TargetProfile.BALANCED_DEFAULT.firePowerMult, 1e-9);
        }

        @Test
        @DisplayName("default ourAccuracy is 0.15")
        void defaultOurAccuracy() {
            assertEquals(0.15, TargetProfile.BALANCED_DEFAULT.ourAccuracy, 1e-9);
        }
    }

    @Nested
    @DisplayName("constructor")
    class ConstructorTests {

        @Test
        @DisplayName("stores all fields correctly")
        void storesFields() {
            TargetProfile p = new TargetProfile(
                    MovementType.CIRCULAR, "LINEAR", 1.1, 0.25);
            assertEquals(MovementType.CIRCULAR, p.movementType);
            assertEquals("LINEAR", p.gunType);
            assertEquals(1.1, p.firePowerMult, 1e-9);
            assertEquals(0.25, p.ourAccuracy, 1e-9);
        }

        @Test
        @DisplayName("fields are final")
        void fieldsAreFinal() {
            java.lang.reflect.Field[] fields =
                    TargetProfile.class.getDeclaredFields();
            for (java.lang.reflect.Field f : fields) {
                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                    assertTrue(java.lang.reflect.Modifier.isFinal(f.getModifiers()),
                            "Field " + f.getName() + " should be final");
                }
            }
        }
    }
}
