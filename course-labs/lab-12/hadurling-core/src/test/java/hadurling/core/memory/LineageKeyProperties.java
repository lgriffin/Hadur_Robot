package hadurling.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.StringLength;

@Tag("HL-24")
class LineageKeyProperties {

    @Property
    void aFileStemIsAlwaysSafe(@ForAll @StringLength(max = 200) String anything) {
        String stem = LineageKey.fileStem(LineageKey.of(anything));
        assertTrue(stem.matches("[A-Za-z0-9._-]+"), stem);
        assertFalse(stem.startsWith("."), stem);
    }

    @Property
    void aKeyIsNeverEmptyAndNeverLong(@ForAll @StringLength(max = 300) String anything) {
        String key = LineageKey.of(anything);
        assertFalse(key.isEmpty());
        assertTrue(key.length() <= LineageKey.MAX_LENGTH);
    }

    @Property
    void theKeyOfAKeyIsItself(@ForAll @StringLength(max = 100) String anything) {
        String key = LineageKey.of(anything);
        assertEquals(key, LineageKey.of(key));
    }
}
