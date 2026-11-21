package hadur117.core.shieldmode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** SHIELD-33: shield-tiny lines name the opponents whose sub-0.1 shots shield mode builds waves for. */
class ShieldTinyTest {

    private static final double MY_X = 400;
    private static final double MY_Y = 300;

    private static ShieldMode mode(List<String> lines, String name) {
        ShieldMode mode = new ShieldMode(ShieldList.parse(lines), r -> { }, 0, ShieldDesign.NONE);
        mode.onScan(name, 1, MY_X, MY_Y, 0, 0, MY_X, MY_Y + 400, Math.PI, 0);
        return mode;
    }

    @Test
    @Tag("SHIELD-33")
    @DisplayName("a shield-tiny line matches its opponent by name alone and no other")
    void lineMatchesByName() {
        ShieldList list = ShieldList.parse(List.of("list.Target", "shield-tiny: list.Target 1.0"));
        assertTrue(list.tiny("list.Target 1.0"));
        assertTrue(list.tiny("list.Target 2.0"));
        assertFalse(list.tiny("other.Bot 1.0"));
        assertFalse(ShieldList.parse(List.of("list.Target")).tiny("list.Target 1.0"));
    }

    @Test
    @Tag("SHIELD-33")
    @DisplayName("shield mode passes sub-0.1 shots only for a shield-listed opponent with a shield-tiny line")
    void onlyListedAndTiny() {
        assertTrue(mode(List.of("list.Target", "shield-tiny: list.Target"), "list.Target 1.0").tiny());
        assertFalse(mode(List.of("list.Target"), "list.Target 1.0").tiny());
        assertFalse(mode(List.of("shield-tiny: list.Target"), "list.Target 1.0").tiny());
    }
}
