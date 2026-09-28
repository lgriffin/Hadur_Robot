package hadur.bench;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** BENCH-1: each stratum's opponent weights in rumble-sample.txt must sum to its documented share. */
@Tag("BENCH-1")
class RumbleSampleTest {

    @Test
    @DisplayName("the top30 stratum's weights sum to 2.5% (its documented population share)")
    void top30WeightsSumToItsShare() throws Exception {
        List<Opponent> opponents = Opponent.load(Path.of("rumble-sample.txt"));
        double sum = opponents.stream().filter(o -> o.role.equals("top30")).mapToDouble(o -> o.weight).sum();
        assertEquals(2.5, sum, 0.01);
    }
}
