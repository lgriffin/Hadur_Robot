package hadur2.core.world;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.IntRange;

/** WORLD-9 as properties: the prediction never outruns a robot, and never moves a point back in time. */
class RosterPredictionProperties {

    @Property(tries = 1000)
    @Tag("WORLD-9")
    void predictionIsNeverFartherThanTopSpeed(
            @ForAll @DoubleRange(min = 0, max = 1200) double x,
            @ForAll @DoubleRange(min = 0, max = 1200) double y,
            @ForAll @DoubleRange(min = -7, max = 7) double heading,
            @ForAll @DoubleRange(min = -100, max = 100) double velocity,
            @ForAll @IntRange(min = -30, max = 60) int later) {
        Roster r = new Roster(List.of("m"), 1);
        r.newRound();
        r.scanned("m", x, y, heading, velocity, 100);
        double moved = r.mate("m").at(100 + later).distance(x, y);
        assertTrue(moved <= 8.0 * Math.max(0, later) + 1e-9, moved + " px in " + later + " ticks");
        if (later <= 0) assertEquals(0, moved, 0);
    }
}
