package hadur117.core.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur117.core.physics.GunCopy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** COPY-2: a wave carries the bearing the bred copy fires. */
class WaveCopyTest {

    @Test
    @Tag("COPY-2")
    @DisplayName("with no mimic, a wave's pattern angle is the copy's aim from the wave's scan; with neither it is NaN")
    void copyAngle() {
        Wave w = new Wave();
        assertTrue(Double.isNaN(w.patternAngle()));
        GunCopy c = GunCopy.parse(
            "hist;ticks=1;bins=31;s_lat=1;s_dist=1;d_max=900;s_accel=1;s_since=1;s_wall=1;roll=0.0;smooth=1;lag=0", 800, 600);
        c.observe(0, 400, 100, 0, 0, 400, 500, 0);
        w.gunCopy = c;
        w.copyIndex = 0;
        w.setBulletPower(2.0);
        assertEquals(c.aim(0, 2.0), w.patternAngle(), 1e-12);
        assertEquals(c.aim(0, 2.0), w.patternAngle(), 1e-12, "cached");
    }
}
