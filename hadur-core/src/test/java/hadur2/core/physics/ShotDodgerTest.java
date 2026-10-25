package hadur2.core.physics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hadur2.core.shieldmode.ShieldList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The simple-aim dodge of the 1v1 mode table: DODGE-1's aims, DODGE-2's dodger and DODGE-3's
 * table entries. The enemy stands 400 px north of us on an 800 x 600 field.
 */
class ShotDodgerTest {

    private static final double W = 800, H = 600;

    /** Our state at (400, 100) heading east at {@code v}, turning {@code turn}; the enemy at (400, 500). */
    private static double[] state(double v, double turn, double average) {
        return new double[] {400, 100, Math.PI / 2, v, turn, average, 400, 500, 0};
    }

    @Test
    @Tag("DODGE-1")
    @DisplayName("head-on aims straight at us; linear leads us east; circular leads less as we turn north")
    void aims() {
        double[] a = SimpleAims.angles(new double[][] {state(8, 0.05, 4), null, null}, 14, W, H);
        assertEquals(SimpleAims.COUNT, a.length);
        assertEquals(Math.PI, a[SimpleAims.HEAD_ON], 1e-12, "due south");
        assertTrue(a[SimpleAims.LINEAR] < Math.PI && a[SimpleAims.LINEAR] > Math.PI / 2, "south-east of head-on");
        // Linear: about 8 px a tick for ~30 ticks, ~ 230 px east at 400 px: atan(230/400).
        assertEquals(Math.PI - Math.atan2(8 * 31.4, 400), a[SimpleAims.LINEAR], 0.05);
        assertTrue(a[SimpleAims.AVERAGE_LINEAR] > a[SimpleAims.LINEAR], "half the speed leads half as far");
        assertTrue(Double.isNaN(a[SimpleAims.TYPES]), "no state for lag 1");
        double still = SimpleAims.angles(new double[][] {state(0, 0, 0)}, 14, W, H)[SimpleAims.LINEAR];
        assertEquals(Math.PI, still, 1e-12, "a still target's linear aim is head-on");
    }

    @Test
    @Tag("DODGE-1")
    @DisplayName("a predicted path stops at the wall")
    void wall() {
        double[] s = {780, 100, Math.PI / 2, 8, 0, 8, 400, 500, 0};
        double a = SimpleAims.angles(new double[][] {s}, 11, W, H)[SimpleAims.LINEAR];
        assertEquals(Math.atan2(782 - 400, 100 - 500), a, 1e-9, "stops at x = 782");
    }

    @Test
    @Tag("DODGE-2")
    @DisplayName("three bullets on the linear aim make the dodger act; a learning gun's bullets never do")
    void identifies() {
        double[] aims = SimpleAims.angles(new double[][] {state(8, 0, 8), state(8, 0, 8), state(8, 0, 8)}, 14, W, H);
        ShotDodger d = new ShotDodger();
        d.observe(aims, aims[SimpleAims.LINEAR]);
        d.observe(aims, aims[SimpleAims.LINEAR] + 0.001);
        assertFalse(d.active(), "two is not yet a pattern");
        d.observe(aims, aims[SimpleAims.LINEAR] - 0.001);
        assertTrue(d.active());
        assertEquals(SimpleAims.LINEAR, d.best(), "the lowest index among equal aims");
        assertTrue(Double.isNaN(new ShotDodger().danger(aims, 0, 1)), "inactive: the views decide");

        ShotDodger learning = new ShotDodger();
        for (int i = 0; i < 10; i++) learning.observe(aims, Math.PI - 0.2 - 0.01 * i);
        assertFalse(learning.active());
        assertEquals(-1, learning.best());
    }

    @Test
    @Tag("DODGE-2")
    @DisplayName("an aim that matches under 60% of the bullets read is not dodged")
    void share() {
        double[] aims = SimpleAims.angles(new double[][] {state(8, 0, 8)}, 14, W, H);
        ShotDodger d = new ShotDodger();
        for (int i = 0; i < 3; i++) d.observe(aims, aims[SimpleAims.HEAD_ON]);
        for (int i = 0; i < 3; i++) d.observe(aims, Math.PI - 0.3);
        assertFalse(d.active(), "3 of 6");
        d.observe(aims, aims[SimpleAims.HEAD_ON]);
        d.observe(aims, aims[SimpleAims.HEAD_ON]);
        assertTrue(d.active(), "5 of 8 is over 60%");
    }

