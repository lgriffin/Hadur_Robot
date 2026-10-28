package hadur117;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.shieldmode.ShieldList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** MOVE-23: the stack off-list ships as a class of the robot jar, 197 versionless names. */
@Tag("MOVE-23")
class StackListResourceTest {

    @Test
    @DisplayName("197 distinct versionless robot names, each matching every version through the core's list")
    void namesAreVersionlessAndMatch() {
        List<String> lines = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        for (String name : StackListData.lines()) {
            assertTrue(name.matches("[\\w$]+(\\.[\\w$]+)+"), "not a versionless name: " + name);
            assertTrue(seen.add(name), "duplicate: " + name);
            lines.add(ShieldList.STACK_OFF_PREFIX + " " + name);
        }
        assertEquals(197, seen.size());
        ShieldList list = ShieldList.parse(lines);
        assertTrue(list.isEmpty(), "none of them is a shield-mode entry");
        assertTrue(list.onStackOffList("kc.mega.BeepBoop 2.0"));
        assertTrue(list.onStackOffList("kc.mega.BeepBoop 7.7"));
        assertTrue(list.onStackOffList("voidious.Diamond 1.8.22"));
        assertFalse(list.onStackOffList("kc.mega.BeepBoopX 2.0"));
        assertFalse(list.onStackOffList("some.New 1.0"));
        assertEquals(Arrays.asList("kc.mega.BeepBoop", "jd.Nullstride", "jk.mega.DrussGT").toString(),
            Arrays.asList(StackListData.lines()).subList(0, 3).toString());
    }
}
