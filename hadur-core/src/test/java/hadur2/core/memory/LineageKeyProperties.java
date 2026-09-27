package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.AlphaChars;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.StringLength;

/**
 * MEM-1 files a profile under the opponent's lineage key. The artifact's failure table:
 * a name not in the expected format still gets a key and never throws, whatever the
 * characters (spaces, brackets, unicode).
 */
@Tag("MEM-1")
class LineageKeyProperties {

    @Example
    void dropsVersionAndDuplicateMarker() {
        assertEquals("abc.Shadow", LineageKey.of("abc.Shadow 3.84"));
        assertEquals("abc.Shadow", LineageKey.of("abc.Shadow 3.83c (2)"));
        assertEquals("sample.SpinBot", LineageKey.of("sample.SpinBot (1)"));
        assertEquals("aaa.r.ScalarR", LineageKey.of("aaa.r.ScalarR 0.005h.053-noshield"));
        assertEquals("sample.SpinBot", LineageKey.of("sample.SpinBot"));
    }

    @Example
    void oddNamesAreKeptWhole() {
        assertEquals("My Bot 2", LineageKey.of("My Bot 2"));
        assertEquals("unknown", LineageKey.of(null));
        assertEquals("unknown", LineageKey.of("   "));
        assertEquals("(1)", LineageKey.of("(1)"));
    }

    @Property
    void anyNameGivesAShortNonEmptyKey(@ForAll String name) {
        String key = LineageKey.of(name);
        assertFalse(key.isEmpty());
        assertTrue(key.length() <= LineageKey.MAX_LENGTH);
    }

    @Property
    void keyingIsIdempotent(@ForAll String name) {
        String key = LineageKey.of(name);
        assertEquals(key, LineageKey.of(key));
    }

    @Property
    void versionsShareALineage(@ForAll @AlphaChars @StringLength(min = 1, max = 20) String pkg,
                               @ForAll @AlphaChars @StringLength(min = 1, max = 20) String cls,
                               @ForAll @StringLength(max = 30) String version,
                               @ForAll @IntRange(min = 0, max = 3) int copy) {
        String name = pkg + "." + cls;
        String full = name + " " + version + (copy > 0 ? " (" + copy + ")" : "");
        assertEquals(name, LineageKey.of(full));
    }

    @Property
    void fileStemsAreSafe(@ForAll String name) {
        String stem = LineageKey.fileStem(LineageKey.of(name));
        assertTrue(stem.matches("[A-Za-z0-9._-]+"), stem);
        assertFalse(stem.startsWith("."), stem);
    }

    @Example
    void keysThatDifferOnlyInUnsafeCharactersGetDifferentFiles() {
        assertNotEquals(LineageKey.fileStem("a b"), LineageKey.fileStem("a*b"));
    }
}
