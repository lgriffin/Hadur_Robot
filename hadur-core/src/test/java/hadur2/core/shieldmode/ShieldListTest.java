package hadur2.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHIELD-5: which opponents the list names, and how a line matches a scanned name. */
@Tag("SHIELD-5")
class ShieldListTest {

    @Test
    @DisplayName("a list of only comments and blanks is empty and matches nobody")
    void emptyHeaderOnly() {
        ShieldList list = ShieldList.parse(List.of("# a header", "", "   ", "# apv.test.Virus 0.6.1"));
        assertTrue(list.isEmpty());
        assertSame(ShieldList.NONE, list);
        assertFalse(list.matches("apv.test.Virus 0.6.1"));
        assertFalse(ShieldList.NONE.matches(null));
    }

    @Test
    @DisplayName("a name with its version matches that version only")
    void withVersion() {
        ShieldList list = ShieldList.parse(List.of("apv.test.Virus 0.6.1"));
        assertTrue(list.matches("apv.test.Virus 0.6.1"));
        assertFalse(list.matches("apv.test.Virus 0.6.2"));
        assertFalse(list.matches("apv.test.Virus"));
    }

    @Test
    @DisplayName("a name without a version matches every version of that robot")
    void withoutVersion() {
        ShieldList list = ShieldList.parse(List.of("apv.test.Virus"));
        assertTrue(list.matches("apv.test.Virus 0.6.1"));
        assertTrue(list.matches("apv.test.Virus 9.9"));
        assertTrue(list.matches("apv.test.Virus"));
    }

    @Test
    @DisplayName("matching is exact: never a prefix, and case counts")
    void notAPrefix() {
        ShieldList list = ShieldList.parse(List.of("apv.test.Virus"));
        assertFalse(list.matches("apv.test.VirusX 1.0"));
        assertFalse(list.matches("apv.test.Vir 1.0"));
        assertFalse(list.matches("APV.test.virus 0.6.1"));
        assertFalse(list.matches("other.apv.test.Virus 0.6.1"));
    }

    @Test
    @DisplayName("comments, blanks and stray white space are ignored")
    void tidiness() {
        ShieldList list = ShieldList.parse(List.of("# header", "  cx.micro.Smoke   0.96  ", "", "sample.Walls"));
        assertEquals(2, list.size());
        assertTrue(list.matches("cx.micro.Smoke 0.96"));
        assertTrue(list.matches("sample.Walls 1.0"));
    }

    @Test
    @DisplayName("the list is bounded")
    void bounded() {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < ShieldList.MAX_ENTRIES + 500; i++) lines.add("r.Robot" + i);
        assertEquals(ShieldList.MAX_ENTRIES, ShieldList.parse(lines).size());
    }

    @Test
    @DisplayName("a missing list is the empty list")
    void nullLines() {
        assertTrue(ShieldList.parse(null).isEmpty());
    }

    @Test
    @Tag("MOVE-28")
    @Tag("GUN-11")
    @DisplayName("heat-jit and gun-stack lines name per-opponent switches, matched as shield entries, and no shield entry")
    void perOpponentSwitches() {
        ShieldList l = ShieldList.parse(List.of("heat-jit: a.B 1.0", "gun-stack: a.B 1.0", "gun-stack: c.D",
            "heat-jit:", "gun-stack:   "));
        assertTrue(l.heatJit("a.B 1.0"));
        assertTrue(l.gunStack("a.B 1.0"));
        assertFalse(l.heatJit("a.B 1.1"), "a versioned line matches that version only");
        assertTrue(l.gunStack("c.D 2.3"), "a bare name matches every version");
        assertFalse(l.heatJit("c.D 2.3"));
        assertFalse(l.matches("a.B 1.0"), "not a shield entry");
        assertTrue(l.isEmpty());
        assertFalse(ShieldList.NONE.heatJit("a.B 1.0"));
        assertFalse(ShieldList.NONE.gunStack(null));
        assertSame(ShieldList.NONE, ShieldList.parse(List.of("heat-jit:", "gun-stack:")));
    }
}
