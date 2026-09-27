package hadur2.core.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Tag;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.Size;
import java.util.List;

/** ADAPT-3: a seed replays the sample it was made from, to the stored precision. */
class SeedsProperties {

    @Property
    @Tag("ADAPT-3")
    void gunSamplesSurviveStorage(
            @ForAll @Size(13) List<@DoubleRange(min = -3.2, max = 3.2) Double> values) {
        double[] sample = values.stream().mapToDouble(Double::doubleValue).toArray();
        sample[11] = sample[11] * 8 / 3.2;
        sample[12] = sample[12] * 8 / 3.2;
        double[] back = Seeds.gun(Seeds.gun(sample));
        for (int i = 0; i < 11; i++) assertEquals(sample[i], back[i], 0.5e-4 + 1e-12, "value " + i);
        assertEquals(sample[11], back[11], 0.5e-3 + 1e-12);
        assertEquals(sample[12], back[12], 0.5e-3 + 1e-12);
    }

    @Property
    @Tag("ADAPT-3")
    void surfSamplesSurviveStorage(
            @ForAll @Size(13) List<@DoubleRange(min = -3.2, max = 3.2) Double> values) {
        double[] sample = values.stream().mapToDouble(Double::doubleValue).toArray();
        double[] back = Seeds.surf(Seeds.surf(sample));
        for (int i = 0; i < 13; i++) assertEquals(sample[i], back[i], 0.5e-4 + 1e-12, "value " + i);
    }

    @Example
    void outOfRangeClampsAndNaNIsZero() {
        double[] sample = new double[13];
        sample[0] = 99;
        sample[1] = Double.NaN;
        sample[2] = Double.NEGATIVE_INFINITY;
        double[] back = Seeds.surf(Seeds.surf(sample));
        assertEquals(Short.MAX_VALUE / 10_000.0, back[0], 1e-12);
        assertEquals(0, back[1]);
        assertEquals(Short.MIN_VALUE / 10_000.0, back[2], 1e-12);
    }
}