    @Test
    @Tag("DODGE-2")
    @DisplayName("an option is dangerous only when the aim's bullet crosses its hit range")
    void danger() {
        double[] aims = SimpleAims.angles(new double[][] {state(0, 0, 0)}, 14, W, H);
        ShotDodger d = new ShotDodger();
        for (int i = 0; i < 3; i++) d.observe(aims, aims[SimpleAims.HEAD_ON]);
        assertEquals(1.0, d.danger(aims, Math.PI + 0.02, 0.03), "head-on lies inside");
        assertEquals(0.0, d.danger(aims, Math.PI + 0.1, 0.03), "outside, past the margin");
        assertEquals(1.0, d.danger(aims, Math.PI + 0.034, 0.03), "inside the margin");
        d.reset();
        assertEquals(0, d.read());
        assertFalse(d.active());
    }

    @Test
    @Tag("DODGE-1")
    @DisplayName("the one-line linear aims: bearing plus lateral velocity over bullet speed, and its arcsine")
    void oneLine() {
        double[] a = SimpleAims.angles(new double[][] {state(8, 0, 8)}, 14, W, H);
        // East at 8 seen from the north: lateral -8, so the aim swings west of due south... east on the map.
        assertEquals(-8, a[SimpleAims.LATERAL], 1e-12);
        assertEquals(Math.PI - 8.0 / 14, a[SimpleAims.SIMPLE_LINEAR], 1e-12);
        assertEquals(Math.PI - Math.asin(8.0 / 14), a[SimpleAims.ASIN_LINEAR], 1e-12);
        assertTrue(Double.isNaN(a[SimpleAims.TURN_AFTER]), "no tick after the wave's");
        double[] turned = state(8, 0, 8);
        turned[8] = 0.1;
        double[] b = SimpleAims.angles(new double[][] {turned, state(8, 0, 8)}, 14, W, H);
        assertEquals(0.1, b[SimpleAims.TYPES + SimpleAims.TURN_AFTER], 1e-12, "the enemy turned 0.1 after lag 1");
    }

    @Test
    @Tag("DODGE-2")
    @DisplayName("a linear gun with its own divisor is learned; a gun that turns with its body is matched")
    void divisorAndTurn() {
        ShotDodger d = new ShotDodger();
        // A nano gun: bearing plus lateral velocity over 13, for three different lateral speeds.
        for (double v : new double[] {8, 5, -6, 7}) {
            double[] aims = SimpleAims.angles(new double[][] {state(v, 0, v)}, 14, W, H);
            d.observe(aims, Math.PI - v / 13);
        }
        assertTrue(d.active());
        assertEquals(ShotDodger.DIVISOR, d.best(), "the divisor aim, lag 0");
        assertEquals(3, d.matches(ShotDodger.DIVISOR), "learned from the first bullet, matched from the second");
        double[] aims = SimpleAims.angles(new double[][] {state(4, 0, 4)}, 14, W, H);
        assertEquals(Math.PI - 4.0 / 13, d.expert(aims, ShotDodger.DIVISOR), 1e-9);

        ShotDodger t = new ShotDodger();
        double[] now = state(8, 0, 8);
        now[8] = 0.05;
        double[] before = state(8, 0, 8);
        double[] turned = SimpleAims.angles(new double[][] {now, before}, 14, W, H);
        for (int i = 0; i < 3; i++) t.observe(turned, turned[SimpleAims.TYPES + SimpleAims.HEAD_ON] + 0.05);
        assertEquals(ShotDodger.PER_LAG + ShotDodger.TURNED + SimpleAims.HEAD_ON, t.best(),
            "head-on at lag 1, turned with the body");
    }

