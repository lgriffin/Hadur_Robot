package hadurling.core.policy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;

/** The ring buffer against the obvious version: keep the list, count the last N. */
@Tag("HL-26")
class HitWindowProperties {

    @Property
    void windowEqualsTheLastNOutcomes(@ForAll @IntRange(min = 1, max = 30) int capacity,
            @ForAll @Size(max = 200) List<Boolean> outcomes) {
        HitWindow window = new HitWindow(capacity);
        for (boolean o : outcomes) window.record(o);

        List<Boolean> last = outcomes.subList(Math.max(0, outcomes.size() - capacity), outcomes.size());
        long hits = last.stream().filter(b -> b).count();
        Estimate expected = last.isEmpty() ? Estimate.NONE : Estimate.of(hits, last.size());

        assertEquals(last.size(), window.size());
        assertTrue(window.size() <= capacity);
        assertEquals(expected.value(), window.estimate().value(), 1e-12);
        assertEquals(expected.margin(), window.estimate().margin(), 1e-12);
    }
}
