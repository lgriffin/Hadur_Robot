package hadur117.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/** COPY-2: the bred copy of the enemy's gun. */
class GunCopyTest {

    static final String HIST = "hist;ticks=1;bins=31;s_lat=1;s_dist=1;d_max=900;s_accel=1;s_since=1;s_wall=1;roll=0.0;smooth=1;lag=0";

    @Test
    @Tag("COPY-2")
    @DisplayName("a genome names its family and every gene; anything else is no copy")
    void parses() {
        assertEquals("hist", GunCopy.parse(HIST, 800, 600).family());
        assertNotNull(GunCopy.parse("knn;w_lat=1;w_adv=0;w_dist=1;w_accel=0;w_since=0;w_wall=0;k=5;width=0.1;ticks=0;cap=500;lag=1", 800, 600));
        assertEquals(2, GunCopy.parse("pm;round=2.0x2.0;longest=20;least=1;lag=2", 800, 600).lag());
        assertNull(GunCopy.parse("hist;bins=31", 800, 600), "genes missing");
        assertNull(GunCopy.parse("tree;depth=3", 800, 600), "no such family");
        assertNull(GunCopy.parse("hist;ticks", 800, 600));
        assertNull(GunCopy.parse(null, 800, 600));
    }

    @Test
    @Tag("COPY-2")
    @DisplayName("a histogram copy fed a steady orbit learns to lead it: its aim moves ahead of the bearing")
    void histogramLeadsAnOrbit() {
        GunCopy c = GunCopy.parse(HIST, 800, 600);
        double ex = 400, ey = 300, rad = 250;
        double ang = 0;
        for (int i = 0; i < 400; i++) {
            ang += 8 / rad;
            double x = ex + rad * Math.sin(ang), y = ey + rad * Math.cos(ang);
            c.observe(0, x, y, ang + Math.PI / 2, 8, ex, ey, i == 10 ? 2.0 : 0);
        }
        int last = c.size() - 1;
        double bearing = ang;
        double aim = c.aim(last, 2.0);
        double lead = Angles.normalRelativeAngle(aim - bearing);
        // Clockwise round the enemy: the wave finds us further round, so the aim leads by most of the escape.
        assertTrue(lead > 0.3 && lead < Math.asin(8 / 14.0) + 0.05, "lead " + lead);
    }

    @Test
    @Tag("COPY-2")
    @DisplayName("with no history the copy aims nowhere; with no waves learnt it aims head-on")
    void headOnFirst() {
        GunCopy c = GunCopy.parse(HIST, 800, 600);
        assertTrue(Double.isNaN(c.aim(0, 2.0)));
        c.observe(0, 400, 100, 0, 0, 400, 500, 0);
        assertEquals(Math.PI, Math.abs(c.aim(0, 2.0)), 1e-9);
    }

    /** Orbits {@code c}'s enemy clockwise for {@code n} ticks, reversing every {@code flip}, firing every 15th. */
    static double orbit(GunCopy c, int n, int flip, int round) {
        double ex = 400, ey = 300, rad = 250, ang = 0;
        double v = 8;
        for (int i = 0; i < n; i++) {
            if (flip > 0 && i % flip == 0 && i > 0) v = -v;
            ang += v / rad;
            double x = ex + rad * Math.sin(ang), y = ey + rad * Math.cos(ang);
            boolean fire = i % 15 == 0 && i > 0;
            c.observe(round, x, y, ang + Math.PI / 2, v, ex, ey, fire ? 2.0 : 0);
            if (fire) c.shot(c.size() - 2, 2.0);
        }
        return ang;
    }

    @Test
    @Tag("COPY-2")
    @DisplayName("a nearest-neighbour copy that learns from shots, and a sliced, forgetting histogram, both lead an orbit")
    void nearestNeighbourAndSlicedHistogram() {
        GunCopy knn = GunCopy.parse("knn;w_lat=1;w_adv=1;w_dist=1;w_accel=1;w_since=1;w_wall=1;k=5;width=0.1;ticks=0;cap=50;lag=1", 800, 600);
        GunCopy hist = GunCopy.parse("hist;ticks=0;bins=23;s_lat=3;s_dist=2;d_max=600;s_accel=3;s_since=2;s_wall=2;roll=0.1;smooth=0;lag=2", 800, 600);
        for (GunCopy c : new GunCopy[] {knn, hist}) {
            orbit(c, 300, 0, 0);
            double ang = orbit(c, 300, 0, 1);
            double lead = Angles.normalRelativeAngle(c.aim(c.size() - 1, 2.0) - ang);
            assertTrue(lead > 0.2, c.family() + " lead " + lead);
        }
    }

    @Test
    @Tag("COPY-2")
    @DisplayName("a pattern-matcher copy replays what followed the last match; with no match it aims head-on")
    void patternMatcher() {
        GunCopy pm = GunCopy.parse("pm;round=1.0x1.0;longest=20;least=2;lag=0", 800, 600);
        // A short history has nothing to match: head-on.
        pm.observe(0, 400, 100, 0, 8, 400, 500, 0);
        pm.observe(0, 400, 108, 0, 8, 400, 500, 0);
        assertEquals(Math.PI, Math.abs(pm.aim(1, 2.0)), 1e-6);
        GunCopy c = GunCopy.parse("pm;round=1.0x1.0;longest=20;least=2;lag=0", 800, 600);
        double ang = orbit(c, 400, 40, 0);
        double aim = c.aim(c.size() - 1, 2.0);
        assertTrue(!Double.isNaN(aim) && Math.abs(Angles.normalRelativeAngle(aim - ang)) < 1.0, "aim " + aim);
    }
}