    @Test
    @Tag("DODGE-3")
    @DisplayName("a shot-dodge line names an opponent with or without version and adds no shield entry")
    void listEntry() {
        ShieldList l = ShieldList.parse(List.of("shot-dodge: a.B", "shot-dodge: c.D 1.2"));
        assertTrue(l.dodges("a.B 1.0"));
        assertTrue(l.dodges("c.D 1.2"));
        assertFalse(l.dodges("c.D 1.3"));
        assertFalse(l.matches("a.B 1.0"));
        assertTrue(l.isEmpty(), "no shield entry");
        assertFalse(ShieldList.NONE.dodges("a.B 1.0"));
        assertFalse(ShieldList.parse(List.of("a.B")).dodges("a.B 1.0"));
        assertNull(ShieldList.parse(List.of("shot-dodge:")).aimFor("x"));
    }

    @Test
    @Tag("DODGE-5")
    @DisplayName("the loose score finds a gun the strict match just misses; passes contradict an aim that would have hit")
    void looseAndPasses() {
        double[] aims = SimpleAims.angles(new double[][] {state(8, 0, 8), state(8, 0, 8), state(8, 0, 8)}, 14, W, H);
        double head = aims[SimpleAims.HEAD_ON];
        ShotDodger d = new ShotDodger();
        // 0.01 rad off head-on: outside the strict 0.002, well inside 0.18 of a 0.6 rad escape angle.
        for (int i = 0; i < 4; i++) d.observe(aims, head + 0.01, 0.6);
        assertFalse(d.active(), "strict reading: no match");
        assertTrue(d.planActive());
        assertEquals(SimpleAims.HEAD_ON, d.planBest() % ShotDodger.PER_LAG, "head-on at some lag");
        int best = d.planBest();
        // Three waves pass us with head-on's bullet inside our intersection: not this gun.
        for (int i = 0; i < 3; i++) d.observePass(aims, d.expert(aims, best), 0.05);
        assertEquals(3, d.passes());
        assertEquals(3, d.contradictions(best));
        assertTrue(d.planScore(best) < 4 - 2.9, "contradicted");
        // A pass whose intersection is narrower than the margin contradicts nothing.
        ShotDodger e = new ShotDodger();
        e.observePass(aims, head, ShotDodger.MARGIN);
        assertEquals(0, e.contradictions(0));
        assertEquals(-1, e.planBest());
        d.reset();
        assertEquals(0, d.passes());
        assertEquals(-1, d.planBest());
    }

    @Test
    @Tag("DODGE-4")
    @DisplayName("a shipped expert makes the planner act from the first bullet; out-of-range experts do nothing")
    void primed() {
        ShotDodger d = new ShotDodger();
        d.prime(SimpleAims.LINEAR);
        assertTrue(d.planActive());
        assertEquals(SimpleAims.LINEAR, d.planBest());
        assertFalse(d.active(), "the strict reading is untouched");
        ShotDodger n = new ShotDodger();
        n.prime(-1);
        n.prime(ShotDodger.EXPERTS);
        assertFalse(n.planActive());
    }

    @Test
    @Tag("DODGE-4")
    @DisplayName("a shot-dodge2 line gives the planner's entry with its expert; malformed lines are skipped")
    void planEntry() {
        ShieldList l = ShieldList.parse(List.of("shot-dodge2: 15 a.B", "shot-dodge2: -1 c.D 1.2",
            "shot-dodge2: x e.F", "shot-dodge2: -3 g.H", "shot-dodge2: 4"));
        assertEquals(15, l.dodgePlan("a.B 1.0"));
        assertEquals(-1, l.dodgePlan("c.D 1.2"));
        assertEquals(ShieldList.NO_DODGE_PLAN, l.dodgePlan("c.D 1.3"));
        assertEquals(ShieldList.NO_DODGE_PLAN, l.dodgePlan("e.F"));
        assertEquals(ShieldList.NO_DODGE_PLAN, l.dodgePlan("g.H"));
        assertFalse(l.dodges("a.B 1.0"), "not the three-option dodge");
        assertTrue(l.isEmpty(), "no shield entry");
        assertEquals(ShieldList.NO_DODGE_PLAN, ShieldList.NONE.dodgePlan("a.B"));
    }
}
